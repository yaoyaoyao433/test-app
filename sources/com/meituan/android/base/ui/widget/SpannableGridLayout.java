package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SpannableGridLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private int f;
    private int g;
    private int h;
    private int i;
    private List<a> j;
    private List<a> k;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public Rect b;
        public List<Rect> c;

        public a() {
        }

        public final void a(int i, int i2, int i3) {
            int i4 = 0;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed9948662cada46fd6178b308015f4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed9948662cada46fd6178b308015f4d");
                return;
            }
            if (this.c == null) {
                this.c = new ArrayList();
                this.c.add(this.b);
            }
            if (i == 0) {
                while (i4 < this.c.size()) {
                    Rect rect = this.c.get(i4);
                    if ((i2 <= rect.left && i3 >= rect.left) || (i2 > rect.left && i2 < rect.right)) {
                        this.c.remove(i4);
                        if (rect.left < i2) {
                            this.c.add(new Rect(rect.left, rect.top, i2, rect.bottom));
                        }
                        if (rect.right > i3) {
                            this.c.add(new Rect(i3, rect.top, rect.right, rect.bottom));
                            return;
                        }
                        return;
                    }
                    i4++;
                }
            } else if (i == 1) {
                while (i4 < this.c.size()) {
                    Rect rect2 = this.c.get(i4);
                    if ((i2 <= rect2.top && i3 >= rect2.top) || (i2 > rect2.top && i2 < rect2.bottom)) {
                        this.c.remove(i4);
                        if (rect2.top < i2) {
                            this.c.add(new Rect(rect2.left, rect2.top, rect2.right, i2));
                        }
                        if (rect2.bottom > i3) {
                            this.c.add(new Rect(rect2.left, i3, rect2.right, rect2.bottom));
                            return;
                        }
                        return;
                    }
                    i4++;
                }
            }
        }
    }

    public SpannableGridLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0e6a22560d08fd5c279fcfe9c3c6329", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0e6a22560d08fd5c279fcfe9c3c6329");
        } else {
            a(context, (AttributeSet) null, 0);
        }
    }

    public SpannableGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5792af7ab6895242caf2c0994617649", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5792af7ab6895242caf2c0994617649");
        } else {
            a(context, attributeSet, i);
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409fb58801df94c4d20209f36fae464e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409fb58801df94c4d20209f36fae464e");
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.spannablegrid_column_count, R.attr.row_count, R.attr.column, R.attr.row, R.attr.column_span, R.attr.row_span, R.attr.column_divider, R.attr.row_divider, R.attr.column_divider_size, R.attr.row_divider_size}, i, 0);
            this.b = obtainStyledAttributes.getInteger(0, 1);
            this.c = obtainStyledAttributes.getInteger(1, 1);
            this.d = obtainStyledAttributes.getDrawable(6);
            this.e = obtainStyledAttributes.getDrawable(7);
            if (this.d != null) {
                this.f = this.d.getIntrinsicWidth();
            }
            this.f = obtainStyledAttributes.getDimensionPixelSize(8, this.f);
            if (this.e != null) {
                this.g = this.e.getIntrinsicHeight();
            }
            this.g = obtainStyledAttributes.getDimensionPixelSize(9, this.g);
            obtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
    }

    public void setColumnCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814c80edadb75cd89ec136ea95070ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814c80edadb75cd89ec136ea95070ab6");
            return;
        }
        this.b = i;
        requestLayout();
    }

    public void setRowCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58803687b8b2068a4bfce92584356ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58803687b8b2068a4bfce92584356ebe");
            return;
        }
        this.c = i;
        requestLayout();
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab2ef8c5f52deb5780842c0057ca41c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab2ef8c5f52deb5780842c0057ca41c");
            return;
        }
        if (this.d != null) {
            if (this.j != null) {
                this.j.clear();
            } else {
                this.j = new ArrayList(this.b - 1);
            }
            for (int i3 = 1; i3 < this.b; i3++) {
                a aVar = new a();
                int i4 = (this.h * i3) + (this.f * (i3 - 1));
                aVar.b = new Rect(i4, 0, this.f + i4, i2);
                this.j.add(aVar);
            }
        } else if (this.j != null) {
            this.j.clear();
        }
        if (this.e != null) {
            if (this.k != null) {
                this.k.clear();
            } else {
                this.k = new ArrayList(this.c - 1);
            }
            for (int i5 = 1; i5 < this.c; i5++) {
                a aVar2 = new a();
                int i6 = (this.i * i5) + (this.g * (i5 - 1));
                aVar2.b = new Rect(0, i6, i, this.g + i6);
                this.k.add(aVar2);
            }
        } else if (this.k != null) {
            this.k.clear();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e79c434c50cdf4d66cf56921bd5e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e79c434c50cdf4d66cf56921bd5e17");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if ((mode == 1073741824 || mode == Integer.MIN_VALUE) && (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE)) {
            setMeasuredDimension(size, size2);
            this.h = (size - ((this.b - 1) * this.f)) / this.b;
            this.i = (size2 - ((this.c - 1) * this.g)) / this.c;
            a(size, size2);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                b bVar = (b) childAt.getLayoutParams();
                int i4 = bVar.b;
                int i5 = bVar.c;
                int i6 = bVar.d;
                int i7 = bVar.e;
                childAt.measure(View.MeasureSpec.makeMeasureSpec((this.h * i6) + ((i6 - 1) * this.f), 1073741824), View.MeasureSpec.makeMeasureSpec((this.i * i7) + ((i7 - 1) * this.g), 1073741824));
                if (i7 > 1 && this.k != null) {
                    for (int i8 = 1; i8 < i7; i8++) {
                        a aVar = this.k.get((i5 + i8) - 1);
                        int i9 = (this.h * i4) + (this.f * (i4 > 0 ? i4 - 1 : 0));
                        aVar.a(0, i9, (i4 > 0 ? this.f : 0) + i9 + ((this.h + this.f) * i6));
                    }
                }
                if (i6 > 1 && this.j != null) {
                    for (int i10 = 1; i10 < i6; i10++) {
                        a aVar2 = this.j.get((i4 + i10) - 1);
                        int i11 = (this.i * i5) + (this.g * (i5 > 0 ? i5 - 1 : 0));
                        aVar2.a(1, i11, (i5 > 0 ? this.g : 0) + i11 + ((this.i + this.g) * i7));
                    }
                }
            }
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25573111032cb9c234703178f9f1b7c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25573111032cb9c234703178f9f1b7c2");
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            int i6 = bVar.b;
            int i7 = bVar.c;
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = (this.h * i6) + (i6 * this.f);
            int i9 = (this.i * i7) + (i7 * this.g);
            childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1e058848f99103458b85236ef94825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1e058848f99103458b85236ef94825");
            return;
        }
        super.onDraw(canvas);
        a(canvas, this.j, this.d);
        a(canvas, this.k, this.e);
    }

    private void a(Canvas canvas, List<a> list, Drawable drawable) {
        Object[] objArr = {canvas, list, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c04d6f094a455aba38f3a85673daa1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c04d6f094a455aba38f3a85673daa1f");
        } else if (list != null && drawable != null) {
            for (a aVar : list) {
                if (aVar.c != null) {
                    for (Rect rect : aVar.c) {
                        drawable.setBounds(rect);
                        drawable.draw(canvas);
                    }
                } else if (aVar.b != null) {
                    drawable.setBounds(aVar.b);
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c19f44bfc6dfd6988d4b74a30d57d44", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c19f44bfc6dfd6988d4b74a30d57d44") : new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05dbac21031fa844d86a66fbb2b53a9d", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05dbac21031fa844d86a66fbb2b53a9d") : new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa522ccb31c5175d0f9c909cb0f35216", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa522ccb31c5175d0f9c909cb0f35216") : new b(getContext(), attributeSet);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21abc6f398532fbd4711df2b7f1b6c26", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21abc6f398532fbd4711df2b7f1b6c26");
                return;
            }
            this.d = 1;
            this.e = 1;
            Object[] objArr2 = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d2fcd142db71cd5dd9486d540035d88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d2fcd142db71cd5dd9486d540035d88");
                return;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.spannablegrid_column_count, R.attr.row_count, R.attr.column, R.attr.row, R.attr.column_span, R.attr.row_span, R.attr.column_divider, R.attr.row_divider, R.attr.column_divider_size, R.attr.row_divider_size});
            this.b = obtainStyledAttributes.getInteger(2, 0);
            this.c = obtainStyledAttributes.getInteger(3, 0);
            this.d = obtainStyledAttributes.getInteger(4, 1);
            this.e = obtainStyledAttributes.getInteger(5, 1);
            obtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f8596b3481b221298968b692c6c801", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f8596b3481b221298968b692c6c801");
                return;
            }
            this.d = 1;
            this.e = 1;
        }

        public b() {
            super(-1, -1);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd929245392318e3800544eeed3f83e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd929245392318e3800544eeed3f83e");
                return;
            }
            this.d = 1;
            this.e = 1;
        }
    }
}
