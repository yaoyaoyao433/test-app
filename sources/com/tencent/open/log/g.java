package com.tencent.open.log;

import android.text.format.Time;
import android.util.Log;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static final g a = new g();

    public final String a(int i) {
        if (i != 4) {
            if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        switch (i) {
                            case 1:
                                return "V";
                            case 2:
                                return "D";
                            default:
                                return CommonConstant.Symbol.MINUS;
                        }
                    }
                    return "A";
                }
                return "E";
            }
            return "W";
        }
        return "I";
    }

    public final String a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        sb.append(a(i));
        sb.append('/');
        sb.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb.append(CommonConstant.Symbol.DOT_CHAR);
        if (j2 < 10) {
            sb.append("00");
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2);
        sb.append(Constants.SPACE);
        sb.append('[');
        if (thread == null) {
            sb.append("N/A");
        } else {
            sb.append(thread.getName());
        }
        sb.append(']');
        sb.append('[');
        sb.append(str);
        sb.append(']');
        sb.append(Constants.SPACE);
        sb.append(str2);
        sb.append('\n');
        if (th != null) {
            sb.append("* Exception : \n");
            sb.append(Log.getStackTraceString(th));
            sb.append('\n');
        }
        return sb.toString();
    }
}
