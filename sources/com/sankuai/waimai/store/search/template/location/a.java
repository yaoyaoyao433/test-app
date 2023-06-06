package com.sankuai.waimai.store.search.template.location;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.router.c;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.SearchLocation;
import com.sankuai.waimai.store.search.statistics.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<SearchLocation, C1310a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1310a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245ae1be1e81299fe1403721c64124e7", RobustBitConfig.DEFAULT_VALUE) ? (C1310a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245ae1be1e81299fe1403721c64124e7") : new C1310a(layoutInflater.inflate(R.layout.wm_sc_nox_search_location, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SearchLocation searchLocation, @NonNull C1310a c1310a, int i) {
        final SearchLocation searchLocation2 = searchLocation;
        C1310a c1310a2 = c1310a;
        Object[] objArr = {searchLocation2, c1310a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8a26a534733fc7e26dba08cca97773", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8a26a534733fc7e26dba08cca97773");
            return;
        }
        String d = com.sankuai.waimai.store.locate.a.d();
        if (TextUtils.isEmpty(d) || searchLocation2 == null || !searchLocation2.showAddressLocation) {
            ViewGroup.LayoutParams layoutParams = c1310a2.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(0, 0);
            }
            layoutParams.width = 0;
            layoutParams.height = 0;
            c1310a2.itemView.setLayoutParams(layoutParams);
            return;
        }
        if (!searchLocation2.isExposed) {
            searchLocation2.isExposed = true;
            com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_f6mznhgc_mv").a("cat_id", Integer.valueOf(this.l.z)).a("search_log_id", this.l.q).a("stid", g.f(this.l)).a("keyword", this.l.h).a("media_type", Integer.valueOf(searchLocation2.addressLocationShowType)).a("search_source", Integer.valueOf(this.l.aw)).a();
        }
        c1310a2.a.setText(this.k.getString(R.string.wm_sc_search_address, d));
        c1310a2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.location.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba620577b1738c815121aefc709e637d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba620577b1738c815121aefc709e637d");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_f6mznhgc_mc").a("cat_id", Integer.valueOf(a.this.l.z)).a("search_log_id", a.this.l.q).a("stid", g.f(a.this.l)).a("keyword", a.this.l.h).a("media_type", Integer.valueOf(searchLocation2.addressLocationShowType)).a("search_source", Integer.valueOf(a.this.l.aw)).a();
                d.a(view.getContext(), c.j);
            }
        });
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066fa41afb763eb6f1f1c651548035b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066fa41afb763eb6f1f1c651548035b0");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13faf0590a2fd594afd5504583dd9aca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13faf0590a2fd594afd5504583dd9aca")).booleanValue() : str.equals("searchPage_addressBar");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1310a extends RecyclerView.s {
        public TextView a;

        public C1310a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.search_location_address);
        }
    }
}
