package com.dianping.titans.offline;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int code;

    public OfflineException(int i, String str) {
        super(str);
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0d1e30c0fcf6b8fbd7c47698cd91182", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0d1e30c0fcf6b8fbd7c47698cd91182");
        } else {
            this.code = i;
        }
    }

    public int getCode() {
        return this.code;
    }
}
