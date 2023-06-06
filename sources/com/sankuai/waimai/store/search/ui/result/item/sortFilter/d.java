package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    final List<SearchFilterGroup> b;
    private b.d c;
    private SearchShareData d;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d51fb068072deab8781d74d18a2f7cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d51fb068072deab8781d74d18a2f7cd");
            return;
        }
        final SearchFilterGroup searchFilterGroup = (SearchFilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        Object[] objArr2 = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "ba0b7dd46db9e7aea15016513fd467a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "ba0b7dd46db9e7aea15016513fd467a2");
            return;
        }
        final c cVar = aVar2.b;
        Object[] objArr3 = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "44d729a33619f0dc5c051d285470c3d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "44d729a33619f0dc5c051d285470c3d3");
        } else if (searchFilterGroup != null) {
            String str = searchFilterGroup.groupTitle;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "be9974b36433c2e3929e811539b7c93e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "be9974b36433c2e3929e811539b7c93e");
            } else {
                u.a(cVar.d, str);
            }
            String str2 = searchFilterGroup.selectedItemsStr;
            Object[] objArr5 = {str2};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "c46120c66c5937a047902eb8bc1e8561", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "c46120c66c5937a047902eb8bc1e8561");
            } else {
                u.a(cVar.c, str2);
            }
            Object[] objArr6 = {searchFilterGroup};
            ChangeQuickRedirect changeQuickRedirect6 = c.a;
            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "dbd4e556313dc44a40348e45573cd459", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "dbd4e556313dc44a40348e45573cd459");
            } else if (searchFilterGroup == null || com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
            } else {
                if (com.sankuai.shangou.stone.util.a.a((List) searchFilterGroup.filterItems) <= 6) {
                    cVar.e.setVisibility(8);
                    cVar.b.setOnClickListener(null);
                    cVar.f.a(searchFilterGroup.filterItems);
                    return;
                }
                cVar.e.setVisibility(0);
                cVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "21181e4517a8ccdefd1e1667bc11582b", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "21181e4517a8ccdefd1e1667bc11582b");
                        } else if (searchFilterGroup.expanded) {
                            searchFilterGroup.expanded = false;
                            cVar.e.setImageResource(R.drawable.wm_sc_search_filter_group_arrow_down);
                            cVar.f.a(searchFilterGroup.filterItems.subList(0, 6));
                        } else {
                            searchFilterGroup.expanded = true;
                            cVar.e.setImageResource(R.drawable.wm_sc_search_filter_group_arrow_up);
                            cVar.f.a(searchFilterGroup.filterItems);
                        }
                    }
                });
                if (searchFilterGroup.expanded) {
                    cVar.e.setImageResource(R.drawable.wm_sc_search_filter_group_arrow_up);
                    cVar.f.a(searchFilterGroup.filterItems);
                    return;
                }
                cVar.e.setImageResource(R.drawable.wm_sc_search_filter_group_arrow_down);
                cVar.f.a(searchFilterGroup.filterItems.subList(0, 6));
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393aae5702dc89561a2d6abf27c76a2a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393aae5702dc89561a2d6abf27c76a2a") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_search_filter_group, viewGroup, false), this.c, this.d);
    }

    public d(b.d dVar, SearchShareData searchShareData) {
        Object[] objArr = {dVar, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1764bff886e7f758fca8679df033b7c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1764bff886e7f758fca8679df033b7c0");
            return;
        }
        this.b = new ArrayList();
        this.c = dVar;
        this.d = searchShareData;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a49fef25460ffab8a130a3bd770ff00", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a49fef25460ffab8a130a3bd770ff00")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        c b;

        public a(View view, b.d dVar, SearchShareData searchShareData) {
            super(view);
            Object[] objArr = {view, dVar, searchShareData};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5dc6978524ef357601e9fdaa59834f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5dc6978524ef357601e9fdaa59834f7");
                return;
            }
            this.b = new c(view.getContext(), dVar, searchShareData);
            this.b.bindView(view);
        }
    }
}
