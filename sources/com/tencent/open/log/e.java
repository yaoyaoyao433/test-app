package com.tencent.open.log;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends Tracer {
    public static final e a = new e();

    @Override // com.tencent.open.log.Tracer
    protected final void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (i == 4) {
            Log.i(str, str2, th);
        } else if (i == 8) {
            Log.w(str, str2, th);
        } else if (i == 16) {
            Log.e(str, str2, th);
        } else if (i != 32) {
            switch (i) {
                case 1:
                    Log.v(str, str2, th);
                    return;
                case 2:
                    Log.d(str, str2, th);
                    return;
                default:
                    return;
            }
        } else {
            Log.e(str, str2, th);
        }
    }
}
