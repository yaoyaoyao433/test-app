package com.meituan.android.common.locate.strategy;

import android.content.Context;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a {
    private static a a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int b;
    private Context c;
    private Map<String, Boolean> d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19c1ecb17041928b613a301f075868b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19c1ecb17041928b613a301f075868b7");
            return;
        }
        this.b = 0;
        this.d = new ConcurrentHashMap();
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ea467ef7da270630f6a213e9ab9230d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ea467ef7da270630f6a213e9ab9230d");
            return;
        }
        this.b = 0;
        this.d = new ConcurrentHashMap();
        this.c = context;
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f28b220bfc0f3047d6184804068e0a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f28b220bfc0f3047d6184804068e0a4");
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    public synchronized void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9c1858c319171caaefd943e67334be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9c1858c319171caaefd943e67334be3");
            return;
        }
        if (z) {
            this.d.put(str, Boolean.TRUE);
        } else {
            this.d.remove(str);
        }
        this.b = this.d.size();
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e90240435ef70c30e1aeb3a12d331ed2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e90240435ef70c30e1aeb3a12d331ed2")).booleanValue() : !e.a(this.c).h() || this.b <= 0;
    }
}
