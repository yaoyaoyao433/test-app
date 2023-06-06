package com.sankuai.waimai.store.v2.detail.component.actionbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.SGDetailIndicatorBlock;
import com.sankuai.waimai.store.newwidgets.SCActionbarItemView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import com.sankuai.waimai.store.viewblocks.MenuItemView;
import com.sankuai.waimai.store.viewblocks.e;
import java.util.List;
/* compiled from: ProGuard */
@Cube(children = {SGDetailIndicatorBlock.class}, events = {com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.a.class})
/* loaded from: classes5.dex */
public class SGDetailSearchActionBarShowMoreBlock extends b implements SGDetailSearchActionBarBlockEventHelper {
    public static ChangeQuickRedirect k;
    UniversalImageView l;
    private SGDetailIndicatorBlock m;
    private TextView n;
    private com.sankuai.waimai.store.expose.v2.entity.b o;
    private LinearLayout p;
    private LinearLayout q;
    private TextView r;
    private a s;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final int b(int i, int i2) {
        return i;
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.actionbar.SGDetailSearchActionBarBlockEventHelper
    public void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar) {
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final SCActionbarItemView s() {
        return null;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final ImageView t() {
        return null;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf70b43b59aa9604c00d10d509b0c926", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf70b43b59aa9604c00d10d509b0c926") : layoutInflater.inflate(R.layout.wm_st_goods_detail_search_style_action_bar_show_more, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a22c1820b5c86e0b526535a6efd43a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a22c1820b5c86e0b526535a6efd43a0");
            return;
        }
        super.a_(view);
        this.m = (SGDetailIndicatorBlock) b(R.id.fl_detail_indicator, (int) new SGDetailIndicatorBlock());
        this.m.i().setBackgroundColor(-1);
        View a = a(R.id.status_bar_place_holder);
        a.setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = u.a(view.getContext());
        a.setLayoutParams(layoutParams);
        a.setVisibility(k.a(l()) ? 0 : 8);
        a(0.0f);
        this.n = (TextView) a(R.id.tv_actionbar_search_text);
        this.p = (LinearLayout) a(R.id.ll_search_text_root_view);
        this.l = (UniversalImageView) a(R.id.iv_more_button);
        this.q = (LinearLayout) a(R.id.ll_right_container);
        this.r = (TextView) a(R.id.unread_message_count);
        this.s = new a(l(), this.j, this);
        final a aVar = this.s;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "13d11525616c5a80f7e738f1382fa1f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "13d11525616c5a80f7e738f1382fa1f1");
        } else {
            if (aVar.b == null) {
                aVar.b = new e(aVar.d, 2, aVar.c.f());
                aVar.b.a(new int[]{2});
                aVar.b.a(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.a.1
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                    }
                });
            }
            aVar.b.a(aVar.e.l);
            aVar.b.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a6e5828669926d8217d000f87e87f52", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a6e5828669926d8217d000f87e87f52");
                    } else {
                        a.this.b.a();
                    }
                }
            });
            aVar.b.i = new e.b() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3ff5227418313adf09d0b93358ffbb9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3ff5227418313adf09d0b93358ffbb9");
                        return;
                    }
                    com.sankuai.waimai.store.manager.user.a.a(a.this.d, new Runnable() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.a.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "867761e6c9e801a57f4ba5fb4a6f3e95", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "867761e6c9e801a57f4ba5fb4a6f3e95");
                            } else {
                                g.a(a.this.d, 103);
                            }
                        }
                    });
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.d, "b_waimai_sg_duezw0z4_mc").a("poi_id", Long.valueOf(a.this.c.b())).a("spu_id", Long.valueOf(a.this.c.c())).a();
                }

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void a(int i, int i2, boolean z, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58d02105be9bc98ee0af37a7c37b57a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58d02105be9bc98ee0af37a7c37b57a7");
                    } else {
                        a.this.c.h();
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c7082d0ffd12003acc041bba7747173", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c7082d0ffd12003acc041bba7747173");
                        return;
                    }
                    com.sankuai.waimai.store.v2.detail.component.invite.a aVar2 = new com.sankuai.waimai.store.v2.detail.component.invite.a();
                    SGDetailSearchActionBarShowMoreBlock sGDetailSearchActionBarShowMoreBlock = a.this.e;
                    Object[] objArr4 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = SGDetailSearchActionBarShowMoreBlock.k;
                    if (PatchProxy.isSupport(objArr4, sGDetailSearchActionBarShowMoreBlock, changeQuickRedirect4, false, "c9fa6f3d827c476299f544d3867d8650", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, sGDetailSearchActionBarShowMoreBlock, changeQuickRedirect4, false, "c9fa6f3d827c476299f544d3867d8650");
                    } else {
                        sGDetailSearchActionBarShowMoreBlock.a(aVar2);
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                    Object[] objArr3 = {Integer.valueOf(i), list, sparseArray};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f88d5ddae2e7f1f5db204059487d40f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f88d5ddae2e7f1f5db204059487d40f0");
                        return;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        int intValue = list.get(i2).intValue();
                        if (intValue == 1) {
                            com.sankuai.waimai.store.manager.judas.b.b(a.this.d, "b_waimai_sg_duezw0z4_mv").a("poi_id", Long.valueOf(a.this.c.b())).a("spu_id", Long.valueOf(a.this.c.c())).a();
                        } else if (intValue == 4) {
                            com.sankuai.waimai.store.manager.judas.b.b(a.this.d, "b_waimai_sg_q8nfh2pn_mv").a("index", Integer.valueOf(i2)).a("new_message_badge", Integer.valueOf(a.this.e.v())).a("poi_id", Long.valueOf(a.this.c.b())).a("spu_id", Long.valueOf(a.this.c.c())).a();
                        } else if (intValue == 9) {
                            com.sankuai.waimai.store.manager.judas.b.b(a.this.d, "b_waimai_myth0kfv_mv").a("index", Integer.valueOf(i2)).a("poi_id", Long.valueOf(a.this.c.b())).a("spu_id", Long.valueOf(a.this.c.c())).a();
                        }
                    }
                }
            };
        }
        this.p.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_F1F1F2)).a(h.a(l(), 15.0f)).a());
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.SGDetailSearchActionBarShowMoreBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a41ef1e460e4a21604449b0e88ca3ad", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a41ef1e460e4a21604449b0e88ca3ad");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(SGDetailSearchActionBarShowMoreBlock.this.l(), "b_waimai_sg_grqt042o_mc").a("poi_id", Long.valueOf(SGDetailSearchActionBarShowMoreBlock.this.j.b())).a("spu_id", Long.valueOf(SGDetailSearchActionBarShowMoreBlock.this.j.c())).a("stid", SGDetailSearchActionBarShowMoreBlock.this.a("stid")).a();
                SGDetailSearchActionBarShowMoreBlock.this.j.g();
            }
        });
        this.o = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_grqt042o_mv", this.p);
        com.sankuai.waimai.store.expose.v2.b.a().a(l(), this.o);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = k;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80b4f4e8b24c01c1a6ed3881d9f47da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80b4f4e8b24c01c1a6ed3881d9f47da9");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_v2dfue94_mv", this.l);
        if (ab.b().b((Context) l(), "wm_sc_goods_details_pop_menu", -999) != 999) {
            bVar.a("is_fold", 1);
        } else {
            bVar.a("is_fold", 0);
        }
        com.sankuai.waimai.store.expose.v2.b.a().a(l(), bVar);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, String str, String str2, String str3) {
        Object[] objArr = {aVar, goodsSpu, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8321c6fcc1af70b4efe64a53bfef4d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8321c6fcc1af70b4efe64a53bfef4d6");
            return;
        }
        super.a(aVar, goodsSpu, str, str2, str3);
        this.n.setText(str2);
        this.o.a("poi_id", Long.valueOf(this.j.b()));
        this.o.a("spu_id", Long.valueOf(this.j.c()));
        this.o.a("stid", a("stid"));
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void b(@NonNull final GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6bd785994eaf6eb9583af78b6d37e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6bd785994eaf6eb9583af78b6d37e4");
            return;
        }
        super.b(getMenuResponse);
        if (ab.b().b((Context) l(), "wm_sc_goods_details_pop_menu", -999) != 999) {
            this.s.a(getMenuResponse);
        }
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.v2.detail.component.actionbar.SGDetailSearchActionBarShowMoreBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "610ea033e79c0555fd60bc5188391d74", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "610ea033e79c0555fd60bc5188391d74");
                } else {
                    SGDetailSearchActionBarShowMoreBlock.this.s.a(getMenuResponse);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d882adbd0892b41814b6ed082bf6928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d882adbd0892b41814b6ed082bf6928");
        } else if (i <= 0) {
            u.c(this.r);
        } else {
            if (i <= 99) {
                c(String.valueOf(i));
            } else {
                c("99+");
            }
            if (this.s != null) {
                a aVar = this.s;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "65a35e821db44b10c40ffd538576d120", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "65a35e821db44b10c40ffd538576d120");
                } else if (aVar.b != null) {
                    aVar.b.b(i);
                }
            }
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7046ae6969dc0b2436f8e72912f278bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7046ae6969dc0b2436f8e72912f278bf");
        } else if (t.a(str) || this.r == null) {
            u.c(this.r);
        } else {
            u.a(this.r);
            this.r.setText(str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6773c3fab31bd6ba607bb26a44f12d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6773c3fab31bd6ba607bb26a44f12d33");
            return;
        }
        i().setClickable(!com.sankuai.waimai.store.util.g.a(f, 0.0f));
        this.m.a(true ^ com.sankuai.waimai.store.util.g.a(f, 0.0f));
        this.m.i().setAlpha(f);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final ImageView u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0fd7f509e15551c8662e363204bd81", RobustBitConfig.DEFAULT_VALUE) ? (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0fd7f509e15551c8662e363204bd81") : (ImageView) a(R.id.img_back);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab2e6f4586890c3f550480ba743efb37", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab2e6f4586890c3f550480ba743efb37")).intValue() : this.m.i().getHeight() + i + l().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_negative_2);
    }
}
