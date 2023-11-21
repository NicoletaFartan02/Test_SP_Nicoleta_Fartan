package messages;

import java.util.ArrayList;
import java.util.List;

    public class Arrakis implements Case{     //Composite pattern
        String numeSistemRedare;
        private ArrayList<Case> mesajeProvenite = new ArrayList<>();

        @Override
        public void displayMesaj() {
            System.out.println("Mesaje de la casele rivale: ");
            for(Case mesaj: mesajeProvenite){
                mesaj.displayMesaj();
            }
        }
        public void addMesaj(Case mesaj){
            mesajeProvenite.add(mesaj);
        }

        public void salvareMesaje(){
            System.out.println("Mesajele au fost salvate in fisier");
        }

    }


