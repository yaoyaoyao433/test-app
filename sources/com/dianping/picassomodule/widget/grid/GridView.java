package com.dianping.picassomodule.widget.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
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
/* loaded from: classes.dex */
public class GridView<T> extends ViewGroup {
    public static ChangeQuickRedirect a;
    private boolean b;
    private a c;
    private int d;
    private boolean e;
    private View f;
    private List<View> g;
    private com.dianping.picassomodule.widget.grid.a<T> h;
    private float i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private float o;
    private int p;
    private boolean q;
    private boolean r;
    private b s;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
    }

    public GridView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5acf1d14a5762a6fa38252200afc032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5acf1d14a5762a6fa38252200afc032");
            return;
        }
        this.d = -1;
        this.g = new ArrayList();
    }

    public GridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5967942ad34786deeff30d9dc97f571a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5967942ad34786deeff30d9dc97f571a");
            return;
        }
        this.d = -1;
        this.g = new ArrayList();
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ff2dc80026fa52e2d54ebb5148e7a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ff2dc80026fa52e2d54ebb5148e7a8b");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.singleLine, R.attr.maxLines, R.attr.multiChecked, R.attr.horizontalSpace, R.attr.verticalSpace, R.attr.columnNumbers, R.attr.rowNumbers, R.attr.cutLineWidth, R.attr.cutLineColor, R.attr.cutLine, R.attr.lineCenter, R.attr.isAverage});
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.e = obtainStyledAttributes.getBoolean(2, false);
        this.i = obtainStyledAttributes.getDimension(3, 0.0f);
        this.j = obtainStyledAttributes.getDimension(4, 0.0f);
        this.k = obtainStyledAttributes.getInteger(5, 0);
        this.l = obtainStyledAttributes.getInteger(6, 0);
        this.p = obtainStyledAttributes.getColor(8, getResources().getColor(R.color.shieldc_line_gray));
        this.o = obtainStyledAttributes.getDimension(7, 1.0f);
        this.n = obtainStyledAttributes.getBoolean(9, false);
        this.q = obtainStyledAttributes.getBoolean(10, false);
        this.r = obtainStyledAttributes.getBoolean(11, false);
        if (this.k != 0) {
            this.m = true;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bea0bd2bba53148c7bf0aa4e64c1ab13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bea0bd2bba53148c7bf0aa4e64c1ab13");
        } else if (this.m) {
            a(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    private void a(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e99b388a9e70e75e8cac7e8238cbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e99b388a9e70e75e8cac7e8238cbab");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (this.l == 0) {
            this.l = getChildCount() % this.k == 0 ? getChildCount() / this.k : (getChildCount() / this.k) + 1;
        }
        int paddingLeft2 = ((int) ((((size - getPaddingLeft()) - getPaddingRight()) - (this.i * (this.k - 1))) / this.k)) + getPaddingLeft() + getPaddingRight();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.l) {
            int i9 = size2;
            int i10 = 0;
            int i11 = 0;
            while (i11 < this.k) {
                View childAt = getChildAt((this.k * i6) + i11);
                if (childAt != null) {
                    i4 = mode2;
                    i3 = size;
                    if (childAt.getVisibility() != 8) {
                        measureChild(childAt, View.MeasureSpec.makeMeasureSpec(paddingLeft2, mode), i2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                        i5 += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                        i10 = Math.max(i10, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                    }
                } else {
                    i3 = size;
                    i4 = mode2;
                }
                i11++;
                mode2 = i4;
                size = i3;
            }
            i7 = Math.max(i5, i7);
            i8 += i10;
            i6++;
            size2 = i9;
            i5 = 0;
        }
        int i12 = size;
        int i13 = size2;
        int i14 = mode2;
        int i15 = (int) (i7 + (this.i * (this.k - 1)) + paddingLeft + paddingRight);
        int i16 = (int) (i8 + (this.j * (this.l - 1)) + paddingBottom + paddingTop);
        int i17 = i12;
        if (i15 > i17) {
            i15 = i17;
        }
        if (mode != 1073741824) {
            i17 = i15;
        }
        if (i14 == 1073741824) {
            i16 = i13;
        }
        setMeasuredDimension(i17, i16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e80eb87f299e94907e49d89f09c0b596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e80eb87f299e94907e49d89f09c0b596");
        } else if (this.m) {
            a();
        }
    }

    private void a() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edc0b3115c525c1565c33bc2a1b7aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edc0b3115c525c1565c33bc2a1b7aa6");
            return;
        }
        this.g.clear();
        int i = -1;
        this.d = -1;
        int width = getWidth();
        int height = getHeight();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        int i2 = 1;
        int paddingLeft = (((int) ((((width - getPaddingLeft()) - getPaddingRight()) - (this.i * (this.k - 1))) / this.k)) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        int paddingTop = (((int) ((((height - getPaddingTop()) - getPaddingBottom()) - (this.j * (this.l - 1))) / this.l)) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        int i3 = 0;
        while (i3 < this.l) {
            int i4 = 0;
            while (i4 < this.k) {
                View childAt2 = getChildAt((this.k * i3) + i4);
                if (childAt2 != null) {
                    this.d += i2;
                    if (childAt2.getVisibility() != 8) {
                        final Integer valueOf = Integer.valueOf(i);
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = childAt2;
                        objArr2[i2] = valueOf;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57e267c4e241e0ff34bd75e2c04ecd6e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57e267c4e241e0ff34bd75e2c04ecd6e");
                            view = childAt2;
                        } else {
                            if (childAt2.getTag() == null) {
                                view = childAt2;
                                view.setTag(Integer.valueOf(this.d));
                            } else {
                                view = childAt2;
                            }
                            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.dianping.picassomodule.widget.grid.GridView.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view2) {
                                    Object[] objArr3 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f60200ed650efe0cfb9cd7cb44989817", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f60200ed650efe0cfb9cd7cb44989817")).booleanValue();
                                    }
                                    if (GridView.this.s != null) {
                                        b unused = GridView.this.s;
                                        ((Integer) (valueOf.intValue() == -1 ? view2.getTag() : valueOf)).intValue();
                                        return true;
                                    }
                                    return false;
                                }
                            });
                            view.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassomodule.widget.grid.GridView.2
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr3 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e3ecdfa867a44afe64b4b8acb671a191", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e3ecdfa867a44afe64b4b8acb671a191");
                                        return;
                                    }
                                    if (GridView.this.e) {
                                        if (GridView.this.g.contains(view2)) {
                                            GridView.this.g.remove(view2);
                                            view2.setSelected(false);
                                        } else {
                                            view2.setSelected(true);
                                            GridView.this.g.add(view2);
                                            GridView.this.f = view2;
                                        }
                                    } else if (!view2.isSelected()) {
                                        if (GridView.this.f != null) {
                                            GridView.this.f.setSelected(false);
                                        }
                                        view2.setSelected(true);
                                        GridView.this.f = view2;
                                    } else {
                                        view2.setSelected(false);
                                    }
                                    if (GridView.this.c != null) {
                                        a unused = GridView.this.c;
                                        ((Integer) (valueOf.intValue() == -1 ? view2.getTag() : valueOf)).intValue();
                                    }
                                }
                            });
                        }
                        int paddingLeft2 = ((int) (getPaddingLeft() + (i4 * (paddingLeft + this.i)))) + ((marginLayoutParams.leftMargin + marginLayoutParams.rightMargin) * i4) + marginLayoutParams.leftMargin;
                        int paddingTop2 = ((int) (getPaddingTop() + (i3 * (paddingTop + this.j)))) + ((marginLayoutParams.topMargin + marginLayoutParams.bottomMargin) * i3) + marginLayoutParams.topMargin;
                        view.layout(paddingLeft2, paddingTop2, paddingLeft2 + paddingLeft, paddingTop + paddingTop2);
                    }
                }
                i4++;
                i = -1;
                i2 = 1;
            }
            i3++;
            i = -1;
            i2 = 1;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a153873303d3b4358f1317e95788ba2e", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a153873303d3b4358f1317e95788ba2e") : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3216aba7e4a6b3c95057ea11e40a050", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3216aba7e4a6b3c95057ea11e40a050") : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ead06012de314a4b34c30853fe9783f", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ead06012de314a4b34c30853fe9783f") : new ViewGroup.MarginLayoutParams(super.generateDefaultLayoutParams());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3aad14fd8df0b12c43d6bbe8ba75068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3aad14fd8df0b12c43d6bbe8ba75068");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.m && this.n) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.o);
            paint.setColor(this.p);
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            int i = 0;
            while (i < this.l) {
                float f5 = f;
                float f6 = f2;
                float f7 = f3;
                float f8 = f4;
                for (int i2 = 0; i2 < this.k; i2++) {
                    View childAt = getChildAt((this.k * i) + i2);
                    if (i2 == this.k - 1) {
                        if (i != this.l - 1) {
                            canvas.drawLine(childAt.getLeft() - (this.i / 2.0f), (this.j / 2.0f) + childAt.getBottom(), childAt.getRight(), (this.j / 2.0f) + childAt.getBottom(), paint);
                        }
                    } else if (i != this.l - 1) {
                        if (i2 == 0) {
                            canvas.drawLine(childAt.getLeft(), (this.j / 2.0f) + childAt.getBottom(), (this.i / 2.0f) + childAt.getRight(), (this.j / 2.0f) + childAt.getBottom(), paint);
                        } else {
                            canvas.drawLine(childAt.getLeft() - (this.i / 2.0f), (this.j / 2.0f) + childAt.getBottom(), (this.i / 2.0f) + childAt.getRight(), (this.j / 2.0f) + childAt.getBottom(), paint);
                        }
                        if (i == 0) {
                            canvas.drawLine((this.i / 2.0f) + childAt.getRight(), childAt.getTop(), (this.i / 2.0f) + childAt.getRight(), (this.j / 2.0f) + childAt.getBottom(), paint);
                        } else {
                            canvas.drawLine((this.i / 2.0f) + childAt.getRight(), childAt.getTop() - (this.j / 2.0f), (this.i / 2.0f) + childAt.getRight(), (this.j / 2.0f) + childAt.getBottom(), paint);
                        }
                    } else if (childAt != null) {
                        f5 = childAt.getRight() + (this.i / 2.0f);
                        float top = childAt.getTop() - (this.j / 2.0f);
                        float bottom = childAt.getBottom();
                        canvas.drawLine(f5, top, f5, bottom, paint);
                        f7 = top;
                        f6 = childAt.getWidth() + this.i;
                        f8 = bottom;
                    } else if (this.r) {
                        f5 += f6;
                        canvas.drawLine(f5, f7, f5, f8, paint);
                    }
                }
                i++;
                f = f5;
                f2 = f6;
                f3 = f7;
                f4 = f8;
            }
        }
    }

    public void setSingleLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5348a71aa6270a7637ea2a65b8a5619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5348a71aa6270a7637ea2a65b8a5619");
            return;
        }
        this.b = z;
        requestLayout();
    }

    public void setMultiChecked(boolean z) {
        this.e = z;
    }

    public List<View> getCheckedViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4161005288009ebf920bb8a0cb1975a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4161005288009ebf920bb8a0cb1975a1");
        }
        if (this.e) {
            return this.g;
        }
        this.g.add(this.f);
        return this.g;
    }

    public void setAdapter(com.dianping.picassomodule.widget.grid.a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c06e60d535e478d86f9f866f7248ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c06e60d535e478d86f9f866f7248ec0");
            return;
        }
        removeAllViews();
        this.h = aVar;
        if (this.h.a() != 0) {
            for (int i = 0; i < this.h.a(); i++) {
                addView(this.h.a(i));
            }
            requestLayout();
        }
    }

    public void setHorizontalSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4e031cd44b4861b19db7b2fbf327dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4e031cd44b4861b19db7b2fbf327dc");
            return;
        }
        this.i = i;
        requestLayout();
    }

    public float getHorizontalSpace() {
        return this.i;
    }

    public void setVerticalSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be0f470ce04060d84053c5149ffcf4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be0f470ce04060d84053c5149ffcf4d");
            return;
        }
        this.j = i;
        requestLayout();
    }

    public float getVerticalSpace() {
        return this.j;
    }

    public void setColumnNumbers(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "869027b7ecd8aae9249ad46a6c20f8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "869027b7ecd8aae9249ad46a6c20f8f2");
            return;
        }
        this.k = i;
        if (this.k > 0) {
            this.m = true;
        } else {
            this.m = false;
        }
        requestLayout();
    }

    public int getColumnNumbers() {
        return this.k;
    }

    public void setRowNumbers(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04f25b70db16b2c033fea0e1bc070101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04f25b70db16b2c033fea0e1bc070101");
            return;
        }
        this.l = i;
        requestLayout();
    }

    public int getRowNumbers() {
        return this.l;
    }

    public void setCutLineWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e772ab18224eac8a228866205805f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e772ab18224eac8a228866205805f4");
            return;
        }
        this.o = f;
        invalidate();
    }

    public float getCutLineWidth() {
        return this.o;
    }

    public void setCutLineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac4acb6e6c7edd819057e4d6290fc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac4acb6e6c7edd819057e4d6290fc27");
            return;
        }
        this.p = i;
        invalidate();
    }

    public int getCutLineColor() {
        return this.p;
    }

    public void setCutLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ceccb1a758bb9391a715e7dc6053e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ceccb1a758bb9391a715e7dc6053e90");
            return;
        }
        this.n = z;
        invalidate();
    }

    public void setAverage(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d745e8291d6515511ebc6a0f969f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d745e8291d6515511ebc6a0f969f66");
            return;
        }
        this.r = z;
        invalidate();
    }

    public void setLineCenter(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c1c5bbf0b315e8a8f1dcbcec24e046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c1c5bbf0b315e8a8f1dcbcec24e046");
            return;
        }
        this.q = z;
        requestLayout();
    }

    public void setOnItemClickListener(a aVar) {
        this.c = aVar;
    }

    public void setOnLongItemClickListener(b bVar) {
        this.s = bVar;
    }
}
