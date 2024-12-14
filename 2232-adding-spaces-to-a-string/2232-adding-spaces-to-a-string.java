class Solution {
    public String addSpaces(String s, int[] spaces) {
        int loc = 0;
        StringBuilder result = new StringBuilder(); // Use StringBuilder for better performance
        for (int space : spaces) {
            result.append(s, loc, space); // Append substring
            result.append(" ");          // Append space
            loc = space;
        }
        result.append(s.substring(loc)); // Append the remaining part of the string
        return result.toString();        // Convert StringBuilder to String
    }
}
