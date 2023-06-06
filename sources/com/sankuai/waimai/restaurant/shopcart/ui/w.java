package com.sankuai.waimai.restaurant.shopcart.ui;

import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartPrice;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class w {
    public static ChangeQuickRedirect a;
    View A;
    View B;
    TextView C;
    TextView D;
    LinearLayout E;
    RooIconFont F;
    boolean G;
    com.sankuai.waimai.restaurant.shopcart.ui.b H;
    b I;
    private boolean J;
    private boolean K;
    protected final com.sankuai.waimai.business.restaurant.base.manager.order.g b;
    final String c;
    public TagCanvasView d;
    com.sankuai.waimai.platform.widget.tag.virtualtag.g e;
    public final com.sankuai.waimai.restaurant.shopcart.config.a f;
    View g;
    View h;
    TextView i;
    TextView j;
    TextView k;
    TextView l;
    TextView m;
    TextView n;
    TextView o;
    ImageView p;
    FrameLayout q;
    TextView r;
    View s;
    TextView t;
    TextView u;
    TextView v;
    TextView w;
    RooIconFont x;
    boolean y;
    ViewTreeObserver.OnGlobalLayoutListener z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    public w(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, String str) {
        Object[] objArr = {gVar, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b7849dc2d83b082bfdd79704acc9ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b7849dc2d83b082bfdd79704acc9ae");
            return;
        }
        this.z = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.w.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a463aa54062d82f495eeed3249bf6036", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a463aa54062d82f495eeed3249bf6036");
                    return;
                }
                w wVar = w.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = w.a;
                if (PatchProxy.isSupport(objArr3, wVar, changeQuickRedirect3, false, "7b39ca26fbce266868226e95d448bf04", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, wVar, changeQuickRedirect3, false, "7b39ca26fbce266868226e95d448bf04");
                    return;
                }
                int[] iArr = new int[2];
                wVar.l.getLocationOnScreen(iArr);
                wVar.d.setTranslationX(iArr[0]);
                wVar.d.setTranslationY(iArr[1] - wVar.d.getHeight());
            }
        };
        this.K = true;
        this.G = false;
        this.b = gVar;
        this.f = aVar;
        this.c = str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b265d942411182a1ec908eea92b89110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b265d942411182a1ec908eea92b89110");
            return;
        }
        if (this.F != null) {
            com.meituan.roodesign.widgets.iconfont.b.a(this.F, R.string.wm_c_iconfont_arrow_up_small, R.color.wm_shopcart_discount_detail);
        }
        if (this.H != null) {
            this.H.b();
        }
        this.G = false;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba97ac6f186f6317c9513f6a5f1c4aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba97ac6f186f6317c9513f6a5f1c4aa");
        } else if (this.b.t()) {
            this.q.setVisibility(8);
            this.h.setVisibility(8);
            a(false);
        } else {
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.b.f());
            if (com.sankuai.waimai.business.restaurant.composeorder.a.b && TextUtils.isEmpty(n.D)) {
                this.C.setVisibility(0);
                this.D.setVisibility(0);
            } else {
                this.C.setVisibility(8);
                this.D.setVisibility(8);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14d4ab98c4082a29293829447c61b37e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14d4ab98c4082a29293829447c61b37e")).booleanValue() : com.sankuai.waimai.business.restaurant.base.manager.order.k.a().g(this.b.f())) {
                this.q.setVisibility(8);
                this.h.setVisibility(0);
                double a2 = a(this.b);
                double k = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().k(this.b.f());
                if (!TextUtils.isEmpty(n.e.pricePrefix)) {
                    this.k.setVisibility(0);
                    this.k.setText(n.e.pricePrefix);
                } else {
                    this.k.setVisibility(8);
                }
                this.j.setText(com.sankuai.waimai.foundation.utils.h.a(a2));
                a(true);
                if (!com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(k), Double.valueOf(a2))) {
                    this.l.setText(com.meituan.android.singleton.b.a.getString(R.string.wm_shopcart_shoppingCart_price, com.sankuai.waimai.foundation.utils.h.a(k)));
                    ah.a(this.C, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 4.0f), Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    this.l.setText("");
                    ah.a(this.C, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                if (!com.sankuai.waimai.business.restaurant.poicontainer.b.P() && !TextUtils.isEmpty(n.D)) {
                    this.E.setVisibility(0);
                    if (!this.J) {
                        JudasManualManager.a a3 = JudasManualManager.b("b_waimai_j8hz6gqf_mv").a(f());
                        a3.b = this.c;
                        a3.a();
                    }
                    this.J = true;
                    return;
                }
                this.E.setVisibility(8);
                this.J = false;
                return;
            }
            this.q.setVisibility(0);
            boolean z = this.b.b != null ? this.b.b.f : false;
            this.r = z ? this.u : this.t;
            this.t.setVisibility(z ? 8 : 0);
            this.s.setVisibility(z ? 8 : 0);
            this.u.setVisibility(z ? 0 : 8);
            String i = this.b.i();
            if (this.b.m && !TextUtils.isEmpty(i)) {
                i = i + "，" + com.meituan.android.singleton.b.a.getString(R.string.wm_shopcart_cross_tip);
            }
            if (!TextUtils.isEmpty(this.b.j())) {
                this.r.setTextSize(11.0f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!TextUtils.isEmpty(i)) {
                    spannableStringBuilder.append((CharSequence) i);
                    spannableStringBuilder.append((CharSequence) "  |  ");
                    spannableStringBuilder.setSpan(new a(), i.length(), i.length() + 5, 17);
                }
                spannableStringBuilder.append((CharSequence) this.b.j());
                this.r.setText(spannableStringBuilder);
            } else {
                this.r.setTextSize(11.0f);
                this.r.setText(i);
            }
            if (this.b.k) {
                i = this.b.j();
                if (this.b.p() == 3) {
                    i = "";
                }
                this.r.setTextSize(14.0f);
                this.r.setText(i);
            }
            this.r.setVisibility(TextUtils.isEmpty(i) ? 8 : 0);
            this.h.setVisibility(8);
            a(false);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a484b1a6a793f997b9d17676cdf043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a484b1a6a793f997b9d17676cdf043");
        } else if (this.h.getVisibility() != 0 || !com.sankuai.waimai.restaurant.shopcart.utils.g.a()) {
            this.A.setVisibility(8);
        } else {
            this.A.setVisibility(0);
            int i = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().i(this.b.f());
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("购物车中");
                sb.append(i);
                sb.append("件商品");
            }
            if (this.j.getVisibility() == 0) {
                sb.append(this.j.getText());
                sb.append("元");
            }
            if (this.l.getVisibility() == 0) {
                sb.append("原价");
                sb.append(this.l.getText());
            }
            if (this.m.getVisibility() == 0) {
                sb.append(this.m.getText());
            }
            if (this.n.getVisibility() == 0) {
                sb.append(this.n.getText());
            }
            this.A.setContentDescription(sb.toString());
            if (this.B != null) {
                this.B.post(new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.w.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1663a18a1f8b105cf4781c745c293ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1663a18a1f8b105cf4781c745c293ee");
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w.this.A.getLayoutParams();
                        marginLayoutParams.rightMargin = w.this.B.getWidth();
                        w.this.A.setLayoutParams(marginLayoutParams);
                    }
                });
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a464223833142c5f35af9d40820fd7e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a464223833142c5f35af9d40820fd7e7");
            return;
        }
        double a2 = a(this.b);
        double k = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().k(this.b.f());
        this.j.setText(com.sankuai.waimai.foundation.utils.h.a(a2));
        if (!com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(k), Double.valueOf(a2))) {
            this.l.setText(com.meituan.android.singleton.b.a.getString(R.string.wm_shopcart_shoppingCart_price, com.sankuai.waimai.foundation.utils.h.a(k)));
        } else {
            this.l.setText("");
        }
        a(true);
    }

    public final void e() {
        com.sankuai.waimai.business.restaurant.base.shopcart.b n;
        ShopCartPrice shopCartPrice;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154f1470a9fdf5fccd841f48a27a7907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154f1470a9fdf5fccd841f48a27a7907");
        } else if (this.b.t() || (n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.b.f())) == null || (shopCartPrice = n.e) == null) {
        } else {
            String j = this.b.j();
            if (!TextUtils.isEmpty(this.b.j())) {
                this.o.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "  |  ");
                spannableStringBuilder.setSpan(new a(), 0, 5, 17);
                spannableStringBuilder.append((CharSequence) this.b.j());
                this.o.setText(spannableStringBuilder);
            } else {
                ah.a(this.o, j);
            }
            if (this.b.k) {
                String j2 = this.b.j();
                if (this.b.p() == 3) {
                    j2 = "";
                }
                ah.a(this.o, j2);
                return;
            }
            if (this.b.m) {
                if (this.y) {
                    String str2 = shopCartPrice.crossTip;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = com.meituan.android.singleton.b.a.getString(R.string.wm_dealInfo_submit_2);
                    }
                    ah.a(this.v, str2);
                    this.v.setVisibility(0);
                    this.x.setVisibility(0);
                    this.w.setVisibility(8);
                } else {
                    this.w.setVisibility(0);
                    this.v.setVisibility(8);
                    this.x.setVisibility(8);
                    ah.a(this.w, "，" + com.meituan.android.singleton.b.a.getString(R.string.wm_shopcart_cross_tip));
                }
            } else {
                this.v.setVisibility(8);
                this.x.setVisibility(8);
                this.w.setVisibility(8);
            }
            ah.a(this.n, shopCartPrice.mOriginShippingFeeTxt);
            TextView textView = this.m;
            if (TextUtils.isEmpty(shopCartPrice.mShippingFeeTxt)) {
                str = null;
            } else {
                str = shopCartPrice.mShippingFeeTxt + StringUtil.SPACE;
            }
            ah.a(textView, str);
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9449e05e50f71e2cdf57b720eebef93d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9449e05e50f71e2cdf57b720eebef93d")).booleanValue() : this.j != null && this.j.getVisibility() == 0;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98937e4d3879a1ec3456ea2ffd3430e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98937e4d3879a1ec3456ea2ffd3430e");
        } else if (z && g()) {
            this.d.setVisibility(0);
            com.sankuai.waimai.platform.widget.tag.api.d dVar = null;
            try {
                String str = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.b.f()).s;
                if (!TextUtils.isEmpty(str)) {
                    dVar = (com.sankuai.waimai.platform.widget.tag.api.d) com.sankuai.waimai.foundation.utils.k.a().fromJson(str, (Class<Object>) com.sankuai.waimai.platform.widget.tag.api.d.class);
                }
            } catch (Exception unused) {
            }
            if (dVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                this.e.b(com.sankuai.waimai.platform.widget.tag.util.a.a(com.meituan.android.singleton.b.a, arrayList));
                this.e.notifyChanged();
                return;
            }
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(8);
        }
    }

    public final double a(@Nullable com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "138bfac292e85d3b4b9209f643bec875", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "138bfac292e85d3b4b9209f643bec875")).doubleValue();
        }
        if (gVar == null) {
            return 0.0d;
        }
        return com.sankuai.waimai.business.restaurant.base.manager.order.k.a().m(gVar.f());
    }

    String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f077f82f7c78ef79a7df8b87d7665ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f077f82f7c78ef79a7df8b87d7665ce") : this.f != null ? this.f.b() ? "c_u4fk4kw" : this.f.e() ? "c_1b9anm4" : this.f.d() ? "c_5y4tc0m" : "c_CijEL" : "c_CijEL";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.business.restaurant.base.widget.b {
        public static ChangeQuickRedirect c;

        @Override // com.sankuai.waimai.business.restaurant.base.widget.b
        public final TextPaint a(Paint paint) {
            Object[] objArr = {paint};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57591d3fa0b1358deb53ffb40771f955", RobustBitConfig.DEFAULT_VALUE)) {
                return (TextPaint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57591d3fa0b1358deb53ffb40771f955");
            }
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setColor(869849304);
            textPaint.setTextSize(this.b);
            return textPaint;
        }

        public a() {
            super(com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a, 7.0f));
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee021740856a65b0261d72c7059d3aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee021740856a65b0261d72c7059d3aa");
            }
        }
    }
}
