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
public class AdvertisingInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    @Expose
    private final String data;
    @SerializedName("serviceId")
    @Expose
    private final String serviceId;
    @SerializedName("timeout")
    @Expose
    private int timeout;

    public AdvertisingInfo(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "182b3fa9c217edaeb46fe112bae43793", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "182b3fa9c217edaeb46fe112bae43793");
            return;
        }
        this.data = str;
        this.serviceId = str2;
        this.timeout = i;
    }

    public boolean isValid(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89b3f5568fd1156598e90c18e96a5db3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89b3f5568fd1156598e90c18e96a5db3")).booleanValue();
        }
        if (TextUtils.isEmpty(this.serviceId)) {
            return false;
        }
        return !z || (!TextUtils.isEmpty(this.data) && this.data.matches("[0-9a-f]{1,38}"));
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5cdda4ae299198c87072dcd06b42804", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5cdda4ae299198c87072dcd06b42804")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.serviceId, ((AdvertisingInfo) obj).serviceId);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fea2b354b92bbe752adb3b9a73805483", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fea2b354b92bbe752adb3b9a73805483")).intValue() : Objects.hash(this.serviceId);
    }

    public String getData() {
        return this.data;
    }

    public int getTimeout() {
        if (this.timeout > 180000) {
            this.timeout = TitansBleManager.MAX_ADVERTISING_TIMEOUT;
        }
        if (this.timeout <= 0) {
            this.timeout = 60000;
        }
        return this.timeout;
    }
}
