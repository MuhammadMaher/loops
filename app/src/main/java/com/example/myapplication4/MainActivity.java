package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
// هنا بكتب inzliazation and declaration

//    String array_Names[]= new String[10];

   //String [] letters=new String[7];
    // ماهو الفرق بين اضع السطر التالي هنا او اضعة في الفانكشن مع انه في كلا الحالتين نفس الناتج
     String letters []={"a","b","c","d","e"};
    //String operatingSystem[] ={"Android","Ios"};i"

    //String myName ="Ahmmed Maher Osman";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x=0;
        do{
            System.out.println(letters[x]);
            x++;

        }while(x<letters.length);
       /* int i=0;
        while( i < letters.length){

            System.out.println(letters[i]);
            i+=2;
        }
      String letters []={"a","c","d","e"};
        for (int j=0;j<letters.length;j++){
            System.out.println(letters[j]);
        }
*/
        /*
        // حاجة هعمل لها call
      //  String arry[]=myName.split(" ");
        //System.out.println(arry[0]);

        array_Names [0]="Mohamed";
        array_Names [1]="Maher";
        array_Names [2]="Osman";
        array_Names[5]="Ali";
        array_Names[9]="Alaa";
        //System.out.println(array_Names[0]);

        //----------------------------while loop

      int counter =0;
        while(counter < array_Names.length){
            System.out.println( array_Names[counter]);
            counter ++; //-- incremantal
        }


    /*    //----------- do while and arry ممكن تعمل كراش
         do {
             System.out.println(array_Names[counter]);
             counter++;
         }while (counter<array_Names.length);


         //----------for loop
        for (int i=0;i<array_Names.length;i++){
            System.out.println(array_Names[i]);
        }
        //-----------for each
        for (String J: array_Names){
            System.out.println(J);
        }*/

    }

    }

