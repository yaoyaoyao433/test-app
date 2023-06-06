package com.meituan.passport.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.aurora.ActivitySwitchCallbacks;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.passport.LoginActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.plugins.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@TargetApi(14)
/* loaded from: classes3.dex */
public final class ac extends ActivitySwitchCallbacks {
    public static ChangeQuickRedirect a;
    private static ac c;
    public boolean b;
    private boolean d;

    @Override // com.meituan.android.aurora.ActivitySwitchCallbacks
    public final void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0f7f45cc8e604293cda0772f08562e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0f7f45cc8e604293cda0772f08562e");
        }
    }

    public static /* synthetic */ boolean a(ac acVar, boolean z) {
        acVar.d = true;
        return true;
    }

    public ac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756962704a941e429ea72b5a21179a1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756962704a941e429ea72b5a21179a1a");
            return;
        }
        this.d = false;
        this.b = true;
    }

    public static ac a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5fe48f22f521b6ba121e81145f2c4ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (ac) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5fe48f22f521b6ba121e81145f2c4ec");
        }
        if (c == null) {
            c = new ac();
        }
        return c;
    }

    @Override // com.meituan.android.aurora.ActivitySwitchCallbacks
    public final void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7064be55b880aa802632db1f6f8d6ce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7064be55b880aa802632db1f6f8d6ce2");
        } else if (com.meituan.android.singleton.b.a() == null || UserCenter.getInstance(com.meituan.android.singleton.b.a()).isLogin()) {
        } else {
            com.sankuai.android.jarvis.c.a("passport_request", new Runnable() { // from class: com.meituan.passport.utils.ac.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "317fcbd7fcbe022ee15257f22793cc7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "317fcbd7fcbe022ee15257f22793cc7c");
                        return;
                    }
                    synchronized (this) {
                        if (!ac.this.d) {
                            o a2 = o.a();
                            com.meituan.passport.plugins.o a3 = ag.a(com.meituan.android.singleton.b.a());
                            if (a3 != null) {
                                a2.d = a3;
                            }
                            ac.a(ac.this, true);
                        }
                    }
                    if (PassportConfig.r()) {
                        com.meituan.passport.plugins.l a4 = com.meituan.passport.plugins.l.a();
                        Context a5 = com.meituan.android.singleton.b.a();
                        Object[] objArr3 = {a5};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.plugins.l.a;
                        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "8506433af2ce0ec8fc9e5b3210597a87", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "8506433af2ce0ec8fc9e5b3210597a87");
                        } else {
                            a4.b = a5;
                            String str = "";
                            try {
                                str = OneIdHandler.getInstance(a5).getLocalOneId();
                            } catch (Exception unused) {
                            }
                            String b = a4.b();
                            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(b)) {
                                n.a("NewSSOLoginInfoHook.requestNewSSOUserInfo", "parametes is null", "unionId: " + str + ", installedApps: " + b);
                            } else {
                                n.a("NewSSOLoginInfoHook.requestNewSSOUserInfo", "parametes aren't null", "unionId: " + str + ", installedApps: " + b);
                                com.sankuai.android.jarvis.c.a("thread-requestNewSSOUserInfo", new l.AnonymousClass1(str)).start();
                            }
                        }
                    }
                    if (com.meituan.passport.plugins.q.a().k == null || !com.meituan.passport.plugins.q.a().k.a(com.meituan.android.singleton.b.a())) {
                        ac acVar = ac.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = ac.a;
                        if (PatchProxy.isSupport(objArr4, acVar, changeQuickRedirect4, false, "988e2f9ea6399a71610dd6e0e441d233", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, acVar, changeQuickRedirect4, false, "988e2f9ea6399a71610dd6e0e441d233");
                        } else if (acVar.b) {
                            ag.a((LoginActivity.c) null);
                            o.a().a(false);
                            acVar.b = false;
                        } else {
                            o.a().a(true);
                        }
                    }
                }
            }).start();
        }
    }

    @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1e5f4c6b53e592adfc33da12750c3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1e5f4c6b53e592adfc33da12750c3c");
        } else {
            com.dianping.sharkpush.b.a(PassportConfig.a());
        }
    }
}
