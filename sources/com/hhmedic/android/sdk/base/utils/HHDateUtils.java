package com.hhmedic.android.sdk.base.utils;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDateUtils {
    public static String formatTimeFromLong(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        String str = j4 < 10 ? "0" : "";
        if (j3 > 0) {
            return j3 + CommonConstant.Symbol.COLON + str + j4;
        }
        return "0:" + str + j4;
    }
}
