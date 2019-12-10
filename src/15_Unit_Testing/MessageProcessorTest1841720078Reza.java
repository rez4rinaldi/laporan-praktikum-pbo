package unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Reza R
 */
public class MessageProcessorTest1841720078Reza {

    MessageProcessor1841720078Reza mProcessor;

    public MessageProcessorTest1841720078Reza() {
        mProcessor = new MessageProcessor1841720078Reza();
        mProcessor.setSenderReza("Ronaldo");
        mProcessor.setRecipientReza("Rafael");
        mProcessor.setMessageReza("Whats up bro?");
    }

    @Test
    public void testShowMessageReza() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatReza());
    }
}
