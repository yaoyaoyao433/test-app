package com.sankuai.waimai.business.search.ui.result.guideQuery;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.GuideQueryCard;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    public final List<GuideQueryCard.TabGuideQuery> b;
    final SearchShareData c;
    public b d;
    public int e;
    private final RecyclerView f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(GuideQueryCard.TabGuideQuery tabGuideQuery, int i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, final int i) {
        final a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6a91bcb89898f1bf2a476ac685e96e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6a91bcb89898f1bf2a476ac685e96e");
            return;
        }
        new StringBuilder("item").append(i);
        final GuideQueryCard.TabGuideQuery tabGuideQuery = this.b.get(i);
        Object[] objArr2 = {tabGuideQuery, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "c2a87993757040be84e391c18496becc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "c2a87993757040be84e391c18496becc");
            return;
        }
        aVar2.a(tabGuideQuery, i);
        aVar2.itemView.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        aVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.e.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9504b9db2de02f2bd6572f3379142ba5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9504b9db2de02f2bd6572f3379142ba5");
                    return;
                }
                a.this.a(tabGuideQuery, i);
                if (e.this.d != null) {
                    e.this.d.a(tabGuideQuery, i);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a020c58d11fbda534def8d2781afbf2e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a020c58d11fbda534def8d2781afbf2e") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_nox_search_guide_query_tab_item, viewGroup, false));
    }

    public e(SearchShareData searchShareData, RecyclerView recyclerView) {
        Object[] objArr = {searchShareData, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a6f3b1350159ebc74de99db534875b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a6f3b1350159ebc74de99db534875b");
            return;
        }
        this.e = 0;
        this.b = new ArrayList();
        this.c = searchShareData;
        this.f = recyclerView;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6097c43ea47552d5be7678d1babd617", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6097c43ea47552d5be7678d1babd617")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        private final TextView c;
        private final View d;

        public a(View view) {
            super(view);
            Object[] objArr = {e.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112515dfc0c88f6fcaa86910a37273bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112515dfc0c88f6fcaa86910a37273bc");
                return;
            }
            this.c = (TextView) view.findViewById(R.id.tab_label);
            this.d = view.findViewById(R.id.tab_label_indicator);
        }

        public final void a(GuideQueryCard.TabGuideQuery tabGuideQuery, int i) {
            Object[] objArr = {tabGuideQuery, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2434232442d819b439e0ab5c177cc3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2434232442d819b439e0ab5c177cc3");
                return;
            }
            this.c.setText(tabGuideQuery.tab);
            if (i == e.this.e) {
                this.c.setTextColor(a(R.color.wm_nox_search_FF222426));
                this.d.setVisibility(0);
            } else {
                this.c.setTextColor(a(R.color.wm_nox_search_FF858687));
                this.d.setVisibility(8);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams();
            marginLayoutParams.topMargin = g.a(this.itemView.getContext(), 0.0f);
            marginLayoutParams.bottomMargin = g.a(this.itemView.getContext(), 7.0f);
            if (e.this.c.ar) {
                marginLayoutParams.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 0.0f : 9.0f);
                marginLayoutParams.rightMargin = g.a(this.itemView.getContext(), i != e.this.b.size() - 1 ? 9.0f : 0.0f);
            } else {
                marginLayoutParams.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 10.0f : 9.0f);
                marginLayoutParams.rightMargin = g.a(this.itemView.getContext(), i != e.this.b.size() - 1 ? 9.0f : 10.0f);
            }
            this.itemView.setLayoutParams(marginLayoutParams);
        }

        private int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58881755644639b38d03db247125032", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58881755644639b38d03db247125032")).intValue() : this.itemView.getContext().getResources().getColor(i);
        }
    }
}
