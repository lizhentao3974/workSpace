package com.fh.shop.area.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.shop.area.common.ServerResponse;
import com.fh.shop.area.mapper.IAreaMapper;
import com.fh.shop.area.po.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("areaService")
@Transactional(rollbackFor = Exception.class)
public class IAreaServiceImpl implements IAreaService {

    @Resource
    private IAreaMapper areaMapper;

    @Transactional(readOnly = true)
    public ServerResponse findAreaList(Long id) {
        QueryWrapper<Area> areaQueryWrapper = new QueryWrapper<>();
        areaQueryWrapper.eq("fid", id);
        List<Area> areaList = areaMapper.selectList(areaQueryWrapper);
        return ServerResponse.success(areaList);
    }

    @Override
    public ServerResponse add(Area area) {
        areaMapper.insert(area);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse delete(Long id) {
        areaMapper.deleteById(id);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse find(Long id) {
        Area area = areaMapper.selectById(id);
        return ServerResponse.success(area);
    }

    @Override
    public ServerResponse update(Area area) {
        areaMapper.updateById(area);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse findList() {
        List<Area> areas = areaMapper.selectList(null);
        return ServerResponse.success(areas);
    }
}
