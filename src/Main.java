import controller.DocumentController;
import java.util.Scanner;

import model.DocumentModel;
import view.DocumentView;

public class Main {
    public static void main(String[] args) {
        DocumentModel model = new DocumentModel();
        DocumentView view = new DocumentView();
        DocumentController controller = new DocumentController(model, view);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path for input: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter the path for outut: ");
        String outputFile = scanner.nextLine();

        scanner.close();

        controller.normalizeDocument(inputFile, outputFile);
    }
}
