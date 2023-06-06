package com.sankuai.waimai.store.skuchoose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.assembler.component.p;
import com.sankuai.waimai.store.cell.view.SpuEstimatedPriceView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceAdapterView;
import com.sankuai.waimai.store.view.SpuHandPriceNewView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    TextView d;
    public TextView e;
    @NonNull
    g f;
    com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private TextView h;
    private TextView i;
    private SpuEstimatedPriceView j;
    private TextView k;
    private SpuHandPriceNewView l;
    private ViewGroup m;
    private HandPriceAdapterView n;
    private RelativeLayout o;
    private com.sankuai.waimai.store.assembler.component.p p;
    private TagCanvasView q;

    public static /* synthetic */ void a(b bVar, GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "83d7d8dc12c241149901533a61f8e752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "83d7d8dc12c241149901533a61f8e752");
        } else if (!com.sankuai.shangou.stone.util.i.d(Double.valueOf(goodsSku.getOriginPrice()), Double.valueOf(goodsSku.price))) {
            u.c(bVar.c);
        } else {
            u.a(bVar.c);
            bVar.c.setText(bVar.mContext.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(goodsSku.originPrice)));
            bVar.c.getPaint().setFlags(17);
        }
    }

    public b(@NonNull Context context, @NonNull g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab2c47b038c47901245a81020630780e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab2c47b038c47901245a81020630780e");
        } else {
            this.f = gVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4aad398eca7d6bec130b50c251a1f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4aad398eca7d6bec130b50c251a1f4");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) findView(R.id.txt_normal_price);
        this.c = (TextView) findView(R.id.tv_original_price);
        this.h = (TextView) findView(R.id.tv_promotion_info);
        this.i = (TextView) findView(R.id.tv_discount_stock);
        this.d = (TextView) findView(R.id.tv_member_price);
        this.j = (SpuEstimatedPriceView) findView(R.id.view_estimate_price);
        this.k = (TextView) findView(R.id.tv_attrs_info);
        this.e = (TextView) findView(R.id.tv_add_shopcart);
        this.o = (RelativeLayout) findView(R.id.price_root_view);
        this.n = (HandPriceAdapterView) findView(R.id.hand_price_component);
        this.l = (SpuHandPriceNewView) findView(R.id.sg_new_hand_price_view);
        this.m = (ViewGroup) findView(R.id.v_add_shop_layout);
        this.p = new com.sankuai.waimai.store.assembler.component.p(getContext());
        this.m.addView(this.p.b);
        this.p.a(new p.a() { // from class: com.sankuai.waimai.store.skuchoose.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.p.a
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "606706f85b8a06ecbc3f27efd0af1f25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "606706f85b8a06ecbc3f27efd0af1f25");
                } else {
                    b.this.f.bI_();
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.p.a
            public final void b(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21c73cc1d519c6a1ab39ee094e96b712", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21c73cc1d519c6a1ab39ee094e96b712");
                } else {
                    b.this.f.b();
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12fa03f198e7550423cd4bed0e5e6d41", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12fa03f198e7550423cd4bed0e5e6d41");
                } else {
                    b.this.f.bI_();
                }
            }
        });
        this.q = (TagCanvasView) findView(R.id.id_dynamic_tag_view);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull com.sankuai.waimai.store.platform.domain.core.poi.Poi r22, @android.support.annotation.NonNull com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu r23, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku r24, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr[] r25) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.skuchoose.b.a(com.sankuai.waimai.store.platform.domain.core.poi.Poi, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu, com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku, com.sankuai.waimai.platform.domain.core.goods.GoodsAttr[]):void");
    }

    private void a(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a26819e15bcab78bb43428b86d0679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a26819e15bcab78bb43428b86d0679");
            return;
        }
        u.b(this.m, this.e);
        u.c(this.d, this.j);
    }
}
