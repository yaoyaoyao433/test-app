package com.sankuai.xm.integration.knb.handler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PlayVoiceJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "HchNpAo5ktr2KeSgQTGTQj3v2OcmpWzuBCRKbJ6fz+my5ykQg8JmAdybmHa77srXs8gSnBoWN/nujoeIbHU7gg==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03566dc5cfb4115ad8ab1d5a2bafa9e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03566dc5cfb4115ad8ab1d5a2bafa9e8");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        com.sankuai.xm.base.voicemail.b bVar2 = (com.sankuai.xm.base.voicemail.b) createCallback(com.sankuai.xm.base.voicemail.b.class, "dxsdk.audioPlay");
        Object[] objArr2 = {jSONObject, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "810975387f8dbbbee619b8e7669b6a2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "810975387f8dbbbee619b8e7669b6a2a");
            return;
        }
        try {
            String optString = jSONObject.optString("uuid", "");
            if (TextUtils.isEmpty(optString)) {
                bVar.a(10011, "msgUuid param error");
                return;
            }
            String optString2 = jSONObject.optString("path", "");
            if (TextUtils.isEmpty(optString2)) {
                bVar.a(10011, "path param error");
                return;
            }
            a.a("PlayVoiceJsHandler::innerExe msgUuid:" + optString + " path:" + optString2, new Object[0]);
            IMClient.a().a(optString, optString2, bVar2);
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("playVoice exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
