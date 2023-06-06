package com.sankuai.waimai.store.goods.detail.components.subroot.actionbar;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.SGDetailIndicatorBlock;
import com.sankuai.waimai.store.newwidgets.SCActionbarItemView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.viewblocks.MenuItemView;
import com.sankuai.waimai.store.viewblocks.e;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Cube(children = {SGDetailIndicatorBlock.class}, events = {a.class})
/* loaded from: classes5.dex */
public class SGDetailNormalActionBarBlock extends b implements SGDetailNormalActionBarBlockEventHelper {
    public static ChangeQuickRedirect k;
    private SGDetailIndicatorBlock l;
    private View m;
    private ImageView n;
    private int o;
    private SCActionbarItemView p;
    private com.sankuai.waimai.store.viewblocks.e q;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlockEventHelper
    public void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar) {
    }

    public static /* synthetic */ void a(SGDetailNormalActionBarBlock sGDetailNormalActionBarBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, sGDetailNormalActionBarBlock, changeQuickRedirect, false, "69e24b5cad08e095b40f98d4f9fb41b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGDetailNormalActionBarBlock, changeQuickRedirect, false, "69e24b5cad08e095b40f98d4f9fb41b5");
        } else if (sGDetailNormalActionBarBlock.q.b()) {
            sGDetailNormalActionBarBlock.q.a();
        } else {
            sGDetailNormalActionBarBlock.q.a(sGDetailNormalActionBarBlock.i);
            sGDetailNormalActionBarBlock.q.b(sGDetailNormalActionBarBlock.p);
        }
    }

    public SGDetailNormalActionBarBlock(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe07151fe1d7aff5082f7e3118a629d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe07151fe1d7aff5082f7e3118a629d0");
        } else {
            this.o = i;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf0d726f17e11abd2b402dfe379c410", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf0d726f17e11abd2b402dfe379c410") : layoutInflater.inflate(R.layout.wm_st_goods_detail_new_indicator_action_bar, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f014b287152cfc33cac0d215e90e24fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f014b287152cfc33cac0d215e90e24fc");
            return;
        }
        super.a_(view);
        this.l = (SGDetailIndicatorBlock) b(R.id.fl_detail_indicator, (int) new SGDetailIndicatorBlock());
        this.m = a(R.id.view_actionbar_background);
        this.n = (ImageView) a(R.id.iv_im_icon);
        this.p = (SCActionbarItemView) a(R.id.actionbar_more_button);
        View a = a(R.id.status_bar_place_holder);
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = u.a(view.getContext());
        a.setLayoutParams(layoutParams);
        a.setVisibility(k.a(l()) ? 0 : 8);
        a(0.0f);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f878bd59beb4f8449582c13412673892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f878bd59beb4f8449582c13412673892");
        } else if (this.o != 9 || this.p == null || com.sankuai.waimai.store.util.b.a(l())) {
        } else {
            if (this.q == null) {
                this.q = new com.sankuai.waimai.store.viewblocks.e(l(), 2, this.j.f());
                this.q.a(new int[]{2});
                this.q.a(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock.2
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                    }
                });
            }
            this.q.a(this.p);
            this.q.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c615d7c721f9b1cad033cb02c93c2a5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c615d7c721f9b1cad033cb02c93c2a5");
                    } else {
                        SGDetailNormalActionBarBlock.a(SGDetailNormalActionBarBlock.this);
                    }
                }
            });
            this.q.i = new e.b() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4595d1404635b42b2284774caa276d23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4595d1404635b42b2284774caa276d23");
                        return;
                    }
                    com.sankuai.waimai.store.manager.user.a.a(SGDetailNormalActionBarBlock.this.l(), new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c9ea439aeb7656dbab260d99dd4262b5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c9ea439aeb7656dbab260d99dd4262b5");
                            } else {
                                g.a(SGDetailNormalActionBarBlock.this.l(), 103);
                            }
                        }
                    });
                    com.sankuai.waimai.store.manager.judas.b.a(SGDetailNormalActionBarBlock.this.l(), "b_waimai_sg_duezw0z4_mc").a("poi_id", Long.valueOf(SGDetailNormalActionBarBlock.this.j.b())).a("spu_id", Long.valueOf(SGDetailNormalActionBarBlock.this.j.c())).a();
                }

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void a(int i, int i2, boolean z, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa594ba23e3372a719aceae8b4cb6488", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa594ba23e3372a719aceae8b4cb6488");
                    } else {
                        SGDetailNormalActionBarBlock.this.j.h();
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "101315031a864fc1d576ad90076cdacb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "101315031a864fc1d576ad90076cdacb");
                    } else {
                        SGDetailNormalActionBarBlock.this.r();
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.e.b, com.sankuai.waimai.store.viewblocks.e.a
                public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                    Object[] objArr3 = {Integer.valueOf(i), list, sparseArray};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69cf04150de4fe244a8b8b1fc3d00db2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69cf04150de4fe244a8b8b1fc3d00db2");
                        return;
                    }
                    for (Integer num : list) {
                        if (num != null && num.intValue() == 9) {
                            com.sankuai.waimai.store.manager.judas.b.b(SGDetailNormalActionBarBlock.this.l(), "b_waimai_fsiyqesv_mv").a("poi_id", Long.valueOf(SGDetailNormalActionBarBlock.this.j.b())).a("spu_id", Long.valueOf(SGDetailNormalActionBarBlock.this.j.c())).a("sku_id", SGDetailNormalActionBarBlock.this.j.e()).a("stid", SGDetailNormalActionBarBlock.this.j.d()).a();
                        }
                    }
                }
            };
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "373dbbca46c75aec48c6b8b5accdced8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "373dbbca46c75aec48c6b8b5accdced8");
                    } else {
                        SGDetailNormalActionBarBlock.a(SGDetailNormalActionBarBlock.this);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, String str, String str2, String str3) {
        Object[] objArr = {aVar, goodsSpu, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a814b34b3780202692becbeb09ccd9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a814b34b3780202692becbeb09ccd9f");
            return;
        }
        super.a(aVar, goodsSpu, str, str2, str3);
        Object[] objArr2 = {aVar, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c46a18af0ff2fda89cfaf7f445ad7f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c46a18af0ff2fda89cfaf7f445ad7f0");
        } else if (aVar == null || aVar.b == null || !aVar.b.storeImNewStyle() || !aVar.B() || l() == null) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
            final SCPageConfig a = SCPageConfig.a(2, 22, l().b(), goodsSpu == null ? 0L : goodsSpu.id);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1eb42c415cde8d5567cb4eed5d1711fc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1eb42c415cde8d5567cb4eed5d1711fc");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(SGDetailNormalActionBarBlock.this.l(), "b_waimai_37p63y8a_mc").a("poi_id", aVar.d()).a();
                    com.sankuai.waimai.store.shopping.cart.util.d.a(SGDetailNormalActionBarBlock.this.l(), aVar, a, SGDetailNormalActionBarBlock.this.l().w());
                }
            });
        }
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = k;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "734258a1ed9323d636bfeed68d9d08cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "734258a1ed9323d636bfeed68d9d08cc");
            return;
        }
        if (this.h != null && aVar != null && aVar.b != null && aVar.b.storeImNewStyle()) {
            this.h.setVisibility(8);
        }
        if (this.o == 9) {
            u.c(this.h);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bcae9f1defe990bbb1229e2476903cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bcae9f1defe990bbb1229e2476903cf");
            return;
        }
        super.a(getMenuResponse);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) getMenuResponse.menuInfoArrayList)) {
            u.a((View) this.p, 0);
        } else {
            u.a((View) this.p, 8);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c496d4f238dfb48e77547a1029f6547", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c496d4f238dfb48e77547a1029f6547")).intValue() : (i - h.a(l(), 45.0f)) - i().getHeight();
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2858c2c7e67611d237472ac5827d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2858c2c7e67611d237472ac5827d83");
            return;
        }
        this.m.setAlpha(f);
        this.l.i().setAlpha(f);
        i().setClickable(!com.sankuai.waimai.store.util.g.a(f, 0.0f));
        this.l.a(!com.sankuai.waimai.store.util.g.a(f, 0.0f));
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final SCActionbarItemView s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8dfb52104e16c53ee841bd588ef443", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCActionbarItemView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8dfb52104e16c53ee841bd588ef443");
        }
        if (this.o == 9) {
            return null;
        }
        return (SCActionbarItemView) a(R.id.actionbar_message_center);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final ImageView t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b65d9e914d85508bea71596f856792", RobustBitConfig.DEFAULT_VALUE) ? (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b65d9e914d85508bea71596f856792") : (ImageView) a(R.id.iv_global_cart_icon);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final ImageView u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf22f959a5e895bb2a06f50d9dea3f91", RobustBitConfig.DEFAULT_VALUE) ? (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf22f959a5e895bb2a06f50d9dea3f91") : (ImageView) a(R.id.img_back);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113883b20efc355307094b67c286b297", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113883b20efc355307094b67c286b297")).intValue() : i().getHeight() + i + l().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_negative_2);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b, com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.b
    public final int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdcd6f9ffeb0c9e3f341bcbed5077b21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdcd6f9ffeb0c9e3f341bcbed5077b21")).intValue();
        }
        if (this.o == 10) {
            return super.v();
        }
        if (this.p == null) {
            return 0;
        }
        return this.p.b() ? 1 : 0;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf0ffab9f44a4a190757d3b93d247e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf0ffab9f44a4a190757d3b93d247e0");
            return;
        }
        super.c(i);
        if (this.q != null) {
            this.q.a(i);
        }
        if (this.p == null) {
            return;
        }
        if (i <= 0) {
            this.p.a();
        } else if (i <= 99) {
            this.p.a(String.valueOf(i));
        } else {
            this.p.a("99+");
        }
    }
}
