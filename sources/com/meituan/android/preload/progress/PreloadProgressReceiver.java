package com.meituan.android.preload.progress;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.android.preload.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PreloadProgressReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    private a b;

    public PreloadProgressReceiver(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af2b6c048a6f96c55cddfc81f135239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af2b6c048a6f96c55cddfc81f135239");
        } else {
            this.b = aVar;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb44d1bdb117f915daf57fe2c48b1b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb44d1bdb117f915daf57fe2c48b1b8a");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        try {
            str = extras.getString("data");
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("webviewId");
                String optString2 = jSONObject.optString("state");
                boolean optBoolean = jSONObject.optBoolean("success");
                String optString3 = jSONObject.optString("message");
                if (this.b != null) {
                    this.b.a(optString, optString2, optBoolean, optString3);
                }
                StringBuilder sb = new StringBuilder("intent: ");
                sb.append(intent.getAction());
                sb.append(", state: ");
                sb.append(optString2);
                sb.append(", success: ");
                sb.append(optBoolean);
                sb.append(", message: ");
                sb.append(optString3);
            } catch (Exception unused) {
                c.a().c("enlight_progress解析错误,data = " + str);
            }
        } catch (Exception unused2) {
            str = null;
        }
    }
}
