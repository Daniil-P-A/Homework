public class Rend {
    java.util.Random random = new java.util.Random();


    int firstRandNum = random.nextInt(100);
    int secondRandNum = random.nextInt(100);

    int thirdRandNum = random.nextInt(10) + 1;
    int fourRandNum = random.nextInt(10);


    int plus = firstRandNum + secondRandNum;
    int minus = firstRandNum - secondRandNum;
    int divide = fourRandNum / (thirdRandNum + 1);
    int multiply = fourRandNum * (thirdRandNum + 1);
}
