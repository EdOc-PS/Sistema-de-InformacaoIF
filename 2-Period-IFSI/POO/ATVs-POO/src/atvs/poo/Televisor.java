
package atvs.poo;

/**
 * @author 0057138
 */

    class Televisor{
        
        int volume = 0, canal = 1;
        boolean power = false;
        String txt = "desligado";
        
        void Aumentarvolume(){
            if (this.volume <= 10){
                this.volume++;
                System.out.println("O volume aumentou! Esta em: "+this.volume);
            }else{
                System.out.println("Volume esta no maximo");
            }
        }
        void Reduzirvolume(){
             if (this.volume > 0){
                this.volume--;
                System.out.println("O volume diminuiu! Esta em: "+this.volume);
            }else{
                System.out.println("Volume esta no minimo");
            }
        }
         void Aumentarcanal(){
            if (this.canal <= 16){
                this.canal++;
                System.out.println("Voce mudou de canal! Esta no canal: "+this.canal);
            }else{
                System.out.println("Não é possivel a troca de canal.");
            }
        }
        void Reduzircanal(){
             if (this.canal > 0){
                this.canal--;
                System.out.println("Voce mudou de canal! Esta no canal: "+this.canal);
            }else{
                System.out.println("Não é possivel a troca de canal.");
            }
        }
        void ligartv(){
            this.power = true;
            this.txt = "ligada";
            System.out.println("Tv ligada!");
            
        }
        void desligartv(){
           this.power = false;
           this.txt = "desligada";
           this.volume = 0;
           this.canal = 1; 
        }
        
        void mostrastatus(){
            System.out.println("Status: \nO televisor esta no canal: "+this.canal+"\nNo volume: "+this.volume+"\nE esta: "+this.txt);
        }
      }
    