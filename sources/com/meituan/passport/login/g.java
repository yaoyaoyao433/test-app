package com.meituan.passport.login;

import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum g {
    OuterChinaMobile(R.id.outer_china_mobile, a((int) R.string.passport_page_login_label_china_mobile_outer)),
    DynamicVerify(R.id.dynamic_verify, a((int) R.string.passport_page_login_label_dynamic_verify)),
    OuterDynamicAccount(R.id.outer_dynamic_account, a((int) R.string.passport_page_login_label_dynamic_account_outer));
    
    public static ChangeQuickRedirect a;
    @IdRes
    public int e;
    public String f;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19955a6e2153c17e73079191aa5157a5", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19955a6e2153c17e73079191aa5157a5") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61e24ba7bd8ac5e6c581f25254498049", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61e24ba7bd8ac5e6c581f25254498049") : (g[]) values().clone();
    }

    g(@IdRes int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48102edb95e6972f4c49353f7f869058", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48102edb95e6972f4c49353f7f869058");
            return;
        }
        this.e = i;
        this.f = str;
    }

    public static final g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c958ae9765e45e110d55d327ca923503", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c958ae9765e45e110d55d327ca923503");
        }
        if (TextUtils.equals(a((int) R.string.passport_page_login_label_dynamic_account_outer), str)) {
            return OuterDynamicAccount;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_login_label_china_mobile_outer), str)) {
            return OuterChinaMobile;
        }
        return DynamicVerify;
    }

    private static String a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a28a8fe1bb0a6845e88c4a57c0fe4aad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a28a8fe1bb0a6845e88c4a57c0fe4aad") : com.meituan.android.singleton.b.a().getResources().getString(i);
    }
}
