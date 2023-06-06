package com.sankuai.waimai.store.drug.goods.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.goods.list.delegate.impl.l;
import com.sankuai.waimai.store.drug.goods.list.delegate.impl.m;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugPoiActivity extends BaseMemberActivity {
    public static ChangeQuickRedirect e;
    protected com.sankuai.waimai.store.drug.goods.list.delegate.a f;

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final String t() {
        return DefaultHeaderService.KEY_DRUG;
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b94c4338f48a65dbdd072c1dab0771d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b94c4338f48a65dbdd072c1dab0771d");
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        a(true, true);
        setContentView(R.layout.wm_drug_goods_list_common_layout);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e838c2ef70b141dcd220663204859c29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e838c2ef70b141dcd220663204859c29");
        } else if (d.h().a("drug_shop/speed_switch", true)) {
            this.f = new m(this, 1);
        } else {
            this.f = new l(this, 1);
        }
        this.f.a(this, bundle);
        if (getIntent() == null || !f.a(getIntent(), "from_sg", false)) {
            com.sankuai.waimai.store.drug.goods.list.utils.a.a();
        }
        com.sankuai.waimai.store.drug.goods.list.utils.a.b(this.f.d());
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80cba2510ae18fc6ad3cce6162fbadb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80cba2510ae18fc6ad3cce6162fbadb2");
            return;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae491d10489c6b4b02911f6456a6c00d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae491d10489c6b4b02911f6456a6c00d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528f302ef5be74fb19b24c7865e0d550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528f302ef5be74fb19b24c7865e0d550");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a326b8bf0a5bbdcf7c08610e058e82ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a326b8bf0a5bbdcf7c08610e058e82ad");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7c87de26789f3d40a96f16ad83ba5ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7c87de26789f3d40a96f16ad83ba5ec");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589132709d84cb2ddeada47e2a909d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589132709d84cb2ddeada47e2a909d07");
        } else if (this.f == null || this.f.a()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d986e556d116c8b21961d5f0972dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d986e556d116c8b21961d5f0972dbb");
            return;
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

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity
    public final void a(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2dd97bf1b4a5a3d8c342da502a3e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2dd97bf1b4a5a3d8c342da502a3e35");
            return;
        }
        super.a(aVar);
        if (this.f != null && com.sankuai.waimai.store.manager.user.a.a().b() && com.sankuai.waimai.store.order.a.e().b(this.f.d().g(), this.f.d().h(), aVar.a, aVar.b)) {
            this.f.a(false);
        }
        com.sankuai.waimai.store.drug.coupons.b.a(this);
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c1b09180492000441a8fa94bd4c071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c1b09180492000441a8fa94bd4c071");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24024cbad9b6a9afea410adc95f9cce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24024cbad9b6a9afea410adc95f9cce3");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99962452eb640e4716bbc12998780fbb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99962452eb640e4716bbc12998780fbb") : this.f != null ? this.f.b() : "";
    }

    @Override // com.sankuai.waimai.store.base.BaseMemberActivity, com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd120195d9c04e7a495190ebb7f8839a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd120195d9c04e7a495190ebb7f8839a");
        }
        if (this.f != null) {
            return this.f.j();
        }
        return new HashMap();
    }
}
