package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends a {
    public static ChangeQuickRedirect a;

    public i(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d24b0308bc04fd30b35d63c9230eea0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d24b0308bc04fd30b35d63c9230eea0");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cdab2b370ddd6165fd6868898490d51", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cdab2b370ddd6165fd6868898490d51")).intValue();
        }
        if (iMMessage instanceof EventMessage) {
            EventMessage eventMessage = (EventMessage) iMMessage;
            int a2 = super.a(eventMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(eventMessage.getType()) || com.sankuai.xm.base.proto.protobase.e.d(eventMessage.getText())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
