import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args) {
        String number;
        number = JOptionPane.showInputDialog("Select the equation you want to solve: \n1: First-order equation \n2: Multivariable equation \n3: Second-order equation");
        
        if (number.equals("1")) {
            first_degree_one_variable();
        } else if (number.equals("2")) {
            first_degree_many_variables();
        } else if (number.equals("3")) {
            second_degree_one_variable();
        }
    }

    public static void first_degree_one_variable() {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a: "));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b: "));
            double x;

            if (a == 0) {
                if (b != 0) {
                    JOptionPane.showMessageDialog(null, "Equation with no solution");
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has infinite solutions.");
                }
            } else {
                x = -b / a;
                JOptionPane.showMessageDialog(null, "The value of x is: " + x);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void first_degree_many_variables() {
        try {
            double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11: "));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12: "));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1: "));
            double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21: "));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22: "));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2: "));

            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D != 0) {
                double x1 = D1 / D;
                double x2 = D2 / D;
                JOptionPane.showMessageDialog(null, "The system of equations has a unique solution:\n x1 = " + x1 + "\n x2 = " + x2);
            } else if (D == 0 && D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "The system of equations has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system of equations has no solution.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void second_degree_one_variable() {
        try {
          
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a: "));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b: "));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c: "));

            if (a == 0) {
                JOptionPane.showMessageDialog(null, "The coefficient a cannot be 0. This is not a quadratic equation.");
                return;
            }

        
            double delta = b * b - 4 * a * c;
            String res;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                res = "The equation has two distinct solutions:\n x1 = " + x1 + "\n x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                res = "The equation has double roots:x = " + x;
            } else {
                res = "Equation without solution (no real solution).";
            }

            JOptionPane.showMessageDialog(null, res);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Vui lòng Enter số hợp lệ.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
