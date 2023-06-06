package com.sankuai.waimai.platform.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AutoWrapHorizontalLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    public boolean b;
    private final int c;
    private final int d;
    private final int e;
    private a f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public AutoWrapHorizontalLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f989449bbad11f4677cc44198f49de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f989449bbad11f4677cc44198f49de");
        }
    }

    public AutoWrapHorizontalLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483a655b932c1cdd4780f0062aac8f69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483a655b932c1cdd4780f0062aac8f69");
        }
    }

    public AutoWrapHorizontalLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d7b7b21aafc8797663160a85a784de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d7b7b21aafc8797663160a85a784de");
            return;
        }
        this.b = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.vertical_divider, R.attr.horizontal_divider, R.attr.max_lines}, 0, 0);
        try {
            this.c = obtainStyledAttributes.getDimensionPixelSize(1, 15);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 10);
            this.e = obtainStyledAttributes.getInteger(2, 1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setExposeCallback(a aVar) {
        this.f = aVar;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6371cea7f32f46bafe5a6b8f327f217d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6371cea7f32f46bafe5a6b8f327f217d");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i3 += this.c + measuredWidth;
            if (i3 >= size) {
                i3 = i3 > size ? this.c + measuredWidth : 0;
                i5++;
            }
            if (i5 >= 2 && i6 == childCount - 1 && i3 > 0) {
                i5++;
            }
            if (i5 >= this.e) {
                break;
            }
            i4 = ((i5 + 1) * measuredHeight) + (this.d * i5);
        }
        setMeasuredDimension(size, i4);
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e105f96467c0510feafb0452ba45165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e105f96467c0510feafb0452ba45165");
            return;
        }
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i6 + measuredWidth > i5) {
                i7++;
                i8 = (i7 * measuredHeight) + (this.d * i7);
                i6 = 0;
            }
            int i10 = measuredWidth + i6;
            childAt.layout(i6, i8, i10, measuredHeight + i8);
            i6 = this.c + i10;
        }
    }
}
