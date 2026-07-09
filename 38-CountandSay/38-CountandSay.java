// Last updated: 09/07/2026, 18:27:52
1import java.time.LocalDate;
2class Solution {
3    public int dayOfYear(String date) {
4        return LocalDate.parse(date).getDayOfYear();
5    }
6}