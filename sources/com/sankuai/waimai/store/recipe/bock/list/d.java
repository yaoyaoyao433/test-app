package com.sankuai.waimai.store.recipe.bock.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.recipe.g;
import com.sankuai.waimai.store.recipe.model.Recipe;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b implements n {
    public static ChangeQuickRedirect a;
    public final a b;
    public SCRecyclerView c;
    public final g d;
    public PrioritySmoothNestedScrollView e;

    public d(@NonNull Context context, g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69b47068b5ff25ab3a63ed9154aa7bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69b47068b5ff25ab3a63ed9154aa7bf");
            return;
        }
        this.b = new a(gVar);
        this.d = gVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46755af93f741c0c08b52711197edc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46755af93f741c0c08b52711197edc1");
            return;
        }
        this.c = (SCRecyclerView) findView(R.id.recipe_list);
        this.e = (PrioritySmoothNestedScrollView) findView(R.id.recipe_list_layout);
        this.c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c.setAdapter((f<?, ?>) this.b);
        this.e.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.recipe.bock.list.RecipeListBlock$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {nestedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0d4dfeff3143b2ff456be9bee16483b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0d4dfeff3143b2ff456be9bee16483b");
                    return;
                }
                d dVar = d.this;
                Object[] objArr3 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "048127040d7c3182616e0b691a0df3e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "048127040d7c3182616e0b691a0df3e6");
                }
            }
        });
        this.c.setOnScrollToBottomOrTopListener(this);
        this.c.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.recipe.bock.list.d.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07d9153a2c2960e05f8b793110bbd689", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07d9153a2c2960e05f8b793110bbd689");
                    return;
                }
                b h = d.this.b.h(q.a(recyclerView));
                if (h == null || h.b == null) {
                    return;
                }
                d.this.d.d(h.b);
            }
        });
        findView(R.id.recipe_list_head).setPadding(com.sankuai.waimai.foundation.utils.g.a(getContext(), 9.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 6.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 9.0f), com.sankuai.waimai.foundation.utils.g.a(getContext(), 6.0f));
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad30929f539f4d7364b79c643626bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad30929f539f4d7364b79c643626bcb");
        } else if (this.d.a()) {
            this.e.scrollTo(0, 2);
        } else {
            this.e.a();
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9eb20bc79cddce31e0e03895e988009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9eb20bc79cddce31e0e03895e988009");
        } else {
            b();
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165ec8b7e95f11b9521ae1d4368c6a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165ec8b7e95f11b9521ae1d4368c6a33");
            return;
        }
        Recipe a2 = this.b.a();
        if (a2 != null) {
            this.d.b(a2);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c7640818ae484cd33464aef3427f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c7640818ae484cd33464aef3427f27");
        } else if (this.d.a()) {
            f();
        } else {
            c();
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9abd092edb70f6c059f6354ccac18c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9abd092edb70f6c059f6354ccac18c5a");
        } else if (this.b.getItemCount() <= 3 && !this.d.e(this.b.a())) {
            b();
        } else {
            f();
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756084988ab0fb653bb63e47c5d9de7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756084988ab0fb653bb63e47c5d9de7b");
            return;
        }
        Recipe b = this.b.b();
        if (b != null) {
            this.d.a(b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends f<b, g> {
        public static ChangeQuickRedirect a;

        private a(g gVar) {
            super(gVar);
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70fda2313b160028feef0f5c83c242c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70fda2313b160028feef0f5c83c242c");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d91ab6ee11aeda9ca5801798b9ba2961", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d91ab6ee11aeda9ca5801798b9ba2961") : new e();
        }

        public List<b> a(@NonNull Recipe recipe, boolean z) {
            Object[] objArr = {recipe, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f81b451313a43eb3eca281ad0266bed", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f81b451313a43eb3eca281ad0266bed");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(recipe, z));
            return arrayList;
        }

        Recipe a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4728538e45b529ba556f9241dbd4672", RobustBitConfig.DEFAULT_VALUE)) {
                return (Recipe) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4728538e45b529ba556f9241dbd4672");
            }
            b h = h(getItemCount() - 1);
            if (h == null) {
                return null;
            }
            return h.b;
        }

        Recipe b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c347ade9d0144db6d845fe5462caddd", RobustBitConfig.DEFAULT_VALUE)) {
                return (Recipe) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c347ade9d0144db6d845fe5462caddd");
            }
            b h = h(0);
            if (h == null) {
                return null;
            }
            return h.b;
        }
    }
}
