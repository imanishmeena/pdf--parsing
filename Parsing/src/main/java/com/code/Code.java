package com.code;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Code {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("himanshi dec 21.pdf");
	
		
		PDFParser parser =new PDFParser(new org.apache.pdfbox.io.RandomAccessFile(file, "r"));
		parser.parse();
		
		COSDocument cosdoc = parser.getDocument();
		PDDocument pddoc = new PDDocument(cosdoc);		
		
		PDFTextStripper str = new PDFTextStripper();
		String data = str.getText(pddoc);
		//System.out.println(data);

  
		BankStatmentDetail BSD = new BankStatmentDetail();

		
        String lines[] = data.split("\n");
        
		String[] words = data.split(",");
         
	    for (int i = 2; i < words.length; i++) 
	
         
	// System.out.println(Arrays.toString(data.split("\n")));
	 System.out.println((data.split("\n"))[9]); 
}


 }
// package com.code;

// import java.io.File;
// import java.io.IOException;
// import org.apache.pdfbox.cos.COSDocument;
// import org.apache.pdfbox.pdfparser.PDFParser;
// import org.apache.pdfbox.pdmodel.PDDocument;
// import org.apache.pdfbox.text.PDFTextStripper;
// import java.util.Arrays;

// public class Code {

// 	public static void main(String[] args) throws IOException {
		
		
// 		File file = new File("himanshi dec 21.pdf");
	
		
// 		PDFParser parser =new PDFParser(new org.apache.pdfbox.io.RandomAccessFile(file, "r"));
// 		parser.parse();
		
// 		COSDocument cosdoc = parser.getDocument();
// 		PDDocument pddoc = new PDDocument(cosdoc);		
		
// 		PDFTextStripper str = new PDFTextStripper();
// 		String data = str.getText(pddoc);
// 		//System.out.println(Arrays.toString(data.split("\n")));
// System.out.println(data.split("\n"));


// // [01/01/2022, 08:37, 1/1, Print     Close, YSuccess ! Your request for Fund transfer submitted successfully., Please note the Reference ID: 862741442 for future communication.,       ,  , E-RECEIPT FOR, TRANSFER FUNDS, Payee Name: Himansi Verma, Nickname: Himansi, Credit Account No: 502202010021570, Remarks: salary dec 21, Debit Account: 921020023731400, Date: 01 Jan '22, Amount: Rs 25,000.00, Payment Type: One Time Payment, Pay via: NEFT, Please check the transaction status using 'Transaction status Enquiry' before re-initiating a fresh payment., (Rupees Twenty Five Thousand and Zero Paisa only)]
// 	}

// }