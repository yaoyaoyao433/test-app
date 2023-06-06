package com.meituan.android.customerservice.cscallsdk;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class d {
    public static ChangeQuickRedirect o;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i, int i2, int i3);
    }

    public abstract void a(Context context, com.meituan.android.customerservice.callbase.base.c cVar, byte b2, String str, com.meituan.android.pike.a aVar, HashMap<String, Object> hashMap);

    public abstract void a(com.meituan.android.customerservice.cscallsdk.b bVar);

    public abstract void a(a aVar);

    public abstract void a(c cVar);

    public abstract void a(String str);

    public abstract void a(String str, short s, HashMap<String, String> hashMap, com.meituan.android.customerservice.callbase.base.b bVar);

    public abstract void a(boolean z);

    public abstract void b(com.meituan.android.customerservice.cscallsdk.b bVar);

    public abstract void b(a aVar);

    public abstract void b(c cVar);

    public abstract void b(boolean z);

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract e g();

    public abstract com.meituan.android.customerservice.callbase.base.c h();

    public abstract int i();

    public static d j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7fcc58806e48e11bc8f4dcefe718151", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7fcc58806e48e11bc8f4dcefe718151") : b.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class b {
        private static final d a = com.meituan.android.customerservice.cscallsdk.c.c();
    }
}
