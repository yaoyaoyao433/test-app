package com.sankuai.xm.im.message.handler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.DynamicMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends a {
    public static ChangeQuickRedirect a;

    public g(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e090869f19977a493a302663ca3554", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e090869f19977a493a302663ca3554");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82cf19f6112052f6c254d56c5094fbfa", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82cf19f6112052f6c254d56c5094fbfa")).intValue();
        }
        if (iMMessage instanceof DynamicMessage) {
            DynamicMessage dynamicMessage = (DynamicMessage) iMMessage;
            int a2 = super.a(iMMessage);
            if (a2 != 0) {
                com.sankuai.xm.im.utils.a.c("DynamicMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a2));
                return a2;
            } else if (dynamicMessage.getId() <= 0) {
                com.sankuai.xm.im.utils.a.c("DynamicMsgHandler::prepare id is not valid :%s", Long.valueOf(dynamicMessage.getId()));
                return 10011;
            } else if (com.sankuai.xm.base.proto.protobase.e.d(dynamicMessage.getTitle())) {
                com.sankuai.xm.im.utils.a.c("DynamicMsgHandler::prepare string [title] too long :%s", dynamicMessage.getTitle());
                return 10024;
            } else if (TextUtils.isEmpty(dynamicMessage.getDxData())) {
                com.sankuai.xm.im.utils.a.c("DynamicMsgHandler::prepare string [dxData] is empty.", new Object[0]);
                return 10011;
            } else if (com.sankuai.xm.base.proto.protobase.e.d(dynamicMessage.getDxData())) {
                com.sankuai.xm.im.utils.a.c("DynamicMsgHandler::prepare string [dxData] too long :%s", dynamicMessage.getDxData());
                return 10024;
            } else if (com.sankuai.xm.base.proto.protobase.e.d(dynamicMessage.getAppData())) {
                com.sankuai.xm.im.utils.a.c("DynamicMsgHandler::prepare string [appData] too long :%s", dynamicMessage.getAppData());
                return 10024;
            } else {
                return 0;
            }
        }
        return 10100;
    }
}
