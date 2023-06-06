package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.LinkMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o extends a {
    public static ChangeQuickRedirect a;

    public o(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe29bbc24b9641b21ca92d4ad5dbaae3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe29bbc24b9641b21ca92d4ad5dbaae3");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf58067f6ec593b7b6330a798b51be8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf58067f6ec593b7b6330a798b51be8")).intValue();
        }
        if (iMMessage instanceof LinkMessage) {
            LinkMessage linkMessage = (LinkMessage) iMMessage;
            int a2 = super.a(linkMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(linkMessage.getTitle()) || com.sankuai.xm.base.proto.protobase.e.d(linkMessage.getImage()) || com.sankuai.xm.base.proto.protobase.e.d(linkMessage.getContent()) || com.sankuai.xm.base.proto.protobase.e.d(linkMessage.getLink())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
