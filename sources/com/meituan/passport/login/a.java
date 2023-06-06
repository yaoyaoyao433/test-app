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
public enum a {
    ChinaMobile(R.id.elder_china_mobile, a((int) R.string.passport_page_elder_login_label_china_mobile)),
    UnionLogin(R.id.elder_union_login, a((int) R.string.passport_page_elder_login_label_union_login)),
    DynamicAccount(R.id.elder_dynamic_account, a((int) R.string.passport_page_elder_login_label_dynamic_account)),
    DynamicVerify(R.id.elder_dynamic_verify, a((int) R.string.passport_page_elder_login_label_dynamic_verify)),
    AccountPassword(R.id.elder_account_login, a((int) R.string.passport_page_elder_login_label_account_password));
    
    public static ChangeQuickRedirect a;
    @IdRes
    public int g;
    private String h;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc03aef5b546a99a56a4a5ab913acaef", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc03aef5b546a99a56a4a5ab913acaef") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ac863b67246b6d57093de466cbcfb18", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ac863b67246b6d57093de466cbcfb18") : (a[]) values().clone();
    }

    a(@IdRes int i2, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc787b6faf8b2035a419de725036bc15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc787b6faf8b2035a419de725036bc15");
            return;
        }
        this.g = i2;
        this.h = str;
    }

    public static final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d038e420a60954faf53116d61ef5e26", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d038e420a60954faf53116d61ef5e26");
        }
        if (TextUtils.equals(a((int) R.string.passport_page_elder_login_label_china_mobile), str)) {
            return ChinaMobile;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_elder_login_label_union_login), str)) {
            return UnionLogin;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_elder_login_label_dynamic_account), str)) {
            return DynamicAccount;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_elder_login_label_dynamic_verify), str)) {
            return DynamicVerify;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_elder_login_label_account_password), str)) {
            return AccountPassword;
        }
        return DynamicAccount;
    }

    private static String a(@StringRes int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d39145a62b323d07bdc879ff4e1826ff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d39145a62b323d07bdc879ff4e1826ff") : com.meituan.android.singleton.b.a().getResources().getString(i2);
    }
}
