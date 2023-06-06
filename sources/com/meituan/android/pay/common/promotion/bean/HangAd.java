package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class HangAd implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6657629742790761247L;
    private int activeId;
    private String icon;
    private String label;
    @SerializedName("strategyName")
    private String strategyName;

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public int getActiveId() {
        return this.activeId;
    }

    public void setActiveId(int i) {
        this.activeId = i;
    }

    public String getStrategyName() {
        return this.strategyName;
    }

    public void setStrategyName(String str) {
        this.strategyName = str;
    }
}
