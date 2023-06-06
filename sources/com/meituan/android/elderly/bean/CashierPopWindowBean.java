package com.meituan.android.elderly.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierPopWindowBean implements Serializable {
    public static final int STOP_PAYMENT_GUIDE = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4421892210147535599L;
    @SerializedName("pop_detail_info")
    private PopDetailInfo popDetailInfo;
    @SerializedName("pop_scene")
    private String popScene;
    @SerializedName("type")
    private int type;

    public String getPopScene() {
        return this.popScene;
    }

    public void setPopScene(String str) {
        this.popScene = str;
    }

    public PopDetailInfo getPopDetailInfo() {
        return this.popDetailInfo;
    }

    public void setPopDetailInfo(PopDetailInfo popDetailInfo) {
        this.popDetailInfo = popDetailInfo;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
