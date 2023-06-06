package com.dianping.titans.ble;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScanParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("serviceId")
    @Expose
    private String serviceId;
    @SerializedName("timeout")
    @Expose
    private int timeout;

    public ScanParam(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e81f41220ee461750aa6eab82aa058f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e81f41220ee461750aa6eab82aa058f4");
            return;
        }
        this.serviceId = str;
        this.timeout = i;
    }

    public boolean isInValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9545aca56e714c94138080ca2394d891", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9545aca56e714c94138080ca2394d891")).booleanValue() : !TextUtils.isEmpty(this.serviceId);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "137f1147c6ec19c496e39787d70b9f82", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "137f1147c6ec19c496e39787d70b9f82")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.serviceId, ((ScanParam) obj).serviceId);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e70b1b6361f682aebc606e18fbb5b373", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e70b1b6361f682aebc606e18fbb5b373")).intValue() : Objects.hash(this.serviceId);
    }

    public int getTimeout() {
        if (this.timeout <= 0) {
            this.timeout = 5000;
        }
        return this.timeout;
    }
}
