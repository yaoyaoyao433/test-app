package com.meituan.metrics.util;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BasicTrafficUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long backgroundBytes;
    private CatchException exception;
    public long foregroundBytes;
    public long mobileBytes;
    public long rxBytes;
    public long total;
    public long txBytes;
    public long wifiBytes;

    public BasicTrafficUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f7391b698f3132af506a185515eab6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f7391b698f3132af506a185515eab6e");
            return;
        }
        this.exception = new CatchException("TrafficStatsInvalid", 1, 300000L);
        this.txBytes = 0L;
        this.rxBytes = 0L;
    }

    public BasicTrafficUnit(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edcaaa278a6b7241d38f7b4e5a2ab030", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edcaaa278a6b7241d38f7b4e5a2ab030");
            return;
        }
        this.exception = new CatchException("TrafficStatsInvalid", 1, 300000L);
        this.txBytes = j;
        this.rxBytes = j2;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62201283df8e35f407c6472a602089c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62201283df8e35f407c6472a602089c2");
        }
        return "tx: " + this.txBytes + " bytes, rx:" + this.rxBytes + " bytes";
    }

    public HashMap<String, Long> getDetails() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a59fdb662b60f91311740fa3b918dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a59fdb662b60f91311740fa3b918dc");
        }
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("total", Long.valueOf(this.txBytes + this.rxBytes));
        hashMap.put(Constants.TRAFFIC_DOWN, Long.valueOf(this.rxBytes));
        hashMap.put(Constants.TRAFFIC_UP, Long.valueOf(this.txBytes));
        hashMap.put(Constants.TRAFFIC_WIFI, Long.valueOf(this.wifiBytes));
        hashMap.put(Constants.TRAFFIC_MOBILE, Long.valueOf(this.mobileBytes));
        hashMap.put(Constants.TRAFFIC_FOREGROUND, Long.valueOf(this.foregroundBytes));
        hashMap.put(Constants.TRAFFIC_BACKGROUND, Long.valueOf(this.backgroundBytes));
        return hashMap;
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4288db9aacd293eee2dee01dc17242b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4288db9aacd293eee2dee01dc17242b0");
            return;
        }
        this.total = 0L;
        this.rxBytes = 0L;
        this.txBytes = 0L;
        this.wifiBytes = 0L;
        this.mobileBytes = 0L;
        this.backgroundBytes = 0L;
        this.foregroundBytes = 0L;
    }

    public boolean isValid() {
        return this.rxBytes >= 0 && this.txBytes >= 0;
    }

    public void notifyValidIfNeed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "612066c4ce3c4aa120d1b364dde32dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "612066c4ce3c4aa120d1b364dde32dcd");
        } else if (isValid()) {
        } else {
            this.exception.reportException(new Throwable(toString()));
        }
    }

    public void copyValueFrom(BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6da4c09e97f87e3b0fababc7cdb89b54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6da4c09e97f87e3b0fababc7cdb89b54");
            return;
        }
        this.total = basicTrafficUnit.total;
        this.rxBytes = basicTrafficUnit.rxBytes;
        this.txBytes = basicTrafficUnit.txBytes;
        this.mobileBytes = basicTrafficUnit.mobileBytes;
        this.wifiBytes = basicTrafficUnit.wifiBytes;
        this.foregroundBytes = basicTrafficUnit.foregroundBytes;
        this.backgroundBytes = basicTrafficUnit.backgroundBytes;
    }

    public static void initFromCIP(String str, @NonNull BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {str, basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2d8a340627ec9ffa3d27ad1d3027330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2d8a340627ec9ffa3d27ad1d3027330");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        if (context == null) {
            return;
        }
        q a = q.a(context, str, 1);
        basicTrafficUnit.rxBytes = a.b(Constants.KEY_RX, 0L);
        basicTrafficUnit.txBytes = a.b(Constants.KEY_TX, 0L);
        basicTrafficUnit.wifiBytes = a.b("wifi", 0L);
        basicTrafficUnit.mobileBytes = a.b("mobile", 0L);
        basicTrafficUnit.foregroundBytes = a.b("foreground", 0L);
        basicTrafficUnit.backgroundBytes = a.b("background", 0L);
        basicTrafficUnit.total = a.b("total", 0L);
    }

    public static void saveToCIP(String str, BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {str, basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da87b5481796271d36011ff4dc11007d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da87b5481796271d36011ff4dc11007d");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        if (context == null) {
            return;
        }
        q a = q.a(context, str, 1);
        a.a(Constants.KEY_RX, basicTrafficUnit.rxBytes);
        a.a(Constants.KEY_TX, basicTrafficUnit.txBytes);
        a.a("wifi", basicTrafficUnit.wifiBytes);
        a.a("mobile", basicTrafficUnit.mobileBytes);
        a.a("foreground", basicTrafficUnit.foregroundBytes);
        a.a("background", basicTrafficUnit.backgroundBytes);
        a.a("total", basicTrafficUnit.total);
    }
}
