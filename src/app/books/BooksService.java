package app.books;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BooksService {
    //atribute
    private ArrayList<Book> listaBooks;
    private File bookFile;

    //metodele
    public BooksService(){
        this.listaBooks = new ArrayList<>();
        bookFile = new File("C:\\mycode\\initiere-structuri\\StudentBook\\src\\app\\books\\books.txt");
        loadBooks();
    }
    public Book getBookByID(int id){
        for(int i=0;i<listaBooks.size();i++){
            if(listaBooks.get(i).getId()==id){
                return listaBooks.get(i);
            }
        }
        return null;
    }
    public void addBook(Book book){
        listaBooks.add(book);
        saveBooks();
    }
    public int generateID(){
        Random rand = new Random();

        int id=rand.nextInt(9999)+1;
        while (getBookByID(id)!=null) {
            id=rand.nextInt(9999)+1;
        }

        return id;
    }
    public Book getBookByName(String name){
        for(int i=0;i<listaBooks.size();i++){
            if(listaBooks.get(i).getBookName().equals(name)){
                return listaBooks.get(i);
            }
        }
        return null;
    }
    public void stergeCarte(int bookID){
        Book book = getBookByID(bookID);
        if(book!=null){
            listaBooks.remove(book);
            System.out.println("Cartea a fost stearsa");
        }else{
            System.out.println("Cartea nu exista");
        }
        saveBooks(listaBooks);
    }
    //todo: metodele publice primele si cele private ultimele
    public List<Book> cartileStudentului(int sID){
        List<Book> studentBooks = new ArrayList<>();
        for(int j=0;j<listaBooks.size();j++){
            Book book = listaBooks.get(j);
            if(book.getStudentID()==sID){
                studentBooks.add(book);
            }
        }
        return studentBooks;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        int i= 0;
        for(;i<listaBooks.size()-1;i++){
            sb.append(listaBooks.get(i)+"\n");
        }
        sb.append(listaBooks.get(i));
        return sb.toString();
    }
    private void loadBooks(){
        try{
            Scanner sc = new Scanner(bookFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                try{
                    this.listaBooks.add(new Book(line));
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void saveBooks(){
        try{
            FileWriter fw = new FileWriter(bookFile);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(this.toString());
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void saveBooks(ArrayList<Book> listaBooks){
        try{
            FileWriter fw = new FileWriter(bookFile);
            PrintWriter pw = new PrintWriter(fw);
            for(Book book:listaBooks){
                pw.println(book.toString());
            }
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }






//







}
