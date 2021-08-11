package com.myr.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.utils
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-19 09:47
 * @Description: 分页通用的工具类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageUtils<T> {

    private Integer pageIndex; //当前的页码
    private Integer pageSize; //页码大小
    private Integer pageCount; //总页数
    private Integer totalCount; //总条数
    private List<T> data;  //要分页的数据

    private Integer numStart; //开始的序号
    private Integer numEnd; //结束的序号
    //序号的集合
    private List<Integer> numbers=new ArrayList<Integer>();

    public PageUtils(Integer pageIndex, Integer pageSize, Integer totalCount, List<T> data) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.data = data;
        if(this.totalCount%this.pageSize==0){
            this.pageCount=this.totalCount/this.pageSize;
        }else{
            this.pageCount=this.totalCount/this.pageSize+1;
        }

        //初始值
        // 一共显示10个页面 动态伸缩
        if (this.pageCount <= 10) {
            this.numStart = 1;
            this.numEnd = pageCount;
        } else {
            this.numStart = pageIndex - 4;
            this.numEnd = pageIndex + 5;
            if (numStart < 1) {
                this.numStart = 1;
                this.numEnd = 10;
            } else if (numEnd > pageCount) {
                this.numEnd = pageCount;
                this.numStart = pageCount - 9;
            }
        }
        // 一共显示10个页面 动态伸缩


        for(int i=numStart;i<=numEnd;i++){
            numbers.add(i);
        }
    }
}
