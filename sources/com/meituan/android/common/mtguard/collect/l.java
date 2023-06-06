package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.meituan.android.common.dfingerprint.DFPTask;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public class l implements c {
    private static l a = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final int f = 255;
    private Context b;
    private PhoneStateListener c;
    private TelephonyManager d;
    private Handler e;
    private boolean g;

    /* renamed from: com.meituan.android.common.mtguard.collect.l$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a910c55c8004bbeb78a83ecc85cd6936", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a910c55c8004bbeb78a83ecc85cd6936");
                return;
            }
            try {
                if (l.this.g) {
                    l.this.d.listen(l.this.c, 0);
                    l.this.g = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    final class a extends PhoneStateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            Object[] objArr = {l.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a823235324667260699b7debd386e076", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a823235324667260699b7debd386e076");
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f85fef70829b039e5e00c381e68962", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f85fef70829b039e5e00c381e68962");
                return;
            }
            super.onCallStateChanged(i, str);
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(DFPTask.obtainExecutor(), new Runnable() { // from class: com.meituan.android.common.mtguard.collect.l.a.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9e6ee51ae4d3ffa692faeeda45d614f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9e6ee51ae4d3ffa692faeeda45d614f");
                            return;
                        }
                        MTGuardLog.setLogan("call state changed");
                        NBridge.main3(50, new Object[]{255});
                    }
                });
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    public l(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4aa39be01ec0dfa2294948f1cb1cd20c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4aa39be01ec0dfa2294948f1cb1cd20c");
            return;
        }
        this.g = false;
        this.b = context;
        this.d = (TelephonyManager) this.b.getSystemService("phone");
        this.e = new Handler(Looper.getMainLooper());
    }

    public static l a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9560b70f94527ce64f831d72d1acd0e", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9560b70f94527ce64f831d72d1acd0e");
        }
        if (a == null) {
            synchronized (l.class) {
                if (a == null) {
                    a = new l(context);
                }
            }
        }
        return a;
    }

    private void a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de37d966f8deeaf7f2039e49ce468eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de37d966f8deeaf7f2039e49ce468eaa");
            return;
        }
        try {
            if (this.g) {
                return;
            }
            Object[] main3 = NBridge.main3(53, new Object[]{255});
            if (main3 != null) {
                z = ((Boolean) main3[0]).booleanValue();
            }
            if (z || this.d == null) {
                return;
            }
            this.e.post(new Runnable() { // from class: com.meituan.android.common.mtguard.collect.l.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "038429b96fa65d88e44f5044baced4ae", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "038429b96fa65d88e44f5044baced4ae");
                        return;
                    }
                    try {
                        if (l.this.g) {
                            return;
                        }
                        l.this.c = new a();
                        l.this.d.listen(l.this.c, 32);
                        l.this.g = true;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5831c138a294fd6f173614d2fb04ebc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5831c138a294fd6f173614d2fb04ebc3");
            return;
        }
        try {
            if (!this.g || this.d == null) {
                return;
            }
            this.e.post(new AnonymousClass2());
        } catch (Throwable unused) {
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27b0ab086542e3a2bafec662f1ef6dd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27b0ab086542e3a2bafec662f1ef6dd3");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 22 && this.b.getApplicationContext().getApplicationInfo().targetSdkVersion < 31) {
                a();
                eVar.a(255, this);
            }
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
        }
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfeb54715da6f66ebee168e4990d7e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfeb54715da6f66ebee168e4990d7e74");
        } else if (!z) {
            a();
        } else {
            try {
                if (!this.g || this.d == null) {
                    return;
                }
                this.e.post(new AnonymousClass2());
            } catch (Throwable unused) {
            }
        }
    }
}
