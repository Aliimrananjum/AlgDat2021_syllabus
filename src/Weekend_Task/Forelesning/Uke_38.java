package Weekend_Task.Forelesning;

public class Uke_38 {

    public static void main(String[] args) {

        Integer [] a ={3,12,66,32,1,6,77,2};

    }

    @FunctionalInterface
    public interface Komparator<T>{
        int compare(T x, T y);
    }


    public static class Pokemon{
        String name;
        Integer level;
        Integer hp;

        public Pokemon(String name, Integer level, Integer hp) {
            this.name = name;
            this.level = level;
            this.hp = hp;
        }

        Pokemon[] pokemons = {
                new Pokemon("Blastoise", 10, 1000),
                new Pokemon("Pikachu", 8, 500),
                new Pokemon("Charmander", 7, 120),
                new Pokemon("Gengar", 10, 1001),
                new Pokemon("Jigglypuff", 10, 500),
                new Pokemon("Blastoise", 10, 1002)
        };

        public String toString(){
            // Denne funksjonen sørger for at System.out.print skriver
            // output som er lett å lese for mennesker
            return name + " (" + level + "," + hp + ")";
        }
    }




}




