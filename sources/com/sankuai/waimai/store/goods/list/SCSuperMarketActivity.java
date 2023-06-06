package com.sankuai.waimai.store.goods.list;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMscFragment;
import com.sankuai.waimai.store.util.w;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCSuperMarketActivity extends BaseMemberActivity {
    public static ChangeQuickRedirect e;
    protected com.sankuai.waimai.store.goods.list.delegate.a f;
    private boolean g;
    private boolean h;
    private boolean i;
    private PoiTabMscFragment j;
    private final MetricsSpeedMeterTask k;

    public SCSuperMarketActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74c5165b55b615f92ac84afa23a86b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74c5165b55b615f92ac84afa23a86b1");
        } else {
            this.k = MetricsSpeedMeterTask.createCustomSpeedMeterTask("sc_supermarket_page_statistic");
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4494021fe504a07ad99354a18c7451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4494021fe504a07ad99354a18c7451");
            return;
        }
        this.k.recordStep("activity_create");
        super.onCreate(bundle);
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        a(true, true);
        setContentView(R.layout.wm_st_goods_list_common_layout);
        g();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a14e94679aa554c2a54d1bdb8e3c410a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a14e94679aa554c2a54d1bdb8e3c410a");
        } else {
            String a = i.h().a("msc_schemes/poi/spu_list", "");
            if (!TextUtils.isEmpty(a)) {
                this.j = PoiTabMscFragment.a(Uri.parse(a), new HashMap());
                getSupportFragmentManager().beginTransaction().replace(R.id.preload_msc_container, this.j).commitNowAllowingStateLoss();
            }
        }
        this.f.a(this, bundle);
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a018ffff37e3c4fbf962ab50f0351bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a018ffff37e3c4fbf962ab50f0351bd");
        } else {
            this.f = new com.sankuai.waimai.store.goods.list.delegate.impl.e(this, this.k, 1);
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef83a55d18b73c752e6c2ac47e7107b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef83a55d18b73c752e6c2ac47e7107b");
            return;
        }
        if (!this.g) {
            this.k.recordStep("activity_start");
            this.g = true;
        }
        super.onStart();
        if (this.f != null) {
            this.f.f();
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7141cf2eb7326c821e84ed00ad9a168e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7141cf2eb7326c821e84ed00ad9a168e");
            return;
        }
        super.onStop();
        if (this.f != null) {
            this.f.i();
        }
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a8f6fdbffa635b360da3e3b727600f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a8f6fdbffa635b360da3e3b727600f");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.f != null) {
            this.f.b(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0557f61317d79cc068791788ba53bfa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0557f61317d79cc068791788ba53bfa7");
            return;
        }
        super.onNewIntent(intent);
        if (this.f != null) {
            this.f.b(intent);
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0044cf35e1bf175c93ffdcfa4b6d927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0044cf35e1bf175c93ffdcfa4b6d927");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.f != null) {
            this.f.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca747140b47af6cb788d11b24195fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca747140b47af6cb788d11b24195fec");
        } else if (this.f == null || this.f.a()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09fbb987ba469c2d196efc449baba48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09fbb987ba469c2d196efc449baba48");
            return;
        }
        if (!this.h) {
            this.k.recordStep("activity_resume");
            this.h = true;
        }
        try {
            if (this.f != null) {
                this.f.g();
            }
        } catch (Exception e2) {
            com.sankuai.shangou.stone.util.log.a.a(e2);
        }
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ef44ed23b5190284e794c3d5c01617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ef44ed23b5190284e794c3d5c01617");
            return;
        }
        if (z && !this.i) {
            this.k.recordStep("activity_interactive");
            this.i = true;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity
    public final void a(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b3b38208a269cdd740dbf2fb8389ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b3b38208a269cdd740dbf2fb8389ff");
            return;
        }
        super.a(aVar);
        if (this.f == null || !com.sankuai.waimai.store.manager.user.a.a().b()) {
            return;
        }
        com.sankuai.waimai.store.order.a e2 = com.sankuai.waimai.store.order.a.e();
        long f = this.f.d().f();
        long j = aVar.a;
        Object[] objArr2 = {new Long(f), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.a.a;
        if (PatchProxy.isSupport(objArr2, e2, changeQuickRedirect2, false, "d6a077821e1771f55637dae68e9d773a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, e2, changeQuickRedirect2, false, "d6a077821e1771f55637dae68e9d773a")).booleanValue() : e2.b(String.valueOf(f), String.valueOf(j))) {
            this.f.a(true);
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a1d9a60694239e13c7c481adfe768bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a1d9a60694239e13c7c481adfe768bb");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
        if (this.f != null) {
            this.f.h();
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852e9a8a57e002a1fb92f218f5df1a69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852e9a8a57e002a1fb92f218f5df1a69");
            return;
        }
        super.onDestroy();
        if (this.f != null) {
            this.f.c();
        }
        com.sankuai.waimai.store.shopping.cart.f.a().a(hashCode());
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297f251f7dc09617c97fa7ca0f27c966", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297f251f7dc09617c97fa7ca0f27c966") : this.f != null ? this.f.b() : "";
    }

    public final com.sankuai.waimai.store.goods.list.delegate.d h() {
        if (this.f instanceof com.sankuai.waimai.store.goods.list.delegate.d) {
            return (com.sankuai.waimai.store.goods.list.delegate.d) this.f;
        }
        return null;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        com.sankuai.waimai.store.platform.domain.manager.poi.a d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ddaef4ac18436d5fe7f7ac8ef0a640", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ddaef4ac18436d5fe7f7ac8ef0a640");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "sg_supermarket");
        try {
            if (this.f != null && (d = this.f.d()) != null) {
                if (w.c(d.b)) {
                    hashMap.put("page_id", "sg_supermarket_union");
                } else if (w.e(d.b)) {
                    hashMap.put("page_id", "sg_supermarket_standard");
                }
            }
        } catch (Throwable th) {
            com.sankuai.shangou.stone.util.log.a.a(th);
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31afe49b82c33ab85552bfeb99e9f6ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31afe49b82c33ab85552bfeb99e9f6ef");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sg_open_strategy", com.sankuai.waimai.store.base.abtest.a.d() ? ErrorCode.ERROR_TYPE_B : "A");
        return hashMap;
    }
}
