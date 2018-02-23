package com.nongyou.commons.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

public class StringToDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		StringBuilder dateStr = new StringBuilder("00000000000000");
		if (!StringUtils.hasText(source)) {
			return null;
		}

		String[] dateEles = source.split("[^0-9]+");
		for (int i = 0; i < dateEles.length; i++) {
			if (i == 0) {
				dateStr.replace(0, 4, String.format("%04d", Integer.valueOf(dateEles[0])));
			}
			if (i == 1) {
				dateStr.replace(4, 6, String.format("%02d", Integer.valueOf(dateEles[1])));
			}
			if (i == 2) {
				dateStr.replace(6, 8, String.format("%02d", Integer.valueOf(dateEles[2])));
			}
			if (i == 3) {
				dateStr.replace(8, 10, String.format("%02d", Integer.valueOf(dateEles[3])));
			}
			if (i == 4) {
				dateStr.replace(10, 12, String.format("%02d", Integer.valueOf(dateEles[4])));
			}
			if (i == 5) {
				dateStr.replace(12, 14, String.format("%02d", Integer.valueOf(dateEles[5])));
			}
		}

		try {
			return new SimpleDateFormat("yyyyMMddHHmmss").parse(dateStr.toString());
		} catch (ParseException e) {
			throw new RuntimeException(String.format("parser %s to Date fail", source));
		}
	}

}
