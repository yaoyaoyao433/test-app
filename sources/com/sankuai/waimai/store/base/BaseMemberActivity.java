package com.sankuai.waimai.store.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseMemberActivity extends SCBaseActivity implements FFPTags, IFFPPageMRN, com.sankuai.waimai.platform.capacity.network.errorhanding.g {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.base.vessel.a b;

    public void a(com.sankuai.waimai.store.event.a aVar) {
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362224f1b5b2246e74b189a8877d7d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362224f1b5b2246e74b189a8877d7d16");
            return;
        }
        super.onCreate(bundle);
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        if (getIntent() != null) {
            String a2 = com.sankuai.waimai.platform.utils.f.a(getIntent(), "vessel_path");
            if (!TextUtils.isEmpty(a2)) {
                com.sankuai.waimai.store.base.vessel.b bVar = (com.sankuai.waimai.store.base.vessel.b) com.sankuai.waimai.store.base.remote.a.a(a2, com.sankuai.waimai.store.base.vessel.b.class);
                if (bVar == null) {
                    finish();
                    return;
                }
                bVar.b(this);
                this.b = bVar.a(this);
                com.sankuai.shangou.stone.util.log.a.c("BaseMemberActivity", "use delegate, path=%s", a2);
            }
        }
        if (this.b != null) {
            this.b.a(bundle);
            this.b.a(this, bundle);
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b29dbb4fdbd04d404e96b16ad6124ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b29dbb4fdbd04d404e96b16ad6124ac");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
        if (this.b != null) {
            this.b.c();
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee049e9697b615f39641dbd39185171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee049e9697b615f39641dbd39185171");
            return;
        }
        super.onStart();
        if (this.b != null) {
            this.b.f();
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e617176caab7d523aaa50b6bd82fce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e617176caab7d523aaa50b6bd82fce8");
            return;
        }
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
        if (this.b != null) {
            this.b.g();
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.errorhanding.g
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5552c32fdd302849f57b6310d7f8b2d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5552c32fdd302849f57b6310d7f8b2d0")).booleanValue();
        }
        if (this.b != null) {
            return this.b.a();
        }
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8835bf6d6bdb3a164c5f2d68a07abc12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8835bf6d6bdb3a164c5f2d68a07abc12");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
        if (this.b != null) {
            this.b.h();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865766bf7d5caff2b59c8dbd64d063e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865766bf7d5caff2b59c8dbd64d063e0");
        } else if (this.b == null || !this.b.b()) {
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ecd9548efd663e95af733c891df994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ecd9548efd663e95af733c891df994");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
        if (this.b != null) {
            this.b.i();
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fff3bbb3017ba2b09c25969f95c73ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fff3bbb3017ba2b09c25969f95c73ab");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.b != null) {
            this.b.b(bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798c0f2660a83336c601814d481915f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798c0f2660a83336c601814d481915f4");
            return;
        }
        super.onNewIntent(intent);
        if (this.b != null) {
            this.b.b(intent);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226995f4e2ec8edc37c8ba5a991996fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226995f4e2ec8edc37c8ba5a991996fb");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.b != null) {
            this.b.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Subscribe
    public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ab0e4c014d4f892a3bc58f364769f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ab0e4c014d4f892a3bc58f364769f8");
        } else if (com.sankuai.waimai.store.util.b.a(this)) {
        } else {
            a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88e065dd1002d518b56ff7de24118a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88e065dd1002d518b56ff7de24118a5");
        }
        if (this.b != null) {
            return this.b.d();
        }
        return super.b();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32936305fabb9dfa793dc0d2678dd1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32936305fabb9dfa793dc0d2678dd1a");
        }
        if (this.b != null) {
            return this.b.j();
        }
        return super.d();
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970ca283bdca1bbcda769b91fb88bb5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970ca283bdca1bbcda769b91fb88bb5b");
        }
        if (this.b != null) {
            return this.b.k();
        }
        return new HashMap();
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    public boolean isMRNPage() {
        return this.b instanceof com.sankuai.waimai.store.mrn.dialog.c;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    @Nullable
    public String mrnBiz() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b645f684295b08ee87509b7436aa5890", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b645f684295b08ee87509b7436aa5890");
        }
        if (this.b instanceof com.sankuai.waimai.store.mrn.dialog.c) {
            return ((com.sankuai.waimai.store.mrn.dialog.c) this.b).d;
        }
        return null;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    @Nullable
    public String mrnEntry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05ae1b8c92f367754611dcfda3cfac4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05ae1b8c92f367754611dcfda3cfac4");
        }
        if (this.b instanceof com.sankuai.waimai.store.mrn.dialog.c) {
            return ((com.sankuai.waimai.store.mrn.dialog.c) this.b).e;
        }
        return null;
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPPageMRN
    @Nullable
    public String mrnComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e4cef385ff3a7db6b2218eebc6add9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e4cef385ff3a7db6b2218eebc6add9");
        }
        if (this.b instanceof com.sankuai.waimai.store.mrn.dialog.c) {
            return ((com.sankuai.waimai.store.mrn.dialog.c) this.b).f;
        }
        return null;
    }
}
