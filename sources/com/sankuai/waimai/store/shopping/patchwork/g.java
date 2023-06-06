package com.sankuai.waimai.store.shopping.patchwork;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.w;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.patchwork.d;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.shopping.patchwork.a implements View.OnClickListener, com.sankuai.waimai.store.shopping.patchwork.adapter.d, com.sankuai.waimai.store.shopping.patchwork.adapter.f, b, d.b {
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.store.shopping.cart.contract.a c;
    private String d;
    private SCPageConfig e;
    private com.sankuai.waimai.store.shopping.patchwork.adapter.b f;
    private a g;
    private com.sankuai.waimai.store.shopping.patchwork.adapter.a h;
    private final d.a i;
    private f j;
    private c k;
    private LinearLayoutManager l;
    private View m;
    private TextView n;
    private NetInfoLoadView o;
    private int p;
    private GoodDetailResponse q;

    public g(String str, @NonNull Context context, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @Nonnull SCPageConfig sCPageConfig, com.sankuai.waimai.store.shopping.cart.contract.a aVar2, GoodDetailResponse goodDetailResponse) {
        super(context);
        Object[] objArr = {str, context, aVar, sCPageConfig, aVar2, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b207ce97495ea7887e190c336257836", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b207ce97495ea7887e190c336257836");
            return;
        }
        this.p = 1;
        this.c = aVar2;
        this.d = str;
        this.e = sCPageConfig;
        this.q = goodDetailResponse;
        this.i = new e(this, aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        w wVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf585d339a13aab1f9301b4d9b212a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf585d339a13aab1f9301b4d9b212a3");
            return;
        }
        super.onViewCreated();
        this.mView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.shopping.patchwork.g.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.j = new f(this.mContext, this);
        this.j.bindView(this.mView.findViewById(R.id.not_automatic_head));
        this.k = new c(this.mContext, this);
        this.k.bindView(this.mView.findViewById(R.id.automatic_head));
        findView(R.id.black_gap_view).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.patchwork.g.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04dd86f24f205bc88bba93d6704ada3c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04dd86f24f205bc88bba93d6704ada3c");
                } else {
                    g.this.a(view);
                }
            }
        });
        this.o = (NetInfoLoadView) findView(R.id.patchwork_list_layout_info);
        NetInfoLoadView netInfoLoadView = this.o;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = NetInfoLoadView.a;
        if (PatchProxy.isSupport(objArr2, netInfoLoadView, changeQuickRedirect2, false, "5830910f4d4f4252e6e0e4c103345722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, netInfoLoadView, changeQuickRedirect2, false, "5830910f4d4f4252e6e0e4c103345722");
        } else {
            netInfoLoadView.b.f = true;
        }
        this.o.setReloadClickListener(this);
        this.m = findView(R.id.black_gap_view);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "121ec61b63509b0de90f513ba4fc5ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "121ec61b63509b0de90f513ba4fc5ef7");
        } else {
            RecyclerView recyclerView = (RecyclerView) findView(R.id.rv_price_range);
            ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(this.mContext, 0, false);
            recyclerView.setLayoutManager(extendedLinearLayoutManager);
            this.f = new com.sankuai.waimai.store.shopping.patchwork.adapter.shop.b(this);
            recyclerView.setAdapter(new l(this.f));
            this.g = new a(extendedLinearLayoutManager);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9c5d62850920e53eba0304b799466b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9c5d62850920e53eba0304b799466b39");
        } else {
            RecyclerView recyclerView2 = (RecyclerView) findView(R.id.rv_patchwork_list);
            this.l = new LinearLayoutManager(this.mContext);
            recyclerView2.setLayoutManager(this.l);
            this.h = new com.sankuai.waimai.store.shopping.patchwork.adapter.shop.a(this, this.q);
            recyclerView2.setAdapter(new l(this.h));
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "961ebdbb22edc07ecabaff835b8aa70b", RobustBitConfig.DEFAULT_VALUE)) {
                wVar = (w) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "961ebdbb22edc07ecabaff835b8aa70b");
            } else {
                wVar = new w(this.mContext, 1);
                Drawable drawable = ContextCompat.getDrawable(this.mContext, R.drawable.wm_sc_recyclerview_divider);
                if (drawable != null) {
                    wVar.a(drawable);
                }
            }
            recyclerView2.addItemDecoration(wVar);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = b;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1877de64b5c21a23327a0cc0a6b01ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1877de64b5c21a23327a0cc0a6b01ff3");
            return;
        }
        this.n = (TextView) findView(R.id.b2c_patch_select_done_tv);
        this.n.setVisibility(8);
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eaf4734ddbacca860e6b8c134e85b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eaf4734ddbacca860e6b8c134e85b02");
            return;
        }
        this.h.m();
        this.f.m();
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.a
    public final void a(double d, boolean z, int i) {
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989c949bc145dba946a6295c2da49811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989c949bc145dba946a6295c2da49811");
            return;
        }
        super.show();
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        if (z) {
            this.p = 2;
            layoutParams.height = com.sankuai.waimai.platform.widget.tag.util.b.a(this.m.getContext(), 320.0f);
            this.j.hide();
            this.k.show();
        } else {
            this.p = 1;
            layoutParams.height = com.sankuai.waimai.platform.widget.tag.util.b.a(this.m.getContext(), 255.0f);
            this.j.show();
            this.k.hide();
        }
        SCPageConfig sCPageConfig = this.e;
        long i2 = i();
        int i3 = this.p;
        Object[] objArr2 = {sCPageConfig, new Long(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e662996f12ca2b9a397ce4de375b8b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e662996f12ca2b9a397ce4de375b8b4e");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(sCPageConfig.d, "b_waimai_gi20avy3_mv").a("poi_id", Long.valueOf(i2)).a("type", Integer.valueOf(i3)).a();
        }
        this.i.a(d, i);
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb553b7ed4ddb61b64dc4287a7ab66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb553b7ed4ddb61b64dc4287a7ab66a");
            return;
        }
        f fVar = this.j;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "173ec1518ada734479971b7a377417a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "173ec1518ada734479971b7a377417a4");
        } else if (TextUtils.isEmpty(str)) {
            fVar.b.setVisibility(8);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) CommonConstant.Symbol.BRACKET_LEFT);
            spannableStringBuilder.append((CharSequence) com.sankuai.waimai.store.util.l.a(str, "#FF6363"));
            spannableStringBuilder.append((CharSequence) CommonConstant.Symbol.BRACKET_RIGHT);
            fVar.b.setVisibility(0);
            fVar.b.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
        c cVar = this.k;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "32428770865532ad4cb17b1220869e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "32428770865532ad4cb17b1220869e76");
        } else if (TextUtils.isEmpty(str)) {
            cVar.b.setText(R.string.wm_sg_plus_success);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) cVar.b.getContext().getString(R.string.wm_sg_plus_success));
            spannableStringBuilder2.append((CharSequence) com.sankuai.waimai.store.util.l.a(str, "#FF8000"));
            cVar.b.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
        }
        if (TextUtils.isEmpty(str) || f().I()) {
            return;
        }
        SCPageConfig sCPageConfig = this.e;
        long i = i();
        int i2 = this.p;
        Object[] objArr4 = {sCPageConfig, new Long(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "626316c95be57168efdb6137b55f5b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "626316c95be57168efdb6137b55f5b6c");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(sCPageConfig.d, "b_waimai_ci70y2wm_mv").a("poi_id", Long.valueOf(i)).a("tips", str).a("type", Integer.valueOf(i2)).a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.d
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9feee0c264b8beb3bd8ec20e7b082d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9feee0c264b8beb3bd8ec20e7b082d3");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.router.g.a(this.mContext, goodsSpu, f().b);
            SCPageConfig sCPageConfig = this.e;
            long i2 = i();
            int i3 = this.p;
            Object[] objArr2 = {sCPageConfig, goodsSpu, new Long(i2), Integer.valueOf(i), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f3c97e6ffe9f25b14c99d10f45678950", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f3c97e6ffe9f25b14c99d10f45678950");
            } else if (goodsSpu == null) {
            } else {
                GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
                com.sankuai.waimai.store.manager.judas.b.a(sCPageConfig.d, "b_8usziulq").a("poi_id", Long.valueOf(i2)).a("spu_id", Long.valueOf(goodsSpu.getId())).a("type", Integer.valueOf(i3)).a("sku_id", goodsSku == null ? "" : Long.valueOf(goodsSku.getSkuId())).a("index", Integer.valueOf(i)).a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.d
    public final void a(GoodsSpu goodsSpu, View view, int i) {
        Object[] objArr = {goodsSpu, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2bb64b2a1e1f26c1f0d71085a218221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2bb64b2a1e1f26c1f0d71085a218221");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.order.a.e().a(f().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(view, 273, f().d()));
            SCPageConfig sCPageConfig = this.e;
            long i2 = i();
            int i3 = this.p;
            Object[] objArr2 = {sCPageConfig, goodsSpu, new Long(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "29fcf08b0a71d1f1001dbd678a1153f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "29fcf08b0a71d1f1001dbd678a1153f0");
            } else if (goodsSpu == null) {
            } else {
                GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
                com.sankuai.waimai.store.manager.judas.b.a(sCPageConfig.d, "b_q6a6b0ml").a("poi_id", Long.valueOf(i2)).a("spu_id", Long.valueOf(goodsSpu.id)).a("type", Integer.valueOf(i3)).a("price", Double.valueOf(goodsSpu.getMinPrice())).a("sku_id", goodsSku == null ? "" : Long.valueOf(goodsSku.getSkuId())).a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.d
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15241f8e59a5bbbb07fd9484fe26ac60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15241f8e59a5bbbb07fd9484fe26ac60");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.order.a.e().b(f().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(getView(), f().d()));
            SCPageConfig sCPageConfig = this.e;
            long i2 = i();
            int i3 = this.p;
            Object[] objArr2 = {sCPageConfig, goodsSpu, new Long(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "58eea44ed7034f9b5dcb3da5c764d26c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "58eea44ed7034f9b5dcb3da5c764d26c");
            } else if (goodsSpu == null) {
            } else {
                GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
                com.sankuai.waimai.store.manager.judas.b.a(sCPageConfig.d, "b_70dr9rfb").a("poi_id", Long.valueOf(i2)).a("spu_id", Long.valueOf(goodsSpu.id)).a("price", Double.valueOf(goodsSpu.getMinPrice())).a("type", Integer.valueOf(i3)).a("sku_id", goodsSku == null ? "" : Long.valueOf(goodsSku.getSkuId())).a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.d
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0781203606c2e0a824a1351aab8fe3f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0781203606c2e0a824a1351aab8fe3f8");
        } else {
            com.sankuai.waimai.store.router.g.a((Activity) this.mContext, goodsSpu, this.i.b().b, 4);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.d
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b5bdcd617bed983fb8a14a849b5836", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b5bdcd617bed983fb8a14a849b5836") : this.i.b();
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.f
    public final void a(@NonNull com.sankuai.waimai.store.shopping.patchwork.model.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb292c92ece40c60633c3034687f84f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb292c92ece40c60633c3034687f84f2");
            return;
        }
        a(cVar.c, i, cVar.d);
        SCPageConfig sCPageConfig = this.e;
        long i2 = i();
        String str = cVar.a;
        int i3 = this.p;
        Object[] objArr2 = {sCPageConfig, new Long(i2), Integer.valueOf(i), str, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e07110340724e778a72374a07f798e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e07110340724e778a72374a07f798e2e");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(sCPageConfig.d, "b_waimai_g096fycd_mc").a("poi_id", Long.valueOf(i2)).a("index", Integer.valueOf(i)).a("price_segment", str).a("type", Integer.valueOf(i3)).a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final void a(List<com.sankuai.waimai.store.shopping.patchwork.model.c> list, int i, List<GoodsSpu> list2) {
        Object[] objArr = {list, Integer.valueOf(i), list2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa33f3d5d7ada5fe974187d4e10b805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa33f3d5d7ada5fe974187d4e10b805");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.o.b(getContext().getString(R.string.wm_sc_has_no_spu));
        } else {
            com.sankuai.waimai.store.shopping.patchwork.adapter.b bVar = this.f;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.adapter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ed617885818c281d70014fe5cfd57868", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ed617885818c281d70014fe5cfd57868");
            } else {
                bVar.d.clear();
                if (list != null) {
                    bVar.d.addAll(list);
                }
                bVar.m();
            }
            a(list2, i, 0);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "500410b94ad3b33ac35b283ccc5158eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "500410b94ad3b33ac35b283ccc5158eb");
            return;
        }
        super.hide();
        if (this.c != null) {
            this.c.e();
        }
        SCPageConfig sCPageConfig = this.e;
        long i = i();
        int i2 = this.p;
        Object[] objArr2 = {sCPageConfig, new Long(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "055cd7f52c3382c7e0a861ec40734654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "055cd7f52c3382c7e0a861ec40734654");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(sCPageConfig.d, "b_waimai_2efkt4kt_mc").a("poi_id", Long.valueOf(i)).a("type", Integer.valueOf(i2)).a();
        }
        this.f.b();
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf5f5b65c3883d18c6405592a75d7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf5f5b65c3883d18c6405592a75d7fb");
            return;
        }
        this.o.a(2);
        this.o.setBackgroundResource(R.color.wm_st_common_white);
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f368e423db81acdcdf4ae1975d4e7926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f368e423db81acdcdf4ae1975d4e7926");
        } else {
            this.o.e();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2470959171998bfe3db5973bad3a88e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2470959171998bfe3db5973bad3a88e0");
        } else if (!e()) {
            this.o.a(str);
            if (i == 116) {
                this.o.d();
                return;
            }
            NetInfoLoadView netInfoLoadView = this.o;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = NetInfoLoadView.a;
            if (PatchProxy.isSupport(objArr2, netInfoLoadView, changeQuickRedirect2, false, "83ce7504782b1dba32f30785f371ccc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, netInfoLoadView, changeQuickRedirect2, false, "83ce7504782b1dba32f30785f371ccc1");
            } else {
                netInfoLoadView.c.b();
            }
        } else {
            this.o.e();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f9bb447089c3db8846b48d1e60d638", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f9bb447089c3db8846b48d1e60d638")).booleanValue() : !this.f.e();
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffad829aa9e279832cf528c19c1c0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffad829aa9e279832cf528c19c1c0c3");
            return;
        }
        f fVar = this.j;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "0406491e4334bf0a87700c8bfaa15b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "0406491e4334bf0a87700c8bfaa15b51");
        } else if (TextUtils.isEmpty(str)) {
            fVar.d.setVisibility(8);
            fVar.c.setVisibility(8);
        } else {
            fVar.d.setVisibility(0);
            fVar.c.setVisibility(0);
            fVar.d.setText(str);
        }
        c cVar = this.k;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "629fea5a8ecaf3f810e3722240f9e162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "629fea5a8ecaf3f810e3722240f9e162");
        } else if (TextUtils.isEmpty(str)) {
            cVar.c.setVisibility(8);
        } else {
            cVar.c.setVisibility(0);
            cVar.c.setText(cVar.c.getContext().getString(R.string.wm_sg_patch_work_activity_title, str));
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.d.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7304c01effc0b61ba28fe0fb8d4de8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7304c01effc0b61ba28fe0fb8d4de8b") : t.a(this.d) ? "" : this.d;
    }

    private void a(List<GoodsSpu> list, int i, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e543c95760ab405c1d8eba53fa06ddb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e543c95760ab405c1d8eba53fa06ddb2");
            return;
        }
        a(i);
        this.h.a(list);
        this.l.scrollToPositionWithOffset(Math.max(i2, 0), 0);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c46e78b0b2fabe2ba88f905a9ffe124e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c46e78b0b2fabe2ba88f905a9ffe124e");
        } else if (i == -1) {
        } else {
            this.mView.removeCallbacks(this.g);
            this.g.c = i;
            this.mView.post(this.g);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64379f9928456118991389d0c7016c97", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64379f9928456118991389d0c7016c97");
        } else {
            this.i.a();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841883c1eed92cad097d416b628fe763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841883c1eed92cad097d416b628fe763");
            return;
        }
        hide();
        if (view.getId() == R.id.iv_close) {
            SCPageConfig sCPageConfig = this.e;
            long i = i();
            int i2 = this.p;
            Object[] objArr2 = {sCPageConfig, new Long(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.patchwork.buried.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c8b659de3bb7dfb6432a94aa721cf36c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c8b659de3bb7dfb6432a94aa721cf36c");
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(sCPageConfig.d, "b_waimai_z2ri1rhg_mc").a("poi_id", Long.valueOf(i)).a("type", Integer.valueOf(i2)).a();
            }
        }
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.f
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aec3b7f278a1bc52bcc6166a238bfd2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aec3b7f278a1bc52bcc6166a238bfd2") : this.e.d;
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.f
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664e5dfb98ceea25695492c6576088a6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664e5dfb98ceea25695492c6576088a6")).intValue() : this.l.findFirstVisibleItemPosition();
    }

    @Override // com.sankuai.waimai.store.shopping.patchwork.adapter.f
    public final long i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69cecf153600a5ed673692bb2062e5b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69cecf153600a5ed673692bb2062e5b")).longValue() : f().f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        @NonNull
        private ExtendedLinearLayoutManager b;
        private int c;

        private a(@NonNull ExtendedLinearLayoutManager extendedLinearLayoutManager) {
            Object[] objArr = {extendedLinearLayoutManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d3292ee6e837618022cd68ad6c1bd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d3292ee6e837618022cd68ad6c1bd5");
            } else {
                this.b = extendedLinearLayoutManager;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c3988ed0837c5c808f0d76a53c9c22", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c3988ed0837c5c808f0d76a53c9c22");
                return;
            }
            try {
                this.b.b(this.c);
            } catch (Exception unused) {
            }
        }
    }
}
