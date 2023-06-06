package com.meituan.mtwebkit.internal.process;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext;
import com.meituan.mtwebkit.internal.d;
import com.meituan.mtwebkit.internal.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import com.sankuai.waimai.foundation.core.lifecycle.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SandboxedProcessService extends Service {
    public static ChangeQuickRedirect a;
    private Service b;
    private boolean c;
    private String d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService0 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService1 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService10 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService11 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService12 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService13 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService14 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService15 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService16 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService17 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService18 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService19 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService2 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService20 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService21 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService22 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService23 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService24 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService25 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService26 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService27 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService28 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService29 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService3 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService30 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService31 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService32 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService33 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService34 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService35 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService36 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService37 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService38 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService39 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService4 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService5 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService6 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService7 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService8 extends SandboxedProcessService {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SandboxedProcessService9 extends SandboxedProcessService {
    }

    static {
        e.a("SandboxedProcessService", "SandboxedProcess init");
    }

    public SandboxedProcessService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb02e8e2bb29fef686e9b7f37835e0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb02e8e2bb29fef686e9b7f37835e0f");
            return;
        }
        e.a("SandboxedProcessService", "new " + getClass().getCanonicalName());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b1e52d066db054778139cfbee2a0e7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBinder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b1e52d066db054778139cfbee2a0e7b");
        }
        e.a("SandboxedProcessService", "onBind");
        if (!this.c) {
            stopSelf();
            e.a("SandboxedProcessService", "stopSelf");
            this.c = true;
        }
        if (this.b == null) {
            PackageInfo packageInfo = (PackageInfo) intent.getParcelableExtra("mtwebview_host_packageinfo");
            if (packageInfo != null) {
                try {
                    MTWebViewFromLocalStorageContext mTWebViewFromLocalStorageContext = new MTWebViewFromLocalStorageContext(packageInfo);
                    d a2 = d.a("org.chromium.content.app.SandboxedProcessService0", mTWebViewFromLocalStorageContext.getClassLoader()).a(new Object[0]);
                    a2.a("attachBaseContext", d.a(mTWebViewFromLocalStorageContext, Context.class));
                    this.b = (Service) a2.b;
                    this.b.onCreate();
                } catch (Throwable th) {
                    th.printStackTrace();
                    this.b = null;
                }
            } else {
                this.d = "PackageInfo not exist";
            }
        } else {
            this.d = "mDelegate exist";
        }
        if (this.d != null) {
            e.b("SandboxedProcessService", this.d);
        }
        return this.b == null ? new Binder() { // from class: com.meituan.mtwebkit.internal.process.SandboxedProcessService.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Binder
            public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                Object[] objArr2 = {Integer.valueOf(i), parcel, parcel2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "122ddb0caf24e194780c9a8a449ad85b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "122ddb0caf24e194780c9a8a449ad85b")).booleanValue();
                }
                if (SandboxedProcessService.this.d != null && i > 0 && i <= 16777215) {
                    MultiProcessManager.a();
                    throw new IllegalStateException("Exception from " + SandboxedProcessService.this.getClass().getSimpleName() + ": " + SandboxedProcessService.this.d);
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
        } : this.b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0263f171d2c203b890439e42ba25f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0263f171d2c203b890439e42ba25f6");
            return;
        }
        c.a(this);
        super.onCreate();
        e.a("SandboxedProcessService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed52f5f63c2a2b2802ebbca25b101dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed52f5f63c2a2b2802ebbca25b101dee");
            return;
        }
        c.b(this);
        super.onDestroy();
        e.a("SandboxedProcessService", "onDestroy");
        if (this.b != null) {
            this.b.onDestroy();
            this.b = null;
        } else {
            e.a("SandboxedProcessService", "mDelegate not exist");
        }
        e.a("SandboxedProcessService", "Kill Self");
        k.b(Process.myPid());
        k.a(0);
    }
}
