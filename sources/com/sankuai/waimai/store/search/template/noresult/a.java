package com.sankuai.waimai.store.search.template.noresult;

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
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.NoResultNonDeliveryEntity;
import com.sankuai.waimai.store.search.model.NoResultRemindInfoData;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.m;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<NoResultRemindInfoData, C1314a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1314a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49650f4c0ad62e82031ac2d260687482", RobustBitConfig.DEFAULT_VALUE) ? (C1314a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49650f4c0ad62e82031ac2d260687482") : new C1314a(layoutInflater.inflate(R.layout.wm_sc_nox_search_nonresult_full_page_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull NoResultRemindInfoData noResultRemindInfoData, @NonNull C1314a c1314a, int i) {
        NoResultRemindInfoData noResultRemindInfoData2 = noResultRemindInfoData;
        final C1314a c1314a2 = c1314a;
        Object[] objArr = {noResultRemindInfoData2, c1314a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c28a1dbe2937641a9d2ac929ac5be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c28a1dbe2937641a9d2ac929ac5be5");
            return;
        }
        Object[] objArr2 = {noResultRemindInfoData2};
        ChangeQuickRedirect changeQuickRedirect2 = C1314a.a;
        if (PatchProxy.isSupport(objArr2, c1314a2, changeQuickRedirect2, false, "ddf5ef114db7650a2728ffd0885a196f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1314a2, changeQuickRedirect2, false, "ddf5ef114db7650a2728ffd0885a196f");
            return;
        }
        if (!TextUtils.isEmpty(noResultRemindInfoData2.noResultRemindIcon)) {
            b.C0608b a2 = m.a(noResultRemindInfoData2.noResultRemindIcon);
            a2.i = R.drawable.wm_sc_nox_search_nonresult_icon;
            a2.j = R.drawable.wm_sc_nox_search_nonresult_icon;
            a2.a(c1314a2.d);
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) c1314a2.b.g())) {
            c1314a2.f.setVisibility(8);
            c1314a2.h.setVisibility(8);
            c1314a2.g.setVisibility(0);
            u.a(c1314a2.e, c1314a2.c.getString(R.string.wm_sc_nox_search_no_filter_result));
            c1314a2.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.noresult.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9ce4f13d01c907e724436eefc16ade5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9ce4f13d01c907e724436eefc16ade5");
                    } else {
                        C1314a.this.b.a(new f.b(16));
                    }
                }
            });
            return;
        }
        c1314a2.f.setVisibility(8);
        c1314a2.g.setVisibility(8);
        c1314a2.g.setOnClickListener(null);
        c1314a2.h.setVisibility(8);
        c1314a2.h.setOnClickListener(null);
        if (!TextUtils.isEmpty(noResultRemindInfoData2.noResultRemindContext)) {
            c1314a2.e.setText(noResultRemindInfoData2.noResultRemindContext);
        } else if (!TextUtils.isEmpty(noResultRemindInfoData2.explainText)) {
            c1314a2.e.setText(noResultRemindInfoData2.explainText);
        } else {
            c1314a2.e.setText(c1314a2.c.getResources().getString(R.string.wm_sc_nox_search_no_result));
        }
        final NoResultNonDeliveryEntity.SearchButton searchButton = noResultRemindInfoData2.searchButton;
        if (searchButton != null && !TextUtils.isEmpty(searchButton.scheme) && !TextUtils.isEmpty(searchButton.text)) {
            c1314a2.f.setVisibility(8);
            c1314a2.h.setVisibility(0);
            c1314a2.h.setText(noResultRemindInfoData2.searchButton.text);
            c1314a2.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.noresult.a.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f3305ce9bad8de5e4f88fd88690ea46", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f3305ce9bad8de5e4f88fd88690ea46");
                        return;
                    }
                    d.a(C1314a.this.c, searchButton.scheme);
                    if (C1314a.this.c instanceof GlobalSearchActivity) {
                        ((GlobalSearchActivity) C1314a.this.c).finish();
                    }
                }
            });
            return;
        }
        c1314a2.h.setVisibility(8);
        c1314a2.f.setVisibility(0);
        if (TextUtils.isEmpty(noResultRemindInfoData2.noResultRemindAdditionalContext)) {
            c1314a2.f.setText(c1314a2.itemView.getContext().getResources().getString(R.string.wm_sc_nox_search_change_search_word));
        } else {
            c1314a2.f.setText(noResultRemindInfoData2.noResultRemindAdditionalContext);
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d574c2a708290b40076f311fc5126b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d574c2a708290b40076f311fc5126b");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42e3c0bc41aa67fcfef2b58a7e97bd2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42e3c0bc41aa67fcfef2b58a7e97bd2")).booleanValue() : str.equals("wm_search_fullpage_no_result");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.noresult.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1314a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public SearchShareData b;
        Context c;
        public ImageView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public TextView h;

        public C1314a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "195089f4cc3072699fb022c9883c2f6e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "195089f4cc3072699fb022c9883c2f6e");
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
