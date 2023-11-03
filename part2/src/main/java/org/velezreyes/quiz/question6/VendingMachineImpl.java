package org.velezreyes.quiz.question6;

public class VendingMachineImpl {

  public static VendingMachine getInstance() {
    return new VendingMachine() {
      int money = 0;

      final Drink scottCola = new DrinkImpl("ScottCola", true);
      final Drink karenTea = new DrinkImpl("KarenTea", false);

      @Override
      public void insertQuarter() {
        money += 25;
      }

      @Override
      public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if(money == 0){
          throw new NotEnoughMoneyException();
        }else if (name.equals(scottCola.getName())){
          if (money >= 75){
            money = 0;
            return scottCola;
          } else {
            throw new NotEnoughMoneyException();
          }
        } else if (name.equals(karenTea.getName())) {
          if (money > 75){
            money = 0;
            return karenTea;
          } else {
            throw new NotEnoughMoneyException();
          }
        }  else {
          throw new UnknownDrinkException();
        }
      }
    };

  }
}
