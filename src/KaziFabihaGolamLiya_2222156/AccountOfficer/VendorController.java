/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package KaziFabihaGolamLiya_2222156.AccountOfficer;

import Meraj_Ahmed__2221557.GenerateAlerts;
import Meraj_Ahmed__2221557.ReadWrite;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.Color;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazif
 */
public class VendorController implements Initializable {

    @FXML
    private TableView<Vendor> vendorTableView;
    @FXML
    private TableColumn<Vendor, String> VendorNameCol;
    @FXML
    private TableColumn<Vendor, String> VendorEmailCol;
    @FXML
    private TableColumn<Vendor, String> CategoryCol;
    @FXML
    private TableColumn<Vendor, Boolean> statusCol;
    @FXML
    private TableColumn<Vendor, LocalDate> DateCol;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private ComboBox<String> categoryCombBox;
    @FXML
    private DatePicker datePicker;
    private ObservableList<Vendor> vendorList;
    @FXML
    private CheckBox activeIinactiveCheckbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        vendorList = FXCollections.observableArrayList();

        categoryCombBox.getItems().addAll("Specialized Vendors", "Chemical Vendors", "Detergent Vendors", "Garments Vendor");

        VendorNameCol.setCellValueFactory(new PropertyValueFactory<Vendor, String>("VendorName"));
        VendorEmailCol.setCellValueFactory(new PropertyValueFactory<Vendor, String>("VendorEmail"));
        CategoryCol.setCellValueFactory(new PropertyValueFactory<Vendor, String>("category"));
        statusCol.setCellValueFactory(new PropertyValueFactory<Vendor, Boolean>("status"));
        DateCol.setCellValueFactory(new PropertyValueFactory<Vendor, LocalDate>("registrationDate"));

