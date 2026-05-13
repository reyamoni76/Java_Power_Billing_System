package billing;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PDFGenerator {

    public static void generate(EBill bill) {
        try {
            Document document = new Document();

            PdfWriter.getInstance(document,
                    new FileOutputStream("Bill_" + bill.getConsumerNo() + ".pdf"));

            document.open();

            document.add(new Paragraph("ELECTRICITY BILL"));
            document.add(new Paragraph("----------------------------"));

            document.add(new Paragraph("Consumer No: " + bill.getConsumerNo()));
            document.add(new Paragraph("Name: " + bill.getConsumerName()));
            document.add(new Paragraph("Previous Units: " + bill.getPrevReading()));
            document.add(new Paragraph("Current Units: " + bill.getCurrReading()));
            document.add(new Paragraph("Connection Type: " + bill.getEBConn()));
            document.add(new Paragraph("Total Bill: " + bill.getBill() + " BDT"));

            document.close();

        } catch (Exception e) {
            System.out.println("Error creating PDF!");
        }
    }
}