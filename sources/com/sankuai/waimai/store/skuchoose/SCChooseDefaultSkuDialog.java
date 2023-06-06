package com.sankuai.waimai.store.skuchoose;

import android.app.Activity;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.ak;
import com.sankuai.waimai.store.util.am;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCChooseDefaultSkuDialog extends CustomDialog implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener, com.sankuai.waimai.store.observers.a, c, e, i, p {
    public static ChangeQuickRedirect a;
    private String A;
    private View B;
    private FrameLayout C;
    private LinearLayout D;
    private o E;
    private d F;
    private com.sankuai.waimai.store.shopping.cart.a G;
    private com.sankuai.waimai.store.callback.c H;
    private Poi I;
    private com.sankuai.waimai.store.param.a J;
    private int K;
    private Map<String, Object> L;
    public int b;
    private com.sankuai.waimai.store.order.a c;
    private a d;
    private Activity e;
    private boolean f;
    private LinearLayout h;
    private TextView i;
    private TextView j;
    private ViewGroup m;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a n;
    private GoodsSpu o;
    private GoodsSku p;
    private LinearLayout q;
    private LinkedHashMap<String, String> r;
    private GoodsAttr[] s;
    private int t;
    private Map<String, Object> u;
    private String v;
    private String w;
    private String x;
    private int y;
    private int z;

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final boolean c() {
        return true;
    }

    public static /* synthetic */ void a(SCChooseDefaultSkuDialog sCChooseDefaultSkuDialog, String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sCChooseDefaultSkuDialog, changeQuickRedirect, false, "42779afcc80fdfd73c63a11346085730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sCChooseDefaultSkuDialog, changeQuickRedirect, false, "42779afcc80fdfd73c63a11346085730");
        } else if (am.a()) {
            if (sCChooseDefaultSkuDialog.bB_() instanceof SCBaseActivity) {
                str2 = ((SCBaseActivity) sCChooseDefaultSkuDialog.bB_()).w();
            } else {
                str2 = sCChooseDefaultSkuDialog.getClass().getName() + System.currentTimeMillis();
            }
            am.a(sCChooseDefaultSkuDialog.getContext(), sCChooseDefaultSkuDialog.getWindow(), str2, str);
        } else {
            am.a(sCChooseDefaultSkuDialog.m, str);
        }
    }

    public static /* synthetic */ void l(SCChooseDefaultSkuDialog sCChooseDefaultSkuDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sCChooseDefaultSkuDialog, changeQuickRedirect, false, "1953b0c1d16b97f8e4250c9a84a11b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sCChooseDefaultSkuDialog, changeQuickRedirect, false, "1953b0c1d16b97f8e4250c9a84a11b9c");
        } else {
            super.dismiss();
        }
    }

    public SCChooseDefaultSkuDialog(Context context, boolean z) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_goods_dialog_choosesku, (ViewGroup) null, false), R.style.WmStSkuDialogTheme);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e8a5791cc1aaa762703e5a4c0d8ef3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e8a5791cc1aaa762703e5a4c0d8ef3");
            return;
        }
        this.c = com.sankuai.waimai.store.order.a.e();
        this.f = false;
        this.b = -1;
        this.f = z;
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.gravity = 17;
                attributes.height = -1;
                attributes.width = -1;
                window.setAttributes(attributes);
            }
            window.setWindowAnimations(R.style.WmChooseDialogAnimation);
        }
        setOnShowListener(this);
        setOnDismissListener(this);
        setOnCancelListener(this);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e483fe0ec1d6f476f1655d17d7a1d2ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e483fe0ec1d6f476f1655d17d7a1d2ee");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "770b02bb2bb8224898b9042e4b3e03e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "770b02bb2bb8224898b9042e4b3e03e5");
            return;
        }
        if (this.E != null) {
            o oVar = this.E;
            LinkedHashMap<String, String> linkedHashMap = this.r;
            Object[] objArr3 = {linkedHashMap};
            ChangeQuickRedirect changeQuickRedirect3 = o.a;
            if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "b721ad81362c52197be3b79c1fa2a86d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "b721ad81362c52197be3b79c1fa2a86d");
            } else if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String str : linkedHashMap.keySet()) {
                    sb.append(linkedHashMap.get(str));
                    sb.append("、");
                }
                sb.deleteCharAt(sb.length() - 1);
                u.a(oVar.b, sb.toString());
            }
        }
        if (this.d != null) {
            this.d.a(this.o, this.p, this.s);
            this.d.b(this.o, this.p);
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5647df125c9dfd69b27253688b43af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5647df125c9dfd69b27253688b43af7");
            return;
        }
        this.m = (ViewGroup) findViewById(R.id.goods_dialog_choosesku);
        this.h = (LinearLayout) findViewById(R.id.layout_sku_and_attr_holder);
        this.i = (TextView) findViewById(R.id.title_name);
        this.j = (TextView) findViewById(R.id.btn_dialog_close);
        this.q = (LinearLayout) findViewById(R.id.title_root_view);
        this.B = findViewById(R.id.show_choose_sku);
        this.B.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), (int) R.color.wm_sg_common_dialog_background, (int) R.dimen.wm_sc_common_dimen_12));
        this.C = (FrameLayout) findViewById(R.id.sku_dialog_root_view);
        this.C.setOnClickListener(null);
        this.D = (LinearLayout) findViewById(R.id.sku_dialog_specifi_info);
        this.D.setOnClickListener(null);
        this.q.setOnClickListener(null);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141c9f2b0c15d801316268e8cc7cae83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141c9f2b0c15d801316268e8cc7cae83");
            return;
        }
        super.onShow(dialogInterface);
        if (this.c != null) {
            this.c.a(this);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(int i, Poi poi, GoodsSpu goodsSpu) {
        Object[] objArr = {Integer.valueOf(i), poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b76f38cd39dfe78507b7944684e273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b76f38cd39dfe78507b7944684e273");
        } else if (poi == null || goodsSpu == null) {
        } else {
            this.b = i;
            this.n = new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi);
            this.o = goodsSpu;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffa5a8d38d42eec33e2a7e6aa9081354", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffa5a8d38d42eec33e2a7e6aa9081354");
            } else {
                this.c.a(this);
                this.e = bB_();
                if (this.e != null) {
                    this.r = new LinkedHashMap<>();
                    if (this.f) {
                        this.d = new k(bB_(), this.n, this, this.G);
                    } else {
                        this.d = new l(bB_(), this.n, this, this, this);
                    }
                    this.d.createView(this.C);
                    this.d.a(this.o);
                    this.E = new o(bB_());
                    this.E.createView(this.D);
                    this.F = new d(bB_(), this, this.n, this.o, this, this.f);
                    this.F.bindView(this.h);
                    this.F.a();
                    if (this.o != null) {
                        u.a(this.i, this.o.getName());
                    }
                    ba_();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46e502044e790a8d149dc5dfa4e3108f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46e502044e790a8d149dc5dfa4e3108f");
                    } else {
                        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.SCChooseDefaultSkuDialog.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr4 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26242e87b508d4739e965ea4b2a28394", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26242e87b508d4739e965ea4b2a28394");
                                    return;
                                }
                                if (SCChooseDefaultSkuDialog.this.d()) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("poi_id", SCChooseDefaultSkuDialog.this.n.d());
                                    hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(SCChooseDefaultSkuDialog.this.t));
                                    hashMap.put("spu_ordered", Boolean.valueOf(!com.sankuai.shangou.stone.util.a.b(com.sankuai.waimai.store.order.a.e().b(SCChooseDefaultSkuDialog.this.n.f(), SCChooseDefaultSkuDialog.this.o.getId()))));
                                    if (SCChooseDefaultSkuDialog.this.g()) {
                                        com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) SCChooseDefaultSkuDialog.this.getContext()), "b_7IVOH").b(hashMap).a();
                                    } else {
                                        com.sankuai.waimai.store.manager.judas.b.a(SCChooseDefaultSkuDialog.this.bB_(), "b_7IVOH").b(hashMap).a();
                                    }
                                }
                                SCChooseDefaultSkuDialog.this.dismiss();
                            }
                        });
                        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.SCChooseDefaultSkuDialog.4
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr4 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aaebe407e75a97538d2c69ed24ba6605", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aaebe407e75a97538d2c69ed24ba6605");
                                } else {
                                    SCChooseDefaultSkuDialog.this.dismiss();
                                }
                            }
                        });
                    }
                }
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0bafcdc1c6c03f1cc26c13ad06c75ada", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0bafcdc1c6c03f1cc26c13ad06c75ada");
            } else if (d()) {
                com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_UHTLt").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("template_id", 1).a("spu_tag", com.sankuai.waimai.store.util.k.b(this.n.b, this.o, this.p)).a();
            } else {
                if (f()) {
                    com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_waimai_92jx5p7c_mv").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("template_id", 1).a("sku_id", Long.valueOf(this.p != null ? this.p.getSkuId() : 0L)).a("keyword", "-999").a("poisearch_log_id", "-999").a("poisearch_global_id", "-999").a("spu_tag", com.sankuai.waimai.store.util.k.b(this.n.b, this.o, this.p)).a();
                } else if (k()) {
                    com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_waimai_92jx5p7c_mv").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p != null ? this.p.getSkuId() : 0L)).a("template_id", 1).a("spu_tag", com.sankuai.waimai.store.util.k.b(this.n.b, this.o, this.p)).a();
                } else if (h()) {
                    com.sankuai.waimai.store.manager.judas.b.b(getContext(), "b_f7ur7zus").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p != null ? this.p.getSkuId() : 0L)).a("index", Integer.valueOf(this.y)).a("keyword", this.v != null ? this.v : "-999").a("stid", this.A != null ? this.A : "-999").a("poisearch_log_id", this.w != null ? this.w : "-999").a("poisearch_global_id", this.x != null ? this.x : "-999").a("position_index", Integer.valueOf(this.z)).a("template_id", 1).a("spu_tag", com.sankuai.waimai.store.util.k.b(this.n.b, this.o, this.p)).a();
                } else if (g()) {
                    com.sankuai.waimai.store.manager.judas.b.b("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) getContext()), "b_waimai_92jx5p7c_mv").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("template_id", 1).a("sku_id", Long.valueOf(this.p != null ? this.p.getSkuId() : 0L)).a("keyword", "-999").a("poisearch_log_id", "-999").a("poisearch_global_id", "-999").a("spu_tag", com.sankuai.waimai.store.util.k.b(this.n.b, this.o, this.p)).a();
                }
            }
            super.show();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e84f0aa64299db7f65d144368f8235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e84f0aa64299db7f65d144368f8235");
        } else {
            dismiss();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void b(@NonNull final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0b80f7779bd127b217c4da8a00b820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0b80f7779bd127b217c4da8a00b820");
        } else {
            this.c.a(this.n.f(), this.o, this.p, this.s, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.skuchoose.SCChooseDefaultSkuDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d51333565dd1b4c31b536a0c6ff297d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d51333565dd1b4c31b536a0c6ff297d");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bd28c80467facb9e3ce3b85787a02b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bd28c80467facb9e3ce3b85787a02b7");
                        return;
                    }
                    com.sankuai.waimai.store.shopping.cart.f a2 = com.sankuai.waimai.store.shopping.cart.f.a();
                    View view2 = view;
                    ViewGroup viewGroup = SCChooseDefaultSkuDialog.this.m;
                    String d = SCChooseDefaultSkuDialog.this.n.d();
                    Object[] objArr3 = {view2, viewGroup, d};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.shopping.cart.f.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "ddbd4134ec3e901a4621156b76afece6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "ddbd4134ec3e901a4621156b76afece6");
                    } else if (a2.b()) {
                        a2.a(view2, (View) a2.b(view2.getContext().hashCode()), viewGroup, true, d);
                    } else {
                        a2.a(view2, a2.b(view2.getContext().hashCode()), viewGroup);
                    }
                    SCChooseDefaultSkuDialog.this.d.a(SCChooseDefaultSkuDialog.this.o, SCChooseDefaultSkuDialog.this.p);
                    SCChooseDefaultSkuDialog.this.l();
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c774747e41d856917524954e5fe27c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c774747e41d856917524954e5fe27c8");
                    } else if (TextUtils.isEmpty(aVar.getMessage())) {
                    } else {
                        SCChooseDefaultSkuDialog.a(SCChooseDefaultSkuDialog.this, aVar.getMessage());
                        SCChooseDefaultSkuDialog.this.ba_();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void c(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c101e8f44f3c71fa0a65df7e239a1900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c101e8f44f3c71fa0a65df7e239a1900");
        } else {
            this.c.b(this.n.d(), this.o, this.p, this.s, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.skuchoose.SCChooseDefaultSkuDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d3d729192592a5d2e59ac00eca22506", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d3d729192592a5d2e59ac00eca22506");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7d9a9117a52823edf571f098b2bdd28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7d9a9117a52823edf571f098b2bdd28");
                        return;
                    }
                    SCChooseDefaultSkuDialog.this.d.a(SCChooseDefaultSkuDialog.this.o, SCChooseDefaultSkuDialog.this.p);
                    SCChooseDefaultSkuDialog.this.m();
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c337e134b67cac78f7ec779708fa66b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c337e134b67cac78f7ec779708fa66b");
                    } else if (TextUtils.isEmpty(aVar.getMessage())) {
                    } else {
                        SCChooseDefaultSkuDialog.a(SCChooseDefaultSkuDialog.this, aVar.getMessage());
                        SCChooseDefaultSkuDialog.this.ba_();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void a(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5076e414c9a13f278ba0e0914d8fe5f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5076e414c9a13f278ba0e0914d8fe5f3");
            return;
        }
        this.s = goodsAttrArr;
        if (this.d != null) {
            this.d.e = goodsAttrArr;
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void a(GoodsSku goodsSku, LinkedHashMap<String, String> linkedHashMap) {
        this.p = goodsSku;
        this.r = linkedHashMap;
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void a(int i, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {Integer.valueOf(i), goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d2d06532c553234d1fb5751eb36a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d2d06532c553234d1fb5751eb36a49");
            return;
        }
        this.p = goodsSku;
        this.s = goodsAttrArr;
        if (this.d != null) {
            this.d.a(i, this.o, this.p, goodsAttrArr);
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void a(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf49f1cbf9e739ccc6d481606d9dedd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf49f1cbf9e739ccc6d481606d9dedd");
        } else if (this.d == null) {
        } else {
            this.d.a(this.o, this.o.activityType > 0, goodsSku);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.b == 0;
    }

    private boolean f() {
        return this.b == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.b == 7;
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d904489d93c30010705f80ba2e3613", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d904489d93c30010705f80ba2e3613")).booleanValue() : ak.c(getContext(), this.b);
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44f9e433783241cb4cdfd8935464811", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44f9e433783241cb4cdfd8935464811")).booleanValue() : ak.d(getContext(), this.b);
    }

    @Override // com.sankuai.waimai.store.skuchoose.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebdc8515f4834635c310cc4a6ace35b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebdc8515f4834635c310cc4a6ace35b0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.n.d());
        hashMap.put("spu_id", Long.valueOf(this.o.id));
        hashMap.put("sku_id", Long.valueOf(this.p != null ? this.p.getSkuId() : 0L));
        hashMap.put("poisearch_log_id", this.w != null ? this.w : "-999");
        hashMap.put("poisearch_global_id", this.x != null ? this.x : "-999");
        hashMap.put("keyword", this.v != null ? this.v : "-999");
        hashMap.put("template_id", 1);
        if (g()) {
            com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) getContext()), "b_waimai_endbn85r_mc").b(hashMap).a();
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(bB_(), "b_waimai_endbn85r_mc").b(hashMap).a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4c8c004833ab2fc52f6841a24fee4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4c8c004833ab2fc52f6841a24fee4d");
        } else {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.sankuai.waimai.store.callback.a a2;
        String str;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ccd135f05dbd9b7e7af2c06f04fe8f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ccd135f05dbd9b7e7af2c06f04fe8f1");
        } else if (d()) {
            if (this.u != null) {
                this.u.put("sku_id", Long.valueOf(this.p.getSkuId()));
            } else {
                this.u = new HashMap();
                this.u.put("poi_id", this.n.d());
                this.u.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.t));
                this.u.put("spu_id", Long.valueOf(this.o.id));
                this.u.put(DataConstants.CATEGORY_ID, this.o.getTag());
                this.u.put("sku_id", Long.valueOf(this.p.getSkuId()));
            }
            this.u.put("keyword", this.v != null ? this.v : "-999");
            this.u.put("poisearch_log_id", this.w != null ? this.w : "-999");
            this.u.put("poisearch_global_id", this.x != null ? this.x : "-999");
            this.u.put("template_id", 1);
            com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_m9pmX").a(AppUtil.generatePageInfoKey(getContext())).b(this.u).a();
        } else if (f()) {
            com.sankuai.waimai.store.platform.domain.manager.goods.a a3 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
            com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_fwQ6d").a(AppUtil.generatePageInfoKey(getContext())).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p.getSkuId())).a("poi_id", this.n.d()).a("is_show_remain_num", a3.b ? "1" : "0").a("has_comment", a3.c ? "1" : "0").a("comment_source", a3.d).a("product_tag", "").a("stid", !t.a(this.o.stid) ? this.o.stid : "").a("product_icon_type_list", !t.a(this.o.iconTypes) ? this.o.iconTypes : "").a("template_id", 1).a();
        } else {
            if (h()) {
                a2 = com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_bGeUX").a("spu_id", Long.valueOf(this.o.id)).a("stid", this.A != null ? this.A : "-999").a("poi_id", this.n.d()).a("sku_id", Long.valueOf(this.p.getSkuId())).a("index", Integer.valueOf(this.y)).a("keyword", this.v == null ? "" : this.v).a("poisearch_log_id", this.w == null ? "-999" : this.w).a("poisearch_global_id", this.x == null ? "-999" : this.x);
                str = "fixedprice";
                str2 = "-999";
            } else {
                if (this.b == 5) {
                    com.sankuai.waimai.store.manager.judas.b.a(this.J.G, "b_waimai_fkgl4gx7_mc").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("index", Integer.valueOf(this.K)).a("cat_id", Long.valueOf(this.J.c)).a("sec_cat_id", this.J.f == null ? "" : this.J.f).a("sort", Long.valueOf(this.J.g)).a("filter", this.J.n()).a("delivery_fee", com.sankuai.shangou.stone.util.i.a(Double.valueOf(this.I.shippingFee), Double.valueOf(0.0d)) ? getContext().getString(R.string.wm_sc_goods_label_delivery_fee_free) : "").a("delivery_time", this.I.mtDeliveryTime == null ? "" : this.I.mtDeliveryTime).a("score", Double.valueOf(this.I.poiScore)).a("activity_type", Integer.valueOf(this.o.activityType)).a("orig_price", Double.valueOf(this.o.getOriginPrice())).a("current_price", Double.valueOf(this.o.getMinPrice())).a("sale", Integer.valueOf(this.o.monthSaled)).a();
                    return;
                } else if (k()) {
                    a2 = com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_fwQ6d").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id));
                    str = "sku_id";
                    str2 = Long.valueOf(this.p.getSkuId());
                } else {
                    if (this.b == 6) {
                        if (this.L == null) {
                            this.L = new HashMap();
                        }
                        this.L.put("poi_id", this.n.d());
                        this.L.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.t));
                        this.L.put("spu_id", Long.valueOf(this.o.id));
                        this.L.put(DataConstants.CATEGORY_ID, this.o.getTag());
                        this.L.put("sku_id", Long.valueOf(this.p.getSkuId()));
                        this.L.put("stid", this.o.stid);
                        this.L.put("keyword", this.v != null ? this.v : "-999");
                        this.L.put("poisearch_log_id", this.w != null ? this.w : "-999");
                        this.L.put("poisearch_global_id", this.x != null ? this.x : "-999");
                        this.L.put("template_id", 1);
                        com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_m9pmX").a(AppUtil.generatePageInfoKey(getContext())).b(this.L).a();
                        return;
                    } else if (!g()) {
                        return;
                    } else {
                        com.sankuai.waimai.store.platform.domain.manager.goods.a a4 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
                        a2 = com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) getContext()), "b_fwQ6d").a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p.getSkuId())).a("poi_id", this.n.d()).a("is_show_remain_num", a4.b ? "1" : "0").a("has_comment", a4.c ? "1" : "0").a("comment_source", a4.d).a("product_tag", "").a("stid", !t.a(this.o.stid) ? this.o.stid : "");
                        str = "product_icon_type_list";
                        str2 = !t.a(this.o.iconTypes) ? this.o.iconTypes : "";
                    }
                }
            }
            a2.a(str, str2).a("template_id", 1).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.sankuai.waimai.store.callback.a a2;
        String str;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e31eb3974795528e1548f382ebcd338c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e31eb3974795528e1548f382ebcd338c");
        } else if (d()) {
            if (this.u != null) {
                this.u.put("sku_id", Long.valueOf(this.p.getSkuId()));
            } else {
                this.u = new HashMap();
                this.u.put("poi_id", this.n.d());
                this.u.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.t));
                this.u.put("spu_id", Long.valueOf(this.o.id));
                this.u.put(DataConstants.CATEGORY_ID, this.o.getTag());
                this.u.put("sku_id", Long.valueOf(this.p.getSkuId()));
                com.sankuai.waimai.store.platform.domain.manager.goods.a a3 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
                this.u.put("is_show_remain_num", a3.b ? "1" : "0");
                this.u.put("has_comment", a3.c ? "1" : "0");
                this.u.put("comment_source", a3.d);
                this.u.put("product_tag", "");
                this.u.put("template_id", 1);
            }
            com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_FRrXo").b(this.u).a();
        } else if (f()) {
            com.sankuai.waimai.store.platform.domain.manager.goods.a a4 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
            com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_utxGH").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p.getSkuId())).a("is_show_remain_num", a4.b ? "1" : "0").a("has_comment", a4.c ? "1" : "0").a("comment_source", a4.d).a("product_tag", "").a("template_id", 1).a("stid", !t.a(this.o.stid) ? this.o.stid : "").a("product_icon_type_list", !t.a(this.o.iconTypes) ? this.o.iconTypes : "").a();
        } else {
            if (k()) {
                a2 = com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_utxGH").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p.getSkuId()));
                str = "template_id";
                str2 = 1;
            } else if (h()) {
                a2 = com.sankuai.waimai.store.manager.judas.b.a(getContext(), "b_nrb8gump").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p.getSkuId())).a("index", Integer.valueOf(this.y)).a("keyword", this.v != null ? this.v : "").a("poisearch_log_id", this.w != null ? this.w : "").a("poisearch_global_id", this.x != null ? this.x : "").a("stid", this.A != null ? this.A : "-999").a("position_index", Integer.valueOf(this.z));
                str = "template_id";
                str2 = 1;
            } else if (!g()) {
                return;
            } else {
                com.sankuai.waimai.store.platform.domain.manager.goods.a a5 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
                a2 = com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) getContext()), "b_utxGH").a("poi_id", this.n.d()).a("spu_id", Long.valueOf(this.o.id)).a("sku_id", Long.valueOf(this.p.getSkuId())).a("is_show_remain_num", a5.b ? "1" : "0").a("has_comment", a5.c ? "1" : "0").a("comment_source", a5.d).a("product_tag", "").a("template_id", 1).a("stid", !t.a(this.o.stid) ? this.o.stid : "");
                str = "product_icon_type_list";
                str2 = !t.a(this.o.iconTypes) ? this.o.iconTypes : "";
            }
            a2.a(str, str2).a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(int i, Map<String, Object> map) {
        this.t = i;
        this.u = map;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(String str, String str2, String str3, int i, int i2, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03d8b531e1ec5f12e4d757dd9e37b2d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03d8b531e1ec5f12e4d757dd9e37b2d4");
            return;
        }
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.y = i;
        this.z = i2;
        this.A = str4;
    }

    @Override // com.sankuai.waimai.store.skuchoose.i
    public final void a(Poi poi, com.sankuai.waimai.store.param.a aVar, int i) {
        this.I = poi;
        this.J = aVar;
        this.K = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89391ced84dbe4b6ab7ad2ea16806ff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89391ced84dbe4b6ab7ad2ea16806ff9");
        } else {
            this.c.b(this);
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2427c109565d0d49803ca67fb79a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2427c109565d0d49803ca67fb79a22");
            return;
        }
        this.B.clearAnimation();
        com.meituan.android.bus.a.a().c(new h(0));
        Animation loadAnimation = AnimationUtils.loadAnimation(bB_(), R.anim.wm_sc_goods_sku_out);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.store.skuchoose.SCChooseDefaultSkuDialog.5
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d24dc4bf5cdfa264f9676751f195ecb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d24dc4bf5cdfa264f9676751f195ecb");
                } else {
                    SCChooseDefaultSkuDialog.l(SCChooseDefaultSkuDialog.this);
                }
            }
        });
        this.B.startAnimation(loadAnimation);
    }

    @Override // com.sankuai.waimai.store.skuchoose.p
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2ec74f7c1ffb22c60a6bf4e2424fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2ec74f7c1ffb22c60a6bf4e2424fb6");
        } else if (this.E != null) {
            o oVar = this.E;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "d5327a08b8124e1759c6766402e5ddcd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "d5327a08b8124e1759c6766402e5ddcd");
            } else if (z) {
                u.a(oVar.c);
            } else {
                u.c(oVar.c);
            }
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.p
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748c223320f3115c433e5bd754c17891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748c223320f3115c433e5bd754c17891");
        } else if (this.E != null) {
            o oVar = this.E;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "a722f5a8a79f14729e6136989986d7ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "a722f5a8a79f14729e6136989986d7ad");
            } else if (z) {
                u.a(oVar.d);
            } else {
                u.c(oVar.d);
            }
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.p
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c187bd83e9f7e4626ed5b8ccef625bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c187bd83e9f7e4626ed5b8ccef625bc5");
        } else if (this.E != null) {
            o oVar = this.E;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "c263b9603d2a9e5aad702b0397d36190", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "c263b9603d2a9e5aad702b0397d36190");
            } else {
                u.a(oVar.c, str);
            }
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final void b(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2b37ee0ae13cb037a8fcbd03d1ea52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2b37ee0ae13cb037a8fcbd03d1ea52");
        } else if (goodsSku == null) {
        } else {
            l();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final void c(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fe744068762990e109d54168b851d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fe744068762990e109d54168b851d0");
        } else if (goodsSku == null) {
        } else {
            m();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.e
    public final boolean a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9e0e48b44254e77ab612f2e17fe6da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9e0e48b44254e77ab612f2e17fe6da")).booleanValue() : this.H != null;
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a704ef958b1110b8ec8b7a898195d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a704ef958b1110b8ec8b7a898195d9d");
        } else if (this.c != null) {
            this.c.b(this);
        }
    }
}
