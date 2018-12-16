package homeworkSix;

public class DevOps implements Developers, SystemAdmin {
    @Override
    public void buildSoftware() {
        System.out.println("DevOps can build software.");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("DevOps can make code reviews.");
    }

    @Override
    public void configureMachines() {
        System.out.println("DevOps can configure machines.");
    }

    @Override
    public void supportSoftware() {
        System.out.println("DevOps can support software.");
    }
}
