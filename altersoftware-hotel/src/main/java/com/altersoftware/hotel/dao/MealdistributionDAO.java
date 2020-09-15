package com.altersoftware.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.altersoftware.hotel.entity.MealdistributionDO;

/**
 * @author czy@win10
 * @date 2020/1/30 16:03
 */
@Mapper
public interface MealdistributionDAO {
    /**
     * 插入一条配送订单信息
     *
     *
     */
    @Insert(" INSERT INTO tb_mealdistribution (id, room_number, staff_id, order_id, mealdistribution_intime, mealdistribution_outtime, create_time, modify_time ) "
        +
        "VALUES(#{id}, #{roomNumber}, #{staffId}, #{orderId}, #{inTime}, #{outTime}, now(), now()) ")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(MealdistributionDO mealdistributionDO);

    /**
     * id查找配送订单消息
     *
     * @param id
     */
    @Select("select id, room_number, staff_id, order_id, mealdistribution_intime, mealdistribution_outtime, create_time, modify_time from tb_mealdistribution where id=#{id}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumber", column = "room_number"),
        @Result(property = "staffId", column = "staff_id"),
        @Result(property = "orderId", column = "order_id"),
        @Result(property = "inTime", column = "mealdistribution_intime"),
        @Result(property = "outTime", column = "mealdistribution_outtime"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    MealdistributionDO getMealdistributionDOById(long id);

    /**
     * 房间查找配送订单消息
     *
     * @param roomNumber
     */
    @Select("select id, room_number, staff_id, order_id, mealdistribution_intime, mealdistribution_outtime, create_time, modify_time from tb_mealdistribution where room_number=#{roomNumber}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumber", column = "room_number"),
        @Result(property = "staffId", column = "staff_id"),
        @Result(property = "orderId", column = "order_id"),
        @Result(property = "inTime", column = "mealdistribution_intime"),
        @Result(property = "outTime", column = "mealdistribution_outtime"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    List<MealdistributionDO> getMealdistributionDOByRoomNumber(int roomNumber);

    /**
     * 员工查找配送订单消息
     *
     * @param staffId
     */
    @Select("select id, room_number, staff_id, order_id, mealdistribution_intime, mealdistribution_outtime, create_time, modify_time from tb_mealdistribution where staff_id=#{staffId}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumber", column = "room_number"),
        @Result(property = "staffId", column = "staff_id"),
        @Result(property = "orderId", column = "order_id"),
        @Result(property = "inTime", column = "mealdistribution_intime"),
        @Result(property = "outTime", column = "mealdistribution_outtime"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    List<MealdistributionDO> getMealdistributionDOByStaffId(long staffId);

    /**
     * 菜单Id查找配送订单消息
     *
     * @param orderId
     */
    @Select("select id, room_number, staff_id, order_id, mealdistribution_intime, mealdistribution_outtime, create_time, modify_time from tb_mealdistribution where order_id=#{orderId}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumber", column = "room_number"),
        @Result(property = "staffId", column = "staff_id"),
        @Result(property = "orderId", column = "order_id"),
        @Result(property = "inTime", column = "mealdistribution_intime"),
        @Result(property = "outTime", column = "mealdistribution_outtime"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    MealdistributionDO getMealdistributionDOByOrderId(long orderId);

    /**
     * 更新配送订单消息
     *
     * @param mealdistributionDO
     */
    @Update("update tb_mealdistribution  set room_number=#{roomNumber}, staff_id=#{staffId}, order_id=#{orderId}, mealdistribution_intime=#{inTime}, mealdistribution_outtime=#{outTime}, modify_time=now()  where id=#{id}")
    int update(MealdistributionDO mealdistributionDO);

    /**
     * 开始配送
     *
     * @param id
     */
    @Update("update tb_mealdistribution  set mealdistribution_intime=now(), modify_time=now()  where id=#{id}")
    int start(long id);

    /**
     * 完成配送
     *
     * @param id
     */
    @Update("update tb_mealdistribution  set mealdistribution_outtime=now(), modify_time=now()  where id=#{id}")
    int end(long id);

    /**
     * 根据id删除一条配送订单消息
     *
     * @param id
     */
    @Delete("DELETE FROM tb_mealdistribution WHERE id=#{id}")
    int deleteById(long id);

    /**
     * 根据id删除一条配送订单消息
     *
     * @param orderId
     */
    @Delete("DELETE FROM tb_mealdistribution WHERE order_id=#{orderId}")
    int deleteByOrder(long orderId);

    /**
     * 返回配送订单list
     *
     * @return
     */
    @Select("select id, room_number, staff_id, order_id, mealdistribution_intime, mealdistribution_outtime, create_time, modify_time from tb_mealdistribution  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumber", column = "room_number"),
        @Result(property = "staffId", column = "staff_id"),
        @Result(property = "orderId", column = "order_id"),
        @Result(property = "inTime", column = "mealdistribution_intime"),
        @Result(property = "outTime", column = "mealdistribution_outtime"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    List<MealdistributionDO> getMealList();
}
