public class RealMessage implements Message {

    private String subject;                 //MESSASSGE
    private String employeeName;

    public RealMessage(String subject, String employeeName) {
        this.subject = subject;
        this.employeeName = employeeName;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void display() {
        System.out.println("Displaying mail from " + employeeName + " with subject " + subject + ".");
    }
}
