public class Main {
    public static void main(String[] args) {
        int bugs = 10000;
        System.out.println("Значение переменной bugs с типом int равно " + bugs);
        byte dog = 1;
        System.out.println(" Значение переменной dog с типом byte равно " + dog);
        short states = 200;
        System.out.println("Значение переменной states с типом short равно " + states);
        long stars = 1000000000L;
        System.out.println("Значение переменной stars с типом long равно "+ stars);
        float diggers = 1.5f;
        System.out.println("Значение переменной diggers с типом float равно "+ diggers);
        double chance = 0.123456789d;
        System.out.println( "Значение переменной chance с типом double равно " + chance);
        float that = 27.12f;
        long what = 987678965549L;
        float something = 2.786f;
        short itIs = 569;
        short please = -159;
        short enough = 27897;
        byte theDust = 67;

        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        int allPaper = 480;
        int personalPaper = allPaper / (lpStudents + asStudents + eaStudents);
        System.out.println("На каждого ученика рассчитано " + personalPaper + " листов бумаги");
        short twoMin = 16;
        int twentyMin = twoMin * 10;
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        int day = twentyMin * 72;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За трое суток машина поизвела " + threeDay + " штук бутылок");
        int month =threeDay * 10;
        System.out.println("За месяц машина произвела " + month + "штук бутылок");
        short whitePaint = 2;
        short brownPaint = 4;
        short allPaint = 120;
        int rooms = allPaint / (whitePaint + brownPaint);
        int allWhitePaint = whitePaint * rooms;
        int allBrownPaint = brownPaint * rooms;
        System.out.println( "В школе, где " + rooms + " классов, нужно " + allWhitePaint + " банок белой краски и"
                + allBrownPaint + " Банок коричневой краски");

        short bananaz = 5 * 8;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int breakfast = bananaz + milk  + iceCream + eggs;
        System.out.println(breakfast + " граммов");
        float kgBreakfast = breakfast / 1000f;
        System.out.println(kgBreakfast + " килограмм");
        short minGramm = 250;
        short maxGramm = 500;
        int overWeight = 7000;
        int result1 = overWeight / minGramm;
        System.out.println (result1 + " Дней понадобится, если терять по 250гр в день");
        int result2 = overWeight / maxGramm;
        System.out.println (result2 + " Дней понадобится, если терять по 500г в день");
        int result3 = (result1 + result2) / 2;
        System.out.println (result3 + " Дней в среднем понадобится для сгонки веса");
        int mashaMoney1 = 67760;
        int denMoney1 = 83690;
        int crisMoney1 = 76230;
        int mashaMoney2 = mashaMoney1 / 10 * 11;
        int denMoney2 = denMoney1 / 10 * 11;
        int crisMoney2 = crisMoney1 / 10 * 11;
        int mashaYearDiff = (mashaMoney2 * 12) - (mashaMoney1 * 12);
        int denYearDiff = (denMoney2 * 12) - (denMoney1 * 12);
        int crisYearDiff = (crisMoney2 * 12) - (crisMoney1 * 12);
        System.out.println (" Маша теперь получает " + mashaMoney2 + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println ( " Денис теперь получает " + denMoney2 + " рублей. Годовой доход вырос на " + denYearDiff + " рублей");
        System.out.println ( " Кристина теперь получает " + crisMoney2 + " рублей. Годовой доход вырос на " + crisYearDiff + " рублей");


















    }
}