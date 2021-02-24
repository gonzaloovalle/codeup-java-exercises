package java_practice;

public class URLify {
    static int MAX = 1000;

    static char[] replaceSpaces(char[] str) {
        int spaces_count = 0, i = 0;
        for (i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                spaces_count++;
            }
        }
        while (str[i - 1] == ' ') {
            spaces_count--;
            i--;
        }
        int new_length = i + spaces_count * 2;

        if (new_length > MAX) {
            return str;
        }

        int index = new_length - 1;

        char[] old_str = str;
        str = new char[new_length];

        for (int j = i - 1; j >= 0; j--) {
            if (old_str[j] == ' ')
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            }

            else
            {
                str[index] = old_str[j];
                index--;
            }
        }
        return str;
    }

    public static void main(String[] args)
    {
        char[] str = "Mr John Smith ".toCharArray();

        // Prints the replaced string
        str = replaceSpaces(str);

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
    }
}
