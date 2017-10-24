public class ProxyMessage implements Message {

    private RealMessage realMessage;
    private String subject;
    private String employeeName;

    public ProxyMessage(String subject, String employeeName) {
        this.subject = subject;
        this.employeeName = employeeName;
    }

    public ProxyMessage(RealMessage realMessage) {
        this.realMessage = realMessage;
    }

    @Override
    public void display() {

        if (realMessage == null) {
            realMessage = new RealMessage(subject, employeeName);
        }
        if (realMessage.getSubject().contains("boring")) {
            subject = realMessage.getSubject() + " -- EY THIS MESSAGE IS TOO BORING";
            realMessage = new RealMessage(subject, employeeName);
        }
        realMessage.display();

    }
}
