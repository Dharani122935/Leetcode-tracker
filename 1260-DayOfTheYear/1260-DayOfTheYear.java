// Last updated: 13/07/2026, 10:10:51
import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}