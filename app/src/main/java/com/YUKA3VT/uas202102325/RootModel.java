package com.YUKA3VT.uas202102325;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootModel {
    @SerializedName("list")
    private List<ListModel> listModelList;
    public RootModel() {
    }
    public List<ListModel> getListModelList() {
        return listModelList;
    }
    public void setListModelList(List<ListModel> listModelList) {
        this.listModelList = listModelList;
    }
}