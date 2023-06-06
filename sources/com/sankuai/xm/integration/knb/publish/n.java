package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imextra.service.chatpresent.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n extends c implements b.a {
    public static ChangeQuickRedirect a;

    public n(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.specialTagChange", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8db6f78d686b8b5c7569513551efcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8db6f78d686b8b5c7569513551efcc");
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779d434639f1cd8b4dfbbd9f1f0f3e9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779d434639f1cd8b4dfbbd9f1f0f3e9a");
            return;
        }
        com.sankuai.xm.imextra.service.chatpresent.b bVar = (com.sankuai.xm.imextra.service.chatpresent.b) com.sankuai.xm.base.service.m.a(com.sankuai.xm.imextra.service.chatpresent.b.class);
        if (bVar != null) {
            bVar.a(this.d, this);
        } else {
            com.sankuai.xm.im.utils.a.c("SessionTagPublisher::SessionPresentService is not available.", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ff2e3b24b45c19c5e619dd1c5c5267", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ff2e3b24b45c19c5e619dd1c5c5267");
            return;
        }
        com.sankuai.xm.imextra.service.chatpresent.b bVar = (com.sankuai.xm.imextra.service.chatpresent.b) com.sankuai.xm.base.service.m.a(com.sankuai.xm.imextra.service.chatpresent.b.class);
        if (bVar != null) {
            bVar.b(this.d, this);
        }
    }

    @Override // com.sankuai.xm.imextra.service.chatpresent.b.a
    public final void a(Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4305a00dcf39d33c35cfda405b7ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4305a00dcf39d33c35cfda405b7ebb");
        } else {
            a(map, 1);
        }
    }

    @Override // com.sankuai.xm.imextra.service.chatpresent.b.a
    public final void b(Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fa2852df70eace719a99db82b39da0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fa2852df70eace719a99db82b39da0");
        } else {
            a(map, 2);
        }
    }

    private void a(Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b3cab216b04571b2885d65dd42fa0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b3cab216b04571b2885d65dd42fa0e");
        } else if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>> list : map.values()) {
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("specialTags", com.sankuai.xm.im.bridge.business.proto.im.c.f(arrayList));
                jSONObject.put("changeType", i);
                c(jSONObject.toString());
            } catch (JSONException e) {
                com.sankuai.xm.im.utils.a.d("SessionTagPublisher::Listen exception: type=%s, e=%s", Integer.valueOf(i), e.getMessage());
            }
        }
    }
}
