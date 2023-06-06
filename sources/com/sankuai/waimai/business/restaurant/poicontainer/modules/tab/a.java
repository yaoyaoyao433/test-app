package com.sankuai.waimai.business.restaurant.poicontainer.modules.tab;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected final Context b;

    public abstract View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void a(int i, int i2, int i3);

    public abstract void a(ViewPager viewPager);

    public abstract void a(com.sankuai.waimai.business.restaurant.poicontainer.modules.paged.a aVar);

    public abstract void a(String str);

    public abstract String[] a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff5095f887c79b417289434100f5327", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff5095f887c79b417289434100f5327");
        } else {
            this.b = context;
        }
    }

    public final View a(View view, @IdRes int i) {
        Object[] objArr = {view, Integer.valueOf((int) R.id.tab_container)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b034ebd3ce5340a7095b7097947e028", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b034ebd3ce5340a7095b7097947e028");
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.tab_container);
        if (viewGroup != null) {
            View a2 = a(LayoutInflater.from(this.b), viewGroup);
            viewGroup.removeAllViews();
            viewGroup.addView(a2);
            return a2;
        }
        return null;
    }
}
