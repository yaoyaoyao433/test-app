package com.sankuai.waimai.guidepop.utils;

import com.dianping.monitor.impl.m;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static ExecutorService b = com.sankuai.android.jarvis.c.a("Guide-Pop-Log");

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7c6a06ff1e21f54e966cd98bb90c96e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7c6a06ff1e21f54e966cd98bb90c96e");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("Guide_pop", str, new Object[0]);
        final String str2 = "Guide_pop" + str;
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aec6eda6df562fc62a376896f512ab6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aec6eda6df562fc62a376896f512ab6f");
            return;
        }
        try {
            b.execute(new Runnable() { // from class: com.sankuai.waimai.guidepop.utils.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "28e99e1f4d092f450a793494a7179477", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "28e99e1f4d092f450a793494a7179477");
                        return;
                    }
                    try {
                        com.dianping.networklog.c.a(str2, 3);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "169c6d7af6ca37ef014d455472d34ce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "169c6d7af6ca37ef014d455472d34ce5");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("Guide_pop", str, new Object[0]);
        }
    }

    public static void a(String str, Float f, String str2, String str3) {
        Object[] objArr = {str, f, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202f0e20895f9d057a74822c9be135bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202f0e20895f9d057a74822c9be135bf");
            return;
        }
        m a2 = a();
        a2.a(str, Collections.singletonList(f));
        a2.a("location_area", str2);
        a2.a("location_flag", str3);
        a2.a("platform", "1");
        a2.a();
    }

    public static void a(String str, Float f, String str2) {
        Object[] objArr = {str, f, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57f4b9ce0bf5e27d9f75a1cf39867698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57f4b9ce0bf5e27d9f75a1cf39867698");
            return;
        }
        m a2 = a();
        a2.a(str, Collections.singletonList(f));
        a2.a(NetLogConstants.Details.ERROR_MSG, str2);
        a2.a("platform", "1");
        a2.a();
    }

    private static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "590f5a03f0fc82d891ed824cfba7995e", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "590f5a03f0fc82d891ed824cfba7995e") : new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c());
    }
}
