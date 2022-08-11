package boletim;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;


public class boletim {
	
	
		
		private static DateFormat sdf;

		public static void main(String[] args) {
		
			
		
			int n1;
			int n2;
			int n3;
			int n4;
			int n5;
			int n6;
			int n7;
			int n8;
			int n9;
			int n10;
			int n11;
			int n12;
			int n13;
			int n14;
			int n15;
			int n16;
			int n17;
			int n18;
			int n19;
			int n20;
			int n21;
			int n22;
			int n23;
			int n24;
			int n25;
			int n26;
			int n27;
			int n28;
			
			
			
			
			try (Scanner input = new Scanner(System.in)) {
			
				
			
				
				
				n1 =Integer.parseInt(JOptionPane.showInputDialog ("notificados do dia anterior?"));
				
				n2=Integer.parseInt(JOptionPane.showInputDialog ("notificados do de hoje?"));
				
				n3 =Integer.parseInt(JOptionPane.showInputDialog ("descartado por teste do dia anterior: "));
				
				n4 =Integer.parseInt(JOptionPane.showInputDialog("informe o  numero de descartado por teste de  hoje: "));
				
				n5 =Integer.parseInt(JOptionPane.showInputDialog("suspeitos monitorados em isolamento anterior : "));
				
				n6 = Integer.parseInt(JOptionPane.showInputDialog("suspeitos monitorados em isolamento de hoje : "));
				
				n7 =Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados geral do dia anterior: "));
				
				n8 = Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados geral de hoje : "));
				
				n9 =Integer.parseInt(JOptionPane.showInputDialog	("numero de confirmados ativos do dia anterior: "));
			
				n10 = Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados  ativos de hoje : "));
				
				n11 = Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados do dia anterior: "));
				
				n12 = Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados do dia de hoje: "));
				
				n13 =Integer.parseInt(JOptionPane.showInputDialog("numero de isolamento hospitalar do dia anterior: "));
				
				n14 = Integer.parseInt(JOptionPane.showInputDialog("numero de isolamento hospitalar de hoje: "));
				
				n15 =Integer.parseInt(JOptionPane.showInputDialog	("numero de isolamento domiciliar do dia anterior: "));
			
				n16 = Integer.parseInt(JOptionPane.showInputDialog	("numero de isolamento domiciliar de hoje: "));
			
				n17 =Integer.parseInt(JOptionPane.showInputDialog ("numero de obitos fora do municipio do dia anterior: "));
				
				n18 =Integer.parseInt(JOptionPane.showInputDialog("numero de obitos fora do municipio de hoje: "));
				
				n19 =Integer.parseInt(JOptionPane.showInputDialog(" numero de obitos no municipio de hoje no dia anterior: "));
				 
				n20 =Integer.parseInt(JOptionPane.showInputDialog ("numero de obitos no municipio de hoje: "));
				
				n21 =Integer.parseInt(JOptionPane.showInputDialog (" soma do total de obito do dia anterior : "));
				
				n22= Integer.parseInt(JOptionPane.showInputDialog (" soma do total de obito de hoje : "));
				
				n23 =Integer.parseInt(JOptionPane.showInputDialog ("numero de recuperado do dia anterior: "));
				
				n24 =Integer.parseInt(JOptionPane.showInputDialog ("numero de recuperado de hoje: "));
		
				n25 =Integer.parseInt(JOptionPane.showInputDialog  ("numero de confirmados por sexo do dia anterior feminino "));
				
				n26 =Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados por sexo de hoje feminino "));
				
				n27 =Integer.parseInt(JOptionPane.showInputDialog ("numero de confirmados por sexo do dia anterior masculino "));
				
				n28 =Integer.parseInt(JOptionPane.showInputDialog("numero de confirmados por sexo de hoje masculino "));
				
			
				
			
				
				
				
				
				
		
			}
			
			 JOptionPane.showInternalMessageDialog (null,  "Numero de notificados é :  ------------" +  (n1+n2) 
					 
					+ "\n Numero de descartados por teste rapido é : ---------- "+ (n3+n4)
					+ "\n Suspeitos monitorados em isolamento é : ----------" + (n5+n6)
					+("\n  Numero de confirmados geral é: _________ " + (+n7+n8))+ 
					" \n Numero de confirmados ativos  é : ---------"+(n9+n10) 
					+ "\n Numero de confirmados :-----------"+ (n11+n12) 
					+ "\n Numero de isolamento hospitalar é :-----------" + (n13+n14)+ 
					("\n numero de isolamento domiciliar:----------"+(n15+n16))+
					("\n numero de obitos fora do municipio:--------------"+ (n17+n18)) + 
					("\n Numero de obitos no municipio: ------------------ " +(n19+n20)+ 
					 "\n Soma do total de obito:-----------:"  +(n21+n22)
					 + "\n Numero de recuperado:-----------:" + (n23+n24)
					+ "\n \"Numero de confirmados por sexo feminino : ----------" + (n25+ n26)
					+ "\n Numero de confirmados por sexo masculino:------------" +(n27+n28))
					+ "\n A SOMA DE CONFIRMADOS MASCULINOS + CONFIRMADOS FEMINITOS É :------------" +(n25+n26+n27+n28)
					+ "\n A SOMA DE RECUPERADOS+ TOTAL DE ÓBITOS + CONFIRMADOS ATIVOS É: --------------" +((n23+n24 + n21+n22 + n9+n10 )) 
					+ "\n A SUBTRAÇÃO DE  NOTIFICADOS - DESCARTADOS POR TESTE É: ------------" + (n1+n2 - (n3+n4)));
					
					

		
		
		
		
}
		}
