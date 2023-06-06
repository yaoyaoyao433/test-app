package com.sankuai.xm.base.entity;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b<D> {
    public static ChangeQuickRedirect a;
    private D b;
    private final int c;
    private final Map<String, Object> d;

    public b(D d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7606fd458be3468aefa211718fdc8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7606fd458be3468aefa211718fdc8d");
            return;
        }
        this.d = new HashMap();
        this.b = d;
        this.c = 0;
    }

    public b(int i, D d) {
        Object[] objArr = {Integer.valueOf(i), d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e193457398f4489db2683ec47127f37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e193457398f4489db2683ec47127f37");
            return;
        }
        this.d = new HashMap();
        this.b = d;
        this.c = i;
    }

    @Nullable
    public final D a() {
        return this.b;
    }

    public final boolean a(int i) {
        return this.c == 1;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a08b3872200741cab13a8c88c9aa4f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a08b3872200741cab13a8c88c9aa4f");
        }
        return "Event{mData=" + this.b + ", mType=" + this.c + ", mExtra=" + this.d + '}';
    }
}
