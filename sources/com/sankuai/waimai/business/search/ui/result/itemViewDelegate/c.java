package com.sankuai.waimai.business.search.ui.result.itemViewDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.util.l;
import com.sankuai.waimai.business.search.datatype.QueryCorrect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, a> {
    public static ChangeQuickRedirect e;
    com.sankuai.waimai.business.search.ui.result.b f;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    @NonNull
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "875ba45a35fc2767c061f4273b2f5377", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "875ba45a35fc2767c061f4273b2f5377") : new a(layoutInflater.inflate(R.layout.wm_nox_search_global_poi_correct_tip, viewGroup, false));
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(@NonNull Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        Serializable serializable = (Serializable) obj;
        a aVar = (a) sVar;
        Object[] objArr = {serializable, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81208d7da267fe72a5804b90819babfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81208d7da267fe72a5804b90819babfb");
            return;
        }
        final QueryCorrect queryCorrect = (QueryCorrect) serializable;
        Object[] objArr2 = {aVar, queryCorrect, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43b7f44118bcf84570811c8599565c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43b7f44118bcf84570811c8599565c4f");
            return;
        }
        if (queryCorrect != null && !queryCorrect.isExposed) {
            queryCorrect.isExposed = true;
            if (queryCorrect.sQueryContext != null && queryCorrect.sOriginKey != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(queryCorrect.sOriginKey);
                l.a(this.b, aVar.b, queryCorrect.sQueryContext + ("“" + queryCorrect.sOriginKey + "”"), arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put("keyword", this.c.g);
                hashMap.put("input_word", this.c.b);
                hashMap.put("correct_word", queryCorrect.sCorrectKey);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                hashMap.put("index", sb.toString());
                h.a(this.b, 2, "c_nfqbfvw", "b_01Yph", AppUtil.generatePageInfoKey(this.b), hashMap);
            }
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.itemViewDelegate.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8657d21ccb22d5b6b54d4317b4dd966a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8657d21ccb22d5b6b54d4317b4dd966a");
                } else if (queryCorrect != null) {
                    c.this.f.a(queryCorrect);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("keyword", c.this.c.g);
                    hashMap2.put("input_word", c.this.c.b);
                    hashMap2.put("correct_word", queryCorrect.sCorrectKey);
                    h.a(c.this.b, 1, "c_nfqbfvw", "b_ajOAm", AppUtil.generatePageInfoKey(c.this.b), hashMap2);
                }
            }
        };
        Object[] objArr3 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0b2ca351b1deb325d85ca9f33533cf29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0b2ca351b1deb325d85ca9f33533cf29");
        } else {
            aVar.itemView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof QueryCorrect;
    }

    public c(Context context, com.sankuai.waimai.business.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309daa1d58eba9f0728e7620284c76fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309daa1d58eba9f0728e7620284c76fd");
        } else {
            this.f = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public TextView b;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19219c9c8b00233bc8b59b46d89195b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19219c9c8b00233bc8b59b46d89195b");
            } else {
                this.b = (TextView) view.findViewById(R.id.txt_poi_list_correct_tip);
            }
        }
    }
}
