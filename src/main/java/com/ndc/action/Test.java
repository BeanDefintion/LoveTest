package com.ndc.action;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("test")
public class Test {

	@Autowired
	private ServletContext servletContext;

	@RequestMapping(value="/monitor")
//	@Action("login")
	public String monitor(HttpServletRequest request) throws UnknownHostException {
		JSONObject outDto = new JSONObject();
		InetAddress localhost = InetAddress.getLocalHost();
		outDto.put("a.操作系统", System.getProperty("os.name") + "_" + System.getProperty("os.arch"));
		outDto.put("b.主机IP", "" + localhost.getHostAddress());
		outDto.put("c.应用服务器", servletContext.getServerInfo());
		outDto.put("d.监听端口", request.getServerPort());
		outDto.put("e.Web根路径", servletContext.getRealPath("/"));
		outDto.put("f.Servlet版本", servletContext.getMajorVersion() + "." + servletContext.getMinorVersion());
		outDto.put("g.JVM版本", System.getProperty("java.version"));
		outDto.put("h.JVM提供商", System.getProperty("java.vendor"));
		outDto.put("i.JVM安装路径", System.getProperty("java.home"));
		outDto.put("k.JVM可用最大内存", Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
		request.setAttribute("d", outDto);
		System.err.println(request.getContextPath());
		System.err.println(outDto.toJSONString());
		 return "monitor/system/list";
	}
}
