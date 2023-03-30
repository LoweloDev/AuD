public class SiebDesErastothenes {
    private final int n;
    private final int[] intArray;

    SiebDesErastothenes(int n) {
        this.n = n;
        this.intArray = new int[n];
        this.hinschreiben();
        this.durchstreichen();
    }

    private void hinschreiben() {
        for (int i = 0; i < this.n; i++) {
            this.intArray[i] = 1;
        }
    }

    private void durchstreichen() {
        int index = 2;
        while (index * index <= n) {
            if (!isDurchgestrichen(this.intArray[index])) {
                this.durchstreichenVielfache(index, n);
            }
            index++;
        }
    }

    private void durchstreichenVielfache(int index, int n) {
        if (index <= 1) return;

        for (int i = index; i < n; i++) {
            if(i != index && i % index == 0) {
                this.intArray[i] = 0;
            }
        }
    }

    private boolean isDurchgestrichen(int valueAtIndex) {
        return valueAtIndex == 0;
    }

    public void ausgebenPrimzahlen() {
        System.out.println("Die Primzahlen von 1 bis " + n + " lauten:");
        for (int i = 2; i < this.intArray.length; i++) {
            if(this.intArray[i] == 1) {
                System.out.print(i + "; ");
            }
        }
    }
}
