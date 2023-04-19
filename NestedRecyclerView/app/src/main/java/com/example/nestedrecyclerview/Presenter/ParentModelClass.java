package com.example.nestedrecyclerview.Presenter;

import java.util.List;

public class ParentModelClass {

    public String title;
    public List<ChildModelClass> childModelClassList;
    public ParentModelClass(String title, List<ChildModelClass> childModelClassList) {
        this.title = title;
        this.childModelClassList = childModelClassList;
    }
}
