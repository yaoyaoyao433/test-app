package com.meizu.cloud.pushsdk.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class b {
    private static final String e = "b";
    final HashMap<String, String> a;
    final HashMap<String, String> b;
    final HashMap<String, Object> c;
    final HashMap<String, Object> d;

    /* loaded from: classes3.dex */
    public static class a {
        Context a = null;
    }

    private void a(int i, int i2) {
        this.b.put("ss", i + CommonConstant.Symbol.DOT + i2);
    }

    @TargetApi(19)
    private void a(Context context) {
        Display display;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return;
            }
            display = windowManager.getDefaultDisplay();
            try {
                Point point = new Point();
                Display.class.getMethod("getSize", Point.class);
                display.getSize(point);
                a(point.x, point.y);
            } catch (Exception unused) {
                DebugLogger.e(e, "Display.getSize isn't available on older devices.");
                if (display != null) {
                    a(display.getWidth(), display.getHeight());
                } else {
                    DebugLogger.e(e, "error get display");
                }
            }
        } catch (Exception unused2) {
            display = null;
        }
    }

    private void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null || !(obj instanceof String) || ((String) obj).isEmpty()) {
            return;
        }
        this.c.put(str, obj);
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.b.put(str, str2);
    }

    private void b(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null || !(obj instanceof String) || ((String) obj).isEmpty()) {
            return;
        }
        this.d.put(str, obj);
    }

    private b(a aVar) {
        this.a = new HashMap<>();
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        a(BrightRemindSetting.BRIGHT_REMIND, Build.BRAND);
        a("dc", Build.MODEL);
        a("ot", Build.VERSION.RELEASE);
        a("ov", Build.DISPLAY);
        a("ll", MzSystemUtils.getCurrentLanguage());
        if (aVar.a != null) {
            Context context = aVar.a;
            Location c = e.c(context);
            if (c == null) {
                DebugLogger.e(e, "Location information not available.");
            } else {
                b("lt", Double.valueOf(c.getLongitude()));
                b("at", Double.valueOf(c.getAltitude()));
                b("lat", Double.valueOf(c.getLatitude()));
            }
            a("op", MzSystemUtils.getOperator(context));
            a(context);
            a("ma", MzSystemUtils.getMacAddress(context));
            b("nt", MzSystemUtils.getNetWorkType(context));
            b("wb", MzSystemUtils.getBssId(context));
            b("wl", MzSystemUtils.getWifiList(context));
            a("pn", (Object) context.getPackageName());
            a("pv", (Object) MzSystemUtils.getAppVersionName(context));
            a("pvc", Integer.valueOf(MzSystemUtils.getAppVersionCode(context)));
            a("st", Integer.valueOf(!TextUtils.isEmpty(MzSystemUtils.findReceiver(context, "com.meizu.ups.push.intent.MESSAGE", context.getPackageName())) ? 1 : 0));
        }
        DebugLogger.i(e, "Subject created successfully.");
    }
}
