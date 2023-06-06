package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.opposite.PubOppositeController;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j extends c {
    public static ChangeQuickRedirect a;
    private PubOppositeController.PubOppositeChangeListener h;

    public j(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.pubOpposite", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d65bb33c4bf288761b485a7b79657c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d65bb33c4bf288761b485a7b79657c8");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea00d9401ea7572963a2ad1a6debe800", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea00d9401ea7572963a2ad1a6debe800");
        } else {
            IMClient.a().b(this.d, this.h);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e36e4bb9af3b3a6d75be1ee8efbb38c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e36e4bb9af3b3a6d75be1ee8efbb38c");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "061166685c03629a2027649734a2780b", 6917529027641081856L) ? (PubOppositeController.PubOppositeChangeListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "061166685c03629a2027649734a2780b") : new PubOppositeController.PubOppositeChangeListener() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.message.opposite.PubOppositeController.PubOppositeChangeListener
            public final void onOppositeChanged(SessionId sessionId, long j, long j2) {
                Object[] objArr3 = {sessionId, new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "512eba00402fa3c7d0d409506c345cbb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "512eba00402fa3c7d0d409506c345cbb");
                    return;
                }
                try {
                    JSONObject a2 = c.a(sessionId);
                    if (a2 == null) {
                        return;
                    }
                    a2.put("status", 2);
                    a2.put("receiveOppositeTime", j2);
                    aVar.a(a2);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("pubOpposite::onOppositeChanged exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.message.opposite.PubOppositeController.PubOppositeChangeListener
            public final void onOppositeConfigChanged() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c09067804f9d1ddf1ccd834f1521f8b2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c09067804f9d1ddf1ccd834f1521f8b2");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 1);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("pubOpposite::onOppositeConfigChanged exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.d, this.h);
    }
}
