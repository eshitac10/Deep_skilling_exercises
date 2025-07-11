package Documents;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document WordDoc = factory.createDocument();
        WordDoc.open();
        WordDoc.save();
        WordDoc.close();

        System.out.println();

        factory = new PdfDocumentFactory();
        Document PdfDoc = factory.createDocument();
        PdfDoc.open();
        PdfDoc.save();
        PdfDoc.close();

        System.out.println();

        factory = new ExcelDocumentFactory();
        Document ExcelDoc = factory.createDocument();
        ExcelDoc.open();
        ExcelDoc.save();
        ExcelDoc.close();
    }
}
