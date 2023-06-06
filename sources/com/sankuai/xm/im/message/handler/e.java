package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends a {
    public static ChangeQuickRedirect a;

    public e(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b344f2f6679557a8d3e338e848ad0c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b344f2f6679557a8d3e338e848ad0c1");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a75c10abeb274c587882113fdea23bb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a75c10abeb274c587882113fdea23bb")).intValue();
        }
        if (iMMessage instanceof CustomEmotionMessage) {
            CustomEmotionMessage customEmotionMessage = (CustomEmotionMessage) iMMessage;
            int a2 = super.a(customEmotionMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(customEmotionMessage.getPackageId()) || com.sankuai.xm.base.proto.protobase.e.d(customEmotionMessage.getPackageName()) || com.sankuai.xm.base.proto.protobase.e.d(customEmotionMessage.getId()) || com.sankuai.xm.base.proto.protobase.e.d(customEmotionMessage.getParams())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
