package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.opposite.OppositeController;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends c {
    public static ChangeQuickRedirect a;
    private OppositeController.OnOppositeChangeListener h;

    public i(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.personOpposite", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a1c874520dd007a5a43c813d407d04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a1c874520dd007a5a43c813d407d04");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1647a0936b4277c61dc17a276aed8dac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1647a0936b4277c61dc17a276aed8dac");
        } else {
            IMClient.a().b(this.d, this.h);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572fa6997266e4acdd5fc4a3a1a0faa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572fa6997266e4acdd5fc4a3a1a0faa1");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a8b6a6a7244825015f764e55464022f0", 6917529027641081856L) ? (OppositeController.OnOppositeChangeListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a8b6a6a7244825015f764e55464022f0") : new OppositeController.OnOppositeChangeListener() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.message.opposite.OppositeController.OnOppositeChangeListener
            public final void onOppositeChanged(List<Long> list, List<Long> list2) {
                Object[] objArr3 = {list, list2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "92e4cfd6691970544ade920451cbfd7f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "92e4cfd6691970544ade920451cbfd7f");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 2);
                    hashMap.put("unreadMsgIds", c.a(list));
                    hashMap.put("readMsgIds", c.a(list2));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("personOpposite::onOppositeChanged exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.message.opposite.OppositeController.OnOppositeChangeListener
            public final void onOppositeConfigChanged() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31fe7714463c7bdc37b705ff3b5957c1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31fe7714463c7bdc37b705ff3b5957c1");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 1);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("personOpposite::onOppositeConfigChanged exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.d, this.h);
    }
}
