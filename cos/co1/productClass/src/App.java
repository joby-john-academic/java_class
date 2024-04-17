import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    

        product arrayProduct[] = new product[3];

        for( int i = 0; i<3; i++)
        {   String name = JOptionPane.showInputDialog("Enter product name");
            int pcode = Integer.parseInt(JOptionPane.showInputDialog("Enter product code"));
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the product"));
           
            product obj = new product(pcode, name, price);
           //System.out.println(obj.pname);
           arrayProduct[i] = obj;
           //System.out.println(arrayProduct[i].pname + "added");
        }
        product max = arrayProduct[0];

        for (int i = 0 ; i<3; i++)
        {
            max = max.price>arrayProduct[i].price ?max:arrayProduct[i]; 
        }

        JOptionPane.showMessageDialog(null, max.pname+" with code "+ max.memberspcode+ " has highestprice of "+ max.price);

    }

}