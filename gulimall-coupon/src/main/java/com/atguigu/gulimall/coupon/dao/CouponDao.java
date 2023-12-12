package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangminglun
 * @email 337844955@qq.com
 * @date 2023-12-12 19:34:15
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
