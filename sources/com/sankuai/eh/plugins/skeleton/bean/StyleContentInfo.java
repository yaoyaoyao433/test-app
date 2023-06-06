package com.sankuai.eh.plugins.skeleton.bean;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.opendevice.c;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StyleContentInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1247012112999230204L;
    @SerializedName(c.a)
    private String color;
    private int deColor;

    public int getDeColor() {
        return this.deColor;
    }

    public void setDeColor(int i) {
        this.deColor = i;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }
}
