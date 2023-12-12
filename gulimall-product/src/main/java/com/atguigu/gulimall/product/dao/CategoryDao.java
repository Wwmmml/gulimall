package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangminglun
 * @email 337844955@qq.com
 * @date 2023-12-11 19:40:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
