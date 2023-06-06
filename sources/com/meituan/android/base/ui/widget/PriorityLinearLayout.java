package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PriorityLinearLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    public Comparator b;
    private int c;
    private boolean d;
    private ArrayList<View> e;
    private int f;
    private int g;

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca731408421f68684913bd54767c550", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca731408421f68684913bd54767c550") : new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f266a1c186e6d7825ed999ff82b9e0", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f266a1c186e6d7825ed999ff82b9e0") : new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98d5f8151eccea3cf566dd723c2585b", RobustBitConfig.DEFAULT_VALUE) ? (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98d5f8151eccea3cf566dd723c2585b") : new a(layoutParams);
    }

    public PriorityLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd49c4cba30a423ecd71a86cdb76bb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd49c4cba30a423ecd71a86cdb76bb4");
            return;
        }
        this.c = 0;
        this.f = 8388659;
        this.b = new Comparator<View>() { // from class: com.meituan.android.base.ui.widget.PriorityLinearLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(View view, View view2) {
                View view3 = view;
                View view4 = view2;
                Object[] objArr2 = {view3, view4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "276a72ad070f593df6f33ec2f8080a72", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "276a72ad070f593df6f33ec2f8080a72")).intValue() : ((a) view3.getLayoutParams()).a - ((a) view4.getLayoutParams()).a;
            }
        };
    }

    public PriorityLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7445f7f673115f85056e14e3c5e5dfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7445f7f673115f85056e14e3c5e5dfb");
            return;
        }
        this.c = 0;
        this.f = 8388659;
        this.b = new Comparator<View>() { // from class: com.meituan.android.base.ui.widget.PriorityLinearLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(View view, View view2) {
                View view3 = view;
                View view4 = view2;
                Object[] objArr2 = {view3, view4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "276a72ad070f593df6f33ec2f8080a72", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "276a72ad070f593df6f33ec2f8080a72")).intValue() : ((a) view3.getLayoutParams()).a - ((a) view4.getLayoutParams()).a;
            }
        };
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8a67afb37c2b9e67cd946e024e20828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8a67afb37c2b9e67cd946e024e20828");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.priority_layout_gravity}, i, 0);
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int min;
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124bade6bcd1c5cb6c9944c35f99d8f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124bade6bcd1c5cb6c9944c35f99d8f9");
            return;
        }
        int childCount = getChildCount();
        if (this.e == null) {
            this.e = new ArrayList<>(childCount);
        } else {
            this.e.clear();
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                this.e.add(childAt);
            }
        }
        Collections.sort(this.e, this.b);
        if (this.c == 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int i6 = Integer.MIN_VALUE;
            if (mode == Integer.MIN_VALUE) {
                i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                mode = 1073741824;
            } else {
                i3 = i;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                this.g = size;
                Iterator<View> it = this.e.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    View next = it.next();
                    a aVar = (a) next.getLayoutParams();
                    if (this.g > 0) {
                        aVar.b = z;
                        int i8 = aVar.leftMargin + aVar.rightMargin;
                        int i9 = aVar.bottomMargin + aVar.topMargin;
                        if (mode2 == 0) {
                            min = aVar.height >= 0 ? aVar.height : -1;
                        } else {
                            min = aVar.height >= 0 ? Math.min(size2 - i9, aVar.height) : size2 - i9;
                        }
                        int makeMeasureSpec = min >= 0 ? View.MeasureSpec.makeMeasureSpec(min, i6) : View.MeasureSpec.makeMeasureSpec(0, 0);
                        if (aVar.width == -2 || aVar.width >= 0) {
                            next.measure(View.MeasureSpec.makeMeasureSpec(this.g - i8, Integer.MIN_VALUE), makeMeasureSpec);
                            int measuredWidth = next.getMeasuredWidth();
                            i7 = Math.max(i7, next.getMeasuredHeight() + i9);
                            this.g -= measuredWidth + i8;
                        } else if (aVar.width == -1) {
                            next.measure(View.MeasureSpec.makeMeasureSpec(this.g - i8, 1073741824), makeMeasureSpec);
                            i7 = Math.max(i7, next.getMeasuredHeight() + i9);
                            this.g = 0;
                        }
                    } else {
                        aVar.b = false;
                    }
                    i6 = Integer.MIN_VALUE;
                    z = true;
                }
                if (i7 > 0 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                    i4 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                    this.d = true;
                }
            }
            i4 = i2;
            this.d = true;
        } else {
            i3 = i;
            i4 = i2;
        }
        super.onMeasure(i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269661dec8c7b78396058013fcbb481a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269661dec8c7b78396058013fcbb481a");
        } else if (this.c == 0 && this.d) {
            int i5 = ((this.f & 7) == 1 && this.g > 0) ? this.g / 2 : 0;
            int childCount = getChildCount();
            int height = getHeight();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                a aVar = (a) childAt.getLayoutParams();
                int i8 = aVar.leftMargin;
                int i9 = aVar.rightMargin;
                int i10 = aVar.topMargin;
                int i11 = aVar.bottomMargin;
                if (childAt.getVisibility() != 8 && aVar.b) {
                    int i12 = i5 + i8;
                    int measuredWidth = childAt.getMeasuredWidth() + i12;
                    if ((aVar.gravity & 80) == 80) {
                        i6 = (height - childAt.getMeasuredHeight()) - i11;
                    } else if ((aVar.gravity & 48) == 48) {
                        i6 = i10;
                    } else if ((aVar.gravity & 16) == 16) {
                        i6 = (height - childAt.getMeasuredHeight()) / 2;
                    }
                    childAt.layout(i12, i6, measuredWidth, childAt.getMeasuredHeight() + i6);
                    i5 = measuredWidth + i9;
                }
            }
        }
    }

    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2335c28bdcf0517f0dae194e9228b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2335c28bdcf0517f0dae194e9228b6");
        } else if (this.f != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f = i;
            requestLayout();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends LinearLayout.LayoutParams {
        public int a;
        public boolean b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = true;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.priority});
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(-2, -2);
            this.b = true;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = true;
        }
    }
}
