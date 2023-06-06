package com.sankuai.android.spawn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.spawn.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    private static AbstractC0545a<b> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.spawn.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0545a<T> {
        public static ChangeQuickRedirect a;
        private volatile T b;

        public abstract T b();

        public final T a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c8b0b6dab766208d3edf003d8f0057", 6917529027641081856L)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c8b0b6dab766208d3edf003d8f0057");
            }
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = b();
                    }
                }
            }
            return this.b;
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cec54110f959bc65f3eee9d88107d4ac", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cec54110f959bc65f3eee9d88107d4ac");
        }
        if (c == null) {
            return null;
        }
        return c.a();
    }
}
