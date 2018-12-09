package com.younger.eloan.basice.query;

import com.younger.eloan.basice.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;
import java.util.Date;


/**
 * 登录日志查询对象
 * 
 * @author Administrator
 * 
 */
@Getter
@Setter
public class IpLogQueryObject extends QueryObject {

	private Date beginDate;
	private Date endDate;
	private String username;
	private int userType = -1;
	private int loginType = -1;
	private boolean like;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setBeginDate(Date beginDate){
		this.beginDate=beginDate;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public void setEndDate(Date endDate){
		this.endDate=endDate;
	}

	public Date getEndDate() {
		return endDate != null ? DateUtil.endOfDay(endDate) : null;
	}

	public String getUsername() {
		return StringUtils.hasLength(username) ? username : null;
	}

}
