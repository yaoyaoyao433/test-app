package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.KNBWebViewActivity;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.launcher.model.AppInfo;
import com.sankuai.waimai.platform.utils.lifecycle.c;
import com.sankuai.waimai.platform.utils.o;
import com.sankuai.waimai.reactnative.WmRNActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Lifecycle implements Application.ActivityLifecycleCallbacks, com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"lifecycle"};

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "AppInfoLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        long j;
        long j2;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d24a36aabe060401c6deadf000414ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d24a36aabe060401c6deadf000414ff");
            return;
        }
        StringBuilder sb = new StringBuilder("App#Foreground ");
        sb.append(activity == null ? "" : activity.getClass().getName());
        a(sb.toString());
        com.sankuai.waimai.platform.b.A().C();
        com.sankuai.waimai.globalcart.a a2 = com.sankuai.waimai.globalcart.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.globalcart.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "40f9521efaf3d4847a6981d53da98dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "40f9521efaf3d4847a6981d53da98dc9");
        } else {
            a2.b = true;
            if (a2.d != null && a2.e != null) {
                try {
                    a2.d.unregisterReceiver(a2.k);
                } catch (Exception unused) {
                }
                try {
                    a2.d.registerReceiver(a2.k, new IntentFilter("com.sankuai.waimai.business.restaurant.poiid.refresh"));
                } catch (Exception unused2) {
                }
                if (a2.c) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.globalcart.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d9542473c6c4e4963c8a326b6b4af544", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d9542473c6c4e4963c8a326b6b4af544");
                    } else {
                        a2.b(System.currentTimeMillis());
                        long currentTimeMillis = System.currentTimeMillis();
                        int parseInt = Integer.parseInt(a2.g.format(Long.valueOf(currentTimeMillis)));
                        try {
                            j2 = a2.g.parse(String.valueOf((parseInt - (parseInt % 100)) + a2.i)).getTime() + a2.j;
                        } catch (Exception unused3) {
                            j2 = currentTimeMillis;
                        }
                        a2.a(currentTimeMillis < j2 ? j2 - currentTimeMillis : (j2 + 86400000) - currentTimeMillis);
                    }
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.globalcart.a.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "4039a4a9cc99a372b77ad221d3b2a550", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "4039a4a9cc99a372b77ad221d3b2a550");
                    } else {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        int parseInt2 = Integer.parseInt(a2.g.format(Long.valueOf(currentTimeMillis2)));
                        try {
                            j = a2.g.parse(String.valueOf((parseInt2 - (parseInt2 % 100)) + a2.i)).getTime() + a2.j;
                        } catch (Exception unused4) {
                            j = currentTimeMillis2;
                        }
                        long j3 = j - 86400000;
                        if (currentTimeMillis2 < a2.h || a2.h < j3 || (a2.h < j && currentTimeMillis2 >= j)) {
                            com.sankuai.waimai.globalcart.biz.a.a().a(1);
                        }
                        a2.a(currentTimeMillis2 < j ? j - currentTimeMillis2 : (j + 86400000) - currentTimeMillis2);
                    }
                }
                a2.c = false;
            }
        }
        com.sankuai.waimai.imbase.b.d().a();
        com.sankuai.waimai.mach.lifecycle.e.a().b();
        com.sankuai.waimai.platform.net.e.c();
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ae4a51f995d8725265800c673e31a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ae4a51f995d8725265800c673e31a8");
            return;
        }
        StringBuilder sb = new StringBuilder("App#Background ");
        sb.append(activity == null ? "" : activity.getClass().getName());
        a(sb.toString());
        com.sankuai.waimai.platform.b A = com.sankuai.waimai.platform.b.A();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.b.i;
        if (PatchProxy.isSupport(objArr2, A, changeQuickRedirect2, false, "23b0c0192fb3c40f3e506e245486731c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, A, changeQuickRedirect2, false, "23b0c0192fb3c40f3e506e245486731c");
        } else {
            A.j = false;
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "visit_id_generated_time", System.currentTimeMillis());
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "visit_id", A.f());
        }
        com.sankuai.waimai.globalcart.a a2 = com.sankuai.waimai.globalcart.a.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.globalcart.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "5734b17ec19818aedf1ff653bf68471f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "5734b17ec19818aedf1ff653bf68471f");
        } else {
            a2.b = false;
            a2.c = false;
            if (a2.d != null && a2.e != null) {
                try {
                    PendingIntent broadcast = PendingIntent.getBroadcast(a2.d, 0, a2.f, 536870912);
                    if (broadcast != null) {
                        a2.e.cancel(broadcast);
                    }
                } catch (Exception unused) {
                }
                try {
                    a2.d.unregisterReceiver(a2.k);
                } catch (Exception unused2) {
                }
            }
        }
        com.sankuai.waimai.mach.lifecycle.e.a().c();
    }

    private static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb358420512c13a23a5d7edfca797ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb358420512c13a23a5d7edfca797ae9");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(o.a(), new Runnable() { // from class: com.sankuai.waimai.launcher.init.lifecycle.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2af40f98d1fb674ac132aa73e94d1c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2af40f98d1fb674ac132aa73e94d1c5");
                    } else {
                        com.dianping.networklog.c.a(str, 3, a.b);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent;
        Uri data;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9330bcd39ed7800bcd6f1bf6675db938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9330bcd39ed7800bcd6f1bf6675db938");
            return;
        }
        com.sankuai.waimai.platform.utils.lifecycle.c a2 = com.sankuai.waimai.platform.utils.lifecycle.c.a();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.utils.lifecycle.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "eeef805daa3e078909ee96b615ba4f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "eeef805daa3e078909ee96b615ba4f42");
        } else if (activity != null && activity.getIntent() != null && !(activity instanceof TransferActivity) && (data = (intent = activity.getIntent()).getData()) != null && data.isHierarchical()) {
            c.b bVar = a2.c.get(data.getPath());
            if (bVar != null) {
                long a3 = com.sankuai.waimai.platform.utils.f.a(intent, "_wm_router_start_", -1L);
                Object[] objArr3 = {new Long(a3)};
                ChangeQuickRedirect changeQuickRedirect3 = c.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7792db50109cf8946ef1a3e6a31a47d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7792db50109cf8946ef1a3e6a31a47d7");
                } else if (a3 != bVar.b) {
                    bVar.c.disable();
                } else {
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(bVar.c.recordStep("create"));
                }
            }
            if (a2.c.size() > 2) {
                a2.c.clear();
            }
        }
        AppInfo.onActivityCreate(activity.getClass());
        a("Activity#Created " + activity.getClass().getName());
        if (com.sankuai.meituan.takeoutnew.a.f) {
            com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#Created %s", activity.getClass().getName());
        }
        if (activity instanceof KNBWebViewActivity) {
            Intent intent2 = activity.getIntent();
            String a4 = com.sankuai.waimai.platform.utils.f.a(intent2, "url");
            if (TextUtils.isEmpty(a4)) {
                a4 = com.sankuai.waimai.foundation.router.a.a(intent2, "inner_url", "");
            }
            if (!TextUtils.isEmpty(a4)) {
                AppInfo.onKNBWebViewCreate(a4);
                if (com.sankuai.meituan.takeoutnew.a.f) {
                    com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "KNB#Browsing: %s", a4);
                }
            }
        } else if (activity instanceof WmRNActivity) {
            String dataString = activity.getIntent().getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                AppInfo.onMRNCreate(dataString);
                if (com.sankuai.meituan.takeoutnew.a.f) {
                    com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "MRN#Loading: %s", dataString);
                }
            }
        }
        if (bundle == null || !a(bundle.getClassLoader(), activity.getClassLoader())) {
            return;
        }
        bundle.setClassLoader(activity.getClassLoader());
    }

    private static boolean a(ClassLoader classLoader, ClassLoader classLoader2) {
        Object[] objArr = {classLoader, classLoader2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e077b6e25dfe14a92d3436aee2a415aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e077b6e25dfe14a92d3436aee2a415aa")).booleanValue();
        }
        if (classLoader2 == null || classLoader2 == classLoader) {
            return false;
        }
        if (classLoader == null) {
            return true;
        }
        while (classLoader2.getParent() != classLoader) {
            classLoader2 = classLoader2.getParent();
            if (classLoader2 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean a2;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21cfbc7ad54d265b0a748d276da64176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21cfbc7ad54d265b0a748d276da64176");
            return;
        }
        com.sankuai.waimai.launcher.config.a a3 = com.sankuai.waimai.launcher.config.a.a();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.config.a.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "71ac49b7d87453c1d035451ef06c3b41", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Boolean) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "71ac49b7d87453c1d035451ef06c3b41")).booleanValue();
        } else {
            a2 = a3.b != null ? a3.b.a(activity) : false;
        }
        if (!a2) {
            AppInfo.onActivityStart(activity.getClass());
        }
        a("Activity#Started " + activity.getClass().getName());
        com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#Started %s", activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c089a1206f0fd4a8d3cd0848af4ef43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c089a1206f0fd4a8d3cd0848af4ef43");
            return;
        }
        a("Activity#Resumed " + activity.getClass().getName());
        com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#Resumed %s", activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82e6afd951459e202a527b5e471698f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82e6afd951459e202a527b5e471698f");
            return;
        }
        a("Activity#Paused " + activity.getClass().getName());
        com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#Paused %s", activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e624d9ac6c7cc608e8606c102fb2840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e624d9ac6c7cc608e8606c102fb2840");
            return;
        }
        a("Activity#Stopped " + activity.getClass().getName());
        com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#Stopped %s", activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a1511d32438617e7836576397e25595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a1511d32438617e7836576397e25595");
            return;
        }
        a("Activity#SaveInstanceState " + activity.getClass().getName());
        com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#SaveInstanceState %s", activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d8d5e2ed2f6fee3e3ea2a16a2f340b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d8d5e2ed2f6fee3e3ea2a16a2f340b");
            return;
        }
        a("Activity#Destroyed " + activity.getClass().getName());
        com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "Activity#Destroyed %s", activity.getClass().getName());
    }
}
