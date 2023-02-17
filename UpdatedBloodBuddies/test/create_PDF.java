/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zee
 */
import com.itextpdf.text.BadElementException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

public class create_PDF {

    public static void main(String[] args) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        Document document = new Document();
        @SuppressWarnings("unused")
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(null);
        File file = new File(fc.getSelectedFile().getAbsolutePath());
        PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(file + ".pdf"));
        document.open();
        Font boldFont1 = new Font(Font.FontFamily.HELVETICA , 18, Font.BOLD);
        Font boldFont2 = new Font(Font.FontFamily.HELVETICA , 13, Font.ITALIC);
        document.setMargins(40, 40, 40, 40);
        Paragraph paragraph1 = new Paragraph("Blood Buddies",boldFont1);
        paragraph1.setAlignment(1);//center
        
        Paragraph paragraph2 = new Paragraph("“A single pint can save three lives, a single gesture can create a million smiles”",boldFont2);
        paragraph2.setAlignment(1);//center
        paragraph2.setSpacingBefore(25);
        paragraph2.setSpacingAfter(25);
        
        Paragraph paragraph3 = new Paragraph();
        paragraph3.setAlignment(1);//center
        paragraph3.setSpacingBefore(30);
        paragraph3.setSpacingAfter(30);
        paragraph3.add("Camp Details:\n"+"Camp Id:"+"\n"+"E-Mail:"+"\n"+"Phone:"+"\n");
        
        Image image1 = Image.getInstance("temp.jpg");
        image1.setAlignment(1);
        image1.scaleAbsolute(50, 50);

        //Add to document
        PdfPTable pdfPTable = new PdfPTable(2);
        //Create cells
//        pdfPTable.setTotalWidth(20);
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        PdfPCell pdfPCell0 = new PdfPCell(new Paragraph("Personal Details:",boldFont));
        PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("First name:"));
        PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Last name:"));
        PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("Date Of Birth:"));
        PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("Gender:"));
        PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("Phone:"));
        PdfPCell pdfPCell6 = new PdfPCell(new Paragraph("E-Mail:"));
        PdfPCell pdfPCell7 = new PdfPCell(new Paragraph("Aadhaar No:"));
        PdfPCell pdfPCell8 = new PdfPCell(new Paragraph("Blood Group:"));
        PdfPCell pdfPCell9 = new PdfPCell(new Paragraph("Blood Donated:"+"mL"));
        PdfPCell pdfPCell10 = new PdfPCell(new Paragraph("Address Details:",boldFont));
        PdfPCell pdfPCell11 = new PdfPCell(new Paragraph("Room/Flat No:"));
        PdfPCell pdfPCell12 = new PdfPCell(new Paragraph("Street:"));
        PdfPCell pdfPCell13 = new PdfPCell(new Paragraph("City:"));
        PdfPCell pdfPCell14 = new PdfPCell(new Paragraph("Pincode:"));
        PdfPCell pdfPCell15 = new PdfPCell(new Paragraph("State:"));

        pdfPCell9.setColspan(2);
        pdfPCell0.setColspan(2);
        pdfPCell10.setColspan(2);
        pdfPCell15.setColspan(2);
        //pdfPCell3.setRowspan(2);
        //Add cells to table
        pdfPTable.addCell(pdfPCell0);
        pdfPTable.addCell(pdfPCell1);
        pdfPTable.addCell(pdfPCell2);
        pdfPTable.addCell(pdfPCell3);
        pdfPTable.addCell(pdfPCell4);
        pdfPTable.addCell(pdfPCell5);
        pdfPTable.addCell(pdfPCell6);
        pdfPTable.addCell(pdfPCell7);
        pdfPTable.addCell(pdfPCell8);
        pdfPTable.addCell(pdfPCell9);
        pdfPTable.addCell(pdfPCell10);
        pdfPTable.addCell(pdfPCell11);
        pdfPTable.addCell(pdfPCell12);
        pdfPTable.addCell(pdfPCell13);
        pdfPTable.addCell(pdfPCell14);
        pdfPTable.addCell(pdfPCell15);
        //Add content to the document using Table objects.
        document.add(image1);
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(pdfPTable);
        document.add(paragraph3);
        document.close();
        System.out.println("Done");
    }

}
