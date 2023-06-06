package com.meituan.passport;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class AbsLoginActivityImpl extends BaseActivity implements m {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa42bf62ea2141e773a22f8187c5838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa42bf62ea2141e773a22f8187c5838");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a0f5a7ddf2616a4b802cfbb0628b539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a0f5a7ddf2616a4b802cfbb0628b539");
            return;
        }
        com.meituan.passport.plugins.t tVar = com.meituan.passport.plugins.q.a().k;
        if (tVar == null || !tVar.a(this)) {
            return;
        }
        new Object() { // from class: com.meituan.passport.AbsLoginActivityImpl.1
        };
    }

    @Override // com.meituan.passport.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba15be8d8975fe619789d5cee33e7855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba15be8d8975fe619789d5cee33e7855");
        } else {
            a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd241637031dad52d78894301d43305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd241637031dad52d78894301d43305");
            return;
        }
        super.onBackPressed();
        overridePendingTransition(0, 0);
        String str = com.meituan.passport.login.e.a().b;
        if (!isFinishing() || TextUtils.equals(str, "operator_login_dialog_to_other")) {
            return;
        }
        UserCenter.getInstance(this).loginCancel();
        af.a(getApplicationContext(), getPackageName());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e5fba6b7364d0ede6b47d07efd44ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e5fba6b7364d0ede6b47d07efd44ce");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1) {
            setResult(-1);
            finish();
        }
        com.meituan.android.privacy.aop.a.b();
    }
}
