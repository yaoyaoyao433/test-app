package com.sankuai.waimai.business.page.common.view.listfloat;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public View b;
    public Activity c;
    public LinearLayout d;
    public RelativeLayout e;
    public TextView f;

    public d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f89af460823ea0ddbdd17deca920ea60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f89af460823ea0ddbdd17deca920ea60");
        } else {
            this.c = activity;
        }
    }

    public int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c1fc556618fb3931d8d815bd6d0740", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c1fc556618fb3931d8d815bd6d0740")).intValue();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        return view.getMeasuredWidth();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private View b;

        public a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c296a2c1570297344bfd8d3a0f0907b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c296a2c1570297344bfd8d3a0f0907b4");
            } else {
                this.b = view;
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb7a97c32ae875c4f7aaf5f1c1fe9cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb7a97c32ae875c4f7aaf5f1c1fe9cd");
            } else if (this.b != null) {
                ah.b(this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue(), Integer.MIN_VALUE);
            }
        }
    }
}
