package com.sankuai.titans.base.titlebar;

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
/* loaded from: classes4.dex */
public class ZIndexFrameLayout extends ViewGroup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final SparseIntArray indexHeightMap;

    public ZIndexFrameLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "166f725aa6bd598d7b2da6184bd63d40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "166f725aa6bd598d7b2da6184bd63d40");
        }
    }

    public ZIndexFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "317c700ed769681f99caf215555ac841", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "317c700ed769681f99caf215555ac841");
        }
    }

    public ZIndexFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce40f7e22ee6af3e77ff461394d9148", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce40f7e22ee6af3e77ff461394d9148");
        } else {
            this.indexHeightMap = new SparseIntArray();
        }
    }

    @TargetApi(21)
    public ZIndexFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eac42e9de237893eccc8756216b7b81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eac42e9de237893eccc8756216b7b81");
        } else {
            this.indexHeightMap = new SparseIntArray();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c172ad5f5f2a832beefa66da701dda9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c172ad5f5f2a832beefa66da701dda9e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef6352030e3ecafdf35aae31a76cca31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef6352030e3ecafdf35aae31a76cca31");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12165ae8b36da7d5c134c5c46fa0a971", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12165ae8b36da7d5c134c5c46fa0a971")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dad852c85b15d309ab5667906906a2e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dad852c85b15d309ab5667906906a2e8");
        } else {
            addView(view, findIndexByZIndex(layoutParams.zIndex, z), layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88bdef5505b74e9eb84a9830bd27ca00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88bdef5505b74e9eb84a9830bd27ca00");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d00ecb9454e5ca9dc76c8105f3a03fd4", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d00ecb9454e5ca9dc76c8105f3a03fd4") : new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de29b61820785101857a488ea5da0b24", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de29b61820785101857a488ea5da0b24") : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c936d98bb529476455a0f296d9093d8", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c936d98bb529476455a0f296d9093d8") : new LayoutParams(-1, -2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
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
