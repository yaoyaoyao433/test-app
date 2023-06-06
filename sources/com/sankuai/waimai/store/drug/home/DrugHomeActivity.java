package com.sankuai.waimai.store.drug.home;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.drug.home.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.drug.home.refactor.cat.DrugHomeMonitor;
import com.sankuai.waimai.store.drug.home.tab.TabManager;
import com.sankuai.waimai.store.drug.home.tab.d;
import com.sankuai.waimai.store.drug.home.util.c;
import com.sankuai.waimai.store.drug.init.DrugInit;
import com.sankuai.waimai.store.mach.e;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.am;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugHomeActivity extends SCBaseActivity {
    public static ChangeQuickRedirect a;
    private d b;
    private com.sankuai.waimai.store.param.a e;
    private PoiPageViewModel f;
    private boolean g;
    private boolean h;
    private boolean i;
    private MetricsSpeedMeterTask j;

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final String t() {
        return DefaultHeaderService.KEY_DRUG;
    }

    public DrugHomeActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f2d4e905c1691a4f860a1a4b526d4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f2d4e905c1691a4f860a1a4b526d4f");
            return;
        }
        this.b = new TabManager();
        this.j = null;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062ca0b1bf5b52a3c343a732205c1656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062ca0b1bf5b52a3c343a732205c1656");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14e4c4f0940369af5e40a0178acbc466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14e4c4f0940369af5e40a0178acbc466");
        } else {
            this.e = new com.sankuai.waimai.store.param.a();
            this.e.D = true;
            if (bundle != null) {
                this.e.a(bundle);
            } else if (com.sankuai.waimai.store.router.d.a(bB_().getIntent())) {
                this.e.d(bB_());
            } else {
                this.e.b(bB_());
            }
            this.e.y = false;
            this.e.G = "c_waimai_v091vllx";
        }
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.home.model.b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5573ca772d18ffbbf730ff02c444bab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5573ca772d18ffbbf730ff02c444bab1");
        } else {
            com.sankuai.waimai.store.drug.home.model.b.b = getApplicationContext();
        }
        a(true, true);
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(this.e.c));
        Object[] objArr4 = {this, hashMap};
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c2e590f69a497a2db05474234f4a0557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c2e590f69a497a2db05474234f4a0557");
        } else {
            try {
                c.a(this, hashMap);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        this.f = (PoiPageViewModel) q.a((FragmentActivity) this).a(PoiPageViewModel.class);
        PoiPageViewModel poiPageViewModel = this.f;
        com.sankuai.waimai.store.param.a aVar = this.e;
        Object[] objArr5 = {aVar};
        ChangeQuickRedirect changeQuickRedirect5 = PoiPageViewModel.a;
        if (PatchProxy.isSupport(objArr5, poiPageViewModel, changeQuickRedirect5, false, "120bc94e81c47481b0ce50aab43e4ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, poiPageViewModel, changeQuickRedirect5, false, "120bc94e81c47481b0ce50aab43e4ebb");
        } else {
            poiPageViewModel.d.b((k<com.sankuai.waimai.store.param.a>) aVar);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c21c55e125c55be0410a8a5225ee3dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c21c55e125c55be0410a8a5225ee3dff");
        } else {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setId(R.id.wm_drug_home_fragment_container);
            linearLayout.addView(frameLayout);
            setContentView(linearLayout, new LinearLayout.LayoutParams(-1, -1));
            this.b.a(this, linearLayout, frameLayout, this.e);
            j.h().f();
        }
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        e.b();
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.drug.mach.a.a;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "3f56b481e8282ea4167c9fea642fa735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "3f56b481e8282ea4167c9fea642fa735");
        } else {
            com.sankuai.waimai.store.drug.mach.a.a("drug-homepage");
        }
        com.sankuai.waimai.store.order.a.e().d = false;
        k<Boolean> kVar = this.f.g;
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.drug.home.util.a.a;
        kVar.b((k<Boolean>) Boolean.valueOf(PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "b5f83f005dacf78a5ed3f848ac213659", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "b5f83f005dacf78a5ed3f848ac213659")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("optimize/drug_open_customer_fps", false)));
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.store.drug.home.refactor.cat.a.a;
        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "98467e6d08336c8640055a7ae264d918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "98467e6d08336c8640055a7ae264d918");
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("page_launch_status", DrugInit.sIsColdRunning ? "0" : "1");
        com.sankuai.waimai.store.util.monitor.c.b(new DrugHomeMonitor("DrugHomeCreate"), null, null, hashMap2);
        DrugInit.sIsColdRunning = false;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe62b66fe0ad285e760ee3d7442685d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe62b66fe0ad285e760ee3d7442685d");
            return;
        }
        if (this.j != null && !this.h) {
            this.j.recordStep("activity_resume");
            this.h = true;
        }
        com.sankuai.waimai.store.manager.judas.d.a(this);
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
        if (this.f.b()) {
            Metrics.getInstance().setScrollCustom(this);
        }
        if (this.f.n) {
            this.f.n = false;
            if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                return;
            }
            am.a((Activity) this, getString(R.string.drug_homepage_user_un_login_tip));
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86705a6b208318fce8748f1910d70bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86705a6b208318fce8748f1910d70bbb");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac3324da873ed56c726c3611750bdde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac3324da873ed56c726c3611750bdde");
            return;
        }
        if (this.j != null && !this.g) {
            this.j.recordStep("activity_start");
            this.g = true;
        }
        super.onStart();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7363992b0e3cbbdfe02995d5a38bd92e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7363992b0e3cbbdfe02995d5a38bd92e");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634e7b1216ae7fe39ebd5d96d4fcdb52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634e7b1216ae7fe39ebd5d96d4fcdb52");
            return;
        }
        if (this.j != null && z && !this.i) {
            this.j.recordStep("activity_interactive");
            this.i = true;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5010288fc6ddcc30567a45c082a0d178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5010288fc6ddcc30567a45c082a0d178");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.e.b(bundle);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36941c83dfcd9d4c163c5214f1b506c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36941c83dfcd9d4c163c5214f1b506c");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
        f.a().a(hashCode());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e009ee3d63e5ffb26a3bdb8bb4f06500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e009ee3d63e5ffb26a3bdb8bb4f06500");
        } else {
            String a2 = aa.a(getIntent(), "key_pre_request_cache", "");
            com.sankuai.waimai.store.base.preload.e.a().a(a2);
            if (!TextUtils.isEmpty(a2)) {
                com.sankuai.waimai.store.base.net.c.a(a2);
            }
            com.sankuai.waimai.store.base.preload.f.a(a2);
        }
        this.b.a();
    }

    public final MetricsSpeedMeterTask g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94f00038d9396309c5759e662e699918", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94f00038d9396309c5759e662e699918") : this.j == null ? s() : this.j;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e0e4d0ca433bee0052c0e5c55fcb03", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e0e4d0ca433bee0052c0e5c55fcb03");
        }
        Fragment b = this.b.b();
        if (b instanceof SCBaseFragment) {
            return ((SCBaseFragment) b).b();
        }
        return this.e.G;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3168b8c48499e3b0236163785c721f3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3168b8c48499e3b0236163785c721f3") : com.sankuai.waimai.store.manager.judas.b.a(this.b.b());
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b71cb477f96186644ec1741532fa5c1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b71cb477f96186644ec1741532fa5c1f");
        } else if (this.b.c()) {
            super.onBackPressed();
        }
    }
}
