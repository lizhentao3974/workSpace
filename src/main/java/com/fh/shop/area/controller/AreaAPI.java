package com.fh.shop.area.controller;

import com.fh.shop.area.biz.IAreaService;
import com.fh.shop.area.common.ServerResponse;
import com.fh.shop.area.po.Area;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/areas")
@CrossOrigin("*")
public class AreaAPI {

    @Resource(name = "areaService")
    private IAreaService areaService;

    @PostMapping("/add")
    public ServerResponse add(@RequestBody Area area){
        return areaService.add(area);
    }

    @GetMapping("/find")
    public ServerResponse find(@RequestParam("id") Long id){
        return areaService.find(id);
    }

    @PutMapping("/update")
    public ServerResponse update(@RequestBody Area area){
        return areaService.update(area);
    }

    @GetMapping("/findList")
    public ServerResponse findList(){
        return areaService.findList();
    }

    @DeleteMapping("/delete/{id}")
    public ServerResponse delete(@PathVariable("id") Long id){
        return areaService.delete(id);
    }

    @GetMapping(value = "/findAreaList")
    public ServerResponse findAreaList(Long id) {
        return areaService.findAreaList(id);
    }
}
