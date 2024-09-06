package utils;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import model.users.User;

import java.io.IOException;


public class Mailer {

    private User recipient;


    public Mailer(User recipient) {
        this.recipient = recipient;
    }


    public void sendVerificationMail() throws IOException {
        SendGridApi api = new SendGridApi();
        api.sendVerificationEmail(recipient);

    }

    public User getRecipient() {
        return recipient;
    }
}
