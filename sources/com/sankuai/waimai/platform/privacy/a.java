package com.sankuai.waimai.platform.privacy;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog;
import com.sankuai.waimai.platform.privacy.dialog.BootAgreementConfirmDialog;
import com.sankuai.waimai.platform.privacy.dialog.BootAgreementDialog;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    BaseBootAgreementDialog b;
    BaseBootAgreementDialog c;
    WeakReference<FragmentActivity> d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45264cb5794a100a891a17f06929c58e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45264cb5794a100a891a17f06929c58e");
        } else {
            this.d = null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.privacy.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1077a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cfceaf5071c0ebaec4d489dc3c454b8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cfceaf5071c0ebaec4d489dc3c454b8") : C1077a.a;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976a05acc503bc5e8800c39bc47061bb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976a05acc503bc5e8800c39bc47061bb")).booleanValue() : c.a().b() == 2;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c4cd74d9bc63fe8584be501903baa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c4cd74d9bc63fe8584be501903baa6");
        } else if (context instanceof FragmentActivity) {
            a((FragmentActivity) context);
        } else {
            Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
            if (b instanceof FragmentActivity) {
                a((FragmentActivity) b);
            }
        }
    }

    public final void a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a441a6ae5409a0730117f4c412c28678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a441a6ae5409a0730117f4c412c28678");
        } else if (fragmentActivity == null || !b()) {
        } else {
            this.d = new WeakReference<>(fragmentActivity);
            c();
        }
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab633e2d16bcfeffddf45e30fdaadd90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab633e2d16bcfeffddf45e30fdaadd90");
            return;
        }
        if (this.c != null) {
            this.c.dismissAllowingStateLoss();
        }
        if (this.b == null) {
            this.b = new BootAgreementDialog();
            this.b.a(new BaseBootAgreementDialog.a() { // from class: com.sankuai.waimai.platform.privacy.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                public final void b(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1164a38bf97288a72273be6c11558300", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1164a38bf97288a72273be6c11558300");
                        return;
                    }
                    final a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c84d7f0fc304668e422ba85b19e75700", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c84d7f0fc304668e422ba85b19e75700");
                        return;
                    }
                    if (aVar.c == null) {
                        aVar.c = new BootAgreementConfirmDialog();
                        aVar.c.a(new BaseBootAgreementDialog.a() { // from class: com.sankuai.waimai.platform.privacy.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                            public final void a(View view2) {
                                Object[] objArr4 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c2e2521848e561ae642e6d8b6351c21", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c2e2521848e561ae642e6d8b6351c21");
                                } else {
                                    a.this.c();
                                }
                            }

                            @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                            public final void b(View view2) {
                                Object[] objArr4 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2a932dcddc9e243090a41ef83ea5de65", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2a932dcddc9e243090a41ef83ea5de65");
                                    return;
                                }
                                if (a.this.b != null && a.this.c != null) {
                                    a.this.c.dismissAllowingStateLoss();
                                    a.this.b.dismissAllowingStateLoss();
                                }
                                a.this.a(false);
                            }
                        });
                    }
                    aVar.c.b();
                    aVar.a(aVar.d.get(), aVar.c, "privacyAgreementConfirmDialog");
                    aVar.b(false);
                }

                @Override // com.sankuai.waimai.platform.privacy.dialog.BaseBootAgreementDialog.a
                public final void a(View view) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03541df242a57861a207d12f3f2efe74", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03541df242a57861a207d12f3f2efe74");
                        return;
                    }
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, "agreement_affirmed", true);
                    a.this.a(true);
                    e createPermissionGuard = Privacy.createPermissionGuard();
                    if (createPermissionGuard != null) {
                        createPermissionGuard.a(b.a, false);
                    }
                    c.a().a(0);
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "9254cb267fb3478bd7c1dec3fabf7f50", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "9254cb267fb3478bd7c1dec3fabf7f50");
                        return;
                    }
                    Context context = b.a;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        context.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "91c2820ccb029166b7c63501ca50e316", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "91c2820ccb029166b7c63501ca50e316");
                            return;
                        }
                        ActivityManager activityManager = (ActivityManager) b.a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                if (runningAppProcessInfo.pid != Process.myPid() && runningAppProcessInfo.processName.contains(b.a.getPackageName())) {
                                    k.b(runningAppProcessInfo.pid);
                                }
                            }
                        }
                        k.b(Process.myPid());
                        k.a(0);
                    }
                }
            });
        }
        this.b.b();
        a(this.d.get(), this.b, "privacyAgreementDialog");
        b(true);
    }

    void a(FragmentActivity fragmentActivity, Fragment fragment, String str) {
        Object[] objArr = {fragmentActivity, fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "880e93d05222172600da111ccb467239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "880e93d05222172600da111ccb467239");
        } else if (fragmentActivity == null || fragment == null || TextUtils.isEmpty(str) || fragment.isAdded()) {
        } else {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            if (supportFragmentManager.findFragmentByTag(str) != null) {
                return;
            }
            supportFragmentManager.beginTransaction().add(fragment, str).commitAllowingStateLoss();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce97f729abd44d234f6227d130e5063c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce97f729abd44d234f6227d130e5063c");
        } else {
            JudasManualManager.a("b_waimai_b4mvufh0_mc", "c_m84bv26", AppUtil.generatePageInfoKey(this)).a("button_name", z ? 1 : 2).a();
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e70a68632d47b87c6c7b9bb12d4489a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e70a68632d47b87c6c7b9bb12d4489a");
        } else {
            JudasManualManager.b("b_waimai_b4mvufh0_mv", "c_m84bv26", AppUtil.generatePageInfoKey(this)).a("button_name", z ? 1 : 2).a();
        }
    }
}
