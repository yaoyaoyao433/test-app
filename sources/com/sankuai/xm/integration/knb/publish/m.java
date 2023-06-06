package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m extends c implements IMClient.f {
    public static ChangeQuickRedirect a;
    private IMClient.f h;

    public m(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.sessionsChange", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "292d0bd3370bbaf582fd1847d8d2ede2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "292d0bd3370bbaf582fd1847d8d2ede2");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649d5c7dceb41e717d0bb072babf92b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649d5c7dceb41e717d0bb072babf92b6");
            return;
        }
        IMClient a2 = IMClient.a();
        short s = this.d;
        IMClient.f fVar = this.h;
        Object[] objArr2 = {Short.valueOf(s), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f922130a4439786cacad68360824a558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f922130a4439786cacad68360824a558");
        } else {
            ((com.sankuai.xm.base.service.l) a2.D().a()).a(IMClient.f.class).a(s).b(fVar);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.f
    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48b97aaec72047f7ec3b05b17dc4ef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48b97aaec72047f7ec3b05b17dc4ef5");
        } else {
            this.h.a(list);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.f
    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4bca847a50289fc8dd812d0353e1937", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4bca847a50289fc8dd812d0353e1937");
        } else {
            this.h.b(list);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f5adaaedfd977742923ebc1d41306a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f5adaaedfd977742923ebc1d41306a");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "810132a05056a18a8fed99f8519f997a", 6917529027641081856L) ? (IMClient.f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "810132a05056a18a8fed99f8519f997a") : new IMClient.f() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.f
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fece471eb4620a29e60417da04d7d414", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fece471eb4620a29e60417da04d7d414");
                    return;
                }
                try {
                    a.a(aVar, list, false);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("sessionsChange::onSessionChanged exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.f
            public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "267cf25132c2c5780a42eeb1f49a69dd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "267cf25132c2c5780a42eeb1f49a69dd");
                    return;
                }
                try {
                    a.a(aVar, list, true);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("sessionsChange::onSessionDeleted exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.d, this.h);
    }
}
