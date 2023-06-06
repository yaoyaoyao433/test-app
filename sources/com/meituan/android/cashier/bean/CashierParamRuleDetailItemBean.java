package com.meituan.android.cashier.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierParamRuleDetailItemBean implements Serializable {
    public static String TYPE_JSON_STRING = "jsonString";
    public static String TYPE_STRING = "string";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2995850630598845395L;
    private boolean abandon;
    private long maxSize;
    private String paramName;
    private String type;

    public String getParamName() {
        return this.paramName;
    }

    public void setParamName(String str) {
        this.paramName = str;
    }

    public long getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efcba8e853fa85f359680d51dc579da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efcba8e853fa85f359680d51dc579da9");
        } else {
            this.maxSize = j;
        }
    }

    public boolean isAbandon() {
        return this.abandon;
    }

    public void setAbandon(boolean z) {
        this.abandon = z;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
