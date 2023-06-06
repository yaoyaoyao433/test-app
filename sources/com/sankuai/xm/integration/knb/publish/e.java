package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends c {
    public static ChangeQuickRedirect a;
    private GroupOppositeController.OnGroupOppositeChangeListener h;

    public e(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.groupOpposite", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1e4e7d9054c89c5eb9b7629f5a8df4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1e4e7d9054c89c5eb9b7629f5a8df4");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166c4b1ee993ce4f3c7edbe01adbd51c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166c4b1ee993ce4f3c7edbe01adbd51c");
        } else {
            IMClient.a().b(this.d, this.h);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603eeb3da995f8b59d9228ab9953e055", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603eeb3da995f8b59d9228ab9953e055");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cb03493b3265be505ceea2ad1ba0477f", 6917529027641081856L) ? (GroupOppositeController.OnGroupOppositeChangeListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cb03493b3265be505ceea2ad1ba0477f") : new GroupOppositeController.OnGroupOppositeChangeListener() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.message.opposite.GroupOppositeController.OnGroupOppositeChangeListener
            public final void onReceiveOppositeInfo(List<GroupOppositeController.a> list) {
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e48b8e1f0923065af1ecfd45fc46eb3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e48b8e1f0923065af1ecfd45fc46eb3");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 2);
                    hashMap.put("data", c.d(list));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("groupOpposite::onReceiveOppositeInfo exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.message.opposite.GroupOppositeController.OnGroupOppositeChangeListener
            public final void onSendOppositeRes(int i, List<Long> list) {
                Object[] objArr3 = {Integer.valueOf(i), list};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f7ca2d195d94ac6d83cf7614809f82f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f7ca2d195d94ac6d83cf7614809f82f");
                    return;
                }
                try {
                    if (com.sankuai.xm.base.util.b.a(list)) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Long l : list) {
                        GroupOppositeController.a aVar2 = new GroupOppositeController.a();
                        aVar2.a(l.longValue());
                        aVar2.c = i;
                        arrayList.add(aVar2);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 2);
                    hashMap.put("data", c.d(arrayList));
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("groupOpposite::onSendOppositeRes exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.message.opposite.GroupOppositeController.OnGroupOppositeChangeListener
            public final void onOppositeConfigChanged() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "164a01c90466971e1473d122c84b310d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "164a01c90466971e1473d122c84b310d");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 1);
                    a.a(aVar, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("groupOpposite::onOppositeConfigChanged exception:" + th, new Object[0]);
                }
            }
        };
        IMClient.a().a(this.d, this.h);
    }
}
