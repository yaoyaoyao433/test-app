package com.dianping.titans.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ZIndexFrameLayout extends ViewGroup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final SparseIntArray indexHeightMap;

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    public ZIndexFrameLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "177b7c663314671c86f066a5647a1515", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "177b7c663314671c86f066a5647a1515");
        }
    }

    public ZIndexFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aee9c075124028d8019a8cc380cefb29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aee9c075124028d8019a8cc380cefb29");
        }
    }

    public ZIndexFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b65c3e5f5bf1544faedc47075066553", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b65c3e5f5bf1544faedc47075066553");
            return;
        }
        this.indexHeightMap = new SparseIntArray();
        init(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public ZIndexFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e15aa787fa773f4b4220cfd014f04b53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e15aa787fa773f4b4220cfd014f04b53");
            return;
        }
        this.indexHeightMap = new SparseIntArray();
        init(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "101ae8c14edb96204d50dd532c03bbb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "101ae8c14edb96204d50dd532c03bbb5");
            return;
        }
        this.indexHeightMap.clear();
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = size;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!z && layoutParams.width == -1) {
                    z = true;
                }
                int i7 = layoutParams.zIndex;
                int i8 = this.indexHeightMap.get(i7);
                i3 = i8 == 0 ? size : i3 - i8;
                measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(i3, mode));
                int measuredHeight = i8 + childAt.getMeasuredHeight();
                this.indexHeightMap.put(i7, measuredHeight);
                i4 = Math.max(i4, childAt.getMeasuredWidth());
                i5 = Math.max(i5, measuredHeight);
            }
        }
        setMeasuredDimension(i4, i5);
        if (z) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt2 = getChildAt(i9);
                if (childAt2.getVisibility() != 8 && ((LayoutParams) childAt2.getLayoutParams()).width == -1) {
                    measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), mode));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "718edf25b798d823c2b7f244b47c1b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "718edf25b798d823c2b7f244b47c1b79");
            return;
        }
        int childCount = getChildCount();
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int i8 = ((LayoutParams) childAt.getLayoutParams()).zIndex;
                if (i5 != i8) {
                    i5 = i8;
                    i6 = 0;
                }
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(i, i6, childAt.getMeasuredWidth() + i, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    private int findIndexByZIndex(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e50bb520f277e5486d6ee0790f446f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e50bb520f277e5486d6ee0790f446f9")).intValue();
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            if (layoutParams.zIndex > i) {
                return i2;
            }
            if (layoutParams.zIndex == i && z) {
                return i2;
            }
        }
        return childCount;
    }

    public void addViewZIndexCare(View view, boolean z, LayoutParams layoutParams) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b0eda9e6e72d41502a19f8699d3a13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b0eda9e6e72d41502a19f8699d3a13b");
        } else {
            addView(view, findIndexByZIndex(layoutParams.zIndex, z), layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a65f97b498f2615ef4f34e84f709d558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a65f97b498f2615ef4f34e84f709d558");
            return;
        }
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!(layoutParams instanceof LayoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        if (i == -1) {
            i = getChildCount();
        }
        int i3 = ((LayoutParams) layoutParams).zIndex;
        int findIndexByZIndex = findIndexByZIndex(i3, true);
        if (i != findIndexByZIndex) {
            i2 = findIndexByZIndex(i3, false);
        } else {
            i2 = findIndexByZIndex;
            findIndexByZIndex = i;
        }
        if (i != i2) {
            i = findIndexByZIndex;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ae2abd81cb8d5cb413f020165fd39bd", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ae2abd81cb8d5cb413f020165fd39bd") : new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99c3eb5245e610f6642a5eb3ca08dfe8", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99c3eb5245e610f6642a5eb3ca08dfe8") : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc57b15ce5f62e4bfe601cafb68b135e", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc57b15ce5f62e4bfe601cafb68b135e") : new LayoutParams(-1, -2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int zIndex;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.zIndex});
            if (obtainStyledAttributes != null) {
                try {
                    this.zIndex = obtainStyledAttributes.getInt(0, 0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof LayoutParams) {
                this.zIndex = ((LayoutParams) layoutParams).zIndex;
            }
        }
    }
}
