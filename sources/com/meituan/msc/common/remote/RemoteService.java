package com.meituan.msc.common.remote;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.meituan.msc.common.process.GlobalEngineMonitor;
import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.msc.common.process.ipc.IPCInvokeControl;
import com.meituan.msc.common.process.ipc.c;
import com.meituan.msc.common.process.ipc.d;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.router.AppBrandMonitor;
import com.meituan.msc.modules.engine.e;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RemoteService extends Service {
    public static ChangeQuickRedirect a;
    private static final Set<com.meituan.msc.common.process.a> b = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Set<com.meituan.msc.common.process.a> c = Collections.newSetFromMap(new ConcurrentHashMap());
    private static a d;

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da8903d636c526f560f9b2f9a3bfa85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da8903d636c526f560f9b2f9a3bfa85");
            return;
        }
        c.a(this);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d52f2be0280a112651c32f67cca654bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d52f2be0280a112651c32f67cca654bd");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9f92ce4699df5ad02fda0d1de18948", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9f92ce4699df5ad02fda0d1de18948");
        }
        com.meituan.msc.common.process.a a2 = com.meituan.msc.common.process.a.a(f.a(intent, "msc_clientProcess"));
        if (a2 == null) {
            g.a("RemoteService", "onBind, target process not found: " + intent);
        } else {
            g.d("RemoteService", "onBind, process ", a2, " bound to main process");
            c.remove(a2);
            b.add(a2);
        }
        return new Binder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a81b6391a59ee1fdbd0efeb932f6a922", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a81b6391a59ee1fdbd0efeb932f6a922")).booleanValue();
        }
        com.meituan.msc.common.process.a a2 = com.meituan.msc.common.process.a.a(f.a(intent, "msc_clientProcess"));
        if (a2 == null) {
            g.a("RemoteService", "onUnbind, target process not found: " + intent);
        } else {
            g.d("RemoteService", "onUnbind, process ", a2, " died");
            b.remove(a2);
            com.meituan.msc.common.process.b.a(a2);
        }
        return super.onUnbind(intent);
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adee4215e290b13089c8b78477888a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adee4215e290b13089c8b78477888a28");
        } else if (com.meituan.msc.common.process.a.f()) {
        } else {
            b(context);
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c3984d769e0abfbfce01f638f66457d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c3984d769e0abfbfce01f638f66457d");
        } else if (d != null) {
        } else {
            a aVar = new a();
            com.meituan.msc.common.process.a e = com.meituan.msc.common.process.a.e();
            if (e == null || e == com.meituan.msc.common.process.a.MAIN) {
                return;
            }
            Intent intent = new Intent(context, RemoteService.class);
            intent.setData(Uri.parse("imeituan://msc/" + com.meituan.msc.common.process.a.e().name()));
            intent.putExtra("msc_clientProcess", com.meituan.msc.common.process.a.e().b());
            g.d("RemoteService", "bindToMainProcess");
            if (MSCEnvHelper.getContext().bindService(intent, aVar, 129)) {
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
        char c2 = 1;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b46aae6c91c1142be584e983167b1158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b46aae6c91c1142be584e983167b1158");
        } else if (com.meituan.msc.common.process.a.f()) {
            List<com.meituan.msc.common.process.a> a2 = com.meituan.msc.common.process.b.a();
            a2.remove(com.meituan.msc.common.process.a.MAIN);
            g.d("RemoteService", "requestSubProcessBindToMainProcess: ", a2);
            for (com.meituan.msc.common.process.a aVar : a2) {
                final b bVar = new b();
                final Void[] voidArr = new Void[0];
                Object[] objArr2 = new Object[2];
                objArr2[0] = aVar;
                objArr2[c2] = voidArr;
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.process.ipc.c.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "36c437dc92a9481e379eb22dde748534", RobustBitConfig.DEFAULT_VALUE)) {
                    com.meituan.msc.common.process.ipc.c cVar = (com.meituan.msc.common.process.ipc.c) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "36c437dc92a9481e379eb22dde748534");
                } else {
                    Class<?> componentType = voidArr.getClass().getComponentType();
                    Object[] objArr3 = (Object[]) Array.newInstance(Object.class, 0);
                    System.arraycopy(voidArr, 0, objArr3, 0, 0);
                    IPCInvoke.a aVar2 = (IPCInvoke.a) IPCInvoke.a(bVar.getClass(), aVar);
                    ((IPCInvokeControl) aVar2).setIPCExceptionListener(new d() { // from class: com.meituan.msc.common.process.ipc.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.common.process.ipc.d
                        public final void a(e eVar) {
                            Object[] objArr4 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "f82f198453746e91139ab3ce7c03fd7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "f82f198453746e91139ab3ce7c03fd7c");
                            } else if (bVar.b) {
                            } else {
                                bVar.b = true;
                            }
                        }
                    });
                    aVar2.a(componentType, objArr3, new c.a() { // from class: com.meituan.msc.common.process.ipc.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.common.process.ipc.c.a
                        public final void a(Object obj) {
                            Object[] objArr4 = {obj};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "a4285a639666b335ded0de6352062e80", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "a4285a639666b335ded0de6352062e80");
                            } else {
                                bVar.b = true;
                            }
                        }

                        @Override // com.meituan.msc.common.process.ipc.c.a
                        public final void a(IPCInvoke.IPCMethodCall iPCMethodCall) {
                            Object[] objArr4 = {iPCMethodCall};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "04129fdbb6d9afe6592abe9231b7268b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "04129fdbb6d9afe6592abe9231b7268b");
                                return;
                            }
                            bVar.b = true;
                            try {
                                iPCMethodCall.d.invoke(voidArr[iPCMethodCall.b], iPCMethodCall.e);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                com.meituan.msc.modules.reporter.g.a(e);
                            }
                        }

                        @Override // com.meituan.msc.common.process.ipc.c.a
                        public final void a(Exception exc) {
                            Object[] objArr4 = {exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "bc62dcd71fcf15ca38eaf6a90bc80cb0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "bc62dcd71fcf15ca38eaf6a90bc80cb0");
                            } else {
                                bVar.b = true;
                            }
                        }
                    });
                }
                c.add(aVar);
                c2 = 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends com.meituan.msc.common.process.ipc.c<Void, Void> {
        public static ChangeQuickRedirect c;

        @Override // com.meituan.msc.common.process.ipc.c
        public final /* synthetic */ Void a(Void[] voidArr) throws Exception {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6863f5ccdc48ae43af59e774d9428ff", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6863f5ccdc48ae43af59e774d9428ff");
            }
            MSCEnvHelper.ensureFullInited();
            RemoteService.b(MSCEnvHelper.getContext());
            AppBrandMonitor appBrandMonitor = AppBrandMonitor.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = AppBrandMonitor.a;
            if (PatchProxy.isSupport(objArr2, appBrandMonitor, changeQuickRedirect2, false, "08527d118d11f1c361b13d58dfbc7e2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, appBrandMonitor, changeQuickRedirect2, false, "08527d118d11f1c361b13d58dfbc7e2f");
            } else if (!com.meituan.msc.common.process.a.f()) {
                appBrandMonitor.e.a(appBrandMonitor.b);
            }
            GlobalEngineMonitor a = GlobalEngineMonitor.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = GlobalEngineMonitor.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "4f0699b95a38d3f71f336cef91b1b2bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "4f0699b95a38d3f71f336cef91b1b2bf");
                return null;
            }
            Map<String, e> e = q.e();
            for (h hVar : q.f().values()) {
                a.b(hVar, e.containsKey(hVar.a()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36a3e66dbea4f3b44577d80bbae0a4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36a3e66dbea4f3b44577d80bbae0a4b");
                return;
            }
            RemoteService.a((a) null);
            g.e("RemoteService", "notify main process die");
            com.meituan.msc.common.process.b.a(com.meituan.msc.common.process.a.MAIN);
        }
    }

    public static void a(List<com.meituan.msc.common.process.a> list) {
        com.meituan.msc.common.process.a[] valuesCustom;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1ac36396adf6f51280685024475fc4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1ac36396adf6f51280685024475fc4c");
            return;
        }
        for (final com.meituan.msc.common.process.a aVar : com.meituan.msc.common.process.a.valuesCustom()) {
            if (aVar != com.meituan.msc.common.process.a.MAIN && !list.contains(aVar) && (b.remove(aVar) || c.remove(aVar))) {
                com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.common.remote.RemoteService.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f99fb9cac0d13de5dbc2cb91b80db9bf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f99fb9cac0d13de5dbc2cb91b80db9bf");
                            return;
                        }
                        g.e("RemoteService", "process " + com.meituan.msc.common.process.a.this + " died without unbind, notifyProcessDie");
                        com.meituan.msc.common.process.b.a(com.meituan.msc.common.process.a.this);
                    }
                });
            }
        }
    }
}
