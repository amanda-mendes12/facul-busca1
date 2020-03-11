import javax.swing.JOptionPane;

public class Buscas {
	  
		public static int busca(int[] numeros, int key){       
			for(int i= numeros.length;i>=0;i--){    
		            if(numeros[i] == key){    
		                return i;    
		            }
		        }    
		        return -1;    
		    }    
		    public static void main(String a[]){ 
		    	int[] numeros= {2,13,17,19,21,28};
		        int key = Integer.parseInt(JOptionPane.showInputDialog("Qual o número procurado?"));    
		        int resp = busca(numeros,key);
		        if(resp == -1) 		        	
		        	JOptionPane.showMessageDialog(null, "Não existe no vetor");
		        
		        else 	        	
		        	JOptionPane.showMessageDialog(null, key+" Foi encontrado no índice: "+ resp);    
		        
		    }    
}
