package com.sankuai.meituan.takeoutnew;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.sdk.app.PayTask;
import com.meituan.metrics.speedmeter.CustomProcessStartTimer;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.foundation.core.a;
import com.sankuai.waimai.foundation.location.e;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.router.interfaces.d;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.utils.l;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AppApplicationDelegate {
    public static ChangeQuickRedirect a;

    public static void a(AppApplication appApplication) {
        Object[] objArr = {appApplication};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28a5fcfced4b2af9f27125d361d04c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28a5fcfced4b2af9f27125d361d04c63");
            return;
        }
        j.a("Main+");
        m.a().a("Main+");
        com.meituan.android.singleton.b.a = appApplication;
        com.sankuai.meituan.serviceloader.b.a(appApplication.getApplicationContext());
    }

    public static void a(AppApplication appApplication, boolean z) {
        Object[] objArr = {appApplication, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "120259ce037a9026fc8c679a8e5853cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "120259ce037a9026fc8c679a8e5853cf");
            return;
        }
        com.sankuai.waimai.foundation.core.exception.a.a(a.f);
        com.sankuai.waimai.foundation.core.a.a(a.EnumC0945a.WM_APP);
        if (a.f) {
            com.sankuai.waimai.foundation.core.a.a(a.b.DEVELOP);
            d.a(d.b.DEVELOP);
        } else {
            com.sankuai.waimai.foundation.core.a.a(a.b.RELEASE);
            d.a(d.b.RELEASE);
        }
        appApplication.registerActivityLifecycleCallbacks(com.sankuai.waimai.foundation.core.lifecycle.b.a());
        if (z) {
            com.sankuai.meituan.takeoutnew.app.launcher.a.a(appApplication);
        }
        WelcomeActivity.c = TimeUtil.elapsedTimeMillis();
        m.a().a("Main-");
        j.a("Main-");
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8498dd74199da20eb4484c4006219a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8498dd74199da20eb4484c4006219a47");
            return;
        }
        if (TimeUtil.elapsedTimeMillis() - TimeUtil.processStartElapsedTimeMillis() > PayTask.j) {
            CustomProcessStartTimer.initProcessStartTime();
        }
        if (a.f) {
            com.sankuai.waimai.foundation.utils.log.a.a(true);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ed3f4417f8a7bbcc60376f253173f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ed3f4417f8a7bbcc60376f253173f4d");
            return;
        }
        AppApplication.b = false;
        com.sankuai.waimai.business.page.home.a.b = false;
        GlobalCartManager.getInstance().exit();
        g a2 = g.a();
        Object[] objArr2 = {"AppApplication"};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a710d465776d9f6e7440f8b9e0fc8a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a710d465776d9f6e7440f8b9e0fc8a68");
        } else {
            a2.b();
            a2.b.a();
            a2.d.b();
            com.sankuai.waimai.foundation.location.v2.b bVar = a2.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.location.v2.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "86e5ffd850eb901a50b5e5c04e2d3bd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "86e5ffd850eb901a50b5e5c04e2d3bd1");
            } else {
                bVar.b = -1L;
            }
            e.c().a("LocationManagerV3", "stopLocate", Pair.create("callTag", "AppApplication"));
        }
        com.sankuai.waimai.contextual.computing.storage.db.a a3 = com.sankuai.waimai.contextual.computing.storage.db.a.a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.contextual.computing.storage.db.a.a;
        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "3581c004c39081171554b02d3c35dffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "3581c004c39081171554b02d3c35dffb");
        } else {
            try {
                if (a3.b != null) {
                    a3.b.close();
                }
            } catch (Throwable th) {
                if (e.a()) {
                    throw th;
                }
                com.sankuai.waimai.foundation.utils.log.a.b(th);
            }
        }
        com.sankuai.waimai.alita.b.a();
        AppApplication.a(true);
        final Context context = com.meituan.android.singleton.b.a;
        Object[] objArr5 = {context};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.takeoutnew.app.a.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1108c966bec50580acfb293adface9a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1108c966bec50580acfb293adface9a7");
        } else if (context != null) {
            try {
                if (!com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "deleted_locate_log", false)) {
                    l.a(new l.a() { // from class: com.sankuai.meituan.takeoutnew.app.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.utils.l.a
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "515f6e787178402eecc222c695fedfbb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "515f6e787178402eecc222c695fedfbb");
                                return;
                            }
                            try {
                                String file = Environment.getExternalStorageDirectory().toString();
                                if (TextUtils.isEmpty(file)) {
                                    return;
                                }
                                File file2 = new File(file + File.separator + "locateLog.log");
                                if (file2.exists() && file2.delete()) {
                                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "deleted_locate_log", true);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }, (String) null);
                }
            } catch (Exception unused) {
            }
        }
        if (activity != null) {
            activity.finish();
        }
    }
}
