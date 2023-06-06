package com.dianping.huaweipush;

import android.text.TextUtils;
import com.dianping.base.push.pushservice.k;
import com.dianping.base.push.pushservice.l;
import com.dianping.base.push.pushservice.n;
import com.dianping.base.push.pushservice.util.d;
import com.dianping.base.push.pushservice.util.i;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DpHmsMessageService extends HmsMessageService {
    public static ChangeQuickRedirect b;

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf74aefaeedb0324183e15e91e74bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf74aefaeedb0324183e15e91e74bb0");
            return;
        }
        super.onNewToken(str);
        a.a("onNewToken token:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n.a(this, 4, str);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        int i;
        Object[] objArr = {remoteMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d5f30d7d673067edc73fd003c612f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d5f30d7d673067edc73fd003c612f6");
            return;
        }
        super.onMessageReceived(remoteMessage);
        String data = remoteMessage != null ? remoteMessage.getData() : "";
        a.a("msg = " + data);
        try {
            JSONObject jSONObject = new JSONObject(data);
            String string = jSONObject.getString("pushmsgid");
            long optLong = jSONObject.optLong("expired", 0L);
            jSONObject.put("pushchannel", 4);
            if (optLong != 0 && optLong <= i.a(this)) {
                i = 103;
            } else if (com.dianping.base.push.pushservice.i.a(this).a(string)) {
                i = 102;
            } else {
                if (jSONObject.optInt("passthrough", 0) == 1) {
                    d.a(this, jSONObject);
                    com.dianping.base.push.pushservice.i.a(this).b(string);
                } else {
                    com.dianping.base.push.pushservice.i.a(this).a(jSONObject);
                }
                i = 101;
            }
            Object[] objArr2 = {this, Integer.valueOf(i), jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acbf040758bbeee593b6c67d32017c65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acbf040758bbeee593b6c67d32017c65");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("groupid", jSONObject.optString("groupid", ""));
                jSONObject2.put("pushmsgid", jSONObject.optString("pushmsgid", ""));
                jSONObject2.put("type", jSONObject.optInt("pushchannel", 4));
            } catch (Exception e) {
                a.a("paramsObj", e);
            }
            k.a(this).a(l.a(this, i, jSONObject2));
        } catch (Exception e2) {
            a.a("onMessageReceived Exception: " + e2.toString());
        }
    }
}
