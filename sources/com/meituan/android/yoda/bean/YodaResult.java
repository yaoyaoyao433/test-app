package com.meituan.android.yoda.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class YodaResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public Map<String, Object> data;
    @SerializedName("error")
    public Error error;
    @SerializedName("status")
    public int status;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "797c41fadabe14574ebb6b31df09e0d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "797c41fadabe14574ebb6b31df09e0d4");
        }
        return "YodaResult{status=" + this.status + ", data=" + this.data + ", error=" + this.error + '}';
    }
}
