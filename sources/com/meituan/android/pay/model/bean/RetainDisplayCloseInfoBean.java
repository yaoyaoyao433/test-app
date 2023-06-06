package com.meituan.android.pay.model.bean;

import android.text.TextUtils;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class RetainDisplayCloseInfoBean implements Serializable {
    public static final String TYPE_STANDARDCASHIER = "standard-cashier";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6960409066516918138L;
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean jumpToStandardCashier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e9f622e402b6950adfaef601133005b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e9f622e402b6950adfaef601133005b")).booleanValue() : TextUtils.equals(TYPE_STANDARDCASHIER, this.type);
    }
}
