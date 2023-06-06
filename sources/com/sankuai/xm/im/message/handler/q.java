package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.NoticeMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class q extends AbstractMediaMsgHandler {
    public static ChangeQuickRedirect d;

    public q(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b879fdf7e626800b9c220f10ffd8a99b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b879fdf7e626800b9c220f10ffd8a99b");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler, com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a4d1c62fd00224d7ba0ee2dcd95dc2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a4d1c62fd00224d7ba0ee2dcd95dc2")).intValue();
        }
        if (iMMessage instanceof NoticeMessage) {
            NoticeMessage noticeMessage = (NoticeMessage) iMMessage;
            int a = super.a((IMMessage) noticeMessage);
            if (a != 0) {
                return a;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(noticeMessage.getTitle()) || com.sankuai.xm.base.proto.protobase.e.d(noticeMessage.getImage()) || com.sankuai.xm.base.proto.protobase.e.d(noticeMessage.getContent()) || com.sankuai.xm.base.proto.protobase.e.d(noticeMessage.getLink())) {
                return 10024;
            }
            return a;
        }
        return 10100;
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da637f5aeaadb08b76081b22badcfc66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da637f5aeaadb08b76081b22badcfc66");
            return;
        }
        NoticeMessage noticeMessage = (NoticeMessage) iMMessage;
        noticeMessage.setPath(com.sankuai.xm.file.util.c.a(IMClient.a().b(iMMessage.getMsgType()), com.sankuai.xm.base.util.k.c(noticeMessage.getImage())));
        iMMessage.setFileStatus(5);
    }
}
