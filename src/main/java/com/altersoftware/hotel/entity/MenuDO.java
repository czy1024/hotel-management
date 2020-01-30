package com.altersoftware.hotel.entity;

import java.util.Date;

public class MenuDO {

    /** 菜品编号 */
    private long   id;

    /** 菜品名称 */
    private String name;

    /** 菜品价格 */
    private Double price;

    /** 菜品图片 */
    private String picture;

    /** 创建时间 */
    private Date   createTime;

    /** 修改时间 */
    private Date   modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPictrue() {
        return picture;
    }

    public void setPictrue(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "MenuDO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", picture='" + picture + '\'' +
            ", createTime=" + createTime +
            ", modifyTime=" + modifyTime +
            '}';
    }

}
