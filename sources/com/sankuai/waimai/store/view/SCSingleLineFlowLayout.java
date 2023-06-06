package com.sankuai.waimai.store.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.R;
import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCSingleLineFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f876c751b2bacb7e47d35adfa7e2e94", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f876c751b2bacb7e47d35adfa7e2e94") : new a(getContext(), attributeSet);
    }

    public SCSingleLineFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a2589e153c7305bbc99a1f3f325944", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a2589e153c7305bbc99a1f3f325944");
        }
    }

    public SCSingleLineFlowLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f146f520887acb11003bd4c4e0c329b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f146f520887acb11003bd4c4e0c329b");
        }
    }

    public SCSingleLineFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727092f5ea4764ffca64d58206a50372", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727092f5ea4764ffca64d58206a50372");
            return;
        }
        this.b = 0;
        this.c = -1;
        this.d = 8388659;
        this.e = 0;
        this.f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927, 16843028, R.attr.childHeight, R.attr.stretch});
        this.f = obtainStyledAttributes.getDimensionPixelOffset(2, this.f);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(1, this.b);
        this.j = obtainStyledAttributes.getBoolean(3, false);
        this.d = obtainStyledAttributes.getInt(0, this.d);
        obtainStyledAttributes.recycle();
        this.i = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f0e8f906a8defee816151d904a4002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f0e8f906a8defee816151d904a4002");
        } else {
            super.onFinishInflate();
        }
    }

    private <T extends View> void a(List<T> list, boolean z) {
        ViewParent parent;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc39b17e2816e95a5d3ab70eea798ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc39b17e2816e95a5d3ab70eea798ef7");
        } else if (list != null && !list.isEmpty()) {
            for (T t : list) {
                if (z && (parent = t.getParent()) != null) {
                    ((ViewGroup) parent).removeView(t);
                }
                addView(t);
            }
            requestLayout();
        }
    }

    public <T extends View> void setViews(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfbcf7c390fcfd4e396ada24d5fea174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfbcf7c390fcfd4e396ada24d5fea174");
            return;
        }
        Object[] objArr2 = {list, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f9a7eadefd8ca834d42e7f7b10e07c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f9a7eadefd8ca834d42e7f7b10e07c5");
            return;
        }
        removeAllViews();
        a((List) list, false);
    }

    public void setChildHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1cd20f4545d35bea4bad5d13d182b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1cd20f4545d35bea4bad5d13d182b0");
        } else if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setHorizontalSpacing(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff970aaba5d514468634f8c7fb4922c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff970aaba5d514468634f8c7fb4922c3");
        } else if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    private int getHorizontalExtraPadding() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be69bb32afeb822200d8e3d1973ad9a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be69bb32afeb822200d8e3d1973ad9a2");
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f394675d1f848e17e4e9603264252d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f394675d1f848e17e4e9603264252d7");
        } else {
            a(i, i2);
        }
    }

    private void a(int i, int i2) {
        int i3;
        int i4;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0507236a57fd6cb1df3ddd1789bac038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0507236a57fd6cb1df3ddd1789bac038");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.g = 0;
        this.h = 0;
        this.c = -1;
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - getHorizontalExtraPadding();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                i3 = childCount;
                break;
            }
            View childAt = getChildAt(i6);
            childAt.setVisibility(0);
            Object[] objArr2 = new Object[i5];
            objArr2[0] = childAt;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            i3 = childCount;
            int i7 = i6;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1fef923fc7a1e406f5a3f2d64b7542e", RobustBitConfig.DEFAULT_VALUE)) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1fef923fc7a1e406f5a3f2d64b7542e");
                view = childAt;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view = childAt;
                    view.setLayoutParams(layoutParams);
                } else {
                    view = childAt;
                    if (!checkLayoutParams(layoutParams)) {
                        layoutParams = generateLayoutParams(layoutParams);
                        view.setLayoutParams(layoutParams);
                    }
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams2.height < 0 && this.f > 0) {
                    marginLayoutParams2.height = this.f;
                }
                marginLayoutParams = marginLayoutParams2;
            }
            measureChildWithMargins(view, i, getHorizontalExtraPadding(), i2, 0);
            int measuredWidth = view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            if (i7 != 0) {
                this.g += this.b;
            }
            if (this.g + measuredWidth > paddingLeft) {
                if (this.j) {
                    measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(paddingLeft - this.g, 1073741824), getHorizontalExtraPadding(), i2, 0);
                    this.g = paddingLeft;
                    this.c = i7 + 1;
                } else {
                    this.c = i7;
                    if (i7 != 0) {
                        this.g -= this.b;
                    }
                }
            } else {
                this.g += measuredWidth;
                this.h = Math.max(this.h, measuredHeight);
                i6 = i7 + 1;
                childCount = i3;
                i5 = 1;
            }
        }
        int i8 = this.c;
        while (this.c != -1 && i8 < (i4 = i3)) {
            getChildAt(i8).setVisibility(8);
            i8++;
            i3 = i4;
        }
        int max = Math.max(this.g, 0);
        int i9 = this.h + 0;
        if (mode != 1073741824) {
            size = max + getPaddingLeft() + getPaddingRight() + getHorizontalExtraPadding();
        }
        if (mode2 != 1073741824) {
            size2 = i9 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87804f7625f877935a0f226cc188fcc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87804f7625f877935a0f226cc188fcc0");
        } else {
            a(z, i, i2, i3, i4);
        }
    }

    private int getLeftOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18aff59cfd60655e6aa0a61e0f188d8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18aff59cfd60655e6aa0a61e0f188d8f")).intValue();
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.d & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK, this.i);
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                return 0;
            }
            return (((getWidth() - this.g) - getPaddingLeft()) - getPaddingRight()) - getHorizontalExtraPadding();
        }
        return ((((getWidth() - this.g) - getPaddingLeft()) - getPaddingRight()) - getHorizontalExtraPadding()) / 2;
    }

    private void a(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc1cf2197beec8804786ba2b749cbdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc1cf2197beec8804786ba2b749cbdb");
            return;
        }
        int paddingLeft = getPaddingLeft() + getLeftOffset();
        getPaddingTop();
        int childCount = getChildCount();
        int height = getHeight() - getPaddingBottom();
        int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i5 = this.d & 112;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (this.c != -1 && i6 >= this.c) {
                    return;
                }
                a aVar = (a) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + aVar.leftMargin + aVar.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = aVar.a;
                if (i7 < 0) {
                    i7 = i5;
                }
                int i8 = i7 & 112;
                if (i8 == 16) {
                    paddingTop = ((getPaddingTop() + ((height2 - measuredHeight) / 2)) + aVar.topMargin) - aVar.bottomMargin;
                } else if (i8 == 48) {
                    paddingTop = getPaddingTop() + aVar.topMargin;
                } else if (i8 == 80) {
                    paddingTop = (height - measuredHeight) - aVar.bottomMargin;
                } else {
                    paddingTop = getPaddingTop();
                }
                int i9 = aVar.leftMargin + paddingLeft;
                childAt.layout(i9, paddingTop, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += measuredWidth + this.b;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c645b057cce01e89f409a14ff67df418", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c645b057cce01e89f409a14ff67df418") : new a(-2, -2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9599e66ab38ba1391f320ad2ac4c78", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9599e66ab38ba1391f320ad2ac4c78") : new a(layoutParams);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, 16842996, 16842997});
            this.a = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(-2, -2);
            this.a = -1;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
        }
    }
}
