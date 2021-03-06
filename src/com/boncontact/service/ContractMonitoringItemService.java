package com.boncontact.service;

import java.util.List;

import com.boncontact.domain.ContractMonitoringItem;

public interface ContractMonitoringItemService {
	/**
	 * save()：保存对象
	 * 
	 * @param entity
	 *            ：实体对象
	 */
	void save(ContractMonitoringItem entity);

	/**
	 * delete()：删除对象
	 * 
	 * @param id
	 *            ：对象id
	 */
	void delete(Long id);

	/**
	 * update():更新对象
	 * 
	 * @param entity
	 *            ：更新后的对象实体
	 */
	void update(ContractMonitoringItem entity);

	/**
	 * getById():根据id查找
	 * 
	 * @param id
	 *            :需要查找的id值
	 * @return
	 */
	ContractMonitoringItem getById(Long id);

	/**
	 * getByContracts：根据合同组查找
	 * 
	 * @param ids
	 *            :id组
	 * @return
	 */
	List<ContractMonitoringItem> getByContracts(Long contractsId);
}
