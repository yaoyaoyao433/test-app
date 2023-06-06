package com.meituan.android.base.ui.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"DrawAllocation"})
/* loaded from: classes2.dex */
public class TagsLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private float c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private List<Integer> l;
    private SparseIntArray m;
    private SparseIntArray n;
    private int o;
    private int p;
    private SparseArray<List<Integer>> q;

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced075193dbe6411392c9608609ef502", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced075193dbe6411392c9608609ef502") : new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7512e98b7cf687e1c12150ffbffa51", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7512e98b7cf687e1c12150ffbffa51") : new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aafad0f3905a534a32de0c7706c7bf87", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aafad0f3905a534a32de0c7706c7bf87") : new a(layoutParams);
    }

    public TagsLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38253b43340d45ea5b178c8e02582d87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38253b43340d45ea5b178c8e02582d87");
        }
    }

    public TagsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed67b0965d9268671e55dec60c737b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed67b0965d9268671e55dec60c737b4");
        }
    }

    public TagsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6610bbe11c3ae17c86bf5ca6ae8ac6cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6610bbe11c3ae17c86bf5ca6ae8ac6cd");
            return;
        }
        this.b = -3;
        this.c = 1.0f;
        this.g = 0;
        this.h = 0;
        this.l = new ArrayList();
        this.m = new SparseIntArray();
        this.n = new SparseIntArray();
        this.p = 0;
        this.q = new SparseArray<>();
        this.o = context.getResources().getDisplayMetrics().widthPixels;
        a(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public TagsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22e87119958948194fffe8987eeedbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22e87119958948194fffe8987eeedbc");
            return;
        }
        this.b = -3;
        this.c = 1.0f;
        this.g = 0;
        this.h = 0;
        this.l = new ArrayList();
        this.m = new SparseIntArray();
        this.n = new SparseIntArray();
        this.p = 0;
        this.q = new SparseArray<>();
        this.o = context.getResources().getDisplayMetrics().widthPixels;
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c4e89cee3acc48876f1767e24db31c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c4e89cee3acc48876f1767e24db31c");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.horizontalSpace, R.attr.verticalSpace, R.attr.tagMaxWidth, R.attr.maxWidthScale, R.attr.rowAlign, R.attr.rowGravity, R.attr.maxRowCount, R.attr.rowSplitParts, R.attr.tagMultipleMax}, i, i2);
        if (obtainStyledAttributes.hasValue(2)) {
            this.b = obtainStyledAttributes.getLayoutDimension(2, "tagMaxWidth");
        } else {
            this.b = -3;
        }
        this.c = obtainStyledAttributes.getFloat(3, 1.0f);
        this.d = obtainStyledAttributes.getInt(4, -3);
        this.e = obtainStyledAttributes.getInt(5, -1);
        this.f = obtainStyledAttributes.getInt(6, 1);
        this.k = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        a(obtainStyledAttributes.getInt(7, 0), obtainStyledAttributes.getInt(8, 0));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.base.ui.widget.TagsLayout.onMeasure(int, int):void");
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732b9de68b8529871f0825e0bcd28523", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732b9de68b8529871f0825e0bcd28523")).booleanValue() : this.f < 0 || i <= this.f;
    }

    public List<Integer> getVisibleChildrenList() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a3d5d91fdd2768e0d3027eba4c9627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a3d5d91fdd2768e0d3027eba4c9627");
            return;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (this.e == -2) {
            ArrayList arrayList = new ArrayList();
            int i7 = 1;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; childCount > 0 && i10 <= this.m.get(i7); i10++) {
                i8++;
                View childAt = getChildAt(i10);
                a aVar = (a) childAt.getLayoutParams();
                i9 += childAt.getMeasuredWidth() + aVar.leftMargin + aVar.rightMargin;
                if (i10 == this.m.get(i7)) {
                    arrayList.add(Integer.valueOf(i8));
                    arrayList.add(Integer.valueOf(i9));
                    this.q.put(i7, arrayList);
                    i7++;
                    arrayList = new ArrayList();
                    i8 = 0;
                    i9 = 0;
                }
            }
        }
        int i11 = paddingLeft;
        int i12 = paddingTop;
        int i13 = 1;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            a aVar2 = (a) childAt2.getLayoutParams();
            if (childAt2.getVisibility() != 8 && aVar2.a) {
                if (i14 > this.m.get(i13)) {
                    if (i13 >= this.i) {
                        return;
                    }
                    i12 += this.n.get(i13) + this.k;
                    i11 = getPaddingLeft();
                    i13++;
                }
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                if (this.e == -2) {
                    if (i11 == getPaddingLeft()) {
                        i5 = (getMeasuredWidth() - (((this.q.get(i13).get(0).intValue() - 1) * this.k) + this.q.get(i13).get(1).intValue())) / 2;
                    } else {
                        i5 = aVar2.leftMargin + i11;
                    }
                } else {
                    i5 = aVar2.leftMargin + i11;
                }
                switch (this.d) {
                    case -2:
                        i6 = ((this.n.get(i13) + i12) - measuredHeight) - aVar2.bottomMargin;
                        break;
                    case -1:
                        i6 = aVar2.topMargin + i12;
                        break;
                    default:
                        i6 = ((((this.n.get(i13) - measuredHeight) - aVar2.topMargin) - aVar2.bottomMargin) / 2) + i12;
                        break;
                }
                childAt2.layout(i5, i6, i5 + measuredWidth, measuredHeight + i6);
                i11 = i5 + measuredWidth + aVar2.rightMargin + this.j;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02a6babb9eccb78de943f0152b708c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02a6babb9eccb78de943f0152b708c0")).booleanValue();
        }
        a aVar = (a) view.getLayoutParams();
        if (view.getVisibility() == 8 || !aVar.a) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public void setMaxWidth(int i) {
        Resources resources;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9607866b5f0818d8fcd4eb99926e648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9607866b5f0818d8fcd4eb99926e648");
            return;
        }
        Object[] objArr2 = {0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0ada40e37495d6eeaffa160703974d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0ada40e37495d6eeaffa160703974d0");
            return;
        }
        if (i >= 0) {
            Context context = getContext();
            if (context == null) {
                resources = Resources.getSystem();
            } else {
                resources = context.getResources();
            }
            i = (int) TypedValue.applyDimension(0, i, resources.getDisplayMetrics());
        } else if (i != -1 && i != -2) {
            i = -3;
        }
        if (i != this.b) {
            this.b = i;
            requestLayout();
        }
    }

    public void setMaxWidthScale(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1ec7a8da37c35d2b7d45e58cd55b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1ec7a8da37c35d2b7d45e58cd55b3c");
        } else if (this.c != f) {
            this.c = f;
            requestLayout();
        }
    }

    public void setHorizontalSpace(int i) {
        Resources resources;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11acb2029b20e292c5609512039c91e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11acb2029b20e292c5609512039c91e9");
            return;
        }
        Object[] objArr2 = {0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f5f46557d9b56063f104b418a2e45de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f5f46557d9b56063f104b418a2e45de");
        } else if (i >= 0) {
            Context context = getContext();
            if (context == null) {
                resources = Resources.getSystem();
            } else {
                resources = context.getResources();
            }
            int applyDimension = (int) TypedValue.applyDimension(0, i, resources.getDisplayMetrics());
            if (applyDimension != i) {
                this.j = applyDimension;
                requestLayout();
            }
        }
    }

    public void setVerticalSpace(int i) {
        Resources resources;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf5a242f633dc92dbfff2b758657598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf5a242f633dc92dbfff2b758657598");
            return;
        }
        Object[] objArr2 = {0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b7e41a33fa936afcb2add6c072366ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b7e41a33fa936afcb2add6c072366ba");
        } else if (i >= 0) {
            Context context = getContext();
            if (context == null) {
                resources = Resources.getSystem();
            } else {
                resources = context.getResources();
            }
            int applyDimension = (int) TypedValue.applyDimension(0, i, resources.getDisplayMetrics());
            if (applyDimension != i) {
                this.k = applyDimension;
                requestLayout();
            }
        }
    }

    public void setRowAlign(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6014159bf2deae9655c33f26fc7d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6014159bf2deae9655c33f26fc7d53");
        } else if (i == this.d || i >= 0 || i < -3) {
        } else {
            this.d = i;
            requestLayout();
        }
    }

    public void setMaxRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ee6f7c7922db1d0d362cfa6d326c66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ee6f7c7922db1d0d362cfa6d326c66");
        } else if (i == this.f || i < -1) {
        } else {
            this.f = i;
            requestLayout();
        }
    }

    public void setRowGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bba4cc7435a79b6e2ad57d9e6ab610b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bba4cc7435a79b6e2ad57d9e6ab610b");
        } else if (i == this.e || i >= 0 || i < -2) {
        } else {
            this.e = i;
            requestLayout();
        }
    }

    public void setRowSplitParts(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fa7215476890a0fa830c61e7d72fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fa7215476890a0fa830c61e7d72fd8");
        } else {
            a(i, i);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db81fec9aaa8193b6a770b5374ce4973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db81fec9aaa8193b6a770b5374ce4973");
            return;
        }
        if (i < i2 || i2 <= 0) {
            i2 = i;
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.g = i;
        this.h = i2;
        requestLayout();
    }

    public int getVisibleChildCount() {
        return this.p;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public boolean a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = true;
        }

        public a(int i, int i2) {
            super(-2, -2);
            this.a = true;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = true;
        }
    }
}
