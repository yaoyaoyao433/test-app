package com.sankuai.waimai.platform.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HorizontalFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private final List<Integer> b;
    private final List<a> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Drawable j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        int d;

        private a(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58659ffe3da5b5c0b2565ef2d2afab63", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58659ffe3da5b5c0b2565ef2d2afab63");
                return;
            }
            this.c = i;
            this.d = i2;
            this.b = i3;
        }
    }

    public HorizontalFlowLayout(Context context) {
        this(context, 25, 5, 5);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e12af96e577e70696b773e2761fc588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e12af96e577e70696b773e2761fc588");
        }
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7759d4f0596ebf0c65c64eda8ecf2ce2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7759d4f0596ebf0c65c64eda8ecf2ce2");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        a(context, attributeSet);
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695cc52fbd4f50a1629311d68ab946a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695cc52fbd4f50a1629311d68ab946a3");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd4d64ed779d29c8347662eb971c7fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd4d64ed779d29c8347662eb971c7fb");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04702378cc581a0fcba05ca90f51d5a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04702378cc581a0fcba05ca90f51d5a6");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927, 16843091, R.attr.childDivider, R.attr.childHeight, R.attr.childMarginHorizontal, R.attr.childMarginVertical, R.attr.childWidthWeight});
        this.d = (int) obtainStyledAttributes.getDimension(3, g.a(context, 25.0f));
        this.e = (int) obtainStyledAttributes.getDimension(4, g.a(context, 5.0f));
        this.f = (int) obtainStyledAttributes.getDimension(5, g.a(context, 5.0f));
        this.h = obtainStyledAttributes.getInt(0, this.h);
        this.g = obtainStyledAttributes.getInt(1, 0);
        this.j = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
    }

    public HorizontalFlowLayout(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1472d20ed270aa691c936fbfd6d05d25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1472d20ed270aa691c936fbfd6d05d25");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a25dbd3106e3ff39a8dd34f6745e110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a25dbd3106e3ff39a8dd34f6745e110");
            return;
        }
        this.d = g.a(getContext(), i);
        this.e = g.a(getContext(), i2);
        this.f = g.a(getContext(), i3);
    }

    public void setMaxLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db6beb01b6cbc57b801e726577a1166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db6beb01b6cbc57b801e726577a1166");
        } else if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setChildHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393a82e4e91570cabf841e08f5744823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393a82e4e91570cabf841e08f5744823");
        } else if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841cee7727c20a0943dde45bb2d1d906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841cee7727c20a0943dde45bb2d1d906");
        } else if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int size;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d61da678dae379ed5f7e103610c5908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d61da678dae379ed5f7e103610c5908");
            return;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int a2 = a(defaultSize);
        Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2e6207e5f708431b13c8fcda9a4c451", RobustBitConfig.DEFAULT_VALUE)) {
            size = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2e6207e5f708431b13c8fcda9a4c451")).intValue();
        } else {
            Object[] objArr3 = {Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3167ed5491022a16025adb245073eda9", RobustBitConfig.DEFAULT_VALUE)) {
                paddingTop = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3167ed5491022a16025adb245073eda9")).intValue();
            } else {
                paddingTop = getPaddingTop() + getPaddingBottom();
                if (a2 > 0) {
                    paddingTop += (this.d * a2) + (this.f * (a2 - 1));
                }
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingTop, size);
            } else if (mode != 1073741824) {
                size = paddingTop;
            }
        }
        setMeasuredDimension(defaultSize, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.HorizontalFlowLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount;
        int i = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e6dcf7968243990decf3d721c8a902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e6dcf7968243990decf3d721c8a902");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.j == null || (childCount = getChildCount()) <= 1) {
            return;
        }
        int intrinsicWidth = this.j.getIntrinsicWidth();
        int intrinsicHeight = this.j.getIntrinsicHeight();
        this.j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int i2 = intrinsicWidth / 2;
        int i3 = intrinsicHeight / 2;
        View childAt = getChildAt(0);
        while (i < childCount) {
            View childAt2 = getChildAt(i);
            if (childAt2.getBottom() == childAt.getBottom()) {
                canvas.save();
                canvas.translate(((childAt.getRight() + childAt2.getLeft()) / 2) - i2, ((childAt2.getTop() + childAt2.getBottom()) / 2) - i3);
                this.j.draw(canvas);
                canvas.restore();
            }
            i++;
            childAt = childAt2;
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98edb8d5c94938164394739627e73c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98edb8d5c94938164394739627e73c7")).intValue();
        }
        int childCount = this.i < 0 ? getChildCount() : Math.min(this.i, getChildCount());
        if (childCount == 0) {
            return 0;
        }
        this.b.clear();
        this.c.clear();
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft <= 0) {
            return 0;
        }
        a aVar = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(paddingLeft | 0, this.d | 1073741824);
            int measuredWidth = childAt.getMeasuredWidth();
            int i5 = i2 + measuredWidth;
            if (i5 > paddingLeft) {
                if (this.g > 0 && i3 + 1 >= this.g) {
                    break;
                }
                if (aVar != null) {
                    this.b.add(Integer.valueOf(paddingLeft - aVar.d));
                }
                i3++;
                a aVar2 = new a(0, measuredWidth, i3);
                this.c.add(aVar2);
                aVar = aVar2;
                i2 = measuredWidth + this.e;
            } else {
                aVar = new a(i2, i5, i3);
                this.c.add(aVar);
                i2 = i5 + this.e;
            }
        }
        if (aVar != null) {
            this.b.add(Integer.valueOf(paddingLeft - aVar.d));
        }
        int size = this.c.size();
        for (int i6 = 0; i6 < size; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 != null) {
                childAt2.setVisibility(0);
            }
        }
        while (size < childCount) {
            View childAt3 = getChildAt(size);
            if (childAt3 != null) {
                childAt3.setVisibility(8);
            }
            size++;
        }
        return i3 + 1;
    }

    private Integer b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f0e727bc86cb21a6d933d2825a9e9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f0e727bc86cb21a6d933d2825a9e9c");
        }
        if (i < 0 || i >= this.b.size()) {
            return 0;
        }
        return this.b.get(i);
    }

    public int getFirstLineShownItemCount() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f11c82f8ecf6a1a1ca37d6c14bdff5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f11c82f8ecf6a1a1ca37d6c14bdff5f")).intValue();
        }
        Object[] objArr2 = {1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3d684237ed6a688ff3d03ae501e6362", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3d684237ed6a688ff3d03ae501e6362")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        for (a aVar : this.c) {
            if (aVar != null && aVar.b == 1) {
                i++;
            }
        }
        return i;
    }

    public int getShownItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ca4b9cb581790250084f05fff8f922", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ca4b9cb581790250084f05fff8f922")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    public void setMaxChildrenNum(int i) {
        this.i = i;
    }
}
