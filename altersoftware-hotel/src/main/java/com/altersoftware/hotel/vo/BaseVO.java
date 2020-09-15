package com.altersoftware.hotel.vo;

import javax.validation.constraints.NotEmpty;

/**
 * @author Iszychen@win10
 * @date 2020/2/23 0:08
 */
public class BaseVO {

    /** base64编码 */
    @NotEmpty
    private String id64;

    /** 客户id */
    private long   customerId;

    /** 手机号 */
    private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId64() {
        return id64;
    }

    public void setId64(String id64) {
        this.id64 = id64;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}
