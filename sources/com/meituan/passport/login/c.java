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
public enum c {
    AccountPassword(R.id.account_login, a((int) R.string.passport_page_login_label_account_password)),
    DynamicAccount(R.id.dynamic_account, a((int) R.string.passport_page_login_label_dynamic_account)),
    DynamicVerify(R.id.dynamic_verify, a((int) R.string.passport_page_login_label_dynamic_verify)),
    FaceLogin(R.id.face_login, a((int) R.string.passport_face_login_label)),
    FaceCollect(R.id.face_collect, a((int) R.string.passport_face_collection_label)),
    ChinaMobile(R.id.china_mobile, a((int) R.string.passport_page_login_label_china_mobile)),
    UnionLogin(R.id.union_login, a((int) R.string.passport_page_login_label_union_login));
    
    public static ChangeQuickRedirect a;
    @IdRes
    public int i;
    private String j;

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee2f80374c70b66f77e12368ca0969f5", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee2f80374c70b66f77e12368ca0969f5") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c2ce27ad7c4d2066bce0f67ccded2f1", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c2ce27ad7c4d2066bce0f67ccded2f1") : (c[]) values().clone();
    }

    c(@IdRes int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2213961364bced3607ada6041296a11d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2213961364bced3607ada6041296a11d");
            return;
        }
        this.i = i;
        this.j = str;
    }

    public static final c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69178d0d99ab60e4881b2feb0a443864", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69178d0d99ab60e4881b2feb0a443864");
        }
        if (TextUtils.equals(a((int) R.string.passport_page_login_label_account_password), str)) {
            return AccountPassword;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_login_label_dynamic_account), str)) {
            return DynamicAccount;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_login_label_china_mobile), str)) {
            return ChinaMobile;
        }
        if (TextUtils.equals(a((int) R.string.passport_face_login_label), str)) {
            return FaceLogin;
        }
        if (TextUtils.equals(a((int) R.string.passport_face_collection_label), str)) {
            return FaceCollect;
        }
        if (TextUtils.equals(a((int) R.string.passport_page_login_label_union_login), str)) {
            return UnionLogin;
        }
        return DynamicVerify;
    }

    private static String a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b29b62139cfa07732f8015738f082b33", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b29b62139cfa07732f8015738f082b33") : com.meituan.android.singleton.b.a().getResources().getString(i);
    }
}
