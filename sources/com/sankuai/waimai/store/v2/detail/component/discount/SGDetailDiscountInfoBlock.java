package com.sankuai.waimai.store.v2.detail.component.discount;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsPromotion;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.SGDetailCountDownView;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGDetailDiscountInfoBlock extends j {
    public static ChangeQuickRedirect g;
    protected TextView h;
    protected TextView i;
    protected TextView j;
    protected SGDetailCountDownView k;
    protected GoodsPromotion l;
    protected long m;
    protected TextView n;

    public void s() {
    }

    public void u() {
    }

    @Override // com.meituan.android.cube.core.f
    public View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a77a0f1d8cb35bbba607e188d445402", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a77a0f1d8cb35bbba607e188d445402") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_discount_bar, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04381ab1dff4ca56daca82a3e48272f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04381ab1dff4ca56daca82a3e48272f6");
            return;
        }
        super.a_(view);
        this.h = (TextView) a(R.id.txt_promotion_title);
        this.i = (TextView) a(R.id.txt_promotion_info);
        this.j = (TextView) a(R.id.promotion_deadline_day);
        this.k = (SGDetailCountDownView) a(R.id.promotion_countdown_view);
        this.n = (TextView) a(R.id.limited_time_spiked_stop);
    }

    public final void a(GoodsPromotion goodsPromotion, int i) {
        Object[] objArr = {goodsPromotion, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f849f0ae04ddc0280e26ea11cacef34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f849f0ae04ddc0280e26ea11cacef34");
            return;
        }
        this.l = goodsPromotion;
        if (!a.a(this.l)) {
            if (i == 100 && this.l.promotionBgStyleType == 1 && !t.a(this.l.promotionBgUrl)) {
                u.a(i(), 0);
                u.c(this.k);
                b(this.l.promotionBgUrl);
                return;
            }
            u.a(i(), 8);
            return;
        }
        u.a(i(), 0);
        u.a(this.h, goodsPromotion.activityTypeText);
        u.a(this.i, goodsPromotion.promotionTxt);
        this.i.setBackground(new e.a().a(h.a(m(), 4.0f)).c(d.a(this.l.countDownBgColor, com.sankuai.waimai.store.util.b.b(l(), R.color.wm_sg_color_FFFFFF))).a());
        b(goodsPromotion.promotionBgUrl);
        View i2 = i();
        int i3 = goodsPromotion.countDownMarginRight;
        Object[] objArr2 = {i2, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "873a25455a9ea8b80b283fff53421948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "873a25455a9ea8b80b283fff53421948");
        } else {
            i2.setPadding(i2.getPaddingLeft(), i2.getPaddingTop(), l().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12) + h.a(l(), i3), i2.getPaddingBottom());
        }
        TextView textView = this.i;
        String str = goodsPromotion.promotionTextColor;
        Object[] objArr3 = {textView, str};
        ChangeQuickRedirect changeQuickRedirect3 = g;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "429ea2fead223fd465d6e7487f68ac1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "429ea2fead223fd465d6e7487f68ac1a");
        } else {
            textView.setTextColor(d.a(str, com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sg_color_FF5231)));
        }
        a((this.l.activityDeadline - this.l.currentTime) - this.m, this.l.countDownDisplayDay);
    }

    private void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfad6a46bedd77a3b9d36dd69bb3ff13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfad6a46bedd77a3b9d36dd69bb3ff13");
            return;
        }
        long j2 = 1000 * j;
        if (j > 0) {
            s();
            t();
            long j3 = (j / 3600) / 24;
            if (i == 0) {
                i = 10;
            }
            if (j3 >= i) {
                u.a((View) this.j, 8);
                u.a((View) this.k, 8);
                u();
            } else if (j3 > 0) {
                u.a(this.j, com.sankuai.waimai.store.util.b.a(m(), R.string.wm_sg_good_detail_discount_up_to_days, String.valueOf(j3)));
                u.a((View) this.k, 0);
            } else {
                u.a(this.j, com.sankuai.waimai.store.util.b.a(m(), (int) R.string.wm_sg_good_detail_discount_up_to_end));
                u.a((View) this.k, 0);
            }
        } else {
            r();
        }
        this.k.a(j2);
    }

    public void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d908fd56325dd4b382682e273093c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d908fd56325dd4b382682e273093c8");
            return;
        }
        u.c(this.j);
        u.a(this.n);
        int color = m().getResources().getColor(R.color.wm_sg_color_BFBEBE);
        int color2 = m().getResources().getColor(R.color.wm_sg_color_FFFFFF);
        int color3 = m().getResources().getColor(R.color.wm_sg_color_FFFFFF);
        u.a((View) this.k, 0);
        this.k.a(color, color2, color3);
        u.a(this.n, com.sankuai.waimai.store.util.b.a(m(), (int) R.string.wm_sg_good_detail_discount_finished));
    }

    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66386c001b3108972fadf664208b45f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66386c001b3108972fadf664208b45f1");
            return;
        }
        u.c(this.j, this.n);
        this.k.a(d.a(this.l.countDownBgColor, com.sankuai.waimai.store.util.b.b(l(), R.color.wm_sg_color_FFE7D0)), d.a(this.l.countDownTextColor, com.sankuai.waimai.store.util.b.b(l(), R.color.wm_sg_color_FC5E35)), m().getResources().getColor(R.color.wm_sg_color_FFFFFF));
    }

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256516a948c981b190e6f3b188a7df78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256516a948c981b190e6f3b188a7df78");
            return;
        }
        final View i = i();
        i.setVisibility(8);
        if (t.a(str)) {
            str = "http://p0.meituan.net/scarlett/6e4ba6e28298497a47a350cfc0764d214761.png";
        }
        m.b(str).a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
            public final void a(Drawable drawable) {
                Object[] objArr2 = {drawable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "215197c426891d6abd99839089b89832", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "215197c426891d6abd99839089b89832");
                } else if (com.sankuai.waimai.store.util.b.a(SGDetailDiscountInfoBlock.this.l()) || drawable == null) {
                } else {
                    int minimumWidth = drawable.getMinimumWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int a2 = (minimumWidth <= 0 || intrinsicHeight <= 0) ? 0 : (h.a((Context) SGDetailDiscountInfoBlock.this.l()) * intrinsicHeight) / minimumWidth;
                    if (SGDetailDiscountInfoBlock.this.l != null && SGDetailDiscountInfoBlock.this.l.promotionBgStyleType == 1 && SGDetailDiscountInfoBlock.this.l.promotionBgHeight > 0) {
                        a2 = h.a(SGDetailDiscountInfoBlock.this.m(), SGDetailDiscountInfoBlock.this.l.promotionBgHeight);
                    }
                    ViewGroup.LayoutParams layoutParams = i.getLayoutParams();
                    if (layoutParams != null) {
                        if (a2 <= 0) {
                            a2 = SGDetailDiscountInfoBlock.this.l().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                        }
                        layoutParams.height = a2;
                        i.setLayoutParams(layoutParams);
                    }
                    i.setBackground(drawable);
                    i.setVisibility(0);
                }
            }

            @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "324ead351d03ec8279c61ed82878c403", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "324ead351d03ec8279c61ed82878c403");
                } else if (com.sankuai.waimai.store.util.b.a(SGDetailDiscountInfoBlock.this.l())) {
                } else {
                    ViewGroup.LayoutParams layoutParams = i.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = SGDetailDiscountInfoBlock.this.l().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_36);
                        i.setLayoutParams(layoutParams);
                    }
                    SGDetailDiscountInfoBlock.this.a(i, true, -1, 0);
                }
            }
        });
    }

    public final void a(View view, boolean z, int i, int i2) {
        Object[] objArr = {view, (byte) 1, -1, 0};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a501ca7898bd22ece11d54881fdb10e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a501ca7898bd22ece11d54881fdb10e");
            return;
        }
        e.a a = new e.a().a(0.0f);
        a.a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.sankuai.waimai.store.util.b.b(m(), R.color.wm_st_common_FF7040), com.sankuai.waimai.store.util.b.b(m(), R.color.wm_st_common_FC5E35)});
        view.setBackground(a.a());
        view.setVisibility(0);
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafe8e8107dcb4c6ed4fd9c11795c3e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafe8e8107dcb4c6ed4fd9c11795c3e1");
            return;
        }
        this.m = j;
        if (this.l == null) {
            return;
        }
        a((this.l.activityDeadline - this.l.currentTime) - this.m, this.l.countDownDisplayDay);
    }
}
