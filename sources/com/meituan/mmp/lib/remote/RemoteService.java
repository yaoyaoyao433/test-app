package com.meituan.mmp.lib.remote;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.engine.j;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.mp.ipc.d;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RemoteService extends Service {
    public static ChangeQuickRedirect a;
    private static final Set<com.meituan.mmp.lib.mp.a> b = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Set<com.meituan.mmp.lib.mp.a> c = Collections.newSetFromMap(new ConcurrentHashMap());
    private static a d;

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5854d8c92f15c05672d82982d5d55596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5854d8c92f15c05672d82982d5d55596");
            return;
        }
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89fb0e847f4161b2b16b095361ac67ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89fb0e847f4161b2b16b095361ac67ea");
            return;
        }
        c.b(this);
        super.onDestroy();
    }

    public static /* synthetic */ a a(a aVar) {
        d = null;
        return null;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3877180251396b2d112ac7b387a246ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3877180251396b2d112ac7b387a246ba");
        }
        com.meituan.mmp.lib.mp.a a2 = com.meituan.mmp.lib.mp.a.a(f.a(intent, "mmp_clientProcess"));
        if (a2 == null) {
            com.meituan.mmp.lib.trace.b.d("RemoteService", "onBind, target process not found: " + intent);
        } else {
            com.meituan.mmp.lib.trace.b.b("RemoteService", "onBind, process " + a2 + " bound to main process");
            c.remove(a2);
            b.add(a2);
        }
        return new Binder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c6510fdc8c831d365222967c8b7209", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c6510fdc8c831d365222967c8b7209")).booleanValue();
        }
        com.meituan.mmp.lib.mp.a a2 = com.meituan.mmp.lib.mp.a.a(f.a(intent, "mmp_clientProcess"));
        if (a2 == null) {
            com.meituan.mmp.lib.trace.b.d("RemoteService", "onUnbind, target process not found: " + intent);
        } else {
            com.meituan.mmp.lib.trace.b.b("RemoteService", "onUnbind, process " + a2 + " died");
            b.remove(a2);
            com.meituan.mmp.lib.mp.b.a(a2);
        }
        return super.onUnbind(intent);
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5c8d9b1915bc650d8ad4b12cc4d8c32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5c8d9b1915bc650d8ad4b12cc4d8c32");
        } else if (com.meituan.mmp.lib.mp.a.f()) {
        } else {
            b(context);
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1abd1c69e1a7caf2c9a304d984c66aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1abd1c69e1a7caf2c9a304d984c66aca");
        } else if (d != null) {
        } else {
            a aVar = new a();
            com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
            if (e == null || e == com.meituan.mmp.lib.mp.a.MAIN) {
                return;
            }
            Intent intent = new Intent(context, RemoteService.class);
            intent.setData(Uri.parse("imeituan://mmp/" + com.meituan.mmp.lib.mp.a.e().name()));
            intent.putExtra("mmp_clientProcess", com.meituan.mmp.lib.mp.a.e().a());
            com.meituan.mmp.lib.trace.b.b("RemoteService", "bindToMainProcess");
            if (MMPEnvHelper.getContext().bindService(intent, aVar, 129)) {
                d = aVar;
            }
        }
    }

    public static void a() {
        if (d == null) {
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "638cd07a6eaf4f3a6a4dabc44bab9040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "638cd07a6eaf4f3a6a4dabc44bab9040");
        } else if (com.meituan.mmp.lib.mp.a.f()) {
            List<com.meituan.mmp.lib.mp.a> a2 = com.meituan.mmp.lib.mp.b.a();
            a2.remove(com.meituan.mmp.lib.mp.a.MAIN);
            com.meituan.mmp.lib.trace.b.b("RemoteService", "requestSubProcessBindToMainProcess: " + a2);
            for (com.meituan.mmp.lib.mp.a aVar : a2) {
                new b().a(aVar, new Void[0]);
                c.add(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends d<Void, Void> {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.mp.ipc.d
        public final /* synthetic */ Void a(Void[] voidArr) throws Exception {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d22b6023ef6ca3f31443855252a822", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d22b6023ef6ca3f31443855252a822");
            }
            MMPEnvHelper.ensureFullInited();
            RemoteService.b(MMPEnvHelper.getContext());
            AppBrandMonitor appBrandMonitor = AppBrandMonitor.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = AppBrandMonitor.a;
            if (PatchProxy.isSupport(objArr2, appBrandMonitor, changeQuickRedirect2, false, "82e58bd25097554a35446f5904815f50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, appBrandMonitor, changeQuickRedirect2, false, "82e58bd25097554a35446f5904815f50");
            } else if (!com.meituan.mmp.lib.mp.a.f()) {
                appBrandMonitor.f.a(appBrandMonitor.b);
            }
            GlobalEngineMonitor a2 = GlobalEngineMonitor.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = GlobalEngineMonitor.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1354726b100c123e6ab502d22818af4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1354726b100c123e6ab502d22818af4f");
                return null;
            }
            Map<String, m> b = j.b();
            for (m mVar : j.c().values()) {
                a2.b(mVar, b.containsKey(mVar.b));
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements ServiceConnection {
        public static ChangeQuickRedirect a;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Object[] objArr = {componentName};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d846352955f24fc0ca148e282c5e3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d846352955f24fc0ca148e282c5e3c");
                return;
            }
            RemoteService.a((a) null);
            com.meituan.mmp.lib.trace.b.c("RemoteService", "notify main process die");
            com.meituan.mmp.lib.mp.b.a(com.meituan.mmp.lib.mp.a.MAIN);
        }
    }

    public static void a(List<com.meituan.mmp.lib.mp.a> list) {
        com.meituan.mmp.lib.mp.a[] valuesCustom;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96db3c5de9aa965d75013676a3ad532a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96db3c5de9aa965d75013676a3ad532a");
            return;
        }
        for (final com.meituan.mmp.lib.mp.a aVar : com.meituan.mmp.lib.mp.a.valuesCustom()) {
            if (aVar != com.meituan.mmp.lib.mp.a.MAIN && !list.contains(aVar) && (b.remove(aVar) || c.remove(aVar))) {
                com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.remote.RemoteService.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a2eedf424765bcb1d4557da0f8fbeea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a2eedf424765bcb1d4557da0f8fbeea");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.c("RemoteService", "process " + com.meituan.mmp.lib.mp.a.this + " died without unbind, notifyProcessDie");
                        com.meituan.mmp.lib.mp.b.a(com.meituan.mmp.lib.mp.a.this);
                    }
                });
            }
        }
    }
}
