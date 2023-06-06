package com.sankuai.waimai.store.skuchoose;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodAttrValue;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSpuAttr;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OptimizedPurchaseMultiSkuDialog extends CustomDialog implements e, i, j {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.shopping.cart.a A;
    private com.sankuai.waimai.store.callback.c B;
    public n b;
    public f c;
    @NonNull
    public GoodsSpu d;
    @NonNull
    public com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    public int f;
    private View h;
    private TextView i;
    private final m j;
    private int m;
    private Map<String, Object> n;
    private String o;
    private String p;
    private String q;
    private int r;
    private com.sankuai.waimai.store.param.a s;
    private int t;
    private int u;
    private String v;
    private SGGoodAttrValue[] w;
    private GoodsAttr[] x;
    private com.sankuai.waimai.store.skuchoose.judas.f y;
    private GoodsSku z;

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final GoodsSpu a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final int[] d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d58ffb3b1bff65714676a25a8e2e81", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d58ffb3b1bff65714676a25a8e2e81") : this.j.a(this.d, this.w);
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final int a(SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd412ffcd8a473a959ed2eb55d98fa7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd412ffcd8a473a959ed2eb55d98fa7")).intValue() : this.j.a(sGGoodAttrValue);
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2adf059c098942d65c49d3838779a513", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2adf059c098942d65c49d3838779a513")).booleanValue() : i >= 0 && i < com.sankuai.shangou.stone.util.a.c(this.w) && this.w[i] != null;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bae56a603c260689d26615f53c86a6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bae56a603c260689d26615f53c86a6d")).booleanValue() : k() == -1;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        return this.e;
    }

    private int k() {
        for (int i = 0; i < this.w.length; i++) {
            if (this.w[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final boolean c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ed325e1232e87f59fbbc798872d16a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ed325e1232e87f59fbbc798872d16a")).booleanValue();
        }
        int k = k();
        if (k >= 0) {
            Object[] objArr2 = {Integer.valueOf(k)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45dbdd4132ff79185c103b767b3984c4", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45dbdd4132ff79185c103b767b3984c4");
            } else {
                SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d.spuAttrsList, k);
                str = sGGoodSpuAttr != null ? sGGoodSpuAttr.name : "";
            }
            if (!TextUtils.isEmpty(str)) {
                String string = getContext().getString(R.string.wm_sc_please_choose, str);
                Object[] objArr3 = {string};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12ee5b71e5f0a63639209a597bddd1fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12ee5b71e5f0a63639209a597bddd1fc");
                } else {
                    am.a(this.h, string);
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final boolean a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504265832962a4826311c4862b69aed5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504265832962a4826311c4862b69aed5")).booleanValue() : this.B != null;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final SGGoodAttrValue b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9866e62da40a19f9b1cf1e6af78746e", RobustBitConfig.DEFAULT_VALUE) ? (SGGoodAttrValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9866e62da40a19f9b1cf1e6af78746e") : (SGGoodAttrValue) com.sankuai.shangou.stone.util.a.a(this.w, i);
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final void a(int i, SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {Integer.valueOf(i), sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48fe60e7e652b309e7fefaad20c72b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48fe60e7e652b309e7fefaad20c72b91");
        } else if (i < com.sankuai.shangou.stone.util.a.c(this.w)) {
            this.w[i] = sGGoodAttrValue;
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final List<String> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3efd7fd209ced9c335c41a905210c3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3efd7fd209ced9c335c41a905210c3f");
        }
        if (this.j != null) {
            return this.j.a(this.w);
        }
        return null;
    }

    private GoodsSku l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4405d53330a936754e83924bc4cffc55", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4405d53330a936754e83924bc4cffc55");
        }
        if (this.j != null) {
            this.z = this.j.b(this.d, this.w);
        }
        return this.z;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final void ba_() {
        GoodsAttr[] goodsAttrArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f209b117a41fcfcb35aade2e1a567a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f209b117a41fcfcb35aade2e1a567a0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85a41f715c2cb3b6ffc41a0d0fe798d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85a41f715c2cb3b6ffc41a0d0fe798d7");
        } else if (this.c == null || !f()) {
        } else {
            f fVar = this.c;
            GoodsSpu goodsSpu = this.d;
            GoodsSku l = l();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8a1ebb3ec568fe13bb53229d1d9dd13", RobustBitConfig.DEFAULT_VALUE)) {
                goodsAttrArr = (GoodsAttr[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8a1ebb3ec568fe13bb53229d1d9dd13");
            } else if (this.x == null) {
                goodsAttrArr = new GoodsAttr[0];
            } else {
                if (this.j != null) {
                    this.j.a(this.x, this.d, this.w);
                }
                goodsAttrArr = this.x;
            }
            fVar.a(goodsSpu, l, goodsAttrArr);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final void a(@NonNull View view, @NonNull SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {view, sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644e8afbf02235ca5063c8a2c2cec06a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644e8afbf02235ca5063c8a2c2cec06a");
            return;
        }
        GoodsSku l = l();
        this.z = l;
        if (m() != null) {
            m().b(getContext(), l != null ? l.getSkuId() : 0L);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(int i, Map<String, Object> map) {
        this.m = i;
        this.n = map;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(String str, String str2, String str3, int i, int i2, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6225edb857807b5ff5cd0e10a6b06e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6225edb857807b5ff5cd0e10a6b06e");
            return;
        }
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = i;
        this.u = i2;
        this.v = str4;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(Poi poi, com.sankuai.waimai.store.param.a aVar, int i) {
        this.s = aVar;
        this.t = i;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(int i, Poi poi, GoodsSpu goodsSpu) {
        Object[] objArr = {Integer.valueOf(i), poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259fe286a206451f32a32533c5030d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259fe286a206451f32a32533c5030d83");
            return;
        }
        this.f = i;
        this.e = new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi);
        this.d = goodsSpu;
        this.j.a(this.d);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e3ddcbe5c4124e4af996960dace798c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e3ddcbe5c4124e4af996960dace798c");
        } else {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layout_bottom_price_container);
            this.c = new f(frameLayout.getContext(), this.e, this, this.A);
            this.c.bindView(LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_view_b2c_sku_choose_dialog_bottom, (ViewGroup) frameLayout, true));
            if (frameLayout.getLayoutParams() != null) {
                frameLayout.getLayoutParams().height = com.sankuai.shangou.stone.util.h.a(getContext(), 96.0f);
            }
        }
        show();
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb206758c5b65bef3ef5405b7a04bbdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb206758c5b65bef3ef5405b7a04bbdf");
        } else {
            dismiss();
        }
    }

    private com.sankuai.waimai.store.skuchoose.judas.f m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1d3dcf078822e5d11d6cff81211097", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.skuchoose.judas.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1d3dcf078822e5d11d6cff81211097");
        }
        if (this.y == null) {
            this.y = com.sankuai.waimai.store.skuchoose.judas.f.a(getContext(), this.f);
            this.y.a(this.e, this.d, l());
            this.y.a(this.m, this.n);
            this.y.a(this.o, this.p, this.q, this.r, this.u, this.v);
            this.y.a(this.s, this.t);
        }
        return this.y;
    }

    @Override // com.sankuai.waimai.store.ui.common.CustomDialog, com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9449243a4f68782e69f9c5ed754004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9449243a4f68782e69f9c5ed754004");
        } else if (this.d == null || this.e == null || this.e.b == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b874101a59ed8d546ab23ca06181824d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b874101a59ed8d546ab23ca06181824d");
            } else if (this.d != null) {
                int c = com.sankuai.shangou.stone.util.a.c(this.d.spuAttrsList);
                this.w = new SGGoodAttrValue[c];
                this.x = new GoodsAttr[c];
                if (this.j != null) {
                    this.j.a(this.w, this.d, this.e);
                }
            }
            l();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "231e77207fedbf4123d8e8dc8b49ab80", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "231e77207fedbf4123d8e8dc8b49ab80");
            } else if (this.d != null) {
                u.a(this.i, this.d.getName());
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a7167498e45c4cac9fa67ca4ce327bab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a7167498e45c4cac9fa67ca4ce327bab");
            } else if (this.b != null) {
                this.b.a();
            }
            ba_();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8e6996f237e77bfee0ccbdef2f654501", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8e6996f237e77bfee0ccbdef2f654501");
            } else {
                GoodsSku l = l();
                if (m() != null) {
                    m().a(getContext(), l != null ? l.getSkuId() : 0L);
                }
            }
            super.show();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final void b(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c7b2cd6bd29c49d27f4f87c0214736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c7b2cd6bd29c49d27f4f87c0214736");
        } else if (goodsSku == null || m() == null) {
        } else {
            m().c(getContext(), goodsSku.getSkuId());
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final void c(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b876eab9c7c5d19088f202adaf1f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b876eab9c7c5d19088f202adaf1f8b");
        } else if (goodsSku == null || m() == null) {
        } else {
            m().d(getContext(), goodsSku.getSkuId());
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad9ad38df6856c2ff47ec48cdadf525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad9ad38df6856c2ff47ec48cdadf525");
        } else {
            dismiss();
        }
    }
}
