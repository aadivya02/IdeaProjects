package com.company;
    import java.io.*;

    class Demo implements Serializable {
        public int a;
        public String b;
        public Demo(int a , String b){
            this.a = a;
            this.b = b;
        }
    }

    public class Example7 {
        public static void main(String[] args) {
            Demo object = new Demo(101,"Aadivya");
            String path = "C:\\Users\\Aadivya\\Desktop\\Test.txt";
            try{
                FileOutputStream file = new FileOutputStream(path);
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(object);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }catch(IOException e){
                System.out.println("IO Exception Is Caught");
            }

            Demo object1 = null;
            try{
                FileInputStream file = new FileInputStream(path);
                ObjectInputStream in = new ObjectInputStream(file);

                object1 = (Demo)in.readObject();

                in.close();
                file.close();

                System.out.println("Object Is Deserialized");
                System.out.println(object1.a);
                System.out.println(object1.b);


            }catch(IOException e){
                System.out.println("IOException is caught");
            }catch(ClassNotFoundException e){
                System.out.println("ClassNotFoundException is caught");
            }
        }
    }

