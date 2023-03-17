package br.com.techservice.timetogetherleft;

import javax.swing.JOptionPane;

/**
 * Copyright (C) 2023 Felipe Esperante Nunes
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <https://www.gnu.org/licenses/>.
 */
public class TimeTogetherLeft {

    private static final int ADULT_LIFESPAN = 78;
    private static final int HOURS_IN_DAY = 24;
    private static final int WEEKS_IN_MONTH = 4;
    private static final int MONTH_IN_YEAR = 4;

    public static void main(String[] args) {
        String hoursWeek = JOptionPane.showInputDialog(null, "Usually, how many hours in a week you meet?");
        String oldestAge = JOptionPane.showInputDialog(null, "How old is the oldest person?");
        if (Integer.parseInt(oldestAge) < 78) {
            JOptionPane.showMessageDialog(null, "You will have approximately: "
                    + getTimeLeftDays(
                            Integer.parseInt(hoursWeek),
                            Integer.parseInt(oldestAge)
                    ) + " days left together. Cherish this time!");
        } else {
            JOptionPane.showMessageDialog(null, "Adjust lifespan variable to calculate days left. Current value = "+ADULT_LIFESPAN);
        }

    }

    public static Number getTimeLeftDays(int hoursInWeek, int olderAge) {
        return getTimeHoursLeftInYear(hoursInWeek, olderAge) / HOURS_IN_DAY;
    }

    public static int getTimeHoursLeftInYear(int hoursInWeek, int olderAge) {
        return ((hoursInWeek * WEEKS_IN_MONTH) * MONTH_IN_YEAR) * getTotalYearsLeft(olderAge);
    }

    public static int getTotalYearsLeft(int olderAge) {
        return (ADULT_LIFESPAN - olderAge);
    }
}
