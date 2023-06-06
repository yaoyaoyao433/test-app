package com.sankuai.xm.im.message.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.d;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.im.utils.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    public d b;

    public a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d54831c15e97742b6d2f772b71d73dcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d54831c15e97742b6d2f772b71d73dcb");
        } else {
            this.b = dVar;
        }
    }

    public final void a(int i, String str, long j, long j2) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2b3af94a89d8fff0715de6164fefbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2b3af94a89d8fff0715de6164fefbd");
            return;
        }
        d.c a2 = this.b.a(str);
        if (a2 != null) {
            IMMessage iMMessage = a2.b;
            iMMessage.setCts(j2);
            iMMessage.setMsgId(j);
            iMMessage.setMsgStatus(i == 0 ? 5 : 4);
            iMMessage.setSts(MessageUtils.msgIdToStamp(j));
            iMMessage.setErrorCode(i);
            IMClient.SendMessageCallback sendMessageCallback = a2.c;
            if (sendMessageCallback != null) {
                if (i == 0) {
                    sendMessageCallback.a(iMMessage);
                    return;
                }
                com.sankuai.xm.im.utils.a.d("DataMsgController::onSendMessageResult, code = " + i, new Object[0]);
                sendMessageCallback.onFailure(iMMessage, i);
            }
        }
    }

    public final void a(List<DataMessage> list, final boolean z) {
        final com.sankuai.xm.im.message.bean.DataMessage dataMessage;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e403331348d0c8b13b10fae4b0ef2258", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e403331348d0c8b13b10fae4b0ef2258");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            for (DataMessage dataMessage2 : list) {
                Object[] objArr2 = {dataMessage2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c32f6704f204f3193844d3380120ac72", 6917529027641081856L)) {
                    dataMessage = (com.sankuai.xm.im.message.bean.DataMessage) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c32f6704f204f3193844d3380120ac72");
                } else {
                    com.sankuai.xm.im.message.bean.DataMessage dataMessage3 = new com.sankuai.xm.im.message.bean.DataMessage();
                    dataMessage3.setMessage(dataMessage2.getData());
                    dataMessage3.setMsgType(-2);
                    dataMessage3.setType(dataMessage2.getType());
                    dataMessage3.setMsgId(dataMessage2.getMsgId());
                    dataMessage3.setSts(MessageUtils.msgIdToStamp(dataMessage3.getMsgId()));
                    dataMessage3.setChannel(dataMessage2.getChannel());
                    dataMessage = dataMessage3;
                }
                Object[] objArr3 = {dataMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e85832ed36929e5de53779088b726664", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e85832ed36929e5de53779088b726664");
                } else {
                    ((l) m.a(l.class)).b(IMClient.e.class).a(new b.a<IMClient.e>() { // from class: com.sankuai.xm.im.message.data.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.util.b.a
                        public final /* synthetic */ boolean a(IMClient.e eVar) {
                            List<com.sankuai.xm.im.message.bean.DataMessage> arrayList;
                            IMClient.e eVar2 = eVar;
                            Object[] objArr4 = {eVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c2e4fdcdd867025ca16264fc64cc48cd", 6917529027641081856L)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c2e4fdcdd867025ca16264fc64cc48cd")).booleanValue();
                            }
                            com.sankuai.xm.im.message.bean.DataMessage dataMessage4 = dataMessage;
                            Object[] objArr5 = {dataMessage4};
                            ChangeQuickRedirect changeQuickRedirect5 = c.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "5fe91b0be23ad23991c265831c629091", 6917529027641081856L)) {
                                arrayList = (List) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "5fe91b0be23ad23991c265831c629091");
                            } else {
                                arrayList = new ArrayList<>();
                                arrayList.add(dataMessage4);
                            }
                            eVar2.a(arrayList, z);
                            return false;
                        }
                    });
                }
            }
        }
    }

    public static DataMessage a(com.sankuai.xm.im.message.bean.DataMessage dataMessage) {
        Object[] objArr = {dataMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5717dd5006e11d0815aeb7c620989470", 6917529027641081856L)) {
            return (DataMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5717dd5006e11d0815aeb7c620989470");
        }
        DataMessage dataMessage2 = new DataMessage();
        dataMessage2.setChannel(dataMessage.getChannel());
        dataMessage2.setCts(dataMessage.getCts());
        dataMessage2.setData(dataMessage.getMessage());
        dataMessage2.setMsgId(dataMessage.getMsgId());
        dataMessage2.setMsgUuid(dataMessage.getMsgUuid());
        dataMessage2.setType(dataMessage.getType());
        return dataMessage2;
    }
}
