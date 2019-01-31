package com.company;
import java.util.Stack;

    public class Example6 extends Stack<Integer>
    {

        Stack<Integer> integerStack = new Stack<>();

        void push(int x){

            if(isEmpty() == true){
                super.push(x);
                integerStack.push(x);
            }else{

                super.push(x);
                int y = integerStack.pop();
                integerStack.push(y);

                if(x < y){
                    integerStack.push(x);
                }
                else {
                    integerStack.push(y);
                }

            }

        }

        public Integer pop(){
            int x = super.pop();
            integerStack.pop();
            return x;
        }

        int getMin(){
            int x = integerStack.pop();
            integerStack.pop();
            return x;
        }

        public static void main(String[] args) {

            Example6 S1 = new Example6();
            S1.push(101);
            S1.push(102);
            S1.push(103);
            System.out.println(S1);
            System.out.println(S1.getMin());
            S1.push(74);
            S1.push(67);
            System.out.println(S1);
            System.out.println(S1.getMin());

        }

    }

