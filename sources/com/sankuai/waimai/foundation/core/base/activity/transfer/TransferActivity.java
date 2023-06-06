package com.sankuai.waimai.foundation.core.base.activity.transfer;

import android.arch.lifecycle.ReportFragment;
import android.arch.lifecycle.d;
import android.arch.lifecycle.f;
import android.arch.lifecycle.g;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.LifecycleDispatcher;
import com.sankuai.waimai.foundation.utils.d;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TransferActivity extends BaseActivity implements f, MetricsNameProvider {
    public static ChangeQuickRedirect a;
    public static final String b = com.sankuai.waimai.router.utils.f.a("wm_router", "page");
    public BaseActivityDelegate c;
    private g d;
    private LifecycleDispatcher e;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final Uri a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c598d78cae008c27b120fc65b80b19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c598d78cae008c27b120fc65b80b19");
        }
        return null;
    }

    public TransferActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc82b17faf214d84673776e91e8f81bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc82b17faf214d84673776e91e8f81bb");
        } else {
            this.d = new g(this);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2033f5fd405d56819ac7b390969120c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2033f5fd405d56819ac7b390969120c");
            return;
        }
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28d5242d57df3ac817178de96104c986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28d5242d57df3ac817178de96104c986");
        } else if (getIntent() != null && getIntent().getData() != null) {
            if (!b.a()) {
                b.a(getApplicationContext(), (b.a) null);
            }
            if (!com.sankuai.waimai.platform.utils.f.a(getIntent(), "is_from_router_uri_handler", false)) {
                com.sankuai.waimai.foundation.core.a.a(getApplicationContext());
                str = "external_entrance_delegate";
                if (com.sankuai.waimai.foundation.core.a.d() && com.sankuai.waimai.platform.utils.f.a(getIntent(), "is_scheme_dispatch_delegate", false)) {
                    str = "scheme_dispatch_delegate";
                }
            } else {
                String a2 = com.sankuai.waimai.router.utils.f.a(getIntent().getData().getScheme(), getIntent().getData().getHost());
                String path = getIntent().getData().getPath();
                if (b.equals(a2)) {
                    str = "router_page" + path;
                } else {
                    str = "router_uri" + path;
                }
            }
            List a3 = b.a(BaseActivityDelegate.class, str, new Object[0]);
            if (!d.a(a3) && a3.get(0) != null) {
                this.c = (BaseActivityDelegate) a3.get(0);
                this.e = new LifecycleDispatcher(this, this.c, bundle);
                this.c.h = this;
                LifecycleDispatcher lifecycleDispatcher = this.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = LifecycleDispatcher.a;
                if (PatchProxy.isSupport(objArr3, lifecycleDispatcher, changeQuickRedirect3, false, "d4dad953bd38e28b6c87c71ef02df702", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, lifecycleDispatcher, changeQuickRedirect3, false, "d4dad953bd38e28b6c87c71ef02df702");
                } else {
                    lifecycleDispatcher.b.b(lifecycleDispatcher.c, lifecycleDispatcher.d);
                }
            }
        }
        super.onCreate(bundle);
        if (this.c == null) {
            finish();
            return;
        }
        ReportFragment.a(this);
        getLifecycle().a(this.e);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae3e447c2d5b9fdd087eee6b4878bf24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae3e447c2d5b9fdd087eee6b4878bf24");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        LifecycleDispatcher lifecycleDispatcher = this.e;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = LifecycleDispatcher.a;
        if (PatchProxy.isSupport(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "64cdda85e81d22a56a0c8b5f7dbce009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "64cdda85e81d22a56a0c8b5f7dbce009");
        } else {
            lifecycleDispatcher.b.a(lifecycleDispatcher.c, i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af9da60be786f93195a5b2929b8dabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af9da60be786f93195a5b2929b8dabd");
            return;
        }
        this.d.a(d.a.ON_CREATE);
        super.onSaveInstanceState(bundle);
        LifecycleDispatcher lifecycleDispatcher = this.e;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = LifecycleDispatcher.a;
        if (PatchProxy.isSupport(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "2885bd3cef52e5d9b4b779c898523096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "2885bd3cef52e5d9b4b779c898523096");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aafb87d4c411a419d666a223e5c141e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aafb87d4c411a419d666a223e5c141e");
            return;
        }
        super.onRestoreInstanceState(bundle);
        LifecycleDispatcher lifecycleDispatcher = this.e;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = LifecycleDispatcher.a;
        if (PatchProxy.isSupport(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "890f5921dfd2346a9a81cd5d0c1fe679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "890f5921dfd2346a9a81cd5d0c1fe679");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4d29417a75857801cc99c1dcff79ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4d29417a75857801cc99c1dcff79ad8");
            return;
        }
        super.onNewIntent(intent);
        LifecycleDispatcher lifecycleDispatcher = this.e;
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = LifecycleDispatcher.a;
        if (PatchProxy.isSupport(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "d92408a73611186b7427a262b98af2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "d92408a73611186b7427a262b98af2cb");
        } else {
            lifecycleDispatcher.b.a(lifecycleDispatcher.c, intent);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7dd149398aba16496dc8d603faefa09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7dd149398aba16496dc8d603faefa09");
            return;
        }
        LifecycleDispatcher lifecycleDispatcher = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = LifecycleDispatcher.a;
        if (PatchProxy.isSupport(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "8558837bc4d2e44c2cbf2ccc08a0a4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "8558837bc4d2e44c2cbf2ccc08a0a4b5");
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4775a09a64f2482ef9b580b72f8dc4ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4775a09a64f2482ef9b580b72f8dc4ee");
            return;
        }
        if (this.e != null) {
            LifecycleDispatcher lifecycleDispatcher = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = LifecycleDispatcher.a;
            if (PatchProxy.isSupport(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "f7c74e0ae10b6f121a29f4b1228e9784", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, lifecycleDispatcher, changeQuickRedirect2, false, "f7c74e0ae10b6f121a29f4b1228e9784");
            } else {
                lifecycleDispatcher.b.e();
            }
        }
        if (this.c != null) {
            this.c.j();
        } else {
            super.finish();
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91044541163db54e0312290a9e3bb272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91044541163db54e0312290a9e3bb272");
        } else {
            this.c.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5a8051cd2b1f666905a7faab02c656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5a8051cd2b1f666905a7faab02c656");
        } else {
            super.onBackPressed();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fd3e67cc9022f70ff83a62d9d434ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fd3e67cc9022f70ff83a62d9d434ff");
        } else {
            super.finish();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.net.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9951cb6b19d1c19631f884a31f6e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9951cb6b19d1c19631f884a31f6e4e");
            return;
        }
        super.a(i, str);
        this.c.a(i, str);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.net.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df4ff26fb4e8bbf47e430146f91d9ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df4ff26fb4e8bbf47e430146f91d9ee3");
            return;
        }
        super.a(jSONObject);
        this.c.a(jSONObject);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final boolean ao_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38ea3896314b36575534f88fb81227c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38ea3896314b36575534f88fb81227c")).booleanValue() : this.c.aG_();
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public android.arch.lifecycle.d getLifecycle() {
        return this.d;
    }

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df17e300b6bd1236b08e6c83db68cb13", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df17e300b6bd1236b08e6c83db68cb13");
        }
        if (this.c instanceof MetricsNameProvider) {
            return ((MetricsNameProvider) this.c).getName();
        }
        return getClass().getName();
    }
}
