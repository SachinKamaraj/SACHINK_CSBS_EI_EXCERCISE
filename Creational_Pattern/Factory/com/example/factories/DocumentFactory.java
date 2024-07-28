package com.example.factories;

import com.example.documents.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument(Document doc) {
        doc.open();
    }

    public void closeDocument(Document doc) {
        doc.close();
    }

    public void saveDocument(Document doc) {
        doc.save();
    }
}
