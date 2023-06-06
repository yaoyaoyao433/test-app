package com.sankuai.waimai.log.judas;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StatisticsRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect b;
    private a a;
    protected f c;
    protected RecyclerView.k d;
    private a e;
    private f.a f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(View view, int i);
    }

    public StatisticsRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c48ca970e0621de98235cb2861456c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c48ca970e0621de98235cb2861456c");
            return;
        }
        this.c = new f();
        this.e = new a() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView.a
            public final void a(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b4ce7532b5cf9dec00c50a6a6c3d57f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b4ce7532b5cf9dec00c50a6a6c3d57f");
                    return;
                }
                StatisticsRecyclerView.this.c.a(i);
                if (StatisticsRecyclerView.this.a != null) {
                    StatisticsRecyclerView.this.a.a(view, i);
                }
            }
        };
        this.d = new RecyclerView.k() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5501d231d568759df8c7d90a2faa89f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5501d231d568759df8c7d90a2faa89f");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                switch (i) {
                    case 0:
                        StatisticsRecyclerView.this.c.c();
                        return;
                    case 1:
                        return;
                    case 2:
                        return;
                    default:
                        return;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b632bdd30157830254cee289072f630", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b632bdd30157830254cee289072f630");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    StatisticsRecyclerView.this.c.b = linearLayoutManager.findFirstVisibleItemPosition();
                    StatisticsRecyclerView.this.c.c = findLastVisibleItemPosition;
                    if (StatisticsRecyclerView.this.c.d) {
                        StatisticsRecyclerView.this.c.b();
                        StatisticsRecyclerView.this.c.d = false;
                    }
                }
            }
        };
        this.f = new f.a() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.a
            public final boolean a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "312fba86eef5f8b89db02a7ef79ea798", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "312fba86eef5f8b89db02a7ef79ea798")).booleanValue();
                }
                RecyclerView.s findViewHolderForLayoutPosition = StatisticsRecyclerView.this.findViewHolderForLayoutPosition(i);
                View view = findViewHolderForLayoutPosition == null ? null : findViewHolderForLayoutPosition.itemView;
                return view != null && view.getVisibility() == 0 && ah.b(StatisticsRecyclerView.this) && ah.b(view);
            }
        };
        super.addOnScrollListener(this.d);
        this.c.f = this.f;
    }

    public StatisticsRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d95bf4c14ea2751b4a0d0b414f3bafa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d95bf4c14ea2751b4a0d0b414f3bafa");
            return;
        }
        this.c = new f();
        this.e = new a() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView.a
            public final void a(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b4ce7532b5cf9dec00c50a6a6c3d57f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b4ce7532b5cf9dec00c50a6a6c3d57f");
                    return;
                }
                StatisticsRecyclerView.this.c.a(i);
                if (StatisticsRecyclerView.this.a != null) {
                    StatisticsRecyclerView.this.a.a(view, i);
                }
            }
        };
        this.d = new RecyclerView.k() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5501d231d568759df8c7d90a2faa89f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5501d231d568759df8c7d90a2faa89f");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                switch (i) {
                    case 0:
                        StatisticsRecyclerView.this.c.c();
                        return;
                    case 1:
                        return;
                    case 2:
                        return;
                    default:
                        return;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b632bdd30157830254cee289072f630", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b632bdd30157830254cee289072f630");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    StatisticsRecyclerView.this.c.b = linearLayoutManager.findFirstVisibleItemPosition();
                    StatisticsRecyclerView.this.c.c = findLastVisibleItemPosition;
                    if (StatisticsRecyclerView.this.c.d) {
                        StatisticsRecyclerView.this.c.b();
                        StatisticsRecyclerView.this.c.d = false;
                    }
                }
            }
        };
        this.f = new f.a() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.a
            public final boolean a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "312fba86eef5f8b89db02a7ef79ea798", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "312fba86eef5f8b89db02a7ef79ea798")).booleanValue();
                }
                RecyclerView.s findViewHolderForLayoutPosition = StatisticsRecyclerView.this.findViewHolderForLayoutPosition(i);
                View view = findViewHolderForLayoutPosition == null ? null : findViewHolderForLayoutPosition.itemView;
                return view != null && view.getVisibility() == 0 && ah.b(StatisticsRecyclerView.this) && ah.b(view);
            }
        };
        super.addOnScrollListener(this.d);
        this.c.f = this.f;
    }

    public StatisticsRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dda69334682b2032fdbcef94b82e0aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dda69334682b2032fdbcef94b82e0aa");
            return;
        }
        this.c = new f();
        this.e = new a() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView.a
            public final void a(View view, int i2) {
                Object[] objArr2 = {view, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b4ce7532b5cf9dec00c50a6a6c3d57f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b4ce7532b5cf9dec00c50a6a6c3d57f");
                    return;
                }
                StatisticsRecyclerView.this.c.a(i2);
                if (StatisticsRecyclerView.this.a != null) {
                    StatisticsRecyclerView.this.a.a(view, i2);
                }
            }
        };
        this.d = new RecyclerView.k() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5501d231d568759df8c7d90a2faa89f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5501d231d568759df8c7d90a2faa89f");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                switch (i2) {
                    case 0:
                        StatisticsRecyclerView.this.c.c();
                        return;
                    case 1:
                        return;
                    case 2:
                        return;
                    default:
                        return;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i22)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b632bdd30157830254cee289072f630", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b632bdd30157830254cee289072f630");
                    return;
                }
                super.onScrolled(recyclerView, i2, i22);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    StatisticsRecyclerView.this.c.b = linearLayoutManager.findFirstVisibleItemPosition();
                    StatisticsRecyclerView.this.c.c = findLastVisibleItemPosition;
                    if (StatisticsRecyclerView.this.c.d) {
                        StatisticsRecyclerView.this.c.b();
                        StatisticsRecyclerView.this.c.d = false;
                    }
                }
            }
        };
        this.f = new f.a() { // from class: com.sankuai.waimai.log.judas.StatisticsRecyclerView.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.a
            public final boolean a(int i2) {
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "312fba86eef5f8b89db02a7ef79ea798", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "312fba86eef5f8b89db02a7ef79ea798")).booleanValue();
                }
                RecyclerView.s findViewHolderForLayoutPosition = StatisticsRecyclerView.this.findViewHolderForLayoutPosition(i2);
                View view = findViewHolderForLayoutPosition == null ? null : findViewHolderForLayoutPosition.itemView;
                return view != null && view.getVisibility() == 0 && ah.b(StatisticsRecyclerView.this) && ah.b(view);
            }
        };
        super.addOnScrollListener(this.d);
        this.c.f = this.f;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc86778c8f867ab4439843214d1ac26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc86778c8f867ab4439843214d1ac26");
            return;
        }
        super.setAdapter(aVar);
        if (aVar instanceof c) {
            ((c) aVar).j = this.e;
        }
    }

    public void setOnRecyclerViewItemClickListener(a aVar) {
        this.a = aVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5476c345f96e8d48101bb3ffec2b9b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5476c345f96e8d48101bb3ffec2b9b5");
        } else {
            this.c.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad4911dae2a45b9df8eff53178055e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad4911dae2a45b9df8eff53178055e8");
        } else {
            this.c.b();
        }
    }

    public void setOnLogReportListener(f.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2521b841c59921dac77d6e65192c3c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2521b841c59921dac77d6e65192c3c10");
        } else {
            this.c.e = bVar;
        }
    }
}
