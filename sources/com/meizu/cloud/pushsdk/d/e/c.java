package com.meizu.cloud.pushsdk.d.e;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class c {
    private static final String d = "c";
    final HashMap<String, String> a;
    final HashMap<String, Object> b;
    final HashMap<String, String> c;

    /* loaded from: classes3.dex */
    public static class a {
        public Context a = null;
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
        }
    }

    private void a(String str, String str2) {
        if (str2 == null || str.isEmpty() || str2.isEmpty()) {
            return;
        }
        this.c.put(str, str2);
    }

    private c(a aVar) {
        this.a = new HashMap<>();
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        a("ot", "android-" + Build.VERSION.RELEASE);
        a("ov", Build.DISPLAY);
        a(Constants.Environment.KEY_DM, Build.MODEL);
        a("df", Build.MANUFACTURER);
        if (aVar.a != null) {
            Context context = aVar.a;
            Location c = e.c(context);
            if (c == null) {
                com.meizu.cloud.pushsdk.d.f.c.a(d, "Location information not available.", new Object[0]);
            } else {
                a("la", Double.valueOf(c.getLatitude()));
                a("lt", Double.valueOf(c.getLongitude()));
                a("al", Double.valueOf(c.getAltitude()));
                a("lla", Float.valueOf(c.getAccuracy()));
                a("speed", Float.valueOf(c.getSpeed()));
                a(BrightRemindSetting.BRIGHT_REMIND, Float.valueOf(c.getBearing()));
            }
            String b = e.b(context);
            if (b != null) {
                a("ca", b);
            }
        }
        com.meizu.cloud.pushsdk.d.f.c.c(d, "Subject created successfully.", new Object[0]);
    }
}
