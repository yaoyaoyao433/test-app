package com.sankuai.waimai.business.restaurant.base.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.stepper.RooStepper;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.c;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.q;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.goods.PoiFoodTag;
import com.sankuai.waimai.platform.widget.HorizontalFlowLayout;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements e {
    public static ChangeQuickRedirect a;
    private final ViewGroup A;
    private final TextView B;
    private final ImageView C;
    private final TextView D;
    private final ImageView E;
    private HorizontalFlowLayout F;
    private final HorizontalFlowLayout G;
    private ImageView H;
    private final Drawable I;
    private final Drawable J;
    private final int K;
    private final int L;
    private c.a M;
    private TextView N;
    private TextView O;
    private int P;
    private View Q;
    private TextView R;
    private TextView S;
    private TextView T;
    private LinearLayout U;
    private d V;
    private int W;
    private int X;
    private com.sankuai.waimai.business.restaurant.base.widget.c Y;
    private boolean Z;
    final Context b;
    final TextView c;
    private final FrameLayout d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final LinearLayout m;
    private final ViewGroup n;
    private final TextView o;
    private final TextView p;
    private final ViewGroup q;
    private final ImageView r;
    private final TextView s;
    private final TextView t;
    private final TextView u;
    private final ImageView v;
    private final TextView w;
    private final TextView x;
    private final RooStepper y;
    private final TextView z;

    public c(@NonNull Context context, ViewGroup viewGroup, c.a aVar) {
        Object[] objArr = {context, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e861b0d84b9fef10486691ecef69360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e861b0d84b9fef10486691ecef69360");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_restaurant_market_adapter_goods_new, viewGroup, true);
        this.b = context;
        this.M = aVar;
        this.Q = inflate;
        this.d = (FrameLayout) inflate.findViewById(R.id.ll_stickyfoodList_adapter_food_food);
        this.e = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_name);
        this.f = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_price);
        new q().a(this.f);
        this.X = ColorUtils.a("#F5F5F6").intValue();
        this.W = ColorUtils.a("#222426").intValue();
        this.g = (TextView) inflate.findViewById(R.id.txt_stickyfood_price_postfix);
        this.h = (TextView) inflate.findViewById(R.id.tv_stickyfood_sold_count);
        this.i = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_original_price);
        this.j = (ImageView) inflate.findViewById(R.id.img_stickydish_pic);
        this.k = (TextView) inflate.findViewById(R.id.txt_stickydish_desc);
        this.l = (TextView) inflate.findViewById(R.id.tv_stickyfood_praise_num);
        this.w = (TextView) inflate.findViewById(R.id.tv_stickyfood_net_friend_recommend_or_praise);
        this.m = (LinearLayout) inflate.findViewById(R.id.ll_promotion_info);
        this.n = (ViewGroup) inflate.findViewById(R.id.ll_full_discount_tag);
        this.o = (TextView) inflate.findViewById(R.id.txt_promotion_info);
        this.p = (TextView) inflate.findViewById(R.id.txt_restrict);
        this.q = (ViewGroup) inflate.findViewById(R.id.ll_poi_vip_spu_price);
        this.r = (ImageView) inflate.findViewById(R.id.img_poi_vip_spu_price);
        this.s = (TextView) inflate.findViewById(R.id.txt_poi_vip_spu_price);
        this.t = (TextView) inflate.findViewById(R.id.txt_activity);
        this.u = (TextView) inflate.findViewById(R.id.txt_activity_addition);
        this.v = (ImageView) inflate.findViewById(R.id.img_big_promotion);
        this.x = (TextView) inflate.findViewById(R.id.txt_stickyfood_status_cant_sale);
        this.y = (RooStepper) inflate.findViewById(R.id.roo_stepper);
        this.A = (ViewGroup) inflate.findViewById(R.id.fl_choose_sku_hot_zone);
        this.z = (TextView) inflate.findViewById(R.id.btn_choose_sku);
        this.B = (TextView) inflate.findViewById(R.id.txt_skufood_count);
        this.C = (ImageView) inflate.findViewById(R.id.img_video_icon);
        this.D = (TextView) inflate.findViewById(R.id.txt_stickyfood_recommend_count);
        this.E = (ImageView) inflate.findViewById(R.id.image_boss_recommend_content);
        this.c = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_package_product);
        this.G = (HorizontalFlowLayout) inflate.findViewById(R.id.layout_food_dna_tag);
        this.H = (ImageView) inflate.findViewById(R.id.image_new_sign_tag);
        this.L = this.b.getResources().getDimensionPixelSize(R.dimen.wm_restaurant_goods_package_txt_left);
        this.I = this.b.getResources().getDrawable(R.drawable.wm_restaurant_market_ic_package_product_add_fix);
        this.I.setBounds(0, 0, this.I.getMinimumWidth(), this.I.getMinimumHeight());
        this.J = a(this.b.getResources().getDrawable(R.drawable.wm_restaurant_market_ic_package_product_default));
        this.K = this.b.getResources().getDimensionPixelSize(R.dimen.wm_restaurant_goods_dna_one_spicy_image_width);
        this.N = (TextView) inflate.findViewById(R.id.tv_coupon_price_hint);
        this.O = (TextView) inflate.findViewById(R.id.tv_coupon_price_tag);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.restaurant.cdn.a.a;
        this.P = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "05a84cb3ce39cc5474c2f69ba7736444", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "05a84cb3ce39cc5474c2f69ba7736444")).intValue() : com.sankuai.waimai.platform.restaurant.cdn.a.a().b;
        this.R = (TextView) inflate.findViewById(R.id.tv_goods_weight);
        this.S = (TextView) inflate.findViewById(R.id.tv_goods_weight_decision);
        this.T = (TextView) inflate.findViewById(R.id.tv_goods_stock_tip);
        this.U = (LinearLayout) inflate.findViewById(R.id.layout_package_container);
        this.V = new d(context, this.U);
        this.F = (HorizontalFlowLayout) inflate.findViewById(R.id.layout_food_decision_tag_list);
        this.Y = new com.sankuai.waimai.business.restaurant.base.widget.c(com.sankuai.waimai.foundation.utils.g.a(this.b, 16.0f), this.X, com.sankuai.waimai.foundation.utils.g.a(this.b, 4.0f), this.W, com.sankuai.waimai.foundation.utils.g.a(this.b, 11.0f), com.sankuai.waimai.foundation.utils.g.a(this.b, 4.0f), 0, com.sankuai.waimai.foundation.utils.g.a(this.b, 4.0f));
    }

    Drawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be25445317be8f899acc902fa650f2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be25445317be8f899acc902fa650f2f");
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(this.b, 26.0f);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(this.b, 15.0f);
        drawable.setBounds(0, 0, a2, a3);
        InsetDrawable insetDrawable = new InsetDrawable(drawable, 0, 0, this.L, 0);
        insetDrawable.setBounds(0, 0, a2 + this.L, a3);
        return insetDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0e94  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0e9c  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0fa1  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0fce  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x105c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0320  */
    /* JADX WARN: Type inference failed for: r0v65, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v74, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v80, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v82, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v87, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.view.View$OnClickListener, java.lang.Object, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    @Override // com.sankuai.waimai.business.restaurant.base.ui.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final com.sankuai.waimai.platform.domain.core.goods.GoodsSpu r39, boolean r40, com.sankuai.waimai.business.restaurant.base.manager.order.g r41, int r42, com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 4224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.ui.c.a(com.sankuai.waimai.platform.domain.core.goods.GoodsSpu, boolean, com.sankuai.waimai.business.restaurant.base.manager.order.g, int, com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a$a, boolean):void");
    }

    private void a(List<String> list, SpannableStringBuilder spannableStringBuilder) {
        Object[] objArr = {list, spannableStringBuilder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd9b8f15507132f026e70b0c9e23c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd9b8f15507132f026e70b0c9e23c0a");
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            spannableStringBuilder.append((CharSequence) list.get(i));
            if (i == size - 1) {
                return;
            }
            a(spannableStringBuilder, StringUtil.SPACE, new com.sankuai.waimai.business.restaurant.base.widget.a(this.I, 1), 33);
        }
    }

    private void a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, Object obj, int i) {
        Object[] objArr = {spannableStringBuilder, charSequence, obj, 33};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289062fad06c9dbb06c4c2cba7be3efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289062fad06c9dbb06c4c2cba7be3efe");
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.sankuai.waimai.platform.domain.core.goods.GoodsSpu r25) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.ui.c.a(com.sankuai.waimai.platform.domain.core.goods.GoodsSpu):boolean");
    }

    private void b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14caa4b5b9ec58aee71ecd70d9de34c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14caa4b5b9ec58aee71ecd70d9de34c");
            return;
        }
        List<PoiFoodTag> list = goodsSpu.foodTags;
        this.F.setVisibility(0);
        this.F.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            View a2 = com.sankuai.waimai.business.restaurant.poicontainer.helper.c.a(list.get(i), this.b, false);
            if (a2 != null) {
                this.F.addView(a2);
            }
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.ui.e
    public final View a() {
        return this.y;
    }
}
