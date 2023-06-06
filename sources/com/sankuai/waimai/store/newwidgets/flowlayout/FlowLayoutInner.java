package com.sankuai.waimai.store.newwidgets.flowlayout;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
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
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlowLayoutInner extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private com.sankuai.waimai.store.newwidgets.flowlayout.a c;
    private final SparseArray<List<View>> d;
    private DataSetObserver e;
    private SparseIntArray f;
    private b g;
    private final List<View> h;
    private int i;
    private Drawable j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ void a(FlowLayoutInner flowLayoutInner) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, flowLayoutInner, changeQuickRedirect, false, "3d1e729e7b46cadc34b648237bf2ea7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowLayoutInner, changeQuickRedirect, false, "3d1e729e7b46cadc34b648237bf2ea7f");
            return;
        }
        int childCount = flowLayoutInner.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = flowLayoutInner.getChildAt(i);
            Object[] objArr2 = {childAt};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, flowLayoutInner, changeQuickRedirect2, false, "7faebca0146a7e485270a2f955b60111", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, flowLayoutInner, changeQuickRedirect2, false, "7faebca0146a7e485270a2f955b60111");
            } else {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar != null) {
                    int i2 = cVar.b;
                    List<View> list = flowLayoutInner.d.get(i2);
                    if (list == null) {
                        list = new ArrayList<>();
                        flowLayoutInner.d.put(i2, list);
                    }
                    Object[] objArr3 = {childAt};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, flowLayoutInner, changeQuickRedirect3, false, "dd34181a6a97b9a07c2349052f257926", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, flowLayoutInner, changeQuickRedirect3, false, "dd34181a6a97b9a07c2349052f257926");
                    } else {
                        childAt.setAccessibilityDelegate(null);
                        flowLayoutInner.a(childAt);
                    }
                    list.add(childAt);
                    flowLayoutInner.a(list);
                }
            }
        }
    }

    public static /* synthetic */ void b(FlowLayoutInner flowLayoutInner) {
        View remove;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, flowLayoutInner, changeQuickRedirect, false, "926664e5492ef58318124774af7696b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowLayoutInner, changeQuickRedirect, false, "926664e5492ef58318124774af7696b5");
            return;
        }
        super.removeAllViews();
        if (flowLayoutInner.c == null) {
            return;
        }
        int count = flowLayoutInner.c.getCount();
        for (int i = 0; i < count; i++) {
            int itemViewType = flowLayoutInner.c.getItemViewType(i);
            com.sankuai.waimai.store.newwidgets.flowlayout.a aVar = flowLayoutInner.c;
            Object[] objArr2 = {Integer.valueOf(itemViewType)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, flowLayoutInner, changeQuickRedirect2, false, "0a8ec99e539a48685a4082b900bc9c8a", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (View) PatchProxy.accessDispatch(objArr2, flowLayoutInner, changeQuickRedirect2, false, "0a8ec99e539a48685a4082b900bc9c8a");
            } else {
                List<View> list = flowLayoutInner.d.get(itemViewType);
                remove = (list == null || list.isEmpty()) ? null : list.remove(0);
            }
            View view = aVar.getView(i, remove, flowLayoutInner);
            if (view == null) {
                throw new RuntimeException(flowLayoutInner.getClass().getName() + "：null == child");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = flowLayoutInner.generateDefaultLayoutParams();
            } else if (!(layoutParams instanceof c)) {
                layoutParams = flowLayoutInner.generateLayoutParams(layoutParams);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9133b04a6bb9426d7363c7e4bcd3275d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9133b04a6bb9426d7363c7e4bcd3275d") : new c(getContext(), attributeSet);
    }

    public FlowLayoutInner(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "681e6127bcdf310a75c04385d8151b29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "681e6127bcdf310a75c04385d8151b29");
            return;
        }
        this.b = 1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new b() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayoutInner.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayoutInner.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "340a5c57aa5430980b6d39955895d2c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "340a5c57aa5430980b6d39955895d2c9");
                    return;
                }
                FlowLayoutInner.a(FlowLayoutInner.this);
                FlowLayoutInner.b(FlowLayoutInner.this);
                FlowLayoutInner.this.requestLayout();
            }
        };
        this.h = new ArrayList();
        setPadding(0, 0, 0, 0);
    }

    public FlowLayoutInner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7c347410251722df986903b7f5b686", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7c347410251722df986903b7f5b686");
            return;
        }
        this.b = 1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new b() { // from class: com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayoutInner.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.flowlayout.FlowLayoutInner.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "340a5c57aa5430980b6d39955895d2c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "340a5c57aa5430980b6d39955895d2c9");
                    return;
                }
                FlowLayoutInner.a(FlowLayoutInner.this);
                FlowLayoutInner.b(FlowLayoutInner.this);
                FlowLayoutInner.this.requestLayout();
            }
        };
        this.h = new ArrayList();
        setPadding(0, 0, 0, 0);
    }

    public void setMaxLines(int i) {
        this.b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        this.j = drawable;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b04893af4ccee3e5254c7a716dcc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b04893af4ccee3e5254c7a716dcc88");
            return;
        }
        int childCount = getChildCount();
        this.i = 0;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i7 >= childCount) {
                i3 = i5;
                i4 = i6;
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    layoutParams.width = -2;
                }
                if (layoutParams.height == -1) {
                    layoutParams.height = -2;
                }
                i3 = i5;
                int i12 = i6;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                c cVar = (c) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + cVar.leftMargin + cVar.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i8 > size) {
                    i9 += i10;
                    i11++;
                    i8 = 0;
                    i10 = 0;
                }
                if (i11 == 0) {
                    this.i++;
                }
                if (this.b > 0 && i11 >= this.b) {
                    i4 = i12;
                    break;
                }
                i8 += measuredWidth;
                i10 = Math.max(i10, measuredHeight);
                i6 = combineMeasuredStates(i12, childAt.getMeasuredState());
                i5 = i8;
            }
            i7++;
        }
        setMeasuredDimension(i3, resolveSizeAndState(Math.max(i9 + i10, getSuggestedMinimumHeight()), i2, i4 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180b4e692ea18bca33bbee6a98a41465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180b4e692ea18bca33bbee6a98a41465");
        } else if (this.c == null) {
        } else {
            a(i, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount;
        int i = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e24a3cd4a701c19f3c2655aea206656c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e24a3cd4a701c19f3c2655aea206656c");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.j == null || (childCount = getChildCount()) <= 1) {
            return;
        }
        int intrinsicWidth = this.j.getIntrinsicWidth();
        int intrinsicHeight = this.j.getIntrinsicHeight();
        this.j.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        int i2 = intrinsicWidth / 2;
        int i3 = intrinsicHeight / 2;
        View childAt = getChildAt(0);
        while (i < childCount) {
            View childAt2 = getChildAt(i);
            if (childAt2.getBottom() == childAt.getBottom() && childAt.getRight() > 0) {
                canvas.save();
                canvas.translate(((childAt.getRight() + childAt2.getLeft()) / 2) - i2, ((childAt2.getTop() + childAt2.getBottom()) / 2) - i3);
                this.j.draw(canvas);
                canvas.restore();
            }
            i++;
            childAt = childAt2;
        }
    }

    public int getFirstLineCount() {
        return this.i;
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134666a5c75bea0faaa9de1cd4690e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134666a5c75bea0faaa9de1cd4690e25");
            return;
        }
        this.f.clear();
        this.h.clear();
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
                    return;
                }
                i5 = Math.max(i5, measuredHeight);
                int i8 = cVar.leftMargin + i3;
                i3 += cVar.leftMargin + measuredWidth + cVar.rightMargin;
                childAt.layout(i8, i4, measuredWidth + i8, measuredHeight + i4);
                this.h.add(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a452b19a2742b19fdb8d110c954e59e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a452b19a2742b19fdb8d110c954e59e")).booleanValue();
        }
        try {
            if (this.h.contains(view)) {
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf628281e6470975c2f179e5b33e645", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf628281e6470975c2f179e5b33e645") : new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f41c5b4dffe7bf1cfbac9841676a5c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f41c5b4dffe7bf1cfbac9841676a5c1");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void setAdapter(com.sankuai.waimai.store.newwidgets.flowlayout.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20173c27172fef840237b6b52a1679b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20173c27172fef840237b6b52a1679b");
            return;
        }
        if (this.c != null && this.e != null) {
            this.c.unregisterDataSetObserver(this.e);
        }
        if (aVar != null) {
            this.c = aVar;
            this.e = new a(this.g);
            this.c.registerDataSetObserver(this.e);
        }
        this.g.a();
    }

    private void a(List<View> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e6ba805e422ce49ad2d7953407181f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e6ba805e422ce49ad2d7953407181f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8da291e36febbdea6857742192f6deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8da291e36febbdea6857742192f6deb");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172e07e71a329ed5f93ba90974d3052a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172e07e71a329ed5f93ba90974d3052a");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06765680824a012318ca1cca8b602588", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06765680824a012318ca1cca8b602588");
            } else {
                this.b.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c09d78d1631c1b4e8d10f3797aedae", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c09d78d1631c1b4e8d10f3797aedae");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e692ae096d3ae8c8aa265d50c1e8f416", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e692ae096d3ae8c8aa265d50c1e8f416");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a89790d8f61536a1539b256b89bd52e1", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a89790d8f61536a1539b256b89bd52e1");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fec281873b576449d5613c2d661140", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fec281873b576449d5613c2d661140");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fa7d36b96ee25423214e4b7c5c03fd", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fa7d36b96ee25423214e4b7c5c03fd");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4dab0b7ed56e2449af633983fd78ac", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeViewAt(int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4dab0b7ed56e2449af633983fd78ac");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea8d36321488bb37c03d906a808e0da", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeAllViews() is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea8d36321488bb37c03d906a808e0da");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8c2c815d626de54ad293eb75d89950", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8c2c815d626de54ad293eb75d89950");
            }
        }

        public c(int i, int i2) {
            super(-2, -2);
            Object[] objArr = {-2, -2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c8b537181980cda4803d22f618d6896", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c8b537181980cda4803d22f618d6896");
            }
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Object[] objArr = {marginLayoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c262110a3fa7d505baa710c31e6e6b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c262110a3fa7d505baa710c31e6e6b2");
            }
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919b91c601a771d1b6b4d0ad39533789", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919b91c601a771d1b6b4d0ad39533789");
            }
        }
    }
}
