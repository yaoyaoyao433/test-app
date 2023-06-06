package com.sankuai.xm.integration.knb.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.a;
import com.sankuai.xm.integration.knb.publish.b;
import com.sankuai.xm.integration.knb.publish.c;
import com.sankuai.xm.integration.knb.publish.d;
import com.sankuai.xm.integration.knb.publish.e;
import com.sankuai.xm.integration.knb.publish.f;
import com.sankuai.xm.integration.knb.publish.g;
import com.sankuai.xm.integration.knb.publish.h;
import com.sankuai.xm.integration.knb.publish.i;
import com.sankuai.xm.integration.knb.publish.j;
import com.sankuai.xm.integration.knb.publish.k;
import com.sankuai.xm.integration.knb.publish.l;
import com.sankuai.xm.integration.knb.publish.m;
import com.sankuai.xm.integration.knb.publish.n;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RegisterEventJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "oDISZg0orP4+LtyxIg0giP8EAa4DgfoeMxHyMyeOTuwn7jBZdoUjr3Xd7zIzGcO4qq3JNVr1lhT6Q9lGf/5EIQ==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        c dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4de83cf66034e2d77a3dfa414b22c495", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4de83cf66034e2d77a3dfa414b22c495");
            return;
        }
        String optString = jsBean().argsJson.optString("action", "");
        a.b("RegisterEventJsHandler::innerExe event:" + optString, new Object[0]);
        short channel = getChannel();
        char c = 65535;
        switch (optString.hashCode()) {
            case -494493447:
                if (optString.equals("dxsdk.specialTagChange")) {
                    c = 11;
                    break;
                }
                break;
            case -187252444:
                if (optString.equals("dxsdk.personOpposite")) {
                    c = 7;
                    break;
                }
                break;
            case -159379594:
                if (optString.equals("dxsdk.messagesStatusChange")) {
                    c = 2;
                    break;
                }
                break;
            case 23847167:
                if (optString.equals("dxsdk.audioRecord")) {
                    c = 5;
                    break;
                }
                break;
            case 938827251:
                if (optString.equals("dxsdk.loginStatus")) {
                    c = 0;
                    break;
                }
                break;
            case 1235494676:
                if (optString.equals("dxsdk.messages")) {
                    c = 1;
                    break;
                }
                break;
            case 1273713506:
                if (optString.equals("dxsdk.audioPlay")) {
                    c = 6;
                    break;
                }
                break;
            case 1651496565:
                if (optString.equals("dxsdk.sessionsChange")) {
                    c = 3;
                    break;
                }
                break;
            case 1743706558:
                if (optString.equals("dxsdk.groupOpposite")) {
                    c = '\b';
                    break;
                }
                break;
            case 1846978108:
                if (optString.equals("dxsdk.pubOpposite")) {
                    c = '\t';
                    break;
                }
                break;
            case 1849842389:
                if (optString.equals("dxsdk.msgAddition")) {
                    c = '\n';
                    break;
                }
                break;
            case 1912713156:
                if (optString.equals("dxsdk.mediaDownload")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar = new d(jsHost(), channel, getApiSource());
                break;
            case 1:
                dVar = new l(jsHost(), channel, getApiSource());
                break;
            case 2:
                dVar = new h(jsHost(), channel, getApiSource());
                break;
            case 3:
                dVar = new m(jsHost(), channel, getApiSource());
                break;
            case 4:
                dVar = new f(jsHost(), channel, getApiSource());
                break;
            case 5:
                dVar = new b(jsHost(), channel, getApiSource());
                break;
            case 6:
                dVar = new com.sankuai.xm.integration.knb.publish.a(jsHost(), channel, getApiSource());
                break;
            case 7:
                dVar = new i(jsHost(), channel, getApiSource());
                break;
            case '\b':
                dVar = new e(jsHost(), channel, getApiSource());
                break;
            case '\t':
                dVar = new j(jsHost(), channel, getApiSource());
                break;
            case '\n':
                dVar = new g(jsHost(), channel, getApiSource());
                break;
            case 11:
                dVar = new n(jsHost(), channel, getApiSource());
                break;
            default:
                dVar = null;
                com.sankuai.xm.log.c.c(TAG(), "exec::event %s is not supported for channel %d", optString, Short.valueOf(channel));
                break;
        }
        if (dVar != null) {
            if (k.a.a.a(dVar)) {
                onResult(dVar);
                com.sankuai.xm.log.c.c(TAG(), "exec::event %s has already subscript for channel %d", optString, Short.valueOf(channel));
                return;
            }
            k.a.a.b(dVar);
            dVar.a();
            onResult(dVar);
            return;
        }
        com.sankuai.xm.log.c.c(TAG(), "exec:: unknown event %s for channel %d", optString, Short.valueOf(channel));
        jsCallbackErrorMsg("unknown event " + optString);
    }

    private void onResult(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b11c7da531584c60cca72a54fa06a4d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b11c7da531584c60cca72a54fa06a4d7");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("idIMEvent", cVar.f);
            jsCallback(jSONObject);
        } catch (JSONException e) {
            jsCallbackErrorMsg(e.getMessage());
        }
    }
}
