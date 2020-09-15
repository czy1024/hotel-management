package com.altersoftware.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.altersoftware.hotel.entity.VipGradeDO;

/**
 * @author czy@win10
 * @date 2020/2/4 14:22
 */
@Mapper
public interface VipGradeDAO {
    /**
     * 插入一条VIP会员权益信息
     *
     *
     */
    @Insert(" INSERT INTO tb_vip_grade (id, equity, grade, discount, picture, description, update_description, create_time, modify_time ) "
        +
        "VALUES(#{id}, #{equity}, #{grade}, #{discount}, #{picture}, #{description}, #{updateDescription}, now(), now()) ")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(VipGradeDO vipGradeDO);

    /**
     * id查找VIP会员权益消息
     *
     * @param id
     */
    @Select("select id, equity, grade, discount, create_time, modify_time, picture, description, update_description from tb_vip_grade where id=#{id}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "equity", column = "equity"),
        @Result(property = "grade", column = "grade"),
        @Result(property = "discount", column = "discount"),
        @Result(property = "picture", column = "picture"),
        @Result(property = "description", column = "description"),
        @Result(property = "updateDescription", column = "update_description"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    VipGradeDO getVipGradeDOById(long id);

    /**
     * 名称查找VIP会员权益消息
     *
     * @param grade)
     */
    @Select("select id, equity, grade, discount, create_time, modify_time, picture, description, update_description from tb_vip_grade where grade=#{grade}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "equity", column = "equity"),
        @Result(property = "grade", column = "grade"),
        @Result(property = "discount", column = "discount"),
        @Result(property = "picture", column = "picture"),
        @Result(property = "description", column = "description"),
        @Result(property = "updateDescription", column = "update_description"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    VipGradeDO getVipGradeDOByGrade(String grade);

    /**
     * 更新VIP会员权益消息
     *
     * @param vipGradeDO
     */
    @Update("update tb_vip_grade set equity=#{equity}, grade=#{grade}, discount=#{discount}, picture=#{picture}, description=#{description}, update_description=#{updateDescription}, modify_time=now() where id=#{id}")
    int update(VipGradeDO vipGradeDO);

    /**
     * 根据id删除一条VIP会员权益消息
     *
     * @param id
     */
    @Delete("DELETE FROM tb_vip_grade WHERE id=#{id}")
    int deleteById(long id);

    /**
     * 通过会员等级返回VIP会员权益list
     *
     * @return
     */
    @Select("select id, equity, grade, discount, create_time, modify_time, picture, description, update_description from tb_vip_grade where grade=#{grade}")
    List<VipGradeDO> getVipIdList(String grade);

    /**
     * 会员权益list
     *
     * @return
     */
    @Select("select id, equity, grade, discount, create_time, modify_time, picture, description, update_description from tb_vip_grade ")
    List<VipGradeDO> getVipGradeList();
}
