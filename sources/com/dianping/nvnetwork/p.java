package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(new Random(System.nanoTime()).nextInt() % 100);

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3439ccaba03ab2ce4ec46e1c300132df", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3439ccaba03ab2ce4ec46e1c300132df") : Integer.toString(268435455 & b.getAndIncrement());
    }
}
