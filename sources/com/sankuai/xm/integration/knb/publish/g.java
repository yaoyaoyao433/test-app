package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.api.a;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends c {
    public static ChangeQuickRedirect a;
    private a.InterfaceC1390a h;

    public g(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.msgAddition", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3cd0697962ff18f9a0e861034b66fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3cd0697962ff18f9a0e861034b66fc");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e43f29b295e75611cab607bdd31d42e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e43f29b295e75611cab607bdd31d42e");
            return;
        }
        try {
            ((com.sankuai.xm.im.message.api.a) IMClient.a().a(com.sankuai.xm.im.message.api.a.class)).b(this.d, this.h);
        } catch (com.sankuai.xm.base.service.n e) {
            com.sankuai.xm.im.utils.a.a(e, "MsgAdditionChangePublisher, unregister fail, channel=%d", Short.valueOf(this.d));
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce44ae8a94cd3bf4031eee1935e7c60f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce44ae8a94cd3bf4031eee1935e7c60f");
            return;
        }
        try {
            final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
            this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "71fb534496e67f4dd56e02eb93f32334", 6917529027641081856L) ? (a.InterfaceC1390a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "71fb534496e67f4dd56e02eb93f32334") : new a.InterfaceC1390a() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.message.api.a.InterfaceC1390a
                public final void a(int i, List<MsgAddition> list) {
                    Object[] objArr3 = {Integer.valueOf(i), list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63ba77fcac8bbcb64bfb48a02d484bfa", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63ba77fcac8bbcb64bfb48a02d484bfa");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("additions", c.e(list));
                        jSONObject.put("source", i);
                        aVar.a(jSONObject);
                    } catch (Throwable th) {
                        com.sankuai.xm.im.bridge.base.util.a.c("msgAddition::onAdditionChange exception:" + th, new Object[0]);
                    }
                }
            };
            ((com.sankuai.xm.im.message.api.a) IMClient.a().a(com.sankuai.xm.im.message.api.a.class)).a(this.d, this.h);
        } catch (com.sankuai.xm.base.service.n e) {
            com.sankuai.xm.im.utils.a.a(e, "MsgAdditionChangePublisher, register fail, channel=%d", Short.valueOf(this.d));
        }
    }
}
