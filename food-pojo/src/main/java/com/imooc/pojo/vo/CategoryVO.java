package com.imooc.pojo.vo;

import java.util.List;

public class CategoryVO {
    private Integer id;
    private String name;
    private Integer type;
    private Integer fatherId;

    private List<SubCategoryVO> subCatList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public List<SubCategoryVO> getSubCategoryVO() {
        return subCatList;
    }

    public void setSubCategoryVO(List<SubCategoryVO> subCategoryVO) {
        this.subCatList = subCategoryVO;
    }
}
