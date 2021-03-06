package com.yanghj.demo.dao;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Component;

import com.yanghj.demo.entity.Area;
@Component
//@CacheConfig(cacheNames = "users")
public interface AreaDao {
	/**
	 * 列出区域列表
	 * 
	 * @return areaList
	 */
	List<Area> queryArea();

	/**
	 * 根据Id列出具体区域
	 * 
	 * @return area
	 */
	//@Cacheable(key ="#p0")
	Area queryAreaById(int areaId);

	/**
	 * 插入区域信息
	 * 
	 * @param area
	 * @return
	 */
	int insertArea(Area area);

	/**
	 * 更新区域信息
	 * 
	 * @param area
	 * @return
	 */
	int updateArea(Area area);

	/**
	 * 删除区域信息
	 * 
	 * @param areaId
	 * @return
	 */
	int deleteArea(int areaId);
}
