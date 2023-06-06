package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SingleLineLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private final List<View> b;

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f066bcac840ad03be912d7b616efb09e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f066bcac840ad03be912d7b616efb09e") : new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c807aff40f4f84632afabd31ae5be6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c807aff40f4f84632afabd31ae5be6") : new a(getContext(), attributeSet);
    }

    public SingleLineLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7d381436233f69aca73420cd8a3a5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7d381436233f69aca73420cd8a3a5e");
        } else {
            this.b = new ArrayList();
        }
    }

    public SingleLineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b5f271a316cc006e2666f1730abfd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b5f271a316cc006e2666f1730abfd7");
        } else {
            this.b = new ArrayList();
        }
    }

    public SingleLineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053114648fc2afab937ab734c40ac882", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053114648fc2afab937ab734c40ac882");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c603a9b615ef6071f53a6fb79f566884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c603a9b615ef6071f53a6fb79f566884");
            return;
        }
        this.b.clear();
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int size = View.MeasureSpec.getSize(defaultSize);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    layoutParams.width = -2;
                }
                if (layoutParams.height == -1) {
                    layoutParams.height = -2;
                }
                measureChildWithMargins(childAt, defaultSize, 0, i2, 0);
                a aVar = (a) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + aVar.leftMargin + aVar.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + aVar.topMargin + aVar.bottomMargin;
                int i7 = measuredWidth + i3;
                if (i7 > size) {
                    break;
                }
                int max = Math.max(i5, measuredHeight);
                this.b.add(childAt);
                i3 = i7;
                i5 = max;
                i4 = combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        setMeasuredDimension(defaultSize, resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), i2, i4 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e8198d8deba947cc570ae335b2ec84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e8198d8deba947cc570ae335b2ec84");
            return;
        }
        int size = this.b.size();
        int measuredHeight = getMeasuredHeight();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.b.get(i6);
            a aVar = (a) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            int i7 = aVar.leftMargin + i5;
            int max = Math.max((measuredHeight - measuredHeight2) / 2, aVar.topMargin);
            i5 += aVar.leftMargin + measuredWidth + aVar.rightMargin;
            view.layout(i7, max, measuredWidth + i7, measuredHeight2 + max);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feefd3374af274b7696bd080797f6e41", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feefd3374af274b7696bd080797f6e41");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c81873fda8ad83b749e5ac3b6a10a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c81873fda8ad83b749e5ac3b6a10a3")).booleanValue();
        }
        try {
            if (this.b.contains(view)) {
                if (super.drawChild(canvas, view, j)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return super.drawChild(canvas, view, j);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i2) {
            super(-2, -2);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
