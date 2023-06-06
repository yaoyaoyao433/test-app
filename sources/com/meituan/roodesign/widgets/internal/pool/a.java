package com.meituan.roodesign.widgets.internal.pool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.internal.pool.b;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<T extends b> {
    public static ChangeQuickRedirect b;
    private final Queue<T> a;
    public int c;

    public abstract T b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd00de8815bee95f2c79a567d7d32df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd00de8815bee95f2c79a567d7d32df");
            return;
        }
        this.c = 5;
        this.a = new ArrayDeque();
    }

    public final T c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ba83088112c3bba1aa1775940b015a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ba83088112c3bba1aa1775940b015a");
        }
        T poll = this.a.poll();
        return poll == null ? b() : poll;
    }
}
