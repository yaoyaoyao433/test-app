package com.sankuai.waimai.restaurant.shopcart.viewHolder;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    @NonNull
    public final View b;
    protected String c;
    protected String d;
    protected boolean e;

    public a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77d60974e68286eac2956417c079428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77d60974e68286eac2956417c079428");
            return;
        }
        this.c = "";
        this.d = "";
        this.e = false;
        this.b = view;
    }

    public final <V extends View> V a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf((int) R.id.img_foodCount_add)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12acf4ea47e8f5f7868134b65ea67f2f", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12acf4ea47e8f5f7868134b65ea67f2f") : (V) this.b.findViewById(R.id.img_foodCount_add);
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void a(boolean z) {
        this.e = z;
    }
}
