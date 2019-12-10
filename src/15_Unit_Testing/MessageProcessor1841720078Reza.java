package unittest;

/**
 *
 * @author Reza R
 */
public class MessageProcessor1841720078Reza {

    private String mSender, mRecipient, mMessage;

    public String getMessageReza() {
        return mMessage;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public String getSender() {
        return mSender;
    }

    public void setMessageReza(String mMessage) {
        this.mMessage = mMessage;
    }

    public void setRecipientReza(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public void setSenderReza(String mSender) {
        this.mSender = mSender;
    }

    public String messageFormatReza() {
        String message = String.format("Hai %s, you have message from %s. \nThe message as follows : %s",
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessageReza() {
        System.out.println(messageFormatReza());
    }
}
