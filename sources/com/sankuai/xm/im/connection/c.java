package com.sankuai.xm.im.connection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.g;
import com.sankuai.xm.base.proto.opposite.h;
import com.sankuai.xm.base.proto.send.e;
import com.sankuai.xm.base.proto.send.k;
import com.sankuai.xm.base.proto.syncread.d;
import com.sankuai.xm.base.proto.syncread.f;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import com.sankuai.xm.im.message.opposite.OppositeController;
import com.sankuai.xm.im.message.opposite.PubOppositeController;
import com.sankuai.xm.im.notice.bean.IMNotice;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static volatile g b;

    public static void a(short s, byte[] bArr) {
        Object[] objArr = {Short.valueOf(s), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e10efc2542a2505d5a9fb40d220a6f0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e10efc2542a2505d5a9fb40d220a6f0c");
        } else if (com.sankuai.xm.login.c.a().p() && (b == null || b.b(-2))) {
            com.sankuai.xm.login.c.a().a(s, bArr);
        } else {
            com.sankuai.xm.im.utils.a.d("ConnectionClient is not init", new Object[0]);
        }
    }

    public final boolean a(int i, byte[] bArr) {
        final List list;
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7628f3f7e2ab39a214b11f723999975d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7628f3f7e2ab39a214b11f723999975d")).booleanValue();
        }
        try {
            switch (i) {
                case 26279937:
                case 26279939:
                case 26279992:
                case 26869761:
                case 26869777:
                case 26869822:
                case 26869823:
                    Object[] objArr2 = {bArr, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59e7261da131f8ef86ed6a07769cc38c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59e7261da131f8ef86ed6a07769cc38c");
                        return true;
                    }
                    j.a(i.recv, "recv_msg", "send_msg", 0L, "recv", new Object[]{bArr, new Integer(i)});
                    IMMessage msgProtoToIMMessage = MessageUtils.msgProtoToIMMessage(bArr, i);
                    if (msgProtoToIMMessage != null) {
                        j.a("msguuid", msgProtoToIMMessage.getMsgUuid());
                        com.sankuai.xm.im.utils.a.b("IMProtoHandler::onReceiveIMMessage info = " + msgProtoToIMMessage.keyParamToString() + " crc32 = " + com.sankuai.xm.base.util.c.a(bArr), new Object[0]);
                        IMClient.a().i().a(msgProtoToIMMessage);
                    }
                    j.a((Object) null);
                    return true;
                case 26279938:
                    Object[] objArr3 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c449c60bad059112ab92f75a06218bf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c449c60bad059112ab92f75a06218bf");
                        return true;
                    }
                    j.a(i.recv, "recv_ack", "send_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.send.g gVar = new com.sankuai.xm.base.proto.send.g();
                    gVar.a(bArr);
                    IMClient.a().i().a(gVar.e(), gVar.b(), gVar.c(), gVar.d(), 1, gVar.f());
                    j.a((Object) null);
                    return true;
                case 26279940:
                    Object[] objArr4 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "09ae72209c330dde3172a977b9cf88be", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "09ae72209c330dde3172a977b9cf88be");
                        return true;
                    }
                    j.a(i.recv, "recv_ack", "send_msg", 0L, "send", new Object[]{bArr});
                    e eVar = new e();
                    eVar.a(bArr);
                    IMClient.a().i().a(eVar.e(), eVar.b(), eVar.c(), eVar.d(), 2, eVar.f());
                    j.a((Object) null);
                    return true;
                case 26279960:
                case 26869803:
                    Object[] objArr5 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9f9ce5f5414a126ad9ac126cf1d3b018", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9f9ce5f5414a126ad9ac126cf1d3b018");
                        return true;
                    }
                    j.a(i.recv, "recv_read", "sync_read", 0L, "recv", new Object[]{bArr});
                    d dVar = new d();
                    dVar.a(bArr);
                    IMClient.a().i().a(dVar);
                    j.a((Object) null);
                    return true;
                case 26279964:
                case 26279966:
                    Object[] objArr6 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c2d8de728c0f34fdc08167ab4bcb445c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c2d8de728c0f34fdc08167ab4bcb445c");
                        return true;
                    }
                    com.sankuai.xm.base.proto.b bVar = new com.sankuai.xm.base.proto.b();
                    bVar.a(bArr);
                    IMNotice protoToNotice = MessageUtils.protoToNotice(bVar);
                    IMClient a2 = IMClient.a();
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = IMClient.a;
                    final com.sankuai.xm.im.notice.a aVar = PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "0e1e4ff73f805b1e8a9871bfe4c74931", 6917529027641081856L) ? (com.sankuai.xm.im.notice.a) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "0e1e4ff73f805b1e8a9871bfe4c74931") : (com.sankuai.xm.im.notice.a) a2.B().a();
                    Object[] objArr8 = {protoToNotice};
                    ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.xm.im.notice.a.a;
                    if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "8b670290a4c9247ba397581714f41014", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "8b670290a4c9247ba397581714f41014");
                    } else if (protoToNotice != null) {
                        Object[] objArr9 = {protoToNotice};
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.xm.im.utils.c.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "ff9aa80b97e0457cdb2111785866c782", 6917529027641081856L)) {
                            list = (List) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "ff9aa80b97e0457cdb2111785866c782");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(protoToNotice);
                            list = arrayList;
                        }
                        Object[] objArr10 = {list};
                        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.xm.im.notice.a.a;
                        if (PatchProxy.isSupport(objArr10, aVar, changeQuickRedirect10, false, "7a85ff6a896654fb6cdbd7f33fc2e548", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr10, aVar, changeQuickRedirect10, false, "7a85ff6a896654fb6cdbd7f33fc2e548");
                        } else if (!com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
                            ((l) aVar.a().a()).b(IMClient.j.class).a(new b.a<IMClient.j>() { // from class: com.sankuai.xm.im.notice.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.base.util.b.a
                                public final /* synthetic */ boolean a(IMClient.j jVar) {
                                    IMClient.j jVar2 = jVar;
                                    Object[] objArr11 = {jVar2};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "fa53b6ea4d42ac1a261215712cceaa02", 6917529027641081856L)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "fa53b6ea4d42ac1a261215712cceaa02")).booleanValue();
                                    }
                                    jVar2.a(list);
                                    return false;
                                }
                            });
                        }
                    }
                    com.sankuai.xm.im.utils.a.a("IMProtoHandler::onNotice qun :: req:" + bVar.toString(), new Object[0]);
                    return true;
                case 26279980:
                    a(bArr);
                    return true;
                case 26279982:
                    Object[] objArr11 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "3a36c9e4a5ea3d9910648e282bd06ab2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "3a36c9e4a5ea3d9910648e282bd06ab2");
                        return true;
                    }
                    j.a(i.recv, "recv_opposite_ack", "opposite_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.opposite.g gVar2 = new com.sankuai.xm.base.proto.opposite.g();
                    gVar2.a(bArr);
                    OppositeController e = IMClient.a().i().e();
                    Object[] objArr12 = {gVar2};
                    ChangeQuickRedirect changeQuickRedirect12 = OppositeController.b;
                    if (PatchProxy.isSupport(objArr12, e, changeQuickRedirect12, false, "5a17c4fee1d4ef41b3e48313f5cc5e80", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr12, e, changeQuickRedirect12, false, "5a17c4fee1d4ef41b3e48313f5cc5e80");
                    } else {
                        com.sankuai.xm.im.utils.a.b("OppositeController::onSendOppositeRes info:%s", gVar2.toString());
                        short a3 = e.c.a(gVar2.b());
                        List<Long> b2 = e.c.b(gVar2.b());
                        if (b2 == null) {
                            com.sankuai.xm.im.utils.a.d("OppositeController::opposite param error", new Object[0]);
                        } else {
                            DBProxy.l().k.b(b2, 1);
                            e.a(a3, new ArrayList(), b2);
                        }
                    }
                    j.a((Object) null);
                    return true;
                case 26279984:
                case 26869820:
                    Object[] objArr13 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "fa5098c5817cc29a1d1277efae84aa4b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "fa5098c5817cc29a1d1277efae84aa4b");
                        return true;
                    }
                    j.a(i.recv, "recv_read_ack", "sync_read", 0L, "send", new Object[]{bArr});
                    f fVar = new f();
                    fVar.a(bArr);
                    com.sankuai.xm.im.message.d i2 = IMClient.a().i();
                    Object[] objArr14 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect14 = com.sankuai.xm.im.message.d.a;
                    if (PatchProxy.isSupport(objArr14, i2, changeQuickRedirect14, false, "1ded4f6447f6dc773cf9d2b26340ebcb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr14, i2, changeQuickRedirect14, false, "1ded4f6447f6dc773cf9d2b26340ebcb");
                    } else {
                        ((com.sankuai.xm.im.message.syncread.b) i2.j().a()).a(fVar);
                    }
                    j.a((Object) null);
                    return true;
                case 26279987:
                    Object[] objArr15 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "bcf025d5aed10e55382a9c1555cbbb58", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "bcf025d5aed10e55382a9c1555cbbb58");
                        return true;
                    }
                    j.a(i.recv, "recv_opposite_ack", "opposite_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.opposite.d dVar2 = new com.sankuai.xm.base.proto.opposite.d();
                    dVar2.a(bArr);
                    GroupOppositeController g = IMClient.a().i().g();
                    Object[] objArr16 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect16 = GroupOppositeController.b;
                    if (PatchProxy.isSupport(objArr16, g, changeQuickRedirect16, false, "2018a1cc9bcbb56ba44427e78075a665", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr16, g, changeQuickRedirect16, false, "2018a1cc9bcbb56ba44427e78075a665");
                    } else {
                        com.sankuai.xm.im.utils.a.b("%s::onSendOppositeRes %s", "GroupOppositeController", dVar2.toString());
                        short a4 = g.c.a(dVar2.b());
                        List<Message> b3 = g.c.b(dVar2.b());
                        if (b3 == null) {
                            com.sankuai.xm.im.utils.a.d("%s::onSendOppositeRes not found uuid:%s", "GroupOppositeController", dVar2.b());
                        } else {
                            List<Long> messagesToMsgIds = MessageUtils.messagesToMsgIds(b3);
                            DBProxy.l().k.c(messagesToMsgIds, 1);
                            g.a(a4, 1, messagesToMsgIds);
                        }
                    }
                    j.a((Object) null);
                    return true;
                case 26279988:
                    Object[] objArr17 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect17 = a;
                    if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "21cebd6e7c1d56a7750969420e0dbab3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "21cebd6e7c1d56a7750969420e0dbab3");
                        return true;
                    }
                    j.a(i.recv, "recv_opposite", "opposite_msg", 0L, "recv", new Object[]{bArr});
                    com.sankuai.xm.base.proto.opposite.c cVar = new com.sankuai.xm.base.proto.opposite.c();
                    cVar.a(bArr);
                    IMClient.a().i().g().a(cVar);
                    j.a((Object) null);
                    return true;
                case 26279990:
                    c(bArr);
                    return true;
                case 26279993:
                case 26869827:
                    Object[] objArr18 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect18 = a;
                    if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "71b17e1ae6a6c4e64c7538970d3a354a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "71b17e1ae6a6c4e64c7538970d3a354a");
                        return true;
                    }
                    j.a(i.recv, "recv_read", "sync_read", 0L, "recv", new Object[]{bArr});
                    com.sankuai.xm.base.proto.syncread.v2.c cVar2 = new com.sankuai.xm.base.proto.syncread.v2.c();
                    cVar2.a(bArr);
                    if (cVar2.e().w()) {
                        j.a((Object) null);
                        return true;
                    }
                    IMClient.a().i().a(cVar2);
                    j.a((Object) null);
                    return true;
                case 26279995:
                case 26280237:
                case 26280239:
                case 26869809:
                case 26869829:
                case 26869831:
                case 26869833:
                    Object[] objArr19 = {bArr, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect19 = a;
                    if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "ad5a7595d84d475c6b88ecdcb710e477", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "ad5a7595d84d475c6b88ecdcb710e477");
                        return true;
                    }
                    j.a(i.recv, "recv_recall", "recall_msg", 0L, "recv", new Object[]{bArr, new Integer(i)});
                    IMMessage cancelProtoToIMMessage = MessageUtils.cancelProtoToIMMessage(bArr, i);
                    if (cancelProtoToIMMessage instanceof CancelMessage) {
                        j.a("recall_type", Integer.valueOf(((CancelMessage) cancelProtoToIMMessage).getRecallType()));
                        com.sankuai.xm.im.message.d i3 = IMClient.a().i();
                        Object[] objArr20 = {cancelProtoToIMMessage, 0};
                        ChangeQuickRedirect changeQuickRedirect20 = com.sankuai.xm.im.message.d.a;
                        if (PatchProxy.isSupport(objArr20, i3, changeQuickRedirect20, false, "699b395940aec6c2ecba4ac04d02b1f5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr20, i3, changeQuickRedirect20, false, "699b395940aec6c2ecba4ac04d02b1f5");
                        } else {
                            i3.c(com.sankuai.xm.im.utils.c.a(cancelProtoToIMMessage), 0);
                        }
                    }
                    j.a((Object) null);
                    return true;
                case 26279996:
                    Object[] objArr21 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect21 = a;
                    if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "d4075016a09ec021c5ba0b33feb01feb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "d4075016a09ec021c5ba0b33feb01feb");
                        return true;
                    }
                    j.a(i.recv, "recv_addition", "send_msg_addition", 0L, "recv", new Object[]{bArr});
                    com.sankuai.xm.base.proto.addition.b bVar2 = new com.sankuai.xm.base.proto.addition.b();
                    bVar2.a(bArr);
                    if (bVar2.w()) {
                        j.a((Object) null);
                        return true;
                    }
                    com.sankuai.xm.im.message.api.b.b().a(bVar2);
                    j.a((Object) null);
                    return true;
                case 26279997:
                    Object[] objArr22 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect22 = a;
                    if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "685e7b8396a600347cae3ad38089ec63", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "685e7b8396a600347cae3ad38089ec63");
                        return true;
                    }
                    j.a(i.recv, "recv_addition", "send_msg_addition", 0L, "recv", new Object[]{bArr});
                    com.sankuai.xm.base.proto.addition.c cVar3 = new com.sankuai.xm.base.proto.addition.c();
                    cVar3.a(bArr);
                    if (cVar3.w()) {
                        j.a((Object) null);
                        return true;
                    }
                    com.sankuai.xm.im.message.api.b.b().a(cVar3);
                    j.a((Object) null);
                    return true;
                case 26280238:
                case 26280240:
                case 26869810:
                case 26869832:
                    Object[] objArr23 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect23 = a;
                    if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "3b85f5df52bbaa5457c2aa26a6dec9a7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "3b85f5df52bbaa5457c2aa26a6dec9a7");
                        return true;
                    }
                    j.a(i.recv, "recv_recall_ack", "recall_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.cancel.c cVar4 = new com.sankuai.xm.base.proto.cancel.c();
                    cVar4.a(bArr);
                    IMClient.a().i().a(cVar4.e(), cVar4.b());
                    j.a((Object) null);
                    return true;
                case 26869762:
                    Object[] objArr24 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect24 = a;
                    if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "9d0ff300f19e5abb0e26b99bb5df2bc2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "9d0ff300f19e5abb0e26b99bb5df2bc2");
                        return true;
                    }
                    j.a(i.recv, "recv_ack", "send_msg", 0L, "send", new Object[]{bArr});
                    k kVar = new k();
                    kVar.a(bArr);
                    if (!IMClient.a().i().a(kVar.e(), kVar.b(), kVar.c(), kVar.d(), 3, kVar.f())) {
                        IMClient.a().i().a(kVar.e(), kVar.b(), kVar.c(), kVar.d(), 10, kVar.f());
                    }
                    j.a((Object) null);
                    return true;
                case 26869778:
                    Object[] objArr25 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "2ee74b8b06d6e92e61b9f1536312cb87", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "2ee74b8b06d6e92e61b9f1536312cb87");
                        return true;
                    }
                    j.a(i.recv, "recv_ack", "send_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.send.i iVar = new com.sankuai.xm.base.proto.send.i();
                    iVar.a(bArr);
                    if (!IMClient.a().i().a(iVar.e(), iVar.b(), iVar.c(), iVar.d(), 3, iVar.f())) {
                        IMClient.a().i().a(iVar.e(), iVar.b(), iVar.c(), iVar.d(), 11, iVar.f());
                    }
                    j.a((Object) null);
                    return true;
                case 26869816:
                    b(bArr);
                    return true;
                case 26869818:
                    Object[] objArr26 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect26 = a;
                    if (PatchProxy.isSupport(objArr26, this, changeQuickRedirect26, false, "0aafbb760b3b9c05130347cda9d6bd89", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr26, this, changeQuickRedirect26, false, "0aafbb760b3b9c05130347cda9d6bd89");
                        return true;
                    }
                    j.a(i.recv, "recv_opposite_ack", "opposite_msg", 0L, "send", new Object[]{bArr});
                    com.sankuai.xm.base.proto.opposite.j jVar = new com.sankuai.xm.base.proto.opposite.j();
                    jVar.a(bArr);
                    IMClient.a().i().f().a(jVar);
                    j.a((Object) null);
                    return true;
                case 26869825:
                    d(bArr);
                    return true;
                case 26869834:
                    Object[] objArr27 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect27 = a;
                    if (PatchProxy.isSupport(objArr27, this, changeQuickRedirect27, false, "4818f155bb8e81d75a8df1b24d0b53de", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr27, this, changeQuickRedirect27, false, "4818f155bb8e81d75a8df1b24d0b53de");
                        return true;
                    }
                    j.a(i.recv, "recv_addition", "send_msg_addition", 0L, "recv", new Object[]{bArr});
                    com.sankuai.xm.base.proto.addition.d dVar3 = new com.sankuai.xm.base.proto.addition.d();
                    dVar3.a(bArr);
                    if (dVar3.w()) {
                        j.a((Object) null);
                        return true;
                    }
                    com.sankuai.xm.im.message.api.b.b().a(dVar3);
                    j.a((Object) null);
                    return true;
                default:
                    return false;
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.d("IMProtoHandler.onProto, uri=" + i + ", ex=" + e2.getMessage(), new Object[0]);
            return true;
        }
    }

    @Trace(action = "recv", name = "recv_opposite", traceName = "opposite_msg", type = i.recv)
    private void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7918df68a676a8ce80e88dfd5d4cccae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7918df68a676a8ce80e88dfd5d4cccae");
            return;
        }
        try {
            j.a(i.recv, "recv_opposite", "opposite_msg", 0L, "recv", new Object[]{bArr});
            com.sankuai.xm.base.proto.opposite.e eVar = new com.sankuai.xm.base.proto.opposite.e();
            eVar.a(bArr);
            byte[][] b2 = eVar.b();
            if (b2 != null && b2.length > 0) {
                for (byte[] bArr2 : b2) {
                    if (bArr2 != null) {
                        com.sankuai.xm.base.proto.opposite.f fVar = new com.sankuai.xm.base.proto.opposite.f();
                        fVar.a(bArr2);
                        OppositeController e = IMClient.a().i().e();
                        Object[] objArr2 = {fVar};
                        ChangeQuickRedirect changeQuickRedirect2 = OppositeController.b;
                        if (PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "2ae92dbe3172435777973e52a7f56a40", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "2ae92dbe3172435777973e52a7f56a40");
                        } else {
                            com.sankuai.xm.im.utils.a.b("OppositeController::onReceiveOpposite info:%s", fVar);
                            if (e.a(fVar.d())) {
                                long[] e2 = fVar.e();
                                if (e2 != null && e2.length > 0) {
                                    HashSet hashSet = new HashSet();
                                    for (long j : e2) {
                                        hashSet.add(Long.valueOf(j));
                                    }
                                    e.a(hashSet, SessionId.a(fVar.b(), 0L, 1, fVar.c(), fVar.d()));
                                }
                                com.sankuai.xm.im.utils.a.d("OppositeController::opposite param error", new Object[0]);
                            }
                        }
                    }
                }
                j.a((Object) null);
                return;
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(action = "recv", name = "recv_opposite", traceName = "opposite_msg", type = i.recv)
    private void b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4278fae0572491e540b775fd9d87d7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4278fae0572491e540b775fd9d87d7b");
            return;
        }
        try {
            j.a(i.recv, "recv_opposite", "opposite_msg", 0L, "recv", new Object[]{bArr});
            h hVar = new h();
            hVar.a(bArr);
            byte[][] b2 = hVar.b();
            if (b2 != null && b2.length > 0) {
                for (byte[] bArr2 : b2) {
                    if (bArr2 != null) {
                        com.sankuai.xm.base.proto.opposite.i iVar = new com.sankuai.xm.base.proto.opposite.i();
                        iVar.a(bArr2);
                        PubOppositeController f = IMClient.a().i().f();
                        Object[] objArr2 = {iVar};
                        ChangeQuickRedirect changeQuickRedirect2 = PubOppositeController.b;
                        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "8c1bbb54e158f7295080f55ae2356c91", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "8c1bbb54e158f7295080f55ae2356c91");
                        } else if (!f.a(iVar.e())) {
                            com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error", new Object[0]);
                        } else {
                            com.sankuai.xm.im.utils.a.b("PubOppositeController::onReceiveOpposite %s", iVar);
                            SessionId a2 = SessionId.a(iVar.b(), iVar.c(), 3, iVar.d(), iVar.e());
                            Long l = f.c.get(a2);
                            if (l == null || l.longValue() < iVar.f()) {
                                f.c.put(a2, Long.valueOf(iVar.f()));
                            }
                            f.b(a2, iVar.f());
                        }
                    }
                }
                j.a((Object) null);
                return;
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(action = "recv", name = "recv_opposite", traceName = "opposite_msg", type = i.recv)
    private void c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d576d7275d17616edc3f4cd0c47aaea0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d576d7275d17616edc3f4cd0c47aaea0");
            return;
        }
        try {
            j.a(i.recv, "recv_opposite", "opposite_msg", 0L, "recv", new Object[]{bArr});
            com.sankuai.xm.base.proto.opposite.v2.a aVar = new com.sankuai.xm.base.proto.opposite.v2.a();
            aVar.a(bArr);
            if (aVar.w()) {
                j.a((Object) null);
                return;
            }
            byte[][] b2 = aVar.b();
            if (b2 != null && b2.length > 0) {
                for (byte[] bArr2 : b2) {
                    if (bArr2 != null) {
                        com.sankuai.xm.base.proto.opposite.v2.b bVar = new com.sankuai.xm.base.proto.opposite.v2.b();
                        bVar.a(bArr2);
                        OppositeController e = IMClient.a().i().e();
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = OppositeController.b;
                        if (PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "e4cb4a056790e5e7a1ca3880b4497e42", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "e4cb4a056790e5e7a1ca3880b4497e42");
                        } else {
                            com.sankuai.xm.im.utils.a.b("OppositeController::onReceiveOpposite2 info:%s", bVar);
                            if (e.a(bVar.d())) {
                                long[] e2 = bVar.e();
                                if (e2 != null && e2.length > 0) {
                                    HashSet hashSet = new HashSet();
                                    for (long j : e2) {
                                        hashSet.add(Long.valueOf(j));
                                    }
                                    e.a(hashSet, SessionId.a(bVar.b(), 0L, MessageUtils.confirmProto2Category(bVar.f(), 0L, 1), bVar.c(), bVar.d(), bVar.f()));
                                }
                                com.sankuai.xm.im.utils.a.d("OppositeController::opposite param error", new Object[0]);
                            }
                        }
                    }
                }
                j.a((Object) null);
                return;
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(action = "recv", name = "recv_opposite", traceName = "opposite_msg", type = i.recv)
    private void d(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab4c65c062c68b9c7056fefb1332a819", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab4c65c062c68b9c7056fefb1332a819");
            return;
        }
        try {
            j.a(i.recv, "recv_opposite", "opposite_msg", 0L, "recv", new Object[]{bArr});
            com.sankuai.xm.base.proto.opposite.v2.c cVar = new com.sankuai.xm.base.proto.opposite.v2.c();
            cVar.a(bArr);
            if (cVar.w()) {
                j.a((Object) null);
                return;
            }
            byte[][] b2 = cVar.b();
            if (b2 != null && b2.length > 0) {
                for (byte[] bArr2 : b2) {
                    if (bArr2 != null) {
                        com.sankuai.xm.base.proto.opposite.v2.d dVar = new com.sankuai.xm.base.proto.opposite.v2.d();
                        dVar.a(bArr2);
                        PubOppositeController f = IMClient.a().i().f();
                        Object[] objArr2 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = PubOppositeController.b;
                        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "4b76caf5a6a8e422ec5cb6af66c5ce79", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "4b76caf5a6a8e422ec5cb6af66c5ce79");
                        } else if (!f.a(dVar.e())) {
                            com.sankuai.xm.im.utils.a.d("PubOppositeController::opposite param error", new Object[0]);
                        } else {
                            com.sankuai.xm.im.utils.a.b("PubOppositeController::onReceiveOpposite2 %s", dVar);
                            SessionId a2 = SessionId.a(dVar.b(), dVar.c(), dVar.c() == 0 ? 10 : 11, dVar.d(), dVar.e(), dVar.g());
                            Long l = f.c.get(a2);
                            if (l == null || l.longValue() < dVar.f()) {
                                f.c.put(a2, Long.valueOf(dVar.f()));
                            }
                            f.b(a2, dVar.f());
                        }
                    }
                }
                j.a((Object) null);
                return;
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }
}
