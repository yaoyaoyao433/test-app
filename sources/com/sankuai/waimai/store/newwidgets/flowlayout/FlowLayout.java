package com.sankuai.waimai.store.newwidgets.flowlayout;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private com.sankuai.waimai.store.newwidgets.flowlayout.a c;
    private final SparseArray<List<View>> d;
    private DataSetObserver e;
    private SparseIntArray f;
    private List<Integer> g;
    private b h;
    private int i;
    private final List<View> j;
    private Runnable k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ void a(FlowLayout flowLayout) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, flowLayout, changeQuickRedirect, false, "a4af24de6a63c0f58b3174f9dfc6d3ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowLayout, changeQuickRedirect, false, "a4af24de6a63c0f58b3174f9dfc6d3ab");
            return;
        }
        int childCount = flowLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = flowLayout.getChildAt(i);
            Object[] objArr2 = {childAt};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, flowLayout, changeQuickRedirect2, false, "b8fe44e069b7ff1f4daf119f23aecc1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, flowLayout, changeQuickRedirect2, false, "b8fe44e069b7ff1f4daf119f23aecc1b");
            } else {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar != null) {
                    int i2 = cVar.b;
                    List<View> list = flowLayout.d.get(i2);
                    if (list == null) {
                        list = new ArrayList<>();
                        flowLayout.d.put(i2, list);
                    }
                    Object[] objArr3 = {childAt};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, flowLayout, changeQuickRedirect3, false, "5dfd2886b53d6020f8869a9a0eecdbf3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, flowLayout, changeQuickRedirect3, false, "5dfd2886b53d6020f8869a9a0eecdbf3");
                    } else {
                        childAt.setAccessibilityDelegate(null);
                        flowLayout.a(childAt);
                    }
                    list.add(childAt);
                    flowLayout.a(list);
                }
            }
        }
    }

    public static /* synthetic */ void b(FlowLayout flowLayout) {
        View remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, flowLayout, changeQuickRedirect, false, "af381ea471f429593b410e16e5c5bcaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowLayout, changeQuickRedirect, false, "af381ea471f429593b410e16e5c5bcaf");
            return;
        }
        super.removeAllViews();
        if (flowLayout.c == null) {
            return;
        }
        int count = flowLayout.c.getCount();
        for (int i = 0; i < count; i++) {
            int itemViewType = flowLayout.c.getItemViewType(i);
            com.sankuai.waimai.store.newwidgets.flowlayout.a aVar = flowLayout.c;
            Object[] objArr2 = {Integer.valueOf(itemViewType)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, flowLayout, changeQuickRedirect2, false, "4db9ca9edd7e1a7f320602a341bd38f5", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (View) PatchProxy.accessDispatch(objArr2, flowLayout, changeQuickRedirect2, false, "4db9ca9edd7e1a7f320602a341bd38f5");
            } else {
                List<View> list = flowLayout.d.get(itemViewType);
                remove = (list == null || list.isEmpty()) ? null : list.remove(0);
            }
            View view = aVar.getView(i, remove, flowLayout);
            if (view == null) {
                throw new RuntimeException(flowLayout.getClass().getName() + "：null == child");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = flowLayout.generateDefaultLayoutParams();
            } else if (!(layoutParams instanceof c)) {
                layoutParams = flowLayout.generateLayoutParams(layoutParams);
            }
            c cVar = (c) layoutParams;
            cVar.b = itemViewType;
            super.addView(view, -1, cVar);
        }
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc9fa270164212f335b71c3b781c0fa", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc9fa270164212f335b71c3b781c0fa") : new c(getContext(), attributeSet);
    }

    public FlowLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a037b5e07e1aedbabb0dbaf17a2ff1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a037b5e07e1aedbabb0dbaf17a2ff1");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new b() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "113a9efc1c0dc6941a9d2fc335f888ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "113a9efc1c0dc6941a9d2fc335f888ff");
                    return;
                }
                FlowLayout.a(FlowLayout.this);
                FlowLayout.b(FlowLayout.this);
                FlowLayout.this.requestLayout();
            }
        };
        this.j = new ArrayList();
        this.k = new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa241cad6596a226cbc27eb1fe900472", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa241cad6596a226cbc27eb1fe900472");
                } else if (FlowLayout.this.c != null && FlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[FlowLayout.this.f.size()];
                    for (int i = 0; i < FlowLayout.this.f.size(); i++) {
                        iArr[i] = FlowLayout.this.f.keyAt(i);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.newwidgets.flowlayout.a unused = FlowLayout.this.c;
                        FlowLayout.this.f.get(iArr[length]);
                    }
                    FlowLayout.this.f.clear();
                    FlowLayout.this.c.notifyDataSetChanged();
                }
            }
        };
        setPadding(0, 0, 0, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8131338c7676df673c4c9b5a2efa217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8131338c7676df673c4c9b5a2efa217");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new b() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "113a9efc1c0dc6941a9d2fc335f888ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "113a9efc1c0dc6941a9d2fc335f888ff");
                    return;
                }
                FlowLayout.a(FlowLayout.this);
                FlowLayout.b(FlowLayout.this);
                FlowLayout.this.requestLayout();
            }
        };
        this.j = new ArrayList();
        this.k = new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa241cad6596a226cbc27eb1fe900472", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa241cad6596a226cbc27eb1fe900472");
                } else if (FlowLayout.this.c != null && FlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[FlowLayout.this.f.size()];
                    for (int i = 0; i < FlowLayout.this.f.size(); i++) {
                        iArr[i] = FlowLayout.this.f.keyAt(i);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.newwidgets.flowlayout.a unused = FlowLayout.this.c;
                        FlowLayout.this.f.get(iArr[length]);
                    }
                    FlowLayout.this.f.clear();
                    FlowLayout.this.c.notifyDataSetChanged();
                }
            }
        };
        setPadding(0, 0, 0, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee9e552e23035ca0533ffd5ec61b76f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee9e552e23035ca0533ffd5ec61b76f7");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new b() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "113a9efc1c0dc6941a9d2fc335f888ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "113a9efc1c0dc6941a9d2fc335f888ff");
                    return;
                }
                FlowLayout.a(FlowLayout.this);
                FlowLayout.b(FlowLayout.this);
                FlowLayout.this.requestLayout();
            }
        };
        this.j = new ArrayList();
        this.k = new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa241cad6596a226cbc27eb1fe900472", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa241cad6596a226cbc27eb1fe900472");
                } else if (FlowLayout.this.c != null && FlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[FlowLayout.this.f.size()];
                    for (int i2 = 0; i2 < FlowLayout.this.f.size(); i2++) {
                        iArr[i2] = FlowLayout.this.f.keyAt(i2);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.newwidgets.flowlayout.a unused = FlowLayout.this.c;
                        FlowLayout.this.f.get(iArr[length]);
                    }
                    FlowLayout.this.f.clear();
                    FlowLayout.this.c.notifyDataSetChanged();
                }
            }
        };
        setPadding(0, 0, 0, 0);
    }

    public void setMaxLines(int i) {
        this.b = i;
    }

    public List<Integer> getIdList() {
        return this.g;
    }

    public int getLineCount() {
        return this.i;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0374562e3f08f60ae4c23064c13dccba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0374562e3f08f60ae4c23064c13dccba");
        } else if (this.c == null) {
        } else {
            if (!this.c.a()) {
                b(i, i2);
            } else {
                a(i, i2);
            }
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6a9580ea564fb4a2e88f8e159fbc0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6a9580ea564fb4a2e88f8e159fbc0e");
            return;
        }
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(getDefaultSize(getSuggestedMinimumWidth(), i));
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    layoutParams.width = -2;
                }
                if (layoutParams.height == -1) {
                    layoutParams.height = -2;
                }
                int measuredHeight = childAt.getMeasuredHeight();
                measureChildWithMargins(childAt, size, 0, i2, 0);
                i3 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i3);
    }

    private void b(int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ead469af021d1b876a152f7a056120e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ead469af021d1b876a152f7a056120e");
            return;
        }
        int childCount = getChildCount();
        this.l = 0;
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int size = View.MeasureSpec.getSize(defaultSize);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i6 >= childCount) {
                i3 = i5;
                i4 = i10;
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    layoutParams.width = -2;
                }
                if (layoutParams.height == -1) {
                    layoutParams.height = -2;
                }
                i3 = i5;
                measureChildWithMargins(childAt, defaultSize, 0, i2, 0);
                c cVar = (c) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + cVar.leftMargin + cVar.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + cVar.topMargin + cVar.bottomMargin;
                if (measuredWidth + i7 > size) {
                    i8 += i9;
                    i4 = i10 + 1;
                    i7 = 0;
                    i9 = 0;
                } else {
                    i4 = i10;
                }
                if (i4 == 0) {
                    this.l++;
                }
                if (this.b > 0 && i4 >= this.b) {
                    break;
                }
                i7 += measuredWidth;
                i9 = Math.max(i9, measuredHeight);
                i5 = combineMeasuredStates(i3, childAt.getMeasuredState());
                i10 = i4;
            }
            i6++;
        }
        this.i = i4;
        setMeasuredDimension(defaultSize, resolveSizeAndState(Math.max(i8 + i9, getSuggestedMinimumHeight()), i2, i3 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb74670917c058c0c6bc8d08a945d540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb74670917c058c0c6bc8d08a945d540");
        } else if (this.c == null) {
        } else {
            if (this.c.a()) {
                d(i, i3);
            } else {
                c(i, i3);
            }
        }
    }

    public int getFirstLineCount() {
        return this.l;
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac4538219ddd381f8c91c04e8e56bbeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac4538219ddd381f8c91c04e8e56bbeb");
            return;
        }
        this.f.clear();
        this.j.clear();
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (((i3 + measuredWidth) + cVar.leftMargin) + cVar.rightMargin > i2 - i) {
                    i4 += i5;
                    i6++;
                    i3 = 0;
                    i5 = 0;
                }
                if (this.b > 0 && i6 >= this.b) {
                    break;
                }
                i5 = Math.max(i5, cVar.topMargin + measuredHeight + cVar.bottomMargin);
                int i8 = cVar.leftMargin + i3;
                int i9 = cVar.topMargin + i4;
                i3 += cVar.leftMargin + measuredWidth + cVar.rightMargin;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
                this.j.add(childAt);
            }
        }
        this.i = i6;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b51aabfb80176a683777176050d975f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b51aabfb80176a683777176050d975f4");
        } else if (this.f.size() != 0) {
            removeCallbacks(this.k);
            post(this.k);
        }
    }

    private void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35380d5d80b4dad6152e9dff11351ea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35380d5d80b4dad6152e9dff11351ea4");
            return;
        }
        this.f.clear();
        this.j.clear();
        this.g.clear();
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = cVar.leftMargin + i3;
                i4 += cVar.leftMargin + measuredWidth + cVar.rightMargin;
                if (i2 - i > i4) {
                    childAt.layout(i6, cVar.topMargin, measuredWidth + i6, cVar.topMargin + measuredHeight);
                    this.j.add(childAt);
                    this.g.add(Integer.valueOf(i5));
                    i3 = i4;
                } else {
                    i4 = i3;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feef1a42ac22b45aa0574b90b29cbeab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feef1a42ac22b45aa0574b90b29cbeab")).booleanValue();
        }
        try {
            if (this.j.contains(view)) {
                if (super.drawChild(canvas, view, j)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return super.drawChild(canvas, view, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public c generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c3a4e58cd1f5f6e8293645e6d7e3d8", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c3a4e58cd1f5f6e8293645e6d7e3d8") : new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5009e46743cc6c5d66e932c437f8141f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5009e46743cc6c5d66e932c437f8141f");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void setAdapter(com.sankuai.waimai.store.newwidgets.flowlayout.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479758d206d6fda7bc35e36f81564bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479758d206d6fda7bc35e36f81564bbb");
            return;
        }
        if (this.c != null && this.e != null) {
            this.c.unregisterDataSetObserver(this.e);
        }
        if (aVar != null) {
            this.c = aVar;
            this.e = new a(this.h);
            this.c.registerDataSetObserver(this.e);
        }
        this.h.a();
    }

    private void a(List<View> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0dd8d105a10c386e386f1cde95ff06a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0dd8d105a10c386e386f1cde95ff06a");
        } else if (list == null) {
        } else {
            while (list.size() > 10) {
                list.remove(list.size() - 1);
            }
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e7817523d912f6be6cbc7d72885987c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e7817523d912f6be6cbc7d72885987c");
            return;
        }
        view.forceLayout();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends DataSetObserver {
        public static ChangeQuickRedirect a;
        @NonNull
        private final b b;

        private a(@NonNull b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ffdf6c29d9b427d0157c0fc0a028eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ffdf6c29d9b427d0157c0fc0a028eb");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f044e07d38226976a958e83f26ced9f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f044e07d38226976a958e83f26ced9f0");
            } else {
                this.b.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a7f74abc5804f2ad424d17c1bc6fa7", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a7f74abc5804f2ad424d17c1bc6fa7");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aac4bcd034c4cd510b78be20840048b", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aac4bcd034c4cd510b78be20840048b");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf7e2c5a2fb4c2644ebec874ab861d0b", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf7e2c5a2fb4c2644ebec874ab861d0b");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5588ef5b05373f8ac57a1b68d480f2de", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5588ef5b05373f8ac57a1b68d480f2de");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34bc01ba2b76363e4628a54d7c90d0e", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34bc01ba2b76363e4628a54d7c90d0e");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1bcfce5ef157b1fe4a18d48617daf89", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeViewAt(int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1bcfce5ef157b1fe4a18d48617daf89");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c14e980c5f14c6d64fda09c8f76cc1", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeAllViews() is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c14e980c5f14c6d64fda09c8f76cc1");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public static ChangeQuickRedirect a;
        private int b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf265b7d739ac5c1b64ce3f3624af41", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf265b7d739ac5c1b64ce3f3624af41");
            }
        }

        public c(int i, int i2) {
            super(-2, -2);
            Object[] objArr = {-2, -2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c71584a3ad23d1617e4cd8d55e805f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c71584a3ad23d1617e4cd8d55e805f");
            }
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Object[] objArr = {marginLayoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce618296470a065b8d9c7af9b5260ec3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce618296470a065b8d9c7af9b5260ec3");
            }
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b03c4e0315bacc6eedb7e77a0678d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b03c4e0315bacc6eedb7e77a0678d9");
            }
        }
    }
}
