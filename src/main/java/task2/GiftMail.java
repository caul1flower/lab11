package task2;

public class GiftMail implements MailCode{
    private static final String TEMPLATE = "Glad you are still alive! %NAME recieve your discount or whatever";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
