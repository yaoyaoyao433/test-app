package com.sankuai.waimai.store.recipe.bock.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView;
import com.sankuai.waimai.store.newwidgets.NestFullListView;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodTopLabel;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.recipe.bock.list.a;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import com.sankuai.waimai.store.view.standard.FlashLabel;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g<com.sankuai.waimai.store.recipe.bock.list.a, com.sankuai.waimai.store.recipe.g> {
    public static ChangeQuickRedirect a;
    public boolean b;
    private C1292c c;
    private NestFullListView d;
    private TextView e;
    private TextView f;
    private View g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private View k;
    private TextView l;
    private View m;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_common_recipe_item_details;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.recipe.bock.list.a aVar, int i) {
        final com.sankuai.waimai.store.recipe.bock.list.a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd65374bc448b0144e92f66eab2c0e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd65374bc448b0144e92f66eab2c0e0");
        } else if (aVar2 == null || aVar2.b == null) {
        } else {
            Recipe.Ingredient ingredient = aVar2.b;
            this.c.a(aVar2.f);
            if (i == 0 || p.a(ingredient.title, ingredient.subTitle)) {
                this.g.setVisibility(8);
                this.d.setVisibility(0);
            } else {
                this.g.setVisibility(0);
                u.a(this.e, ingredient.title);
                u.a(this.f, ingredient.subTitle);
                this.h.setSelected(aVar2.c);
                if (aVar2.c) {
                    this.d.setVisibility(8);
                } else {
                    this.d.setVisibility(0);
                }
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.bock.list.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d750b7aec8892f535804e3a0906be18f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d750b7aec8892f535804e3a0906be18f");
                            return;
                        }
                        aVar2.c = !aVar2.c;
                        com.sankuai.waimai.store.recipe.d i2 = ((com.sankuai.waimai.store.recipe.g) c.this.o).i();
                        String str = aVar2.e.id;
                        String str2 = aVar2.e.name;
                        boolean z = aVar2.c;
                        Object[] objArr3 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                        if (PatchProxy.isSupport(objArr3, i2, changeQuickRedirect3, false, "7569c8015473fcc59e781604a5ac0c1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, i2, changeQuickRedirect3, false, "7569c8015473fcc59e781604a5ac0c1a");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("page_spu_id", Long.valueOf(i2.d));
                            hashMap.put("menu_id", str);
                            hashMap.put("menu_name", str2);
                            hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i2.c, i2.b));
                            hashMap.put("stid", i2.e);
                            hashMap.put("trace_id", i2.f);
                            hashMap.put("status", Integer.valueOf(z ? 2 : 1));
                            i2.g.a("b_waimai_sg_m0nx1ruz_mc", hashMap);
                        }
                        ((com.sankuai.waimai.store.recipe.g) c.this.o).d();
                    }
                });
            }
            com.sankuai.waimai.store.recipe.d i2 = ((com.sankuai.waimai.store.recipe.g) this.o).i();
            View view = this.g;
            String str = aVar2.e.id;
            String str2 = aVar2.e.name;
            boolean z = aVar2.c;
            Object[] objArr2 = {view, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.d.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "dd2a008df20f207cbbaebfed516729cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "dd2a008df20f207cbbaebfed516729cb");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("page_spu_id", Long.valueOf(i2.d));
                hashMap.put("menu_id", str);
                hashMap.put("menu_name", str2);
                hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i2.c, i2.b));
                hashMap.put("stid", i2.e);
                hashMap.put("trace_id", i2.f);
                hashMap.put("status", Integer.valueOf(z ? 2 : 1));
                com.sankuai.waimai.store.recipe.c cVar = i2.g;
                cVar.a("b_waimai_sg_m0nx1ruz_mv", hashMap, view, "b_waimai_sg_m0nx1ruz_mv" + str);
            }
            Object[] objArr3 = {Integer.valueOf(i), aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94e897df4fa5186db01db555c57cdb11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94e897df4fa5186db01db555c57cdb11");
                return;
            }
            final Recipe.Ingredient ingredient2 = aVar2.b;
            if (ingredient2 == null) {
                return;
            }
            if (ingredient2.price == null) {
                ingredient2.price = Double.valueOf(-1.0d);
            }
            if (ingredient2.originPrice == null) {
                ingredient2.originPrice = Double.valueOf(-1.0d);
            }
            if (i != 0 || ((i.b(ingredient2.price, Double.valueOf(0.0d)) && i.b(ingredient2.originPrice, Double.valueOf(0.0d)) && p.a(ingredient2.cartText)) || com.sankuai.shangou.stone.util.a.a((List) ingredient2.spuList) <= 1)) {
                this.m.setVisibility(8);
                return;
            }
            this.m.setVisibility(0);
            this.i.setText(i.a(ingredient2.price.doubleValue()));
            if (i.a(ingredient2.price, ingredient2.originPrice) || i.b(ingredient2.originPrice, Double.valueOf(0.0d))) {
                this.j.setVisibility(8);
            } else {
                this.j.setVisibility(0);
                this.j.setText(this.j.getContext().getString(R.string.wm_sc_common_price, i.a(ingredient2.originPrice.doubleValue())));
            }
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.bock.list.c.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String sb;
                    GoodsSpu goodsSpu;
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7e53665329b79ca60c4a3ab9065744d7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7e53665329b79ca60c4a3ab9065744d7");
                        return;
                    }
                    ((com.sankuai.waimai.store.recipe.g) c.this.o).a(view2, ingredient2.spuList);
                    com.sankuai.waimai.store.recipe.d i3 = ((com.sankuai.waimai.store.recipe.g) c.this.o).i();
                    c cVar2 = c.this;
                    List<GoodsSpu> list = ingredient2.spuList;
                    Object[] objArr5 = {list};
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "c1f68aa12f8e5bd6d60ba97c4479f067", RobustBitConfig.DEFAULT_VALUE)) {
                        sb = (String) PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "c1f68aa12f8e5bd6d60ba97c4479f067");
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if (!com.sankuai.shangou.stone.util.a.b(list) && (goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0)) != null) {
                            sb2.append(goodsSpu.id);
                            int size = list.size();
                            for (int i4 = 1; i4 < size; i4++) {
                                if (list.get(i4) != null) {
                                    sb2.append(CommonConstant.Symbol.COMMA);
                                    sb2.append(i4);
                                }
                            }
                        }
                        sb = sb2.toString();
                    }
                    String str3 = sb;
                    String str4 = aVar2.e.id;
                    String str5 = aVar2.e.name;
                    Object[] objArr6 = {str3, str4, str5};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.recipe.d.a;
                    if (PatchProxy.isSupport(objArr6, i3, changeQuickRedirect6, false, "6ef7a44d014175362dce2c8341e1a790", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, i3, changeQuickRedirect6, false, "6ef7a44d014175362dce2c8341e1a790");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("page_spu_id", Long.valueOf(i3.d));
                    hashMap2.put("spu_id", str3);
                    hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                    hashMap2.put("menu_id", str4);
                    hashMap2.put("menu_name", str5);
                    hashMap2.put("stid", i3.e);
                    hashMap2.put("trace_id", i3.f);
                    i3.g.a("b_waimai_sg_2vz250uu_mc", hashMap2);
                }
            });
            this.l.setText(ingredient2.cartText);
        }
    }

    public c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be37873f70ad2009747bdba247d1e505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be37873f70ad2009747bdba247d1e505");
        } else {
            this.b = z;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2487535f106d8eaa421be1be0b7021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2487535f106d8eaa421be1be0b7021");
            return;
        }
        this.d = (NestFullListView) view.findViewById(R.id.spu_list);
        this.d.setFocusable(false);
        this.d.setEnabled(false);
        this.c = new C1292c((com.sankuai.waimai.store.recipe.g) this.o, this.b);
        this.d.setAdapter(this.c);
        this.e = (TextView) view.findViewById(R.id.title);
        this.f = (TextView) view.findViewById(R.id.sub_title);
        this.h = (ImageView) view.findViewById(R.id.close);
        this.i = (TextView) view.findViewById(R.id.combination_price);
        this.j = (TextView) view.findViewById(R.id.original_price);
        this.k = view.findViewById(R.id.add_to_shop_cart_layout);
        this.l = (TextView) view.findViewById(R.id.food_material_count);
        this.g = view.findViewById(R.id.title_layout);
        this.m = view.findViewById(R.id.price_layout);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements com.sankuai.waimai.store.cell.core.b {
        public static ChangeQuickRedirect a;
        @NonNull
        private final com.sankuai.waimai.store.recipe.g b;

        @Override // com.sankuai.waimai.store.cell.core.b
        public final void a(GoodsSpu goodsSpu) {
        }

        @Override // com.sankuai.waimai.store.cell.core.b
        public final void b(GoodsSpu goodsSpu, int i) {
        }

        @Override // com.sankuai.waimai.store.cell.core.b
        public final void b(GoodsSpu goodsSpu, h hVar, int i) {
        }

        @Override // com.sankuai.waimai.store.cell.core.b
        public final void c(GoodsSpu goodsSpu, int i) {
        }

        private a(@NonNull com.sankuai.waimai.store.recipe.g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcaa8f169f47d14efda586f4be9a39d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcaa8f169f47d14efda586f4be9a39d5");
            } else {
                this.b = gVar;
            }
        }

        @Override // com.sankuai.waimai.store.cell.core.b
        public void a(GoodsSpu goodsSpu, h hVar, int i) {
            Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15241cef3396ee01376137d69e8f4666", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15241cef3396ee01376137d69e8f4666");
            } else {
                this.b.a(goodsSpu, hVar, i);
            }
        }

        @Override // com.sankuai.waimai.store.cell.core.b
        public void a(GoodsSpu goodsSpu, int i) {
            Object[] objArr = {goodsSpu, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5beab3c21ec5aa6f160af19e0f859ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5beab3c21ec5aa6f160af19e0f859ea");
            } else {
                this.b.a(goodsSpu, i);
            }
        }

        @Override // com.sankuai.waimai.store.cell.core.b
        public void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
            Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a826faf84534f82d9be318e79bc845", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a826faf84534f82d9be318e79bc845");
            } else {
                this.b.a(goodsSpu, view, i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.recipe.bock.list.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1292c extends com.sankuai.waimai.store.newwidgets.list.c<a.C1290a, com.sankuai.waimai.store.recipe.g> {
        public static ChangeQuickRedirect a;
        private boolean b;

        public C1292c(com.sankuai.waimai.store.recipe.g gVar, boolean z) {
            super(gVar);
            Object[] objArr = {gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c56b087a3b65848ed0c46f9b18e063", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c56b087a3b65848ed0c46f9b18e063");
            } else {
                this.b = z;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.c
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ceb8c659ffe56b5fbbc95177ce92a9", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ceb8c659ffe56b5fbbc95177ce92a9") : new d(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d extends g<a.C1290a, com.sankuai.waimai.store.recipe.g> {
        public static ChangeQuickRedirect a;
        private a b;
        private boolean c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(a.C1290a c1290a, final int i) {
            final a.C1290a c1290a2 = c1290a;
            Object[] objArr = {c1290a2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781c75acb6750197e067706f75d7234d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781c75acb6750197e067706f75d7234d");
            } else if (c1290a2 == null || c1290a2.b == null) {
            } else {
                this.b.setActionCallback(new a((com.sankuai.waimai.store.recipe.g) this.o) { // from class: com.sankuai.waimai.store.recipe.bock.list.c.d.1
                    public static ChangeQuickRedirect b;

                    @Override // com.sankuai.waimai.store.recipe.bock.list.c.a, com.sankuai.waimai.store.cell.core.b
                    public final void a(GoodsSpu goodsSpu, h hVar, int i2) {
                        Object[] objArr2 = {goodsSpu, hVar, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11514fbfae6596635b191fd65edfb633", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11514fbfae6596635b191fd65edfb633");
                            return;
                        }
                        super.a(goodsSpu, hVar, i2);
                        if (goodsSpu == null) {
                            return;
                        }
                        if (c1290a2.d) {
                            com.sankuai.waimai.store.recipe.d i3 = ((com.sankuai.waimai.store.recipe.g) d.this.o).i();
                            long id = goodsSpu.getId();
                            String str = c1290a2.a.id;
                            String str2 = c1290a2.a.name;
                            int i4 = i;
                            boolean a2 = com.sankuai.shangou.stone.util.a.a((Collection<?>) c1290a2.b.similarSpuList);
                            Object[] objArr3 = {new Long(id), str, str2, Integer.valueOf(i4), Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                            if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "93b8e8df25b3fb04796e60fc93f61b1a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "93b8e8df25b3fb04796e60fc93f61b1a");
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("spu_id", Long.valueOf(id));
                            hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                            hashMap.put("page_spu_id", Long.valueOf(i3.d));
                            hashMap.put("menu_id", str);
                            hashMap.put("menu_name", str2);
                            hashMap.put(DataConstants.INDEX, Integer.valueOf(i4));
                            hashMap.put("stid", i3.e);
                            hashMap.put("trace_id", i3.f);
                            hashMap.put("has_similar_spu", Integer.valueOf(a2 ? 1 : 0));
                            i3.g.a("b_waimai_sg_x9gu9qsq_mc", hashMap);
                            return;
                        }
                        com.sankuai.waimai.store.recipe.d i5 = ((com.sankuai.waimai.store.recipe.g) d.this.o).i();
                        String str3 = c1290a2.a.id;
                        long id2 = goodsSpu.getId();
                        String str4 = c1290a2.a.name;
                        Object[] objArr4 = {str3, new Long(id2), str4};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.d.a;
                        if (PatchProxy.isSupport(objArr4, i5, changeQuickRedirect4, false, "e1551b6fd6fa289a690487851faa4532", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, i5, changeQuickRedirect4, false, "e1551b6fd6fa289a690487851faa4532");
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("menu_id", str3);
                        hashMap2.put("menu_name", str4);
                        hashMap2.put("page_spu_id", Long.valueOf(i5.d));
                        hashMap2.put("spu_id", Long.valueOf(id2));
                        hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i5.c, i5.b));
                        hashMap2.put("stid", i5.e);
                        hashMap2.put("trace_id", i5.f);
                        i5.g.a("b_waimai_sg_j22tzo5x_mc", hashMap2);
                    }

                    @Override // com.sankuai.waimai.store.recipe.bock.list.c.a, com.sankuai.waimai.store.cell.core.b
                    public final void a(GoodsSpu goodsSpu, int i2) {
                        Object[] objArr2 = {goodsSpu, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "524d3fc31e27d2381a5c06176ea4cffd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "524d3fc31e27d2381a5c06176ea4cffd");
                        } else {
                            super.a(goodsSpu, i2);
                        }
                    }

                    @Override // com.sankuai.waimai.store.recipe.bock.list.c.a, com.sankuai.waimai.store.cell.core.b
                    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i2) {
                        Object[] objArr2 = {goodsSpu, view, hVar, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "466c199036ad03e5f66ccfac224ad43b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "466c199036ad03e5f66ccfac224ad43b");
                            return;
                        }
                        super.a(goodsSpu, view, hVar, i2);
                        if (goodsSpu == null) {
                            return;
                        }
                        if (c1290a2.d) {
                            com.sankuai.waimai.store.recipe.d i3 = ((com.sankuai.waimai.store.recipe.g) d.this.o).i();
                            long id = goodsSpu.getId();
                            String str = c1290a2.a.id;
                            String str2 = c1290a2.a.name;
                            int i4 = i;
                            boolean a2 = com.sankuai.shangou.stone.util.a.a((Collection<?>) c1290a2.b.similarSpuList);
                            Object[] objArr3 = {new Long(id), str, str2, Integer.valueOf(i4), Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                            if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "a276cbb55efa886274cf630b321453af", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "a276cbb55efa886274cf630b321453af");
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("spu_id", Long.valueOf(id));
                            hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                            hashMap.put("page_spu_id", Long.valueOf(i3.d));
                            hashMap.put("menu_id", str);
                            hashMap.put("menu_name", str2);
                            hashMap.put(DataConstants.INDEX, Integer.valueOf(i4));
                            hashMap.put("stid", i3.e);
                            hashMap.put("trace_id", i3.f);
                            hashMap.put("has_similar_spu", Integer.valueOf(a2 ? 1 : 0));
                            i3.g.a("b_waimai_sg_ov4639xm_mc", hashMap);
                            return;
                        }
                        com.sankuai.waimai.store.recipe.d i5 = ((com.sankuai.waimai.store.recipe.g) d.this.o).i();
                        String str3 = c1290a2.a.id;
                        long id2 = goodsSpu.getId();
                        String str4 = c1290a2.a.name;
                        Object[] objArr4 = {str3, new Long(id2), str4};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.d.a;
                        if (PatchProxy.isSupport(objArr4, i5, changeQuickRedirect4, false, "2c34de3c4103fbe96ae3468e4c35eb92", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, i5, changeQuickRedirect4, false, "2c34de3c4103fbe96ae3468e4c35eb92");
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("menu_id", str3);
                        hashMap2.put("menu_name", str4);
                        hashMap2.put("page_spu_id", Long.valueOf(i5.d));
                        hashMap2.put("spu_id", Long.valueOf(id2));
                        hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i5.c, i5.b));
                        hashMap2.put("stid", i5.e);
                        hashMap2.put("trace_id", i5.f);
                        i5.g.a("b_waimai_sg_nw3kicd0_mc", hashMap2);
                    }
                });
                this.b.a(c1290a2.b, i);
                this.b.a(c1290a2);
                a.a(this.b, c1290a2, i);
                if (c1290a2.d) {
                    com.sankuai.waimai.store.recipe.d i2 = ((com.sankuai.waimai.store.recipe.g) this.o).i();
                    a aVar = this.b;
                    long id = c1290a2.b.getId();
                    String str = c1290a2.a.id;
                    String str2 = c1290a2.a.name;
                    boolean a2 = com.sankuai.shangou.stone.util.a.a((Collection<?>) c1290a2.b.similarSpuList);
                    Object[] objArr2 = {aVar, new Long(id), str, str2, Integer.valueOf(i), Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.d.a;
                    if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "377d3008240ec70b9f1b9323db25c7c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "377d3008240ec70b9f1b9323db25c7c4");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("spu_id", Long.valueOf(id));
                    hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i2.c, i2.b));
                    hashMap.put("page_spu_id", Long.valueOf(i2.d));
                    hashMap.put("menu_id", str);
                    hashMap.put("menu_name", str2);
                    hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
                    hashMap.put("stid", i2.e);
                    hashMap.put("trace_id", i2.f);
                    hashMap.put("has_similar_spu", Integer.valueOf(a2 ? 1 : 0));
                    com.sankuai.waimai.store.recipe.c cVar = i2.g;
                    cVar.a("b_waimai_sg_x9gu9qsq_mv", hashMap, aVar, "b_waimai_sg_x9gu9qsq_mv" + str + id);
                    return;
                }
                com.sankuai.waimai.store.recipe.d i3 = ((com.sankuai.waimai.store.recipe.g) this.o).i();
                a aVar2 = this.b;
                String str3 = c1290a2.a.id;
                long id2 = c1290a2.b.getId();
                String str4 = c1290a2.a.name;
                Object[] objArr3 = {aVar2, str3, new Long(id2), str4};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "9aa91a6046ca60487d49f36473cffa67", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "9aa91a6046ca60487d49f36473cffa67");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("menu_id", str3);
                hashMap2.put("menu_name", str4);
                hashMap2.put("page_spu_id", Long.valueOf(i3.d));
                hashMap2.put("spu_id", Long.valueOf(id2));
                hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                hashMap2.put("stid", i3.e);
                hashMap2.put("trace_id", i3.f);
                com.sankuai.waimai.store.recipe.c cVar2 = i3.g;
                cVar2.a("b_waimai_sg_j22tzo5x_mv", hashMap2, aVar2, "b_waimai_sg_j22tzo5x_mv" + str3 + id2);
            }
        }

        public d(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c19ba1ce6b163d5a8b51d4cd4ede09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c19ba1ce6b163d5a8b51d4cd4ede09");
            } else {
                this.c = z;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b7818955d87a9ab8253b2b67e98cfcd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b7818955d87a9ab8253b2b67e98cfcd");
            } else {
                this.b.setPoiHelper(((com.sankuai.waimai.store.recipe.g) this.o).g());
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac07fa0e1710a7a7aaa9799a2d0e817", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac07fa0e1710a7a7aaa9799a2d0e817");
            }
            a.d = this.c;
            this.b = new a(viewGroup.getContext(), (com.sankuai.waimai.store.recipe.g) this.o);
            return this.b;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        static class a extends MultiCellView {
            public static ChangeQuickRedirect a;
            public static boolean d;
            private TextView e;
            private b f;
            private SCSingleLineFlowLayout g;
            private NestFullListView h;
            private final com.sankuai.waimai.store.recipe.g i;

            public static /* synthetic */ void a(a aVar, final a.C1290a c1290a, final int i) {
                Object[] objArr = {c1290a, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e287c12b97d7779711904eebad53fc92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e287c12b97d7779711904eebad53fc92");
                } else if (c1290a == null || c1290a.b == null) {
                } else {
                    aVar.f.b = c1290a;
                    aVar.f.e = i;
                    aVar.f.a(c1290a.b.similarSpuList);
                    aVar.e.setVisibility(aVar.f.isEmpty() ? 8 : 0);
                    aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.recipe.bock.list.c.d.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "411fb0135a120ebb755921251adccc27", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "411fb0135a120ebb755921251adccc27");
                                return;
                            }
                            c1290a.c = !c1290a.c;
                            a.this.i.d();
                            if (c1290a.d) {
                                com.sankuai.waimai.store.recipe.d i2 = a.this.i.i();
                                long id = c1290a.b.getId();
                                String str = c1290a.a.id;
                                String str2 = c1290a.a.name;
                                int i3 = i;
                                Object[] objArr3 = {new Long(id), str, str2, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                                if (PatchProxy.isSupport(objArr3, i2, changeQuickRedirect3, false, "fe5c87f4364f2d924571c5d0860ed0fe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, i2, changeQuickRedirect3, false, "fe5c87f4364f2d924571c5d0860ed0fe");
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("spu_id", Long.valueOf(id));
                                hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i2.c, i2.b));
                                hashMap.put("page_spu_id", Long.valueOf(i2.d));
                                hashMap.put("menu_id", str);
                                hashMap.put("menu_name", str2);
                                hashMap.put(DataConstants.INDEX, Integer.valueOf(i3));
                                hashMap.put("stid", i2.e);
                                hashMap.put("trace_id", i2.f);
                                i2.g.a("b_waimai_sg_oic15wuo_mc", hashMap);
                                return;
                            }
                            com.sankuai.waimai.store.recipe.d i4 = a.this.i.i();
                            String str3 = c1290a.a.id;
                            long id2 = c1290a.b.getId();
                            String str4 = c1290a.a.name;
                            Object[] objArr4 = {str3, new Long(id2), str4};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.d.a;
                            if (PatchProxy.isSupport(objArr4, i4, changeQuickRedirect4, false, "1c72b813a86e03656d7903c159214c3b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, i4, changeQuickRedirect4, false, "1c72b813a86e03656d7903c159214c3b");
                                return;
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("menu_id", str3);
                            hashMap2.put("menu_name", str4);
                            hashMap2.put("page_spu_id", Long.valueOf(i4.d));
                            hashMap2.put("spu_id", Long.valueOf(id2));
                            hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i4.c, i4.b));
                            hashMap2.put("stid", i4.e);
                            hashMap2.put("trace_id", i4.f);
                            i4.g.a("b_waimai_sg_u1sj62zr_mc", hashMap2);
                        }
                    });
                    aVar.e.setSelected(c1290a.c);
                    if (aVar.f.isEmpty() || c1290a.c) {
                        aVar.h.setVisibility(8);
                    } else {
                        aVar.h.setVisibility(0);
                    }
                    if (c1290a.d) {
                        com.sankuai.waimai.store.recipe.d i2 = aVar.i.i();
                        TextView textView = aVar.e;
                        long id = c1290a.b.getId();
                        String str = c1290a.a.id;
                        String str2 = c1290a.a.name;
                        Object[] objArr2 = {textView, new Long(id), str, str2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.d.a;
                        if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "a59e6d55df192188ee22c90406b792d7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "a59e6d55df192188ee22c90406b792d7");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("spu_id", Long.valueOf(id));
                        hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i2.c, i2.b));
                        hashMap.put("page_spu_id", Long.valueOf(i2.d));
                        hashMap.put("menu_id", str);
                        hashMap.put("menu_name", str2);
                        hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
                        hashMap.put("stid", i2.e);
                        hashMap.put("trace_id", i2.f);
                        com.sankuai.waimai.store.recipe.c cVar = i2.g;
                        cVar.a("b_waimai_sg_oic15wuo_mv", hashMap, textView, "b_waimai_sg_oic15wuo_mv" + str + id);
                        return;
                    }
                    com.sankuai.waimai.store.recipe.d i3 = aVar.i.i();
                    TextView textView2 = aVar.e;
                    String str3 = c1290a.a.id;
                    long id2 = c1290a.b.getId();
                    String str4 = c1290a.a.name;
                    Object[] objArr3 = {textView2, str3, new Long(id2), str4};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                    if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "79411055d5fde3f5b571c36501071cc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "79411055d5fde3f5b571c36501071cc2");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("menu_id", str3);
                    hashMap2.put("menu_name", str4);
                    hashMap2.put("page_spu_id", Long.valueOf(i3.d));
                    hashMap2.put("spu_id", Long.valueOf(id2));
                    hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                    hashMap2.put("stid", i3.e);
                    hashMap2.put("trace_id", i3.f);
                    com.sankuai.waimai.store.recipe.c cVar2 = i3.g;
                    cVar2.a("b_waimai_sg_u1sj62zr_mv", hashMap2, textView2, "b_waimai_sg_u1sj62zr_mv" + str3 + id2);
                }
            }

            public a(@NonNull Context context, com.sankuai.waimai.store.recipe.g gVar) {
                super(context);
                Object[] objArr = {context, gVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1664967368e3970ec2eae8cfda845a29", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1664967368e3970ec2eae8cfda845a29");
                    return;
                }
                this.i = gVar;
                this.f = new b(this.i);
                this.h.setAdapter(this.f);
            }

            @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final void c() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a70e5771ce63b84ba367e3142c95ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a70e5771ce63b84ba367e3142c95ce");
                    return;
                }
                super.c();
                this.e = (TextView) this.n.findViewById(R.id.tv_similar_recipe);
                this.h = (NestFullListView) this.n.findViewById(R.id.similar_recipe_list_view);
                this.h.setFocusable(false);
                this.h.setEnabled(false);
                if (d) {
                    this.g = (SCSingleLineFlowLayout) this.n.findViewById(R.id.label_flow_layout);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.views.cell.view.MultiCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final void d() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151103a1419740d6169840d46daedd30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151103a1419740d6169840d46daedd30");
                } else {
                    super.d();
                }
            }

            @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final void g() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7210bc0cfdf027207eaa3f89dee59760", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7210bc0cfdf027207eaa3f89dee59760");
                } else {
                    t();
                }
            }

            @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final void setNormalPromotionInfo(int i) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412113c867064cc4f85b3574e9508dae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412113c867064cc4f85b3574e9508dae");
                } else {
                    this.w.setText(this.ae.promotion.promotionTxt);
                }
            }

            @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final int getLayoutId() {
                return d ? R.layout.wm_sc_goods_list_recipe_list_item_new : R.layout.wm_sc_goods_list_recipe_list_item;
            }

            private TextView a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa12099b35f30462b94348f5339058d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa12099b35f30462b94348f5339058d");
                }
                TextView textView = new TextView(getContext());
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_11));
                textView.setIncludeFontPadding(false);
                textView.setGravity(17);
                textView.setText(str);
                textView.setTextColor(getContext().getResources().getColor(R.color.wm_sc_nox_search_color_858687));
                return textView;
            }

            public final void a(a.C1290a c1290a) {
                FlashLabel flashLabel;
                Object[] objArr = {c1290a};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4c0fb744e668488e79746bc042d1d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4c0fb744e668488e79746bc042d1d0");
                } else if (c1290a == null || c1290a.b == null || !d || this.g == null) {
                } else {
                    this.g.removeAllViews();
                    this.g.setVisibility(8);
                    if (!com.sankuai.shangou.stone.util.a.b(c1290a.b.productTopLabels)) {
                        getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
                        GoodTopLabel goodTopLabel = null;
                        int i = 0;
                        while (true) {
                            if (i < com.sankuai.shangou.stone.util.a.a((List) c1290a.b.productTopLabels)) {
                                GoodTopLabel goodTopLabel2 = (GoodTopLabel) com.sankuai.shangou.stone.util.a.a((List<Object>) c1290a.b.productTopLabels, i);
                                if (goodTopLabel2 != null && goodTopLabel2.type == 1) {
                                    goodTopLabel = goodTopLabel2;
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        if (goodTopLabel != null && !TextUtils.isEmpty(goodTopLabel.content)) {
                            String str = goodTopLabel.content;
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc83231a04f90bd024012639a872b0ba", RobustBitConfig.DEFAULT_VALUE)) {
                                flashLabel = (FlashLabel) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc83231a04f90bd024012639a872b0ba");
                            } else {
                                FlashLabel flashLabel2 = new FlashLabel(getContext());
                                FlashLabel.a aVar = new FlashLabel.a();
                                aVar.c = 1;
                                aVar.b = 2;
                                aVar.i = R.color.wm_sg_color_F6EFDE;
                                aVar.e = R.color.wm_sg_color_F6EFDE;
                                aVar.l = str;
                                aVar.d = R.color.wm_sg_color_7D6438;
                                flashLabel2.setLabelType(new FlashLabel.a[]{aVar});
                                flashLabel = flashLabel2;
                            }
                            this.g.addView(flashLabel);
                        }
                    }
                    if (!TextUtils.isEmpty(c1290a.b.monthSaledContent)) {
                        this.g.addView(a(c1290a.b.monthSaledContent));
                    }
                    if (!TextUtils.isEmpty(c1290a.b.praiseRate)) {
                        this.g.addView(a(c1290a.b.praiseRate));
                    }
                    if (!TextUtils.isEmpty(c1290a.b.recommendReason)) {
                        this.g.addView(a(c1290a.b.recommendReason));
                    }
                    if (this.g.getChildCount() > 0) {
                        this.g.setVisibility(0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.store.newwidgets.list.c<GoodsSpu, com.sankuai.waimai.store.recipe.g> {
        public static ChangeQuickRedirect a;
        a.C1290a b;
        int e;

        public b(com.sankuai.waimai.store.recipe.g gVar) {
            super(gVar);
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a828c8bb1c2b7de1c64ec57005bcd5da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a828c8bb1c2b7de1c64ec57005bcd5da");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.c
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a67e620f2250f475c686be718a8612", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a67e620f2250f475c686be718a8612") : new a();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        class a extends g<GoodsSpu, com.sankuai.waimai.store.recipe.g> {
            public static ChangeQuickRedirect a;
            private C1291a c;

            private a() {
                Object[] objArr = {b.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330d14f215c9b446db6f8e49a72ac207", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330d14f215c9b446db6f8e49a72ac207");
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.list.g
            public final /* synthetic */ void a(GoodsSpu goodsSpu, final int i) {
                final GoodsSpu goodsSpu2 = goodsSpu;
                Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be0e5f5c92ff9443559d4a097b88863", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be0e5f5c92ff9443559d4a097b88863");
                } else if (goodsSpu2 == null) {
                } else {
                    this.c.setActionCallback(new a((com.sankuai.waimai.store.recipe.g) this.o) { // from class: com.sankuai.waimai.store.recipe.bock.list.c.b.a.1
                        public static ChangeQuickRedirect b;

                        @Override // com.sankuai.waimai.store.recipe.bock.list.c.a, com.sankuai.waimai.store.cell.core.b
                        public final void a(GoodsSpu goodsSpu3, h hVar, int i2) {
                            Object[] objArr2 = {goodsSpu3, hVar, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = b;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d70c74dd053e0283e1acd062b2a3c7a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d70c74dd053e0283e1acd062b2a3c7a3");
                                return;
                            }
                            super.a(goodsSpu3, hVar, i2);
                            if (b.this.b == null || b.this.b.b == null) {
                                return;
                            }
                            if (b.this.b.d) {
                                com.sankuai.waimai.store.recipe.d i3 = ((com.sankuai.waimai.store.recipe.g) a.this.o).i();
                                long id = goodsSpu2.getId();
                                long j = b.this.b.b.id;
                                String str = b.this.b.a.id;
                                String str2 = b.this.b.a.name;
                                int i4 = i;
                                int i5 = b.this.e;
                                Object[] objArr3 = {new Long(id), new Long(j), str, str2, Integer.valueOf(i4), Integer.valueOf(i5)};
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                                if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "014a77e66173fa9736d9dd9c77ecfac5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "014a77e66173fa9736d9dd9c77ecfac5");
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("spu_id", Long.valueOf(id));
                                hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                                hashMap.put("page_spu_id", Long.valueOf(i3.d));
                                hashMap.put("menu_spu_id", Long.valueOf(j));
                                hashMap.put("menu_id", str);
                                hashMap.put("menu_name", str2);
                                hashMap.put(DataConstants.INDEX, Integer.valueOf(i4));
                                hashMap.put("spu_index", Integer.valueOf(i5));
                                hashMap.put("stid", i3.e);
                                hashMap.put("trace_id", i3.f);
                                i3.g.a("b_waimai_sg_nxa7n71d_mc", hashMap);
                                return;
                            }
                            com.sankuai.waimai.store.recipe.d i6 = ((com.sankuai.waimai.store.recipe.g) a.this.o).i();
                            String str3 = b.this.b.a.id;
                            long j2 = b.this.b.b.id;
                            int i7 = i;
                            int i8 = b.this.e;
                            long id2 = goodsSpu2.getId();
                            String str4 = b.this.b.a.name;
                            Object[] objArr4 = {str3, new Long(j2), Integer.valueOf(i7), Integer.valueOf(i8), new Long(id2), str4};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.d.a;
                            if (PatchProxy.isSupport(objArr4, i6, changeQuickRedirect4, false, "75afc04482da1f33548389dea521d824", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, i6, changeQuickRedirect4, false, "75afc04482da1f33548389dea521d824");
                                return;
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("spu_id", Long.valueOf(id2));
                            hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i6.c, i6.b));
                            hashMap2.put("menu_spu_id", Long.valueOf(j2));
                            hashMap2.put(DataConstants.INDEX, Integer.valueOf(i7));
                            hashMap2.put("spu_index", Integer.valueOf(i8));
                            hashMap2.put("menu_id", str3);
                            hashMap2.put("menu_name", str4);
                            hashMap2.put("page_spu_id", Long.valueOf(i6.d));
                            hashMap2.put("stid", i6.e);
                            hashMap2.put("trace_id", i6.f);
                            i6.g.a("b_waimai_sg_l5juwv1c_mc", hashMap2);
                        }

                        @Override // com.sankuai.waimai.store.recipe.bock.list.c.a, com.sankuai.waimai.store.cell.core.b
                        public final void a(GoodsSpu goodsSpu3, int i2) {
                            Object[] objArr2 = {goodsSpu3, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = b;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a2472035786eec94190788e86e13380", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a2472035786eec94190788e86e13380");
                            } else {
                                super.a(goodsSpu3, i2);
                            }
                        }

                        @Override // com.sankuai.waimai.store.recipe.bock.list.c.a, com.sankuai.waimai.store.cell.core.b
                        public final void a(GoodsSpu goodsSpu3, View view, h hVar, int i2) {
                            Object[] objArr2 = {goodsSpu3, view, hVar, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = b;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "962173fdc58c7189b8b58f85fdd20ed4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "962173fdc58c7189b8b58f85fdd20ed4");
                                return;
                            }
                            super.a(goodsSpu3, view, hVar, i2);
                            if (b.this.b == null || b.this.b.b == null) {
                                return;
                            }
                            if (b.this.b.d) {
                                com.sankuai.waimai.store.recipe.d i3 = ((com.sankuai.waimai.store.recipe.g) a.this.o).i();
                                long id = goodsSpu2.getId();
                                long j = b.this.b.b.id;
                                String str = b.this.b.a.id;
                                String str2 = b.this.b.a.name;
                                int i4 = i;
                                int i5 = b.this.e;
                                Object[] objArr3 = {new Long(id), new Long(j), str, str2, Integer.valueOf(i4), Integer.valueOf(i5)};
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                                if (PatchProxy.isSupport(objArr3, i3, changeQuickRedirect3, false, "fc2e8e352feb8b5a4c6b1ec987fc84e5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, i3, changeQuickRedirect3, false, "fc2e8e352feb8b5a4c6b1ec987fc84e5");
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("spu_id", Long.valueOf(id));
                                hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i3.c, i3.b));
                                hashMap.put("page_spu_id", Long.valueOf(i3.d));
                                hashMap.put("menu_spu_id", Long.valueOf(j));
                                hashMap.put("menu_id", str);
                                hashMap.put("menu_name", str2);
                                hashMap.put(DataConstants.INDEX, Integer.valueOf(i4));
                                hashMap.put("stid", i3.e);
                                hashMap.put("spu_index", Integer.valueOf(i5));
                                hashMap.put("trace_id", i3.f);
                                i3.g.a("b_waimai_sg_d90p4hed_mc", hashMap);
                                return;
                            }
                            com.sankuai.waimai.store.recipe.d i6 = ((com.sankuai.waimai.store.recipe.g) a.this.o).i();
                            String str3 = b.this.b.a.id;
                            long j2 = b.this.b.b.id;
                            int i7 = i;
                            int i8 = b.this.e;
                            long id2 = goodsSpu2.getId();
                            String str4 = b.this.b.a.name;
                            Object[] objArr4 = {str3, new Long(j2), Integer.valueOf(i7), Integer.valueOf(i8), new Long(id2), str4};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.recipe.d.a;
                            if (PatchProxy.isSupport(objArr4, i6, changeQuickRedirect4, false, "41842d554f899a5e957e8a8463ef6bfc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, i6, changeQuickRedirect4, false, "41842d554f899a5e957e8a8463ef6bfc");
                                return;
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("spu_id", Long.valueOf(id2));
                            hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i6.c, i6.b));
                            hashMap2.put("menu_spu_id", Long.valueOf(j2));
                            hashMap2.put(DataConstants.INDEX, Integer.valueOf(i7));
                            hashMap2.put("spu_index", Integer.valueOf(i8));
                            hashMap2.put("menu_id", str3);
                            hashMap2.put("menu_name", str4);
                            hashMap2.put("page_spu_id", Long.valueOf(i6.d));
                            hashMap2.put("stid", i6.e);
                            hashMap2.put("trace_id", i6.f);
                            i6.g.a("b_waimai_sg_uyohndm6_mc", hashMap2);
                        }
                    });
                    this.c.a(goodsSpu2, i);
                    if (b.this.b == null || b.this.b.b == null) {
                        return;
                    }
                    if (b.this.b.d) {
                        com.sankuai.waimai.store.recipe.d i2 = ((com.sankuai.waimai.store.recipe.g) this.o).i();
                        C1291a c1291a = this.c;
                        long id = goodsSpu2.getId();
                        long j = b.this.b.b.id;
                        String str = b.this.b.a.id;
                        String str2 = b.this.b.a.name;
                        int i3 = b.this.e;
                        Object[] objArr2 = {c1291a, new Long(id), new Long(j), str, str2, Integer.valueOf(i), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.recipe.d.a;
                        if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "5041b8e68188ce595c569dc8960f73d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "5041b8e68188ce595c569dc8960f73d9");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("spu_id", Long.valueOf(id));
                        hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i2.c, i2.b));
                        hashMap.put("page_spu_id", Long.valueOf(i2.d));
                        hashMap.put("menu_spu_id", Long.valueOf(j));
                        hashMap.put("menu_id", str);
                        hashMap.put("spu_index", Integer.valueOf(i3));
                        hashMap.put("menu_name", str2);
                        hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
                        hashMap.put("stid", i2.e);
                        hashMap.put("trace_id", i2.f);
                        com.sankuai.waimai.store.recipe.c cVar = i2.g;
                        cVar.a("b_waimai_sg_nxa7n71d_mv", hashMap, c1291a, "b_waimai_sg_nxa7n71d_mv" + str + id + j);
                        return;
                    }
                    com.sankuai.waimai.store.recipe.d i4 = ((com.sankuai.waimai.store.recipe.g) this.o).i();
                    C1291a c1291a2 = this.c;
                    String str3 = b.this.b.a.id;
                    long j2 = b.this.b.b.id;
                    int i5 = b.this.e;
                    long id2 = goodsSpu2.getId();
                    String str4 = b.this.b.a.name;
                    Object[] objArr3 = {c1291a2, str3, new Long(j2), Integer.valueOf(i), Integer.valueOf(i5), new Long(id2), str4};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.recipe.d.a;
                    if (PatchProxy.isSupport(objArr3, i4, changeQuickRedirect3, false, "f7e5cb6d1e732e37ee5d45352e73a084", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, i4, changeQuickRedirect3, false, "f7e5cb6d1e732e37ee5d45352e73a084");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("spu_id", Long.valueOf(id2));
                    hashMap2.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(i4.c, i4.b));
                    hashMap2.put("menu_spu_id", Long.valueOf(j2));
                    hashMap2.put(DataConstants.INDEX, Integer.valueOf(i));
                    hashMap2.put("spu_index", Integer.valueOf(i5));
                    hashMap2.put("menu_id", str3);
                    hashMap2.put("menu_name", str4);
                    hashMap2.put("page_spu_id", Long.valueOf(i4.d));
                    hashMap2.put("stid", i4.e);
                    hashMap2.put("trace_id", i4.f);
                    com.sankuai.waimai.store.recipe.c cVar2 = i4.g;
                    cVar2.a("b_waimai_sg_l5juwv1c_mv", hashMap2, c1291a2, "b_waimai_sg_l5juwv1c_mv" + str3 + j2 + id2);
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.list.g
            public final void a(@NonNull View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff63901d94be5a7a89147006385b45e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff63901d94be5a7a89147006385b45e1");
                } else {
                    this.c.setPoiHelper(((com.sankuai.waimai.store.recipe.g) this.o).g());
                }
            }

            @Override // com.sankuai.waimai.store.newwidgets.list.g
            public final View a(ViewGroup viewGroup) {
                Object[] objArr = {viewGroup};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42a0bbe378350d4b385cd5fdd57059d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42a0bbe378350d4b385cd5fdd57059d");
                }
                this.c = new C1291a(viewGroup.getContext());
                return this.c;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.store.recipe.bock.list.c$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            class C1291a extends MultiCellView {
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
                public final int getLayoutId() {
                    return R.layout.wm_sc_goods_list_similar_recipe_list_item;
                }

                public C1291a(@NonNull Context context) {
                    super(context);
                    Object[] objArr = {a.this, context};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1a47254871442dcaeec3010a79789d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1a47254871442dcaeec3010a79789d");
                    }
                }
            }
        }
    }
}
