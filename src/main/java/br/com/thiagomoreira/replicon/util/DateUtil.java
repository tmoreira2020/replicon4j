package br.com.thiagomoreira.replicon.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {

	public static Date translateDate(
			br.com.thiagomoreira.replicon.model.Date date) {
		return translateDate(date, false);
	}

	public static Date translateDate(
			br.com.thiagomoreira.replicon.model.Date date, boolean isEndDate) {

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT-0"));

		calendar.set(Calendar.YEAR, date.getYear());
		calendar.set(Calendar.MONTH, date.getMonth() - 1);
		if (isEndDate) {
			calendar.set(Calendar.DAY_OF_MONTH, date.getDay() + 1);
		} else {
			calendar.set(Calendar.DAY_OF_MONTH, date.getDay());
		}
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

	public static br.com.thiagomoreira.replicon.model.Date translateDate(
			Date date) {

		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		calendar.setTime(date);

		br.com.thiagomoreira.replicon.model.Date result = new br.com.thiagomoreira.replicon.model.Date();

		result.setYear(calendar.get(Calendar.YEAR));
		result.setMonth(calendar.get(Calendar.MONTH) + 1);
		result.setDay(calendar.get(Calendar.DAY_OF_MONTH));

		return result;
	}

}