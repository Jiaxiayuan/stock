package com.ies.mapper;

import com.ies.domain.Customer;
import com.ies.domain.CustomerCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int countByExample(CustomerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int deleteByExample(CustomerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int insertSelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    List<Customer> selectByExampleWithRowbounds(CustomerCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    List<Customer> selectByExample(CustomerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    Customer selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    int updateByPrimaryKey(Customer record);
}