package com.example;

import com.example.documents.Document;
import com.example.factories.DocumentFactory;
import com.example.factories.WordDocumentFactory;
import com.example.factories.PdfDocumentFactory;
import com.example.factories.ExcelDocumentFactory;
import com.example.util.LoggingUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentFactory factory = null;
        
        System.out.println("Select document type to create (1: Word, 2: PDF, 3: Excel): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // consume newline
        
        switch (choice) {
            case 1:
                factory = new WordDocumentFactory();
                break;
            case 2:
                factory = new PdfDocumentFactory();
                break;
            case 3:
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid choice.");
                LoggingUtility.log("Invalid choice made by user.");
                return;
        }

        Document doc = factory.createDocument();
        System.out.println("Enter content for the document:");
        String content = scanner.nextLine();
        doc.setContent(content);

        factory.openDocument(doc);
        factory.saveDocument(doc);
        factory.closeDocument(doc);

        System.out.println("Document Content: " + doc.getContent());
        LoggingUtility.log("Document created and processed: " + doc.getClass().getSimpleName());
    }
}

