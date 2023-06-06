package com.meituan.android.common.aidata.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Calendar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DateUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static long getZeroTimeWithDayOffset(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f1f3d893a21c85018e65562d3f2833a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f1f3d893a21c85018e65562d3f2833a")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        calendar.clear();
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
        return calendar.getTimeInMillis() + (i * 24 * 60 * 60 * 1000);
    }
}
