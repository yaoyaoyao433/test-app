package com.sankuai.meituan.takeoutnew;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.multidex.MultiDexApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.handler.c;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AppApplication extends MultiDexApplication implements ComponentCallbacks2, com.sankuai.meituan.takeoutnew.handler.b, c.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.takeoutnew.handler.b c;
    private static AtomicBoolean d = new AtomicBoolean(false);
    public static boolean b = false;

    public AppApplication() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033b1394bcc9afcb36bf06272ad4bd0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033b1394bcc9afcb36bf06272ad4bd0b");
        } else {
            this.c = new com.sankuai.meituan.takeoutnew.handler.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.takeoutnew.AppApplication.a
            java.lang.String r10 = "db22a1f8b204500661d3dea8f43648fb"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            return
        L18:
            boolean r1 = com.sankuai.meituan.takeoutnew.a.f
            if (r1 == 0) goto L1f
            com.sankuai.meituan.takeoutnew.app.init.a.a(r12)
        L1f:
            boolean r1 = com.sankuai.waimai.launcher.init.core.b.a(r12)
            r2 = 1
            if (r1 == 0) goto L56
            com.sankuai.meituan.arbiter.hook.ArbiterHook.injectInstrumentationHook(r12)     // Catch: java.lang.Exception -> L4f
            com.sankuai.meituan.takeoutnew.c r1 = new com.sankuai.meituan.takeoutnew.c     // Catch: java.lang.Exception -> L4f
            r1.<init>()     // Catch: java.lang.Exception -> L4f
            com.sankuai.meituan.arbiter.hook.ArbiterHook.addMTInstrumentation(r1)     // Catch: java.lang.Exception -> L4f
            com.sankuai.meituan.takeoutnew.handler.c.a(r12, r12)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = "agreement_affirmed"
            boolean r1 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(r12, r1, r0)     // Catch: java.lang.Exception -> L4f
            if (r1 != 0) goto L56
            com.sankuai.meituan.takeoutnew.b r1 = new com.sankuai.meituan.takeoutnew.b     // Catch: java.lang.Exception -> L4f
            r1.<init>()     // Catch: java.lang.Exception -> L4f
            com.sankuai.meituan.arbiter.hook.ArbiterHook.addMTInstrumentation(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = "request_user_licence"
            com.sankuai.waimai.business.page.home.utils.j.cancel(r1)     // Catch: java.lang.Exception -> L4c
            r1 = 1
            goto L57
        L4c:
            r1 = move-exception
            r3 = 1
            goto L51
        L4f:
            r1 = move-exception
            r3 = 0
        L51:
            r1.printStackTrace()
            r1 = r3
            goto L57
        L56:
            r1 = 0
        L57:
            com.sankuai.meituan.takeoutnew.AppApplicationDelegate.a(r12)
            super.onCreate()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r0] = r12
            com.meituan.robust.ChangeQuickRedirect r0 = com.sankuai.waimai.launcher.init.core.b.a
            java.lang.String r11 = "029f1a163d819f5c037b78991514e1cd"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r5 = r0
            r7 = r11
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L77
            r3 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r3, r0, r2, r11)
            goto Lbf
        L77:
            boolean r0 = com.sankuai.waimai.launcher.init.core.b.a(r12)     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto L7e
            goto Lbf
        L7e:
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            java.lang.String r3 = "mQueue"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> Lbb
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lbb
            android.os.Looper r3 = r12.getMainLooper()     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<android.os.MessageQueue> r3 = android.os.MessageQueue.class
            java.lang.String r4 = "mMessages"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lbb
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<android.os.Message> r3 = android.os.Message.class
            java.lang.String r4 = "obj"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lbb
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lbb
            com.sankuai.waimai.launcher.init.core.b.b = r0     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r0 = move-exception
            com.sankuai.waimai.foundation.utils.log.a.a(r0)
        Lbf:
            r0 = r1 ^ 1
            com.sankuai.meituan.takeoutnew.AppApplicationDelegate.a(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.AppApplication.onCreate():void");
    }

    @Override // com.sankuai.meituan.takeoutnew.handler.b
    public final boolean a(Handler handler, Handler.Callback callback, Message message) {
        Object[] objArr = {handler, callback, message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa52ac4110941113c2905d0d1933496", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa52ac4110941113c2905d0d1933496")).booleanValue();
        }
        if (this.c != null) {
            return this.c.a(handler, callback, message);
        }
        return false;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31d7057eba1a4037f68d728a2aab07b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31d7057eba1a4037f68d728a2aab07b0");
        } else {
            AppApplicationDelegate.a(activity);
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f23a81fae9c7a5f697653da126002604", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f23a81fae9c7a5f697653da126002604")).booleanValue() : d.get();
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "322e1bdc963e59243e714e35474d80a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "322e1bdc963e59243e714e35474d80a8");
        } else {
            d.set(z);
        }
    }

    @Override // android.support.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20988be5fbb3ea6d2310bc359bdc0aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20988be5fbb3ea6d2310bc359bdc0aa");
            return;
        }
        com.meituan.android.singleton.b.a = this;
        super.attachBaseContext(context);
        AppApplicationDelegate.a();
    }
}
