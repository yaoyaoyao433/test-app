package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends a {
    public static ChangeQuickRedirect a;

    public k(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89543d2fc380b591c8935d946ece35b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89543d2fc380b591c8935d946ece35b1");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b32d655dbe426c0c3fe957c646e718", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b32d655dbe426c0c3fe957c646e718")).intValue();
        }
        if (iMMessage instanceof GPSMessage) {
            GPSMessage gPSMessage = (GPSMessage) iMMessage;
            int a2 = super.a(gPSMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(gPSMessage.getName()) || com.sankuai.xm.base.proto.protobase.e.d(gPSMessage.getImgUrl())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
