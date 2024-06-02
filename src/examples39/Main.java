package examples39;

public class Main {

    public static void main(String[] args) throws Exception {
        //TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        //System.out.println(teacherCreditManager.calculate(1000));

        BaseCreditManager[] creditManagers = new BaseCreditManager[] {new TeacherCreditManager(), new AgricultureCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }

}