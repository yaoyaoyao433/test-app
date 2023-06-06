package com.meituan.metrics.traffic.hurl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PrivacyForbiddenException extends IOException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PrivacyForbiddenException(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee5014caa79c0879b6c58cd3c5a2e23e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee5014caa79c0879b6c58cd3c5a2e23e");
        }
    }

    public static void throwBlackException(boolean z) throws PrivacyForbiddenException {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1657c725903f8578ca6ff523b59dcf49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1657c725903f8578ca6ff523b59dcf49");
        } else if (z) {
            throw new PrivacyForbiddenException("CIPPrivacy forbid request");
        }
    }
}
