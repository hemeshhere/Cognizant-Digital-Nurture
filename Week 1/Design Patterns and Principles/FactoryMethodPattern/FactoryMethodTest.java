public class FactoryMethodTest {
    public static void main(String[] args) {
        System.out.println("Testing Factory Method Pattern");

        // Create a Word Document
        System.out.println("\nRequesting a Word Document:");
        DocumentFactory wordFactory = new WordFactory();
        wordFactory.manageDocument();

        // Create a PDF Document
        System.out.println("\nRequesting a PDF Document:");
        DocumentFactory pdfFactory = new PdfFactory();
        pdfFactory.manageDocument();

        // Create an Excel Document
        System.out.println("\nRequesting an Excel Document:");
        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.manageDocument();
    }
}