package com.gm.common;

import org.apache.commons.lang3.StringUtils;

/**
 * ���ù�����
 * @author MC
 * @date 2017-5-31
 */
public class StringUtil {

	/**
	 * �жϲ�ѯ��ҳ��ҳ������Ƿ�Ϊnull��������Ĭ��ֵ
	 * @param param
	 * @param defaultInt
	 * @return
	 */
	public static Integer checkPageOrDefault(String param, Integer defaultInt) {
		Integer result = defaultInt;
		if (StringUtils.isNotBlank(param)) {
			result = Integer.valueOf(param);
		}
		return result;
	}
}
