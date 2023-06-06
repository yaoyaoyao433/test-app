package com.meituan.android.common.locate.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.DOPInfoRequester;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DOPInfoRequester a;
    private Context b;
    private u c;
    private OnNmeaMessageListener d;
    private GpsStatus.NmeaListener e;

    public f(DOPInfoRequester dOPInfoRequester) {
        Object[] objArr = {dOPInfoRequester};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "813734b81c59bf0380312d70f0c8084e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "813734b81c59bf0380312d70f0c8084e");
            return;
        }
        this.b = g.a();
        this.a = dOPInfoRequester;
        this.c = Privacy.createLocationManager(this.b, "pt-c140c5921e4d3392");
    }

    private double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40e1b6f5de7c1ec9542525ad0e2f1e07", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40e1b6f5de7c1ec9542525ad0e2f1e07")).doubleValue();
        }
        if (d > 99.9d) {
            return 99.9d;
        }
        if (d < 0.5d) {
            return 0.5d;
        }
        return d;
    }

    private double a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4de842b9d12f9b018ef171350b26263", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4de842b9d12f9b018ef171350b26263")).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            LogUtils.a("str after trim is empty");
            return 0.0d;
        }
        String[] split = trim.split("\\*");
        if (split.length > 1) {
            try {
                r2 = split[0].length() != 0 ? 1.0d * Double.parseDouble(split[0]) : 1.0d;
                r2 *= Integer.parseInt(split[1], 16);
            } catch (Throwable th) {
                LogUtils.a(th);
            }
            return a(r2);
        }
        return a(Double.parseDouble(trim));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DOPInfoRequester.DOPInfo a(long j, String str) {
        double d;
        double d2;
        double d3;
        double d4;
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c478a28e14c7ad02fd56f17d21309b35", RobustBitConfig.DEFAULT_VALUE)) {
            return (DOPInfoRequester.DOPInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c478a28e14c7ad02fd56f17d21309b35");
        }
        if (str == null || str.isEmpty()) {
            d = -1000000.0d;
            d2 = -1000000.0d;
            d3 = -1000000.0d;
        } else {
            if (str.contains("GGA")) {
                String[] split = str.split(CommonConstant.Symbol.COMMA);
                if (split.length < 9) {
                    return null;
                }
                d4 = a(split[8]) * 1000000.0d;
            } else {
                d4 = -1000000.0d;
            }
            if (str.contains("GSA")) {
                String[] split2 = str.split(CommonConstant.Symbol.COMMA);
                if (split2.length < 17) {
                    return null;
                }
                d3 = a(split2[17]) * 1000000.0d;
                d2 = a(split2[16]) * 1000000.0d;
                d = 1000000.0d * a(split2[15]);
            } else {
                d3 = -1000000.0d;
                d2 = d4;
                d = -1000000.0d;
            }
        }
        return new DOPInfoRequester.DOPInfo(d, d2, d3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DOPInfoRequester.DOPInfo dOPInfo) {
        Object[] objArr = {dOPInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cbd616f093c9d6cb365c2fde1b41d39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cbd616f093c9d6cb365c2fde1b41d39");
        } else if (this.a == null || dOPInfo == null) {
        } else {
            this.a.a(dOPInfo);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38edaa47b2676110b8b841f656433f5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38edaa47b2676110b8b841f656433f5c");
            return;
        }
        try {
            com.meituan.android.common.locate.platform.sniffer.report.a.a().b();
            if (Build.VERSION.SDK_INT >= 24) {
                this.d = new OnNmeaMessageListener() { // from class: com.meituan.android.common.locate.provider.f.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.location.OnNmeaMessageListener
                    public void onNmeaMessage(String str, long j) {
                        Object[] objArr2 = {str, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9ae43844597c47e839cd4fe101c1aee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9ae43844597c47e839cd4fe101c1aee");
                            return;
                        }
                        com.meituan.android.common.locate.platform.sniffer.report.a.a().b++;
                        com.meituan.android.common.locate.api.a.a("onNmeaMessage_sdk", 1);
                        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "onNmeaMessage"));
                        f.this.a(f.this.a(j, str));
                    }
                };
                this.c.a(this.d);
                com.meituan.android.common.locate.platform.sniffer.report.a.a().a++;
                return;
            }
            this.e = new GpsStatus.NmeaListener() { // from class: com.meituan.android.common.locate.provider.f.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.location.GpsStatus.NmeaListener
                public void onNmeaReceived(long j, String str) {
                    Object[] objArr2 = {new Long(j), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa0e38fb8447b8edeb9a5f450e52b045", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa0e38fb8447b8edeb9a5f450e52b045");
                        return;
                    }
                    com.meituan.android.common.locate.platform.sniffer.report.a.a().b++;
                    com.meituan.android.common.locate.api.a.a("onNmeaReceived_sdk", 1);
                    com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "onNmeaMessage"));
                    f.this.a(f.this.a(j, str));
                }
            };
            try {
                LocationManager.class.getMethod("addNmeaListener", GpsStatus.NmeaListener.class).invoke(this.c, this.e);
                com.meituan.android.common.locate.platform.sniffer.report.a.a().a++;
            } catch (Exception e) {
                LogUtils.a(e);
            }
        } catch (SecurityException e2) {
            LogUtils.a(e2);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "452958fe2f4a109ca5667aa02aec3ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "452958fe2f4a109ca5667aa02aec3ada");
            return;
        }
        try {
            com.meituan.android.common.locate.platform.sniffer.report.a.a().c();
            if (Build.VERSION.SDK_INT >= 24) {
                if (this.d == null || this.c == null) {
                    return;
                }
                this.c.b(this.d);
            } else if (this.e == null || this.c == null) {
            } else {
                LocationManager.class.getMethod("removeNmeaListener", GpsStatus.NmeaListener.class).invoke(this.c, this.e);
            }
        } catch (SecurityException e) {
            LogUtils.a(e);
        }
    }
}
