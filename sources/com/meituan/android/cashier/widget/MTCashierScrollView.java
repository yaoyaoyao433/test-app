package com.meituan.android.cashier.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTCashierScrollView extends ScrollView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private f c;

    public MTCashierScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdcc47fb71ac2548afcbab7c3e9727d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdcc47fb71ac2548afcbab7c3e9727d7");
        }
    }

    public MTCashierScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8048cb09f68d643a25d24ae336e9913", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8048cb09f68d643a25d24ae336e9913");
        }
    }

    public MTCashierScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93e71757a6f301a3da797686c168ae7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93e71757a6f301a3da797686c168ae7");
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a0f0246981e63231010aed5aa86edf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a0f0246981e63231010aed5aa86edf0");
        } else if (this.b) {
            super.scrollTo(i, i2);
        }
    }

    public static /* synthetic */ void a(MTCashierScrollView mTCashierScrollView, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Object[] objArr = {mTCashierScrollView, valueAnimator, valueAnimator2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c4031a0f3a59bdd7f74820065c93b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c4031a0f3a59bdd7f74820065c93b6b");
            return;
        }
        if (!mTCashierScrollView.b) {
            valueAnimator.cancel();
        }
        mTCashierScrollView.scrollTo(mTCashierScrollView.getScrollX(), ((Integer) valueAnimator2.getAnimatedValue()).intValue());
        mTCashierScrollView.invalidate();
    }

    public void setScrollable(boolean z) {
        this.b = z;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d83b43d8f0ff7ff4ecc49071ef3f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d83b43d8f0ff7ff4ecc49071ef3f16");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void setOnScrollChangeListener(f fVar) {
        this.c = fVar;
    }
}
