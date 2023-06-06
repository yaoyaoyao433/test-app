package com.sankuai.waimai.business.page.home.list.future.complex;

import android.content.Context;
import android.view.Choreographer;
import android.view.WindowManager;
import com.dianping.monitor.impl.l;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String b = "c";
    private static float c;
    private static int d;
    private static boolean e;
    private static int f;
    private static long g;
    private static final Choreographer.FrameCallback h = new Choreographer.FrameCallback() { // from class: com.sankuai.waimai.business.page.home.list.future.complex.c.1
        public static ChangeQuickRedirect a;

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366e8f2c9ccec600c33e98652b4ef489", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366e8f2c9ccec600c33e98652b4ef489");
                return;
            }
            if (c.g != 0 && ((int) (((float) ((j - c.g) / 1000000)) / c.c)) >= 3) {
                c.a(true);
                c.c();
            }
            long unused = c.g = j;
            Choreographer.getInstance().postFrameCallback(c.h);
        }
    };

    public static /* synthetic */ boolean a(boolean z) {
        e = true;
        return true;
    }

    public static /* synthetic */ int c() {
        int i = f;
        f = i + 1;
        return i;
    }

    private static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df4a153023aaa3f9bdb5c08a488dc693", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df4a153023aaa3f9bdb5c08a488dc693")).intValue() : (int) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d6638f5539aa34773f95b0c50a655e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d6638f5539aa34773f95b0c50a655e3");
        } else if (context == null) {
        } else {
            if (i == 0) {
                if (d != 0) {
                    Object[] objArr2 = {context};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "687a3c89d6ea27e7d7a4a3cd0b504dfa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "687a3c89d6ea27e7d7a4a3cd0b504dfa");
                    } else {
                        int i2 = f;
                        Object[] objArr3 = {context, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a09d662ef91b45b285a9f56b6e9a8ae1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a09d662ef91b45b285a9f56b6e9a8ae1");
                        } else {
                            new StringBuilder("jank number: ").append(i2);
                            l a2 = new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("waimai_home_scroll_jank", Collections.singletonList(Float.valueOf(i2))).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, b(com.meituan.android.singleton.b.a));
                            StringBuilder sb = new StringBuilder();
                            sb.append(a(context));
                            a2.a("refresh_rate", sb.toString()).a();
                        }
                        boolean z = e;
                        Object[] objArr4 = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0bd44836b48185334c436f61f73881aa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0bd44836b48185334c436f61f73881aa");
                        } else {
                            new StringBuilder("hasJank: ").append(z);
                            l a3 = new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("waimai_home_scroll_jank_rate", Collections.singletonList(Float.valueOf(z ? 1.0f : 0.0f))).a("platform", "android").a("env", com.sankuai.waimai.foundation.core.a.b() ? "test" : "prod").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, b(com.meituan.android.singleton.b.a));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(a(context));
                            a3.a("refresh_rate", sb2.toString()).a();
                        }
                        Choreographer.getInstance().removeFrameCallback(h);
                    }
                }
            } else if (d == 0) {
                Object[] objArr5 = {context};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ad48e5e4675648410ef336092da22b02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ad48e5e4675648410ef336092da22b02");
                } else {
                    e = false;
                    f = 0;
                    g = 0L;
                    c = 1000.0f / a(context);
                    Choreographer.getInstance().postFrameCallback(h);
                }
            }
            d = i;
        }
    }

    private static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb034c101bcd5d3c9232f4403abab297", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb034c101bcd5d3c9232f4403abab297");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }
}
