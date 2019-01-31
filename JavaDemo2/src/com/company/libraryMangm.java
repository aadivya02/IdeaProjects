package com.company;
    interface librarian
    {

        void issuedBookDetails();
        void calculateFine();
    }

    interface member
    {
        void issuedBooks();
        void finePayment();

    }
    abstract class Admin{

        int id;
        String name;
        abstract void dailyOperations();

        Admin(int id,String name){
            this.id=id;
            this.name=name;

        }


    }

     public class libraryMangm extends Admin implements librarian,member
    {
        @Override
        public void issuedBookDetails() {

        }
        @Override
        public void calculateFine() {

        }

        @Override
        public void issuedBooks(){

        }

        @Override
        public void finePayment() {

        }
        public void dailyOperations(){
            System.out.println("All  operations are performed by admin");
        }
        libraryMangm(int i,String n){
            super(i,n);
        }


        public static void main(String[]args){
            libraryMangm l=new libraryMangm (001,"Raj");
            System.out.println(l.name+" "+l.id);
            libraryMangm  l1=new libraryMangm (002,"Gaurav");
            System.out.println(l1.name+" "+l1.id);

            l.dailyOperations();


        }
    }

