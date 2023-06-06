package com.meituan.passport;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.annotation.IntRange;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.Toast;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.passport.dialogs.ConfirmDialog;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ap {
    public static ChangeQuickRedirect a;
    private static ap b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z, Throwable th);
    }

    public static synchronized ap a() {
        synchronized (ap.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b592d3ab720bec7dc1a2fb44a4d08ee2", RobustBitConfig.DEFAULT_VALUE)) {
                return (ap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b592d3ab720bec7dc1a2fb44a4d08ee2");
            }
            if (b == null) {
                b = new ap();
            }
            return b;
        }
    }

    public final void a(final Activity activity, @IntRange(from = 401, to = 405) final int i, String str, final String str2, final a aVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7827ff2a274a22f2ac30580cf05a0210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7827ff2a274a22f2ac30580cf05a0210");
            return;
        }
        int i2 = R.layout.passport_fragment_privacy_agreement_dialog;
        if (com.meituan.passport.utils.ab.a() == 1) {
            i2 = R.layout.passport_fragment_elder_privacy_agreement_dialog;
        }
        int i3 = i == 404 ? 3 : 2;
        ConfirmDialog.a a2 = ConfirmDialog.a.a();
        a2.l = i2;
        a2.k = i3;
        ConfirmDialog confirmDialog = null;
        final String e = Utils.e(activity, R.string.passport_cancel);
        switch (i) {
            case 401:
                final String e2 = Utils.e(activity, R.string.passport_unlock_goto_login);
                a2.c = Utils.e(activity, R.string.passport_token_invalid_please_relogin);
                a2.f = e;
                a2.e = e2;
                a2.i = new View.OnClickListener() { // from class: com.meituan.passport.ap.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a02a2d6baf203df4d78ee8432d5526eb", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a02a2d6baf203df4d78ee8432d5526eb");
                            return;
                        }
                        com.meituan.passport.utils.aj.a(ConfirmDialog.class, "b_4v0y6glu", "c_4zobz6dy");
                        com.meituan.passport.utils.p.a().a(activity, e, 401);
                    }
                };
                a2.h = new View.OnClickListener() { // from class: com.meituan.passport.ap.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09934e039027d2b724cad82017374c41", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09934e039027d2b724cad82017374c41");
                            return;
                        }
                        com.meituan.passport.utils.aj.a(ConfirmDialog.class, "b_2s9pkzsu", "c_4zobz6dy");
                        com.meituan.passport.utils.p.a().a(activity, e2, 401);
                        Intent intent = new Intent("com.meituan.android.intent.action.login");
                        intent.setPackage(activity.getPackageName());
                        if (intent.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivity(intent);
                        }
                    }
                };
                confirmDialog = a2.b();
                break;
            case 402:
            case 405:
                final String e3 = Utils.e(activity, R.string.passport_phone_call);
                a2.c = Utils.e(activity, R.string.passport_unlock_402_msg);
                a2.f = e;
                a2.i = new View.OnClickListener() { // from class: com.meituan.passport.ap.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed833913b78b163e1f375d3f1ab59007", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed833913b78b163e1f375d3f1ab59007");
                        } else {
                            com.meituan.passport.utils.p.a().a(activity, e, i);
                        }
                    }
                };
                a2.e = e3;
                a2.h = new View.OnClickListener() { // from class: com.meituan.passport.ap.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8c0f94f0643b8318b3c228490a1c057", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8c0f94f0643b8318b3c228490a1c057");
                            return;
                        }
                        com.meituan.passport.utils.p.a().a(activity, e3, i);
                        ap apVar = ap.this;
                        Activity activity2 = activity;
                        Object[] objArr3 = {activity2};
                        ChangeQuickRedirect changeQuickRedirect3 = ap.a;
                        if (PatchProxy.isSupport(objArr3, apVar, changeQuickRedirect3, false, "596db40046a103e6fa64ed5fd5afa842", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, apVar, changeQuickRedirect3, false, "596db40046a103e6fa64ed5fd5afa842");
                            return;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Utils.e(activity2, R.string.passport_service_phone_uri)));
                            intent.addFlags(com.tencent.mapsdk.internal.y.a);
                            activity2.startActivity(intent);
                            Toast.makeText(activity2, Utils.e(activity2, R.string.passport_service_phone_time), 1).show();
                        } catch (ActivityNotFoundException unused) {
                            com.meituan.passport.utils.ae.a(activity2.getWindow().getDecorView().findViewById(16908290), Utils.e(activity2, R.string.passport_device_donot_support_phone_call)).a();
                        }
                    }
                };
                confirmDialog = a2.b();
                break;
            case 403:
                final String e4 = Utils.e(activity, R.string.passport_goto_unlock);
                a2.c = Utils.e(activity, R.string.passport_detect_account_anomaly_locked);
                a2.f = e;
                a2.i = new View.OnClickListener() { // from class: com.meituan.passport.ap.7
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ca1b93a4f036a16dcff407a81a2f8d3", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ca1b93a4f036a16dcff407a81a2f8d3");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("button_name", Utils.e(activity, R.string.passport_cancel));
                        com.meituan.passport.utils.aj.a(ConfirmDialog.class, "b_group_rp4wfccm_mc", "c_group_agcc30yi", hashMap);
                        com.meituan.passport.utils.p.a().a(activity, e, 403);
                    }
                };
                a2.e = e4;
                a2.h = new View.OnClickListener() { // from class: com.meituan.passport.ap.6
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String replace;
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72a04bcd78f885b29b3b8a774994188c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72a04bcd78f885b29b3b8a774994188c");
                            return;
                        }
                        final ap apVar = ap.this;
                        final Activity activity2 = activity;
                        String str3 = str2;
                        final a aVar2 = aVar;
                        Object[] objArr3 = {activity2, str3, aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = ap.a;
                        if (PatchProxy.isSupport(objArr3, apVar, changeQuickRedirect3, false, "5334cfc82405ce9f0bd9ebd3f304d1dd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, apVar, changeQuickRedirect3, false, "5334cfc82405ce9f0bd9ebd3f304d1dd");
                        } else {
                            LocalBroadcastManager.getInstance(com.meituan.android.singleton.b.a()).registerReceiver(new BroadcastReceiver() { // from class: com.meituan.passport.UserLockHandler$9
                                public static ChangeQuickRedirect a;

                                @Override // android.content.BroadcastReceiver
                                public void onReceive(Context context, Intent intent) {
                                    Object[] objArr4 = {context, intent};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "215eab8bfff55b7e832194f3ee22ff7e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "215eab8bfff55b7e832194f3ee22ff7e");
                                        return;
                                    }
                                    com.meituan.passport.utils.n.a("UserLockHandler.unlockUserAccount.onReceive", "receive unlock success action", "");
                                    if (context == null || intent == null || intent.getAction() == null || !"KNB.Channel.Account.UnlockSuccess".equals(intent.getAction())) {
                                        return;
                                    }
                                    if ((activity2 instanceof LoginActivity) && !activity2.isFinishing()) {
                                        activity2.finish();
                                    }
                                    if (aVar2 != null) {
                                        aVar2.a(true, null);
                                    }
                                }
                            }, new IntentFilter("KNB.Channel.Account.UnlockSuccess"));
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = ap.a;
                            if (!PatchProxy.isSupport(objArr4, apVar, changeQuickRedirect4, false, "2d17cc781bdc116acc73ad538eaec7f8", RobustBitConfig.DEFAULT_VALUE)) {
                                switch (com.meituan.passport.plugins.q.a().b().b()) {
                                    case 2:
                                        replace = "https://passport.meituan.com/useraccount/new/unlock?f=android&content={method:unlock,v:2,params:{username:%s}}".replace("passport.meituan.com", "passport.fe.st.meituan.com").replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
                                        break;
                                    case 3:
                                        replace = "https://passport.meituan.com/useraccount/new/unlock?f=android&content={method:unlock,v:2,params:{username:%s}}".replace("passport.meituan.com", "passport.fe.test.sankuai.com").replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
                                        break;
                                    default:
                                        replace = "https://passport.meituan.com/useraccount/new/unlock?f=android&content={method:unlock,v:2,params:{username:%s}}";
                                        break;
                                }
                            } else {
                                replace = (String) PatchProxy.accessDispatch(objArr4, apVar, changeQuickRedirect4, false, "2d17cc781bdc116acc73ad538eaec7f8");
                            }
                            Utils.a(activity2, String.format(replace, str3), Collections.emptyMap());
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("button_name", Utils.e(activity, R.string.passport_goto_unlock));
                        com.meituan.passport.utils.aj.a(ConfirmDialog.class, "b_group_rp4wfccm_mc", "c_group_agcc30yi", hashMap);
                        com.meituan.passport.utils.p.a().a(activity, e4, 403);
                    }
                };
                confirmDialog = a2.b();
                break;
            case 404:
                final String e5 = Utils.e(activity, R.string.passport_unlock_404_click);
                a2.c = Utils.e(activity, R.string.passport_unlock_404_msg);
                a2.g = e5;
                a2.j = new View.OnClickListener() { // from class: com.meituan.passport.ap.8
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45cdab1743c70a27d003d71a616e5b0c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45cdab1743c70a27d003d71a616e5b0c");
                        } else {
                            com.meituan.passport.utils.p.a().a(activity, e5, 404);
                        }
                    }
                };
                confirmDialog = a2.b();
                break;
        }
        if (confirmDialog == null || !(activity instanceof FragmentActivity)) {
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        confirmDialog.show(fragmentActivity.getSupportFragmentManager(), "reopenAgreementDialog");
        com.meituan.passport.utils.y.a(fragmentActivity);
        if (i == 403) {
            com.meituan.passport.utils.aj.b(ConfirmDialog.class, "b_group_rp4wfccm_mv", "c_group_agcc30yi");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        com.meituan.passport.utils.aj.b(ConfirmDialog.class, "b_group_inkl3zu2_mv", "c_group_brsi2nos", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", Integer.valueOf(i));
        hashMap2.put("message", str);
        com.meituan.passport.exception.skyeyemonitor.module.n nVar = (com.meituan.passport.exception.skyeyemonitor.module.n) com.meituan.passport.exception.skyeyemonitor.a.a().a("login_error");
        Object[] objArr2 = {Integer.valueOf(i), hashMap2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.exception.skyeyemonitor.module.n.a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "b30a895b2ad69ea85787871218f693d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "b30a895b2ad69ea85787871218f693d6");
            return;
        }
        switch (i) {
            case 401:
                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "login_error", "login_error_401", "401", hashMap2);
                return;
            case 402:
                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "login_error", "login_error_402", "402", hashMap2);
                return;
            case 403:
                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "login_error", "login_error_403", "403", hashMap2);
                return;
            case 404:
                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "login_error", "login_error_404", "404", hashMap2);
                return;
            case 405:
                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "login_error", "login_error_405", "405", hashMap2);
                return;
            default:
                return;
        }
    }
}
