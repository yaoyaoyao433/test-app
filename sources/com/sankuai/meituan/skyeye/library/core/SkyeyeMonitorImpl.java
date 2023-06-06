package com.sankuai.meituan.skyeye.library.core;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class SkyeyeMonitorImpl implements ISkyeyeMonitor {
    public static ChangeQuickRedirect a;
    private a b;

    public static /* synthetic */ boolean a(SkyeyeMonitorImpl skyeyeMonitorImpl, String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, skyeyeMonitorImpl, changeQuickRedirect, false, "f8e4e607796276f85276c4190838625c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, skyeyeMonitorImpl, changeQuickRedirect, false, "f8e4e607796276f85276c4190838625c")).booleanValue() : d.a().a(str, str2, z);
    }

    public static /* synthetic */ boolean a(SkyeyeMonitorImpl skyeyeMonitorImpl, String str, String str2, boolean z, Map map) {
        boolean z2;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, skyeyeMonitorImpl, changeQuickRedirect, false, "f5e136a16d49ff2d11e272288ac6fccd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, skyeyeMonitorImpl, changeQuickRedirect, false, "f5e136a16d49ff2d11e272288ac6fccd")).booleanValue();
        }
        if (map != null) {
            if ((TextUtils.equals(str2, "data_convert") || TextUtils.equals(str2, "network_request")) && (map.get("requestUrl") instanceof String)) {
                String str3 = (String) map.get("requestUrl");
                if (!TextUtils.isEmpty(str3) && z) {
                    map.remove("requestUrl");
                }
                if (TextUtils.equals("com.meituan.passport.LoginActivity", str)) {
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, skyeyeMonitorImpl, changeQuickRedirect2, false, "aa275db98d2660b818afc3cb37b186c4", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, skyeyeMonitorImpl, changeQuickRedirect2, false, "aa275db98d2660b818afc3cb37b186c4")).booleanValue();
                    } else {
                        z2 = !TextUtils.isEmpty(str3) && (str3.contains("passport.meituan.com") || str3.contains("verify.meituan.com") || str3.contains("open.meituan.com"));
                    }
                    if (z2) {
                        return false;
                    }
                }
                d a2 = d.a();
                Object[] objArr3 = {str3};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "50319ffe1b87a96875926ac50f815560", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "50319ffe1b87a96875926ac50f815560")).booleanValue();
                }
                if (TextUtils.isEmpty(str3) || a2.b == null) {
                    return true;
                }
                return a2.b.b(str3);
            }
            return true;
        }
        return true;
    }

    public SkyeyeMonitorImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f53f88099c3c0ca991da5b272ae6ef4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f53f88099c3c0ca991da5b272ae6ef4");
        } else {
            this.b = new a(e.b());
        }
    }

    @Override // com.sankuai.meituan.skyeye.library.core.ISkyeyeMonitor
    public final void a(String str, String str2, String str3, Map map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5124d305e2c5940e44847dc232c13b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5124d305e2c5940e44847dc232c13b0");
        } else {
            a(a(str, str2, str3, null, map, true));
        }
    }

    @Override // com.sankuai.meituan.skyeye.library.core.ISkyeyeMonitor
    public final void a(String str, String str2, String str3, String str4, Map map) {
        Object[] objArr = {str, str2, str3, str4, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502b4a817986a184749042bc719fdbb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502b4a817986a184749042bc719fdbb1");
        } else {
            a(a(str, str2, str3, str4, map, false));
        }
    }

    @NonNull
    private Runnable a(final String str, final String str2, final String str3, final String str4, final Map map, final boolean z) {
        Object[] objArr = {str, str2, str3, str4, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d49d157152feedaf06ceb267f63165", RobustBitConfig.DEFAULT_VALUE)) {
            return (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d49d157152feedaf06ceb267f63165");
        }
        String str5 = "";
        if (map != null && map.size() > 0) {
            try {
                String str6 = (String) map.get("belong");
                try {
                    if (TextUtils.equals(str, "sdk_skyeye")) {
                        map.remove("belong");
                    }
                } catch (Exception unused) {
                }
                str5 = str6;
            } catch (Exception unused2) {
            }
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = e.e();
        }
        final String str7 = str5;
        return new Runnable() { // from class: com.sankuai.meituan.skyeye.library.core.SkyeyeMonitorImpl.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                String str8;
                Map hashMap;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff68da419eee3e7a6bb008c73d81d029", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff68da419eee3e7a6bb008c73d81d029");
                } else if (!TextUtils.equals("image_download", str2) && !TextUtils.equals("network_request", str2) && !TextUtils.equals("data_convert", str2) && !TextUtils.equals("protocol_jump", str2) && !SkyeyeMonitorImpl.a(SkyeyeMonitorImpl.this, "other_business", str7, z)) {
                    if (e.b) {
                        System.out.println(String.format("Bussiness-Monitor:Report-Block:[module:%s],[type:%s]", str2, str3));
                    }
                } else if (!SkyeyeMonitorImpl.a(SkyeyeMonitorImpl.this, str7, str2, z, map)) {
                    if (e.b) {
                        System.out.println(String.format("Bussiness-Monitor:Report-Block:[module:%s],[type:%s]", str2, str3));
                    }
                } else {
                    HashMap hashMap2 = new HashMap();
                    if (map != null && map.size() > 0) {
                        hashMap2.put("businessInfo", map);
                    }
                    hashMap2.put("reportType", str3);
                    if (SkyeyeMonitorImpl.this.b != null) {
                        a aVar = SkyeyeMonitorImpl.this.b;
                        String str9 = str7;
                        Object[] objArr3 = {str9};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "39644cdc1925cfc045b43c361bc890ec", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap = (Map) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "39644cdc1925cfc045b43c361bc890ec");
                        } else {
                            hashMap = new HashMap();
                            if (aVar.b != null) {
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("launchChannel", aVar.b.a());
                                hashMap3.put("carrierName", aVar.b.b());
                                hashMap3.put("pushAuthority", aVar.b.c());
                                hashMap3.put("loginType", aVar.b.d());
                                hashMap3.put("pushToken", aVar.b.e());
                                hashMap3.put("proxyStatus", Boolean.valueOf(aVar.b.f()));
                                hashMap.put("additionalInfo", hashMap3);
                            }
                            hashMap.put("belongPage", str9);
                        }
                        hashMap2.putAll(hashMap);
                    }
                    hashMap2.put("skyeyeVersion", "1.1.7");
                    try {
                        str8 = new Gson().toJson(hashMap2);
                    } catch (Exception unused3) {
                        str8 = null;
                    }
                    if (TextUtils.isEmpty(str8)) {
                        return;
                    }
                    String str10 = "skyeye_" + str2;
                    if (z) {
                        if (e.b) {
                            System.out.println(String.format("Bussiness-Monitor:Report-Pass:normal:[module:%s],[type:%s],[data:%s]", str2, str3, str8));
                        }
                        Sniffer.normal(str, str10, str3, str8);
                        return;
                    }
                    if (e.b) {
                        System.out.println(String.format("Bussiness-Monitor:Report-Pass:smell:[module:%s],[type:%s],[data:%s]", str2, str3, str8));
                    }
                    Sniffer.smell(str, str10, str3, str4, str8);
                }
            }
        };
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54164a02005f6b2e7ee345f0c419f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54164a02005f6b2e7ee345f0c419f00");
        } else {
            g.a().a(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static ChangeQuickRedirect a;
        c b;

        public a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc1d9c945c1074b523cb222dcf596f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc1d9c945c1074b523cb222dcf596f9");
            } else {
                this.b = cVar;
            }
        }
    }
}
