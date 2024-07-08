import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room extends House {
    private int number;
    List<Human> humansList = new ArrayList<>();

    //строка, сохраняет последнее значение, номер комнаты
    static String lastRoomNumber;

    //метод для считывания int переменной и ее присваивания в number
    public void createNewRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите номер квартиры: ");
        this.number = scanner.nextInt();
        lastRoomNumber = "Квартира #" + this.number + ":";
    }

    //метод, добавляет объект в массив
    public void addHuman(Human human) {
        humansList.add(human);
    }

    //поиск детей в семьях и вывод информации о семье в консоль: номер дома,
    //квартиры, имя и фамилия всех членов семьи.
    public void searchHuman() {
        int childrenCount = 0; //счетчик количества детей в семье, обнуляем каждый раз перед циклом
        for (Human human : humansList) {
            if (human.getAge() < 18) { //если возраст меньше 18, то увеличиваем на +1
                childrenCount++;
            }
        }
        if (childrenCount > 2) { //если счетчик больше 2 детей
            List<Human> largeFamily = humansList; //записываем семью в новый массив
            boolean firstHuman = true;
            String info = ""; //будем записывать всю информацию  в эту строку
            for (Human human : largeFamily) { //перебираем массив с нашей семьей
                //если вывести массив listHouse с помощью переопределеного метода toString() в каждом
                // классе то можно увидеть что все значения "номер дома и квартир" записались правильно
                if (firstHuman) { //берем у первого члена семьи номер дома и квартиры, сохраняем в строку
                    info = info + "\n" + human.getHouseNumber() + "\n" + human.getRoomNumber();
                    firstHuman = false; //переключаем переменную на false
                }
                //записываем имя и фамилию каждого члена семьи в строку
                info = info + "\n" + human.getName() + " " + human.getLastName();
            }
            System.out.println(info); //выводим строку в консоль со всей информацией о семье, кроме возраста
        }
    }

}
