package com.dianping.video.template.utils;

import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final int[] b = {0, 33333, 66666, BlankConfig.MAX_SAMPLE};

    public static long a(long j, int i) {
        Object[] objArr = {new Long(j), 30};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbcea9d3a7eb9ad67c304d730b31d743", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbcea9d3a7eb9ad67c304d730b31d743")).longValue();
        }
        long j2 = j % 100000;
        return j2 == ((long) b[2]) ? (j - j2) + b[3] : j + 33333;
    }
}
