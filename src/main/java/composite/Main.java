package composite;

public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("File1.txt", 120);
        File file2 = new File("File2.txt", 300);

        // Create directories
        Directory dir1 = new Directory("Directory1");
        Directory dir2 = new Directory("Directory2");

        // Add files to directories
        dir1.addComponent(file1);
        dir2.addComponent(file2);

        // Create a root directory and add subdirectories
        Directory rootDir = new Directory("RootDirectory");
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Show details
        rootDir.showDetails();
    }
}
