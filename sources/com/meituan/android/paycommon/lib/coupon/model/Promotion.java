package com.meituan.android.paycommon.lib.coupon.model;

import com.meituan.android.paybase.moduleinterface.picasso.coupondialog.DynamicLayout;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Promotion implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1070983060676669871L;
    private DynamicLayout dynamicLayout;
    private String halfPageUrl;
    private double hybridLoadingTime;
    private String hybridUrl;
    private int windowTimeout;

    public DynamicLayout getDynamicLayout() {
        return this.dynamicLayout;
    }

    public void setDynamicLayout(DynamicLayout dynamicLayout) {
        this.dynamicLayout = dynamicLayout;
    }

    public int getWindowTimeout() {
        return this.windowTimeout;
    }

    public void setWindowTimeout(int i) {
        this.windowTimeout = i;
    }

    public double getHybridLoadingTime() {
        return this.hybridLoadingTime;
    }

    public void setHybridLoadingTime(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "111c6b7d97d0a72948aa3b3d4be07895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "111c6b7d97d0a72948aa3b3d4be07895");
        } else {
            this.hybridLoadingTime = d;
        }
    }

    public String getHybridUrl() {
        return this.hybridUrl;
    }

    public void setHybridUrl(String str) {
        this.hybridUrl = str;
    }

    public String getHalfPageUrl() {
        return this.halfPageUrl;
    }

    public void setHalfPageUrl(String str) {
        this.halfPageUrl = str;
    }
}
