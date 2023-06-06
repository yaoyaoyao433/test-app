package com.sankuai.waimai.store;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.cube.core.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGBaseCubeActivity<T extends com.meituan.android.cube.core.f> extends SCBaseActivity {
    public static ChangeQuickRedirect a;
    protected T b;
    private com.meituan.android.cube.delegate.a e;

    public abstract T aY_();

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8db0011b89bf30e68234336841ef8e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8db0011b89bf30e68234336841ef8e2");
            return;
        }
        super.onCreate(bundle);
        this.e = new com.meituan.android.cube.core.a(w()) { // from class: com.sankuai.waimai.store.SGBaseCubeActivity.1
            public static ChangeQuickRedirect f;

            @Override // com.meituan.android.cube.core.g
            public final com.meituan.android.cube.core.f g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fed7243b971a5500d83bcec28ac1d9c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.android.cube.core.f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fed7243b971a5500d83bcec28ac1d9c");
                }
                SGBaseCubeActivity.this.b = (T) SGBaseCubeActivity.this.aY_();
                return SGBaseCubeActivity.this.b;
            }
        };
        this.e.a(this, bundle);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50f046671ee1208af1127651e58cac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50f046671ee1208af1127651e58cac0");
        } else if (view != null) {
            super.setContentView(view);
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "246875264430dbd27655842966c5d779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "246875264430dbd27655842966c5d779");
            return;
        }
        super.onStart();
        this.e.a();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e537a912af5387f4d924ac6dd33b49d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e537a912af5387f4d924ac6dd33b49d");
            return;
        }
        super.onResume();
        this.e.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813052a30221bec1cc4a34fe737828f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813052a30221bec1cc4a34fe737828f0");
            return;
        }
        super.onPause();
        this.e.c();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a2f8987eb54452ba2007c31cf7228d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a2f8987eb54452ba2007c31cf7228d");
            return;
        }
        super.onStop();
        this.e.d();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15dc0b1ea261bfb2dd04d3cbc8d95ff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15dc0b1ea261bfb2dd04d3cbc8d95ff1");
            return;
        }
        this.e.e();
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad9c0f6164dd3ac11d8984bb497074d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad9c0f6164dd3ac11d8984bb497074d");
            return;
        }
        super.onNewIntent(intent);
        this.e.a(intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d69ad2030f7242fe12e98a6b962873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d69ad2030f7242fe12e98a6b962873");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.e.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c5320483b20a2964b63dd71aafd95e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c5320483b20a2964b63dd71aafd95e");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.e.a(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec97a0de859647b4129dc9d02f19611a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec97a0de859647b4129dc9d02f19611a");
            return;
        }
        super.onRestoreInstanceState(bundle);
        this.e.b(bundle);
    }
}
