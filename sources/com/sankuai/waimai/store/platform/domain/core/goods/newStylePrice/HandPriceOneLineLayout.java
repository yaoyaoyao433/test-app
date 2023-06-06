package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HandPriceOneLineLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private final List<View> b;
    private final List<View> c;
    private final List<View> d;

    public HandPriceOneLineLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a24a1711dd2398e25a948d4d281f83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a24a1711dd2398e25a948d4d281f83");
        }
    }

    public HandPriceOneLineLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1791478985095ca67aba5a0c2cb5873e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1791478985095ca67aba5a0c2cb5873e");
        }
    }

    public HandPriceOneLineLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7d82f5811dd9828707d737cc988348", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7d82f5811dd9828707d737cc988348");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public void setPriorityViews(List<View> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45fc6b34db1ba870b52edac44faa125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45fc6b34db1ba870b52edac44faa125");
            return;
        }
        this.b.clear();
        if (list != null) {
            this.b.addAll(list);
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82faca7fe742c73e2a6e46bc2665c668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82faca7fe742c73e2a6e46bc2665c668");
            return;
        }
        super.onMeasure(i, i2);
        this.c.clear();
        this.d.clear();
        a(this.c, this.d);
        a(getMustBeLayoutViewsTotalWidth());
    }

    private void a(int i) {
        int measuredWidth;
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9042999b5e3bba49fe81696243af79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9042999b5e3bba49fe81696243af79");
            return;
        }
        int i3 = i;
        int i4 = 0;
        while (i4 < this.d.size()) {
            View view = this.d.get(i4);
            Object[] objArr2 = new Object[i2];
            objArr2[0] = view;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17597a5359d53e73b07859ad41a43f64", RobustBitConfig.DEFAULT_VALUE)) {
                measuredWidth = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17597a5359d53e73b07859ad41a43f64")).intValue();
            } else if (view.getVisibility() == 8) {
                measuredWidth = 0;
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                measureChildWithMargins(view, getMeasuredWidthAndState(), 0, getMeasuredHeightAndState(), 0);
                measuredWidth = view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            }
            i3 += measuredWidth;
            if (i3 > getMeasuredWidth()) {
                break;
            }
            i4++;
            i2 = 1;
        }
        while (i4 < this.d.size()) {
            this.d.get(i4).setVisibility(8);
            i4++;
        }
    }

    private int getMustBeLayoutViewsTotalWidth() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9affe6fb1592676da80cd0e579af3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9affe6fb1592676da80cd0e579af3d")).intValue();
        }
        for (View view : this.c) {
            i += view.getMeasuredWidth();
        }
        return i;
    }

    private void a(@NonNull List<View> list, @NonNull List<View> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2645b8107422e7540ada00fb9dfdcfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2645b8107422e7540ada00fb9dfdcfe");
            return;
        }
        View[] viewArr = new View[this.b.size()];
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int indexOf = this.b.indexOf(childAt);
                if (indexOf >= 0) {
                    viewArr[indexOf] = childAt;
                } else {
                    list.add(childAt);
                }
            }
        }
        for (View view : viewArr) {
            if (view != null) {
                list2.add(view);
            }
        }
    }
}
