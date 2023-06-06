package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.newp.block.helper.a;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.a;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.c;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.OrderMessageEntity;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFloatCard extends BaseCard implements l<PoiResult>, com.sankuai.waimai.store.assembler.component.a {
    public static ChangeQuickRedirect h;
    private ViewGroup i;
    private ViewGroup j;
    private com.sankuai.waimai.store.param.a k;
    private com.sankuai.waimai.store.drug.home.newp.block.helper.a l;
    private g m;
    private a n;
    private com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.a o;
    private LinearLayout p;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable PoiResult poiResult) {
        PoiResult poiResult2 = poiResult;
        Object[] objArr = {poiResult2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb46073c00f4de16b0eccad5e3f60bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb46073c00f4de16b0eccad5e3f60bc4");
        } else if (poiResult2 != null) {
            PoiVerticalityDataResponse poiVerticalityDataResponse = poiResult2.response;
            Object[] objArr2 = {poiVerticalityDataResponse};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a8514ac4476c54c3be92d4df28f9392", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a8514ac4476c54c3be92d4df28f9392");
            } else if (poiVerticalityDataResponse != null) {
                try {
                    if (this.i != null) {
                        this.i.removeAllViews();
                    }
                    if (this.l != null) {
                        com.sankuai.waimai.store.drug.home.newp.block.helper.a aVar = this.l;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.newp.block.helper.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "45296f3d294e00705e8d5243183af37f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "45296f3d294e00705e8d5243183af37f");
                        } else {
                            aVar.b.clear();
                        }
                    }
                    SCBaseActivity sCBaseActivity = (SCBaseActivity) this.e;
                    ViewGroup viewGroup = this.i;
                    Object[] objArr4 = {sCBaseActivity, viewGroup};
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    g gVar = null;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "030654676d082d9856b88258acfa7497", RobustBitConfig.DEFAULT_VALUE)) {
                        gVar = (g) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "030654676d082d9856b88258acfa7497");
                    } else if (!com.sankuai.waimai.store.util.b.a(sCBaseActivity) && viewGroup != null) {
                        LinearLayout linearLayout = new LinearLayout(sCBaseActivity);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        viewGroup.addView(linearLayout);
                        linearLayout.setPadding(0, 0, h.a(sCBaseActivity, 12.0f), 0);
                        gVar = new g(sCBaseActivity);
                        gVar.createAndReplaceView(linearLayout);
                        gVar.hide();
                    }
                    this.m = gVar;
                    if (this.m != null) {
                        this.m.a(poiVerticalityDataResponse.mFloatSmallDrugChest, this.k);
                    }
                    final c a = c.a();
                    a aVar2 = this.n;
                    g gVar2 = this.m;
                    Object[] objArr5 = {aVar2, gVar2};
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, a, changeQuickRedirect5, false, "b5a2dcea495f1b9e125484ce8eecbeda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, a, changeQuickRedirect5, false, "b5a2dcea495f1b9e125484ce8eecbeda");
                    } else {
                        a.b = aVar2;
                        a.c = gVar2;
                        if (a.b != null) {
                            a.b.c = new a.InterfaceC1159a() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.c.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.drug.home.refactor.card.float_card.a.InterfaceC1159a
                                public final void a(boolean z) {
                                    Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d4e0656622fed33df89b738819992888", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d4e0656622fed33df89b738819992888");
                                    } else if (c.this.c == null) {
                                    } else {
                                        if (z) {
                                            g gVar3 = c.this.c;
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = g.a;
                                            if (PatchProxy.isSupport(objArr7, gVar3, changeQuickRedirect7, false, "3ef768d8fcb7e287f361283f32873a58", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, gVar3, changeQuickRedirect7, false, "3ef768d8fcb7e287f361283f32873a58");
                                                return;
                                            } else if (com.sankuai.waimai.store.drug.home.refactor.l.a() || p.a(gVar3.f, gVar3.b, gVar3.d, gVar3.e)) {
                                                return;
                                            } else {
                                                if (gVar3.c.c()) {
                                                    gVar3.c.a();
                                                }
                                                u.a(gVar3.d, gVar3.b);
                                                return;
                                            }
                                        }
                                        g gVar4 = c.this.c;
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = g.a;
                                        if (PatchProxy.isSupport(objArr8, gVar4, changeQuickRedirect8, false, "6287be71caf5f32ee13678a717969f1b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, gVar4, changeQuickRedirect8, false, "6287be71caf5f32ee13678a717969f1b");
                                        } else if (p.a(gVar4.b, gVar4.d)) {
                                        } else {
                                            if (gVar4.c.c()) {
                                                gVar4.c.b();
                                            }
                                            u.c(gVar4.b, gVar4.d);
                                        }
                                    }
                                }
                            };
                            if (com.sankuai.shangou.stone.util.a.a((List) a.d) > 0) {
                                c.a aVar3 = a.d.get(0);
                                a.b.a(aVar3.a, aVar3.b);
                            }
                        }
                    }
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = h;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e45b6c657e3d4babb2d2b520c4f99c18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e45b6c657e3d4babb2d2b520c4f99c18");
                    } else if (this.l == null || this.m == null) {
                    } else {
                        com.sankuai.waimai.store.drug.home.newp.block.helper.a aVar4 = this.l;
                        FragmentActivity fragmentActivity = this.e;
                        View view = this.m.getView();
                        Object[] objArr7 = {fragmentActivity, view};
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.drug.home.newp.block.helper.a.a;
                        if (PatchProxy.isSupport(objArr7, aVar4, changeQuickRedirect7, false, "ac2dbbbcf0f0950510273a3f651d3ca0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, aVar4, changeQuickRedirect7, false, "ac2dbbbcf0f0950510273a3f651d3ca0");
                        } else if (view != null) {
                            aVar4.b.put(view, new a.C1152a(fragmentActivity, view, aVar4.c));
                        }
                        this.l.a(this.m.getView());
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
    }

    public PoiFloatCard(android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd7e4e0d9f6ea5276830f221de2a653", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd7e4e0d9f6ea5276830f221de2a653");
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    @NonNull
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d864ecd531037bd5d52337ca264b53b6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d864ecd531037bd5d52337ca264b53b6") : LayoutInflater.from(this.e).inflate(R.layout.wm_drug_home_channel_refactor_float_card, viewGroup);
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final void a(View view) {
        a aVar;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95bc3931baff9e800773072b8ba72169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95bc3931baff9e800773072b8ba72169");
            return;
        }
        super.a(view);
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.e).a(PoiPageViewModel.class);
        this.k = poiPageViewModel.d.a();
        this.l = new com.sankuai.waimai.store.drug.home.newp.block.helper.a(false);
        this.p = (LinearLayout) a(R.id.ll_float_card_container);
        this.i = (ViewGroup) a(R.id.poi_anim_container);
        this.j = (ViewGroup) a(R.id.no_anim_container);
        SCBaseActivity sCBaseActivity = (SCBaseActivity) this.e;
        ViewGroup viewGroup = this.j;
        Object[] objArr2 = {sCBaseActivity, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3f5ba04c65799c54c4ca918baffc60a2", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3f5ba04c65799c54c4ca918baffc60a2");
        } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity) || viewGroup == null) {
            aVar = null;
        } else {
            LinearLayout linearLayout = new LinearLayout(sCBaseActivity);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            viewGroup.addView(linearLayout, 0);
            linearLayout.setPadding(0, 0, h.a(sCBaseActivity, 12.0f), 0);
            a aVar2 = new a(sCBaseActivity);
            aVar2.createAndReplaceView(linearLayout);
            aVar2.hide();
            aVar = aVar2;
        }
        this.n = aVar;
        a(com.sankuai.waimai.store.drug.home.newp.block.rxevent.b.class, new l<com.sankuai.waimai.store.drug.home.newp.block.rxevent.b>() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.PoiFloatCard.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.newp.block.rxevent.b bVar) {
                com.sankuai.waimai.store.drug.home.newp.block.rxevent.b bVar2 = bVar;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b507a600597af00f11ffd7aafae2ffae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b507a600597af00f11ffd7aafae2ffae");
                } else if (bVar2 != null) {
                    if (bVar2.a == 1) {
                        PoiFloatCard.this.c();
                    } else if (bVar2.a == 0) {
                        PoiFloatCard.this.d();
                    }
                }
            }
        });
        poiPageViewModel.b.a(this.d, this);
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        a(b.class, (l) (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3c3032f78a53300f93ab1493d2fe0d7c", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3c3032f78a53300f93ab1493d2fe0d7c") : new d(this)));
        k<OrderMessageEntity> kVar = ((FloatCardViewModule) q.a(this.e).a(FloatCardViewModule.class)).b;
        android.arch.lifecycle.f fVar = this.d;
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = e.a;
        kVar.a(fVar, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a0b88146eda5e0cea7c5986e93ad986d", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a0b88146eda5e0cea7c5986e93ad986d") : new e(this));
    }

    public static /* synthetic */ void a(PoiFloatCard poiFloatCard, b bVar) {
        Object[] objArr = {poiFloatCard, bVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b05bdaee93fe525960344a431f0e08d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b05bdaee93fe525960344a431f0e08d4");
        } else if (bVar != null) {
            u.a(poiFloatCard.p);
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public final com.sankuai.waimai.store.assembler.component.e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0272cbb96562e1fc1e6f162aad22412", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.assembler.component.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0272cbb96562e1fc1e6f162aad22412");
        }
        com.sankuai.waimai.store.assembler.component.e eVar = new com.sankuai.waimai.store.assembler.component.e();
        eVar.b = 2;
        eVar.a = 4;
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a.C1152a c1152a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f6f29864ea0e19b7776020429d6445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f6f29864ea0e19b7776020429d6445");
        } else if (this.l == null || this.m == null) {
        } else {
            com.sankuai.waimai.store.drug.home.newp.block.helper.a aVar = this.l;
            View view = this.m.getView();
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.home.newp.block.helper.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "985848c616e4999824dbf77ecf7ad8bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "985848c616e4999824dbf77ecf7ad8bd");
            } else if (view == null || (c1152a = aVar.b.get(view)) == null || c1152a.b || c1152a.c == null) {
            } else {
                c1152a.b = true;
                c1152a.c.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a43b15dcd8304c6e06533578140f2a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a43b15dcd8304c6e06533578140f2a05");
        } else if (this.l == null || this.m == null) {
        } else {
            this.l.a(this.m.getView());
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.a
    public final void a(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b01d40780f0412151c6a6f249e32d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b01d40780f0412151c6a6f249e32d4");
        } else if (z2) {
        } else {
            if (i2 == 0) {
                d();
            } else {
                c();
            }
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2d6bd55cb26f223be36b1f158be6d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2d6bd55cb26f223be36b1f158be6d6");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3222963675cb3a04f1d5be02a3e639f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3222963675cb3a04f1d5be02a3e639f");
        } else {
            super.onStop();
        }
    }

    @Override // com.sankuai.waimai.store.assembler.component.BaseCard
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5509fe72378639b60d746bfbab55d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5509fe72378639b60d746bfbab55d0d");
            return;
        }
        super.onDestroy();
        c a = c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "aaa4d151858000b48db4ca191acf9ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "aaa4d151858000b48db4ca191acf9ee9");
        } else {
            a.d.clear();
            if (a.b != null) {
                a.b.onDestroy();
            }
            a.b = null;
            a.c = null;
        }
        if (this.o != null) {
            this.o.onDestroy();
        }
    }

    public static /* synthetic */ void a(PoiFloatCard poiFloatCard, OrderMessageEntity orderMessageEntity) {
        Object[] objArr = {orderMessageEntity};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, poiFloatCard, changeQuickRedirect, false, "e4368dbea9d4e7115d39430958b14ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiFloatCard, changeQuickRedirect, false, "e4368dbea9d4e7115d39430958b14ea6");
        } else if (orderMessageEntity != null && orderMessageEntity.lastOrder != null) {
            if (poiFloatCard.o == null) {
                poiFloatCard.o = new com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.a((SCBaseActivity) poiFloatCard.e, poiFloatCard.k);
                LinearLayout linearLayout = new LinearLayout(poiFloatCard.e);
                poiFloatCard.p.addView(linearLayout);
                poiFloatCard.o.bindView(linearLayout);
            }
            poiFloatCard.o.show();
            u.d(poiFloatCard.p, 0, 0, 0, h.a(poiFloatCard.e, 12.0f));
            poiFloatCard.o.a(orderMessageEntity.lastOrder);
        } else if (poiFloatCard.o != null) {
            poiFloatCard.o.hide();
        }
    }
}
