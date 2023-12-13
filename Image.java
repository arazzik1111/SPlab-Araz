import java.util.concurrent.TimeUnit;

// Image.java
class Image {
    private String imageName;
    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String getImageName() {
        return imageName;
    }
}
