package com.meituan.android.common.statistics.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DateTimeUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String stmToDate(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ba236671f626dc77d872c312d1b989d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ba236671f626dc77d872c312d1b989d");
        }
        try {
            return new SimpleDateFormat("yyyMMdd").format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }
}
