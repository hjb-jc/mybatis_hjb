package com.nf2.sss.dao1;

import com.nf2.sss.eneity1.SssBlog;
import java.util.List;

public interface SssBlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_blog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_blog
     *
     * @mbg.generated
     */
    int insert(SssBlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_blog
     *
     * @mbg.generated
     */
    SssBlog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_blog
     *
     * @mbg.generated
     */
    List<SssBlog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_blog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SssBlog record);
}