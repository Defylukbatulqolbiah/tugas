/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Satellite L630
 */
public class writeDoc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
        
        String teks = "OJO NESU NESU ";
        String OutDocEn = "E://Writedoc.doc";
        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File(OutDocEn));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(teks);
        document.write(out);
        out.close();
        System.out.println(" DOC sukses !! ");
        
         
    }
}
