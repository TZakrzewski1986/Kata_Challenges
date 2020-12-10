package a_Belt_8_kyu.Challenge_17_CountingSheep;



public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int numberOfSheeps = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
          if (arrayOfSheeps[i] != null){
              if (arrayOfSheeps[i] == true) {
                  numberOfSheeps++;
              }
          }
        }
        return numberOfSheeps;
    }
}
