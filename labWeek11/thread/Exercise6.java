import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise6 {
    private static final ConcurrentHashMap<String, Boolean> visitedUrls = new ConcurrentHashMap<>();
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // Добавляем стартовые задачи
        executor.submit(new CrawlerTask("http://site.com/page1"));
        executor.submit(new CrawlerTask("http://site.com/page2"));
        executor.submit(new CrawlerTask("http://site.com/page3"));

        executor.shutdown();
        try {
            // Ждем завершения задач (таймаут для примера)
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Сканирование завершено. Посещено страниц: " + visitedUrls.size());
    }

    static class CrawlerTask implements Runnable {
        private String url;

        public CrawlerTask(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            if (visitedUrls.putIfAbsent(url, true) == null) {
                System.out.println(Thread.currentThread().getName() + " сканирует: " + url);
                // Имитация времени обработки и нахождения новых ссылок
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        }
    }
}
