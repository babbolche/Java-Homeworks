package homeworkSix;

public class CTO implements Developers, SystemAdmin, QA, Manager {
    @Override
    public void buildSoftware() {
        System.out.println("CTO can build software.");
    }

    @Override
    public void makeCodeReviews() {
        System.out.println("CTO can make code reviews.");
    }

    @Override
    public void managePeople() {
        System.out.println("CTO can manage people.");

    }

    @Override
    public void drinkCoffeeAllDay() {
        System.out.println("CTO can drink coffee all day.");

    }

    @Override
    public void verifySoftwareQuality() {
        System.out.println("CTO can verify software quality.");
    }

    @Override
    public void configureMachines() {
        System.out.println("CTO can configure machines.");
    }

    @Override
    public void supportSoftware() {
        System.out.println("CTO can support software.");
    }
}
