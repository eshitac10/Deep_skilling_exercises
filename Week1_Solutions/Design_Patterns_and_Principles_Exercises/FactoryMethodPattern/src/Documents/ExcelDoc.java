package Documents;

public class ExcelDoc extends Document {

    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Excel document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document.");
    }
}
