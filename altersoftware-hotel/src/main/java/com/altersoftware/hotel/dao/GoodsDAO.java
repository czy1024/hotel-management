package com.altersoftware.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.altersoftware.hotel.entity.GoodsDO;

/**
 * @author czy@win10
 * @date 2020/1/27 23:11
 */
@Mapper
public interface GoodsDAO {
	/**
	 * 插入一条物品信息
	 *
	 * @param goodsDO
	 */
	@Insert(" INSERT INTO tb_goods (id, room_list, name, picture, buy_time, price, compensation_money, state, create_time, modify_time ) "
        +
        "VALUES(#{id}, #{roomNumberListToString},#{name}, #{picture}, #{buyTime}, #{price}, #{compensationMoeny}, #{state},  now(), now()) ")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(GoodsDO goodsDO);

    /**
     * id查找物品消息
     *
     * @param id
     * @return
     */
    @Select("select id, room_list, name,picture, buy_time, price, compensation_money, state,  create_time, modify_time from tb_goods where id=#{id}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumberListToString", column = "room_list"),
        @Result(property = "name", column = "name"),
        @Result(property = "picture", column = "picture"),
        @Result(property = "buyTime", column = "buy_time"),
        @Result(property = "price", column = "price"),
        @Result(property = "compensationMoeny", column = "compensation_money"),
        @Result(property = "state", column = "state"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    GoodsDO getGoodsDOById(long id);

    /**
     * 查询所有物品信息
     *
     *
     * @return
     */
    @Select("select id, room_list, name, picture, buy_time, price, compensation_money, state,  create_time, modify_time from tb_goods ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumberListToString", column = "room_list"),
        @Result(property = "name", column = "name"),
        @Result(property = "picture", column = "picture"),
        @Result(property = "buyTime", column = "buy_time"),
        @Result(property = "price", column = "price"),
        @Result(property = "compensationMoeny", column = "compensation_money"),
        @Result(property = "state", column = "state"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    List<GoodsDO> getAll();

    /**
     * 更新物品消息
     *
     * @param floorDO
     */
    @Update("update tb_goods  set room_list=#{roomNumberListToString}, name=#{name}, picture=#{picture}, buy_time=#{buyTime}, price=#{price}, compensation_money=#{compensationMoeny}, state=#{state}, modify_time=now()  where id=#{id}")
    int update(GoodsDO floorDO);

    /**
     * 根据id删除一条物品消息
     *
     * @param id
     */
    @Delete("DELETE FROM tb_goods WHERE id=#{id}")
    int deleteById(long id);

    /**
     * 根据房间Id查询所属物品
     *
     * @param roomNumberListToString
     * @return
     */
    @Select("select id, room_list, name, picture, buy_time, price, compensation_money, state,  create_time, modify_time from tb_goods where room_list=#{roomNumberListToString}  ")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "roomNumberListToString", column = "room_list"),
        @Result(property = "name", column = "name"),
        @Result(property = "picture", column = "picture"),
        @Result(property = "buyTime", column = "buy_time"),
        @Result(property = "price", column = "price"),
        @Result(property = "compensationMoeny", column = "compensation_money"),
        @Result(property = "state", column = "state"),
        @Result(property = "createTime", column = "create_time"),
        @Result(property = "modifyTime", column = "modify_time")
    })
    List<GoodsDO> getGoodsDOByRoomId(long roomNumberListToString);

}
