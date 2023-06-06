package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SingleLinePriorityHorizontalFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private List<View> b;
    private List<View> c;
    private List<b> d;
    private List<b> e;
    private List<b> f;
    private final List<Integer> g;
    private final List<a> h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public c a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a = null;
        public static int b = 1;
        public static int c;
        public static int d;
        public int e;
        public int f;
    }

    public SingleLinePriorityHorizontalFlowLayout(Context context) {
        this(context, 25, 5, 5);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e7f9a82e7a6b3f00314c08f566edcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e7f9a82e7a6b3f00314c08f566edcb");
        }
    }

    public SingleLinePriorityHorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb8904946c2a8dffe2c8c1938bd6ca2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb8904946c2a8dffe2c8c1938bd6ca2");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.m = 0;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbdba68d51d0a0d4923a999bafc04d50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbdba68d51d0a0d4923a999bafc04d50");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927, R.attr.childHeight, R.attr.childMarginHorizontal, R.attr.childMarginVertical});
        this.j = (int) obtainStyledAttributes.getDimension(1, g.a(context, 25.0f));
        this.k = (int) obtainStyledAttributes.getDimension(2, g.a(context, 5.0f));
        this.l = (int) obtainStyledAttributes.getDimension(3, g.a(context, 5.0f));
        this.m = obtainStyledAttributes.getInt(0, this.m);
        obtainStyledAttributes.recycle();
    }

    private SingleLinePriorityHorizontalFlowLayout(Context context, int i, int i2, int i3) {
        super(context);
        Object[] objArr = {context, 25, 5, 5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d5fa3a8c77fd5d1192bb646cfaa8d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d5fa3a8c77fd5d1192bb646cfaa8d3");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.m = 0;
        Object[] objArr2 = {25, 5, 5, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66a519e5ee975169c8a3a90e2c06385c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66a519e5ee975169c8a3a90e2c06385c");
            return;
        }
        this.j = g.a(getContext(), 25);
        float f = 5;
        this.k = g.a(getContext(), f);
        this.l = g.a(getContext(), f);
    }

    public void setGravity(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650b2c7d3a73c80cbb1794932131c3d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650b2c7d3a73c80cbb1794932131c3d5");
        } else if (this.m != i) {
            this.m = i;
            requestLayout();
        }
    }

    public List<c> getShownViewInfoList() {
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af44a58ff648dac7da2eccf76e0dd6bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af44a58ff648dac7da2eccf76e0dd6bc");
        }
        List<b> list = this.f;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf014951fe89622075a61994ad9ee584", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf014951fe89622075a61994ad9ee584");
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b bVar : list) {
                if (bVar != null && bVar.a != null) {
                    c cVar2 = bVar.a;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "5667736d228e9e9dcf0e0f6190d1f12b", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar = (c) PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "5667736d228e9e9dcf0e0f6190d1f12b");
                    } else {
                        c cVar3 = new c();
                        cVar3.e = cVar2.e;
                        cVar3.f = cVar2.f;
                        cVar = cVar3;
                    }
                    arrayList.add(cVar);
                }
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int size;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89daf38e2ef0f56439876b5302a4dbd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89daf38e2ef0f56439876b5302a4dbd3");
            return;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int a2 = a(defaultSize);
        Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23052edab232bf5be99fe2a4baf6558f", RobustBitConfig.DEFAULT_VALUE)) {
            size = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23052edab232bf5be99fe2a4baf6558f")).intValue();
        } else {
            Object[] objArr3 = {Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88879548b8947dbf8f0aff34f7532bd8", RobustBitConfig.DEFAULT_VALUE)) {
                paddingTop = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88879548b8947dbf8f0aff34f7532bd8")).intValue();
            } else {
                paddingTop = getPaddingTop() + getPaddingBottom();
                if (a2 > 0) {
                    paddingTop += (this.j * a2) + (this.l * (a2 - 1));
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.SingleLinePriorityHorizontalFlowLayout.onLayout(boolean, int, int, int, int):void");
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558d26fae70f7839eac023068e9717fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558d26fae70f7839eac023068e9717fe")).intValue();
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        this.g.clear();
        this.h.clear();
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft <= 0) {
            return 0;
        }
        this.i = true;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            childAt.measure(Integer.MIN_VALUE | paddingLeft, this.j | 1073741824);
            int measuredWidth = childAt.getMeasuredWidth() + i3;
            if (measuredWidth > paddingLeft) {
                this.i = false;
                break;
            }
            this.h.add(new a(i3, measuredWidth));
            i3 = this.k + measuredWidth;
            i2++;
        }
        int size = this.h.size();
        for (int i4 = 0; i4 < size; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2 != null) {
                childAt2.setVisibility(0);
            }
        }
        for (int i5 = size; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null) {
                childAt3.setVisibility(8);
            }
        }
        int min = Math.min(this.b.size(), size);
        if (min < size) {
            a aVar = this.h.get(0);
            a aVar2 = this.h.get(min);
            int i6 = aVar2.c - aVar.c;
            int i7 = (this.h.get(size - 1).d - aVar2.c) + this.k;
            int i8 = aVar2.c - i6;
            int i9 = aVar.d + i7;
            if (i8 >= getPaddingLeft() && i9 <= i - getPaddingRight()) {
                for (int i10 = 0; i10 < min; i10++) {
                    a aVar3 = this.h.get(i10);
                    aVar3.c += i7;
                    aVar3.d += i7;
                }
                for (int i11 = min; i11 < size; i11++) {
                    a aVar4 = this.h.get(i11);
                    aVar4.c -= i6;
                    aVar4.d -= i6;
                }
            }
        }
        this.f.clear();
        if (min < size) {
            this.f.addAll(this.d);
            this.f.addAll(this.e.subList(0, Math.min(size - min, this.e.size())));
        } else {
            this.f.addAll(this.d.subList(0, Math.min(min, this.d.size())));
        }
        return 1;
    }

    private Integer b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e5624f91a62c59e5c8be8191a41a24", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e5624f91a62c59e5c8be8191a41a24");
        }
        if (i < 0 || i >= this.g.size()) {
            return 0;
        }
        return this.g.get(i);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7344416d2da59e6965413d4456519e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7344416d2da59e6965413d4456519e4");
                return;
            }
            this.c = i;
            this.d = i2;
            this.b = i3;
        }
    }
}
