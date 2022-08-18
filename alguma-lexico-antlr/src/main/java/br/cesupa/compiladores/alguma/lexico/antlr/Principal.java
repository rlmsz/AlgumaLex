/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cesupa.compiladores.alguma.lexico.antlr;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author 20070018
 */
public class Principal {
    public static void main(String[] args) {
        try {
            CharStream cs = CharStreams.fromFileName("C:\\Users\\20070018\\Documents\\Atividade\\AlgumaLex\\programa.alguma");
            AlgumaLexer lex = new AlgumaLexer(cs);
                      Token t = null;
           while ((t = lex.nextToken()).getType() != Token.EOF) {
                // System.out.println("<"+t.getType() + "," + t.getText()+">");
                System.out.println("<" + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + ", " + t.getText() + ">");
            }
        } catch (IOException ex) {
        }
    }
}
