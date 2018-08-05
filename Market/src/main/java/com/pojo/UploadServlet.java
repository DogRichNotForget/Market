package com.pojo;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 resp.setContentType("text/html;charset=utf-8");
	 PrintWriter out=resp.getWriter();
	 out.println("<h1>Commons file upload</h1>");
	 //控制文件的类型  getContentType
	 //控制文件的大小
	 
	 out.println("<ul>");
	 // 请求是否是mutipart/form-data
	 boolean isMultipart = ServletFileUpload.isMultipartContent(req);
	 try {
				 if(isMultipart)
				 {
					// Create a factory for disk-based file items
					 DiskFileItemFactory factory = new DiskFileItemFactory();
			
					 // Configure a repository (to ensure a secure temp location is used)
					 ServletContext servletContext = this.getServletContext();
					 
					 File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
					 factory.setRepository(repository);
			
					 // Create a new file upload handler
					 ServletFileUpload upload = new ServletFileUpload(factory);
			
					 // Parse the request
					 List<FileItem> items = (List<FileItem>)upload.parseRequest(req);
					 if(null!=items)
					 {
						 for(FileItem item:items)
						 {
							 //是不是文件上传
							 if(item.isFormField())
							 {
								 //是普通表单项
								 if(item.getFieldName().equals("dis"))
								 {
									 out.println("<li>dis:"+item.getString("utf-8")+"</li>");
								 }
							 }else
							 {
								 //文件哉
								 out.println("<li>getContentType:"+item.getContentType()+"</li>");
								 out.println("<li>getFieldName:"+item.getFieldName()+"</li>");
								 out.println("<li>getName:"+item.getName()+"</li>");
								 out.println("<li>getSize:"+item.getSize()+"</li>");
								 String path=this.getServletContext().getRealPath("ups")+"/";
								 String ext=this.getExtName(item.getName());
								 File target=new File(path+randName()+ext);
								 
								 item.write(target);
							 }
						 }
					 }
					 
				 }else
				 {
					 out.println("不是mutipart/formdata");
				 }
	 
	 } catch (Exception e) {
			// TODO: handle exception
		}
		
		
		 
		 out.println("</ul>");
		 out.println("<center><a href='show'>显示图片列表</a></center>");
	
	 out.close();
	}
	/**
	 * 从part中解析出原文件名
	 * @param part
	 * @return
	 */
	public String getFileName(Part part)
	{
		String fname=null;
		String hvalue=part.getHeader("Content-Disposition");
	
		Pattern pattern=Pattern.compile("(form-data; name=\"(.*?)\"; filename=\"(.*?)\")");
		Matcher  mat=pattern.matcher(hvalue);
		if(mat.find())
		{
			fname=mat.group(3);
		}
		return fname;
	}
	
	public String getExtName(String fname)
	{
		String re=null;
		
		re=fname.toLowerCase().substring(fname.lastIndexOf("."));
		return re;
	}
	private SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
	public String randName()
	{
		String re=null;
		re=sf.format(new Date())+"_"+(int)(Math.floor(Math.random()*1000));
		
		return re;
	}

}
