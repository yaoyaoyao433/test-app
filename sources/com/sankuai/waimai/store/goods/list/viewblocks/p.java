package com.sankuai.waimai.store.goods.list.viewblocks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.model.SpecModel;
import com.sankuai.waimai.store.goods.list.viewblocks.SGMSCDialogFragment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a = null;
    private static final String d = "p";
    private static final List<String> g = Arrays.asList(Constants.TRAFFIC_URI, "page_height", "need_place_holder", "is_roundview");
    private boolean e;
    private Fragment f;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        return null;
    }

    public p(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0dc6322bc084c2fa92c023e2e31bc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0dc6322bc084c2fa92c023e2e31bc4");
        } else {
            this.e = false;
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a61918981ecec393cba8a7ec912436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a61918981ecec393cba8a7ec912436");
        } else {
            super.a(fragmentActivity, bundle);
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        SGMSCDialogFragment sGMSCDialogFragment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690a9a727329a18c2aad5e1b20b691bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690a9a727329a18c2aad5e1b20b691bc");
            return;
        }
        super.g();
        if (this.e) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e491ad6e09bc55e4e63ab35b98370ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e491ad6e09bc55e4e63ab35b98370ca");
        } else if (l() != null && l().getData() != null) {
            try {
                String a2 = com.sankuai.waimai.store.goods.list.utils.d.a(l(), "page_height", "page_height", "");
                final String a3 = com.sankuai.waimai.store.goods.list.utils.d.a(l(), Constants.TRAFFIC_URI, Constants.TRAFFIC_URI, "");
                String a4 = com.sankuai.waimai.store.goods.list.utils.d.a(l(), "extra", "extra", "");
                boolean a5 = com.sankuai.waimai.store.goods.list.utils.d.a(l(), "need_place_holder", "need_place_holder", false);
                boolean a6 = com.sankuai.waimai.store.goods.list.utils.d.a(l(), "need_place_holder", "is_roundview", false);
                Uri data = l().getData();
                HashMap hashMap = new HashMap();
                Set<String> queryParameterNames = data.getQueryParameterNames();
                if (!com.sankuai.shangou.stone.util.a.b(queryParameterNames)) {
                    for (String str : queryParameterNames) {
                        if (!g.contains(str)) {
                            hashMap.put(str, data.getQueryParameter(str));
                        }
                    }
                    String a7 = com.sankuai.waimai.store.router.g.a(a3, hashMap);
                    HashMap hashMap2 = new HashMap();
                    if (!t.a(a4)) {
                        hashMap2.put("data", new JSONObject(a4));
                    }
                    new StringBuilder("msc url ").append(a7);
                    new StringBuilder("buildUrl2: ").append(System.currentTimeMillis());
                    SGMSCDialogFragment.a a8 = SGMSCDialogFragment.a();
                    a8.d = com.sankuai.shangou.stone.util.f.c(a2);
                    a8.c = a7;
                    a8.f = a5;
                    a8.g = a6;
                    Object[] objArr3 = {null};
                    ChangeQuickRedirect changeQuickRedirect3 = SGMSCDialogFragment.a.a;
                    if (PatchProxy.isSupport(objArr3, a8, changeQuickRedirect3, false, "ef537aa5ba37dc82227ece9fe556282b", RobustBitConfig.DEFAULT_VALUE)) {
                        a8 = (SGMSCDialogFragment.a) PatchProxy.accessDispatch(objArr3, a8, changeQuickRedirect3, false, "ef537aa5ba37dc82227ece9fe556282b");
                    } else {
                        a8.b.putAll(a8.b);
                    }
                    a8.e = hashMap2;
                    a8.h = new i() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.p.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.goods.list.viewblocks.i
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0bd902413ed051e70d77eef88cb39b47", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0bd902413ed051e70d77eef88cb39b47");
                                return;
                            }
                            try {
                                if (TextUtils.equals(Uri.parse(a3).getQueryParameter("targetPath"), "/pages/spec-pop/index")) {
                                    Bundle bundle = new Bundle();
                                    String a9 = com.sankuai.waimai.platform.utils.f.a(p.this.l(), "extra");
                                    SpecModel specModel = (SpecModel) com.sankuai.waimai.store.util.i.a(a9, SpecModel.class);
                                    if (specModel != null && specModel.goods_spu != null) {
                                        bundle.putString("extra", a9);
                                        com.sankuai.waimai.store.router.d.a(p.this.n(), com.sankuai.waimai.store.goods.list.utils.f.a(specModel.goods_spu, p.this.n()), bundle);
                                        p.this.n().finish();
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    };
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = SGMSCDialogFragment.a.a;
                    if (PatchProxy.isSupport(objArr4, a8, changeQuickRedirect4, false, "cec23a0fb9bdd5745edd7e697cd2646a", RobustBitConfig.DEFAULT_VALUE)) {
                        sGMSCDialogFragment = (SGMSCDialogFragment) PatchProxy.accessDispatch(objArr4, a8, changeQuickRedirect4, false, "cec23a0fb9bdd5745edd7e697cd2646a");
                    } else {
                        sGMSCDialogFragment = new SGMSCDialogFragment();
                        SGMSCDialogFragment.b(sGMSCDialogFragment, a8.c);
                        SGMSCDialogFragment.a(sGMSCDialogFragment, a8.e);
                        SGMSCDialogFragment.c(sGMSCDialogFragment, a8.f);
                        SGMSCDialogFragment.d(sGMSCDialogFragment, a8.g);
                        SGMSCDialogFragment.a(sGMSCDialogFragment, a8.h);
                        sGMSCDialogFragment.setStyle(2, R.style.RetailCommonMRNDialog);
                        if (a8.d > 1.0f) {
                            SGMSCDialogFragment.a(sGMSCDialogFragment, com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a(), a8.d));
                        } else if (a8.d > 0.0f && a8.d < 1.0f) {
                            SGMSCDialogFragment.a(sGMSCDialogFragment, (int) (com.sankuai.shangou.stone.util.h.b(com.sankuai.waimai.store.util.b.a()) * a8.d));
                        } else if (a8.d == 1.0f) {
                            SGMSCDialogFragment.a(sGMSCDialogFragment, -1);
                        }
                    }
                    sGMSCDialogFragment.b(n(), d);
                    this.f = sGMSCDialogFragment;
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        this.e = true;
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491dc7fe8146d61e513c230f4755a3c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491dc7fe8146d61e513c230f4755a3c7");
            return;
        }
        super.a(i, i2, intent);
        if (this.f != null) {
            this.f.onActivityResult(i, i2, intent);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
        }

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906148c5c67c57ddcc4b1eec757e44b3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906148c5c67c57ddcc4b1eec757e44b3") : new p(sCBaseActivity);
        }
    }
}
