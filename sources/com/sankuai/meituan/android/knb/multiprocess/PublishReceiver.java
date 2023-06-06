package com.sankuai.meituan.android.knb.multiprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PublishReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1685cb9f68997b750c11e132aed3f1de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1685cb9f68997b750c11e132aed3f1de");
        } else if (intent == null || !intent.hasExtra(Constants.MULTI_PROCESS_PID) || f.a(intent, Constants.MULTI_PROCESS_PID, -1) == Process.myPid()) {
        } else {
            String a = f.a(intent, Constants.MULTI_PROCESS_PUBLISH_DATA);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(a);
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                JsHandlerFactory.publishOnReceive(jSONObject);
            }
        }
    }
}
