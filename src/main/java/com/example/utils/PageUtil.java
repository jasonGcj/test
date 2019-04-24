package com.example.utils;

import java.util.HashMap;
import java.util.Map;

public class PageUtil
{
	public static Map<String, Object> page(String url, int cpage, int pageSize, int count, String name)
	{
		if(count==0) {
			count =1;
		}
		int pagecount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
		int a = 0;
		if (cpage == 1) {
			a = 1;
		} else {
			a = cpage - 1;
		}
		int b = 0;
		if (cpage == pagecount) {
			b = pagecount;
		} else {
			b = cpage + 1;
		}
		String first = "<a href=" + url + "?cpage=1&name=" + name + ">首页</a>";
		String prev = "<a href=" + url + "?cpage=" + a + "&name=" + name + ">上一页</a>";
		String next = "<a href=" + url + "?cpage=" + b + "&name=" + name + ">下一页</a>";
		String last = "<a href=" + url + "?cpage=" + pagecount + "&name=" + name + ">尾页</a>";
		Map<String, Object> map = new HashMap<>();
		map.put("cpage", Integer.valueOf(cpage));
		map.put("count", Integer.valueOf(count));
		map.put("pagecount", Integer.valueOf(pagecount));
		map.put("page", first + " " + prev + " " + next + " " + last);
		return map;
	}
}

