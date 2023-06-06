package com.xiaomi.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes6.dex */
public final class df implements dk {
    @Override // com.xiaomi.push.dk
    public final void a(Context context, dg dgVar) {
        String str;
        if (dgVar == null) {
            dc.a(context, PushConstants.INTENT_ACTIVITY_NAME, 1008, "A receive incorrect message");
            return;
        }
        String str2 = dgVar.a;
        String str3 = dgVar.b;
        String str4 = dgVar.d;
        int i = dgVar.e;
        if (context != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            if (!com.xiaomi.push.service.cg.b(context, str2, str3)) {
                dc.a(context, str4, 1003, "B is not ready");
                return;
            }
            dc.a(context, str4, 1002, "B is ready");
            dc.a(context, str4, 1004, "A is ready");
            Intent intent = new Intent(str3);
            intent.setPackage(str2);
            intent.putExtra("awake_info", db.a(str4));
            intent.addFlags(276824064);
            intent.setAction(str3);
            if (i == 1) {
                try {
                    if (!dh.b(context)) {
                        dc.a(context, str4, 1008, "A not in foreground");
                        return;
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    str = "A meet a exception when help B's activity";
                }
            }
            context.startActivity(intent);
            dc.a(context, str4, 1005, "A is successful");
            dc.a(context, str4, 1006, "The job is finished");
            return;
        } else if (TextUtils.isEmpty(str4)) {
            dc.a(context, PushConstants.INTENT_ACTIVITY_NAME, 1008, "argument error");
            return;
        } else {
            str = "argument error";
        }
        dc.a(context, str4, 1008, str);
    }

    @Override // com.xiaomi.push.dk
    public final void a(Context context, Intent intent, String str) {
        String str2;
        String str3;
        int i = 1008;
        if (context == null || !(context instanceof Activity) || intent == null) {
            str2 = PushConstants.INTENT_ACTIVITY_NAME;
            str3 = "B receive incorrect message";
        } else {
            Activity activity = (Activity) context;
            String a = com.sankuai.waimai.platform.utils.f.a(intent, "awake_info");
            if (TextUtils.isEmpty(a)) {
                dc.a(activity.getApplicationContext(), PushConstants.INTENT_ACTIVITY_NAME, 1008, "B get incorrect message");
                return;
            }
            str2 = db.b(a);
            if (TextUtils.isEmpty(str2)) {
                context = activity.getApplicationContext();
                str2 = PushConstants.INTENT_ACTIVITY_NAME;
                str3 = "B get incorrect message";
            } else {
                context = activity.getApplicationContext();
                i = 1007;
                str3 = "play with activity successfully";
            }
        }
        dc.a(context, str2, i, str3);
    }
}
