package com.company.practice.WorceProjektowePractice;

import java.util.List;

public interface ChildrenRepository {
    void addChild(String name);
    List<String> getChildren();
    void sortChildren();
    void removeDuplicates();
    void setNamesToUpperCase();
    void setNamesToLowerCase();

}
