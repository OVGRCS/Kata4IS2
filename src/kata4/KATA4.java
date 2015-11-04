/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.File;

/**
 *
 * @author usuario
 */
public class KATA4 {

    public static void main(String[] args) {
        String name = "C:\\Users\\Usuario\\Documents";
        File file = new File (name);
        
        String[] filearray = file.list();
        
        for (String files : filearray){
            System.out.println(files);    
        }
        print(file.listFiles(),"");
    }

    private static void print(File[] listFiles, String ident) {
        if(listFiles == null) return;
        for (File listFile : listFiles) {
            System.out.println(ident+(listFile.isDirectory()? "+":" ")+listFile.getName());
            if(listFile.isFile() || listFile.isHidden())continue;
            print(listFile.listFiles(),ident + " ");
        }

    }

    
}
