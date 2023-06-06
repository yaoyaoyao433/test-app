package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.QuoteMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class r extends a {
    public static ChangeQuickRedirect a;

    public r(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b6889f31bd5fa7d69bc390363e87af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b6889f31bd5fa7d69bc390363e87af");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a8fe3c539aaef15fc4c3e85da6a338", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a8fe3c539aaef15fc4c3e85da6a338")).intValue();
        }
        if (iMMessage instanceof QuoteMessage) {
            QuoteMessage quoteMessage = (QuoteMessage) iMMessage;
            int a2 = super.a(iMMessage);
            if (a2 != 0) {
                com.sankuai.xm.im.utils.a.c("QuoteMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a2));
                return a2;
            } else if (com.sankuai.xm.base.proto.protobase.e.d(quoteMessage.getSelectedMessage())) {
                com.sankuai.xm.im.utils.a.c("QuoteMsgHandler::prepare string too long :%s", quoteMessage.getSelectedMessage());
                return 10024;
            } else if (com.sankuai.xm.base.proto.protobase.e.d(quoteMessage.getQuotedMessage())) {
                com.sankuai.xm.im.utils.a.c("QuoteMsgHandler::prepare string too long :%s", quoteMessage.getQuotedMessage());
                return 10024;
            } else if (com.sankuai.xm.base.proto.protobase.e.d(quoteMessage.getSearchText())) {
                com.sankuai.xm.im.utils.a.c("QuoteMsgHandler::prepare string too long :%s", quoteMessage.getSearchText());
                return 10024;
            } else {
                if (com.sankuai.xm.base.proto.protobase.e.d(quoteMessage.getSelectedMessage() + quoteMessage.getQuotedMessage() + quoteMessage.getSearchText())) {
                    com.sankuai.xm.im.utils.a.c("QuoteMsgHandler::prepare string too long :%s", quoteMessage.keyParamToString());
                    return 10024;
                }
                return 0;
            }
        }
        return 10100;
    }
}
