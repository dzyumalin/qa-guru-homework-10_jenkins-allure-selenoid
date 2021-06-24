package helpers;

public class PropertiesReader {

    public static String readUrl() {
        return System.getProperty("url", "selenoid.autotests.cloud");
    }

    public static String readVideoUrl() {
        return System.getProperty("videoUrl", "https://selenoid.autotests.cloud/video/");
    }

}
