package QLNS;


import GUI.LoginGUI;
import GUI.MainGUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vithi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginGUI login = new LoginGUI();
        login.setTitle("Login");
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
