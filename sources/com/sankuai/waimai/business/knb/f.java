package com.sankuai.waimai.business.knb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.android.preload.a;
import com.meituan.android.preload.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"LogUsage"})
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static boolean c = false;

    public static /* synthetic */ boolean b(boolean z) {
        b = true;
        return true;
    }

    public static void a() {
        com.meituan.android.preload.config.g gVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b0be652ac744295c9f6af334c7d58ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b0be652ac744295c9f6af334c7d58ae");
            return;
        }
        com.meituan.android.preload.c.a(com.sankuai.waimai.kit.a.a().b());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "78173f92b15fff322d9ac4fd60e497a0", RobustBitConfig.DEFAULT_VALUE)) {
            gVar = (com.meituan.android.preload.config.g) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "78173f92b15fff322d9ac4fd60e497a0");
        } else {
            String e = com.sankuai.waimai.platform.net.c.a().e();
            if (com.sankuai.waimai.kit.a.a().b()) {
                if (e.equals("http://api.c.waimai.dev.sankuai.com") || e.equals("http://api.c.waimai.test.sankuai.com") || e.equals("http://api.c.waimai.beta.sankuai.com")) {
                    gVar = com.meituan.android.preload.config.g.TEST;
                } else if (e.equals("http://releaseapi.waimai.st.sankuai.com") || e.equals(com.sankuai.waimai.platform.net.c.g)) {
                    gVar = com.meituan.android.preload.config.g.STAGE;
                }
            }
            gVar = com.meituan.android.preload.config.g.PROD;
        }
        com.meituan.android.preload.c.a(gVar);
        com.meituan.android.preload.c.a(new com.meituan.android.preload.config.c() { // from class: com.sankuai.waimai.business.knb.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.preload.config.c
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bbffa38268ad366312c9fd0085375bd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bbffa38268ad366312c9fd0085375bd4");
                } else if (f.b) {
                } else {
                    f.b(true);
                    f.e();
                }
            }
        });
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89e99e374bb039a99b8f5bb5fe4289c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89e99e374bb039a99b8f5bb5fe4289c2");
        } else if (c) {
        } else {
            c = true;
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b034e455e328578a6bc0a547539da4f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b034e455e328578a6bc0a547539da4f7");
        } else if (c && b) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.knb.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35a4991a296d7174ddb5b72f7720d0cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35a4991a296d7174ddb5b72f7720d0cd");
                        return;
                    }
                    com.meituan.android.preload.c.a(com.meituan.android.singleton.b.a, "waimaiapp", 1, (a.C0348a) null, new a());
                }
            });
        }
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97161bee4f36bf0d1091beba04d42255", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97161bee4f36bf0d1091beba04d42255")).booleanValue() : com.meituan.android.preload.c.a(context, "waimaiapp", str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements c.a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.preload.c.a
        public final BaseTitleBar a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709d92358b43d3b71bcd91ba5aa33bdd", RobustBitConfig.DEFAULT_VALUE) ? (BaseTitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709d92358b43d3b71bcd91ba5aa33bdd") : new g(context);
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4265511210bc37a7f2638dc84364ce90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4265511210bc37a7f2638dc84364ce90");
            return;
        }
        boolean a2 = com.meituan.android.preload.c.a(com.meituan.android.singleton.b.a, "waimaiapp");
        com.sankuai.waimai.foundation.utils.log.a.b("PreloadWebViewHelper", "report bizSupport: " + a2 + ", goPreload:" + z, new Object[0]);
        if (a2) {
            int i = z ? 1000 : 1001;
            com.sankuai.waimai.foundation.utils.log.a.b("PreloadWebViewHelper", "report: " + i, new Object[0]);
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, "waimaiapp/preload/hit", SystemClock.elapsedRealtime());
        }
    }
}
