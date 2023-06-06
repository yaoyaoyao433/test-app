package com.huawei.hms.push;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.dianping.picasso.PicassoUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class l {
    public static int a(Context context) {
        int i = context.getApplicationInfo().icon;
        if (i == 0) {
            int identifier = context.getResources().getIdentifier("btn_star_big_on", PicassoUtils.DEF_TYPE, "android");
            HMSLog.d("PushSelfShowLog", "icon is btn_star_big_on ");
            if (identifier == 0) {
                HMSLog.d("PushSelfShowLog", "icon is sym_def_app_icon ");
                return 17301651;
            }
            return identifier;
        }
        return i;
    }

    public static int b(Context context, k kVar) {
        int i = 0;
        if (context != null && kVar != null) {
            if (!TextUtils.isEmpty(kVar.m())) {
                String[] split = kVar.m().split("/");
                if (split.length == 3) {
                    i = r.a(context, split[1], split[2]);
                }
            }
            if (i == 0) {
                i = r.a(context, "com.huawei.messaging.default_notification_icon");
            }
            return i == 0 ? a(context) : i;
        }
        HMSLog.i("PushSelfShowLog", "enter getSmallIconId, context or msg is null");
        return 0;
    }

    public static Bitmap a(Context context, k kVar) {
        if (context == null || kVar == null) {
            return null;
        }
        try {
        } catch (PackageManager.NameNotFoundException e) {
            HMSLog.e("PushSelfShowLog", e.toString(), e);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", e2.toString(), e2);
        }
        if (HwBuildEx.VERSION.EMUI_SDK_INT >= 11) {
            HMSLog.i("PushSelfShowLog", "huawei phone, and emui5.0, need not show large icon.");
            return null;
        }
        if (!"com.huawei.android.pushagent".equals(kVar.k())) {
            StringBuilder sb = new StringBuilder();
            sb.append("get left bitmap from ");
            sb.append(kVar.k());
            HMSLog.i("PushSelfShowLog", sb.toString());
            return ((BitmapDrawable) context.getPackageManager().getApplicationIcon(kVar.k())).getBitmap();
        }
        return null;
    }

    @TargetApi(23)
    public static void a(Context context, Notification.Builder builder, k kVar) {
        if (context != null && builder != null && kVar != null) {
            builder.setSmallIcon(b(context, kVar));
        } else {
            HMSLog.e("PushSelfShowLog", "msg is null");
        }
    }
}
