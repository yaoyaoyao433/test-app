package com.sankuai.waimai.store.skuchoose;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
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
public class OptimizedSkuDialog extends CustomDialog implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, com.sankuai.waimai.store.observers.a, g, i {
    public static ChangeQuickRedirect a;
    public n b;
    public b c;
    @NonNull
    public GoodsSpu d;
    @NonNull
    public com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    public int f;
    private View h;
    private TextView i;
    private ImageView j;
    private final m m;
    private int n;
    private Map<String, Object> o;
    private String p;
    private String q;
    private String r;
    private int s;
    private com.sankuai.waimai.store.param.a t;
    private int u;
    private int v;
    private String w;
    private SGGoodAttrValue[] x;
    private GoodsAttr[] y;
    private com.sankuai.waimai.store.skuchoose.judas.f z;

    public static /* synthetic */ void a(OptimizedSkuDialog optimizedSkuDialog, GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, optimizedSkuDialog, changeQuickRedirect, false, "9bcface5459053817999a54a529e161f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, optimizedSkuDialog, changeQuickRedirect, false, "9bcface5459053817999a54a529e161f");
        } else if (goodsSku != null) {
            optimizedSkuDialog.n().c(optimizedSkuDialog.getContext(), goodsSku.getSkuId());
        }
    }

    public static /* synthetic */ void b(OptimizedSkuDialog optimizedSkuDialog, GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, optimizedSkuDialog, changeQuickRedirect, false, "9b27614ce29d8a1b4458804cf561500c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, optimizedSkuDialog, changeQuickRedirect, false, "9b27614ce29d8a1b4458804cf561500c");
        } else if (goodsSku != null) {
            optimizedSkuDialog.n().d(optimizedSkuDialog.getContext(), goodsSku.getSkuId());
        }
    }

    public OptimizedSkuDialog(@NonNull Context context) {
        super(context, (int) R.style.WmStSkuDialogTheme);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5d0f91e634d7291a1828d8a6be9971", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5d0f91e634d7291a1828d8a6be9971");
            return;
        }
        this.m = new m();
        this.h = LayoutInflater.from(context).inflate(R.layout.wm_sc_goods_dialog_optimized_sku_choose, (ViewGroup) null);
        setContentView(this.h);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ee6cee3474bdd5a36585e6425927603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ee6cee3474bdd5a36585e6425927603");
        } else {
            Window window = getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = (int) (com.sankuai.shangou.stone.util.h.a(window.getContext()) / 0.833f);
                attributes.gravity = 80;
                window.setAttributes(attributes);
            }
            setCancelable(true);
            setCanceledOnTouchOutside(true);
            setOnShowListener(this);
            setOnCancelListener(this);
            setOnDismissListener(this);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "510160012af0b326ce7fdf453fe9e3c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "510160012af0b326ce7fdf453fe9e3c2");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layout_bottom_price_container);
        this.c = new b(frameLayout.getContext(), this);
        this.c.bindView(LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_view_sku_choose_dialog_bottom, (ViewGroup) frameLayout, true));
        View findViewById = findViewById(R.id.layout_skus_container);
        this.b = new n(findViewById.getContext(), this, this);
        this.b.bindView(findViewById);
        this.i = (TextView) findViewById(R.id.tv_title);
        this.j = (ImageView) findViewById(R.id.iv_close_dialog);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.OptimizedSkuDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "734cc853f02406181ed5411644009808", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "734cc853f02406181ed5411644009808");
                } else {
                    OptimizedSkuDialog.this.dismiss();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final GoodsSpu a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final int[] d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146fe66f3ab32a8bf6dd08c163908046", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146fe66f3ab32a8bf6dd08c163908046") : this.m.a(this.d, this.x);
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final int a(SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3283dae2878e114b01b78fa7ed7acfc9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3283dae2878e114b01b78fa7ed7acfc9")).intValue() : this.m.a(sGGoodAttrValue);
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final SGGoodAttrValue b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d09529eb4d52369d635db9366806052", RobustBitConfig.DEFAULT_VALUE) ? (SGGoodAttrValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d09529eb4d52369d635db9366806052") : (SGGoodAttrValue) com.sankuai.shangou.stone.util.a.a(this.x, i);
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final void a(int i, SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {Integer.valueOf(i), sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78183b9c52eb46b590e6255420c326e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78183b9c52eb46b590e6255420c326e2");
        } else if (i < com.sankuai.shangou.stone.util.a.c(this.x)) {
            this.x[i] = sGGoodAttrValue;
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406300ca4f2579a70c2227c004ad5e19", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406300ca4f2579a70c2227c004ad5e19")).booleanValue() : i >= 0 && i < com.sankuai.shangou.stone.util.a.c(this.x) && this.x[i] != null;
    }

    private int k() {
        for (int i = 0; i < this.x.length; i++) {
            if (this.x[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879c87c20af66cef9fd7262f15e7dfb2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879c87c20af66cef9fd7262f15e7dfb2")).booleanValue() : k() == -1;
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        return this.e;
    }

    private String d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33bfa3d0d9df685109658ce6e013a184", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33bfa3d0d9df685109658ce6e013a184");
        }
        SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d.spuAttrsList, i);
        return sGGoodSpuAttr != null ? sGGoodSpuAttr.name : "";
    }

    @Override // com.sankuai.waimai.store.skuchoose.g
    public final void bI_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af28e76526b6ee9e0c1b131383bae044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af28e76526b6ee9e0c1b131383bae044");
            return;
        }
        int k = k();
        if (k >= 0) {
            String d = d(k);
            if (TextUtils.isEmpty(d)) {
                return;
            }
            a(getContext().getString(R.string.wm_sc_please_choose, d));
            return;
        }
        final GoodsSku l = l();
        GoodsAttr[] m = m();
        m mVar = this.m;
        String d2 = this.e.d();
        GoodsSpu goodsSpu = this.d;
        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar = new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.skuchoose.OptimizedSkuDialog.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0e1bbec9b65e110823c5ca722b291d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0e1bbec9b65e110823c5ca722b291d6");
                } else {
                    OptimizedSkuDialog.a(OptimizedSkuDialog.this, l);
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af52b56b4d139c62f28ea1fad24c5eff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af52b56b4d139c62f28ea1fad24c5eff");
                    return;
                }
                super.a(aVar);
                if (!TextUtils.isEmpty(aVar.getMessage())) {
                    OptimizedSkuDialog.this.a(aVar.getMessage());
                }
                OptimizedSkuDialog.this.ba_();
            }
        };
        Object[] objArr2 = {d2, goodsSpu, l, m, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "a8cdfeef96783118e2dafcfeeb46c8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "a8cdfeef96783118e2dafcfeeb46c8da");
        } else {
            com.sankuai.waimai.store.order.a.e().a(d2, goodsSpu, l, m, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21f365b2263ff9dcb6884e91aa4d8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21f365b2263ff9dcb6884e91aa4d8f8");
        } else if (am.a()) {
            if (bB_() instanceof SCBaseActivity) {
                str2 = ((SCBaseActivity) bB_()).w();
            } else {
                str2 = getClass().getName() + System.currentTimeMillis();
            }
            am.a(getContext(), getWindow(), str2, str);
        } else {
            am.a(this.h, str);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.g
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f154cf90a95937015989d202511329e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f154cf90a95937015989d202511329e3");
            return;
        }
        int k = k();
        if (k >= 0) {
            String d = d(k);
            if (TextUtils.isEmpty(d)) {
                return;
            }
            a(getContext().getString(R.string.wm_sc_please_choose, d));
            a(d);
            return;
        }
        final GoodsSku l = l();
        GoodsAttr[] m = m();
        m mVar = this.m;
        String d2 = this.e.d();
        GoodsSpu goodsSpu = this.d;
        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar = new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.skuchoose.OptimizedSkuDialog.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3df11deac9dc5c1eebc3b409f023828", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3df11deac9dc5c1eebc3b409f023828");
                } else {
                    super.a();
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab007fb4a88935e6af2df6a3d340f1f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab007fb4a88935e6af2df6a3d340f1f7");
                } else {
                    OptimizedSkuDialog.b(OptimizedSkuDialog.this, l);
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98da99e394db50150276230b307146b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98da99e394db50150276230b307146b9");
                    return;
                }
                super.a(aVar);
                if (!TextUtils.isEmpty(aVar.getMessage())) {
                    OptimizedSkuDialog.this.a(aVar.getMessage());
                }
                OptimizedSkuDialog.this.ba_();
            }
        };
        Object[] objArr2 = {d2, goodsSpu, l, m, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "1164798adf84dfabf3128c22b225f138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "1164798adf84dfabf3128c22b225f138");
        } else {
            com.sankuai.waimai.store.order.a.e().b(d2, goodsSpu, l, m, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final List<String> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcb48ec77dce684b7c2de05a1ec4896", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcb48ec77dce684b7c2de05a1ec4896") : this.m.a(this.x);
    }

    private GoodsSku l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edf892852141a0929040c92ee77c9e5", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edf892852141a0929040c92ee77c9e5") : this.m.b(this.d, this.x);
    }

    private GoodsAttr[] m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8a6d11e8c2c62ae0ad739b7cbc6f03", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8a6d11e8c2c62ae0ad739b7cbc6f03");
        }
        this.m.a(this.y, this.d, this.x);
        return this.y;
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe3e4c34d594faacad6dd81ee1f62b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe3e4c34d594faacad6dd81ee1f62b20");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c3521aaf0310fd7bc32d225b7323af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c3521aaf0310fd7bc32d225b7323af1");
        } else {
            this.c.a(this.e.b, this.d, l(), m());
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.j
    public final void a(@NonNull View view, @NonNull SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {view, sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f766db51b7f45176498215d201cd7c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f766db51b7f45176498215d201cd7c1");
            return;
        }
        GoodsSku l = l();
        n().b(getContext(), l != null ? l.getSkuId() : 0L);
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(int i, Map<String, Object> map) {
        this.n = i;
        this.o = map;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(String str, String str2, String str3, int i, int i2, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da25776ac6291746c9eaa76ace36580a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da25776ac6291746c9eaa76ace36580a");
            return;
        }
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = i;
        this.v = i2;
        this.w = str4;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(Poi poi, com.sankuai.waimai.store.param.a aVar, int i) {
        this.t = aVar;
        this.u = i;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(int i, Poi poi, GoodsSpu goodsSpu) {
        Object[] objArr = {Integer.valueOf(i), poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9232857422a109fbf29238a87e83b63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9232857422a109fbf29238a87e83b63a");
            return;
        }
        this.f = i;
        this.e = new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi);
        this.c.g = this.e;
        this.d = goodsSpu;
        this.m.a(this.d);
        show();
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a89e4f1fab0813fbfe116a3b827a4dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a89e4f1fab0813fbfe116a3b827a4dc5");
        } else {
            dismiss();
        }
    }

    private com.sankuai.waimai.store.skuchoose.judas.f n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55c62bceb74a07774d9b1c80acb5526", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.skuchoose.judas.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55c62bceb74a07774d9b1c80acb5526");
        }
        if (this.z == null) {
            this.z = com.sankuai.waimai.store.skuchoose.judas.f.a(getContext(), this.f);
            this.z.a(this.e, this.d, l());
            this.z.a(this.n, this.o);
            this.z.a(this.p, this.q, this.r, this.s, this.v, this.w);
            this.z.a(this.t, this.u);
        }
        return this.z;
    }

    @Override // com.sankuai.waimai.store.ui.common.CustomDialog, com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc3ca3eb566ecfe7858de8b5997c432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc3ca3eb566ecfe7858de8b5997c432");
        } else if (this.d == null || this.e == null || this.e.b == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "123cda979139ba25bf2b477bf521f0b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "123cda979139ba25bf2b477bf521f0b2");
            } else {
                int c = com.sankuai.shangou.stone.util.a.c(this.d.spuAttrsList);
                this.x = new SGGoodAttrValue[c];
                this.y = new GoodsAttr[c];
                this.m.a(this.x, this.d, this.e);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba9970204a12a6f36fffd85e3c567c39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba9970204a12a6f36fffd85e3c567c39");
            } else {
                this.i.setText(this.d.getName());
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "824977d542056316193e71c8b11c3399", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "824977d542056316193e71c8b11c3399");
            } else {
                this.b.a();
            }
            ba_();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "360647c96007cea2a21332277fe73a75", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "360647c96007cea2a21332277fe73a75");
            } else {
                GoodsSku l = l();
                n().a(getContext(), l != null ? l.getSkuId() : 0L);
            }
            super.show();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc41ff6c878b97ebcbc0690d66a61d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc41ff6c878b97ebcbc0690d66a61d3");
        } else {
            com.sankuai.waimai.store.order.a.e().b(this);
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cadfae531eed556127c65f9ba2f76c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cadfae531eed556127c65f9ba2f76c9");
            return;
        }
        super.onDismiss(dialogInterface);
        com.meituan.android.bus.a.a().c(new h(0));
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb320e76001a648bd24cfa520a19f51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb320e76001a648bd24cfa520a19f51");
            return;
        }
        super.onShow(dialogInterface);
        com.sankuai.waimai.store.order.a.e().a(this);
    }
}
