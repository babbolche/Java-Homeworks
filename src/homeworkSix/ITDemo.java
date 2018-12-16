package homeworkSix;

public class ITDemo {
    public static void main(String[] args) {
        SoftwareDeveloper gosho = new SoftwareDeveloper();
        gosho.buildSoftware();
        gosho.makeCodeReviews();

        DevOps ilia = new DevOps();
        ilia.buildSoftware();
        ilia.makeCodeReviews();
        ilia.configureMachines();
        ilia.supportSoftware();

        AutomationQA maria = new AutomationQA();
        maria.verifySoftwareQuality();
        maria.writeAutomationTests();

        CTO boss = new CTO();
        boss.buildSoftware();
        boss.configureMachines();
        boss.makeCodeReviews();
        boss.managePeople();
        boss.verifySoftwareQuality();
        boss.supportSoftware();
    }
}
