package com.dianping.oppopush;

import android.content.Context;
import android.support.annotation.Nullable;
import com.dianping.base.push.pushservice.c;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.d;
import com.heytap.msp.push.HeytapPushManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements f.a {
    public static ChangeQuickRedirect a;
    private static boolean d;
    private static boolean e;
    private String b;
    private String c;

    @Override // com.dianping.base.push.pushservice.f.a
    public final int a() {
        return 8;
    }

    public b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287719e29bc5b61f7859de69a316b0f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287719e29bc5b61f7859de69a316b0f1");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25fb01bd47cb0e4b52446dd57cc89a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25fb01bd47cb0e4b52446dd57cc89a7");
            return;
        }
        if (f.b(context)) {
            n.a(context, 8);
        }
        d.b(context, OPPOPushService.class);
        if (d || !c(context)) {
            return;
        }
        try {
            HeytapPushManager.register(context.getApplicationContext(), this.b, this.c, new a(context));
            d = true;
        } catch (Exception e2) {
            a(GetUUID.REGISTER, e2);
        }
    }

    @Override // com.dianping.base.push.pushservice.f.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb0a0a54c3191551b5603f32ba502164", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb0a0a54c3191551b5603f32ba502164")).booleanValue() : c(context) && HeytapPushManager.isSupportPush();
    }

    private static synchronized boolean c(@Nullable Context context) {
        synchronized (b.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9111c31c8a9ea02961c0c6d6634628d0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9111c31c8a9ea02961c0c6d6634628d0")).booleanValue();
            } else if (e) {
                return true;
            } else {
                if (context != null) {
                    HeytapPushManager.init(context.getApplicationContext(), true);
                    e = true;
                } else if (f.b() != null) {
                    HeytapPushManager.init(f.b(), true);
                    e = true;
                }
                if (!e && f.e.a()) {
                    throw new IllegalStateException("oppo push init failed,check your init");
                }
                if (!e) {
                    a("oppopush has not inited");
                } else {
                    a("oppopush inited");
                }
                return e;
            }
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5332aa6945a95b3992d825345148ae73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5332aa6945a95b3992d825345148ae73");
        } else {
            c.b("OppoPush", str);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "437e5c2d63a178b10666ab4ac4ee0000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "437e5c2d63a178b10666ab4ac4ee0000");
        } else {
            c.a("OppoPush", str, th);
        }
    }
}
