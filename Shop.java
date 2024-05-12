import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Shop {
    private ArrayList<Prize> prizes;
    public ArrayList<Prize> draw;
    private String listOfPrizes;

    public Shop(){
        prizes = new ArrayList<Prize>();
        draw = new ArrayList<Prize>();
        listOfPrizes = "listOfPrezes.txt";
    }

    public void addPrize(Prize prize){
        prizes.add(prize);
    }

    public void raffle(){
        draw.clear();

        for (Prize prize: prizes){
            double random = Math.random() * 100;
            System.out.println(random);
            if(random < prize.getFrequency()){
                draw.add(prize);
                prize.setQuantity(prize.getQuantity() - 1);
            }
        }
    }

    public Prize issuanceOfPrizes(){

        if (!draw.isEmpty()) {
            Prize winnerPrize = draw.remove(0);


            try {
                FileWriter writer = new FileWriter(listOfPrizes, true);
                writer.write(winnerPrize.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Отсутствует файл для записи");
            }

            return winnerPrize;
        } else {
            return null;
        }
    }
    public void changeFrequency(int changesId, int changesFrequency){
        for(Prize prize : prizes){
            if(prize.getId() == changesId){
                prize.setFrequency(changesFrequency);
            }
        }
    }
}
