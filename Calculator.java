class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <operation> <num1> <num2>");
            return;
        }

        int choice = Integer.parseInt(args[0]);
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        double result = 0;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }
}