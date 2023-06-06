package com.sankuai.waimai.store.orderlist.view.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SingleLineWithOmitHorizontalFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private List<View> b;
    private List<b> c;
    private View d;
    private final List<a> e;
    private boolean f;
    private boolean g;
    private a h;
    private int i;
    private int j;
    private int k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public View a;
        public c b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static int a = 1;
        public static int b;
        public static int c;
        public int d;
        public int e;
    }

    public SingleLineWithOmitHorizontalFlowLayout(Context context) {
        this(context, 25, 5, 5);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7fc81c3b900d3aa7a4ccf8281f03f3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7fc81c3b900d3aa7a4ccf8281f03f3b");
        }
    }

    public SingleLineWithOmitHorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919be00e0adacd7e008f09ccf7744d20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919be00e0adacd7e008f09ccf7744d20");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.l = 0;
        a(context, attributeSet);
    }

    public SingleLineWithOmitHorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c81eca8aeef974ec8eb1548f9c16a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c81eca8aeef974ec8eb1548f9c16a8");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.l = 0;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public SingleLineWithOmitHorizontalFlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f3185018e739d86c7dd044be226aa8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f3185018e739d86c7dd044be226aa8");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.l = 0;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1145e07856d9f1034474171a0dfd4a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1145e07856d9f1034474171a0dfd4a64");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927, R.attr.childHeight, R.attr.childMarginHorizontal, R.attr.childMarginVertical});
        this.i = (int) obtainStyledAttributes.getDimension(1, h.a(context, 25.0f));
        this.j = (int) obtainStyledAttributes.getDimension(2, h.a(context, 5.0f));
        this.k = (int) obtainStyledAttributes.getDimension(3, h.a(context, 5.0f));
        this.l = obtainStyledAttributes.getInt(0, this.l);
        this.d = LayoutInflater.from(context).inflate(R.layout.wm_sc_common_view_omit, (ViewGroup) null);
        obtainStyledAttributes.recycle();
    }

    public SingleLineWithOmitHorizontalFlowLayout(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9212b47f937723fd34d9ecfa5482ef54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9212b47f937723fd34d9ecfa5482ef54");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.l = 0;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47204f1d03518b7735d8cb85ad36b769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47204f1d03518b7735d8cb85ad36b769");
            return;
        }
        this.i = h.a(getContext(), i);
        this.j = h.a(getContext(), i2);
        this.k = h.a(getContext(), i3);
    }

    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f087adaff6be14ff3aa2b4377a07ff3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f087adaff6be14ff3aa2b4377a07ff3c");
        } else if (this.l != i) {
            this.l = i;
            requestLayout();
        }
    }

    public final boolean a(List<b> list, boolean z) {
        View view;
        Object[] objArr = {list, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8aeeb6ecef6e06185b4fec60d998ecf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8aeeb6ecef6e06185b4fec60d998ecf")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a079687a8fa5b3c5ccb845a895425e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a079687a8fa5b3c5ccb845a895425e26");
        } else {
            removeAllViews();
            this.e.clear();
            this.g = false;
            this.h = null;
            this.f = true;
            this.b.clear();
            this.c.clear();
        }
        if (list.isEmpty()) {
            return false;
        }
        boolean z2 = false;
        for (b bVar : list) {
            if (bVar != null && (view = bVar.a) != null && bVar.b != null) {
                this.b.add(view);
                this.c.add(bVar);
                z2 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        arrayList.add(this.d);
        Object[] objArr3 = {arrayList, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d212306a2464cebe1987ae70152da31", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d212306a2464cebe1987ae70152da31")).booleanValue();
        } else {
            removeAllViews();
            b(arrayList, true);
        }
        return z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int size;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5fee9136b79de20d2c9181d4e211137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5fee9136b79de20d2c9181d4e211137");
            return;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int a2 = a(defaultSize);
        Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b35068c41a0de731b6d63657b240802a", RobustBitConfig.DEFAULT_VALUE)) {
            size = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b35068c41a0de731b6d63657b240802a")).intValue();
        } else {
            Object[] objArr3 = {Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6096135a09f1e260ba62c94f2587f966", RobustBitConfig.DEFAULT_VALUE)) {
                paddingTop = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6096135a09f1e260ba62c94f2587f966")).intValue();
            } else {
                paddingTop = getPaddingTop() + getPaddingBottom();
                if (a2 > 0) {
                    paddingTop += (this.i * a2) + (this.k * (a2 - 1));
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

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e721df7b44006e73383b52846ef4fe96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e721df7b44006e73383b52846ef4fe96");
        } else if (this.e.size() == 0) {
        } else {
            a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "799bc21e3ac4839512b48bcfa4d0f62e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "799bc21e3ac4839512b48bcfa4d0f62e");
            } else if (this.g) {
                int paddingLeft = getPaddingLeft() + this.h.c + 0;
                int paddingLeft2 = getPaddingLeft() + this.h.d + 0;
                int paddingTop = getPaddingTop();
                com.sankuai.shangou.stone.util.log.a.a("SingleLineWithOmitHorizontalFlowLayout", "显示省略号 left:" + paddingLeft + " right:" + paddingLeft2 + " top:" + paddingTop + " bottom:" + paddingTop + this.i, new Object[0]);
                this.d.layout(paddingLeft, paddingTop, paddingLeft2, this.i + paddingTop);
            }
        }
    }

    private void a() {
        int paddingTop;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ea0d5dd3aef659f0abdbe80b3c030b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ea0d5dd3aef659f0abdbe80b3c030b");
            return;
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            View childAt = getChildAt(i);
            a aVar = this.e.get(i);
            int i2 = aVar.b;
            int paddingLeft = getPaddingLeft() + aVar.c + 0;
            int paddingLeft2 = getPaddingLeft() + aVar.d + 0;
            if (i2 <= 0) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = getPaddingTop() + (i2 * (this.i + this.k));
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft2, this.i + paddingTop);
        }
    }

    private <T extends View> boolean b(List<T> list, boolean z) {
        ViewParent parent;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e5dbae24446791e9dc3e12c70098ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e5dbae24446791e9dc3e12c70098ed")).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (T t : list) {
            if (z && (parent = t.getParent()) != null) {
                ((ViewGroup) parent).removeView(t);
            }
            addView(t);
        }
        return true;
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8c0aef20a78e82125b080150252c10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8c0aef20a78e82125b080150252c10")).intValue();
        }
        int childCount = getChildCount() - 1;
        if (childCount <= 0) {
            return 0;
        }
        this.e.clear();
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft <= 0) {
            return 0;
        }
        this.f = true;
        this.g = false;
        this.h = null;
        int i2 = Integer.MIN_VALUE | paddingLeft;
        this.d.measure(i2, this.i | 1073741824);
        int measuredWidth = this.d.getMeasuredWidth();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            childAt.measure(i2, this.i | 1073741824);
            int measuredWidth2 = childAt.getMeasuredWidth() + i4;
            if (measuredWidth2 > paddingLeft) {
                int i5 = i4 + measuredWidth;
                if (i5 <= paddingLeft) {
                    this.g = true;
                    this.h = new a(i4, i5);
                } else {
                    int size = this.e.size() - 1;
                    int i6 = size;
                    while (size >= 0 && this.e.get(size).c + measuredWidth > paddingLeft) {
                        this.e.remove(i6);
                        i6--;
                        size--;
                    }
                    if (i6 < 0) {
                        com.sankuai.shangou.stone.util.log.a.a("SingleLineWithOmitHorizontalFlowLayout", "省略号放不下", new Object[0]);
                        this.g = false;
                    } else {
                        a aVar = this.e.get(i6);
                        this.g = true;
                        this.h = new a(aVar.c, aVar.c + measuredWidth);
                        this.e.remove(i6);
                        com.sankuai.shangou.stone.util.log.a.a("SingleLineWithOmitHorizontalFlowLayout", "省略号位置 position:" + i6 + "  left:" + aVar.c, new Object[0]);
                    }
                }
            } else {
                this.e.add(new a(i4, measuredWidth2));
                i4 = this.j + measuredWidth2;
                i3++;
            }
        }
        b();
        return 1;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00fb399de6c6aa20a8edadb8b8299067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00fb399de6c6aa20a8edadb8b8299067");
            return;
        }
        int childCount = getChildCount() - 1;
        int size = this.e.size();
        com.sankuai.shangou.stone.util.log.a.a("SingleLineWithOmitHorizontalFlowLayout", "需要显示的View数量 " + size, new Object[0]);
        for (int i = 0; i < size; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                childAt.setVisibility(0);
            }
        }
        while (size < childCount) {
            View childAt2 = getChildAt(size);
            if (childAt2 != null) {
                childAt2.setVisibility(8);
            }
            size++;
        }
        if (this.g) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
    }

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda0128412d1bbabec9297619f811da1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda0128412d1bbabec9297619f811da1");
                return;
            }
            this.c = i;
            this.d = i2;
            this.b = i3;
        }
    }
}
