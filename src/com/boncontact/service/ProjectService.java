package com.boncontact.service;

import java.util.List;
import com.boncontact.domain.Project;

public interface ProjectService {
	/**
	 * save()：保存对象
	 * 
	 * @param entity
	 *            ：实体对象
	 */
	void save(Project entity);

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
	void update(Project entity);

	/**
	 * getById():根据id查找
	 * 
	 * @param id
	 *            :需要查找的id值
	 * @return
	 */
	Project getById(Long id);

	/**
	 * getByIndetify():根据业务编号查找
	 * 
	 * @param indenity
	 * @return
	 */
	Project getByIndetify(String indenity);

	/**
	 * getByids：根据id组查找
	 * 
	 * @param ids
	 *            :id组
	 * @return
	 */
	List<Project> getByIds(Long[] ids);

	/**
	 * findAll():查找全部对象
	 * 
	 * @param str
	 *            :Where查询子句
	 * @return
	 */
	List<Project> findAll(String str);

	/**
	 * getAmount():查询记录总数
	 * 
	 * @param query
	 *            ：查询子句
	 * @return
	 */
	Project getAmount(String query);
	
	void saveMerge(Project entity);

	/**
	 * 根据合同id查找审核结果
	 * 
	 * @param contractsId
	 * @return
	 */
	// List<ContractAudit> getByContracts(Long contractsId);
}
