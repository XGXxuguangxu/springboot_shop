package com.shop.user.util;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
    private Integer index = 1;
    private Integer size;
    private Integer count;
    private Integer total;
    private List<T> list = new ArrayList<T>();

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotal() {
        this.total = this.count % this.size == 0 ? this.count / this.size : this.count / this.size + 1;
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
