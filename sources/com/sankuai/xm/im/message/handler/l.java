package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends a {
    public static ChangeQuickRedirect a;

    public l(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3657523d124b7011ff6bd5fdfcb8b079", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3657523d124b7011ff6bd5fdfcb8b079");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bbe8e0f481c97c3cfacae7c2a3b726e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bbe8e0f481c97c3cfacae7c2a3b726e")).intValue();
        }
        GeneralMessage generalMessage = (GeneralMessage) iMMessage;
        int a2 = super.a(iMMessage);
        return a2 != 0 ? a2 : (com.sankuai.xm.base.proto.protobase.e.c(generalMessage.getData()) || com.sankuai.xm.base.proto.protobase.e.d(generalMessage.getSummary())) ? 10024 : 0;
    }
}
