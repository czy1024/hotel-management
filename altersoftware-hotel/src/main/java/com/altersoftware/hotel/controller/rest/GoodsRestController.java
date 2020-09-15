package com.altersoftware.hotel.controller.rest;

import java.util.List;

import com.altersoftware.hotel.entity.GoodsDO;
import com.altersoftware.hotel.entity.ResultDO;

/**
 * @author czy@win10
 * @date 2020/1/31 21:53
 */
public interface GoodsRestController {
    /**
     * 插入一条物品信息
     *
     * @param goodsDO
     * @return
     */
    ResultDO<GoodsDO> insert(GoodsDO goodsDO);

    /**
     * 展示物品信息
     *
     * @param id
     */
    ResultDO<GoodsDO> showGoods(long id);

    /**
     * 修改物品信息
     *
     * @param goodsDO
     */
    ResultDO<Void> updateGoods(GoodsDO goodsDO);

    /**
     * 根据房间查询物品信息
     *
     * @param roomId
     */
    ResultDO<List<GoodsDO>> showGoodsByRoom(long roomId);

    /**
     * 删除物品状态信息
     *
     * @return
     */
    ResultDO<Void> deleteByRoomNumberAndGoodsName(int roomNumber, String goodsName);

    /**
     * 删除一个房间所有物品物品状态信息
     *
     * @return
     */
    ResultDO<Void> deleteList(int roomNumber);

    /**
     * 删除物品信息
     *
     * @return
     */
    ResultDO<Void> deleteById(long id);

    /**
     * 查询所有物品信息
     *
     * @return
     */
    ResultDO<List<GoodsDO>> getAll();

    /**
     * 删除部分物品信息
     *
     * @return
     */
    ResultDO<Void> deleteList(Long[] ids);
}
