package com.sankuai.xm.integration.knb.handler;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.utils.a;
import com.sankuai.xm.integration.knb.result.b;
import com.sankuai.xm.network.setting.e;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IMInitJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "AAh7WmalSAawYxKRBw2qjz4gGM3yNYobHV//4U8BeDxSM+E5uxU8J7ujLKTFLGsY5Gb1vclfp209w5d/RcOjDA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        e eVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f075eb623140e85f3e30467dcdffa47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f075eb623140e85f3e30467dcdffa47");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        b bVar = new b(this);
        Context applicationContext = jsHost().getContext().getApplicationContext();
        Object[] objArr2 = {jSONObject, bVar, applicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4fbe3a661ef06323f57ad4ef1c4ebf9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4fbe3a661ef06323f57ad4ef1c4ebf9e");
            return;
        }
        try {
            short optInt = (short) jSONObject.optInt("appId", 0);
            if (optInt <= 0) {
                bVar.a(10011, "appId param error");
                return;
            }
            String optString = jSONObject.optString("appVersion", "");
            int optInt2 = jSONObject.optInt("envType", 0);
            Object[] objArr3 = {Integer.valueOf(optInt2)};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "399547474e6086b7df8a83e790fd05a9", 6917529027641081856L)) {
                eVar = (e) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "399547474e6086b7df8a83e790fd05a9");
            } else if (optInt2 == 1) {
                eVar = e.ENV_STAGING;
            } else if (optInt2 == 2) {
                eVar = e.ENV_TEST;
            } else {
                eVar = e.ENV_RELEASE;
            }
            long a = ac.a(jSONObject.optString("uid"), 0L);
            short c = c.c(jSONObject);
            String optString2 = jSONObject.optString("swim", "");
            boolean optBoolean = jSONObject.optBoolean("supportMultiDevice", false);
            IMClient a2 = IMClient.a();
            Object[] objArr4 = {applicationContext, Short.valueOf(optInt), optString, eVar, new Long(a), Short.valueOf(c)};
            ChangeQuickRedirect changeQuickRedirect5 = IMClient.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "8b12727c6e2652c8c90344d77ee67498", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "8b12727c6e2652c8c90344d77ee67498");
            } else {
                Object[] objArr5 = {applicationContext, Short.valueOf(optInt), optString, eVar, new Long(a), Short.valueOf(c), null};
                ChangeQuickRedirect changeQuickRedirect6 = IMClient.a;
                if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect6, false, "d7405891a652327d19714c3e6df74d7e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect6, false, "d7405891a652327d19714c3e6df74d7e");
                } else {
                    com.sankuai.xm.im.b bVar2 = new com.sankuai.xm.im.b();
                    bVar2.b = eVar;
                    Object[] objArr6 = {new Long(a)};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.xm.im.b.a;
                    if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect7, false, "ef50720a1ae37676e1a81f282274ade9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect7, false, "ef50720a1ae37676e1a81f282274ade9");
                    } else {
                        bVar2.c = a;
                    }
                    f.m().a(optString).b(c);
                    short a3 = j.a(optInt);
                    Object[] objArr7 = {applicationContext, Short.valueOf(optInt), Integer.valueOf(a3), bVar2};
                    ChangeQuickRedirect changeQuickRedirect8 = IMClient.a;
                    if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect8, false, "29c7f79864e05a9d4db519b59c6ae045", 6917529027641081856L)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect8, false, "29c7f79864e05a9d4db519b59c6ae045")).booleanValue();
                    } else {
                        f.m().a(applicationContext).a(optInt).b((int) a3).a(com.sankuai.xm.im.b.class, bVar2);
                        f.m().a(bVar2.a()).a(bVar2.c);
                        a2.e(f.m());
                    }
                }
            }
            IMClient a4 = IMClient.a();
            Object[] objArr8 = {optString2};
            ChangeQuickRedirect changeQuickRedirect9 = IMClient.a;
            if (PatchProxy.isSupport(objArr8, a4, changeQuickRedirect9, false, "9d1f1b079864274ba32c931f6b71c57d", 6917529027641081856L)) {
                ((Integer) PatchProxy.accessDispatch(objArr8, a4, changeQuickRedirect9, false, "9d1f1b079864274ba32c931f6b71c57d")).intValue();
            } else if (a4.A()) {
                a.d("IMClient is uninitialized", new Object[0]);
            } else {
                com.sankuai.xm.c.a().a(optString2);
            }
            IMClient a5 = IMClient.a();
            Object[] objArr9 = {Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect10 = IMClient.a;
            if (PatchProxy.isSupport(objArr9, a5, changeQuickRedirect10, false, "5d7866999d4b84a86efce2f9d7c37bdf", 6917529027641081856L)) {
                ((Integer) PatchProxy.accessDispatch(objArr9, a5, changeQuickRedirect10, false, "5d7866999d4b84a86efce2f9d7c37bdf")).intValue();
            } else if (a5.A()) {
            } else {
                com.sankuai.xm.im.connection.a aVar = (com.sankuai.xm.im.connection.a) a5.F().a();
                Object[] objArr10 = {Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.xm.im.connection.a.a;
                if (PatchProxy.isSupport(objArr10, aVar, changeQuickRedirect11, false, "8b7ddc8eb1d46fe327ffbc34ea49ec45", 6917529027641081856L)) {
                    ((Integer) PatchProxy.accessDispatch(objArr10, aVar, changeQuickRedirect11, false, "8b7ddc8eb1d46fe327ffbc34ea49ec45")).intValue();
                } else {
                    ((com.sankuai.xm.login.c) aVar.b().a()).c(optBoolean);
                }
            }
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("initSDK exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }
}
