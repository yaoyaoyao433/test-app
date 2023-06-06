package com.sankuai.xm.im.message.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.CalendarMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends a {
    public static ChangeQuickRedirect a;

    public c(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be4b29499f721a14c62c9137b5ec751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be4b29499f721a14c62c9137b5ec751");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "019120b8f086e42326af748ca7783b40", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "019120b8f086e42326af748ca7783b40")).intValue();
        }
        if (iMMessage instanceof CalendarMessage) {
            CalendarMessage calendarMessage = (CalendarMessage) iMMessage;
            int a2 = super.a(calendarMessage);
            if (a2 != 0) {
                return a2;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(calendarMessage.getSummary()) || com.sankuai.xm.base.proto.protobase.e.d(calendarMessage.getLocation()) || com.sankuai.xm.base.proto.protobase.e.d(calendarMessage.getTrigger()) || com.sankuai.xm.base.proto.protobase.e.d(calendarMessage.getParticipant()) || com.sankuai.xm.base.proto.protobase.e.d(calendarMessage.getRemark())) {
                return 10024;
            }
            return a2;
        }
        return 10100;
    }
}
