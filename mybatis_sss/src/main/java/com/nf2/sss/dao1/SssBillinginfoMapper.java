package com.nf2.sss.dao1;

import com.nf2.sss.eneity1.SssBillinginfo;
import java.util.List;

public interface SssBillinginfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_billinginfo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_billinginfo
     *
     * @mbg.generated
     */
    int insert(SssBillinginfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_billinginfo
     *
     * @mbg.generated
     */
    SssBillinginfo selectByPrimaryKey(Integer bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_billinginfo
     *
     * @mbg.generated
     */
    List<SssBillinginfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_billinginfo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SssBillinginfo record);
}