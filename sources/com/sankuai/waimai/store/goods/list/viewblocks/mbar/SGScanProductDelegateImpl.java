package com.sankuai.waimai.store.goods.list.viewblocks.mbar;

import android.animation.Animator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.edfu.mbar.util.i;
import com.meituan.android.edfu.mbar.util.l;
import com.meituan.android.edfu.mbar.view.QRScanView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.viewblocks.mbar.a;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.home.callback.d;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.standard.FlashButton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGScanProductDelegateImpl implements QRScanView.a, com.sankuai.waimai.store.base.a, a.b, com.sankuai.waimai.store.i.user.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    @NonNull
    public SCBaseActivity b;
    public QRScanView c;
    public SGScanAnimationView d;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    public long f;
    public SCShopCartDelegate g;
    public RelativeLayout h;
    public ImageView i;
    public ImageView j;
    public b k;
    public FrameLayout l;
    public a m;
    public LinearLayout n;
    public LinearLayout o;
    boolean p;
    private String q;
    private boolean r;
    private boolean s;
    private BaseModuleDesc t;
    private FlashButton u;
    private FlashButton v;
    private volatile boolean w;
    private String x;
    private d y;

    public static String l() {
        return "c_waimai_trjbpius";
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98dff854f5d2c0b674a19139e33313a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98dff854f5d2c0b674a19139e33313a3");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69033ebb4df066afe096ee627545f9fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69033ebb4df066afe096ee627545f9fc");
        }
    }

    public static /* synthetic */ boolean b(SGScanProductDelegateImpl sGScanProductDelegateImpl, boolean z) {
        sGScanProductDelegateImpl.p = false;
        return false;
    }

    public static /* synthetic */ boolean c(SGScanProductDelegateImpl sGScanProductDelegateImpl, boolean z) {
        sGScanProductDelegateImpl.w = true;
        return true;
    }

    public static /* synthetic */ boolean d(SGScanProductDelegateImpl sGScanProductDelegateImpl, boolean z) {
        sGScanProductDelegateImpl.r = false;
        return false;
    }

    public SGScanProductDelegateImpl(@NotNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3b88bc6d7398b495f28dcb306160dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3b88bc6d7398b495f28dcb306160dc");
            return;
        }
        this.f = -1L;
        this.q = "dj-877dff0ea90d0517";
        this.p = false;
        this.w = true;
        this.x = "-999";
        this.y = new d() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.home.callback.d
            public final void a(String str, Map<String, Object> map) {
                Object[] objArr2 = {str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf946e271d69c669b5b668ce3aba4935", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf946e271d69c669b5b668ce3aba4935");
                    return;
                }
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 221089865) {
                    if (hashCode == 396221103 && str.equals("goods_detail_sku_dialog")) {
                        c = 0;
                    }
                } else if (str.equals("scan_close_product_card")) {
                    c = 1;
                }
                switch (c) {
                    case 0:
                        SGScanProductDelegateImpl sGScanProductDelegateImpl = SGScanProductDelegateImpl.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = SGScanProductDelegateImpl.a;
                        if (PatchProxy.isSupport(objArr3, sGScanProductDelegateImpl, changeQuickRedirect3, false, "8b107a394272a513ccc2d38cab64e579", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, sGScanProductDelegateImpl, changeQuickRedirect3, false, "8b107a394272a513ccc2d38cab64e579");
                        } else {
                            u.c(sGScanProductDelegateImpl.l);
                        }
                        SGScanProductDelegateImpl.this.k.a(map);
                        return;
                    case 1:
                        SGScanProductDelegateImpl.this.k();
                        return;
                    default:
                        return;
                }
            }
        };
        this.b = sCBaseActivity;
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void a(final FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d636a236621dfdd3207ccde1a8cbe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d636a236621dfdd3207ccde1a8cbe1");
            return;
        }
        this.h = (RelativeLayout) fragmentActivity.findViewById(R.id.sc_scan_common_layout);
        this.i = (ImageView) fragmentActivity.findViewById(R.id.iv_turn_on_flash);
        this.l = (FrameLayout) fragmentActivity.findViewById(R.id.view_product);
        this.n = (LinearLayout) fragmentActivity.findViewById(R.id.ll_no_product);
        this.j = (ImageView) fragmentActivity.findViewById(R.id.iv_sg_scan_back);
        this.o = (LinearLayout) fragmentActivity.findViewById(R.id.ll_scan_hint);
        this.u = (FlashButton) fragmentActivity.findViewById(R.id.btn_sc_scan_search);
        this.v = (FlashButton) fragmentActivity.findViewById(R.id.btn_sc_scan_rescan);
        this.j.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.b, R.dimen.wm_sc_common_dimen_9, R.dimen.wm_sc_common_dimen_18, R.color.wm_st_common_white, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.LEFT));
        u.d(this.j, 0, u.a(this.b), 0, 0);
        u.d(this.o, 0, u.a(this.b) + this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_46), 0, 0);
        this.d = (SGScanAnimationView) fragmentActivity.findViewById(R.id.sc_mbar_anim_view);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de2d48702c7f5cbc3c5f0140b3ca6a4b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de2d48702c7f5cbc3c5f0140b3ca6a4b");
                } else {
                    fragmentActivity.onBackPressed();
                }
            }
        });
        if (this.f == -1) {
            this.f = com.sankuai.waimai.store.goods.list.utils.d.a(this.b.getIntent(), "wm_poi_id", "poiId", this.f);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9808ed657860f9f90c4d1facac5e1da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9808ed657860f9f90c4d1facac5e1da");
        } else {
            View findViewById = this.b.findViewById(R.id.layout_bottom);
            this.e = com.sankuai.waimai.store.order.a.e().e(this.f);
            if (this.e == null || this.e.b == null) {
                try {
                    am.a((Activity) this.b, "系统环境异常，请稍后重试");
                    com.sankuai.waimai.store.util.monitor.c.a(StoreException.UserManagerMultiException, "poi异常", String.valueOf(this.f));
                    m();
                } catch (Exception unused) {
                }
            }
            if (this.g == null) {
                this.g = SCShopCartDelegate.a(this.b, this.e, R.id.mrn_shopcart_layout, findViewById, SCPageConfig.a(1, 22, "c_waimai_trjbpius"), "c_waimai_trjbpius", this.b.w());
            }
            try {
                this.g.f();
            } catch (Exception unused2) {
                com.sankuai.waimai.store.util.monitor.c.a(StoreException.UserManagerMultiException, "购物车异常", "购物车初始化异常");
            }
        }
        RectF rectF = new RectF(this.d.getFramingRect().left / h.a((Context) this.b), this.d.getFramingRect().top / h.b(this.b), this.d.getFramingRect().right / h.a((Context) this.b), this.d.getFramingRect().bottom / h.b(this.b));
        this.c = (QRScanView) fragmentActivity.findViewById(R.id.view_sc_qr_bar);
        this.c.setOnHandleScanResult(this);
        this.c.setConfig(new i.a().a(this.q).a(rectF).a(false).a());
        this.k = new b(this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1ae4cf73b20a99240a3c5bddb81c2039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1ae4cf73b20a99240a3c5bddb81c2039");
        } else {
            this.i.setVisibility(0);
            this.i.setImageResource(R.drawable.mbar_flashlight_off);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "12dd6a9fb1d28a9f3cc522abd3d4199e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "12dd6a9fb1d28a9f3cc522abd3d4199e");
                        return;
                    }
                    SGScanProductDelegateImpl.this.i.setImageResource(SGScanProductDelegateImpl.this.c.e() ? R.drawable.mbar_flashlight_on : R.drawable.mbar_flashlight_off);
                }
            });
        }
        a(this.d.getFramingRect(), (List<GoodsSpu>) null);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e1015d8505b9f36b19c4527a8c8fc54e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e1015d8505b9f36b19c4527a8c8fc54e");
        } else {
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9a88d891040e38acc987b8ce5f71cdb0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9a88d891040e38acc987b8ce5f71cdb0");
                    }
                }
            });
            this.u.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "672c6cddaee5d69cbc96357f8beaf554", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "672c6cddaee5d69cbc96357f8beaf554");
                        return;
                    }
                    g.a(SGScanProductDelegateImpl.this.b, SGScanProductDelegateImpl.this.e.f(), SGScanProductDelegateImpl.this.e.h(), SGScanProductDelegateImpl.this.e.b);
                    SGScanProductDelegateImpl.this.k();
                }
            });
            this.v.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8b6729f96ccd40e186694e458321706a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8b6729f96ccd40e186694e458321706a");
                    } else {
                        SGScanProductDelegateImpl.this.k();
                    }
                }
            });
        }
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.order.a.e().a(this);
        com.meituan.android.bus.a.a().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Rect rect, @Nullable List<GoodsSpu> list) {
        Object[] objArr = {rect, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3cbb9db3d7000458f21b9a3644c3bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3cbb9db3d7000458f21b9a3644c3bd");
        } else if (rect == null) {
        } else {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            if (com.sankuai.shangou.stone.util.a.a((List) list) <= 1) {
                layoutParams.topMargin = rect.bottom + h.a(this.b, 30.0f);
            } else {
                layoutParams.topMargin = rect.top - h.a(this.b, 30.0f);
            }
            this.l.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ee0f56e12decb865be57cc0607429f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ee0f56e12decb865be57cc0607429f");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbc9c21211017f60e6ed7b4a9138cc59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbc9c21211017f60e6ed7b4a9138cc59");
                        return;
                    }
                    u.c(SGScanProductDelegateImpl.this.l);
                    u.c(SGScanProductDelegateImpl.this.n);
                    SGScanProductDelegateImpl.this.a(true);
                    SGScanProductDelegateImpl sGScanProductDelegateImpl = SGScanProductDelegateImpl.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = SGScanProductDelegateImpl.a;
                    if (PatchProxy.isSupport(objArr3, sGScanProductDelegateImpl, changeQuickRedirect3, false, "9ada30197eb63ed1771d66caad9d940f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, sGScanProductDelegateImpl, changeQuickRedirect3, false, "9ada30197eb63ed1771d66caad9d940f");
                    } else {
                        sGScanProductDelegateImpl.c.c();
                    }
                    b bVar = SGScanProductDelegateImpl.this.k;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.c;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "2b9f61c8df472f68f8ab264d8f847b29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "2b9f61c8df472f68f8ab264d8f847b29");
                    } else if (bVar.e != null) {
                        bVar.e.i();
                        bVar.e = null;
                    }
                    SGScanProductDelegateImpl.b(SGScanProductDelegateImpl.this, false);
                    SGScanProductDelegateImpl.c(SGScanProductDelegateImpl.this, true);
                }
            }, 300, this.b.w());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dcbf394a34713e0bf815adf7af8991d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dcbf394a34713e0bf815adf7af8991d");
        } else {
            this.b.finish();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void g() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a431e885995a688c4d545da03227972c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a431e885995a688c4d545da03227972c");
            return;
        }
        final String str = this.q;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc5b89edef7e9e20b062a55e28d42404", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc5b89edef7e9e20b062a55e28d42404")).booleanValue();
        } else if (!this.r && Privacy.createPermissionGuard() != null) {
            int a2 = Privacy.createPermissionGuard().a(this.b, PermissionGuard.PERMISSION_CAMERA, str);
            if (a2 > 0) {
                z = true;
            } else {
                this.r = true;
                this.s = a2 != -4;
                Privacy.createPermissionGuard().a((Activity) this.b, PermissionGuard.PERMISSION_CAMERA, str, (com.meituan.android.privacy.interfaces.d) new com.meituan.android.privacy.interfaces.g() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.8
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str2, int i) {
                        Object[] objArr3 = {str2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c0c6236c7eb17adde899acba6096aac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c0c6236c7eb17adde899acba6096aac");
                        } else if (i > 0) {
                            SGScanProductDelegateImpl.d(SGScanProductDelegateImpl.this, false);
                            SGScanProductDelegateImpl.this.c.a();
                            SGScanProductDelegateImpl.this.a(true);
                        } else {
                            boolean z2 = Privacy.createPermissionGuard().a(SGScanProductDelegateImpl.this.b, PermissionGuard.PERMISSION_CAMERA, str) != -4;
                            if (SGScanProductDelegateImpl.this.s || SGScanProductDelegateImpl.this.s != z2) {
                                SGScanProductDelegateImpl.this.m();
                            } else if (z2) {
                            } else {
                                new AlertDialog.Builder(SGScanProductDelegateImpl.this.b).setMessage(R.string.mbar_camera_permission_desc).setPositiveButton(R.string.mbar_camera_permission_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.8.3
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "136a66dc00ac0f0475cc9dbd77220ae7", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "136a66dc00ac0f0475cc9dbd77220ae7");
                                            return;
                                        }
                                        SGScanProductDelegateImpl.d(SGScanProductDelegateImpl.this, false);
                                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        intent.setData(Uri.parse("package:" + SGScanProductDelegateImpl.this.b.getPackageName()));
                                        SGScanProductDelegateImpl.this.b.startActivity(intent);
                                    }
                                }).setNegativeButton(R.string.mbar_camera_permission_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.8.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "47b40df6c75c2f2600ea860914034eb6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "47b40df6c75c2f2600ea860914034eb6");
                                        } else {
                                            SGScanProductDelegateImpl.this.m();
                                        }
                                    }
                                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.8.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnCancelListener
                                    public final void onCancel(DialogInterface dialogInterface) {
                                        Object[] objArr4 = {dialogInterface};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d780dc9a178a7c69b93a8f4ed050b9fa", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d780dc9a178a7c69b93a8f4ed050b9fa");
                                        } else {
                                            SGScanProductDelegateImpl.this.m();
                                        }
                                    }
                                }).show();
                            }
                        }
                    }
                });
            }
        }
        if (z) {
            this.c.a();
            if (!this.p) {
                a(true);
            }
        }
        com.sankuai.waimai.store.manager.judas.d.a(this.b);
        com.sankuai.waimai.store.manager.judas.d.b(this.b, "c_waimai_trjbpius").b("poi_id", Long.valueOf(this.f)).a();
        com.sankuai.waimai.store.manager.judas.d.a(this.b, "c_waimai_trjbpius");
        n();
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f0ac198feb17aa4a571133a7e93dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f0ac198feb17aa4a571133a7e93dc5");
            return;
        }
        com.sankuai.waimai.store.manager.judas.d.d(this.b, "c_waimai_trjbpius");
        this.c.b();
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ee50a3f9e7e2b0f627dce060bc6db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ee50a3f9e7e2b0f627dce060bc6db0");
            return;
        }
        this.c.d();
        this.d.a();
        com.sankuai.waimai.store.base.net.c.a(this.b.w());
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.meituan.android.bus.a.a().b(this);
        if (this.g != null) {
            this.g.a();
        }
        b bVar = this.k;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.c;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2741707ae80b554f2e2235eb5d2bff06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2741707ae80b554f2e2235eb5d2bff06");
        } else {
            f.a().a(bVar.d);
        }
        this.l.animate().cancel();
        this.l.clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62093b77af94e089b6d5fd250f95824d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62093b77af94e089b6d5fd250f95824d");
        } else if (this.d != null) {
            if (z) {
                this.d.setVisibility(0);
                this.d.a(this.d.getFramingRect());
                return;
            }
            this.d.a();
            this.p = true;
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1ec4d1376830fd3a4e6495993706f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1ec4d1376830fd3a4e6495993706f6");
        } else if (enumC1205a == a.EnumC1205a.LOGIN && com.sankuai.waimai.store.manager.user.a.a().b()) {
            if (this.g != null) {
                this.g.b();
            }
            ab.b().a((Context) this.b, "poi_coupon_need_login", false);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580e671bbe4b5cb4ddd27be91f139d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580e671bbe4b5cb4ddd27be91f139d0e");
        } else if (bVar == a.b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER && this.g != null) {
            this.g.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac69ba62d8d02fd428dee30a9033c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac69ba62d8d02fd428dee30a9033c17");
            return;
        }
        if (this.w) {
            k();
        }
        if (this.g != null) {
            this.g.h();
        }
    }

    @Override // com.meituan.android.edfu.mbar.view.QRScanView.a
    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c4f2330d1bda63e10344d0533412f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c4f2330d1bda63e10344d0533412f5");
        } else if (TextUtils.isEmpty(lVar.a())) {
        } else {
            this.x = lVar.a();
            this.k.a(lVar.a());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.mbar.a.b
    public final SCBaseActivity a() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.mbar.a.b
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.mbar.a.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb46ef0482c1fa69e09ab75ffa370fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb46ef0482c1fa69e09ab75ffa370fab");
            return;
        }
        u.a(this.n);
        u.b(this.d);
        a(false);
        n();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.mbar.a.b
    public final void a(List<GoodsSpu> list, String str) {
        Map<String, Object> b;
        JSONArray jSONArray;
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8445cb101ee1df84fb513ea05f88156a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8445cb101ee1df84fb513ea05f88156a");
            return;
        }
        this.x = str;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            d();
            return;
        }
        a(this.d.getFramingRect(), list);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca3ecdca068e32c5608bab43278a2bf9", RobustBitConfig.DEFAULT_VALUE)) {
            b = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca3ecdca068e32c5608bab43278a2bf9");
        } else {
            b = this.e == null ? null : com.sankuai.waimai.store.shopping.cart.util.a.b(this.e.d());
        }
        if (b == null || b.size() <= 0) {
            b = new HashMap<>();
        }
        Map<String, Object> map = b;
        try {
            jSONArray = new JSONArray(com.sankuai.waimai.store.util.i.a(list));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        map.put("scan_products", jSONArray);
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77f15003911ffcbd23833fce64123e4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77f15003911ffcbd23833fce64123e4f");
        } else {
            this.m = new a(this.b, this.e, this.y, str);
            this.t = new BaseModuleDesc();
            this.t.moduleId = "scan-product-card";
            this.t.templateId = "supermarket-scan-product-card";
            this.t.moduleTitle = "scan";
            this.t.nativeId = "mach";
            BaseModuleDesc.a aVar = new BaseModuleDesc.a();
            aVar.a = 0;
            aVar.b = 0;
            this.t.layoutInfo = aVar;
            this.l.removeAllViews();
            this.l.addView(this.m.d, new ViewGroup.LayoutParams(-2, -2));
        }
        if (this.m != null) {
            this.t.jsonData = map;
            this.m.a(this.t, 0, true);
        }
        if (com.sankuai.shangou.stone.util.a.a((List) list) > 1) {
            a(this.d.getFramingRect(), list);
            u.a(this.l);
            a(false);
        } else if (com.sankuai.shangou.stone.util.a.a((List) list) != 1 || com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0) == null) {
        } else {
            if (!((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0)).isManySku()) {
                this.w = false;
                this.k.a((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
                return;
            }
            u.a(this.l);
            a(false);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.mbar.a.b
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2e3535ac819646e93d224f4160acc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2e3535ac819646e93d224f4160acc5");
        } else {
            k();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.mbar.a.b
    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42515bf748229fb28d1e4cb65cfac41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42515bf748229fb28d1e4cb65cfac41");
            return;
        }
        a(false);
        FrameLayout frameLayout = this.l;
        Object[] objArr2 = {frameLayout};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1ca3a61c64a8332b755739fc0e13ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1ca3a61c64a8332b755739fc0e13ec8");
            return;
        }
        u.a(frameLayout);
        int b = h.b(this.b) - (this.d.getFramingRect().bottom + frameLayout.getHeight());
        this.l.setPivotX(0.0f);
        this.l.setPivotY(frameLayout.getHeight() / 2.0f);
        this.l.animate().alpha(0.8f).scaleX(0.2f).scaleY(0.2f).translationY(b).setStartDelay(500L).setInterpolator(new LinearInterpolator()).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanProductDelegateImpl.6
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr3 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a2c381dab47e97376b1507380c20765", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a2c381dab47e97376b1507380c20765");
                    return;
                }
                u.c(SGScanProductDelegateImpl.this.l);
                SGScanProductDelegateImpl.this.l.setAlpha(1.0f);
                SGScanProductDelegateImpl.this.l.setScaleX(1.0f);
                SGScanProductDelegateImpl.this.l.setScaleY(1.0f);
                SGScanProductDelegateImpl.this.l.setTranslationY(0.0f);
                SGScanProductDelegateImpl.this.a(SGScanProductDelegateImpl.this.d.getFramingRect(), (List<GoodsSpu>) null);
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.shopcartbridge.event.a());
                SGScanProductDelegateImpl.this.k();
            }
        }).setStartDelay(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1c6c7bd7aa4e7e2fa207b4dab58a7e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1c6c7bd7aa4e7e2fa207b4dab58a7e1");
        } else if (this.n == null || this.n.getVisibility() != 0) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_waimai_trjbpius", "b_waimai_335xu5nj_mv").a("poi_id", Long.valueOf(this.f)).a("upc_code", t.a(this.x) ? "-999" : this.x).a();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onScanMachAddEvent(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17de12d5b3f56e80fc383b75f64363c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17de12d5b3f56e80fc383b75f64363c6");
        } else if (this.k == null || com.sankuai.waimai.store.util.b.a(this.b)) {
        } else {
            this.k.a(c1218a);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onScanDialogDismiss(com.sankuai.waimai.store.skuchoose.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d431697d21eccdb65ddf751ae01850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d431697d21eccdb65ddf751ae01850");
        } else if (hVar == null || hVar.a != 0) {
        } else {
            k();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;
        private com.sankuai.waimai.store.platform.domain.manager.poi.a e;
        private d f;
        private String g;

        public a(@NonNull Context context, @NotNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, d dVar, @Nullable String str) {
            super(context);
            Object[] objArr = {SGScanProductDelegateImpl.this, context, aVar, dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8979ba1b1239f5a75addc6591212042d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8979ba1b1239f5a75addc6591212042d");
                return;
            }
            this.e = aVar;
            this.f = dVar;
            this.g = str;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e162550db18fad055b211a4dea58811", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e162550db18fad055b211a4dea58811");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("wm_poi_id", Long.valueOf(this.e.f()));
            hashMap.put("buz_type", Integer.valueOf(this.e.b.getBuzType()));
            hashMap.put("upc_code", t.a(this.g) ? "-999" : this.g);
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, com.sankuai.waimai.store.mach.event.b> a(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e4f856a21199d886afa477a872bc4f", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e4f856a21199d886afa477a872bc4f");
            }
            HashMap hashMap = new HashMap();
            com.sankuai.waimai.store.poi.list.newp.methods.g gVar = new com.sankuai.waimai.store.poi.list.newp.methods.g(this.f, true);
            hashMap.put("goods_detail_sku_dialog", gVar);
            hashMap.put("scan_close_product_card", gVar);
            return hashMap;
        }
    }
}
