package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

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
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    int b;
    Context c;
    int d;
    com.sankuai.waimai.store.poi.list.adapter.subcategory.a e;
    private List<PoiGuessULikeSpuTag> f;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, final int i) {
        final a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50eccd1d87021a9e002f44a1d583a558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50eccd1d87021a9e002f44a1d583a558");
            return;
        }
        PoiGuessULikeSpuTag poiGuessULikeSpuTag = (PoiGuessULikeSpuTag) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, i);
        Object[] objArr2 = {poiGuessULikeSpuTag, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "eab8fad6af6e42f0ae36c86f08677c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "eab8fad6af6e42f0ae36c86f08677c4e");
            return;
        }
        if (g.this.e != null) {
            aVar2.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.g.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03201d261badfab271024847069d773e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03201d261badfab271024847069d773e");
                    } else if (g.this.e != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("index", Integer.valueOf(i));
                        g.this.e.a(a.this.itemView, i, hashMap);
                    }
                }
            });
        }
        if (g.this.d == i) {
            u.a(aVar2.c);
            aVar2.b.setTextColor(com.sankuai.waimai.store.util.b.b(g.this.c, R.color.wm_st_common_222426));
        } else {
            u.c(aVar2.c);
            aVar2.b.setTextColor(com.sankuai.waimai.store.util.b.b(g.this.c, R.color.wm_sg_color_575859));
        }
        TextView textView = aVar2.b;
        String str = poiGuessULikeSpuTag.tagName;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "0a3b0c52115bbb4b98b498bca0d152ea", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "0a3b0c52115bbb4b98b498bca0d152ea");
        } else if (!TextUtils.isEmpty(str) && str.length() > 7) {
            str = str.substring(0, 6) + "...";
        }
        textView.setText(str);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        int a2 = com.sankuai.shangou.stone.util.h.a(g.this.c, 16.0f);
        int a3 = com.sankuai.shangou.stone.util.h.a(g.this.c, 23.0f);
        if (i == g.this.b - 1) {
            marginLayoutParams.leftMargin = a3;
            marginLayoutParams.rightMargin = a2;
        } else if (i == 0) {
            marginLayoutParams.leftMargin = a2;
        } else {
            marginLayoutParams.leftMargin = a3;
        }
        aVar2.d.setLayoutParams(marginLayoutParams);
        aVar2.d.setVisibility(0);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5100778104334bbdb5b71203982203df", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5100778104334bbdb5b71203982203df") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_st_poi_guess_u_like_tab_item, viewGroup, false));
    }

    public g(List<PoiGuessULikeSpuTag> list, Context context, int i) {
        Object[] objArr = {list, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56415eab745089bd6dd64771df8b790", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56415eab745089bd6dd64771df8b790");
            return;
        }
        this.f = list;
        this.b = a(list);
        this.c = context;
        this.d = i;
    }

    private int a(List<PoiGuessULikeSpuTag> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8581a57898763cfb5b2b1d707d7145b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8581a57898763cfb5b2b1d707d7145b2")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f44b600c17ab060eef0833936f0424", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f44b600c17ab060eef0833936f0424")).intValue() : com.sankuai.shangou.stone.util.a.c(this.f);
    }

    public final void a(List<PoiGuessULikeSpuTag> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a667c36acab92d2e6bb590afe5710da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a667c36acab92d2e6bb590afe5710da");
            return;
        }
        this.d = i;
        this.b = a(list);
        this.f = list;
        notifyDataSetChanged();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends com.sankuai.waimai.store.widgets.recycler.e {
        public static ChangeQuickRedirect a;
        public TextView b;
        public ImageView c;
        public View d;

        public a(View view) {
            super(view);
            Object[] objArr = {g.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097a328f290a4b0c2d885b24180564dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097a328f290a4b0c2d885b24180564dd");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.tv_tablayout_item_name);
            this.d = view.findViewById(R.id.rl_tab_layout_root);
            this.c = (ImageView) view.findViewById(R.id.iv_ll_tablayout_pic_indicator);
        }
    }
}
