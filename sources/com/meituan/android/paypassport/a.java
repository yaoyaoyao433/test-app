package com.meituan.android.paypassport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.R;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.android.paybase.login.a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.login.a
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d30caa9325d1ef6758dee4c66506e23", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d30caa9325d1ef6758dee4c66506e23")).booleanValue() : UserCenter.getInstance(context).isLogin();
    }

    @Override // com.meituan.android.paybase.login.a
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028a500a0a4e1c9357a92bdb147c7a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028a500a0a4e1c9357a92bdb147c7a22");
            return;
        }
        Intent intent = new Intent("com.meituan.android.intent.action.login");
        intent.setPackage(context.getPackageName());
        intent.setFlags(603979776);
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            String string = context.getString(R.string.paybase__start_activity_exception_alert);
            new BasePayDialog.b((Activity) context).c(string).a().show();
            HashMap hashMap = new HashMap();
            hashMap.put("alertMsg", "login " + string);
            hashMap.put("errorMsg", e.getMessage());
            hashMap.put("errorDetail", e.toString());
            com.meituan.android.paybase.common.analyse.a.a((Map<String, Object>) hashMap);
        }
    }

    @Override // com.meituan.android.paybase.login.a
    public final void a(com.meituan.android.paybase.login.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33642770387e92d0351f388a0181b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33642770387e92d0351f388a0181b6e");
            return;
        }
        d<UserCenter.c> loginEventObservable = UserCenter.getInstance(com.meituan.android.paybase.config.a.d().a()).loginEventObservable();
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        loginEventObservable.c(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ad8495ceceed58f3c19eac6845b2a32c", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ad8495ceceed58f3c19eac6845b2a32c") : new b(bVar));
    }

    @Override // com.meituan.android.paybase.login.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656bb51cd5bd01052685a2d833dd0dbf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656bb51cd5bd01052685a2d833dd0dbf") : UserCenter.getInstance(com.meituan.android.paybase.config.a.d().a()).getUser() != null ? String.valueOf(UserCenter.getInstance(com.meituan.android.paybase.config.a.d().a()).getUser().id) : "";
    }
}
