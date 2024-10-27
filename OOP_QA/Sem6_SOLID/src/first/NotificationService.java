package first;

public interface NotificationService {
    // 2)* сделаем first.NotificationService интерфейсом и напишем его реализацию
    // 1)* вынесем в отдельный class first.NotificationService
    // Метод отправки сообщений
//    public void sendMessage(String typeMessadge, String messedge){
//        if (typeMessadge.equals("email")){
//            // write email
//            //use JavaMailSenderAPI
//        }
//    }

    void sendMessage(String messedge);
}
