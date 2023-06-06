package com.dianping.nvnetwork.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.Utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final DateFormat b = new SimpleDateFormat("MM-dd");
    private static final DateFormat c = new SimpleDateFormat("yy-MM-dd");
    private static final DateFormat d = new SimpleDateFormat(Utils.SHORT_DATE_FORMAT);
    private static final DateFormat e = new SimpleDateFormat("MM-dd HH:mm");
    private static final DateFormat f = new SimpleDateFormat("yy-MM-dd HH:mm");
    private static long g = 0;

    public static long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4b3ff6bfca6e66d49cddc81dc8fa8fd", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4b3ff6bfca6e66d49cddc81dc8fa8fd")).longValue();
        }
        long j2 = j + 28800000;
        return (j2 - (j2 % 86400000)) - 28800000;
    }
}
