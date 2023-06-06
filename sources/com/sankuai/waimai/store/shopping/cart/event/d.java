package com.sankuai.waimai.store.shopping.cart.event;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public final Activity b;
    public int c;
    private final boolean d;

    public d(Activity activity, boolean z, int i) {
        Object[] objArr = {activity, (byte) 1, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c5ca6eaa09c5bbd63722e2ba674601", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c5ca6eaa09c5bbd63722e2ba674601");
            return;
        }
        this.b = activity;
        this.d = true;
        this.c = i;
    }
}
