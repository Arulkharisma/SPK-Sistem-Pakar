/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arul.belajarjava;

/**
 *
 * @author arulkharisma
 */
public class UserSession {
    private static int id;
    private static String nama, hasil, user, pass, alamat, jk;
    
    
public static int getid(){
    return id;
    }
public static void setid(int iduser){
    UserSession.id = iduser;
    }
    
    public static String getNama(){
    return nama;
    }
public static void setNama(String nama){
    UserSession.nama = nama;
    }

 public static String gethasil(){
    return hasil;
    }
public static void sethasil(String hasill){
    UserSession.hasil = hasill;
    }

 public static String getpass(){
    return pass;
    }
public static void setpass(String password){
    UserSession.pass = password;
    }

 public static String getuser(){
    return user;
    }
public static void setuser(String userr){
    UserSession.user = userr;
    }

 public static String getalamat(){
    return alamat;
    }
public static void setalamat(String addr){
    UserSession.alamat = addr;
    }

 public static String getjk(){
    return jk;
    }
public static void setjk(String jenisk){
    UserSession.jk = jenisk;
    }


}
