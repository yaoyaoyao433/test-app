package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static WeakReference<c> b;

    public static View a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e18e4768d8bb789e2eece431f99fd110", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e18e4768d8bb789e2eece431f99fd110");
        }
        c a2 = a();
        if (a2 != null) {
            return a2.a(i);
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    private static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51c0f5a511dbfcf648ee522b61699fb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51c0f5a511dbfcf648ee522b61699fb0");
        }
        if (b == null) {
            return null;
        }
        return b.get();
    }
}
