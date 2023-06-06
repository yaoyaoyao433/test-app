package com.meituan.android.paybase.widgets.label;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.android.paybase.screen.AutoFitLinearLayout;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a extends AutoFitLinearLayout {
    public static ChangeQuickRedirect a;

    public a(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5e934c034d792643b034f7aefc26c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5e934c034d792643b034f7aefc26c5");
        } else {
            setOrientation(0);
        }
    }

    public void a(List<Label> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7ff15d8bf8c171ebad8841cc7fcebfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7ff15d8bf8c171ebad8841cc7fcebfb");
            return;
        }
        i.a((List) list);
        if (i.a((Collection) list)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i >= 0 && i2 >= i) {
                return;
            }
            LabelView labelView = new LabelView(getContext());
            labelView.setLabel(list.get(i2));
            addView(labelView);
        }
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae37a8f98695bbf18077369f949a333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae37a8f98695bbf18077369f949a333");
            return;
        }
        if (View.MeasureSpec.getMode(i) != 0) {
            view.measure(0, 0);
            if ((((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) - view.getMeasuredWidth()) - i2 < 0) {
                view.setVisibility(8);
                if (view == getChildAt(0)) {
                    setVisibility(8);
                }
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }
}
