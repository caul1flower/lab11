package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> mailInfos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        mailInfos.add(mailInfo);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo : mailInfos) {
            mailSender.sendMail(mailInfo);
        }
    }
}
