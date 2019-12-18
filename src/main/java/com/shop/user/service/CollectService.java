package com.shop.user.service;

import com.shop.user.modal.Collect;
import com.shop.user.util.Page;

import java.util.List;

/**
 * （收藏service）
 *
 * @author wanghe
 * @date 2019/12/17 9:58
 */
public interface CollectService  {
    /**
     * @Description: (收藏分页)
     * @author wanghe
     * @date
     */
    public Page<Collect> findCollectList(Integer index, Integer size);

    /**
     * @Description: (收藏添加)
     * @author wanghe
     * @date
     */
    public Integer addCollect(Collect collect);

    /**
     * @Description: (收藏删除)
     * @author wanghe
     * @date
     */
    public Integer deleteCollect(Integer id);

    /**
     * @Description: (根据手机号查询全部收藏)
     * @author wanghe
     * @date
     */
    public List<Collect> getCollectPhone(String phone);
}
