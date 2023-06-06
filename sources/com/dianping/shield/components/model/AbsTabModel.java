package com.dianping.shield.components.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AbsTabModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> agentKeys;
    public String key;
    public ArrayList<String> releatedKeys;

    public AbsTabModel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "664c5c74bb85f546893c8a6385e62b3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "664c5c74bb85f546893c8a6385e62b3e");
            return;
        }
        this.key = str;
        this.agentKeys = new ArrayList<>();
        this.releatedKeys = new ArrayList<>();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57f77fadb8df974cf87b1e854a53fb7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57f77fadb8df974cf87b1e854a53fb7b")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbsTabModel absTabModel = (AbsTabModel) obj;
        if (this.key == null ? absTabModel.key == null : this.key.equals(absTabModel.key)) {
            if (this.agentKeys == null ? absTabModel.agentKeys == null : this.agentKeys.equals(absTabModel.agentKeys)) {
                return this.releatedKeys != null ? this.releatedKeys.equals(absTabModel.releatedKeys) : absTabModel.releatedKeys == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ce2412ee00b3efb511e9ce64943bad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ce2412ee00b3efb511e9ce64943bad")).intValue();
        }
        return ((((this.key != null ? this.key.hashCode() : 0) * 31) + (this.agentKeys != null ? this.agentKeys.hashCode() : 0)) * 31) + (this.releatedKeys != null ? this.releatedKeys.hashCode() : 0);
    }
}
