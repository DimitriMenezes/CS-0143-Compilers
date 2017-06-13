package main;

import java.io.FileReader;
import java.io.PushbackReader;

import main.ASTDisplay;
import x_language.lexer.Lexer;
import x_language.node.Start;
import x_language.parser.Parser;

public class Main {
	
 public static void main(String[] args) {
	  try  {
		 

		   String arquivo = args[0];
		  
		   Parser p =
		    new Parser(
		    new Lexer(
		    new PushbackReader(  
		    new FileReader(arquivo), 1024))); 
		   		   
		   Start tree = p.parse();
		   //Imprime árvore na saída padrão
		   //tree.apply(new ASTPrinter());
		   //Imprime árvore em interface gráfica
		   tree.apply(new ASTDisplay());
	  }
	  catch(Exception e)
		  {
		   System.out.println(e.getMessage());
		  }
	 }
}