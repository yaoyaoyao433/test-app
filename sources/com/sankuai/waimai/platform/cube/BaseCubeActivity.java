package com.sankuai.waimai.platform.cube;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.cube.core.f;
import com.meituan.android.cube.core.g;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseCubeActivity extends BaseActivity {
    public static ChangeQuickRedirect m;
    private g a;

    public abstract f g();

    public abstract void m();

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556ae8c1549b3b519ee55a9f3226d22b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556ae8c1549b3b519ee55a9f3226d22b");
            return;
        }
        super.onCreate(bundle);
        this.a = o();
        this.a.a(this, bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f9eaa236350b2877718d9aa8621fdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f9eaa236350b2877718d9aa8621fdd");
            return;
        }
        super.onStart();
        this.a.a();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c94ad5d0afb97aaf8ba5826bd50a2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c94ad5d0afb97aaf8ba5826bd50a2f6");
            return;
        }
        m();
        super.onResume();
        this.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bfcd20b11754f371b22b5a258cdbc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bfcd20b11754f371b22b5a258cdbc3");
            return;
        }
        super.onPause();
        this.a.c();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4429dd8fea0f8e1be525710e3666b9ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4429dd8fea0f8e1be525710e3666b9ae");
            return;
        }
        super.onStop();
        this.a.d();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b492b2aba7bc6a0c72c9575437fa7382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b492b2aba7bc6a0c72c9575437fa7382");
            return;
        }
        this.a.e();
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2583b4b57fc0e5ced161df3e99ce0b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2583b4b57fc0e5ced161df3e99ce0b2c");
            return;
        }
        super.onNewIntent(intent);
        this.a.a(intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d259e23a0be927bf333079f474e5cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d259e23a0be927bf333079f474e5cb8");
            return;
        }
        a.a();
        super.onActivityResult(i, i2, intent);
        this.a.a(i, i2, intent);
        a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ee5746c3ef158cbdb99391a66d342d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ee5746c3ef158cbdb99391a66d342d");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (j() instanceof com.meituan.android.cube.pga.block.a) {
            ((com.meituan.android.cube.pga.block.a) j()).b(bundle);
        }
        this.a.a(bundle);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afec0143126fcce5f3fea2ffefbfeabe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afec0143126fcce5f3fea2ffefbfeabe");
            return;
        }
        super.onRestoreInstanceState(bundle);
        if (j() instanceof com.meituan.android.cube.pga.block.a) {
            ((com.meituan.android.cube.pga.block.a) j()).c(bundle);
        }
        this.a.b(bundle);
    }

    public f j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575b47f821745caeca0d9cb50a0d89bc", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575b47f821745caeca0d9cb50a0d89bc") : this.a.f();
    }

    public g o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4563791621d7525faae10cbc638d26ad", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4563791621d7525faae10cbc638d26ad") : new com.meituan.android.cube.core.a(w()) { // from class: com.sankuai.waimai.platform.cube.BaseCubeActivity.1
            public static ChangeQuickRedirect f;

            @Override // com.meituan.android.cube.core.g
            public final f g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a96ee5332dfbb3c4152b1dcb8748e51", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a96ee5332dfbb3c4152b1dcb8748e51") : BaseCubeActivity.this.g();
            }
        };
    }
}
