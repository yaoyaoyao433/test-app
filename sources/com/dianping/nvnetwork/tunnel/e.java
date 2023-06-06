package com.dianping.nvnetwork.tunnel;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(new Random(System.nanoTime()).nextInt());

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3125f523be91e8e8208b3ce684037cb", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3125f523be91e8e8208b3ce684037cb") : Integer.toString(268435455 & b.getAndIncrement());
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ce1b6f972403abcd6cdd54b32cf9786", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ce1b6f972403abcd6cdd54b32cf9786")).intValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 1000;
            }
            String[] split = str.split("\\.");
            if (split.length == 4) {
                return (Integer.parseInt(split[2]) << 8) + Integer.parseInt(split[3]);
            }
            return 1000;
        } catch (Exception e) {
            e.printStackTrace();
            return 1000;
        }
    }
}
