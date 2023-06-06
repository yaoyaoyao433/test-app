package com.sankuai.waimai.store.search.template.dropdownfilter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<C1303a> {
    public static ChangeQuickRedirect a;
    final List<SearchFilterGroup.SearchFilterItem> b;
    b.a c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C1303a c1303a, int i) {
        C1303a c1303a2 = c1303a;
        Object[] objArr = {c1303a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90ff299dbb84267f9637be162fdff0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90ff299dbb84267f9637be162fdff0e");
            return;
        }
        final SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (searchFilterItem != null) {
            Context context = c1303a2.itemView.getContext();
            c1303a2.c.setText(searchFilterItem.filterName);
            if (searchFilterItem.selected) {
                c1303a2.c.setTypeface(Typeface.DEFAULT_BOLD);
                c1303a2.c.setTextColor(com.sankuai.waimai.store.util.b.b(context, R.color.wm_sc_nox_search_color_FF8000));
                c1303a2.d.setVisibility(0);
            } else {
                c1303a2.c.setTypeface(Typeface.DEFAULT);
                c1303a2.c.setTextColor(com.sankuai.waimai.store.util.b.b(context, R.color.wm_sc_nox_search_color_222426));
                c1303a2.d.setVisibility(8);
            }
            c1303a2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.dropdownfilter.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db97e797dee50ec9a9d67aa980ddf008", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db97e797dee50ec9a9d67aa980ddf008");
                    } else {
                        a.this.c.a(searchFilterItem);
                    }
                }
            });
            c1303a2.b.a(searchFilterItem.searchFilterDot);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C1303a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec386077d73bfd97b3e6783db6b2bb0", RobustBitConfig.DEFAULT_VALUE) ? (C1303a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec386077d73bfd97b3e6783db6b2bb0") : new C1303a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_search_drop_down_float_filter_item, viewGroup, false));
    }

    public a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02bf80fe0b8ed57cdfde6dee389f4bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02bf80fe0b8ed57cdfde6dee389f4bc");
            return;
        }
        this.b = new ArrayList();
        this.c = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b922785494dc9f419a537837f3a3dd2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b922785494dc9f419a537837f3a3dd2")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.dropdownfilter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1303a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        d b;
        TextView c;
        ImageView d;

        public C1303a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa675fc08a8337f4acc214b973747be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa675fc08a8337f4acc214b973747be");
                return;
            }
            this.b = new d(view.findViewById(R.id.drop_down_float_filter_container), view.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_7_half), 0, view.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_22));
            this.c = (TextView) view.findViewById(R.id.drop_down_float_filter_text);
            this.d = (ImageView) view.findViewById(R.id.drop_down_float_filter_icon);
        }
    }
}
