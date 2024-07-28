package com.example.factories;

import com.example.documents.Document;
import com.example.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

