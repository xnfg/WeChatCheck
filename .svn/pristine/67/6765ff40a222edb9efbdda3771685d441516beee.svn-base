package com.school.wechat.wechatserver.api.base.model;
import java.io.Serializable;

/**
 * 返回Response对象
 * Created by jwdstef on 2017/5/27.
 */
public class ResponseResult<T> implements Serializable {
    private String code;
    private Integer pageNumber;
    private Integer totalPage;

    private T items;

    public ResponseResult() {
    }

    public ResponseResult( String code,Integer pageNum,Integer pages,T object) {
        this.pageNumber =pageNum;
        this.totalPage =pages;
        this.code = code;
        this.items =object;
    }

    public  ResponseResult(String code){
        this.code = code;
    }


    public ResponseResult(String code, T object){
        this.code = code;
        this.items = object;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponseResult<?> that = (ResponseResult<?>) o;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        return items != null ? items.equals(that.items) : that.items == null;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                ", code='" + code + '\'' +
                ", pageNumber='"+ pageNumber +'\'' +
                ", totalPage='"+ totalPage +'\'' +
                ", items='" + items +'\'' +
                '}';
    }

    public static final String ERROR = "404";
    public static final String SUCCESS ="200";
}
