package Documents;

public class PdfDoc extends Document {

    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document.");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document.");
    }
}
