package com.meituan.android.common.locate.loader;

import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.sniffer.util.GsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class LoadConfigImpl implements LoadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, String> a;

    public LoadConfigImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b265cdc331d1fb10a3f2ab4698df9cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b265cdc331d1fb10a3f2ab4698df9cc");
        } else {
            this.a = new HashMap();
        }
    }

    @Override // com.meituan.android.common.locate.LoadConfig
    public String get(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (String) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4ec420ff74c76eaea1cc5d0be49d4ec", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4ec420ff74c76eaea1cc5d0be49d4ec") : this.a.get(str));
    }

    public String getConfigJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15647fbd7c2c2bf923faf57aaeff8df2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15647fbd7c2c2bf923faf57aaeff8df2");
        }
        if (this.a == null) {
            return null;
        }
        try {
            return GsonUtil.getGson().toJson(this.a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.common.locate.LoadConfig
    public void set(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53ff8a17802bb4aa1f6ecb1000070557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53ff8a17802bb4aa1f6ecb1000070557");
        } else if (this.a == null) {
        } else {
            this.a.put(str, str2);
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd4152541956589134e1a21e0a4ce740", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd4152541956589134e1a21e0a4ce740");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" 超时时间=");
        sb.append(this.a.get(LoadConfig.LOCATION_TIMEOUT) == null ? "60s" : this.a.get(LoadConfig.LOCATION_TIMEOUT));
        sb.append(" 缓存有效期=");
        sb.append(this.a.get(LoadConfig.CACHE_VALIDITY_TIME) == null ? "30s" : this.a.get(LoadConfig.CACHE_VALIDITY_TIME));
        sb.append(" GPS最短回调时间=");
        sb.append(this.a.get(LoadConfig.GPS_MIN_TIME) == null ? "0s" : this.a.get(LoadConfig.GPS_MIN_TIME));
        sb.append(" GPS最短回调距离=");
        sb.append(this.a.get(LoadConfig.GPS_MIN_DISTANCE) == null ? "0" : this.a.get(LoadConfig.GPS_MIN_DISTANCE));
        sb.append(" 首次等待GPS时间=");
        sb.append(this.a.get(LoadConfig.GPS_FIX_FIRST_WAIT) == null ? "0" : this.a.get(LoadConfig.GPS_FIX_FIRST_WAIT));
        sb.append(" 定位回调时间间隔=");
        sb.append(this.a.get(LoadConfig.DELIVER_INTERVAL) == null ? "1s" : this.a.get(LoadConfig.DELIVER_INTERVAL));
        sb.append(" GPS定位=");
        sb.append(this.a.get(LoadConfig.IS_NEED_GPS) == null ? "1" : this.a.get(LoadConfig.IS_NEED_GPS));
        sb.append(" 后台定位=");
        sb.append(LocationUtils.c ? "1" : "0");
        return sb.toString();
    }
}
