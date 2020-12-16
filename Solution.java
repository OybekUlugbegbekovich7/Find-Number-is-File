package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader redaer = new BufferedReader(new InputStreamReader(System.in));
        String one = redaer.readLine();
        String two = redaer.readLine();
        redaer.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(one));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(two));

        while (bufferedReader.ready())
        {
            String [] num = bufferedReader.readLine().split(" ");
            for (String array : num) {
                try {
                    bufferedWriter.write(Integer.parseInt(array) + " ");
                }catch (NumberFormatException e){}
            }

        }
        bufferedWriter.close();
        bufferedReader.close();


    }
}
