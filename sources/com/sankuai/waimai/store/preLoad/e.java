package com.sankuai.waimai.store.preLoad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public WeakReference<d> b;

    public final View a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f0400178d3413c429db869230e3a98", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f0400178d3413c429db869230e3a98");
        }
        d a2 = a();
        if (a2 != null) {
            return a2.a(i);
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    private d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1a6cf85ca39c361278142a014272b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1a6cf85ca39c361278142a014272b2");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }
}
