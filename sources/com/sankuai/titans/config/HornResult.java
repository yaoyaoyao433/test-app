package com.sankuai.titans.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HornResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean enable;
    private final String result;

    public HornResult(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92bd9ae06f9f45aa5df4cc1027bd83f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92bd9ae06f9f45aa5df4cc1027bd83f1");
            return;
        }
        this.enable = z;
        this.result = str;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public String getResult() {
        return this.result;
    }
}
