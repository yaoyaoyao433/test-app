package com.sankuai.waimai.store.drug.search.delegates;

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
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.SearchLocation;
import com.sankuai.waimai.store.search.statistics.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.search.adapterdelegates.b<SearchLocation, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e238cebcdcec8f0042c5bceced7969", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e238cebcdcec8f0042c5bceced7969") : new a(layoutInflater.inflate(R.layout.wm_drug_search_location, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SearchLocation searchLocation, @NonNull a aVar, int i) {
        final SearchLocation searchLocation2 = searchLocation;
        a aVar2 = aVar;
        Object[] objArr = {searchLocation2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e0e90c615704ddab9687686a0b2666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e0e90c615704ddab9687686a0b2666");
            return;
        }
        String d = com.sankuai.waimai.store.locate.a.d();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar2.itemView.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        if (TextUtils.isEmpty(d) || searchLocation2 == null || !searchLocation2.showAddressLocation || searchLocation2.addressLocationShowType == -1) {
            marginLayoutParams.width = 0;
            marginLayoutParams.height = 0;
            marginLayoutParams.bottomMargin = 0;
            return;
        }
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        aVar2.itemView.setLayoutParams(marginLayoutParams);
        if (!searchLocation2.isExposed) {
            searchLocation2.isExposed = true;
            com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_f6mznhgc_mv").a("cat_id", Integer.valueOf(this.l.z)).a("search_log_id", this.l.q).a("stid", g.f(this.l)).a("keyword", this.l.h).a("media_type", Integer.valueOf(searchLocation2.addressLocationShowType)).a("search_source", Integer.valueOf(this.l.aw)).a("if_med_poi", 0).a();
        }
        aVar2.a.setText(this.k.getString(R.string.wm_sc_search_address, d));
        aVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.delegates.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e99198442df859fb198aa5d50238d5f7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e99198442df859fb198aa5d50238d5f7");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_f6mznhgc_mc").a("cat_id", Integer.valueOf(b.this.l.z)).a("search_log_id", b.this.l.q).a("stid", g.f(b.this.l)).a("keyword", b.this.l.h).a("media_type", Integer.valueOf(searchLocation2.addressLocationShowType)).a("search_source", Integer.valueOf(b.this.l.aw)).a("if_med_poi", 0).a();
                d.a(view.getContext(), com.sankuai.waimai.store.router.c.j);
            }
        });
    }

    public b(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4540945ce7f00265ed6d65e93a8e89e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4540945ce7f00265ed6d65e93a8e89e3");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f098c0b35ed7accd7be5afee51b1c1f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f098c0b35ed7accd7be5afee51b1c1f")).booleanValue() : str.equals("drug_searchPage_addressBar");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.search_location_address);
        }
    }
}
