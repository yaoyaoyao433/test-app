package com.sankuai.waimai.store.search.template.overpagefilter;

import android.content.Context;
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
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private int d;
    private final List<GuidedItem> e;
    private int f;
    private int g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55b80f0c1c03d5babddf850683572ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55b80f0c1c03d5babddf850683572ad");
            return;
        }
        this.b = 2;
        this.e = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x041d  */
    @Override // android.support.v7.widget.RecyclerView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void onBindViewHolder(@android.support.annotation.NonNull com.sankuai.waimai.store.search.template.overpagefilter.b.a r25, int r26) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.template.overpagefilter.b.onBindViewHolder(android.support.v7.widget.RecyclerView$s, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47ccad9570242ad238441365524dfc9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47ccad9570242ad238441365524dfc9") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_search_over_page_filter_item, viewGroup, false));
    }

    public final void a(int i, String str, int i2, List<GuidedItem> list, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), list, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e3725bb14e646331e371d0e653b408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e3725bb14e646331e371d0e653b408");
            return;
        }
        this.e.clear();
        this.b = i;
        this.c = str;
        this.d = i2;
        this.b = i;
        this.f = i3;
        this.g = i4;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.e.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd91c0001cd3cce6906f2da5a20829bc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd91c0001cd3cce6906f2da5a20829bc")).intValue() : this.e.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        Context b;
        ImageView c;
        ImageView d;
        TextView e;
        TextView f;
        SearchShareData g;
        final Map<String, Object> h;
        private View i;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759045834de5ec40996a75e6fb2edad7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759045834de5ec40996a75e6fb2edad7");
                return;
            }
            this.h = new HashMap();
            this.b = view.getContext();
            this.c = (ImageView) view.findViewById(R.id.search_over_page_filter_item_image);
            this.d = (ImageView) view.findViewById(R.id.search_over_page_filter_item_image_cover);
            this.i = view.findViewById(R.id.search_over_page_filter_item_text_container);
            this.e = (TextView) view.findViewById(R.id.search_over_page_filter_item_text);
            this.f = (TextView) view.findViewById(R.id.search_over_page_filter_item_sub_text);
            this.g = SearchShareData.a(view.getContext());
        }

        void a(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d9ab793a743f34cd3c6ad4af757c39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d9ab793a743f34cd3c6ad4af757c39");
            } else if (this.i != null) {
                ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
                layoutParams.height = h.a(this.itemView.getContext(), f);
                this.i.setLayoutParams(layoutParams);
                if (layoutParams != null) {
                    this.i.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
