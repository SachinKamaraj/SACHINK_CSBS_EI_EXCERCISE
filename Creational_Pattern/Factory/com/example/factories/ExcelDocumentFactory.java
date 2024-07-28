package com.example.factories;

import com.example.documents.Document;
import com.example.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
