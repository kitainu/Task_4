public class Calculate {


    float addNumb(float x, float y) {
        return x + y;
    }

    float multiplyNumb(float x, float y) {
        return x * y;
    }

    float divideNumb(float x, float y) {
        return x / y;
    }

    float substractNumb(float x, float y) {
        return x - y;
    }

    float oblicz(float x, char c, float y) {
        System.out.println(" Wklikano: " + x + " " + c + " " + y);
        float wynik ;

        switch (c) {
            case '+':
                wynik = addNumb(x, y);
                break;
            case '-':
                wynik = substractNumb(x, y);
                break;
            case '*':
                wynik = multiplyNumb(x, y);
                break;
            case '/':
                wynik = divideNumb(x, y);
                break;
            default:
                System.out.println("zle c " + c);
                wynik=0;
        }

       System.out.println("Wynik " + c + " " + wynik);
        return wynik;// defaultowo zwraca 0 !!!!
    }
}

