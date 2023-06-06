package com.meituan.android.edfu.cvlog.netservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static MessageDigest a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56d2ee7e892acf7b39c090b182139fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MessageDigest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56d2ee7e892acf7b39c090b182139fa0");
        }
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