        // TODO
    }

    @FXML
    private void addingVendorButtonOnCLicked(ActionEvent event) {
        String vendorNam = nameTextField.getText();
        String email = emailTextField.getText();
        String vendorType = categoryCombBox.getValue();
        Boolean statusVendor = activeIinactiveCheckbox.isSelected();
        LocalDate dateofRegistraion = datePicker.getValue();

        Vendor person1 = new Vendor(vendorNam, email, vendorType, 0, statusVendor, dateofRegistraion, "", "", "", "", "", null, 0);
        vendorList.add(person1);

    }

    @FXML
    private void deleteExistingInfoButton(ActionEvent event) {
        ObservableList<Vendor> selectedRows, allPeople;
        allPeople = vendorTableView.getItems();
        selectedRows = vendorTableView.getSelectionModel().getSelectedItems();

        for (Vendor p : selectedRows) {
            allPeople.remove(p);
        }
    }

    @FXML
    private void switchToBackButton(ActionEvent event) throws IOException {

        Parent scene2Parent = FXMLLoader.load(getClass().getResource("AccOfficerDashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);

        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.show();
    }

    @FXML
    private void loadButtononClicked(ActionEvent event) {

        vendorTableView.getItems().addAll(vendorList);

    }

    @FXML
    private void binFileCreateButton(ActionEvent event) throws IOException {

        String vendorNam = nameTextField.getText();
        String email = emailTextField.getText();
        String vendorType = categoryCombBox.getValue();
        Boolean statusVendor = activeIinactiveCheckbox.isSelected();
        LocalDate dateofRegistraion = datePicker.getValue();

        Vendor person1 = new Vendor(vendorNam, email, vendorType, 0, statusVendor, dateofRegistraion, "", "", "", "", "", null, 0);
        vendorList.add(person1);

        ReadWrite.writeObjectToFile("vendor.bin", person1);
        ObservableList<Vendor> vendorList = (ObservableList<Vendor>) ReadWrite.readObjectToFile("vendor.bin", person1);

        String s = "";
        s = "";
        for (Vendor v : vendorList) {
            System.out.println(v.toString());
            s += v.toString();

        }

    }

    @FXML
    private void DownloadPDFButton(ActionEvent event) {
        
//    @FXML
//    private void DownloadPDFButton(ActionEvent event) throws FileNotFoundException {
//        try{
//           
//            FileChooser fc = new FileChooser();
//            fc.getExtensionFilters().add(new ExtensionFilter("PDF files", "*.pdf"));
//            fc.getExtensionFilters().add(new ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
//            File f = fc.showSaveDialog(null);
//            if(f!=null){              
//                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
//                //PdfWriter pw = new PdfWriter(new FileOutputStream("testPDF.pdf"));
//                PdfDocument pdf =  new PdfDocument(pw);
//                pdf.addNewPage();
//                Document doc = new Document(pdf);
//                doc.setLeftMargin(70);
//                //----------------------------------------------------
//                //adding paragrapg to the pdf
//                String newline = "\n";
//                Paragraph lineSpace = new Paragraph(newline);
//                lineSpace.setHeight(8);
//                
//                String paraText1 
//                        = "This is line 1 of the paragraph, and the line continue....\n"
//                        + "This is line 2 of the paragraph, and the line continue....\n"
//                        + "This is line 3 of the paragraph, and the line continue....\n"
//                        + "This is line 4 of the paragraph, and the line continue....\n";
//                Paragraph para1 = new Paragraph(paraText1);
//                
//                Text titleText = new Text("This is the TITLE of the pdf");
//                
//                titleText.setFontSize(18f);
//                Paragraph pageTitle = new Paragraph(titleText);
//                pageTitle.setBold();    //OR titleText.setBold();
//
//                //PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
//                //PdfFont fontBold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
////                Text title = new Text("Thinking in Java (4th Ed)").setFont(fontBold);
////                Text author = new Text("Bruce Eckel").setFont(font2);
//                //author.setFontColor(Color.RED);
//                //Paragraph bookInfo = new Paragraph().add(title).add(" -- by ").add(author);
//                
//                doc.add(pageTitle);
//                doc.add(lineSpace);
//                doc.add(para1);
//                doc.add(lineSpace);
//                //doc.add(bookInfo);
//                doc.add(lineSpace);
//                
//                //----------------------------------------------------
//                
//                //adding a list
//                List progLangList = new List();
//                progLangList.add("C");
//                progLangList.add("C++");
//                progLangList.add("Java");
//                progLangList.add("Python");
//                progLangList.add("C#");          
//                doc.add(progLangList);
//                doc.add(lineSpace);
//                
//                //----------------------------------------------------
//                //adding an image
////                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
////                a.setContentText("Do you want to add an Image?");
////                Optional<ButtonType> result = a.showAndWait();
////                if(result.get() == ButtonType.OK){ 
////                    File imageFile = fc.showOpenDialog(null);
////                    String imagePath = imageFile.getAbsolutePath();
////                    ImageData data = ImageDataFactory.create(imagePath);
////                    Image image = new Image(data);  
////                    image.setAutoScale(true);
////                    
////                    doc.add(image);
////                    doc.add(lineSpace);
////                    GenerateAlerts.successfulAlert("Successfully added");
////                }
//                //----------------------------------------------------
//                
//                //adding table in pdf
//                float colWidthArr[] = {70f, 200f, 100f};
//                Table pdfTable = new Table(colWidthArr); 
//                
//                //adding header row
////                Cell cell_00 = new Cell(); 
////                cell_00.add("Product ID");
////                cell_00.setBackgroundColor(Color.YELLOW);
////                pdfTable.addCell(cell_00);
////                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Product Name"));
////                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Price"));
////                
////                //adding content row
////                pdfTable.addCell(new Cell().add("111"));
////                pdfTable.addCell(new Cell().add("Lux Soap"));
////                pdfTable.addCell(new Cell().add("34.0"));
////                
////                //adding content row
////                pdfTable.addCell(new Cell().add("222"));
////                pdfTable.addCell(new Cell().add("Aarong Yougart"));
////                pdfTable.addCell(new Cell().add("75.0"));
////                
////                //adding content row
////                pdfTable.addCell(new Cell().add("333"));
////                pdfTable.addCell(new Cell().add("Brown Bread"));
////                pdfTable.addCell(new Cell().add("85.0"));
//
//                doc.add(pdfTable);
//                
//                doc.close();
//                
//             GenerateAlerts.successfulAlert("Succesfully Done");
//            }
//            else{
//             GenerateAlerts.unsuccessfulAlert("Something went wrong...");             
//            }
//        }
//        catch(Exception e){
//             GenerateAlerts.unsuccessfulAlert("Something went wrong...");
//            //System.out.println("Something went wrong...");
//            //System.out.println(e);
//        }                           
//    }
    }
}
