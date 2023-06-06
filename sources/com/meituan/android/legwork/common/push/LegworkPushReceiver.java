package com.meituan.android.legwork.common.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.legwork.common.bus.a;
import com.meituan.android.legwork.common.bus.event.c;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkPushReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    private String b;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e84a8e5129b90e9250e08365465fa88e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e84a8e5129b90e9250e08365465fa88e");
            return;
        }
        LegworkPushReceiver legworkPushReceiver = new LegworkPushReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.dianping.dpmtpush.RECEIVE_PASS_THROUGH_MESSAGE");
        try {
            context.registerReceiver(legworkPushReceiver, intentFilter);
        } catch (Exception e) {
            x.e("LegworkPushReceiver.register()", "注册Push监听广播失败。exception msg:", e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4109d0b271d262f0f9b9c845127759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4109d0b271d262f0f9b9c845127759");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(f.a(intent, "message"));
            String optString = jSONObject.optString("appname");
            if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, context.getPackageName())) {
                JSONObject optJSONObject = jSONObject.optJSONObject("extra");
                if ("legwork".equals(optJSONObject.optString("channel", ""))) {
                    String optString2 = jSONObject.optString("url");
                    if (TextUtils.isEmpty(optString2)) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", optString2);
                    jSONObject2.put("extra", optJSONObject);
                    jSONObject2.put("title", jSONObject.optString("title"));
                    jSONObject2.put("content", jSONObject.optString("content"));
                    String jSONObject3 = jSONObject2.toString();
                    Object[] objArr2 = {jSONObject3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b536b69b51ec2053df32bb1d3613555", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b536b69b51ec2053df32bb1d3613555");
                    } else {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("action", "legwork:push");
                            jSONObject4.put("data", jSONObject3);
                            JsHandlerFactory.publish(jSONObject4);
                        } catch (Exception e) {
                            x.e("LegworkPushReceiver.sendPushToMrn()", "PUSH广播 -> MRN发送失败", e);
                            x.a(e);
                        }
                    }
                    Uri parse = Uri.parse(optString2);
                    String path = parse.getPath();
                    if (TextUtils.isEmpty(path)) {
                        return;
                    }
                    if (TextUtils.isEmpty(this.b)) {
                        this.b = context.getString(R.string.legwork_scheme_path_order_detail);
                    }
                    if (path.contains(this.b)) {
                        String queryParameter = parse.getQueryParameter("id");
                        if (TextUtils.isEmpty(queryParameter)) {
                            return;
                        }
                        String queryParameter2 = parse.getQueryParameter("status");
                        int parseInt = TextUtils.isEmpty(queryParameter2) ? -1 : Integer.parseInt(queryParameter2);
                        a.a().a(new c(queryParameter, parseInt));
                        if (parseInt == 21) {
                            y.a().b(queryParameter);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            x.e("LegworkPushReceiver.onReceive()", "处理Push消息广播发生错误。exception msg:", e2);
            x.a(e2);
        }
    }
}
