
import java.util.Random;

public class ColorGenerator {

    private static final String[] COLORS = {"Red", "Blue", "Light Blue", "Pink", "Light Pink", "Purple", "Dark Purple", "Black", "Silver", "Dark Red", "Brown", "Light Purple"};

    public static String generateRandomColorName() {
        Random random = new Random();
        int randomIndex = random.nextInt(COLORS.length);
        return COLORS[randomIndex];
    }

}
