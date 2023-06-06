package com.meituan.msc.modules.update.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CheckUpdateParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public String checkUpdateUrl;
    @Type
    private final int type;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface Type {
        public static final int CACHE = 2;
        public static final int CACHE_OR_NETWORK = 4;
        public static final int NETWORK = 1;
        public static final int NETWORK_OR_CACHE = 3;
    }

    public CheckUpdateParams(String str, @Type int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de044b106039260b431c788fb18bbb11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de044b106039260b431c788fb18bbb11");
            return;
        }
        this.appId = str;
        this.type = i;
    }

    @Type
    public int getType() {
        return this.type;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c968e3534f1fe07da2429393b6c14482", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c968e3534f1fe07da2429393b6c14482");
        }
        return "CheckUpdateParams{appId='" + this.appId + "', checkUpdateUrl='" + this.checkUpdateUrl + "', type=" + this.type + '}';
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19213f6d2d108c70c7a4b6a4a2042bb4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19213f6d2d108c70c7a4b6a4a2042bb4")).intValue() : Objects.hash(this.appId, this.checkUpdateUrl, Integer.valueOf(this.type));
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2443bce75d0a5bff3f4fcebd2e92b964", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2443bce75d0a5bff3f4fcebd2e92b964")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckUpdateParams checkUpdateParams = (CheckUpdateParams) obj;
        return this.type == checkUpdateParams.type && Objects.equals(this.appId, checkUpdateParams.appId) && Objects.equals(this.checkUpdateUrl, checkUpdateParams.checkUpdateUrl);
    }
}
