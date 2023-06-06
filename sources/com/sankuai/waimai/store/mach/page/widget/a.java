package com.sankuai.waimai.store.mach.page.widget;

import android.content.Context;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    static float b = (float) (Math.log(0.78d) / Math.log(0.9d));
    static float c = ViewConfiguration.getScrollFriction();
    static float d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2906bfb6f0e0651f9895cdbb6ff28ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2906bfb6f0e0651f9895cdbb6ff28ac");
        } else {
            d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }
    }
}
