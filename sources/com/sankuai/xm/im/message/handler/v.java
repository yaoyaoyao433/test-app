package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.VCardMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class v extends a {
    public static ChangeQuickRedirect a;

    public v(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90147d902bef4ea443c68c788e4b136f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90147d902bef4ea443c68c788e4b136f");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b1b7728eae54c18e7d033c6709ae30", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b1b7728eae54c18e7d033c6709ae30")).intValue();
        }
        if (iMMessage instanceof VCardMessage) {
            VCardMessage vCardMessage = (VCardMessage) iMMessage;
            int a2 = super.a(vCardMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(vCardMessage.getName()) || com.sankuai.xm.base.proto.protobase.e.d(vCardMessage.getAccount())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
