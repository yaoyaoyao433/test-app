package com.sankuai.waimai.machpro.component.swiper_v2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements MPViewPager.d {
    public static ChangeQuickRedirect a;
    private final int b;

    public c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed18767e58ccde1bab62a7da6fb6e240", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed18767e58ccde1bab62a7da6fb6e240");
        } else {
            this.b = i;
        }
    }

    @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.d
    public final void a(@NonNull View view, float f) {
        MPViewPager mPViewPager;
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956a8da7bebb170ef361a6aa98e6e6a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956a8da7bebb170ef361a6aa98e6e6a2");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b16964b3f5a3304a9175e78962bac74d", RobustBitConfig.DEFAULT_VALUE)) {
            mPViewPager = (MPViewPager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b16964b3f5a3304a9175e78962bac74d");
        } else {
            ViewParent parent = view.getParent();
            ViewParent parent2 = parent.getParent();
            if ((parent instanceof RecyclerView) && (parent2 instanceof MPViewPager)) {
                mPViewPager = (MPViewPager) parent2;
            } else {
                throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
            }
        }
        float f2 = this.b * f;
        if (mPViewPager.getOrientation() == 0) {
            if (mPViewPager.b()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}
