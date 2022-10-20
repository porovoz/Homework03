public class Main {
    public static void main(String[] args) {
       //video lesson 1
       // short bananas = 200;
       // System.out.println("Бананов " + bananas + " кг");

       // float sugar = 3;
       // float onePortion = sugar / 4;
       // System.out.println("Одна порция сахара весит " + onePortion + " кг");

       // byte a = 1;
       // short b = 1;
       // int c = 1;
       // int d = a + b + c;
       // System.out.println(d);

       // float g = a + 1f;
       // System.out.println(g);

        //homework 03 started
        //task 1
        int carsInTown = 562;
        byte electricCarsInTown = 50;
        short topCompanies = 7;
        long totalIncome = 5555555;
        float averageSpeed = 2.4F;
        double averageCost = 4.3;
        System.out.println("Значение переменной carsInTown с типом int равно " + carsInTown);
        System.out.println("Значение переменной electricCarsInTown с типом byte равно " + electricCarsInTown);
        System.out.println("Значение переменной topCompanies с типом short равно " + topCompanies);
        System.out.println("Значение переменной totalIncome с типом long равно " + totalIncome);
        System.out.println("Значение переменной e с типом float равно " + averageSpeed);
        System.out.println("Значение переменной f с типом double равно " + averageCost);

        //task 2
        byte a = 67;
        short b = -159;
        int c = 569;
        long d = 987546325656645665L;
        float e = 27.12F;
        double f = 2.786;
        char g = 4356;
        boolean h = 15 > 5;

        //task 3
        byte teacher1HasStudents = 23;
        byte teacher2HasStudents = 27;
        byte teacher3HasStudents = 30;
        short totalLeafsOfPaper = 480;
        int totalNumberOfStudents = teacher1HasStudents + teacher2HasStudents + teacher3HasStudents;
        System.out.println("Общее количество учеников " + totalNumberOfStudents);
        int quantityLeafsOfPaperPerOneStudent = totalLeafsOfPaper / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + quantityLeafsOfPaperPerOneStudent + " листов бумаги");

        //task 4
        int bottlesPer2Minuttes = 16;
        int bottlesPer1Minutte = bottlesPer2Minuttes / 2;
        int bottlesPer20Minuttes = bottlesPer1Minutte * 20;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minuttes + " бутылок");
        int bottlesPer1hour = bottlesPer1Minutte * 60;
        int bottlesPer24Hours = bottlesPer1hour * 24;
        System.out.println("За сутки машина произвела " + bottlesPer24Hours + " бутылок");
        int bottlesPer3days = bottlesPer24Hours * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPer3days + " бутылок");
        int bottlesPerOneMonth = bottlesPer24Hours * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesPerOneMonth + " бутылок");

        //task 5
        int totalPaintCans = 120;
        int whitePaintCansPerOneClassroom = 2;
        int brownPaintCansPerOneClassroom = 4;
        int totalPaintCansPerOneClassroom = whitePaintCansPerOneClassroom + brownPaintCansPerOneClassroom;
        int totalClassroomsInSchool = totalPaintCans / totalPaintCansPerOneClassroom;
        int whitePaintCansQuantityForAllClassrooms = totalClassroomsInSchool * whitePaintCansPerOneClassroom;
        int brownPaintCansQuantityForAllClassrooms = totalClassroomsInSchool * brownPaintCansPerOneClassroom;
        System.out.println("В школе, где " + totalClassroomsInSchool + " классов нужно " +
                whitePaintCansQuantityForAllClassrooms + " банок белой краски и " +
                brownPaintCansQuantityForAllClassrooms + " банок коричневой краски");

        //task 6
        int quantityOfBananas = 5;
        int weightOfOneBananaInGrams = 80;
        int quantityOfMilk = 2;
        int weightOfOneHundredMlOfMilkInGrams = 105;
        int quantityOfIceCream = 2;
        int weightOfOneIceCreamInGrams = 100;
        int quantityOfEggs = 4;
        int weightOfOneEggInGrams = 70;
        int totalWeightOfBananasInGrams = quantityOfBananas * weightOfOneBananaInGrams;
        int totalWeightOfMilkInGrams = quantityOfMilk * weightOfOneHundredMlOfMilkInGrams;
        int totalWeightOfIceCreamInGrams = quantityOfIceCream * weightOfOneIceCreamInGrams;
        int totalWeightOfEggsInGrams = quantityOfEggs * weightOfOneEggInGrams;
        int totalWeightOfAllProductsInGrams = totalWeightOfBananasInGrams + totalWeightOfMilkInGrams
                + totalWeightOfIceCreamInGrams + totalWeightOfEggsInGrams;
        float totalWeightOfAllProductsInKgs = totalWeightOfAllProductsInGrams / 1000F;
        System.out.println("Вес спорт-завтрака " + totalWeightOfAllProductsInKgs + " кг");

        //task 7
        int totalLoseWeight = 7000;
        int loseWeightPerDay1 = 250;
        int loseWeightPerDay2 = 500;
        int daysToLoseWeight1 = totalLoseWeight / loseWeightPerDay1;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, " +
                "то добьется результата через " + daysToLoseWeight1 + " дней");
        int daysToLoseWeight2 = totalLoseWeight / loseWeightPerDay2;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, " +
                "то добьется результата через " + daysToLoseWeight2 + " дней");
        int averageDaysToLoseWeight1 = (daysToLoseWeight1 + daysToLoseWeight2) / 2;
        System.out.println("Среднее количество дней до достижения результата " + averageDaysToLoseWeight1);
        //or another way to solve this task (I think that's the correct way)
        int averageLoseWeightPerDay = (loseWeightPerDay1 + loseWeightPerDay2) / 2;
        System.out.println("Средний вес похудания " + averageLoseWeightPerDay + " грамм в день");
        double averageDaysToLoseWeight2 = (double) totalLoseWeight / averageLoseWeightPerDay;
        System.out.println("Среднее количество дней до достижения результата " + averageDaysToLoseWeight2);

        //task 8
        int salaryOfMaria = 67760;
        int salaryOfDenis = 83690;
        int salaryOfChristine = 76230;
        double salaryOfMariaAfterIncreasement = salaryOfMaria + (salaryOfMaria * 0.1);
        System.out.println("Зарплата Марии после повышения " + salaryOfMariaAfterIncreasement);
        double salaryOfDeniSAfterIncreasement = salaryOfDenis + (salaryOfDenis * 0.1);
        System.out.println("Зарплата Дениса после повышения " + salaryOfDeniSAfterIncreasement);
        double salaryOfChristineAfterIncreasement = salaryOfChristine + (salaryOfChristine * 0.1);
        System.out.println("Зарплата Кристины после повышения " + salaryOfChristineAfterIncreasement);
        int annualSalaryOfMaria = salaryOfMaria * 12;
        System.out.println("Годовой доход Марии до повышения зарплаты " + annualSalaryOfMaria);
        int annualSalaryOfDenis = salaryOfDenis * 12;
        System.out.println("Гоовой доход Дениса до повышения зарплаты " + annualSalaryOfDenis);
        int annualSalaryOfChristine = salaryOfChristine * 12;
        System.out.println("Годовой доход Кристины до повышения зарплаты " + annualSalaryOfChristine);
        double annualSalaryOfMariaAfterIncreasement = salaryOfMariaAfterIncreasement * 12;
        System.out.println("Годовой доход Марии после повышения зарплаты " + annualSalaryOfMariaAfterIncreasement);
        double annualSalaryOfDenisAfterIncreasement = salaryOfDeniSAfterIncreasement * 12;
        System.out.println("Годовой доход Дениса после повышения зарплаты " + annualSalaryOfDenisAfterIncreasement);
        double annualSalaryOfChristineAfterIncreasement = salaryOfChristineAfterIncreasement * 12;
        System.out.println("Годовой доход Кристины после повышения зарплаты " + annualSalaryOfChristineAfterIncreasement);
        double differenceBetweenAnnualSalariesOfMaria = annualSalaryOfMariaAfterIncreasement - annualSalaryOfMaria;
        double differenceBetweenAnnualSalariesOfDenis = annualSalaryOfDenisAfterIncreasement - annualSalaryOfDenis;
        double differenceBetweenAnnualSalariesOfChristine = annualSalaryOfChristineAfterIncreasement - annualSalaryOfChristine;
        System.out.println("Теперь Мария получает " + salaryOfMariaAfterIncreasement + " рублей. " +
                "Годовой доход вырос на " + differenceBetweenAnnualSalariesOfMaria + " рублей");
        System.out.print ("Теперь Денис получает " + salaryOfDeniSAfterIncreasement + " рублей. " +
                "Годовой доход вырос на " + differenceBetweenAnnualSalariesOfDenis + " рублей");
        System.out.println("Теперь Кристина получает " + salaryOfChristineAfterIncreasement + " рублей. " +
                "Годовой доход вырос на " + differenceBetweenAnnualSalariesOfChristine + " рублей");
    }
}