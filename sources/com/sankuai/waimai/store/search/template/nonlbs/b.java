package com.sankuai.waimai.store.search.template.nonlbs;

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
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.CardMore;
import com.sankuai.waimai.store.search.statistics.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.search.adapterdelegates.b<CardMore, a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72be5bcd2a3e6c06aa9144596fdeb270", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72be5bcd2a3e6c06aa9144596fdeb270") : new a(layoutInflater.inflate(R.layout.wm_sc_search_global_non_delivery_cardmore, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull CardMore cardMore, @NonNull a aVar, final int i) {
        final CardMore cardMore2 = cardMore;
        a aVar2 = aVar;
        Object[] objArr = {cardMore2, aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85489b6a3b72db7d51fa4dfaa95859ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85489b6a3b72db7d51fa4dfaa95859ec");
            return;
        }
        aVar2.b.setText(cardMore2.getShowText());
        aVar2.c.setAlpha(160);
        if (cardMore2.showType == 1) {
            aVar2.c.setImageResource(R.drawable.wm_sc_search_filter_group_arrow_down);
        } else {
            aVar2.c.setImageResource(R.drawable.wm_sc_search_filter_group_arrow_up);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.nonlbs.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c3580030ab1dcf0b6db014915eff562", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c3580030ab1dcf0b6db014915eff562");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(b.this.k, "b_waimai_sg_jn67a5qm_mc").b(b.this.a(cardMore2)).a();
                b.this.l.a(new f.a(cardMore2.type, i));
            }
        };
        Object[] objArr2 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "db32153b4bdc6f949575890705626ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "db32153b4bdc6f949575890705626ca3");
        } else {
            aVar2.itemView.setOnClickListener(onClickListener);
        }
        if (cardMore2.expandExposed) {
            return;
        }
        cardMore2.expandExposed = true;
        com.sankuai.waimai.store.manager.judas.b.b(this.k, "b_waimai_sg_jn67a5qm_mv").b(a(cardMore2)).a();
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676b69f2d9022275ef192af9bedaa5dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676b69f2d9022275ef192af9bedaa5dd");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec83e647d1bb98e7fa631cb8fc9cdfdf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec83e647d1bb98e7fa631cb8fc9cdfdf")).booleanValue() : str.equals("wm_shangou_card_more");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> a(CardMore cardMore) {
        int i;
        int i2 = 0;
        Object[] objArr = {cardMore};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b39f3a7330fd21e3ee84545120b9f8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b39f3a7330fd21e3ee84545120b9f8f");
        }
        int i3 = (cardMore.showType == 1 || cardMore.showType != 2) ? 0 : 1;
        if (cardMore.mCardInfo != null) {
            i2 = cardMore.mCardInfo.getFoldNum();
            i = cardMore.mCardInfo.getRegion();
        } else {
            i = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", this.l.h);
        hashMap.put("cat_id", Integer.valueOf(this.l.z));
        hashMap.put("search_log_id", this.l.b(cardMore.mCardInfo));
        hashMap.put("stid", g.f(this.l));
        hashMap.put("template_type", Integer.valueOf(this.l.D));
        hashMap.put("search_global_id", this.l.r);
        hashMap.put("search_source", Integer.valueOf(this.l.aw));
        hashMap.put("region", Integer.valueOf(i));
        hashMap.put("fold_num", Integer.valueOf(i2));
        hashMap.put("module_type", Integer.valueOf(i3));
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public TextView b;
        public ImageView c;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff0939adc51c2a3464d4b8ad861a1de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff0939adc51c2a3464d4b8ad861a1de");
                return;
            }
            this.c = (ImageView) view.findViewById(R.id.arrow);
            this.b = (TextView) view.findViewById(R.id.card_more);
        }
    }
}
