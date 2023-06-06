package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.RedPacketMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class s extends a {
    public static ChangeQuickRedirect a;

    public s(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07aad961e38845512b798bf5552c866", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07aad961e38845512b798bf5552c866");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411d788fe1d730e5fe6d7aae774313d7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411d788fe1d730e5fe6d7aae774313d7")).intValue();
        }
        if (iMMessage instanceof RedPacketMessage) {
            RedPacketMessage redPacketMessage = (RedPacketMessage) iMMessage;
            int a2 = super.a(redPacketMessage);
            if (a2 == 0 && com.sankuai.xm.base.proto.protobase.e.d(redPacketMessage.getGreetings())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
