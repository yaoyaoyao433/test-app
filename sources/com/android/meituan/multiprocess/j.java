package com.android.meituan.multiprocess;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j {
    private static final Map<String, Object> a = new HashMap();
    private static final Map<String, IBinder> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IBinder a(String str, String str2) {
        IBinder iBinder;
        String format = (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? null : String.format("%s_%s", str, str2);
        if (format == null) {
            return null;
        }
        synchronized (j.class) {
            iBinder = b.get(format);
        }
        return iBinder;
    }
}
