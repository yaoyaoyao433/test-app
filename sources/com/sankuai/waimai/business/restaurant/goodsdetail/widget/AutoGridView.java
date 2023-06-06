package com.sankuai.waimai.business.restaurant.goodsdetail.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AutoGridView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private boolean b;
    private b c;
    private c d;
    private int e;
    private int f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        int a();

        @NonNull
        View a(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int i6);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        int[] a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements c {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView.c
        public final int[] a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bda421ab153215746f73d7b87e112e1", RobustBitConfig.DEFAULT_VALUE)) {
                return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bda421ab153215746f73d7b87e112e1");
            }
            switch (i) {
                case 1:
                    return new int[]{1};
                case 2:
                    return new int[]{2};
                case 3:
                    return new int[]{3};
                case 4:
                    return new int[]{2, 2};
                case 5:
                    return new int[]{3, 2};
                case 6:
                    return new int[]{3, 3};
                default:
                    return null;
            }
        }
    }

    public AutoGridView(Context context, c cVar) {
        super(context);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe8898eb97521ece5d8d9c34f2314f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe8898eb97521ece5d8d9c34f2314f6");
            return;
        }
        this.b = false;
        this.d = new a();
        this.e = 0;
        this.f = 0;
        a(context, (AttributeSet) null);
        setStrategy(cVar);
    }

    public AutoGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566a32a7044708db65613f170597d2b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566a32a7044708db65613f170597d2b3");
            return;
        }
        this.b = false;
        this.d = new a();
        this.e = 0;
        this.f = 0;
        a(context, attributeSet);
    }

    public AutoGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2750e58ef265a548b1c6f5e7ddac9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2750e58ef265a548b1c6f5e7ddac9b");
            return;
        }
        this.b = false;
        this.d = new a();
        this.e = 0;
        this.f = 0;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public AutoGridView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2babcd27b59f0398cd8cf0743f3d7a9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2babcd27b59f0398cd8cf0743f3d7a9e");
            return;
        }
        this.b = false;
        this.d = new a();
        this.e = 0;
        this.f = 0;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a05a2ae737357bce8b1bcc7827bb56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a05a2ae737357bce8b1bcc7827bb56b");
            return;
        }
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843028, 16843029});
            this.e = obtainStyledAttributes.getDimensionPixelSize(0, this.e);
            this.f = obtainStyledAttributes.getDimensionPixelSize(1, this.f);
            d();
            obtainStyledAttributes.recycle();
        }
    }

    public void setAdapter(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff48e174c7364010dd07b709284fec09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff48e174c7364010dd07b709284fec09");
            return;
        }
        this.c = bVar;
        a();
    }

    public b getAdapter() {
        return this.c;
    }

    public void setStrategy(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ba800252a2a1c5bfcb47328953a600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ba800252a2a1c5bfcb47328953a600");
            return;
        }
        this.d = cVar;
        a();
    }

    public c getStrategy() {
        return this.d;
    }

    public void setHorizontalSpacing(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8f3b343d206f2cd08841be4c39a358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8f3b343d206f2cd08841be4c39a358");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (this.e != i) {
            this.e = i;
            c();
        }
    }

    public int getHorizontalSpacing() {
        return this.e;
    }

    public void setVerticalSpacing(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d3b09e5afc947c7627a5cbea703865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d3b09e5afc947c7627a5cbea703865");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (this.f != i) {
            this.f = i;
            d();
        }
    }

    public int getVerticalSpacing() {
        return this.f;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458e1ae7ea110fa5470d5a68d906ca6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458e1ae7ea110fa5470d5a68d906ca6a");
            return;
        }
        removeAllViews();
        b();
    }

    private void b() {
        int a2;
        int[] a3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cbb0d3f6cb772df746d5fe4bf0e2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cbb0d3f6cb772df746d5fe4bf0e2b6");
        } else if (this.c != null && this.d != null && (a2 = this.c.a()) > 0 && (a3 = this.d.a(a2)) != null && a3.length != 0) {
            setWidth(-1);
            int i = a3[0];
            LinearLayout a4 = a(i, -2);
            int i2 = 0;
            int i3 = 0;
            int i4 = i;
            for (int i5 = 0; i5 < a2; i5++) {
                int min = Math.min(1, i4 - i2);
                View a5 = this.c.a(a4, a2, i5, i3, min, i2, i4);
                a4.addView(a5, a(a5, min));
                i2 += min;
                if (i2 >= i4) {
                    int i6 = i3 + 1;
                    if (i6 >= a3.length) {
                        return;
                    }
                    int i7 = a3[i6];
                    a4 = a(i7, -2);
                    i3 = i6;
                    i4 = i7;
                    i2 = 0;
                }
            }
        }
    }

    private void a(LinearLayout linearLayout) {
        int childCount;
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0343089b32088e7a38ba494ab6c824d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0343089b32088e7a38ba494ab6c824d");
        } else if (linearLayout != null && (childCount = linearLayout.getChildCount()) > 1) {
            int i = -2;
            for (int i2 = 0; i2 < childCount; i2++) {
                i = Math.max(i, linearLayout.getChildAt(i2).getMeasuredHeight());
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                ((LinearLayout.LayoutParams) linearLayout.getChildAt(i3).getLayoutParams()).height = i;
            }
            ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = -2;
        }
    }

    private void setWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd109b923c017938eea256a2034cc4e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd109b923c017938eea256a2034cc4e5");
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = -2;
            setLayoutParams(layoutParams);
        }
    }

    @NonNull
    private LinearLayout.LayoutParams a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b019c139360bad2784c40cb174574a95", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b019c139360bad2784c40cb174574a95");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (layoutParams == null || !(layoutParams instanceof LinearLayout.LayoutParams)) ? new LinearLayout.LayoutParams(0, -1) : (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = 0;
        layoutParams2.weight = i;
        return layoutParams2;
    }

    private LinearLayout a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb92b814e3f9edeb40de52ce9dce628c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb92b814e3f9edeb40de52ce9dce628c");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        b(linearLayout);
        linearLayout.setOrientation(0);
        if (i > 0) {
            linearLayout.setWeightSum(i);
        }
        addView(linearLayout, new LinearLayout.LayoutParams(-1, i2));
        return linearLayout;
    }

    @NonNull
    private static Drawable b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6eb30bf72593c8bba99827dc4321d320", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6eb30bf72593c8bba99827dc4321d320");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(i, i2);
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5be853ce13c78fee5ea91504391eb18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5be853ce13c78fee5ea91504391eb18");
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof LinearLayout)) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (linearLayout.getOrientation() == 0) {
                    b(linearLayout);
                }
            }
        }
    }

    private void b(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a91379d71b590b19706613de7f85851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a91379d71b590b19706613de7f85851");
        } else if (this.e > 0) {
            linearLayout.setDividerDrawable(b(this.e, 0));
            linearLayout.setShowDividers(2);
        } else {
            linearLayout.setDividerDrawable(null);
            linearLayout.setShowDividers(0);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c41d5a093d9ebe503d4a15cf9476826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c41d5a093d9ebe503d4a15cf9476826");
        } else if (this.f > 0) {
            setDividerDrawable(b(0, this.f));
            setShowDividers(2);
        } else {
            setDividerDrawable(null);
            setShowDividers(0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ccc34ef5aaa0303edad9886c8ea313f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ccc34ef5aaa0303edad9886c8ea313f");
            return;
        }
        super.onMeasure(i, i2);
        if (this.c != null) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof LinearLayout) {
                    a((LinearLayout) childAt);
                }
            }
        }
    }
}
