package com.nf2.sss.eneity1;

public class SssBlog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_blog.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_blog.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_blog.author_id
     *
     * @mbg.generated
     */
    private Integer authorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_blog.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_blog.id
     *
     * @return the value of sss_blog.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_blog.id
     *
     * @param id the value for sss_blog.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_blog.title
     *
     * @return the value of sss_blog.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_blog.title
     *
     * @param title the value for sss_blog.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_blog.author_id
     *
     * @return the value of sss_blog.author_id
     *
     * @mbg.generated
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_blog.author_id
     *
     * @param authorId the value for sss_blog.author_id
     *
     * @mbg.generated
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_blog.content
     *
     * @return the value of sss_blog.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_blog.content
     *
     * @param content the value for sss_blog.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}