package com.fh.shop.area.biz;


import com.fh.shop.area.common.ServerResponse;
import com.fh.shop.area.po.Area;

public interface IAreaService {
    public ServerResponse findAreaList(Long id);

    ServerResponse add(Area area);

    ServerResponse delete(Long id);

    ServerResponse find(Long id);

    ServerResponse update(Area area);

    ServerResponse findList();
}
