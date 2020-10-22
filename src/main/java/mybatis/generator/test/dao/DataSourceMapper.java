package test.dao;

import test.model.DataSource;

public interface DataSourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DataSource record);

    int insertSelective(DataSource record);

    DataSource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DataSource record);

    int updateByPrimaryKeyWithBLOBs(DataSource record);

    int updateByPrimaryKey(DataSource record);
}