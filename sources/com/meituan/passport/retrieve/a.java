package com.meituan.passport.retrieve;

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
    CheckSecurity(R.id.check_security, a((int) R.string.passport_page_retrieve_label_check_security)),
    InputAccount(R.id.input_account, a((int) R.string.passport_page_retrieve_label_input_account)),
    InputNewPassword(R.id.input_new_password, a((int) R.string.passport_page_retrieve_label_input_new_password));
    
    public static ChangeQuickRedirect a;
    @IdRes
    public int e;
    private String f;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3622b464659653e483308e4de148677", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3622b464659653e483308e4de148677") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ce58e9bdcb321469a97a2200c142989", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ce58e9bdcb321469a97a2200c142989") : (a[]) values().clone();
    }

    a(@IdRes int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbda8b7f34d1f09c324f371e27bd249", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbda8b7f34d1f09c324f371e27bd249");
            return;
        }
        this.e = i;
        this.f = str;
    }

    public static final a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b272a3cd0a11adeb4bb569ec1ab823df", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b272a3cd0a11adeb4bb569ec1ab823df");
        }
        if (TextUtils.equals(a((int) R.string.passport_page_retrieve_label_input_new_password), str)) {
            return InputNewPassword;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_retrieve_label_check_security), str)) {
            return CheckSecurity;
        }
        return InputAccount;
    }

    private static String a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d987a8af97dcfe6371f2239c3c9a89a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d987a8af97dcfe6371f2239c3c9a89a") : com.meituan.android.singleton.b.a().getResources().getString(i);
    }
}
