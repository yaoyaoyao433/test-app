package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetupEventJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21e3e92478b0a02fdbc02aaaa6e1f561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21e3e92478b0a02fdbc02aaaa6e1f561");
        } else if (!jsHost().isActivated()) {
            jsCallbackError(-1, "internal error");
        } else {
            try {
                Intent intent = new Intent("android.intent.action.INSERT", CalendarContract.Events.CONTENT_URI);
                intent.putExtra("title", jsBean().argsJson.optString("title"));
                long optLong = jsBean().argsJson.optLong("start");
                long optLong2 = jsBean().argsJson.optLong("duration");
                long optLong3 = jsBean().argsJson.optLong(NotificationCompat.CATEGORY_ALARM);
                String optString = jsBean().argsJson.optString("url");
                String optString2 = jsBean().argsJson.optString("notes");
                if (optLong > 0) {
                    intent.putExtra("beginTime", optLong);
                    if (optLong2 > 0) {
                        intent.putExtra("endTime", optLong + (optLong2 * 1000));
                    } else {
                        intent.putExtra("endTime", optLong + 5400000);
                    }
                }
                String str = TextUtils.isEmpty(optString) ? null : optString;
                if (TextUtils.isEmpty(optString2)) {
                    optString2 = str;
                } else if (str != null) {
                    optString2 = optString2 + " \n" + str;
                }
                if (optString2 != null) {
                    intent.putExtra("description", optString2);
                }
                intent.putExtra("allDay", false);
                if (optLong3 != 0) {
                    intent.putExtra("hasAlarm", true);
                }
                jsHost().startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }
}
