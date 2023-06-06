package com.sankuai.waimai.business.knb.handlers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.a;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MsgReadIMChatList extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58559aead96ce75898e384d7ca21c207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58559aead96ce75898e384d7ca21c207");
        } else if (validateArgs()) {
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject == null || !jSONObject.has("msgList")) {
                error("fail");
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("msgList");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                error("fail");
                return;
            }
            ArrayList arrayList = optJSONArray.length() > 0 ? new ArrayList() : null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Long valueOf = Long.valueOf(optJSONObject.optLong("peer_id"));
                    int optInt = optJSONObject.optInt("channel_id");
                    int optInt2 = optJSONObject.optInt("category");
                    SessionId sessionId = new SessionId();
                    sessionId.a(valueOf.longValue());
                    sessionId.g = (short) optInt;
                    sessionId.e = optInt2;
                    arrayList.add(sessionId);
                }
            }
            IMClient.a().a(arrayList, new a<String>() { // from class: com.sankuai.waimai.business.knb.handlers.MsgReadIMChatList.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(String) obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "64c3a8aaaa4dcaa8b3ce933c8623efdb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "64c3a8aaaa4dcaa8b3ce933c8623efdb");
                    } else {
                        MsgReadIMChatList.this.success();
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d6070f69493f31624970c3143c9785a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d6070f69493f31624970c3143c9785a");
                    } else {
                        MsgReadIMChatList.this.error(str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void success() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffac4f6fb38aa758044a6b767a73edea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffac4f6fb38aa758044a6b767a73edea");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void error(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49e99f3e2cb28a6a2ebedbcc655e8535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49e99f3e2cb28a6a2ebedbcc655e8535");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", -1);
            jSONObject.put("errorCode", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }
}
