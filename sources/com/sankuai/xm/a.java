package com.sankuai.xm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.coredata.processor.a;
import com.sankuai.xm.login.net.taskqueue.d;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends com.sankuai.xm.base.init.a {
    public static ChangeQuickRedirect a;

    public a(com.sankuai.xm.base.init.a aVar) {
        super(3, aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63dccc67c8eac760784d9d63222a4bfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63dccc67c8eac760784d9d63222a4bfa");
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95ec77d43231704605e16197ddfb8a13", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95ec77d43231704605e16197ddfb8a13")).booleanValue();
        }
        if (!p()) {
            b.a("Data::isAuthed is not init", new Object[0]);
            return false;
        }
        return c.a().h();
    }

    @Trace(action = "send", name = "start", traceName = "data_msg", type = i.beginNormal)
    @TraceStatus
    public final int a(DataMessage dataMessage) {
        int i;
        int i2;
        Object[] objArr = {dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479b8183ce562188d5b219970192ecaa", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479b8183ce562188d5b219970192ecaa")).intValue();
        }
        try {
            j.a(i.beginNormal, "start", "data_msg", 0L, "send", new Object[]{dataMessage});
            if (!p()) {
                b.a("Data::sendDataMessage is not init", new Object[0]);
                j.a(new Integer(10023), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                j.a(new Integer(10023));
                return 10023;
            }
            j.a("category", "data");
            com.sankuai.xm.coredata.processor.a a2 = com.sankuai.xm.coredata.processor.a.a();
            Object[] objArr2 = {dataMessage};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.coredata.processor.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8ea5bf95227acce4a05653e62fdfaad8", 6917529027641081856L)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8ea5bf95227acce4a05653e62fdfaad8")).intValue();
            } else {
                Object[] objArr3 = {dataMessage};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.coredata.processor.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "9278fa250c94c79bac216f462b13eeaf", 6917529027641081856L)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "9278fa250c94c79bac216f462b13eeaf")).intValue();
                } else if (dataMessage == null) {
                    b.b("DataMessageProcessor::checkBaseDataMsg ERR_PARAM", new Object[0]);
                    i = 10011;
                } else {
                    dataMessage.setMsgId(0L);
                    if (ac.a(dataMessage.getMsgUuid())) {
                        dataMessage.setMsgUuid(UUID.randomUUID().toString());
                    }
                    if (dataMessage.getCts() <= 0) {
                        dataMessage.setCts(c.a().a(System.currentTimeMillis()));
                    }
                    i = 0;
                }
                if (i != 0) {
                    i2 = i;
                } else {
                    j.a("type", Integer.valueOf(dataMessage.getType()));
                    com.sankuai.xm.coredata.processor.b d = a2.d();
                    Object[] objArr4 = {dataMessage};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.coredata.processor.b.a;
                    if (PatchProxy.isSupport(objArr4, d, changeQuickRedirect4, false, "0a6b2388875493f1388191a3210495d3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, d, changeQuickRedirect4, false, "0a6b2388875493f1388191a3210495d3");
                    } else if (dataMessage != null) {
                        d.b bVar = new d.b();
                        bVar.a = dataMessage.getMsgUuid();
                        bVar.b = dataMessage;
                        bVar.c = 30000L;
                        bVar.d = 0;
                        bVar.e = 0;
                        d.a(bVar);
                    }
                    a2.a(dataMessage);
                    i2 = 0;
                }
            }
            j.a(new Integer(i2), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
            j.a(new Integer(i2));
            return i2;
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final int b(DataMessage dataMessage) {
        Object[] objArr = {dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "912803b30ea61044fdc81b887db8bfc4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "912803b30ea61044fdc81b887db8bfc4")).intValue();
        }
        if (!p()) {
            b.a("Data::sendDataMsgAck is not init", new Object[0]);
            return 10023;
        }
        return com.sankuai.xm.coredata.processor.a.a().b(dataMessage);
    }

    public final void a(a.InterfaceC1380a interfaceC1380a) {
        Object[] objArr = {interfaceC1380a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae240554a4d703c4be97c1ed13e82744", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae240554a4d703c4be97c1ed13e82744");
        } else if (!p()) {
            b.a("Data::registerDataMessageListener is not init", new Object[0]);
        } else {
            com.sankuai.xm.coredata.processor.a a2 = com.sankuai.xm.coredata.processor.a.a();
            Object[] objArr2 = {interfaceC1380a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.coredata.processor.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "552fac35438bc8084fb50227078fcc37", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "552fac35438bc8084fb50227078fcc37");
            } else if (interfaceC1380a != null) {
                synchronized (a2.b) {
                    if (!a2.b.contains(interfaceC1380a)) {
                        a2.b.add(interfaceC1380a);
                    }
                }
            }
        }
    }

    public final void b(a.InterfaceC1380a interfaceC1380a) {
        Object[] objArr = {interfaceC1380a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3663476a307a6d66b1a618d01a1b9381", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3663476a307a6d66b1a618d01a1b9381");
        } else if (!p()) {
            b.a("Data::registerDataMessageListener is not init", new Object[0]);
        } else {
            com.sankuai.xm.coredata.processor.a a2 = com.sankuai.xm.coredata.processor.a.a();
            Object[] objArr2 = {interfaceC1380a};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.coredata.processor.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b2434faac54ba3b3ca13b0afe828b740", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b2434faac54ba3b3ca13b0afe828b740");
            } else if (interfaceC1380a != null) {
                synchronized (a2.b) {
                    a2.b.remove(interfaceC1380a);
                }
            }
        }
    }

    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551af0c131e3b0a2419f88dba317216b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551af0c131e3b0a2419f88dba317216b");
        } else if (!p()) {
            b.a("Data::registerDataMessageListener is not init", new Object[0]);
        } else {
            com.sankuai.xm.coredata.processor.a a2 = com.sankuai.xm.coredata.processor.a.a();
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.coredata.processor.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "203af3070099c9e0517fbb27a20cd741", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "203af3070099c9e0517fbb27a20cd741");
            } else if (bVar != null) {
                synchronized (a2.c) {
                    if (!a2.c.contains(bVar)) {
                        a2.c.add(bVar);
                    }
                }
            }
        }
    }

    public final boolean bQ_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c717efae01a7da0b5f064aabca05b8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c717efae01a7da0b5f064aabca05b8")).booleanValue() : com.sankuai.xm.coredata.processor.a.a().d;
    }
}
