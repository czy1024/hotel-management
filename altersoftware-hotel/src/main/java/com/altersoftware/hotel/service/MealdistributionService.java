package com.altersoftware.hotel.service;

import java.util.List;

import com.altersoftware.hotel.entity.MealdistributionDO;
import com.altersoftware.hotel.entity.ResultDO;

/**
 * @author Iszychen@win10
 * @date 2020/2/10 21:19
 */
public interface MealdistributionService {
    /**
     * 配送订单存入数据库
     *
     * @param mealdistribution
     * @return
     */
    ResultDO<Void> createMealdistribution(MealdistributionDO mealdistribution);

    /**
     * 展示配送订单信息
     *
     * @param id
     */
    ResultDO<MealdistributionDO> showMealdistribution(long id);

    /**
     * 菜单编号展示配送订单信息
     *
     * @param order
     */
    ResultDO<MealdistributionDO> showMealdistributionByOrder(long order);

    /**
     * 修改配送订单信息
     *
     * @param mealdistribution
     */
    ResultDO<Void> updateMealdistribution(MealdistributionDO mealdistribution);

    /**
     * 删除配送订单信息
     *
     * @return
     */
    ResultDO<Void> deleteById(long id);

    /**
     * 删除部分配送订单信息
     *
     * @return
     */
    ResultDO<Void> deleteList(List<Long> ids);

    /**
     * 订单编号删除部分配送订单信息
     *
     * @return
     */
    ResultDO<Void> deleteByOrder(long orderId);

    /**
     * 查询所有配送订单信息
     *
     * @return
     */
    ResultDO<List<MealdistributionDO>> getAll();

    /**
     * 通过员工编号获取配送订单信息
     *
     * @param staffId
     * @return
     */
    ResultDO<List<MealdistributionDO>> getListByStaffId(long staffId);

    /**
     * 通过房间门牌获取配送订单信息
     *
     * @param roomNumber
     * @return
     */
    ResultDO<List<MealdistributionDO>> getListByRoom(int roomNumber);

    /**
     * 获取当前正在配送的订单
     * 
     * @return
     */
    ResultDO<MealdistributionDO> getNow(long staffId);

    /**
     * 完成配送
     */
    ResultDO<Void> end(long id);

    /**
     * 开始配送
     */
    ResultDO<Void> start(long id);
}
