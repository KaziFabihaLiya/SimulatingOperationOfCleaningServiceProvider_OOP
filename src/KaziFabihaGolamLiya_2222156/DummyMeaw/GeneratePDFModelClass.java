/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.DummyMeaw;

import Meraj_Ahmed__2221557.GenerateAlerts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.FileChooser;

/**
 *
 * @author kazif
 */
public class GeneratePDFModelClass {
    
    public static void generatePdf(String text,String titleText){
        try{
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);

//adding paragrapg to the pdf

                Paragraph textParagraph = new Paragraph(text);
                doc.add(textParagraph);
                
                Text Title = new Text(titleText);
                
               
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();
                doc.add(pageTitle);
 
                /*
//adding table to the pdf
                for (PropertyListing property : propertyList) {
                Paragraph propertyParagraph = new Paragraph(property.toString());
                doc.add(propertyParagraph);
                }
*/
//adding an image
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Do you want to add an Image?");
                Optional<ButtonType> result = a.showAndWait();
                if(result.get() == ButtonType.OK){ 
                    File imageFile = fc.showOpenDialog(null);
                    String imagePath = imageFile.getAbsolutePath();
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image image = new Image(data);  
                    image.setAutoScale(true);

                    doc.add(image);
                    
                    String text2 =("The image is added successfully.");
                    GenerateAlerts.successfulAlert(text2);
                }
                doc.close();

                String text1 =("The PDF is saved successfully.");
                GenerateAlerts.successfulAlert(text1);    
            }
            else{   
                String text5 = "Saving as PDF: cancelled!";
                GenerateAlerts.unsuccessfulAlert(text5);           
            }
        }
        catch(Exception e){
            String text6 = "Oops! Exception: " + e.toString()+ " occured.";
            GenerateAlerts.unsuccessfulAlert(text6);            
        }
    }    
    
}
