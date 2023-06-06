package com.dianping.nvnetwork.shark;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static boolean a() {
        return b;
    }

    public static List<SocketAddress> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36e617cae5562fee010782b858540fde", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36e617cae5562fee010782b858540fde");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InetSocketAddress("10.82.235.52", 6121));
        return arrayList;
    }
}
