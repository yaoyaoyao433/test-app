package com.sankuai.xm.im.message.data;

import android.support.annotation.NonNull;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.g;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.coredata.bean.TTMessage;
import com.sankuai.xm.coredata.processor.a;
import com.sankuai.xm.d;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.c;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends com.sankuai.xm.base.service.a implements a.InterfaceC1380a, a.b {
    public static ChangeQuickRedirect a;
    private a b;

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c978f3678b1f942bb5031583bb951c2e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c978f3678b1f942bb5031583bb951c2e")).intValue();
        }
        d.d().a((a.b) this);
        d.d().a((a.InterfaceC1380a) this);
        return super.a();
    }

    @Override // com.sankuai.xm.coredata.processor.a.InterfaceC1380a
    public final void a(int i, DataMessage dataMessage) {
        Object[] objArr = {Integer.valueOf(i), dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21e3f59de16bd8699128bf63a75e1ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21e3f59de16bd8699128bf63a75e1ba");
        } else {
            b().a(i, dataMessage.getMsgUuid(), dataMessage.getMsgId(), dataMessage.getCts());
        }
    }

    @Override // com.sankuai.xm.coredata.processor.a.InterfaceC1380a
    public final void a(List<DataMessage> list, boolean z) {
        boolean b;
        boolean z2;
        int i = 2;
        char c = 1;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59d2ecadb934e67c7997fce860edea7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59d2ecadb934e67c7997fce860edea7b");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (DataMessage dataMessage : list) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = dataMessage;
                objArr2[c] = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19e6afa7dff2b92ba7f642a0d7ef6a61", 6917529027641081856L)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19e6afa7dff2b92ba7f642a0d7ef6a61")).booleanValue();
                } else if (dataMessage == null) {
                    z2 = true;
                } else {
                    int type = dataMessage.getType();
                    if (type == 113) {
                        b = b(dataMessage, z);
                    } else if (type == 152) {
                        b = a(dataMessage, z);
                    } else {
                        z2 = false;
                        if (z2 && !d.d().bQ_()) {
                            d.d().b(dataMessage);
                        }
                    }
                    z2 = b;
                    if (z2) {
                        d.d().b(dataMessage);
                    }
                }
                if (!z2) {
                    arrayList.add(dataMessage);
                }
                i = 2;
                c = 1;
            }
            if (arrayList.size() > 0) {
                b().a(arrayList, z);
            }
        }
    }

    @Override // com.sankuai.xm.coredata.processor.a.b
    public final void a(int i, TTMessage tTMessage) {
        Object[] objArr = {Integer.valueOf(i), tTMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13f6564a57e8f377338c8b53342c426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13f6564a57e8f377338c8b53342c426");
        } else {
            b().a(i, tTMessage.getMsgUuid(), tTMessage.getMsgId(), tTMessage.getCts());
        }
    }

    @Override // com.sankuai.xm.coredata.processor.a.b
    public final void a(List<TTMessage> list) {
        final com.sankuai.xm.im.message.bean.TTMessage tTMessage;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70cf8e16b3c999dd6df6444e0d6ba04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70cf8e16b3c999dd6df6444e0d6ba04");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            final a b = b();
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "8ab1f61652052a1a5b5a6b021fe717c3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "8ab1f61652052a1a5b5a6b021fe717c3");
            } else if (!com.sankuai.xm.base.util.b.a(list)) {
                for (TTMessage tTMessage2 : list) {
                    Object[] objArr3 = {tTMessage2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9977d87822fe0b9862c5d0a6eaa77df5", 6917529027641081856L)) {
                        tTMessage = (com.sankuai.xm.im.message.bean.TTMessage) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9977d87822fe0b9862c5d0a6eaa77df5");
                    } else {
                        com.sankuai.xm.im.message.bean.TTMessage tTMessage3 = new com.sankuai.xm.im.message.bean.TTMessage();
                        tTMessage3.setMsgUuid(tTMessage2.getMsgUuid());
                        tTMessage3.setMsgId(tTMessage2.getMsgId());
                        tTMessage3.setData(tTMessage2.getData());
                        tTMessage3.setCategory(3);
                        tTMessage3.setPubCategory(6);
                        tTMessage3.setFromUid(tTMessage2.getFromUid());
                        tTMessage3.setToUid(IMClient.a().k());
                        tTMessage3.setChatId(tTMessage2.getFromUid());
                        tTMessage3.setPeerAppId((short) 0);
                        tTMessage3.setDirection(2);
                        tTMessage3.setMsgStatus(7);
                        tTMessage3.setPeerUid(0L);
                        tTMessage3.setCts(tTMessage2.getCts());
                        tTMessage3.setFromAppId(tTMessage2.getFromAppId());
                        tTMessage3.setToAppId(tTMessage2.getToAppId());
                        tTMessage3.setFileStatus(0);
                        tTMessage3.setSts(MessageUtils.msgIdToStamp(tTMessage3.getMsgId()));
                        tTMessage3.setChannel((short) 0);
                        tTMessage3.setPushType(tTMessage2.getPushType());
                        tTMessage = tTMessage3;
                    }
                    Object[] objArr4 = {tTMessage};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, b, changeQuickRedirect4, false, "428fd54f9f4562e30264c1c459dee3e8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect4, false, "428fd54f9f4562e30264c1c459dee3e8");
                    } else {
                        ((l) m.a(l.class)).b(IMClient.k.class).a(new b.a<IMClient.k>() { // from class: com.sankuai.xm.im.message.data.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.xm.base.util.b.a
                            public final /* synthetic */ boolean a(IMClient.k kVar) {
                                Object[] objArr5 = {kVar};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f5faaabfdf697955d5fa4644ae999f64", 6917529027641081856L)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f5faaabfdf697955d5fa4644ae999f64")).booleanValue();
                                }
                                return false;
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(@android.support.annotation.NonNull com.sankuai.xm.coredata.bean.DataMessage r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.data.b.a(com.sankuai.xm.coredata.bean.DataMessage, boolean):boolean");
    }

    private boolean b(@NonNull DataMessage dataMessage, boolean z) {
        int i;
        Object[] objArr = {dataMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd9dff388d8c2d6de79e5250586dd10", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd9dff388d8c2d6de79e5250586dd10")).booleanValue();
        }
        if (dataMessage.getType() != 113) {
            return false;
        }
        try {
            i = new JSONObject(new String(Base64.decode(dataMessage.getData(), 2))).optInt("insType");
        } catch (JSONException e) {
            com.sankuai.xm.im.utils.a.a(e);
            i = -1;
        }
        if (i == 1) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7043de9acc36f0424c93407bbfa37a23", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7043de9acc36f0424c93407bbfa37a23");
            } else {
                com.sankuai.xm.im.utils.a.b("DataMsgHandler::cleanByServer, start, uid = " + IMClient.a().k(), new Object[0]);
                g.a().a(new IMClient.g<Void>() { // from class: com.sankuai.xm.im.message.data.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.IMClient.g
                    public final /* synthetic */ void a(Void r13) {
                        Object[] objArr3 = {r13};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e7d6d60b394b1260feeac036742fe39", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e7d6d60b394b1260feeac036742fe39");
                            return;
                        }
                        com.sankuai.xm.im.utils.a.b("DataMsgHandler::cleanByServer, finish, uid = " + IMClient.a().k(), new Object[0]);
                        IMClient.a().j().a(false);
                        IMClient a2 = IMClient.a();
                        Object[] objArr4 = {0, (short) -1};
                        ChangeQuickRedirect changeQuickRedirect4 = IMClient.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "649bc3bc34460ed16204a420ee03afe1", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "649bc3bc34460ed16204a420ee03afe1");
                        } else if (a2.A()) {
                        } else {
                            ((c) a2.E().a()).a(0, (short) 1);
                        }
                    }
                });
            }
        } else if (i != 5) {
            return false;
        } else {
            com.sankuai.xm.file.proxy.b b = com.sankuai.xm.file.proxy.b.b();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.file.proxy.b.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "89f7c4705fcb90ac76e06e7f0ff4ec96", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "89f7c4705fcb90ac76e06e7f0ff4ec96");
            } else if (b.e) {
                com.sankuai.xm.file.util.b.b("FileCdn::onReceiveConfigChanged", new Object[0]);
                b.c();
            }
        }
        return true;
    }

    private a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b58656292c4c4beb44dba59553fbfa", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b58656292c4c4beb44dba59553fbfa");
        }
        if (this.b == null) {
            this.b = IMClient.a().i().d();
        }
        return this.b;
    }
}
