package com.meituan.android.common.mtguard.utils;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.meituan.android.common.mtguard.utils.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6756e5d973fe32182ad8ecfc30f3aed8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6756e5d973fe32182ad8ecfc30f3aed8");
                return;
            }
            try {
                Class.forName("");
            } catch (Throwable th) {
                try {
                    NBridge.main3(59, new Object[]{th.getStackTrace()});
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "15e6a6a428001d43161bbd4b46033a1f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "15e6a6a428001d43161bbd4b46033a1f");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod(Build.VERSION.SDK_INT >= 18 ? "currentProcessName" : "currentPackageName", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return null;
        }
    }

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8beac63be763c4e063642b2f2d7f919", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8beac63be763c4e063642b2f2d7f919")).booleanValue();
        }
        String a = a();
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String str = MTGuard.sPackageName;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(a);
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a20a1500f642eaf14f6f2e50affea3a0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a20a1500f642eaf14f6f2e50affea3a0")).booleanValue() : "huawei".equalsIgnoreCase(Build.BRAND);
    }

    private static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc7a9c7d7bd884244ace266008922cf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc7a9c7d7bd884244ace266008922cf8");
        } else {
            new Handler(Looper.getMainLooper()).post(new AnonymousClass1());
        }
    }
}
