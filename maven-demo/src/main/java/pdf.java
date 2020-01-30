import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf {
		
	public static void main(String[] args){
		Document dom = new Document();
		try{
			PdfWriter writer = PdfWriter.getInstance(dom,new FileOutputStream("firstpdf.pdf"));
			dom.open();

			dom.add(new Paragraph(" lunch"));
			dom.add(new Paragraph(" lunch"));
			dom.close();
			writer.close();
		
		}
		catch (DocumentException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
			
}
