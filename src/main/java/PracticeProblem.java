import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static String getName(int Line, String file) {
		String line = readLine(Line, file);
		if (line.isEmpty()) {
			return "";
		}
		String[] parts = line.split(" ");
		if (parts.length < 2) {
			return "";
		}
		return parts[0] + " " + parts[1];
	}

	public static int getAge(int Line, String file) {
		String line = readLine(Line, file);
		if (line.isEmpty()) {
			return -1	;
		}
		String[] parts = line.split(" ");
		if (parts.length < 3) {
			return -1;
		}
		try {
			return Integer.parseInt(parts[2]);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	public static int getNumber(int Line, String file) {
		String line = readLine(Line, file);
		if (line.isEmpty()) {
			return -1;
		}
		String[] parts = line.split(" ");
		if (parts.length < 4) {
			return -1;
		}
		try {
			return Integer.parseInt(parts[3]);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	private static String readLine(int lineNumber, String file) {
		if (lineNumber <= 0) {
			return "";
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String current;
			int currentLine = 1;
			while ((current = reader.readLine()) != null) {
				if (currentLine == lineNumber) {
					return current.trim();
				}
				currentLine++;
			}
		} catch (IOException e) {
			return "";
		}
		return "";

			

	}

public static void fileAppend(String output, String filename) {
        // 'true' inside FileWriter enables append mode instead of overwrite mode
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(output);
        } catch (IOException e) {
            // Keep exceptions quiet or handle according to assignment guidelines
        }
    }

    private static String getLineContent(int targetLine, String filename) {
        if (targetLine <= 0) return null;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String currentLineText;
            int currentLineNumber = 1;
            
            while ((currentLineText = reader.readLine()) != null) {
                if (currentLineNumber == targetLine) {
                    return currentLineText;
                }
                currentLineNumber++;
            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }

}
