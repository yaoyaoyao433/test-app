package com.meituan.android.paycommon.lib.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ExtendableVerticalLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    public boolean b;
    public View c;
    public View d;
    public ValueAnimator e;

    public ExtendableVerticalLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615b036b29ae80af08e8fea6331b3c72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615b036b29ae80af08e8fea6331b3c72");
        } else {
            b();
        }
    }

    public ExtendableVerticalLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5214ce527da3d8808b1ae4011141da74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5214ce527da3d8808b1ae4011141da74");
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7d13172ed70e5a2f0ea6146c7899be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7d13172ed70e5a2f0ea6146c7899be");
        } else {
            setOrientation(1);
        }
    }

    public void setFoldedView(View view) {
        this.c = view;
    }

    public void setExtendedView(View view) {
        this.d = view;
    }

    public View getFoldedView() {
        return this.c;
    }

    public View getExtendedView() {
        return this.d;
    }

    public int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d2a9f6d6d1adf1a28b09f2820a280a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d2a9f6d6d1adf1a28b09f2820a280a")).intValue();
        }
        if (view == null) {
            return 0;
        }
        if (view.getHeight() > 0) {
            return view.getHeight();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c528636da2c83b5e1e4bb390bb161e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c528636da2c83b5e1e4bb390bb161e");
        } else if (this.c == null) {
        } else {
            removeAllViews();
            addView(this.c);
            int a2 = a(this.c);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.height = a2;
            setLayoutParams(layoutParams);
        }
    }

    public static /* synthetic */ void a(ExtendableVerticalLinearLayout extendableVerticalLinearLayout, ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        Object[] objArr = {extendableVerticalLinearLayout, layoutParams, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7c0f0630df36a67a5f5074055b5c2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7c0f0630df36a67a5f5074055b5c2bc");
            return;
        }
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        extendableVerticalLinearLayout.setLayoutParams(layoutParams);
    }
}
