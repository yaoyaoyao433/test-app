package com.sankuai.waimai.store.v2.detail.component.discount;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsPromotion;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.v2.detail.component.pricebar.SGDetailB2CPriceBarBlock;
import com.sankuai.waimai.store.widgets.SGDetailCountDownView;
/* compiled from: ProGuard */
@Cube(children = {SGDetailB2CPriceBarBlock.class})
/* loaded from: classes5.dex */
public class SGDetailB2CDiscountInfoBlock extends j {
    public static ChangeQuickRedirect g;
    protected TextView h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    protected SGDetailCountDownView l;
    protected GoodsPromotion m;
    protected long n;
    protected TextView o;
    protected com.sankuai.waimai.store.platform.domain.manager.poi.a p;
    private GoodsSpu q;
    private View r;
    private SGDetailB2CPriceBarBlock s;
    private com.sankuai.waimai.store.expose.v2.entity.b t;
    private String u;

    public SGDetailB2CDiscountInfoBlock(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f147c075b24b3975fa070742fcb808cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f147c075b24b3975fa070742fcb808cf");
        } else {
            this.p = aVar;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b16f9bd28a8103e1165bd1fe47288a5d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b16f9bd28a8103e1165bd1fe47288a5d") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_discount_bar_b2c, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb0df3ac1e175c623d41a505bd4ae16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb0df3ac1e175c623d41a505bd4ae16");
            return;
        }
        super.a_(view);
        this.h = (TextView) a(R.id.txt_promotion_title);
        this.i = (TextView) a(R.id.txt_promotion_info);
        this.j = (TextView) a(R.id.promotion_deadline_day);
        this.k = (TextView) a(R.id.promotion_deadline_day_title);
        this.l = (SGDetailCountDownView) a(R.id.promotion_countdown_view);
        this.o = (TextView) a(R.id.limited_time_spiked_stop);
        this.r = a(R.id.promotion_deadline_layout);
        this.s = (SGDetailB2CPriceBarBlock) b(R.id.discount_ll_detail_price_info, (int) new SGDetailB2CPriceBarBlock(this.p, true));
        View i = i();
        Object[] objArr2 = {i, (byte) 1, -1, 0};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6cf7968f496b7882e8aba76815fbe7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6cf7968f496b7882e8aba76815fbe7e");
        } else {
            e.a a = new e.a().a(0.0f);
            a.a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_F75227), com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_FF7040)});
            i.setBackground(a.a());
        }
        this.i.setBackground(new e.a().a(h.a(m(), 15.0f)).b(h.a(m(), 1.0f)).a(com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_FFFFFF)).a());
        this.l.setTimerTextSize(11);
    }

    private void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a7f438aee689c9843b6ec4bb72e7eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a7f438aee689c9843b6ec4bb72e7eb");
            return;
        }
        long j3 = 1000 * j;
        if (j > 0) {
            s();
            long j4 = (j / 3600) / 24;
            if (j4 >= 10) {
                u.a((View) this.j, 8);
                u.a((View) this.k, 8);
                u.a((View) this.l, 8);
                t();
            } else {
                u.a(this.k, com.sankuai.waimai.store.util.b.a(m(), (int) R.string.wm_sg_good_detail_discount_up_to_end_b2c));
                if (j4 > 0) {
                    TextView textView = this.j;
                    u.a(textView, j4 + "天");
                } else {
                    u.a((View) this.j, 8);
                }
                u.a((View) this.l, 0);
            }
        } else {
            r();
        }
        this.l.a(j3);
    }

    public final void a(GoodsSpu goodsSpu, String str) {
        Object[] objArr = {goodsSpu, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d877abdc19128015eb7c1fb98d9deee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d877abdc19128015eb7c1fb98d9deee");
        } else if (!a.a(goodsSpu.promotion)) {
            j();
        } else {
            this.q = goodsSpu;
            this.u = str;
            k();
            if (this.s != null) {
                this.s.a(goodsSpu);
            }
            GoodsPromotion goodsPromotion = goodsSpu.promotion;
            Object[] objArr2 = {goodsPromotion};
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a33bf4e3b405ad61ec0e76b2a7d5de3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a33bf4e3b405ad61ec0e76b2a7d5de3");
            } else {
                this.m = goodsPromotion;
                u.a(this.h, goodsPromotion.activityTypeText);
                u.a(this.i, goodsPromotion.promotionTxt);
                a((this.m.activityDeadline - this.m.currentTime) - this.n, this.m.activityDeadline);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = g;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef581ebd4bfa6b4554f69234f000fe1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef581ebd4bfa6b4554f69234f000fe1f");
                return;
            }
            if (this.t == null) {
                this.t = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_dtnoqqs9_mv", i(), "b_waimai_dtnoqqs9_mv");
            }
            this.t.a("poi_id", this.p.d());
            this.t.a("spu_id", Long.valueOf(this.q != null ? this.q.id : -999L));
            this.t.a("stid", TextUtils.isEmpty(this.u) ? "-999" : this.u);
            com.sankuai.waimai.store.expose.v2.b.a().a(l(), this.t);
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdaea429ce6abea88ccc25ed88b8b8de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdaea429ce6abea88ccc25ed88b8b8de");
            return;
        }
        u.c(this.k);
        u.c(this.j);
        u.a(this.o);
        int color = m().getResources().getColor(R.color.wm_sg_color_BFBEBE);
        int color2 = m().getResources().getColor(R.color.wm_sg_color_FFFFFF);
        int color3 = m().getResources().getColor(R.color.wm_sg_color_FFFFFF);
        u.a((View) this.l, 0);
        this.l.a(color, color2, color3);
        u.a(this.o, com.sankuai.waimai.store.util.b.a(m(), (int) R.string.wm_sg_good_detail_discount_finished));
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c650388c0e41aa4a9c7e07309ee83a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c650388c0e41aa4a9c7e07309ee83a");
            return;
        }
        u.c(this.j, this.o);
        this.l.a(m().getResources().getColor(R.color.wm_sg_color_FB5D34), m().getResources().getColor(R.color.wm_sg_color_FFFFFF), m().getResources().getColor(R.color.wm_sg_color_FB5D34));
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169c54e4660e3b11c07a5a4125a2f111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169c54e4660e3b11c07a5a4125a2f111");
        } else {
            u.c(this.r);
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5710477cf7b21f2990bde17ffa2f8835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5710477cf7b21f2990bde17ffa2f8835");
            return;
        }
        this.n = j;
        if (this.m == null) {
            return;
        }
        a((this.m.activityDeadline - this.m.currentTime) - this.n, this.m.activityDeadline);
    }
}
