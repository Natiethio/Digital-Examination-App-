package digitalexamsystem;
import java.io.*;
import java.util.List;

public class SendMessage extends Thread {
        protected List<ClientHandler> clients;
        protected String userInput;
        protected BufferedReader console;
        private String message;

        public SendMessage(List<ClientHandler> clients,String message) {
            this.clients = clients;
            this.message=message;
            this.userInput = null;
            this.start();
        }

        public void run() {
            try {
                if (clients.size() > 0) {
//                    this.console = new BufferedReader(new InputStreamReader(
//                            System.in));
//                    while ((this.userInput = console.readLine()) != null) {
//                        if (userInput != null & userInput.length() > 0) {
                            for (ClientHandler client : clients) {
                                client.out.println(message);
                                client.out.flush();
                            Thread.currentThread();
                            Thread.sleep(1 * 1000);
                            }
//                        }
//                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }