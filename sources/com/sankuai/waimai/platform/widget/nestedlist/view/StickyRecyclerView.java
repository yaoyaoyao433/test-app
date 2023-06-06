package com.sankuai.waimai.platform.widget.nestedlist.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.nestedlist.interfaces.d;
import com.sankuai.waimai.platform.widget.recycler.ExtendedLinearLayoutManager;
import com.sankuai.waimai.platform.widget.recycler.b;
import com.sankuai.waimai.platform.widget.recycler.e;
import com.sankuai.waimai.platform.widget.recycler.i;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.NovaSmoothRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StickyRecyclerView extends ViewGroup {
    public static ChangeQuickRedirect a;
    private final RecyclerView.k b;
    @NonNull
    private final RecyclerView c;
    @Nullable
    private View d;
    @Nullable
    private a e;

    public StickyRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a564445e969eafa8acb474d02e80fe2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a564445e969eafa8acb474d02e80fe2b");
            return;
        }
        this.b = new RecyclerView.k() { // from class: com.sankuai.waimai.platform.widget.nestedlist.view.StickyRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbe2726383cb8f54cf6bbd15a955d4b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbe2726383cb8f54cf6bbd15a955d4b9");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (StickyRecyclerView.this.e != null) {
                    StickyRecyclerView.this.e.a();
                }
            }
        };
        this.c = b(context);
        a(context);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6c1713468783a0fbb61195236fcd25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6c1713468783a0fbb61195236fcd25");
            return;
        }
        this.b = new RecyclerView.k() { // from class: com.sankuai.waimai.platform.widget.nestedlist.view.StickyRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbe2726383cb8f54cf6bbd15a955d4b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbe2726383cb8f54cf6bbd15a955d4b9");
                    return;
                }
                super.onScrolled(recyclerView, i2, i22);
                if (StickyRecyclerView.this.e != null) {
                    StickyRecyclerView.this.e.a();
                }
            }
        };
        this.c = b(context);
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eda93a54e02033bda9116fd624831eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eda93a54e02033bda9116fd624831eb");
            return;
        }
        super.removeAllViews();
        super.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
    }

    @NonNull
    private RecyclerView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b8898629486ae1407a5159d13d638fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b8898629486ae1407a5159d13d638fd");
        }
        NovaSmoothRecyclerView novaSmoothRecyclerView = new NovaSmoothRecyclerView(context);
        novaSmoothRecyclerView.setLayoutManager(new ExtendedLinearLayoutManager(context, 1, false));
        novaSmoothRecyclerView.addOnScrollListener(this.b);
        return novaSmoothRecyclerView;
    }

    @NonNull
    public ExtendedLinearLayoutManager getRecyclerLayoutManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d8f9c09d6ac6e72f90cde4e69d53a5", RobustBitConfig.DEFAULT_VALUE) ? (ExtendedLinearLayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d8f9c09d6ac6e72f90cde4e69d53a5") : (ExtendedLinearLayoutManager) this.c.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeaderView(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c7da8ae498846f75dc1fa10e0a2888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c7da8ae498846f75dc1fa10e0a2888");
        } else if (view != this.d) {
            if (this.d != null) {
                removeView(this.d);
            }
            if (view != null) {
                addView(view, new ViewGroup.LayoutParams(-1, -2));
            }
            this.d = view;
        }
    }

    @NonNull
    public RecyclerView getWrappedRecyclerView() {
        return this.c;
    }

    @Nullable
    public View getStickyHeaderView() {
        return this.d;
    }

    public int getStickyHeaderViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc6c72ba285783ea66a593214a97235", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc6c72ba285783ea66a593214a97235")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getHeight();
    }

    public <Holder extends b, Group, Child> void setGroupedAdapter(com.sankuai.waimai.platform.widget.nestedlist.adapter.b<Holder, Group, Child> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12daf026ab7ee9a4b68ca58495bf574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12daf026ab7ee9a4b68ca58495bf574");
            return;
        }
        if (this.e != null) {
            a aVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6f8ec378dcba5c495c6c38d8937c2f63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6f8ec378dcba5c495c6c38d8937c2f63");
            } else {
                StickyRecyclerView.this.c.getAdapter();
                aVar.c.b(aVar.b);
                StickyRecyclerView.this.c.setAdapter(null);
                StickyRecyclerView.this.setHeaderView(null);
            }
            this.e = null;
        }
        if (bVar != null) {
            this.e = new a(bVar);
        }
    }

    public com.sankuai.waimai.platform.widget.nestedlist.adapter.b getGroupedAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc404b5ce92f69483def62d764fd0153", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.nestedlist.adapter.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc404b5ce92f69483def62d764fd0153");
        }
        if (this.e == null) {
            return null;
        }
        return this.e.d;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9a1c6f5561f947460213ea7f661851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9a1c6f5561f947460213ea7f661851");
            return;
        }
        super.onMeasure(i, i2);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88da47bd29c76224553572149b1dcd7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88da47bd29c76224553572149b1dcd7a");
            return;
        }
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (this.e != null) {
            this.e.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a<Holder extends b, Group, Child> {
        public static ChangeQuickRedirect a;
        final e b;
        @NonNull
        final d c;
        @NonNull
        final com.sankuai.waimai.platform.widget.nestedlist.adapter.b<Holder, Group, Child> d;
        @NonNull
        private final i<b> f;
        private int g;
        private Holder h;
        private SparseArray<Holder> i;

        public a(@NonNull com.sankuai.waimai.platform.widget.nestedlist.adapter.b<Holder, Group, Child> bVar) {
            Object[] objArr = {StickyRecyclerView.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8434e0dc6d1cad327b87baef61ef1233", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8434e0dc6d1cad327b87baef61ef1233");
                return;
            }
            this.b = new e() { // from class: com.sankuai.waimai.platform.widget.nestedlist.view.StickyRecyclerView.a.1
            };
            this.g = -1;
            this.d = bVar;
            this.c = bVar.c;
            this.f = new i<>(this.d);
            this.d.a(this.b);
            StickyRecyclerView.this.c.setAdapter(this.f);
            StickyRecyclerView.this.requestLayout();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0282 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                Method dump skipped, instructions count: 725
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.nestedlist.view.StickyRecyclerView.a.a():void");
        }
    }
}
