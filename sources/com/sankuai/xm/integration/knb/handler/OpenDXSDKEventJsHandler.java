package com.sankuai.xm.integration.knb.handler;

import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.e;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.integration.knb.result.b;
import com.sankuai.xm.log.c;
import com.sankuai.xm.login.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class OpenDXSDKEventJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "E7KpiJ78l3N8/vYT+9zYaKHGnEUBF2gcSJ5zOjDGbUjyo/Ug91rQ7Dn59dGL7G4LgWE8QuayF5ntRpAZ9puc8A==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79d39ce0008845ee637697b782e50bf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79d39ce0008845ee637697b782e50bf7");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Object[] objArr2 = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "675f367d44944296b05d31a8db898cad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "675f367d44944296b05d31a8db898cad");
            return;
        }
        try {
            String optString = jSONObject.optString("type", "");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (!ac.a(optString) && optJSONObject != null) {
                if (ac.a(optString, SnifferDBHelper.COLUMN_LOG)) {
                    Object[] objArr3 = {bVar, optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "7c3e546937a9fedc97b1e76b2d031886", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "7c3e546937a9fedc97b1e76b2d031886");
                        return;
                    } else if (optJSONObject == null) {
                        bVar.a(-1, "param error");
                        return;
                    } else {
                        String optString2 = optJSONObject.optString("type", "");
                        if (ac.a(optString2)) {
                            bVar.a(-1, "param error");
                            return;
                        }
                        if (ac.a(optString2, "debug")) {
                            c.a("IMKNB", optJSONObject.optString("text", ""), new Object[0]);
                        } else if (ac.a(optString2, "info")) {
                            c.b("IMKNB", optJSONObject.optString("text", ""), new Object[0]);
                        } else if (ac.a(optString2, "warn")) {
                            c.c("IMKNB", optJSONObject.optString("text", ""), new Object[0]);
                        } else if (ac.a(optString2, "error")) {
                            c.d("IMKNB", optJSONObject.optString("text", ""), new Object[0]);
                        } else if (ac.a(optString2, "upload")) {
                            c.a(a.a().k() + CommonConstant.Symbol.UNDERLINE + String.valueOf(a.a().e()));
                        } else {
                            com.sankuai.xm.im.bridge.base.util.a.c("not found type:" + optString2, new Object[0]);
                        }
                        bVar.a(new JSONObject());
                        return;
                    }
                } else if (ac.a(optString, "report")) {
                    com.sankuai.xm.im.bridge.business.proto.im.b.a(bVar, optJSONObject);
                    return;
                } else if (!ac.a(optString, "config")) {
                    if (!ac.a(optString, "cat")) {
                        com.sankuai.xm.im.bridge.base.util.a.c("not found type:" + optString, new Object[0]);
                        return;
                    }
                    Object[] objArr4 = {bVar, optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "66f1fc95b1eb566350bf7a3a4ffcea03", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "66f1fc95b1eb566350bf7a3a4ffcea03");
                        return;
                    } else if (optJSONObject == null) {
                        bVar.a(-1, "param error");
                        return;
                    } else {
                        String optString3 = optJSONObject.optString("url", "");
                        if (ac.a(optString3)) {
                            bVar.a(-1, "param error");
                            return;
                        }
                        com.sankuai.xm.monitor.cat.b bVar2 = new com.sankuai.xm.monitor.cat.b();
                        bVar2.b = optString3;
                        bVar2.c = optJSONObject.optInt("code", 0);
                        bVar2.e = optJSONObject.optInt("requestSize", 0);
                        bVar2.f = optJSONObject.optInt("responseSize", 0);
                        bVar2.g = optJSONObject.optLong("time", 0L);
                        bVar2.h = optJSONObject.optString("extra", "");
                        bVar2.i = optJSONObject.optInt("tunnel", 0);
                        m.d().a(bVar2);
                        bVar.a(new JSONObject());
                        return;
                    }
                } else {
                    Object[] objArr5 = {bVar, optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "1d66bcd4d7c332ec31730f57bc3c4eb8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "1d66bcd4d7c332ec31730f57bc3c4eb8");
                        return;
                    } else if (optJSONObject == null) {
                        bVar.a(-1, "param error");
                        return;
                    } else {
                        String optString4 = optJSONObject.optString("type", "");
                        String optString5 = optJSONObject.optString("key", "");
                        if (!ac.a(optString4) && !ac.a(optString5)) {
                            if (ac.a(optString4, "localGet")) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("value", e.a().getString(optString5, ""));
                                bVar.a(jSONObject2);
                                return;
                            } else if (ac.a(optString4, "localSet")) {
                                String optString6 = optJSONObject.optString("value", "");
                                e.a().a(optString5, optString6);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("value", optString6);
                                bVar.a(jSONObject3);
                                return;
                            } else if (ac.a(optString4, "onlineGet")) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("value", com.sankuai.xm.base.hornconfig.a.a().a(optString5));
                                bVar.a(jSONObject4);
                                return;
                            } else {
                                com.sankuai.xm.im.bridge.base.util.a.c("not found type:" + optString4, new Object[0]);
                                return;
                            }
                        }
                        bVar.a(-1, "param error");
                        return;
                    }
                }
            }
            bVar.a(-1, "param error");
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("openDXSDKEvent exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
