package com.dmelo.lab.groovylab;

import java.util.Date;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       Binding sharedData = new Binding();
       GroovyShell shell = new GroovyShell(sharedData);
       Date now = new Date();
       sharedData.setProperty("date", now);
       sharedData.setProperty("text", "Star Wars: A New Hope");
       now.getTime();
       Object result = shell.evaluate(" \"At $date.time(), $text\"  \n"
       		+ " num1 = 10   \n"
       		+ " num2 = 20 	\n"
       		+ " soma = num1 + num2 \n"
       		+ " variavel1 = \"Um conteudo de dentro do Script em var1\" \n"
       		+ " variavel2 = \"Outro conteudo dentro do script em var2\" ");
       
       System.out.println("variavel1 = " + sharedData.getProperty("variavel1"));
       System.out.println("soma = " + sharedData.getProperty("soma"));
       System.out.println("variavel2 = " + sharedData.getProperty("variavel2"));
    }
}
