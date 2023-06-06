package com.sankuai.waimai.business.restaurant.framework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.framework.a;
import com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseFrameworkActivity<RootBlock extends a> extends BasePGAActivity {
    public static ChangeQuickRedirect a;
    private i d;
    private RootBlock e;

    public abstract RootBlock b();

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba804cbd49396bb42493694b4ab01b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba804cbd49396bb42493694b4ab01b9e");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee0b5b544a595ec0f6560ce09bb1ea9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee0b5b544a595ec0f6560ce09bb1ea9d");
            return;
        }
        this.d = new i(this);
        this.d.a(this);
        this.d.d = bundle;
        this.d.e = w();
        this.e = b();
        if (this.e != null) {
            this.e.a(this.d, null, 2);
            setContentView(this.e.a(null));
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e80db83025920a571a2651f660bd3797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e80db83025920a571a2651f660bd3797");
            return;
        }
        super.onStart();
        if (this.e != null) {
            this.e.a(this.d, null, 3);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b06b064dda56bb23916a3622c41a57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b06b064dda56bb23916a3622c41a57c");
            return;
        }
        super.onResume();
        if (this.e != null) {
            this.e.a(this.d, null, 4);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b72ee7806c9c567d90c69e0e298e4fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b72ee7806c9c567d90c69e0e298e4fb");
            return;
        }
        super.onPause();
        if (this.e != null) {
            this.e.a(this.d, null, 3);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b455904f9b6c15de4d1c79435fa41b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b455904f9b6c15de4d1c79435fa41b4e");
            return;
        }
        super.onStop();
        if (this.e != null) {
            this.e.a(this.d, null, 2);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef64a170b6827340967006f1ac5f9f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef64a170b6827340967006f1ac5f9f1");
            return;
        }
        if (this.e != null) {
            this.e.a(this.d, null, 0);
            this.e = null;
        }
        this.d.b(this);
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55974963ef941706963fdf942ae1432c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55974963ef941706963fdf942ae1432c");
            return;
        }
        super.onNewIntent(intent);
        if (this.e != null) {
            this.e.a(com.sankuai.waimai.business.restaurant.framework.handlers.b.class);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec03d0c9a358f6ef3bc14fbc43790f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec03d0c9a358f6ef3bc14fbc43790f2d");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.e != null) {
            this.e.a(com.sankuai.waimai.business.restaurant.framework.handlers.a.class);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.pga.BasePGAActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa0c819456155422f7b581d056909be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa0c819456155422f7b581d056909be");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.e != null) {
            this.e.a(com.sankuai.waimai.business.restaurant.framework.handlers.c.class);
        }
    }
}
