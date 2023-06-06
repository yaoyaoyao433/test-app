package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseHandPriceView extends FrameLayout implements g {
    public static ChangeQuickRedirect a;
    protected TextView b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected ImageView f;
    protected HandPriceWithUnit g;
    protected ToBeMemberPrice h;
    protected int i;
    protected int j;
    protected int k;
    private f l;
    private f m;
    private d n;
    private boolean o;

    public int getLayoutId() {
        return -1;
    }

    public BaseHandPriceView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c8b31a6890dc996dfb371076842479", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c8b31a6890dc996dfb371076842479");
        }
    }

    private BaseHandPriceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567fdd907392b4bf7aaee62e0190e59b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567fdd907392b4bf7aaee62e0190e59b");
        }
    }

    public BaseHandPriceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1285456213f8aca1cb9ea627089c6d65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1285456213f8aca1cb9ea627089c6d65");
            return;
        }
        this.o = true;
        a();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e364b20f33e203e15f8ab3c685180d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e364b20f33e203e15f8ab3c685180d3");
            return;
        }
        z.a(getContext(), getLayoutId(), this, true);
        this.l = new e(this);
        this.m = new a(this);
        this.b = (TextView) findViewById(R.id.current_price);
        this.c = (TextView) findViewById(R.id.current_price_symbol);
        this.d = (TextView) findViewById(R.id.current_price_unit);
        this.g = (HandPriceWithUnit) findViewById(R.id.hand_price_with_unit);
        this.e = (TextView) findViewById(R.id.origin_price);
        this.f = (ImageView) findViewById(R.id.member_price_icon);
        this.j = ColorUtils.a("#BCBCBD", -3355444);
        this.k = ColorUtils.a("#FF4A26", (int) SupportMenu.CATEGORY_MASK);
        this.i = ColorUtils.a("#BCBCBD", -3355444);
    }

    public void setData(HandPriceModel handPriceModel) {
        Object[] objArr = {handPriceModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce407b84e7a756189afdec6c62d0fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce407b84e7a756189afdec6c62d0fee");
        } else if (handPriceModel == null) {
        } else {
            if (handPriceModel.isEnhancePriceStyle()) {
                this.m.a(handPriceModel);
            } else {
                this.l.a(handPriceModel);
            }
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9ea8dc55774ef62e60131a8c54a70f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9ea8dc55774ef62e60131a8c54a70f");
            return;
        }
        u.a(this.b, this.c);
        u.a(this.b, i.a(d));
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5958fc55ae70b72af9d8efc79c9e35c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5958fc55ae70b72af9d8efc79c9e35c9");
            return;
        }
        u.a(this.b, this.c);
        u.a(this.b, str);
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679fa455364aaeed091bfac96762ba1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679fa455364aaeed091bfac96762ba1c");
        } else {
            u.c(this.b, this.c);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174d503ca14c5cfe04973e69ab2af73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174d503ca14c5cfe04973e69ab2af73a");
        } else {
            u.c(this.d);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1d6ba92785fd122ee1cd2365b1ee8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1d6ba92785fd122ee1cd2365b1ee8d");
        } else if (TextUtils.isEmpty(str)) {
            c();
        } else {
            u.a(this.d);
            this.d.setTextColor(i);
            u.a(this.d, str);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426179b67b7991c00e3116cce441d762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426179b67b7991c00e3116cce441d762");
            return;
        }
        u.a(this.e);
        u.a(this.e, getContext().getString(R.string.wm_sg_common_origin_price, i.a(d)));
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99b41af95676eb7c4f488b63c0e014a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99b41af95676eb7c4f488b63c0e014a9");
            return;
        }
        u.a(this.e);
        u.a(this.e, getContext().getString(R.string.wm_sg_common_origin_price, str));
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba36393e811b8185e2b639db5986e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba36393e811b8185e2b639db5986e6b");
        } else {
            u.c(this.e);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void a(HandPriceInfo handPriceInfo, boolean z) {
        Object[] objArr = {handPriceInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3196812a3c7d749f50dfd03426cd500d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3196812a3c7d749f50dfd03426cd500d");
            return;
        }
        u.a(this.g);
        this.g.a(handPriceInfo, z);
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce4b69e678f36d9deb63097b77515ee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce4b69e678f36d9deb63097b77515ee4");
        } else {
            u.c(this.g);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9117c73c079a070dea12811693da7557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9117c73c079a070dea12811693da7557");
            return;
        }
        u.a(this.f);
        b.C0608b b = m.b(str, ImageQualityUtil.a());
        b.e = 0;
        b.a(this.f);
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ce2ccb1f9a952df7fb3ef5846ca37c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ce2ccb1f9a952df7fb3ef5846ca37c");
        } else {
            u.a(this.f);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c39d129379a3b188abdb600aae531a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c39d129379a3b188abdb600aae531a");
        } else {
            u.c(this.f);
        }
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final boolean h() {
        return this.o;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public int getSingleSpecGrayTextColor() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public int getMultiSpecGrayTextColor() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.g
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f2ae5fa4934830fe55e9f7b0cd4c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f2ae5fa4934830fe55e9f7b0cd4c0c");
            return;
        }
        switch (this.n) {
            case FONT_STYLE_32:
                a(this.c, 11, this.k);
                a(this.b, 16, this.k);
                a(this.d, 10, -1);
                a(this.e, 11, this.j);
                return;
            case FONT_STYLE_36:
                a(this.c, 12, this.k);
                a(this.b, 18, this.k);
                a(this.d, 11, -1);
                a(this.e, 12, this.j);
                return;
            case FONT_STYLE_40:
                a(this.c, 14, this.k);
                a(this.b, 20, this.k);
                a(this.d, 13, -1);
                a(this.e, 14, this.j);
                return;
            case FONT_STYLE_48:
                a(this.c, 14, this.k);
                a(this.b, 24, this.k);
                a(this.d, 13, -1);
                a(this.e, 14, this.j);
                return;
            case FONT_STYLE_DETAIL:
                a(this.c, 11, this.k);
                a(this.b, 24, this.k);
                a(this.d, 10, -1);
                a(this.e, 11, this.j);
                return;
            default:
                a(this.c, 11, this.k);
                a(this.b, 14, this.k);
                a(this.d, 10, -1);
                a(this.e, 11, this.j);
                return;
        }
    }

    private void a(TextView textView, int i, int i2) {
        Object[] objArr = {textView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a818841e26343be78dc1cb89d0970f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a818841e26343be78dc1cb89d0970f");
        } else if (p.a(textView)) {
            u.c(textView);
        } else {
            if (i2 != -1) {
                textView.setTextColor(i2);
            }
            textView.setTextSize(i);
        }
    }

    public void setAddGoodsNeedHideHandPrice(boolean z) {
        this.o = z;
    }

    public void setFontStyle(d dVar) {
        this.n = dVar;
    }

    public View getHandPriceLabelView() {
        return this.g;
    }
}
