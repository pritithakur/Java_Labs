import java.util.Scanner;

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (empName == null || empName.isEmpty()) {
            // Check if the employee name is null or empty
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        if (!isIndian) {
            // Check if the employee is not an Indian citizen
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        double taxAmount = 0;
        // Calculate tax logic goes here
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String empName = input.nextLine();

        System.out.println("Is the employee Indian? (true/false): ");
        boolean isIndian = input.nextBoolean();
        input.nextLine();

        System.out.println("Enter employee salary:");
        double empSal = input.nextDouble();

        TaxCalculator taxCalculator = new TaxCalculator();

        try {
            double taxAmount = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is: " + taxAmount);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}
