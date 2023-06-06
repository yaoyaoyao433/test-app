package com.meituan.robust.resource.diff.data;

import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseDiffData {
    public Set<DataUnit> addSet = new HashSet();
    public Set<DataUnit> modSet = new HashSet();
    public Set<DataUnit> delSet = new HashSet();
    public Set<DataUnit> diffModSet = new HashSet();
    public String diffTypeName = PackageInfoWrapper.PACKAGE_TYPE_STR_BASE;

    public void clear() {
        this.addSet.clear();
        this.modSet.clear();
        this.delSet.clear();
        this.diffModSet.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiffTypeName :" + this.diffTypeName);
        return sb.toString();
    }

    public boolean isEmpty() {
        return this.addSet.isEmpty() && this.modSet.isEmpty() && this.delSet.isEmpty() && this.diffModSet.isEmpty();
    }
}
