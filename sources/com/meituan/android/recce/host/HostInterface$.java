package com.meituan.android.recce.host;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HostInterface$ {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HostInterface newInstance(HostHandler hostHandler, String str) {
        Object[] objArr = {hostHandler, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a27e671300709014fc39e760ed5ed496", RobustBitConfig.DEFAULT_VALUE) ? (HostInterface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a27e671300709014fc39e760ed5ed496") : new HostImplement(hostHandler, str);
    }
}
