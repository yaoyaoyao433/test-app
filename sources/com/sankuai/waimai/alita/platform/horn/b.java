package com.sankuai.waimai.alita.platform.horn;

import android.os.Build;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.e;
import com.sankuai.waimai.alita.platform.init.c;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private static a c;
    private static e d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd43324f685230bc874eb5ea1c6812a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd43324f685230bc874eb5ea1c6812a5");
            return;
        }
        d = new e("alita_glocal_config");
        c = new a(d);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab698b575cde69172870dae2fe722b2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab698b575cde69172870dae2fe722b2d");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    private static Map<String, Object> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80374c8652fae342bc7b8adabff3d4b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80374c8652fae342bc7b8adabff3d4b1");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uid", c.a().i());
        hashMap.put(GetAppInfoJsHandler.PACKAGE_TYPE_DEV, Integer.valueOf(c.c() ? 1 : 0));
        hashMap.put("osv", c.a().k());
        hashMap.put("avc", Integer.valueOf(c.a().b()));
        return hashMap;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74bb5436a93b737b62bc317ed2ba7f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74bb5436a93b737b62bc317ed2ba7f6");
            return;
        }
        Map<String, Object> d2 = d();
        try {
            d2.put("abi", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS[0] : Build.CPU_ABI);
        } catch (Exception e) {
            com.sankuai.waimai.alita.core.utils.c.a(e.getMessage());
        }
        if (c.c()) {
            boolean c2 = com.sankuai.waimai.alita.platform.debug.a.a().c();
            Horn.debug(com.meituan.android.singleton.b.a.getApplicationContext(), "waimai_alita_config_android", c2);
            StringBuilder sb = new StringBuilder("Alita Horn环境为");
            sb.append(c2 ? "Develop" : "Release");
            com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
        }
        Horn.register("waimai_alita_config_android", new HornCallback() { // from class: com.sankuai.waimai.alita.platform.horn.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bf055bc7ed12663f15c980e774bb011", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bf055bc7ed12663f15c980e774bb011");
                    return;
                }
                com.sankuai.waimai.alita.core.utils.c.a("Alita Horn返回数据为 " + str);
                AlitaHornResponse alitaHornResponse = (AlitaHornResponse) com.sankuai.waimai.alita.platform.utils.a.a().fromJson(str, (Class<Object>) AlitaHornResponse.class);
                if (alitaHornResponse == null) {
                    return;
                }
                b.c().a(alitaHornResponse.enableAlita);
                b.c().b(alitaHornResponse.enableModelPredict);
            }
        }, d2);
    }

    public static a c() {
        return c;
    }
}
