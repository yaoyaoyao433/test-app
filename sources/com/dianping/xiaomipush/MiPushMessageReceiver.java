package com.dianping.xiaomipush;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.f;
import com.dianping.base.push.pushservice.k;
import com.dianping.base.push.pushservice.l;
import com.dianping.base.push.pushservice.util.d;
import com.dianping.base.push.pushservice.util.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.tencent.mapsdk.internal.y;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import com.xiaomi.mipush.sdk.n;
import com.xiaomi.mipush.sdk.o;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MiPushMessageReceiver extends PushMessageReceiver {
    public static final int NOTIFY_TYPE_PASS_THROUGH = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, o oVar) {
        JSONObject jSONObject;
        Object[] objArr = {context, oVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b323cfd2cc2d29a91288cbbbc97a8d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b323cfd2cc2d29a91288cbbbc97a8d0");
            return;
        }
        a.a("onReceivePassThroughMessage called, getContent = " + oVar.c);
        int i = 100;
        try {
            jSONObject = new JSONObject(oVar.c);
        } catch (Exception e) {
            e = e;
            jSONObject = null;
        }
        try {
            String string = jSONObject.getString("pushmsgid");
            long optLong = jSONObject.optLong("expired", 0L);
            jSONObject.put("pushchannel", 2);
            if (optLong != 0 && optLong <= i.a(context)) {
                i = 103;
            } else if (com.dianping.base.push.pushservice.i.a(context).a(string)) {
                i = 102;
            } else {
                if (jSONObject.optInt("passthrough", 0) == 1) {
                    d.a(context, jSONObject);
                    com.dianping.base.push.pushservice.i.a(context).b(string);
                } else {
                    com.dianping.base.push.pushservice.i.a(context).a(jSONObject);
                }
                i = 101;
            }
        } catch (Exception e2) {
            e = e2;
            a.a(e.toString());
            sendStatisticsLog(context, i, jSONObject);
        }
        sendStatisticsLog(context, i, jSONObject);
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, o oVar) {
        Object[] objArr = {context, oVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aefcc61e1e336ed9d9aa6cc532e4a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aefcc61e1e336ed9d9aa6cc532e4a80");
            return;
        }
        a.a("onNotificationMessageClicked is called. ");
        try {
            String optString = new JSONObject(oVar.c).optString("url");
            if (TextUtils.isEmpty(optString)) {
                optString = f.e.e();
            }
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(optString));
            intent.setFlags(y.a);
            context.startActivity(intent);
        } catch (Exception unused) {
            a.a("onNotificationMessageClicked, enter catch");
        }
    }

    private void sendStatisticsLog(Context context, int i, JSONObject jSONObject) {
        Object[] objArr = {context, Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5f518810a0f7e78c961c60a6793ed2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5f518810a0f7e78c961c60a6793ed2d");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("groupid", jSONObject.optString("groupid", ""));
            jSONObject2.put("pushmsgid", jSONObject.optString("pushmsgid", ""));
            jSONObject2.put("type", jSONObject.optInt("pushchannel", 2));
        } catch (Exception e) {
            a.a(e.toString());
        }
        k.a(context).a(l.a(context, i, jSONObject2));
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceiveRegisterResult(Context context, n nVar) {
        Object[] objArr = {context, nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9f256f0e9efddceafbedd67b3f4e416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9f256f0e9efddceafbedd67b3f4e416");
            return;
        }
        a.a("onReceiveRegisterResult is called. " + nVar.toString());
        String str = nVar.a;
        List<String> list = nVar.d;
        String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
        if (GetUUID.REGISTER.equals(str) && nVar.b == 0) {
            a.a("REGISTER SUCCESS");
            com.dianping.base.push.pushservice.n.a(context, 2, str2);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, n nVar) {
        Object[] objArr = {context, nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6279ee37240eefbc2107802a1c1332c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6279ee37240eefbc2107802a1c1332c9");
        } else if (nVar == null || context == null) {
        } else {
            a.a("onCommandResult is called. " + nVar.toString());
            String str = nVar.a;
            List<String> list = nVar.d;
            String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
            if (GetUUID.REGISTER.equals(str)) {
                if (nVar.b == 0) {
                    a.a("REGISTER SUCCESS");
                    com.dianping.base.push.pushservice.n.a(context, 2, str2);
                    return;
                }
                a.a("REGISTER FAIL");
            }
        }
    }
}
