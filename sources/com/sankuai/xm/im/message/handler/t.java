package com.sankuai.xm.im.message.handler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class t extends a {
    public static ChangeQuickRedirect a;

    public t(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5723de8e9effe4dfd1c98ef9e1bdd87a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5723de8e9effe4dfd1c98ef9e1bdd87a");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289138264fd89c927dd2f44a98022f72", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289138264fd89c927dd2f44a98022f72")).intValue();
        }
        TextMessage textMessage = (TextMessage) iMMessage;
        textMessage.setFontName("");
        textMessage.setFontSize(13);
        textMessage.setBold(false);
        int a2 = super.a(iMMessage);
        if (a2 != 0) {
            com.sankuai.xm.im.utils.a.c("TextMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a2));
            return a2;
        } else if (!TextUtils.isEmpty(textMessage.getText())) {
            return com.sankuai.xm.base.proto.protobase.e.d(textMessage.getText()) ? 10024 : 0;
        } else {
            com.sankuai.xm.im.utils.a.c("TextMsgHandler::prepare, msg uuid: %s, ERR_TEXT_EMPTY", iMMessage.getMsgUuid());
            return 10001;
        }
    }
}
