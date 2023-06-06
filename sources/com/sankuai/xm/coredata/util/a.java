package com.sankuai.xm.coredata.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.data.b;
import com.sankuai.xm.base.proto.data.d;
import com.sankuai.xm.base.proto.protobase.e;
import com.sankuai.xm.coredata.bean.DataMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static e a(DataMessage dataMessage) {
        Object[] objArr = {dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4144f9209ff2335d9c96ad54780e7b61", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4144f9209ff2335d9c96ad54780e7b61");
        }
        b bVar = new b();
        bVar.c(com.sankuai.xm.login.a.a().d);
        bVar.a(com.sankuai.xm.login.a.a().b);
        bVar.e = dataMessage.getMsgUuid();
        bVar.c = (byte) 1;
        bVar.b = dataMessage.getType();
        bVar.d = dataMessage.getData();
        bVar.c(dataMessage.getCts());
        bVar.b(0L);
        bVar.f = dataMessage.getChannel();
        return bVar;
    }

    public static DataMessage a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "819fb2da777909ab9bf2e7488bb5cffb", 6917529027641081856L)) {
            return (DataMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "819fb2da777909ab9bf2e7488bb5cffb");
        }
        DataMessage dataMessage = new DataMessage();
        dataMessage.setData(dVar.d);
        dataMessage.setType(dVar.b);
        dataMessage.setMsgId(dVar.c);
        dataMessage.setChannel(dVar.e);
        return dataMessage;
    }
}
