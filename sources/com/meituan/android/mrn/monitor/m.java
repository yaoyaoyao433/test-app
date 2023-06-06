package com.meituan.android.mrn.monitor;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class m {
    public static ChangeQuickRedirect a;
    private static m d;
    public com.dianping.monitor.impl.a b;
    public WeakReference<Context> c;

    public static m a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5fe8dc3956b7ee2c9eadbbdf46f31b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5fe8dc3956b7ee2c9eadbbdf46f31b5");
        }
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (d == null) {
            synchronized (m.class) {
                if (d == null) {
                    d = new m(context);
                }
            }
        }
        return d;
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28629436008cb81f5e6ffe430c1468d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28629436008cb81f5e6ffe430c1468d9");
        }
        if (d == null) {
            throw new IllegalStateException("MRNNetworkMonitor::createInstance() needs to be called before MRNNetworkMonitor::sharedInstance()");
        }
        return d;
    }

    private m(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566683f1d751449cb2b06b7a9cc1933b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566683f1d751449cb2b06b7a9cc1933b");
        } else {
            this.c = new WeakReference<>(context);
        }
    }
}
