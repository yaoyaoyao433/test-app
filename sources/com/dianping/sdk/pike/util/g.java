package com.dianping.sdk.pike.util;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.nvlbservice.h;
import com.dianping.nvtunnelkit.kit.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(new Random(System.nanoTime()).nextInt());

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e883afe4f18e837ebd4dda35702b7a83", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e883afe4f18e837ebd4dda35702b7a83");
        }
        int andIncrement = b.getAndIncrement() & 268435455;
        if (andIncrement == 0) {
            andIncrement = b.getAndIncrement() & 268435455;
        }
        return Integer.toString(andIncrement);
    }

    public static v b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdb5c29fcfacc8b9f0673d88ccf386f5", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdb5c29fcfacc8b9f0673d88ccf386f5") : com.dianping.sdk.pike.f.c();
    }

    public static List<SocketAddress> a(List<h> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "374f3fcdc415fbbe1ddd034e84845c4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "374f3fcdc415fbbe1ddd034e84845c4c");
        }
        if (com.dianping.sdk.pike.f.d() && !TextUtils.isEmpty(com.dianping.sdk.pike.f.l())) {
            String l = com.dianping.sdk.pike.f.l();
            int lastIndexOf = l.lastIndexOf(CommonConstant.Symbol.COLON);
            return Collections.singletonList(new InetSocketAddress(l.substring(0, lastIndexOf), Integer.parseInt(l.substring(lastIndexOf + 1))));
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (h hVar : list) {
            arrayList.add(hVar.b);
        }
        return arrayList;
    }

    public static long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a282aa82909a6d22c1521e9734292f0a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a282aa82909a6d22c1521e9734292f0a")).longValue() : com.dianping.nvtunnelkit.utils.g.a();
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f852d97b80061bad554907a6d190a0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f852d97b80061bad554907a6d190a0f")).booleanValue();
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
