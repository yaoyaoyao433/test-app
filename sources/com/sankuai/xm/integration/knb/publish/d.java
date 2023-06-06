package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends c {
    public static ChangeQuickRedirect a;
    private IMClient.d h;

    public d(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.loginStatus", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d2929bcdedaca11f4dd9304cf2e4e85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d2929bcdedaca11f4dd9304cf2e4e85");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c4741cab968d9d8c75ecbf0aff1f61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c4741cab968d9d8c75ecbf0aff1f61");
        } else {
            IMClient.a().b(this.h);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d80b596e6c531c35fcf6e0c65aee60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d80b596e6c531c35fcf6e0c65aee60");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6e663285069535bfa53b78a5cd4960b8", 6917529027641081856L) ? (IMClient.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6e663285069535bfa53b78a5cd4960b8") : new IMClient.d() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(com.sankuai.xm.im.connection.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "552d674dfd72c24e7e7294fa3b4181e0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "552d674dfd72c24e7e7294fa3b4181e0");
                    return;
                }
                try {
                    if (bVar == com.sankuai.xm.im.connection.b.NONE_NET || bVar == com.sankuai.xm.im.connection.b.CONNECTING || bVar == com.sankuai.xm.im.connection.b.DISCONNECTED) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("loginStatus", Integer.valueOf(c.a(bVar)));
                        a.a(aVar, hashMap);
                    }
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("loginStatus::onStatusChanged exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(long j, String str, String str2, String str3) {
                Object[] objArr3 = {new Long(j), str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "54a4232065cd007f4dfba5a0e7edf030", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "54a4232065cd007f4dfba5a0e7edf030");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("loginStatus", Integer.valueOf(c.a(com.sankuai.xm.im.connection.b.CONNECTED)));
                    hashMap.put("resCode", 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    hashMap.put("uid", sb.toString());
                    hashMap.put("xmToken", str);
                    hashMap.put("alToken", str2);
                    hashMap.put("businessInfo", str3);
                    hashMap.put("isDeviceChange", Boolean.valueOf(com.sankuai.xm.login.a.a().p()));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("loginStatus::onConnected exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f92ce37b8ccd54f7cc15f06172f80a2f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f92ce37b8ccd54f7cc15f06172f80a2f");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("loginStatus", Integer.valueOf(c.a(com.sankuai.xm.im.connection.b.AUTH_FAILURE)));
                    hashMap.put("resCode", Integer.valueOf(i));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("loginStatus::onAuthError exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db59c0a2b6c4b2f22c2eda1153ba31ec", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db59c0a2b6c4b2f22c2eda1153ba31ec");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("loginStatus", Integer.valueOf(c.a(com.sankuai.xm.im.connection.b.LOGOFF)));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("loginStatus::onLogoff exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.d
            public final void a(long j, int i) {
                Object[] objArr3 = {new Long(j), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1b20c92636f7e64b29bc67f4fab8766", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1b20c92636f7e64b29bc67f4fab8766");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("loginStatus", Integer.valueOf(c.a(com.sankuai.xm.im.connection.b.KICKOFF)));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("loginStatus::onKickedOut exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.h);
    }
}
