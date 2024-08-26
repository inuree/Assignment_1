class Driver {
    public static void updateFrequencies(Symbol[] symbols) {
        int totalUses = 0;
        for (Symbol symbol : symbols) {
            totalUses += symbol.uses;
        }
        for (Symbol symbol : symbols) {
            symbol.frequency = (double) symbol.uses / totalUses;
        }
    }
    public static void sortSymbols(Symbol[] symbols) {
        Symbol temp;
        int arrLength = symbols.length;
        boolean swapped;
        for (int i = 0; i < arrLength - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (symbols[j].frequency > symbols[j + 1].frequency) {
                    temp = symbols[j];
                    symbols[j] = symbols[j + 1];
                    symbols[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}

class Symbol {
    public char symbol;
    public int uses;
    public double frequency;

    public Symbol(char symbol) {
        this.symbol = symbol;
        this.uses = 0;
        this.frequency = 0;
    }
}

public class Main {
    public static void main (String[] args) {
        Symbol[] symbols = new Symbol[9];
        symbols[0].symbol = '∞';
        symbols[1].symbol = '☺';
        symbols[2].symbol = '♀';
        symbols[3].symbol = '♂';
        symbols[4].symbol = '♠';
        symbols[5].symbol = '♣';
        symbols[6].symbol = '♥';
        symbols[7].symbol = '♦';
        symbols[8].symbol = '♫';


    }
}