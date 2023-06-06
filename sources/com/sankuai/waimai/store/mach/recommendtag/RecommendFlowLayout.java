package com.sankuai.waimai.store.mach.recommendtag;

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
public class RecommendFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private com.sankuai.waimai.store.mach.recommendtag.a c;
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

    public static /* synthetic */ void a(RecommendFlowLayout recommendFlowLayout) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, recommendFlowLayout, changeQuickRedirect, false, "a181dcba8a03ef365ac4b77b4d8b7d6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, recommendFlowLayout, changeQuickRedirect, false, "a181dcba8a03ef365ac4b77b4d8b7d6c");
            return;
        }
        int childCount = recommendFlowLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recommendFlowLayout.getChildAt(i);
            Object[] objArr2 = {childAt};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, recommendFlowLayout, changeQuickRedirect2, false, "77a7b24f0be00798fc7ac4f933754af4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, recommendFlowLayout, changeQuickRedirect2, false, "77a7b24f0be00798fc7ac4f933754af4");
            } else {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar != null) {
                    int i2 = cVar.b;
                    List<View> list = recommendFlowLayout.d.get(i2);
                    if (list == null) {
                        list = new ArrayList<>();
                        recommendFlowLayout.d.put(i2, list);
                    }
                    Object[] objArr3 = {childAt};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, recommendFlowLayout, changeQuickRedirect3, false, "806a5876fbbb66100e7fb895cc325943", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, recommendFlowLayout, changeQuickRedirect3, false, "806a5876fbbb66100e7fb895cc325943");
                    } else {
                        childAt.setAccessibilityDelegate(null);
                        recommendFlowLayout.a(childAt);
                    }
                    list.add(childAt);
                    recommendFlowLayout.a(list);
                }
            }
        }
    }

    public static /* synthetic */ void b(RecommendFlowLayout recommendFlowLayout) {
        View remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, recommendFlowLayout, changeQuickRedirect, false, "e1f245f2bb69d4e42c2510fc701e0c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, recommendFlowLayout, changeQuickRedirect, false, "e1f245f2bb69d4e42c2510fc701e0c19");
            return;
        }
        super.removeAllViews();
        if (recommendFlowLayout.c == null) {
            return;
        }
        int count = recommendFlowLayout.c.getCount();
        for (int i = 0; i < count; i++) {
            int itemViewType = recommendFlowLayout.c.getItemViewType(i);
            com.sankuai.waimai.store.mach.recommendtag.a aVar = recommendFlowLayout.c;
            Object[] objArr2 = {Integer.valueOf(itemViewType)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, recommendFlowLayout, changeQuickRedirect2, false, "657771f726fd567de3da852ae176dd22", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (View) PatchProxy.accessDispatch(objArr2, recommendFlowLayout, changeQuickRedirect2, false, "657771f726fd567de3da852ae176dd22");
            } else {
                List<View> list = recommendFlowLayout.d.get(itemViewType);
                remove = (list == null || list.isEmpty()) ? null : list.remove(0);
            }
            View view = aVar.getView(i, remove, recommendFlowLayout);
            if (view == null) {
                throw new RuntimeException(recommendFlowLayout.getClass().getName() + "：null == child");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = recommendFlowLayout.generateDefaultLayoutParams();
            } else if (!(layoutParams instanceof c)) {
                layoutParams = recommendFlowLayout.generateLayoutParams(layoutParams);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee9d68120f0f7397dc9f72df06c8331e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee9d68120f0f7397dc9f72df06c8331e") : new c(getContext(), attributeSet);
    }

    public RecommendFlowLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9625b2b25a2fbdb4701f89366fa001e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9625b2b25a2fbdb4701f89366fa001e");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new b() { // from class: com.sankuai.waimai.store.mach.recommendtag.RecommendFlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.recommendtag.RecommendFlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e7b774688aa32e288d6e7d507ed5f42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e7b774688aa32e288d6e7d507ed5f42");
                    return;
                }
                RecommendFlowLayout.a(RecommendFlowLayout.this);
                RecommendFlowLayout.b(RecommendFlowLayout.this);
                RecommendFlowLayout.this.requestLayout();
            }
        };
        this.j = new ArrayList();
        this.k = new Runnable() { // from class: com.sankuai.waimai.store.mach.recommendtag.RecommendFlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bf77d7d0e26070df87eb02faaaed99b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bf77d7d0e26070df87eb02faaaed99b");
                } else if (RecommendFlowLayout.this.c != null && RecommendFlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[RecommendFlowLayout.this.f.size()];
                    for (int i = 0; i < RecommendFlowLayout.this.f.size(); i++) {
                        iArr[i] = RecommendFlowLayout.this.f.keyAt(i);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.mach.recommendtag.a unused = RecommendFlowLayout.this.c;
                        RecommendFlowLayout.this.f.get(iArr[length]);
                    }
                    RecommendFlowLayout.this.f.clear();
                    RecommendFlowLayout.this.c.notifyDataSetChanged();
                }
            }
        };
        setPadding(0, 0, 0, 0);
    }

    public RecommendFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f65ec7e4417a438be41481ccf32022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f65ec7e4417a438be41481ccf32022");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new b() { // from class: com.sankuai.waimai.store.mach.recommendtag.RecommendFlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.recommendtag.RecommendFlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e7b774688aa32e288d6e7d507ed5f42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e7b774688aa32e288d6e7d507ed5f42");
                    return;
                }
                RecommendFlowLayout.a(RecommendFlowLayout.this);
                RecommendFlowLayout.b(RecommendFlowLayout.this);
                RecommendFlowLayout.this.requestLayout();
            }
        };
        this.j = new ArrayList();
        this.k = new Runnable() { // from class: com.sankuai.waimai.store.mach.recommendtag.RecommendFlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bf77d7d0e26070df87eb02faaaed99b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bf77d7d0e26070df87eb02faaaed99b");
                } else if (RecommendFlowLayout.this.c != null && RecommendFlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[RecommendFlowLayout.this.f.size()];
                    for (int i2 = 0; i2 < RecommendFlowLayout.this.f.size(); i2++) {
                        iArr[i2] = RecommendFlowLayout.this.f.keyAt(i2);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.mach.recommendtag.a unused = RecommendFlowLayout.this.c;
                        RecommendFlowLayout.this.f.get(iArr[length]);
                    }
                    RecommendFlowLayout.this.f.clear();
                    RecommendFlowLayout.this.c.notifyDataSetChanged();
                }
            }
        };
        setPadding(0, 0, 0, 0);
    }

    public List<Integer> getIdList() {
        return this.g;
    }

    public void setMaxLines(int i) {
        this.b = i;
    }

    public int getLineCount() {
        return this.i;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f86ff838ec7acb894bea3db723fcc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f86ff838ec7acb894bea3db723fcc3f");
        } else if (!this.c.a()) {
            b(i, i2);
        } else {
            a(i, i2);
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8584e54ea39d75353c815cf7ce452051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8584e54ea39d75353c815cf7ce452051");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "315f05fadf1b53e3630acfa15b9dcf2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "315f05fadf1b53e3630acfa15b9dcf2b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02097b8d6a1aebea3386be65c829ccd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02097b8d6a1aebea3386be65c829ccd8");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5b8dd115c349ce77f203f55427f9a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5b8dd115c349ce77f203f55427f9a0");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aec41a894b55ffed98685c569825cd2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aec41a894b55ffed98685c569825cd2d");
        } else if (this.f.size() != 0) {
            removeCallbacks(this.k);
            post(this.k);
        }
    }

    private void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93addc8f2dca39d6ce24d46768bff3b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93addc8f2dca39d6ce24d46768bff3b1");
            return;
        }
        this.f.clear();
        this.j.clear();
        int childCount = getChildCount();
        this.g.clear();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfede3bbfea557c5603094ccead979d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfede3bbfea557c5603094ccead979d7")).booleanValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8781988e7e98a97fe0495ae61a4adccd", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8781988e7e98a97fe0495ae61a4adccd") : new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52b45df23ef5310debae6a9a1e6501e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52b45df23ef5310debae6a9a1e6501e4");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void setAdapter(com.sankuai.waimai.store.mach.recommendtag.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f339a1d8509ed3c70fcd9dea58f6e56c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f339a1d8509ed3c70fcd9dea58f6e56c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275fb3e3607de13cce73eaa9c017dc1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275fb3e3607de13cce73eaa9c017dc1b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e7d2f197cecf41f82460b0f1669d320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e7d2f197cecf41f82460b0f1669d320");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5fd3d6cfa71342f74fea92dd1b8deb4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5fd3d6cfa71342f74fea92dd1b8deb4");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36e1a3e6ef89dace5496feb305c8490", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36e1a3e6ef89dace5496feb305c8490");
            } else {
                this.b.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50b4b49f81a4298e7a9078eb63d1a35", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50b4b49f81a4298e7a9078eb63d1a35");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91184252777a2134e9367bfce949b42d", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91184252777a2134e9367bfce949b42d");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17041aebdb6afa974f5118805a5a08c8", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17041aebdb6afa974f5118805a5a08c8");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5569930ea3f2c30aeba63438d9e409c1", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5569930ea3f2c30aeba63438d9e409c1");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5a52dc3ace2636efcc8a13c197c799", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5a52dc3ace2636efcc8a13c197c799");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc1c2363362d5384c85c9d56a36751a3", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeViewAt(int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc1c2363362d5384c85c9d56a36751a3");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361ebc3bc8b0ea8889be74d56017f05d", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeAllViews() is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361ebc3bc8b0ea8889be74d56017f05d");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e7ab7526ddc8a1621687da0dc382695", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e7ab7526ddc8a1621687da0dc382695");
            }
        }

        public c(int i, int i2) {
            super(-2, -2);
            Object[] objArr = {-2, -2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d082d12c344f20ac5e4c55c7de06f82", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d082d12c344f20ac5e4c55c7de06f82");
            }
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Object[] objArr = {marginLayoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbbac61f113c4b4a88320f066e727072", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbbac61f113c4b4a88320f066e727072");
            }
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72535d2834799ccb784b302d7bf8bf0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72535d2834799ccb784b302d7bf8bf0c");
            }
        }
    }
}
