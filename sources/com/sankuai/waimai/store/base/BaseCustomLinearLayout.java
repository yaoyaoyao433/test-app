package com.sankuai.waimai.store.base;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseCustomLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    protected View b;
    protected Context c;
    private int d;

    public int getLayoutId() {
        return -1;
    }

    public BaseCustomLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4d5813f608158f2ca2928028ff6a88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4d5813f608158f2ca2928028ff6a88");
            return;
        }
        this.b = null;
        this.d = -1;
        this.c = context;
        a();
    }

    public BaseCustomLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abef318503efaf9d9adcc2eb62dd57aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abef318503efaf9d9adcc2eb62dd57aa");
            return;
        }
        this.b = null;
        this.d = -1;
        this.c = context;
        a();
    }

    public BaseCustomLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a50002cc72c373c030717a25e75a0fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a50002cc72c373c030717a25e75a0fe");
            return;
        }
        this.b = null;
        this.d = -1;
        this.c = context;
        a();
    }

    @RequiresApi(api = 21)
    public BaseCustomLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f0a77eec2c2a0c0b86a34eac7b79b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f0a77eec2c2a0c0b86a34eac7b79b9");
            return;
        }
        this.b = null;
        this.d = -1;
        a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b449a64432ddb0d79a04655b07a24ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b449a64432ddb0d79a04655b07a24ac2");
            return;
        }
        super.onMeasure(i, i2);
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45bb2cc417e1595dd24365d6316e117e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45bb2cc417e1595dd24365d6316e117e");
        } else if (this.d >= 0 && getMeasuredHeight() > this.d) {
            a(this);
            measure(i, View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a42df47ca74a409a51af4eda18c34e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a42df47ca74a409a51af4eda18c34e");
            return;
        }
        view.forceLayout();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i));
            }
        }
    }

    public void setMaximumHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6fc976da129c9f82c6dac5a5f0fd0ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6fc976da129c9f82c6dac5a5f0fd0ef");
            return;
        }
        this.d = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd1787120073f0d62a02759ca762414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd1787120073f0d62a02759ca762414");
        } else {
            super.setMinimumHeight(i);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aba9e2cbd3f92b740dba34320b497ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aba9e2cbd3f92b740dba34320b497ea");
            return;
        }
        int layoutId = getLayoutId();
        if (-1 != layoutId) {
            this.b = LayoutInflater.from(getContext()).inflate(layoutId, (ViewGroup) this, true);
        }
        this.b = b(this.b);
    }

    private View b(View view) {
        return this.b != null ? this : this.b;
    }
}
