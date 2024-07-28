package com.example.factories;

import com.example.documents.Document;
import com.example.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
