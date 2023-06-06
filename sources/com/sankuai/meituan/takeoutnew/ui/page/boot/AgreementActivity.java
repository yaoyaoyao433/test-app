package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.b;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog;
import com.sankuai.waimai.platform.privacy.dialog.BootAgreementConfirmDialog;
import com.sankuai.waimai.platform.privacy.dialog.BootAgreementDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AgreementActivity extends FragmentActivity {
    public static ChangeQuickRedirect a;
    private static AgreementActivity e;
    private View b;
    private BaseBootAgreementDialog c;
    private BaseBootAgreementDialog d;

    public static /* synthetic */ void a(AgreementActivity agreementActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, agreementActivity, changeQuickRedirect, false, "e2cde9e79b7290a991cf383c03808f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, agreementActivity, changeQuickRedirect, false, "e2cde9e79b7290a991cf383c03808f17");
            return;
        }
        com.sankuai.meituan.takeoutnew.app.launcher.a.a(agreementActivity.getApplication());
        Intent intent = agreementActivity.getIntent();
        Intent intent2 = new Intent();
        intent2.setData(intent.getData());
        intent2.setComponent(intent.getComponent());
        intent2.setPackage(agreementActivity.getApplication().getPackageName());
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        agreementActivity.startActivity(intent2);
        agreementActivity.overridePendingTransition(0, 0);
        agreementActivity.finish();
    }

    public static /* synthetic */ void c(AgreementActivity agreementActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, agreementActivity, changeQuickRedirect, false, "092ab5d917fcfa2ce2b2897352f11fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, agreementActivity, changeQuickRedirect, false, "092ab5d917fcfa2ce2b2897352f11fdc");
            return;
        }
        if (agreementActivity.d == null) {
            agreementActivity.d = new BootAgreementConfirmDialog();
            agreementActivity.d.a(new BaseBootAgreementDialog.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.AgreementActivity.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                public final void a(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4456e36a7d79e0f04d144328d2ebab5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4456e36a7d79e0f04d144328d2ebab5");
                    } else {
                        AgreementActivity.this.a();
                    }
                }

                @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                public final void b(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e5d879e7617948b11ee1b3803a0702e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e5d879e7617948b11ee1b3803a0702e");
                        return;
                    }
                    b.b = false;
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "agreement_affirmed", false);
                    c.a().a(2);
                    com.sankuai.waimai.platform.privacy.a.a().a(false);
                    AgreementActivity.a(AgreementActivity.this);
                }
            });
        }
        agreementActivity.d.b();
        agreementActivity.a(agreementActivity, agreementActivity.d, "agreementConfirmDialog");
        com.sankuai.waimai.platform.privacy.a.a().b(false);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ccdf313aadf3c5a083a36a991cf7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ccdf313aadf3c5a083a36a991cf7fa");
            return;
        }
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
        if (e != null) {
            e.finish();
        }
        e = this;
        super.onCreate(bundle);
        setContentView(R.layout.test_activity_layout);
        this.b = findViewById(R.id.root_layout);
        a();
        com.sankuai.waimai.platform.capacity.deeplink.b.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff615ab5da850c09a7a78f4de30f6c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff615ab5da850c09a7a78f4de30f6c9");
            return;
        }
        if (this.c == null) {
            this.c = new BootAgreementDialog();
            this.c.a(new BaseBootAgreementDialog.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.AgreementActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                public final void a(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6935e8de250334c9f75fe72f738bd78", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6935e8de250334c9f75fe72f738bd78");
                    } else {
                        AgreementActivity.this.b.post(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.AgreementActivity.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "827cd281e8013956b1d26d390cd07538", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "827cd281e8013956b1d26d390cd07538");
                                    return;
                                }
                                b.b = true;
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "agreement_affirmed", true);
                                com.sankuai.waimai.platform.privacy.a.a().a(true);
                                c.a().a(0);
                                AgreementActivity.a(AgreementActivity.this);
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                public final void b(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f9142af5c532316715a81e23e0d75f7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f9142af5c532316715a81e23e0d75f7");
                    } else {
                        AgreementActivity.c(AgreementActivity.this);
                    }
                }
            });
        }
        this.c.b();
        a(this, this.c, "agreementDialog");
        com.sankuai.waimai.platform.privacy.a.a().b(true);
    }

    private void a(FragmentActivity fragmentActivity, Fragment fragment, String str) {
        Object[] objArr = {fragmentActivity, fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6178f2f5bc6c20f250edcf395c6a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6178f2f5bc6c20f250edcf395c6a0d");
        } else if (fragment == null || TextUtils.isEmpty(str) || fragment.isAdded()) {
        } else {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            if (supportFragmentManager.findFragmentByTag(str) != null) {
                return;
            }
            supportFragmentManager.beginTransaction().add(fragment, str).commitAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c120d189b8abba6a6cf9b12b576500ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c120d189b8abba6a6cf9b12b576500ab");
            return;
        }
        e = null;
        super.onDestroy();
    }
}
