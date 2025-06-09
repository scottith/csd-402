// Scott Macioce
// June 8, 2025
// CSD402 - Module 3 Assignment: Triangle Pattern with Nested Loops
// This program prints a triangle number pattern using powers of 2
// and nested loops, followed by an '@' symbol
public class Module3Assignment {
    public static void main(String[] args) {
        int totalRows = 7;
        int totalWidth = (totalRows * 2 - 1) * 4 + 4; // max character width (numbers + padding + space for @)

        for (int row = 1; row <= totalRows; row++) {
            StringBuilder line = new StringBuilder();

            // Calculate how many numbers will be in this row
            int numCount = row * 2 - 1;

            // Calculate leading spaces to center the pattern
            int leadingSpaces = (totalRows - row) * 4;
            for (int s = 0; s < leadingSpaces; s++) {
                line.append(" ");
            }

            // Print increasing powers of 2
            int value = 1;
            for (int i = 0; i < row; i++) {
                line.append(String.format("%4d", value));
                value *= 2;
            }

            // Decreasing powers (mirror the left side)
            value /= 4;
            for (int i = 1; i < row; i++) {
                line.append(String.format("%4d", value));
                value /= 2;
            }

            // Pad the end with spaces so the @ is right-aligned
            while (line.length() < totalWidth) {
                line.append(" ");
            }

            // Append @ symbol
            line.append("@");

            // Print the final formatted line
            System.out.println(line);
        }
    }
}
