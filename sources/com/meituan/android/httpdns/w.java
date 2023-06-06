package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w {
    public static ChangeQuickRedirect a;

    public final List<InetAddress> a(String str) throws UnknownHostException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c5cc0f8db22df60a119e8f4d891ef0", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c5cc0f8db22df60a119e8f4d891ef0") : Arrays.asList(InetAddress.getAllByName(str));
    }
}
