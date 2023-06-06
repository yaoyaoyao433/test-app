package com.sankuai.waimai.ugc.creator.framework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseActivity extends FragmentActivity {
    public static ChangeQuickRedirect b;
    a c;

    public abstract b a();

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be749e7ee05bfd3109ce33fbe49f741a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be749e7ee05bfd3109ce33fbe49f741a");
            return;
        }
        this.c = new a() { // from class: com.sankuai.waimai.ugc.creator.framework.BaseActivity.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.ugc.creator.framework.c
            public final b a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ae97513f0743e8c310282029cb23d6f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ae97513f0743e8c310282029cb23d6f") : BaseActivity.this.a();
            }
        };
        this.c.c(this, bundle);
        super.onCreate(bundle);
        this.c.a(this, bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25ecbf060ef4158bf376afe700b779e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25ecbf060ef4158bf376afe700b779e");
            return;
        }
        super.onStart();
        this.c.c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d752d5f4a8edbf5dc42fc1fa0a28c073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d752d5f4a8edbf5dc42fc1fa0a28c073");
            return;
        }
        super.onResume();
        this.c.d();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ca5c4022f126f99d9d537cd2cc4fef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ca5c4022f126f99d9d537cd2cc4fef");
            return;
        }
        super.onPause();
        this.c.e();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e97c97d82feeeacc46bef498dd69fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e97c97d82feeeacc46bef498dd69fea");
            return;
        }
        super.onStop();
        this.c.f();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "926e2551b53f941f606d873d8f46dc69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "926e2551b53f941f606d873d8f46dc69");
            return;
        }
        this.c.g();
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfd69549fbbd2ed74dd60e4c18fe7e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfd69549fbbd2ed74dd60e4c18fe7e4");
            return;
        }
        super.onNewIntent(intent);
        this.c.a(intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7513848e8cb09efd5998343192c9e4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7513848e8cb09efd5998343192c9e4bb");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.c.a(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22a7fa7b0ef452f6604aaf68cb22d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22a7fa7b0ef452f6604aaf68cb22d04");
            return;
        }
        super.onRestoreInstanceState(bundle);
        this.c.b(bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20152912e74b5713e95b6684574926e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20152912e74b5713e95b6684574926e1");
            return;
        }
        a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "300fe3a354fd36c87f62d6022cf2a972", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "300fe3a354fd36c87f62d6022cf2a972")).booleanValue() : aVar.a(new com.sankuai.waimai.ugc.creator.framework.event.b(1000))) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfe3f72cb64e88ba4f3c881d53bc0f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfe3f72cb64e88ba4f3c881d53bc0f3");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        a aVar = this.c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (!(PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cb34fe2fdc03807c25529ba0830ddb38", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cb34fe2fdc03807c25529ba0830ddb38")).booleanValue() : aVar.a(new com.sankuai.waimai.ugc.creator.framework.event.a(i, i2, intent)))) {
            super.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    public final boolean a(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d8dce81599d17a600107c2655bdee1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d8dce81599d17a600107c2655bdee1")).booleanValue() : this.c.a(bVar);
    }
}
