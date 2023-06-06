package com.sankuai.waimai.bussiness.order.detail;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.rocks.d;
import com.sankuai.waimai.bussiness.order.rocks.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.cube.BasePGAActivity;
import com.sankuai.waimai.platform.utils.g;
import com.sankuai.waimai.platform.utils.j;
import java.util.HashMap;
import java.util.Map;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMOrderDetailActivity extends BasePGAActivity implements FFPTags {
    public static ChangeQuickRedirect a;
    public f b;
    private k c;
    private d d;
    private int e;

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final void m() {
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603275e08d0740f0fe35d0b4c8e30df8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603275e08d0740f0fe35d0b4c8e30df8");
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.bussiness.order.base.config.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d7c4ff6020985e507bc8d8732ab971a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d7c4ff6020985e507bc8d8732ab971a");
        } else {
            com.sankuai.waimai.platform.capacity.immersed.a.b(this, true);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1170d361674b8bd0a639599dd9d35f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1170d361674b8bd0a639599dd9d35f89");
        } else {
            rx.d a2 = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.a.class).e().b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a());
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            this.c = a2.c(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a01d03aac6fed75f49a1686f85af1b0c", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a01d03aac6fed75f49a1686f85af1b0c") : new b(this));
        }
        g.a(this);
    }

    public static /* synthetic */ void a(WMOrderDetailActivity wMOrderDetailActivity, com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.a aVar) {
        Object[] objArr = {wMOrderDetailActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "273fbb3b6fd2a6e46fef4c122d88f9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "273fbb3b6fd2a6e46fef4c122d88f9f8");
            return;
        }
        if (aVar != null && aVar.b != null) {
            Intent intent = new Intent();
            intent.putExtra("dingDanStatus", aVar.b.e);
            intent.putExtra("pay_status", aVar.b.f);
            intent.putExtra("logistics_status", aVar.b.g);
            intent.putExtra("orderid", aVar.a);
            wMOrderDetailActivity.setResult(-1, intent);
        }
        wMOrderDetailActivity.finish();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc254506c0f15b88a8a1585ac9b42b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc254506c0f15b88a8a1585ac9b42b94");
            return;
        }
        try {
            this.b.aS_();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8a8dc544f2164681a7b3214a197279", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8a8dc544f2164681a7b3214a197279");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "waimai_order_status");
        return hashMap;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b258b33837a4a44cc42911c3739ae3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b258b33837a4a44cc42911c3739ae3b2");
            return;
        }
        Intent intent = getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b65521ec40c540f777cfecd5adfadce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b65521ec40c540f777cfecd5adfadce2");
        } else if (intent != null && !intent.hasExtra("order_status")) {
            intent.putExtra("order_status", com.sankuai.waimai.platform.utils.f.a(intent, "dingDanStatus", 0));
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "hash_id", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = com.sankuai.waimai.foundation.router.a.a(intent, "hash_id", "");
        }
        if (TextUtils.isEmpty(a2) && intent != null && intent.getData() != null) {
            a2 = intent.getData().getQueryParameter("oid");
        }
        String generatePageInfoKey = AppUtil.generatePageInfoKey(this);
        Object[] objArr3 = {generatePageInfoKey, "order_id", a2};
        ChangeQuickRedirect changeQuickRedirect3 = JudasManualManager.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fa44600b57b573e2070e020be48f2db6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fa44600b57b573e2070e020be48f2db6");
        } else {
            Statistics.setValLab(generatePageInfoKey, "order_id", a2);
        }
        JudasManualManager.a("c_hgowsqb", this);
        super.onResume();
        Metrics.getInstance().setScrollCustom(this);
        if (com.sankuai.waimai.foundation.core.a.d()) {
            com.sankuai.waimai.bussiness.order.b.a(bB_());
            com.sankuai.waimai.foundation.utils.log.a.b("WMOrderDetailActivity", "showCSFloating", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb6afb668251a75a7b96cfc5c1f817b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb6afb668251a75a7b96cfc5c1f817b");
            return;
        }
        super.onPause();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e5cecf6e5a72ace7ed9ab924f77737af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e5cecf6e5a72ace7ed9ab924f77737af");
        }
        if (com.sankuai.waimai.foundation.core.a.d()) {
            com.sankuai.waimai.bussiness.order.b.b(bB_());
            com.sankuai.waimai.foundation.utils.log.a.b("WMOrderDetailActivity", "hideCSFloating", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e49ab82a820896184cb24d3507160e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e49ab82a820896184cb24d3507160e9");
            return;
        }
        if (this.c != null) {
            this.c.unsubscribe();
            this.c = null;
        }
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.platform.cube.BasePGAActivity
    public final com.meituan.android.cube.pga.core.a f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237084f2483479ae4f95cc412c485abd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237084f2483479ae4f95cc412c485abd");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afaa25914f95f1d872ad72d3ebfb0fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afaa25914f95f1d872ad72d3ebfb0fd2");
        } else {
            if (this.d == null) {
                this.d = new d(this);
            }
            if (this.b == null) {
                this.b = new f(this.d);
            }
        }
        return this.d;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final com.meituan.android.cube.core.f g() {
        return this.b;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94db28554281cef36c6976d51ace637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94db28554281cef36c6976d51ace637");
            return;
        }
        super.onSaveInstanceState(bundle);
        j.a(bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b262f05aaaa90ee68269a690e1f2eeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b262f05aaaa90ee68269a690e1f2eeb0");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration.screenWidthDp != this.e) {
            f fVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.r;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "edd503ffaa7c258cd66098fe239dbf6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "edd503ffaa7c258cd66098fe239dbf6b");
            } else if (!fVar.u && (fVar.x == null || !fVar.x.isComputingLayout())) {
                if (fVar.C != null) {
                    fVar.B = false;
                    fVar.x.removeItemDecoration(fVar.C);
                    fVar.C = null;
                }
                if (fVar.w != null && !fVar.w.b()) {
                    fVar.a(fVar.w.c);
                }
                ((d) fVar.F()).t.a((com.meituan.android.cube.pga.common.j<Boolean>) Boolean.TRUE);
            }
            this.e = configuration.screenWidthDp;
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7d5be2d610b16ff6c7a365b6306d42", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7d5be2d610b16ff6c7a365b6306d42");
        }
        HashMap hashMap = new HashMap();
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b a2 = this.d.A.a();
        if (a2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1ecaf47ce28b8c17235f6713fddc859b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1ecaf47ce28b8c17235f6713fddc859b")).booleanValue() : TextUtils.equals(a2.t, "health")) {
                hashMap.put("__ffpdp", "003");
                return hashMap;
            }
        }
        if (this.d.J.a().z == 2) {
            hashMap.put("__ffpdp", "002");
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.platform.cube.BaseCubeActivity
    public final /* bridge */ /* synthetic */ com.meituan.android.cube.core.f j() {
        return this.b;
    }
}
