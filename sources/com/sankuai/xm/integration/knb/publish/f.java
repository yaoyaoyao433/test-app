package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends c {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.im.transfer.download.c h;

    public f(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.mediaDownload", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c54d7f072140413bf7ba49d4491433", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c54d7f072140413bf7ba49d4491433");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb00d5d3d546fd5814cff7905252d01f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb00d5d3d546fd5814cff7905252d01f");
            return;
        }
        IMClient a2 = IMClient.a();
        com.sankuai.xm.im.transfer.download.c cVar = this.h;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ecc9d1f8135257d786ce1c0a8171cb9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ecc9d1f8135257d786ce1c0a8171cb9f");
        } else {
            ((com.sankuai.xm.base.service.l) a2.D().a()).a(com.sankuai.xm.im.transfer.download.c.class).b(cVar);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4530bb0d09352016a18044cfdee4b87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4530bb0d09352016a18044cfdee4b87");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "93af3f2211617c58cae9b704f9b7ec2c", 6917529027641081856L) ? (com.sankuai.xm.im.transfer.download.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "93af3f2211617c58cae9b704f9b7ec2c") : new com.sankuai.xm.im.transfer.download.c() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.transfer.download.c
            public final void a(String str, String str2) {
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9d8b05b12ccad9352d31fc4d617d975", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9d8b05b12ccad9352d31fc4d617d975");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 2);
                    hashMap.put("url", str);
                    hashMap.put("localPath", str2);
                    hashMap.put("percent", 100);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("mediaDownload::onSuccess exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.transfer.download.c
            public final void a(String str, String str2, int i, String str3) {
                Object[] objArr3 = {str, str2, Integer.valueOf(i), str3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "715ec4e8d199c3c18f4d8796f483dfc6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "715ec4e8d199c3c18f4d8796f483dfc6");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 3);
                    hashMap.put("url", str);
                    hashMap.put("localPath", str2);
                    hashMap.put("code", Integer.valueOf(c.a(i)));
                    hashMap.put("message", str3);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("mediaDownload::onFailure exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.transfer.download.c
            public final void a(String str, String str2, int i) {
                Object[] objArr3 = {str, str2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "216f0ae4916f86af215ad1f7458fabc8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "216f0ae4916f86af215ad1f7458fabc8");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 1);
                    hashMap.put("url", str);
                    hashMap.put("localPath", str2);
                    hashMap.put("percent", Integer.valueOf(i));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("mediaDownload::onProgress exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.h);
    }
}
