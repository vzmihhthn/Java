package QLNS;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vithi
 */
public class WorkWithFile {
    String urlFile;

    public WorkWithFile(String urlFile) {
        this.urlFile = urlFile;
    }
    public void write(String s)
    {
        try(DataOutputStream os = new DataOutputStream(new FileOutputStream(this.urlFile, false)))
        {
            os.writeUTF(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WorkWithFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WorkWithFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String read()
    {
            String result = "";
            try(DataInputStream os = new DataInputStream(new FileInputStream(this.urlFile)))
            {
                result += os.readUTF();
            } catch (FileNotFoundException ex) {
            Logger.getLogger(WorkWithFile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WorkWithFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            return result;
    }
}
