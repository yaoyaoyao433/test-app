package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.DataMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.notice.bean.IMNotice;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends c {
    public static ChangeQuickRedirect a;
    private IMClient.i h;
    private IMClient.e i;
    private IMClient.j j;

    public l(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.messages", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fb50c30460b88727929c2f60a46b61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fb50c30460b88727929c2f60a46b61");
            return;
        }
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32c8d462f67a7ad7473c6c8969485e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32c8d462f67a7ad7473c6c8969485e7");
            return;
        }
        IMClient.a().b(this.d, this.h);
        IMClient a2 = IMClient.a();
        IMClient.e eVar = this.i;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2df3221cdad6c29805c0fb077dc872fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2df3221cdad6c29805c0fb077dc872fb");
        } else {
            ((com.sankuai.xm.base.service.l) a2.D().a()).a(IMClient.e.class).b(eVar);
        }
        IMClient a3 = IMClient.a();
        IMClient.j jVar = this.j;
        Object[] objArr3 = {jVar};
        ChangeQuickRedirect changeQuickRedirect3 = IMClient.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "181749245c26afb6d786385151e0d778", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "181749245c26afb6d786385151e0d778");
        } else {
            ((com.sankuai.xm.base.service.l) a3.D().a()).a(IMClient.j.class).b(jVar);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745d105fafb03710c2696522a8680e95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745d105fafb03710c2696522a8680e95");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ba7ca1cb90ff3df906aef0a310a6f1c4", 6917529027641081856L) ? (IMClient.i) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ba7ca1cb90ff3df906aef0a310a6f1c4") : new IMClient.i() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.i
            public final void a(List<IMMessage> list, boolean z) {
                Object[] objArr3 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a1ad4ae86ffa4c55060c04e683d3c0ef", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a1ad4ae86ffa4c55060c04e683d3c0ef");
                    return;
                }
                try {
                    a.a(aVar, list);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("receiveMessage::onReceived exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.d, this.h);
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar2 = this.g;
        Object[] objArr3 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.i = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3dca1181c7ada6c53c2cf64436d9fe5c", 6917529027641081856L) ? (IMClient.e) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3dca1181c7ada6c53c2cf64436d9fe5c") : new IMClient.e() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.e
            public final void a(List<DataMessage> list, boolean z) {
                Object[] objArr4 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e4a918f945b573ccae459af32a2e0579", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e4a918f945b573ccae459af32a2e0579");
                    return;
                }
                try {
                    com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar3 = aVar2;
                    Object[] objArr5 = {aVar3, list};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b10272e10e87df48caa4baf5627ff8a9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b10272e10e87df48caa4baf5627ff8a9");
                    } else if (com.sankuai.xm.base.util.b.a(list)) {
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(list);
                        a.a(aVar3, arrayList);
                    }
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("receiveDataMessage::onReceived exception:" + th, new Object[0]);
                }
            }
        };
        IMClient a2 = IMClient.a();
        IMClient.e eVar = this.i;
        Object[] objArr4 = {eVar};
        ChangeQuickRedirect changeQuickRedirect4 = IMClient.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "432d68c0d7b90db31261fecd30bd0a9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "432d68c0d7b90db31261fecd30bd0a9f");
        } else {
            ((com.sankuai.xm.base.service.l) a2.D().a()).a(IMClient.e.class).a((l.a) eVar);
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar3 = this.g;
        Object[] objArr5 = {aVar3};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.j = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b36596f9e642c6b3a7227f2fcaeb37db", 6917529027641081856L) ? (IMClient.j) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b36596f9e642c6b3a7227f2fcaeb37db") : new IMClient.j() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.j
            public final void a(List<IMNotice> list) {
                Object[] objArr6 = {list};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "54cc5160739dcd82e273d456d7289e50", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "54cc5160739dcd82e273d456d7289e50");
                    return;
                }
                try {
                    if (com.sankuai.xm.base.util.b.a(list)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("messages", c.b(list));
                    aVar3.a(jSONObject);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("receiveNotice::onReceived exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.j);
    }
}
