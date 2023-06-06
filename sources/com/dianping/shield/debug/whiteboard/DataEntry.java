package com.dianping.shield.debug.whiteboard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DataEntry {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String key;
    private int originType;
    private String originValue;
    private int type;
    private String value;

    public DataEntry(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d5be424d4434e333f86c70af7d477f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d5be424d4434e333f86c70af7d477f8");
            return;
        }
        this.key = str;
        this.value = str2;
        this.originValue = str2;
        this.type = i;
        this.originType = i;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getOriginValue() {
        return this.originValue;
    }

    public int getOriginType() {
        return this.originType;
    }
}
