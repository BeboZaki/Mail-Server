package MainClasses;

import java.io.File;
import java.io.IOException;

public class Test {

	public MyContact contact = new MyContact("bebo", "bebo@aka.com", "123");

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		MyApp server = new MyApp();
		Test test = new Test();
		
		/**
		 * test signing in & up ... moving mails... deleteing mails to trash.
		 */
		
		//server.signup(test.contact);
		/**System.out.println(server.signin("bebo@aka.com", "123"));
		SingleLinkedList mails = new SingleLinkedList();
		int i = 1;
		while (i < 8) {
			File f1 = new File("../Mail Server/Users/" + test.contact.email + "/Inbox/" + i);
			mails.add(f1);
			i++;
		}
		File f1 = new File("../Mail Server/Users/" + test.contact.email + "/Starred");*/
		
		// File f2 = new File("../Mail Server/Users/" + test.contact.email + "/Starred");
		/*MyFolder f = new MyFolder();
		f.set(f1);
		server.deleteEmails(mails);*/

		/**
		 * test composing a mail.
		 */
		/*LinkedBasedQueue to = new LinkedBasedQueue();
		to.enqueue("amr@aka.com");
		to.enqueue("kiro@aka.com");
		MyMail mail2 = new MyMail("bebo@aka.com", to, "Hi", "nice team", null);*/
		
		
		
		
		File f3 = new File("../Mail Server/Users/bebo@aka.com/Sent Mails/kiro@aka.com 12-58-53 AM");
		MyFolder del = new MyFolder();
		del.set(f3);
		del.delTrash();
		
	}
}
