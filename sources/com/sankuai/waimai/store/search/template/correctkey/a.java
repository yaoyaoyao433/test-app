package com.sankuai.waimai.store.search.template.correctkey;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.common.util.g;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.QueryCorrect;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<QueryCorrect, C1301a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1301a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282d0865ea24ea8c9e9decfa8179d6c2", RobustBitConfig.DEFAULT_VALUE) ? (C1301a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282d0865ea24ea8c9e9decfa8179d6c2") : new C1301a(layoutInflater.inflate(R.layout.wm_sc_nox_search_global_poi_correct_tip, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull QueryCorrect queryCorrect, @NonNull C1301a c1301a, final int i) {
        final QueryCorrect queryCorrect2 = queryCorrect;
        C1301a c1301a2 = c1301a;
        Object[] objArr = {queryCorrect2, c1301a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b54ddf172402b99858afb8b3ddba75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b54ddf172402b99858afb8b3ddba75");
            return;
        }
        Object[] objArr2 = {c1301a2, queryCorrect2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fea78cddad43d3f961aa95a912f710e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fea78cddad43d3f961aa95a912f710e");
            return;
        }
        if (queryCorrect2 != null && !queryCorrect2.isExposed) {
            queryCorrect2.isExposed = true;
            if (queryCorrect2.sQueryContext != null && queryCorrect2.sOriginKey != null) {
                String str = this.k.getResources().getString(R.string.wm_sc_nox_punctuation_quotation_mark_left) + queryCorrect2.sOriginKey + this.k.getResources().getString(R.string.wm_sc_nox_punctuation_quotation_mark_right);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(str);
                g.b(this.k, c1301a2.b, queryCorrect2.sQueryContext + str, arrayList);
                com.sankuai.waimai.store.manager.judas.b.b(this.k, "b_01Yph").a("cat_id", Integer.valueOf(this.l.z)).a("keyword", queryCorrect2.sCorrectKey).a("input_word", this.l.d).a("correct_word", queryCorrect2.sCorrectKey).a("index", Integer.valueOf(i)).a("search_source", Integer.valueOf(this.l.aw)).a("search_log_id", this.l.q).a("stid", com.sankuai.waimai.store.search.statistics.g.f(this.l)).a();
            }
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.correctkey.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d410066233c5ceed5cbe3e6bede9f406", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d410066233c5ceed5cbe3e6bede9f406");
                } else if (queryCorrect2 != null) {
                    if (queryCorrect2.sOriginKey != null) {
                        SearchShareData searchShareData = a.this.l;
                        f.b bVar = new f.b(5);
                        bVar.f = 0;
                        bVar.g = 0;
                        searchShareData.a(bVar);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_ajOAm").a("cat_id", Integer.valueOf(a.this.l.z)).a("keyword", queryCorrect2.sOriginKey).a("input_word", a.this.l.d).a("correct_word", queryCorrect2.sCorrectKey).a("search_source", Integer.valueOf(a.this.l.aw)).a("search_log_id", a.this.l.q).a("stid", com.sankuai.waimai.store.search.statistics.g.f(a.this.l)).a("index", Integer.valueOf(i)).a();
                }
            }
        };
        Object[] objArr3 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect3 = C1301a.a;
        if (PatchProxy.isSupport(objArr3, c1301a2, changeQuickRedirect3, false, "f1264f79156183270b67e511ca689958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c1301a2, changeQuickRedirect3, false, "f1264f79156183270b67e511ca689958");
        } else {
            c1301a2.itemView.setOnClickListener(onClickListener);
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e866b1d80d6abe9a394e14275a08e14a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e866b1d80d6abe9a394e14275a08e14a");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d45619143abefad5a83fff1376cb0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d45619143abefad5a83fff1376cb0e")).booleanValue() : str.equals("wm_search_query_correct");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.correctkey.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1301a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public TextView b;

        public C1301a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75056117461174c7c5bc313b9f97a286", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75056117461174c7c5bc313b9f97a286");
            } else {
                this.b = (TextView) view.findViewById(R.id.txt_poi_list_correct_tip);
            }
        }
    }
}
