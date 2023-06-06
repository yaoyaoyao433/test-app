package com.meituan.mtwebkit.internal.process;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.UserHandle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mtwebkit.MTRenderProcessGoneDetail;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewFactory;
import com.meituan.mtwebkit.internal.d;
import com.meituan.mtwebkit.internal.e;
import com.meituan.mtwebkit.internal.h;
import com.meituan.mtwebkit.internal.l;
import com.meituan.mtwebkit.internal.reporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MultiProcessManager {
    public static ChangeQuickRedirect a;
    private static Method b;
    private static Boolean d;
    private static int e;
    private static int h;
    private static int j;
    private static ComponentName n;
    private static Handler o;
    private static final String c = com.meituan.mtwebkit.internal.a.a().getPackageName();
    private static final WeakHashMap<MTWebView, String> f = new WeakHashMap<>();
    private static int g = -1;
    private static int i = -1;
    private static int k = 5;
    private static boolean l = false;
    private static final WeakHashMap<ServiceConnection, ServiceConnection> m = new WeakHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public ServiceConnection a;
        public Intent b;
        public int c;
        public int d;
    }

    @Keep
    public static int getApiVersion() {
        return 2;
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b9795a3b861d5f564e40f68b6cdaeb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b9795a3b861d5f564e40f68b6cdaeb9");
            return;
        }
        if (i != aVar.d) {
            j++;
            i = aVar.d;
        }
        if (j < k) {
            aVar.a.onServiceConnected(aVar.b.getComponent(), new Binder() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.4
                @Override // android.os.Binder, android.os.IBinder
                @Nullable
                public final IInterface queryLocalInterface(@NonNull String str) {
                    return null;
                }
            });
            return;
        }
        aVar.a.onServiceDisconnected(aVar.b.getComponent());
        if (l) {
            return;
        }
        l = true;
        e.c("MultiProcessManager", "reBindServiceCount 超过最大值: " + k + ", downgradeToInProcessRender");
        MTWebViewFactory.downgradeToInProcessRender();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45b9f73fcf3c5ae1fea42ed4db8af0a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45b9f73fcf3c5ae1fea42ed4db8af0a0");
                    return;
                }
                Boolean unused = MultiProcessManager.d = Boolean.FALSE;
                ArrayList arrayList = new ArrayList(MultiProcessManager.f.keySet());
                MultiProcessManager.f.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    final MTWebView mTWebView = (MTWebView) it.next();
                    mTWebView.getWebViewClient().onRenderProcessGone(mTWebView, new MTRenderProcessGoneDetail() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mtwebkit.MTRenderProcessGoneDetail
                        public final boolean didCrash() {
                            return true;
                        }

                        @Override // com.meituan.mtwebkit.MTRenderProcessGoneDetail
                        public final int rendererPriorityAtExit() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90054db1dfef7d15795b08023d27b3d8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90054db1dfef7d15795b08023d27b3d8")).intValue() : mTWebView.getRendererRequestedPriority();
                        }
                    });
                }
            }
        });
    }

    public static int a(ComponentName componentName) {
        Object[] objArr = {componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1c871b8c78a7902bc4fd9e848d6b29d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1c871b8c78a7902bc4fd9e848d6b29d")).intValue();
        }
        PackageInfo b2 = l.b();
        if (b2 != null && b2.packageName.equals(componentName.getPackageName()) && componentName.getClassName().startsWith("org.chromium.content.app.SandboxedProcessService")) {
            try {
                return Integer.parseInt(componentName.getClassName().substring(48));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static ComponentName a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a21ec23d4a0c4b5304822b24e1758ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentName) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a21ec23d4a0c4b5304822b24e1758ee");
        }
        if (n != null) {
            String packageName = n.getPackageName();
            return new ComponentName(packageName, n.getClassName() + i2);
        }
        String str = c;
        return new ComponentName(str, "com.meituan.mtwebkit.internal.process.SandboxedProcessService$SandboxedProcessService" + i2);
    }

    public static synchronized void a() {
        synchronized (MultiProcessManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9273ce616355423c06e71c671ef4ca93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9273ce616355423c06e71c671ef4ca93");
                return;
            }
            if (System.currentTimeMillis() - h.j() > 86400000) {
                h.a(System.currentTimeMillis());
                h.c(1);
                return;
            }
            int o2 = h.o() + 1;
            if (o2 >= h.D()) {
                h.a(true);
            }
            h.c(o2);
        }
    }

    public static boolean a(ClassLoader classLoader) {
        Object[] objArr = {classLoader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d71c88d9c74bfd34e9b7e13c1cc83ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d71c88d9c74bfd34e9b7e13c1cc83ac")).booleanValue();
        }
        if (d == null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(a(0));
                ResolveInfo resolveService = com.meituan.mtwebkit.internal.a.a().getPackageManager().resolveService(intent, 1024);
                if (resolveService != null && resolveService.serviceInfo != null && resolveService.serviceInfo.permission == null) {
                    d = (Boolean) d.a("com.meituan.mtwebview.chromium.MultiProcessBridge", classLoader).a("checkApiCompatible", new Object[0]).b;
                } else {
                    e.c("MultiProcessManager", "resolveService return null");
                    d = Boolean.FALSE;
                }
            } catch (Throwable th) {
                e.b("MultiProcessManager", "checkApiCompatible fail", th);
                d = Boolean.FALSE;
            }
        }
        return d.booleanValue();
    }

    public static void a(MTWebView mTWebView) {
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd7ab3d3160556337b0558959803b762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd7ab3d3160556337b0558959803b762");
        } else if (d == null || !d.booleanValue()) {
        } else {
            e++;
            f.put(mTWebView, null);
        }
    }

    public static void b(MTWebView mTWebView) {
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15c3585d6a7b06448fd67380bd919c38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15c3585d6a7b06448fd67380bd919c38");
        } else if (d == null || !d.booleanValue()) {
        } else {
            f.remove(mTWebView);
        }
    }

    @Keep
    public static void onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
        Object[] objArr = {mTWebView, mTRenderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f48a1f9da46f35fe711f0e97f09fe64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f48a1f9da46f35fe711f0e97f09fe64");
            return;
        }
        e.c("MultiProcessManager", "onRenderProcessGone didCrash = " + mTRenderProcessGoneDetail.didCrash());
        f.remove(mTWebView);
        c.a(Boolean.valueOf(mTRenderProcessGoneDetail.didCrash()));
    }

    private static synchronized void b(a aVar) {
        synchronized (MultiProcessManager.class) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b98e3467203aef979b6441ca6322d1e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b98e3467203aef979b6441ca6322d1e9");
                return;
            }
            ServiceConnection serviceConnection = m.get(aVar.a);
            if (serviceConnection == null) {
                final ServiceConnection serviceConnection2 = aVar.a;
                final int i2 = aVar.d;
                ServiceConnection serviceConnection3 = new ServiceConnection() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        Object[] objArr2 = {componentName, iBinder};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae53b80269e2000af91d5a075da7df5d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae53b80269e2000af91d5a075da7df5d");
                            return;
                        }
                        e.c("MultiProcessManager", "onServiceConnected index = " + i2);
                        MultiProcessManager.o.removeMessages(i2);
                        serviceConnection2.onServiceConnected(componentName, iBinder);
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        Object[] objArr2 = {componentName};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a065eae47f615d9144348347c1310141", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a065eae47f615d9144348347c1310141");
                            return;
                        }
                        e.c("MultiProcessManager", "onServiceDisconnected index = " + i2);
                        MultiProcessManager.o.removeMessages(i2);
                        serviceConnection2.onServiceDisconnected(componentName);
                    }
                };
                m.put(aVar.a, serviceConnection3);
                g = aVar.d;
                serviceConnection = serviceConnection3;
            }
            aVar.a = serviceConnection;
        }
    }

    @SuppressLint({"HandlerLeak"})
    @Nullable
    private static a a(PackageInfo packageInfo, Intent intent, ServiceConnection serviceConnection, int i2) {
        Object[] objArr = {packageInfo, intent, serviceConnection, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91dc373361061f41498a468f08df1985", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91dc373361061f41498a468f08df1985");
        }
        a aVar = new a();
        int a2 = a(intent.getComponent());
        aVar.b = intent;
        aVar.a = serviceConnection;
        aVar.c = i2;
        aVar.d = a2;
        if (a2 != -1) {
            if (o == null) {
                o = new Handler() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.2
                    public static ChangeQuickRedirect a;

                    @Override // android.os.Handler
                    public final void handleMessage(@NonNull Message message) {
                        Object[] objArr2 = {message};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67656087dc74f8d54795a32a0c51b007", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67656087dc74f8d54795a32a0c51b007");
                            return;
                        }
                        a aVar2 = (a) message.obj;
                        e.c("MultiProcessManager", "bindService not callback yet; componentName = " + aVar2.b.getComponent() + "; flags = " + aVar2.c);
                        MultiProcessManager.a(aVar2);
                    }
                };
            }
            if (aVar.d != g) {
                int i3 = h + 1;
                h = i3;
                if (i3 - e >= h.B()) {
                    final String str = "SandboxedProcessService has exceeded the max limit: bindServiceCount = " + h + "; newWebViewCount = " + e + "; MaxSandboxedServicesCount = " + h.B();
                    new Handler().post(new Runnable() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60b76e04a8f347c950d7cf3a0c68f08e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60b76e04a8f347c950d7cf3a0c68f08e");
                            } else {
                                MultiProcessManager.a();
                                throw new IllegalStateException(str);
                            }
                        }
                    });
                    return null;
                }
                o.removeCallbacksAndMessages(null);
                Message obtain = Message.obtain(o, aVar.d);
                obtain.obj = aVar;
                o.sendMessageDelayed(obtain, 10000L);
                g = aVar.d;
            }
            aVar.b = (Intent) intent.clone();
            aVar.b.setComponent(a(a2));
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i2 ^= Integer.MIN_VALUE;
            }
            aVar.c = i2;
            aVar.b.putExtra("mtwebview_host_packageinfo", packageInfo);
            b(aVar);
        }
        return aVar;
    }

    public static boolean a(Context context, PackageInfo packageInfo, Intent intent, ServiceConnection serviceConnection, int i2) {
        Object[] objArr = {context, packageInfo, intent, serviceConnection, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7185b9365fb001050bbbb0dafbc9b96", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7185b9365fb001050bbbb0dafbc9b96")).booleanValue();
        }
        final a a2 = a(packageInfo, intent, serviceConnection, i2);
        if (a2 == null) {
            return false;
        }
        if (!context.bindService(a2.b, a2.a, a2.c)) {
            e.c("MultiProcessManager", "bindService return false; componentName = " + a2.b.getComponent() + "; flags = " + a2.c);
            new Handler().postDelayed(new Runnable() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba38d50d21683d0dda10e0b8886d3a58", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba38d50d21683d0dda10e0b8886d3a58");
                    } else {
                        MultiProcessManager.a(a.this);
                    }
                }
            }, 1000L);
        }
        return true;
    }

    public static boolean a(Context context, PackageInfo packageInfo, Intent intent, ServiceConnection serviceConnection, int i2, Handler handler, UserHandle userHandle) throws ReflectiveOperationException {
        int i3;
        Object[] objArr = {context, packageInfo, intent, serviceConnection, Integer.valueOf(i2), handler, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c71bda204912ebcaf667470f77cc91a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c71bda204912ebcaf667470f77cc91a9")).booleanValue();
        }
        final a a2 = a(packageInfo, intent, serviceConnection, i2);
        if (a2 == null) {
            return false;
        }
        if (b == null) {
            i3 = 5;
            b = Context.class.getDeclaredMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class);
        } else {
            i3 = 5;
        }
        Method method = b;
        Object[] objArr2 = new Object[i3];
        objArr2[0] = a2.b;
        objArr2[1] = a2.a;
        objArr2[2] = Integer.valueOf(a2.c);
        objArr2[3] = handler;
        objArr2[4] = userHandle;
        if (!((Boolean) method.invoke(context, objArr2)).booleanValue()) {
            e.c("MultiProcessManager", "bindServiceAsUser return false; componentName = " + a2.b.getComponent() + "; flags = " + a2.c);
            new Handler().postDelayed(new Runnable() { // from class: com.meituan.mtwebkit.internal.process.MultiProcessManager.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "5be7506c766cd9bef52134218721cb42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "5be7506c766cd9bef52134218721cb42");
                    } else {
                        MultiProcessManager.a(a.this);
                    }
                }
            }, 1000L);
        }
        return true;
    }

    public static synchronized ServiceConnection a(ServiceConnection serviceConnection) {
        synchronized (MultiProcessManager.class) {
            Object[] objArr = {serviceConnection};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1865b0abb8146e611ca21b0927fa7a01", RobustBitConfig.DEFAULT_VALUE)) {
                return (ServiceConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1865b0abb8146e611ca21b0927fa7a01");
            }
            return m.remove(serviceConnection);
        }
    }
}
