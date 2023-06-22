/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arul.belajarjava;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author arulkharisma
 */
public class Koneksi {
      public static Connection sambung(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection konekDB = DriverManager.getConnection("jdbc:mysql://localhost/sistempakar_spk","root","");
        return konekDB;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static void main(String[] args) {
    
    }
    
}
