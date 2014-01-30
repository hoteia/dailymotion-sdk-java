package com.bc.dailymotion.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class ApiResponse<E> {
    private int page;
    private int limit;
    private boolean explicit;
    private int total;

    @JsonProperty(value = "has_more")
    private boolean hasMore;

    @JsonTypeInfo(property = "list", use = JsonTypeInfo.Id.CLASS)
    private List<E> list;

    /**
     * Default constructor for class ApiResponse
     */
    public ApiResponse() {
        this.list = new ArrayList<>();
    }

    /**
     * Returns the Page
     *
     * @return the Page
     */
    public int getPage() {
        return page;
    }

    /**
     * Set the Page
     *
     * @param page the Page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Returns the Limit
     *
     * @return the Limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Set the Limit
     *
     * @param limit the Limit to set
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * Returns the explicit
     *
     * @return the explicit
     */
    public boolean isExplicit() {
        return explicit;
    }

    /**
     * Set the Explicit
     *
     * @param explicit the Explicit to set
     */
    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    /**
     * Returns the Total
     *
     * @return the Total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Set the Total
     *
     * @param total the Total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Returns the hasMore
     *
     * @return the hasMore
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Set the Has_more
     *
     * @param hasMore the Has_more to set
     */
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    /**
     * Returns the List
     *
     * @return the List
     */
    public List<E> getList() {
        return list;
    }

    /**
     * Set the List
     *
     * @param list the List to set
     */
    public void setList(List<E> list) {
        this.list = list;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
