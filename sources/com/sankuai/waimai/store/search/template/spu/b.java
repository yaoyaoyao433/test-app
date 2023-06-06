package com.sankuai.waimai.store.search.template.spu;

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
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.statistics.e;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    private final List<BaseProductPoi.RecommendSpu> b;
    private boolean c;
    private String d;
    private final ArrayList<Long> e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "847827b0142e05428a5c28e81863e002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "847827b0142e05428a5c28e81863e002");
            return;
        }
        this.b = new ArrayList();
        this.e = new ArrayList<>();
    }

    public final void a(List<BaseProductPoi.RecommendSpu> list, boolean z, String str, ArrayList<Long> arrayList) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036282207c4515d5dd6312f14e4fd528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036282207c4515d5dd6312f14e4fd528");
            return;
        }
        this.b.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.b.addAll(list);
        }
        this.c = z;
        this.d = str;
        this.e.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
            this.e.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde44562ec328126f07492be77cc8c28", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde44562ec328126f07492be77cc8c28");
        }
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_nox_search_list_item_v750_feed_spu_recommend_more, viewGroup, false));
        }
        return new C1319b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_nox_search_list_item_v750_feed_spu_recommend, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96aa148bc6e4d8920f58286d5406a261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96aa148bc6e4d8920f58286d5406a261");
            return;
        }
        if (sVar instanceof C1319b) {
            final C1319b c1319b = (C1319b) sVar;
            final BaseProductPoi.RecommendSpu recommendSpu = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
            boolean z = this.c;
            final ArrayList<Long> arrayList = this.e;
            Object[] objArr2 = {recommendSpu, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = C1319b.a;
            if (PatchProxy.isSupport(objArr2, c1319b, changeQuickRedirect2, false, "345ccc4d989680315a50c781aefaebc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1319b, changeQuickRedirect2, false, "345ccc4d989680315a50c781aefaebc7");
            } else if (recommendSpu != null) {
                if (!recommendSpu.exposed) {
                    recommendSpu.exposed = true;
                    recommendSpu.nodeForRcmdSpu.a(c1319b.itemView.getContext());
                }
                ViewGroup.LayoutParams layoutParams = c1319b.itemView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    if (i == 0 && !z) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = c1319b.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
                    }
                    c1319b.itemView.setLayoutParams(layoutParams);
                }
                if (t.a(recommendSpu.price)) {
                    u.b(c1319b.c);
                } else {
                    u.a(c1319b.c, c1319b.itemView.getContext().getString(R.string.wm_sc_nox_search_good_label_price, recommendSpu.price));
                }
                m.b(recommendSpu.pictureUrl).a(new b.d() { // from class: com.sankuai.waimai.store.search.template.spu.b.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab6312974f9e080e7f09eca278565734", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab6312974f9e080e7f09eca278565734");
                        } else {
                            C1319b.this.b.setVisibility(0);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.d
                    public final void a(int i2, Exception exc) {
                        Object[] objArr3 = {Integer.valueOf(i2), exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53d28ce2cff5a4ba3339f6d5faa8dad0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53d28ce2cff5a4ba3339f6d5faa8dad0");
                        } else {
                            C1319b.this.b.setVisibility(8);
                        }
                    }
                }).a(c1319b.b);
                c1319b.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.spu.b.b.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e1985ca781dbc04d75198a970b171cd", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e1985ca781dbc04d75198a970b171cd");
                            return;
                        }
                        recommendSpu.nodeForRcmdSpu.b(C1319b.this.itemView.getContext());
                        if (TextUtils.isEmpty(recommendSpu.scheme)) {
                            return;
                        }
                        d.a(C1319b.this.b.getContext(), e.a(recommendSpu.scheme, arrayList));
                    }
                });
            }
        }
        if (sVar instanceof a) {
            final a aVar = (a) sVar;
            final BaseProductPoi.RecommendSpu recommendSpu2 = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i - 1);
            String str = this.d;
            final ArrayList<Long> arrayList2 = this.e;
            Object[] objArr3 = {recommendSpu2, str, arrayList2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "9e32a05baea35853c4eeedaf6758030a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "9e32a05baea35853c4eeedaf6758030a");
                return;
            }
            final boolean z2 = (recommendSpu2 == null || TextUtils.isEmpty(recommendSpu2.scheme)) ? false : true;
            final String str2 = z2 ? recommendSpu2.scheme : str;
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.spu.b.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b4aaff047e3660fe278a1ff626763a74", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b4aaff047e3660fe278a1ff626763a74");
                        return;
                    }
                    if (z2) {
                        recommendSpu2.nodeForRcmdSpu.b(a.this.itemView.getContext());
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    d.a(a.this.itemView.getContext(), e.a(str2, arrayList2));
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f0dcaefda54e6370828475479beecd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f0dcaefda54e6370828475479beecd")).intValue() : this.b.size() + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf88f9586c6a119ef67fba0c920bf0f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf88f9586c6a119ef67fba0c920bf0f")).intValue() : i == this.b.size() ? 1 : 0;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.spu.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1319b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        private final int d;

        public C1319b(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb0fb0a4195a639b5ccf353c405502b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb0fb0a4195a639b5ccf353c405502b");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.spu_intent_recommend_spu);
            this.c = (TextView) view.findViewById(R.id.spu_price);
            this.d = view.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
            this.c.setBackground(new e.a().a(0.0f, this.d, 0.0f, this.d).c(view.getContext().getResources().getColor(R.color.wm_sc_nox_search_color_66000000)).a());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        private ImageView b;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96124f4605d8eb389f1f4bfd779fdeea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96124f4605d8eb389f1f4bfd779fdeea");
                return;
            }
            com.sankuai.waimai.store.view.a a2 = com.sankuai.waimai.store.view.a.a(view.getContext(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_7, (int) R.color.wm_sc_nox_search_color_999794, a.EnumC1338a.RIGHT);
            this.b = (ImageView) view.findViewById(R.id.spu_intent_recommend_spu_more_arrow);
            this.b.setImageDrawable(a2);
        }
    }
}
