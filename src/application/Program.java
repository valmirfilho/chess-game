/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import boadgame.Board;
import boadgame.Position;
import chess.ChessMatch;

/**
 *
 * @author valmir
 */
public class Program {
     public static void main(String[] args) {
         
         ChessMatch chessMatch = new ChessMatch();
         UI.printBoard(chessMatch.getPieces());
         
     }
}
