package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TemplateMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends a {
    public static ChangeQuickRedirect a;

    public f(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8652c992df0fb934cd3dc7e17b17e282", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8652c992df0fb934cd3dc7e17b17e282");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4850bf111efe9556b5fd36b0c4302d90", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4850bf111efe9556b5fd36b0c4302d90")).intValue();
        }
        if (iMMessage instanceof TemplateMessage) {
            TemplateMessage templateMessage = (TemplateMessage) iMMessage;
            int a2 = super.a(templateMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(templateMessage.getTemplateName()) || com.sankuai.xm.base.proto.protobase.e.d(templateMessage.getContentTitle()) || com.sankuai.xm.base.proto.protobase.e.d(templateMessage.getContent()) || com.sankuai.xm.base.proto.protobase.e.d(templateMessage.getLinkName()) || com.sankuai.xm.base.proto.protobase.e.d(templateMessage.getLink())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
