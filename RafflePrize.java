public class RafflePrize {
   public static void main(String[] args) {
        Shop shop = new Shop();

        Prize prize1 = new Prize(1, "Мягкая игрушка",1, 50);
        Prize prize2 = new Prize(2, "Конструктор Лего", 1, 10);
        Prize prize3 = new Prize(3, "Трехколесный велосипед", 1, 5);
        Prize prize4 = new Prize(4, "Радиоуправляемая машинка", 1, 30);

        shop.addPrize(prize1);
        shop.addPrize(prize2);
        shop.addPrize(prize3);
        shop.addPrize(prize4);

        shop.raffle();


        Prize draw = shop.issuanceOfPrizes();

        if(draw != null){
            System.out.println("Поздравляю!!! Вы выиграли: " + draw.getName());
        }
        else{
            System.out.println("К сожалению вы ничего не выиграли ((( ");
        }

        
        shop.changeFrequency(3, 50);


   }
}
