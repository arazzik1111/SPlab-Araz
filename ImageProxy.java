public class ImageProxy implements Image {
    private String imageName;
    private Image realImage;

    public ImageProxy(String name) {
        imageName = name;
    }

    public String getImageName() {
        if (realImage == null) {
            realImage = new ConcreteImage(imageName);
        }
        return realImage.getImageName();
    }
}

class ConcreteImage implements Image {
    private String imageName;

    public ConcreteImage(String name) {
        imageName = name;
    }

    public String getImageName() {
        return imageName;
    }
}

interface Image {
    String getImageName();
}
