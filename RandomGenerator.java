random.nextInt(max - min + 1) + min
  RandomGenerator generator = new RandomGenerator();
int number = generator.generateNumber(min, max);
System.out.println("Generated number: " + number);
import java.util.Random;

public class RandomGenerator {

    private Random random;

    public RandomGenerator() {
        random = new Random();
    }

    public int generateNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}

git checkout -b feature/random-logic
  git commit -m "feat: create RandomGenerator class"
git commit -m "feat: import Random library"
git commit -m "feat: add generateNumber method"
git commit -m "feat: implement inclusive range logic"
git commit -m "fix: correct random number formula"
git commit -m "test: test generation with small range"
git commit -m "test: test generation with larger range"
git commit -m "refactor: clean up random generation code"
git commit -m "docs: add comments to core logic"
