package com.meituan.passport.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum ai {
    TYPE_ACCOUNT_LOGIN,
    TYPE_DYNAMIC_LOGIN,
    TYPE_REQUESTCODE,
    TYPE_SEND_SMS_CODE,
    TYPE_CHECK_USER_NAME,
    TYPE_BP_SEND_SMS_CODE,
    TYPE_BIND_PHONE,
    TYPE_NEW_SSOLOGIN,
    TYPE_IDENTIFY_VERIFICATION_SERVICE,
    TYPE_VERIFY_LOGIN,
    TYPE_RETRIEVE_PASSWORD,
    TYPE_IDENTIFY_VERIFICATION,
    TYPE_BIND_MOBILE_LOGIN;
    
    public static ChangeQuickRedirect a;

    ai() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6986dcf748269a7cfbf926dd32909bb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6986dcf748269a7cfbf926dd32909bb9");
        }
    }

    public static ai valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aab862fc0aba42c7954c026d3decb2c", RobustBitConfig.DEFAULT_VALUE) ? (ai) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aab862fc0aba42c7954c026d3decb2c") : (ai) Enum.valueOf(ai.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ai[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf1021acf27d8f6d69c0899b306a7507", RobustBitConfig.DEFAULT_VALUE) ? (ai[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf1021acf27d8f6d69c0899b306a7507") : (ai[]) values().clone();
    }
}
