package com.sankuai.waimai.store.drug.search.delegates;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.search.common.model.NoResultNonDeliveryEntity;
import com.sankuai.waimai.store.drug.search.common.model.NoResultRemindInfoData;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.m;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<NoResultRemindInfoData, C1167a> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.search.ui.result.b b;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1167a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f03c3b8e1fcedcea97673db3d7cee5", RobustBitConfig.DEFAULT_VALUE) ? (C1167a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f03c3b8e1fcedcea97673db3d7cee5") : new C1167a(layoutInflater.inflate(R.layout.wm_drug_search_nonresult_full_page_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull NoResultRemindInfoData noResultRemindInfoData, @NonNull C1167a c1167a, int i) {
        NoResultRemindInfoData noResultRemindInfoData2 = noResultRemindInfoData;
        final C1167a c1167a2 = c1167a;
        Object[] objArr = {noResultRemindInfoData2, c1167a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7fc05399a64f37f24b7898b760829e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7fc05399a64f37f24b7898b760829e");
            return;
        }
        final com.sankuai.waimai.store.search.ui.result.b bVar = this.b;
        Object[] objArr2 = {noResultRemindInfoData2, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = C1167a.a;
        if (PatchProxy.isSupport(objArr2, c1167a2, changeQuickRedirect2, false, "6900b8d29f0c6a50041819ce6baaf016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1167a2, changeQuickRedirect2, false, "6900b8d29f0c6a50041819ce6baaf016");
            return;
        }
        if (!TextUtils.isEmpty(noResultRemindInfoData2.noResultRemindIcon)) {
            b.C0608b a2 = m.a(noResultRemindInfoData2.noResultRemindIcon);
            a2.i = R.drawable.wm_sc_nox_search_nonresult_icon;
            a2.j = R.drawable.wm_sc_nox_search_nonresult_icon;
            a2.a(c1167a2.d);
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) c1167a2.b.g())) {
            c1167a2.f.setVisibility(8);
            c1167a2.h.setVisibility(8);
            c1167a2.g.setVisibility(0);
            u.a(c1167a2.e, c1167a2.c.getString(R.string.wm_sc_nox_search_no_filter_result));
            c1167a2.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.delegates.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50175b9c7ff17afe4fcd72c055bd7ccc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50175b9c7ff17afe4fcd72c055bd7ccc");
                    } else if (bVar != null) {
                        bVar.b();
                    }
                }
            });
        } else {
            c1167a2.f.setVisibility(8);
            c1167a2.g.setVisibility(8);
            c1167a2.g.setOnClickListener(null);
            c1167a2.h.setVisibility(8);
            c1167a2.h.setOnClickListener(null);
            if (!TextUtils.isEmpty(noResultRemindInfoData2.noResultRemindContext)) {
                c1167a2.e.setText(noResultRemindInfoData2.noResultRemindContext);
            } else if (!TextUtils.isEmpty(noResultRemindInfoData2.explainText)) {
                c1167a2.e.setText(noResultRemindInfoData2.explainText);
            } else {
                c1167a2.e.setText(c1167a2.c.getResources().getString(R.string.wm_sc_nox_search_no_result));
            }
            final NoResultNonDeliveryEntity.SearchButton searchButton = noResultRemindInfoData2.searchButton;
            if (searchButton != null && !TextUtils.isEmpty(searchButton.scheme) && !TextUtils.isEmpty(searchButton.text)) {
                c1167a2.f.setVisibility(8);
                c1167a2.h.setVisibility(0);
                c1167a2.h.setText(noResultRemindInfoData2.searchButton.text);
                c1167a2.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.delegates.a.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "faa7b86adac8a08838f3bc32cc0e1afd", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "faa7b86adac8a08838f3bc32cc0e1afd");
                            return;
                        }
                        d.a(C1167a.this.c, searchButton.scheme);
                        if (C1167a.this.c instanceof GlobalSearchActivity) {
                            ((GlobalSearchActivity) C1167a.this.c).finish();
                        }
                    }
                });
            } else {
                c1167a2.h.setVisibility(8);
                c1167a2.f.setVisibility(0);
                if (TextUtils.isEmpty(noResultRemindInfoData2.noResultRemindAdditionalContext)) {
                    c1167a2.f.setText(c1167a2.itemView.getContext().getResources().getString(R.string.wm_sc_nox_search_change_search_word));
                } else {
                    c1167a2.f.setText(noResultRemindInfoData2.noResultRemindAdditionalContext);
                }
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = C1167a.a;
        if (PatchProxy.isSupport(objArr3, c1167a2, changeQuickRedirect3, false, "b7fcb5a28ce52edbac1fcf19360cb392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c1167a2, changeQuickRedirect3, false, "b7fcb5a28ce52edbac1fcf19360cb392");
        } else if (c1167a2.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("stid", g.f(c1167a2.b));
            hashMap.put("cat_id", Integer.valueOf(c1167a2.b.z));
            hashMap.put("keyword", c1167a2.b.h);
            hashMap.put("sec_cat_id", Integer.valueOf(c1167a2.b.C > 0 ? c1167a2.b.C : c1167a2.b.B));
            hashMap.put("type", 2);
            com.sankuai.waimai.store.manager.judas.b.b(c1167a2.c, "b_waimai_med_noresult_mv").b(hashMap).a();
        }
    }

    public a(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe83c6012f3268a68fd6379d8107022b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe83c6012f3268a68fd6379d8107022b");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c076e0eb3469af4f3dfbcb337564bbc2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c076e0eb3469af4f3dfbcb337564bbc2")).booleanValue() : str.equals("drug_search_fullpage_no_result");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.search.delegates.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1167a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public SearchShareData b;
        Context c;
        public ImageView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public TextView h;

        public C1167a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f582d4a06b7c8b223c0587b9d273cca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f582d4a06b7c8b223c0587b9d273cca");
                return;
            }
            this.c = view.getContext();
            this.b = SearchShareData.a(this.c);
            this.d = (ImageView) view.findViewById(R.id.no_result_full_page_image);
            this.e = (TextView) view.findViewById(R.id.no_result_full_page_text);
            this.f = (TextView) view.findViewById(R.id.no_result_full_page_sub_text);
            this.g = (TextView) view.findViewById(R.id.no_result_reload_filter);
            this.h = (TextView) view.findViewById(R.id.no_result_meishi_button);
        }
    }
}
