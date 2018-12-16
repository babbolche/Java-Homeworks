package homeworkSix;

public class SoftwareDeveloper implements Developers {
    @Override
    public void buildSoftware() {
        System.out.println("Software developers can build Software");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("Software developers can make code reviews");
    }
}
