package com.sankuai.waimai.store.drug.newwidgets.flowlayout;

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
    private com.sankuai.waimai.store.drug.newwidgets.flowlayout.a c;
    private final SparseArray<List<View>> d;
    private DataSetObserver e;
    private SparseIntArray f;
    private b g;
    private int h;
    private final List<View> i;
    private Runnable j;
    private int k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ void a(FlowLayout flowLayout) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, flowLayout, changeQuickRedirect, false, "f94baf299621e8d44c21a3419616730d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowLayout, changeQuickRedirect, false, "f94baf299621e8d44c21a3419616730d");
            return;
        }
        int childCount = flowLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = flowLayout.getChildAt(i);
            Object[] objArr2 = {childAt};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, flowLayout, changeQuickRedirect2, false, "7acdb0ebfac35065d2c7853e04286ecb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, flowLayout, changeQuickRedirect2, false, "7acdb0ebfac35065d2c7853e04286ecb");
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
                    if (PatchProxy.isSupport(objArr3, flowLayout, changeQuickRedirect3, false, "74dceff461fa0e109fb5e9201ac80bad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, flowLayout, changeQuickRedirect3, false, "74dceff461fa0e109fb5e9201ac80bad");
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
        if (PatchProxy.isSupport(objArr, flowLayout, changeQuickRedirect, false, "0c3c245e0b0d7d3498c5ad9a5562e984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, flowLayout, changeQuickRedirect, false, "0c3c245e0b0d7d3498c5ad9a5562e984");
            return;
        }
        super.removeAllViews();
        if (flowLayout.c == null) {
            return;
        }
        int count = flowLayout.c.getCount();
        for (int i = 0; i < count; i++) {
            int itemViewType = flowLayout.c.getItemViewType(i);
            com.sankuai.waimai.store.drug.newwidgets.flowlayout.a aVar = flowLayout.c;
            Object[] objArr2 = {Integer.valueOf(itemViewType)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, flowLayout, changeQuickRedirect2, false, "4cedf4590fd42ba2915290195390c644", RobustBitConfig.DEFAULT_VALUE)) {
                remove = (View) PatchProxy.accessDispatch(objArr2, flowLayout, changeQuickRedirect2, false, "4cedf4590fd42ba2915290195390c644");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9927a5bb5cf7c79d8891c4f2517e5863", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9927a5bb5cf7c79d8891c4f2517e5863") : new c(getContext(), attributeSet);
    }

    public FlowLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db9ccf8fe7c4e304b5bb9e746ac03839", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db9ccf8fe7c4e304b5bb9e746ac03839");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new b() { // from class: com.sankuai.waimai.store.drug.newwidgets.flowlayout.FlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.newwidgets.flowlayout.FlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d53aeb80c05e8eda406a415de4165ab3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d53aeb80c05e8eda406a415de4165ab3");
                    return;
                }
                FlowLayout.a(FlowLayout.this);
                FlowLayout.b(FlowLayout.this);
                FlowLayout.this.requestLayout();
            }
        };
        this.i = new ArrayList();
        this.j = new Runnable() { // from class: com.sankuai.waimai.store.drug.newwidgets.flowlayout.FlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d40ef13b8b57b1e7cab821f7af6e9774", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d40ef13b8b57b1e7cab821f7af6e9774");
                } else if (FlowLayout.this.c != null && FlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[FlowLayout.this.f.size()];
                    for (int i = 0; i < FlowLayout.this.f.size(); i++) {
                        iArr[i] = FlowLayout.this.f.keyAt(i);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.drug.newwidgets.flowlayout.a unused = FlowLayout.this.c;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657c0eac962bab7a75696a1dbda351c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657c0eac962bab7a75696a1dbda351c4");
            return;
        }
        this.b = -1;
        this.d = new SparseArray<>();
        this.f = new SparseIntArray();
        this.g = new b() { // from class: com.sankuai.waimai.store.drug.newwidgets.flowlayout.FlowLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.newwidgets.flowlayout.FlowLayout.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d53aeb80c05e8eda406a415de4165ab3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d53aeb80c05e8eda406a415de4165ab3");
                    return;
                }
                FlowLayout.a(FlowLayout.this);
                FlowLayout.b(FlowLayout.this);
                FlowLayout.this.requestLayout();
            }
        };
        this.i = new ArrayList();
        this.j = new Runnable() { // from class: com.sankuai.waimai.store.drug.newwidgets.flowlayout.FlowLayout.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d40ef13b8b57b1e7cab821f7af6e9774", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d40ef13b8b57b1e7cab821f7af6e9774");
                } else if (FlowLayout.this.c != null && FlowLayout.this.f.size() != 0) {
                    int[] iArr = new int[FlowLayout.this.f.size()];
                    for (int i2 = 0; i2 < FlowLayout.this.f.size(); i2++) {
                        iArr[i2] = FlowLayout.this.f.keyAt(i2);
                    }
                    Arrays.sort(iArr);
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        com.sankuai.waimai.store.drug.newwidgets.flowlayout.a unused = FlowLayout.this.c;
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

    public int getLineCount() {
        return this.h;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a4b93c25647ff16c17b2c076f0d52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a4b93c25647ff16c17b2c076f0d52c");
            return;
        }
        int childCount = getChildCount();
        this.k = 0;
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
                boolean b2 = this.c.b(i6);
                if ((measuredWidth + i7 > size) || b2) {
                    i8 += i9;
                    i4 = i10 + 1;
                    i7 = 0;
                    i9 = 0;
                } else {
                    i4 = i10;
                }
                if (i4 == 0) {
                    this.k++;
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
        this.h = i4;
        setMeasuredDimension(defaultSize, resolveSizeAndState(Math.max(i8 + i9, getSuggestedMinimumHeight()), i2, i3 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7098747e8897fd98bc0a9d9b5b183f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7098747e8897fd98bc0a9d9b5b183f");
        } else if (this.c == null) {
        } else {
            a(i, i3);
        }
    }

    public int getFirstLineCount() {
        return this.k;
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488cdda22d13d5bf32de6bca5676b458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488cdda22d13d5bf32de6bca5676b458");
            return;
        }
        this.f.clear();
        this.i.clear();
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
                boolean b2 = this.c.b(i7);
                if ((((i3 + measuredWidth) + cVar.leftMargin) + cVar.rightMargin > i2 - i) || b2) {
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
                this.i.add(childAt);
            }
        }
        this.h = i6;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2424d547f30fe70cf0bf01289afbb86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2424d547f30fe70cf0bf01289afbb86");
        } else if (this.f.size() != 0) {
            removeCallbacks(this.j);
            post(this.j);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d62d92e39a737359ced9ecb85229c374", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d62d92e39a737359ced9ecb85229c374")).booleanValue();
        }
        try {
            if (this.i.contains(view)) {
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27de1dccb90377862a2e53301ff6afd1", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27de1dccb90377862a2e53301ff6afd1") : new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f356cd0e8ac797033a2f3647ee85c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f356cd0e8ac797033a2f3647ee85c2");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void setAdapter(com.sankuai.waimai.store.drug.newwidgets.flowlayout.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6797fe0c3ac782d3a30bd72007d7785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6797fe0c3ac782d3a30bd72007d7785");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea288c6a1fcc7891f3c92275d583b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea288c6a1fcc7891f3c92275d583b4d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44134756ad96684d201dd099d9ceec0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44134756ad96684d201dd099d9ceec0e");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3572f4f3b708b7280c049493599b583", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3572f4f3b708b7280c049493599b583");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db8eea558b2df3ac1704dca1f0b05d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db8eea558b2df3ac1704dca1f0b05d9");
            } else {
                this.b.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb1e90e85710ac9ed0ffae3436ea8a6", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb1e90e85710ac9ed0ffae3436ea8a6");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ca7a826877a012838a138dda833303", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ca7a826877a012838a138dda833303");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2881ff32d23c5d9cf0e9735b9a7da7d1", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2881ff32d23c5d9cf0e9735b9a7da7d1");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e94c225ad46c25c420a43817603a024", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e94c225ad46c25c420a43817603a024");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca36b27151806c5ce2079f3fca1f243", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeView(View) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca36b27151806c5ce2079f3fca1f243");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6144043e31228905f4e5f118dd9a8358", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeViewAt(int) is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6144043e31228905f4e5f118dd9a8358");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ead1ef8f35385551eb06987154f3271", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("removeAllViews() is not supported in FlowLayout");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ead1ef8f35385551eb06987154f3271");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "718a59c7bd854543a7c77a95c65cb253", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "718a59c7bd854543a7c77a95c65cb253");
            }
        }

        public c(int i, int i2) {
            super(-2, -2);
            Object[] objArr = {-2, -2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6f0a798568d26454f3f12604063147", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6f0a798568d26454f3f12604063147");
            }
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Object[] objArr = {marginLayoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b3ce472e3834027030489dbb2ac8d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b3ce472e3834027030489dbb2ac8d9");
            }
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c326bede8a1c1e8bceeb725cc6db9337", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c326bede8a1c1e8bceeb725cc6db9337");
            }
        }
    }
}
