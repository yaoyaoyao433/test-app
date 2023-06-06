package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.integration.knb.result.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AddDownloadJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "uQKRFQLhpLkL5USA7Df9rEhpYN+FQzIZubRJ81m1KiJ7srsqrL3jsUSmbB3RoxwjesQ4WOZmPNX9krvCXPxa8A==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9acb4dced304b614fc81f1d1c9c2300a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9acb4dced304b614fc81f1d1c9c2300a");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c049c36ec8d2e411894b0f38d308c27c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c049c36ec8d2e411894b0f38d308c27c");
            return;
        }
        try {
            String optString = jSONObject.optString("url", "");
            if (ac.a(optString)) {
                bVar.a(10011, "url param error");
                return;
            }
            int optInt = jSONObject.optInt("downloadType", 0);
            int i2 = 8;
            if (optInt != 0) {
                Object[] objArr3 = {Integer.valueOf(optInt)};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "a22db337b805af9abbaf1deae47c43f2", 6917529027641081856L)) {
                    switch (optInt) {
                        case 2:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 2;
                            break;
                        case 5:
                            i2 = 3;
                            break;
                    }
                } else {
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "a22db337b805af9abbaf1deae47c43f2")).intValue();
                }
                String f = k.f(IMClient.a().b(i2), k.c(optString));
                a.a("AddDownloadJsHandler::innerExe url:" + optString + " localPath:" + f + " fileType:" + optInt, new Object[0]);
                IMClient a = IMClient.a();
                Object[] objArr4 = {optString, f, Integer.valueOf(optInt), (byte) 1};
                ChangeQuickRedirect changeQuickRedirect5 = IMClient.a;
                if (PatchProxy.isSupport(objArr4, a, changeQuickRedirect5, false, "96ba52d41832bff6aa6ac4fd499a3da3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, a, changeQuickRedirect5, false, "96ba52d41832bff6aa6ac4fd499a3da3");
                    return;
                } else {
                    a.a(optString, f, optInt, true, (String) null);
                    return;
                }
            }
            IMMessage e = c.e(jSONObject.optJSONObject("body"));
            if (!(e instanceof MediaMessage)) {
                bVar.a(10011, "cannot obtain IMMessage from json.");
                return;
            }
            int msgType = e.getMsgType();
            int msgType2 = e.getMsgType();
            Object[] objArr5 = {Integer.valueOf(msgType2)};
            ChangeQuickRedirect changeQuickRedirect6 = c.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "96659d6a91f79fa93af9f9f96f4d113b", 6917529027641081856L)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "96659d6a91f79fa93af9f9f96f4d113b")).intValue();
            } else {
                if (msgType2 != 8) {
                    switch (msgType2) {
                        case 2:
                            i = 4;
                            break;
                        case 3:
                            i = 5;
                            break;
                        case 4:
                            i = 2;
                            break;
                    }
                }
                i = 3;
            }
            String f2 = k.f(IMClient.a().b(msgType), k.c(optString));
            a.a("AddDownloadJsHandler::innerExe url:" + optString + " localPath:" + f2 + " fileType:" + i + " message:" + e.keyParamToString(), new Object[0]);
            IMClient.a().a((MediaMessage) e, optString, f2, i);
            bVar.a(new JSONObject());
        } catch (Throwable th) {
            a.c("addDownload exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
