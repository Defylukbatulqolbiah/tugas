/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Satellite L630
 */
public class writeDocx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(prop);
        
        String teks = "Jangan Marah Marah, "
                + "Selalulah Berfikir Positif Tentang Segala Hal! "
                + "Karena Marah Akan Membuat Kita Cepet Tua, "
                + "Selalu Tersenyum Meskipun Banyak Cobaan Yang Menimpa .";

        XWPFDocument documentDocx = new XWPFDocument();

        // write document
        String outDocxEn = "E://writedocx.docx";
        //create paragraph
        try (FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn))) {
            //create paragraph
            XWPFParagraph paragraphDocx = documentDocx.createParagraph();
            XWPFRun runDocx = paragraphDocx.createRun();
            runDocx.setText(teks);
            
            documentDocx.write(outDocx);
        }
        System.out.println("Write docx success !!");
    }
}


