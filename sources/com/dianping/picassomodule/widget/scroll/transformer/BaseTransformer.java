package com.dianping.picassomodule.widget.scroll.transformer;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseTransformer implements ViewPager.PageTransformer {
    public static ChangeQuickRedirect a;
    public int b;

    public abstract void a(View view, float f);

    @Override // android.support.v4.view.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0e87b1c756be44bf5c422f056716cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0e87b1c756be44bf5c422f056716cc7");
            return;
        }
        Object[] objArr2 = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "490e407ca064e5f317b1788d6f10763c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "490e407ca064e5f317b1788d6f10763c");
        } else {
            this.b = view.getWidth();
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationY(0.0f);
            view.setTranslationX((-this.b) * f);
        }
        a(view, f);
    }
}
