package other_topics;

/**
 * The Java volatile keyword is used to mark a Java variable as "being stored in main memory". More precisely
 * that means, that every read of a volatile variable will be read from the computer's main memory, and not
 * from the CPU ache, and that every write to a volatile variable will be written to main memory, and not just
 * to the CPU cache.
 *
 * @author solcanm
 * @date 2019-07-29
 */
public class VolatileKeyword {

    private int years;
    private int months;
    private volatile int days;

    /**
     * Full volatile visibility guarantee
     *
     * The full volatile visibility means, that when a value is written to days, then all variables visible to
     * thread are also written to main memory.
     */
    public int totalDays() {
        int total = this.days;
        total += months * 30;
        total += years * 24;
        return total;
    }

    public VolatileKeyword(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }
}
