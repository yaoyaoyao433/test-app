package com.sankuai.xm.im.utils;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.base.proto.cancel.e;
import com.sankuai.xm.base.proto.cancel.g;
import com.sankuai.xm.base.proto.inner.i;
import com.sankuai.xm.base.proto.inner.k;
import com.sankuai.xm.base.proto.inner.l;
import com.sankuai.xm.base.proto.inner.m;
import com.sankuai.xm.base.proto.inner.p;
import com.sankuai.xm.base.proto.inner.q;
import com.sankuai.xm.base.proto.inner.r;
import com.sankuai.xm.base.proto.inner.s;
import com.sankuai.xm.base.proto.inner.t;
import com.sankuai.xm.base.proto.send.d;
import com.sankuai.xm.base.proto.send.f;
import com.sankuai.xm.base.proto.send.h;
import com.sankuai.xm.base.proto.send.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.CalendarMessage;
import com.sankuai.xm.im.message.bean.CallMessage;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.DynamicMessage;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.ForceCancelMessage;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.LinkMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.im.message.bean.MultiLinkMessage;
import com.sankuai.xm.im.message.bean.NoticeMessage;
import com.sankuai.xm.im.message.bean.QuoteMessage;
import com.sankuai.xm.im.message.bean.RedPacketMessage;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.message.bean.TemplateMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
import com.sankuai.xm.im.message.bean.VCardMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.message.handler.w;
import com.sankuai.xm.im.notice.bean.IMNotice;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class MessageUtils {
    private static final int[] MSG_FORWARD_SUPPORT_TYPES = {1, 4, 8, 6, 11, 17};
    private static final String TAG = "MessageUtils::";
    private static final long TWEPOCH = 1361753741828L;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String categoryToPushChatType(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dda60d99f6f2fa7eae3817ef12e5fa59", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dda60d99f6f2fa7eae3817ef12e5fa59");
        }
        switch (i) {
            case 1:
                return "im-peer";
            case 2:
                return "im-group";
            case 3:
                return i2 == 4 ? "pub-service" : "pub-proxy";
            default:
                switch (i) {
                    case 9:
                        return "im-peer-custom";
                    case 10:
                        return "pub-service-custom";
                    case 11:
                        return "pub-proxy-custom";
                    default:
                        return "";
                }
        }
    }

    public static boolean isValidMessageStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1a6ac696014b2380f83bd8c1856bc31", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1a6ac696014b2380f83bd8c1856bc31")).booleanValue();
        }
        switch (i) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            case 1:
            case 2:
            case 6:
            case 8:
            case 10:
            case 12:
            default:
                return i >= 900 && i <= 1000;
        }
    }

    public static long msgIdToStamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57d866ae9ec4953788a120889f90c329", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57d866ae9ec4953788a120889f90c329")).longValue();
        }
        if (j == 0) {
            return 0L;
        }
        return (j >> 22) + TWEPOCH;
    }

    public static long stampToMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ee2b2a32c8d04feddcc0d2c2b89f3d5", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ee2b2a32c8d04feddcc0d2c2b89f3d5")).longValue();
        }
        if (j == 0) {
            return 0L;
        }
        return (j - TWEPOCH) << 22;
    }

    public static IMMessage msgProtoToIMMessage(byte[] bArr, int i) {
        IMMessage proto2ToIMMessage;
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d60074bc771cdddb4c6259b0a91c1129", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d60074bc771cdddb4c6259b0a91c1129");
        }
        switch (i) {
            case 26279937:
                f fVar = new f();
                fVar.a(bArr);
                return protoToIMMessage(fVar);
            case 26279939:
                d dVar = new d();
                dVar.a(bArr);
                return protoToIMMessage(dVar);
            case 26279992:
                com.sankuai.xm.base.proto.send.v2.b bVar = new com.sankuai.xm.base.proto.send.v2.b();
                bVar.a(bArr);
                if (!bVar.z().w()) {
                    proto2ToIMMessage = proto2ToIMMessage(bVar);
                    break;
                } else {
                    return null;
                }
            case 26869761:
                j jVar = new j();
                jVar.a(bArr);
                return protoToIMMessage(jVar);
            case 26869777:
                h hVar = new h();
                hVar.a(bArr);
                return protoToIMMessage(hVar);
            case 26869822:
                com.sankuai.xm.base.proto.send.v2.d dVar2 = new com.sankuai.xm.base.proto.send.v2.d();
                dVar2.a(bArr);
                if (dVar2.z().w()) {
                    return null;
                }
                return proto2ToIMMessage(dVar2);
            case 26869823:
                com.sankuai.xm.base.proto.send.v2.c cVar = new com.sankuai.xm.base.proto.send.v2.c();
                cVar.a(bArr);
                if (!cVar.z().w()) {
                    proto2ToIMMessage = proto2ToIMMessage(cVar);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return proto2ToIMMessage;
    }

    public static IMMessage cancelProtoToIMMessage(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e20e538155ad0c025cc91f49e8c29802", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e20e538155ad0c025cc91f49e8c29802");
        }
        switch (i) {
            case 26279995:
                com.sankuai.xm.base.proto.cancel.v2.b bVar = new com.sankuai.xm.base.proto.cancel.v2.b();
                bVar.a(bArr);
                if (bVar.u().w()) {
                    return null;
                }
                return protoToIMMessage(bVar);
            case 26280237:
                e eVar = new e();
                eVar.a(bArr);
                return protoToIMMessage(eVar);
            case 26280239:
                com.sankuai.xm.base.proto.cancel.d dVar = new com.sankuai.xm.base.proto.cancel.d();
                dVar.a(bArr);
                return protoToIMMessage(dVar);
            case 26869809:
                g gVar = new g();
                gVar.a(bArr);
                return protoToIMMessage(gVar);
            case 26869829:
                com.sankuai.xm.base.proto.cancel.v2.d dVar2 = new com.sankuai.xm.base.proto.cancel.v2.d();
                dVar2.a(bArr);
                if (dVar2.u().w()) {
                    return null;
                }
                return protoToIMMessage(dVar2);
            case 26869831:
                com.sankuai.xm.base.proto.cancel.f fVar = new com.sankuai.xm.base.proto.cancel.f();
                fVar.a(bArr);
                return protoToIMMessage(fVar);
            case 26869833:
                com.sankuai.xm.base.proto.cancel.v2.c cVar = new com.sankuai.xm.base.proto.cancel.v2.c();
                cVar.a(bArr);
                return protoToIMMessage(cVar);
            default:
                return null;
        }
    }

    public static IMMessage protoToIMMessage(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e53bfc4e11f2247b0ed6b3108f82dc86", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e53bfc4e11f2247b0ed6b3108f82dc86");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(fVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::protoToIMMessage, peer, inner packet invalid, msgUuid = ");
            sb.append(fVar.c());
            sb.append("/");
            sb.append(fVar.d());
            sb.append("/");
            sb.append(fVar.e());
            sb.append("/");
            sb.append(fVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setSeqId(fVar.m());
        transformToIMMessageFromProto.setDeviceId(fVar.A());
        transformToIMMessageFromProto.setClusterId(fVar.n());
        transformToIMMessageFromProto.setCategory(1);
        transformToIMMessageFromProto.setMsgId(fVar.k());
        transformToIMMessageFromProto.setFromUid(fVar.d());
        transformToIMMessageFromProto.setToUid(fVar.e());
        transformToIMMessageFromProto.setPeerUid(0L);
        transformToIMMessageFromProto.setCts(fVar.j());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) fVar.x()).c);
        transformToIMMessageFromProto.setToAppId(fVar.q());
        transformToIMMessageFromProto.setChannel(fVar.p());
        transformToIMMessageFromProto.setPeerDeviceType(fVar.b());
        if (transformToIMMessageFromProto.getFromUid() == IMClient.a().k()) {
            transformToIMMessageFromProto.setDirection(1);
            transformToIMMessageFromProto.setMsgStatus(5);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getToUid());
            transformToIMMessageFromProto.setPeerAppId(fVar.q());
        } else {
            transformToIMMessageFromProto.setDirection(2);
            transformToIMMessageFromProto.setMsgStatus(7);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getFromUid());
            transformToIMMessageFromProto.setPeerAppId(((com.sankuai.xm.base.proto.protobase.c) fVar.x()).c);
        }
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(fVar.h());
        transformToIMMessageFromProto.setMsgUuid(fVar.c());
        transformToIMMessageFromProto.setExtension(fVar.l());
        transformToIMMessageFromProto.setReceipt(fVar.o());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(fVar.u());
        transformToIMMessageFromProto.setMsgSeqid(fVar.w());
        return transformToIMMessageFromProto;
    }

    public static IMMessage protoToIMMessage(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d08dd0fd3f6ff7f2d8a8cda77211f530", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d08dd0fd3f6ff7f2d8a8cda77211f530");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(dVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::protoToIMMessage, group, inner packet invalid, msgUuid = ");
            sb.append(dVar.c());
            sb.append("/");
            sb.append(dVar.d());
            sb.append("/");
            sb.append(dVar.e());
            sb.append("/");
            sb.append(dVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setSeqId(dVar.m());
        transformToIMMessageFromProto.setDeviceId(dVar.A());
        transformToIMMessageFromProto.setClusterId(dVar.n());
        transformToIMMessageFromProto.setCategory(2);
        transformToIMMessageFromProto.setMsgId(dVar.k());
        transformToIMMessageFromProto.setFromUid(dVar.d());
        transformToIMMessageFromProto.setToUid(dVar.f());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) dVar.x()).c);
        transformToIMMessageFromProto.setToAppId(((com.sankuai.xm.base.proto.protobase.c) dVar.x()).c);
        transformToIMMessageFromProto.setPeerAppId(((com.sankuai.xm.base.proto.protobase.c) dVar.x()).c);
        transformToIMMessageFromProto.setPeerUid(0L);
        transformToIMMessageFromProto.setCts(dVar.j());
        transformToIMMessageFromProto.setChatId(dVar.f());
        if (transformToIMMessageFromProto.getFromUid() == IMClient.a().k()) {
            transformToIMMessageFromProto.setDirection(1);
            transformToIMMessageFromProto.setMsgStatus(5);
        } else {
            transformToIMMessageFromProto.setDirection(2);
            transformToIMMessageFromProto.setMsgStatus(7);
        }
        transformToIMMessageFromProto.setChannel(dVar.p());
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(dVar.h());
        transformToIMMessageFromProto.setGroupName(dVar.i());
        transformToIMMessageFromProto.setMsgUuid(dVar.c());
        transformToIMMessageFromProto.setExtension(dVar.l());
        transformToIMMessageFromProto.setReceipt(dVar.o());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(dVar.u());
        transformToIMMessageFromProto.setMsgSeqid(dVar.w());
        transformToIMMessageFromProto.setPeerDeviceType(dVar.b());
        transformToIMMessageFromProto.setFromPubId(dVar.B());
        transformToIMMessageFromProto.setFromPubName(dVar.C());
        transformToIMMessageFromProto.setMsgSource(dVar.D());
        return transformToIMMessageFromProto;
    }

    public static IMMessage proto2ToIMMessage(com.sankuai.xm.base.proto.send.v2.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60c22eca111f0a11ec55d2792c80774f", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60c22eca111f0a11ec55d2792c80774f");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(bVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::proto2ToIMMessage, peer, inner packet invalid, msgUuid = ");
            sb.append(bVar.c());
            sb.append("/");
            sb.append(bVar.d());
            sb.append("/");
            sb.append(bVar.e());
            sb.append("/");
            sb.append(bVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setSeqId(bVar.m());
        transformToIMMessageFromProto.setDeviceId(bVar.B());
        transformToIMMessageFromProto.setClusterId(bVar.n());
        transformToIMMessageFromProto.setCategory(confirmProto2Category(bVar.A(), 0L, 9));
        transformToIMMessageFromProto.setMsgId(bVar.k());
        transformToIMMessageFromProto.setFromUid(bVar.d());
        transformToIMMessageFromProto.setToUid(bVar.e());
        transformToIMMessageFromProto.setPeerUid(0L);
        transformToIMMessageFromProto.setCts(bVar.j());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.d) bVar.x()).c);
        transformToIMMessageFromProto.setToAppId(bVar.q());
        transformToIMMessageFromProto.setChannel(bVar.p());
        transformToIMMessageFromProto.setPeerDeviceType(bVar.b());
        if (transformToIMMessageFromProto.getFromUid() == IMClient.a().k()) {
            transformToIMMessageFromProto.setDirection(1);
            transformToIMMessageFromProto.setMsgStatus(5);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getToUid());
            transformToIMMessageFromProto.setPeerAppId(bVar.q());
        } else {
            transformToIMMessageFromProto.setDirection(2);
            transformToIMMessageFromProto.setMsgStatus(7);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getFromUid());
            transformToIMMessageFromProto.setPeerAppId(((com.sankuai.xm.base.proto.protobase.d) bVar.x()).c);
        }
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(bVar.h());
        transformToIMMessageFromProto.setMsgUuid(bVar.c());
        transformToIMMessageFromProto.setExtension(bVar.l());
        transformToIMMessageFromProto.setReceipt(bVar.o());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(bVar.u());
        transformToIMMessageFromProto.setMsgSeqid(bVar.w());
        transformToIMMessageFromProto.setSID(bVar.A());
        return transformToIMMessageFromProto;
    }

    public static IMMessage proto2ToIMMessage(com.sankuai.xm.base.proto.send.v2.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8acd81857a5ff259afba73a82d5e711b", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8acd81857a5ff259afba73a82d5e711b");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(dVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::proto2ToIMMessage, pub_c, inner packet invalid, msgUuid = ");
            sb.append(dVar.c());
            sb.append("/");
            sb.append(dVar.d());
            sb.append("/");
            sb.append(dVar.e());
            sb.append("/");
            sb.append(dVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setCategory(confirmProto2Category(dVar.A(), 0L, 3));
        transformToIMMessageFromProto.setPubCategory(4);
        transformToIMMessageFromProto.setMsgId(dVar.k());
        transformToIMMessageFromProto.setFromUid(dVar.d());
        transformToIMMessageFromProto.setToUid(dVar.e());
        transformToIMMessageFromProto.setPeerUid(0L);
        transformToIMMessageFromProto.setCts(dVar.j());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.d) dVar.x()).c);
        transformToIMMessageFromProto.setToAppId(dVar.q());
        transformToIMMessageFromProto.setDirection(dVar.s());
        if (dVar.s() == 1) {
            transformToIMMessageFromProto.setMsgStatus(5);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getToUid());
            transformToIMMessageFromProto.setPeerAppId((short) 0);
        } else {
            transformToIMMessageFromProto.setMsgStatus(7);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getFromUid());
            transformToIMMessageFromProto.setPeerAppId((short) 0);
        }
        transformToIMMessageFromProto.setChannel(dVar.p());
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(dVar.h());
        transformToIMMessageFromProto.setMsgUuid(dVar.c());
        transformToIMMessageFromProto.setExtension(dVar.l());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(dVar.u());
        transformToIMMessageFromProto.setMsgSeqid(dVar.w());
        transformToIMMessageFromProto.setDeviceId(dVar.B());
        transformToIMMessageFromProto.setSID(dVar.A());
        transformToIMMessageFromProto.setPeerDeviceType(dVar.b());
        return transformToIMMessageFromProto;
    }

    public static IMMessage proto2ToIMMessage(com.sankuai.xm.base.proto.send.v2.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "56945388e084ceed0c44a725f4333b65", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "56945388e084ceed0c44a725f4333b65");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(cVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::proto2ToIMMessage, pub_b, inner packet invalid, msgUuid = ");
            sb.append(cVar.c());
            sb.append("/");
            sb.append(cVar.d());
            sb.append("/");
            sb.append(cVar.e());
            sb.append("/");
            sb.append(cVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setPubCategory(5);
        transformToIMMessageFromProto.setMsgId(cVar.k());
        transformToIMMessageFromProto.setFromUid(cVar.d());
        transformToIMMessageFromProto.setToUid(cVar.e());
        transformToIMMessageFromProto.setChatId(cVar.t());
        transformToIMMessageFromProto.setCts(cVar.j());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.d) cVar.x()).c);
        transformToIMMessageFromProto.setToAppId(cVar.q());
        transformToIMMessageFromProto.setDirection(cVar.s());
        if (cVar.s() == 1) {
            transformToIMMessageFromProto.setMsgStatus(5);
            transformToIMMessageFromProto.setPeerAppId((short) 0);
            transformToIMMessageFromProto.setPeerUid(cVar.e());
        } else {
            if (transformToIMMessageFromProto.getFromUid() == com.sankuai.xm.login.a.a().e()) {
                transformToIMMessageFromProto.setMsgStatus(5);
            } else {
                transformToIMMessageFromProto.setMsgStatus(7);
            }
            transformToIMMessageFromProto.setPeerAppId((short) 0);
            transformToIMMessageFromProto.setPeerUid(cVar.d());
        }
        transformToIMMessageFromProto.setCategory(confirmProto2Category(cVar.A(), transformToIMMessageFromProto.getPeerUid(), 3));
        transformToIMMessageFromProto.setChannel(cVar.p());
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(cVar.h());
        transformToIMMessageFromProto.setMsgUuid(cVar.c());
        transformToIMMessageFromProto.setExtension(cVar.l());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(cVar.u());
        transformToIMMessageFromProto.setMsgSeqid(cVar.w());
        transformToIMMessageFromProto.setDeviceId(cVar.B());
        transformToIMMessageFromProto.setSID(cVar.A());
        transformToIMMessageFromProto.setPeerDeviceType(cVar.b());
        return transformToIMMessageFromProto;
    }

    public static IMMessage protoToIMMessage(com.sankuai.xm.base.proto.cancel.a<? extends com.sankuai.xm.base.proto.protobase.a> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd2d282c1338aa1d35351b864ad766b0", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd2d282c1338aa1d35351b864ad766b0");
        }
        CancelMessage cancelMessage = aVar.m() != 1 ? new CancelMessage() : new ForceCancelMessage();
        cancelMessage.setMsgUuid(aVar.c());
        cancelMessage.setMsgId(aVar.j());
        cancelMessage.setCts(aVar.i());
        cancelMessage.setFromUid(aVar.d());
        cancelMessage.setFromName(aVar.g());
        cancelMessage.setMsgStatus(15);
        cancelMessage.setChannel(aVar.l());
        cancelMessage.setFileStatus(0);
        cancelMessage.setExtension(aVar.k());
        cancelMessage.setSts(msgIdToStamp(aVar.j()));
        cancelMessage.setActionSts(aVar.p());
        cancelMessage.setMsgSeqid(aVar.r());
        cancelMessage.setPeerDeviceType(aVar.b());
        cancelMessage.setDeviceId(aVar.s());
        Context f = IMClient.a().f();
        if (aVar instanceof e) {
            cancelMessage.setCategory(1);
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c);
            cancelMessage.setToAppId(aVar.o());
            cancelMessage.setToUid(aVar.e());
            if (cancelMessage.getFromUid() == IMClient.a().k()) {
                cancelMessage.setDirection(1);
                cancelMessage.setChatId(cancelMessage.getToUid());
                cancelMessage.setPeerAppId(aVar.o());
                if (aVar.m() != 1) {
                    cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                }
            } else {
                cancelMessage.setDirection(2);
                cancelMessage.setChatId(cancelMessage.getFromUid());
                cancelMessage.setPeerAppId(cancelMessage.getFromAppId());
                if (aVar.m() != 1) {
                    if (TextUtils.isEmpty(cancelMessage.getFromName())) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_receiver_cancel_default_message));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_recall_a_msg, cancelMessage.getFromName()));
                    }
                }
            }
        } else if (aVar instanceof com.sankuai.xm.base.proto.cancel.d) {
            cancelMessage.setCategory(2);
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c);
            cancelMessage.setToAppId(cancelMessage.getFromAppId());
            cancelMessage.setPeerAppId(cancelMessage.getFromAppId());
            cancelMessage.setToUid(aVar.f());
            cancelMessage.setChatId(aVar.f());
            cancelMessage.setGroupName(aVar.h());
            cancelMessage.setAdminUid(aVar.q());
            if (cancelMessage.getFromUid() == IMClient.a().k()) {
                cancelMessage.setDirection(1);
                if (aVar.m() != 1) {
                    if (aVar.q() <= 0) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_group_manager_recall_a_msg));
                    }
                }
            } else {
                cancelMessage.setDirection(2);
                if (aVar.m() != 1) {
                    if (aVar.q() <= 0) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_recall_a_msg, cancelMessage.getFromName()));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_group_manager_recall_a_msg));
                    }
                }
            }
        } else if (aVar instanceof g) {
            cancelMessage.setCategory(3);
            cancelMessage.setPubCategory(4);
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c);
            cancelMessage.setToAppId(aVar.o());
            cancelMessage.setPeerAppId((short) 0);
            cancelMessage.setToUid(aVar.e());
            cancelMessage.setDirection(aVar.n());
            if (aVar.n() == 1) {
                cancelMessage.setChatId(aVar.e());
                if (aVar.m() != 1) {
                    if (cancelMessage.getFromUid() == IMClient.a().k()) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_pub_system_cancel));
                    }
                }
            } else {
                cancelMessage.setChatId(aVar.d());
                if (aVar.m() != 1) {
                    cancelMessage.setText(f.getString(R.string.xm_sdk_pub_system_cancel));
                }
            }
        } else if (aVar instanceof com.sankuai.xm.base.proto.cancel.v2.b) {
            com.sankuai.xm.base.proto.cancel.v2.b bVar = (com.sankuai.xm.base.proto.cancel.v2.b) aVar;
            cancelMessage.setCategory(confirmProto2Category(bVar.w(), 0L, 9));
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c);
            cancelMessage.setToAppId(aVar.o());
            cancelMessage.setToUid(aVar.e());
            cancelMessage.setSID(bVar.w());
            if (cancelMessage.getFromUid() == IMClient.a().k()) {
                cancelMessage.setDirection(1);
                cancelMessage.setChatId(cancelMessage.getToUid());
                cancelMessage.setPeerAppId(aVar.o());
                if (aVar.m() != 1) {
                    cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                }
            } else {
                cancelMessage.setDirection(2);
                cancelMessage.setChatId(cancelMessage.getFromUid());
                cancelMessage.setPeerAppId(cancelMessage.getFromAppId());
                if (aVar.m() != 1) {
                    if (TextUtils.isEmpty(cancelMessage.getFromName())) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_receiver_cancel_default_message));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_recall_a_msg, cancelMessage.getFromName()));
                    }
                }
            }
        } else if (aVar instanceof com.sankuai.xm.base.proto.cancel.v2.d) {
            com.sankuai.xm.base.proto.cancel.v2.d dVar = (com.sankuai.xm.base.proto.cancel.v2.d) aVar;
            cancelMessage.setCategory(confirmProto2Category(dVar.w(), 0L, 10));
            cancelMessage.setPubCategory(4);
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c);
            cancelMessage.setToAppId(aVar.o());
            cancelMessage.setPeerAppId((short) 0);
            cancelMessage.setToUid(aVar.e());
            cancelMessage.setDirection(aVar.n());
            cancelMessage.setSID(dVar.w());
            if (aVar.n() == 1) {
                cancelMessage.setChatId(aVar.e());
                if (aVar.m() != 1) {
                    if (cancelMessage.getFromUid() == IMClient.a().k()) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_pub_system_cancel));
                    }
                }
            } else {
                cancelMessage.setChatId(aVar.d());
                if (aVar.m() != 1) {
                    cancelMessage.setText(f.getString(R.string.xm_sdk_pub_system_cancel));
                }
            }
        } else if (aVar instanceof com.sankuai.xm.base.proto.cancel.f) {
            cancelMessage.setCategory(3);
            cancelMessage.setPubCategory(5);
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c);
            cancelMessage.setToAppId(aVar.o());
            cancelMessage.setPeerAppId((short) 0);
            cancelMessage.setDirection(aVar.n());
            cancelMessage.setPeerUid(aVar.n() == 1 ? aVar.e() : aVar.d());
            cancelMessage.setToUid(aVar.e());
            cancelMessage.setChatId(aVar.t());
            if (aVar.n() == 1) {
                if (aVar.m() != 1) {
                    if (cancelMessage.getFromUid() == IMClient.a().k()) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_pub_cancel_message));
                    }
                }
            } else if (aVar.m() != 1) {
                cancelMessage.setText(f.getString(R.string.xm_sdk_pub_cancel_message));
            }
        } else if (aVar instanceof com.sankuai.xm.base.proto.cancel.v2.c) {
            cancelMessage.setCategory(11);
            cancelMessage.setPubCategory(5);
            cancelMessage.setFromAppId(((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c);
            cancelMessage.setToAppId(aVar.o());
            cancelMessage.setPeerAppId((short) 0);
            cancelMessage.setDirection(aVar.n());
            cancelMessage.setPeerUid(aVar.n() == 1 ? aVar.e() : aVar.d());
            cancelMessage.setToUid(aVar.e());
            cancelMessage.setChatId(aVar.t());
            cancelMessage.setSID(((com.sankuai.xm.base.proto.cancel.v2.c) aVar).w());
            if (aVar.n() == 1) {
                if (aVar.m() != 1) {
                    if (cancelMessage.getFromUid() == IMClient.a().k()) {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
                    } else {
                        cancelMessage.setText(f.getString(R.string.xm_sdk_pub_cancel_message));
                    }
                }
            } else if (aVar.m() != 1) {
                cancelMessage.setText(f.getString(R.string.xm_sdk_pub_cancel_message));
            }
        }
        return cancelMessage;
    }

    public static IMMessage protoToIMMessage(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dba6e78fddc813b04e9a5b1771e5581", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dba6e78fddc813b04e9a5b1771e5581");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(jVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::protoToIMMessage, pub_c, inner packet invalid, msgUuid = ");
            sb.append(jVar.c());
            sb.append("/");
            sb.append(jVar.d());
            sb.append("/");
            sb.append(jVar.e());
            sb.append("/");
            sb.append(jVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setCategory(3);
        transformToIMMessageFromProto.setPubCategory(4);
        transformToIMMessageFromProto.setMsgId(jVar.k());
        transformToIMMessageFromProto.setFromUid(jVar.d());
        transformToIMMessageFromProto.setToUid(jVar.e());
        transformToIMMessageFromProto.setPeerUid(0L);
        transformToIMMessageFromProto.setCts(jVar.j());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) jVar.x()).c);
        transformToIMMessageFromProto.setToAppId(jVar.q());
        transformToIMMessageFromProto.setDirection(jVar.s());
        if (jVar.s() == 1) {
            transformToIMMessageFromProto.setMsgStatus(5);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getToUid());
            transformToIMMessageFromProto.setPeerAppId((short) 0);
        } else {
            transformToIMMessageFromProto.setMsgStatus(7);
            transformToIMMessageFromProto.setChatId(transformToIMMessageFromProto.getFromUid());
            transformToIMMessageFromProto.setPeerAppId((short) 0);
        }
        transformToIMMessageFromProto.setChannel(jVar.p());
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(jVar.h());
        transformToIMMessageFromProto.setMsgUuid(jVar.c());
        transformToIMMessageFromProto.setExtension(jVar.l());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(jVar.u());
        transformToIMMessageFromProto.setMsgSeqid(jVar.w());
        transformToIMMessageFromProto.setDeviceId(jVar.A());
        transformToIMMessageFromProto.setPeerDeviceType(jVar.b());
        return transformToIMMessageFromProto;
    }

    public static IMMessage protoToIMMessage(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68ab1fb73b5e31bf6ae55e24a8796437", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68ab1fb73b5e31bf6ae55e24a8796437");
        }
        IMMessage transformToIMMessageFromProto = transformToIMMessageFromProto(hVar.g());
        if (transformToIMMessageFromProto == null) {
            StringBuilder sb = new StringBuilder("MessageUtils::protoToIMMessage, pub_b, inner packet invalid, msgUuid = ");
            sb.append(hVar.c());
            sb.append("/");
            sb.append(hVar.d());
            sb.append("/");
            sb.append(hVar.e());
            sb.append("/");
            sb.append(hVar.g() == null ? StringUtil.NULL : "OK");
            a.d(sb.toString(), new Object[0]);
            return null;
        }
        transformToIMMessageFromProto.setCategory(3);
        transformToIMMessageFromProto.setPubCategory(5);
        transformToIMMessageFromProto.setMsgId(hVar.k());
        transformToIMMessageFromProto.setFromUid(hVar.d());
        transformToIMMessageFromProto.setToUid(hVar.e());
        transformToIMMessageFromProto.setChatId(hVar.t());
        transformToIMMessageFromProto.setCts(hVar.j());
        transformToIMMessageFromProto.setFromAppId(((com.sankuai.xm.base.proto.protobase.c) hVar.x()).c);
        transformToIMMessageFromProto.setToAppId(hVar.q());
        transformToIMMessageFromProto.setDirection(hVar.s());
        if (hVar.s() == 1) {
            transformToIMMessageFromProto.setMsgStatus(5);
            transformToIMMessageFromProto.setPeerAppId((short) 0);
            transformToIMMessageFromProto.setPeerUid(hVar.e());
        } else {
            if (transformToIMMessageFromProto.getFromUid() == com.sankuai.xm.login.a.a().e()) {
                transformToIMMessageFromProto.setMsgStatus(5);
            } else {
                transformToIMMessageFromProto.setMsgStatus(7);
            }
            transformToIMMessageFromProto.setPeerAppId((short) 0);
            transformToIMMessageFromProto.setPeerUid(hVar.d());
        }
        transformToIMMessageFromProto.setChannel(hVar.p());
        transformToIMMessageFromProto.setFileStatus(0);
        transformToIMMessageFromProto.setFromName(hVar.h());
        transformToIMMessageFromProto.setMsgUuid(hVar.c());
        transformToIMMessageFromProto.setExtension(hVar.l());
        transformToIMMessageFromProto.setSts(msgIdToStamp(transformToIMMessageFromProto.getMsgId()));
        transformToIMMessageFromProto.setCompatible(hVar.u());
        transformToIMMessageFromProto.setMsgSeqid(hVar.w());
        transformToIMMessageFromProto.setDeviceId(hVar.A());
        transformToIMMessageFromProto.setPeerDeviceType(hVar.b());
        return transformToIMMessageFromProto;
    }

    public static com.sankuai.xm.base.proto.send.a imMessageToSendProto(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.sankuai.xm.base.proto.send.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "498e78ad412b85f4f7d60aaa99840f0e", 6917529027641081856L)) {
            return (com.sankuai.xm.base.proto.send.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "498e78ad412b85f4f7d60aaa99840f0e");
        }
        byte[] transformToProtoFromIMMessage = transformToProtoFromIMMessage(iMMessage);
        int category = iMMessage.getCategory();
        switch (category) {
            case 1:
                aVar = new f();
                aVar.b(iMMessage.getToAppId());
                aVar.a(iMMessage.isReceipt());
                aVar.b(iMMessage.getToUid());
                break;
            case 2:
                aVar = new d();
                aVar.c(iMMessage.getGroupName());
                aVar.c(iMMessage.getToUid());
                aVar.a(iMMessage.isReceipt());
                break;
            case 3:
                if (iMMessage.getPubCategory() == 4) {
                    aVar = new j();
                    aVar.b(iMMessage.getToUid());
                    aVar.c((byte) 1);
                    break;
                } else {
                    aVar = new h();
                    aVar.f(iMMessage.getToUid());
                    aVar.b(iMMessage.getPeerUid());
                    aVar.c((byte) 1);
                    break;
                }
            default:
                switch (category) {
                    case 9:
                        aVar = new com.sankuai.xm.base.proto.send.v2.b();
                        aVar.b(iMMessage.getToAppId());
                        aVar.a(iMMessage.isReceipt());
                        aVar.b(iMMessage.getToUid());
                        break;
                    case 10:
                        aVar = new com.sankuai.xm.base.proto.send.v2.d();
                        aVar.b(iMMessage.getToUid());
                        aVar.c((byte) 1);
                        break;
                    case 11:
                        aVar = new com.sankuai.xm.base.proto.send.v2.c();
                        aVar.f(iMMessage.getToUid());
                        aVar.b(iMMessage.getPeerUid());
                        aVar.c((byte) 1);
                        break;
                }
        }
        if (aVar != null) {
            if (aVar instanceof com.sankuai.xm.base.proto.send.b) {
                ((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c = iMMessage.getFromAppId();
            } else {
                ((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c = iMMessage.getFromAppId();
                ((com.sankuai.xm.base.proto.send.v2.a) aVar).f(iMMessage.getSID());
            }
            aVar.a((byte) 1);
            aVar.a(iMMessage.getMsgUuid());
            aVar.a(iMMessage.getFromUid());
            aVar.b(iMMessage.getFromName());
            aVar.a(iMMessage.getMsgType());
            aVar.d(iMMessage.getCts());
            aVar.d(iMMessage.getExtension());
            aVar.e(0L);
            aVar.b(transformToProtoFromIMMessage);
            aVar.b((byte) iMMessage.getRetries());
            aVar.a(iMMessage.getChannel());
            aVar.e(iMMessage.getCompatible());
            aVar.g(iMMessage.getMsgSeqid());
        }
        return aVar;
    }

    public static com.sankuai.xm.base.proto.cancel.a imMessageToCancelProto(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.sankuai.xm.base.proto.cancel.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "467b02e816680f832e26e72eec3d6d2d", 6917529027641081856L)) {
            return (com.sankuai.xm.base.proto.cancel.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "467b02e816680f832e26e72eec3d6d2d");
        }
        if (iMMessage.getCategory() == 1) {
            aVar = new e();
            aVar.b(iMMessage.getToUid());
            aVar.b(iMMessage.getToAppId());
            ((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c = IMClient.a().g();
        } else if (iMMessage.getCategory() == 2) {
            aVar = new com.sankuai.xm.base.proto.cancel.d();
            aVar.c(iMMessage.getGroupName());
            aVar.f(iMMessage.getAdminUid());
            aVar.c(iMMessage.getToUid());
            aVar.b(IMClient.a().g());
            ((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c = IMClient.a().g();
        } else if (iMMessage.getCategory() == 9) {
            aVar = new com.sankuai.xm.base.proto.cancel.v2.b();
            aVar.b(iMMessage.getToUid());
            aVar.b(iMMessage.getToAppId());
            ((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c = IMClient.a().g();
            ((com.sankuai.xm.base.proto.cancel.v2.b) aVar).f(iMMessage.getSID());
        } else if (iMMessage.getCategory() == 3) {
            if (iMMessage.getPubCategory() == 4) {
                aVar = new g();
                aVar.b(iMMessage.getToUid());
            } else if (iMMessage.getPubCategory() == 5) {
                aVar = new com.sankuai.xm.base.proto.cancel.f();
                aVar.g(iMMessage.getChatId());
                aVar.b(iMMessage.getPeerUid());
            }
            if (aVar != null) {
                ((com.sankuai.xm.base.proto.protobase.c) aVar.x()).c = IMClient.a().g();
                aVar.b(iMMessage.getToAppId());
                aVar.e(iMMessage.getDeviceId());
                aVar.b((byte) 1);
            }
        } else if (iMMessage.getCategory() == 10) {
            aVar = new com.sankuai.xm.base.proto.cancel.v2.d();
            ((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c = IMClient.a().g();
            ((com.sankuai.xm.base.proto.cancel.v2.d) aVar).f(iMMessage.getSID());
            aVar.b(iMMessage.getToUid());
            aVar.b(iMMessage.getToAppId());
            aVar.e(iMMessage.getDeviceId());
            aVar.b((byte) 1);
        } else if (iMMessage.getCategory() == 11) {
            aVar = new com.sankuai.xm.base.proto.cancel.v2.c();
            ((com.sankuai.xm.base.proto.protobase.d) aVar.x()).c = IMClient.a().g();
            ((com.sankuai.xm.base.proto.cancel.v2.c) aVar).f(iMMessage.getSID());
            aVar.g(iMMessage.getChatId());
            aVar.b(iMMessage.getPeerUid());
            aVar.b(iMMessage.getToAppId());
            aVar.e(iMMessage.getDeviceId());
            aVar.b((byte) 1);
        }
        if (aVar != null) {
            aVar.a((byte) 1);
            aVar.b(iMMessage.getFromName());
            aVar.a(iMMessage.getFromUid());
            aVar.d(iMMessage.getCts());
            aVar.e(iMMessage.getMsgId());
            aVar.a(iMMessage.getMsgUuid());
            aVar.d(iMMessage.getExtension());
            aVar.a(iMMessage.getChannel());
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0330, code lost:
        if (android.text.TextUtils.isEmpty(r1.getOriginUrl()) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.im.message.bean.IMMessage dbMessageToIMMessage(com.sankuai.xm.im.cache.bean.DBMessage r12) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.utils.MessageUtils.dbMessageToIMMessage(com.sankuai.xm.im.cache.bean.DBMessage):com.sankuai.xm.im.message.bean.IMMessage");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.im.cache.bean.DBMessage imMessageToDBMessage(com.sankuai.xm.im.message.bean.IMMessage r12) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.utils.MessageUtils.imMessageToDBMessage(com.sankuai.xm.im.message.bean.IMMessage):com.sankuai.xm.im.cache.bean.DBMessage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x026c, code lost:
        if (android.text.TextUtils.isEmpty(r12.getOriginUrl()) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.im.message.bean.IMMessage transformToIMMessageFromProto(byte[] r12) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.utils.MessageUtils.transformToIMMessageFromProto(byte[]):com.sankuai.xm.im.message.bean.IMMessage");
    }

    private static byte[] transformToProtoFromIMMessage(IMMessage iMMessage) {
        int i = 0;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "377784e69c6e3b10175289ba34f245f8", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "377784e69c6e3b10175289ba34f245f8");
        }
        switch (iMMessage.getMsgType()) {
            case 1:
                TextMessage textMessage = (TextMessage) iMMessage;
                r rVar = new r();
                if (isPubService(iMMessage.getCategory())) {
                    rVar.a(26869781);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    rVar.a(26279945);
                }
                rVar.c(iMMessage.getFromAppId());
                rVar.b = contentEncode(textMessage.getText(), textMessage.getCipherType());
                rVar.c = textMessage.getFontName();
                rVar.d = textMessage.getFontSize();
                rVar.e = textMessage.isBold();
                rVar.f = textMessage.getCipherType();
                return rVar.bS_();
            case 2:
                AudioMessage audioMessage = (AudioMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.a aVar = new com.sankuai.xm.base.proto.inner.a();
                if (isPubService(iMMessage.getCategory())) {
                    aVar.a(26869782);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    aVar.a(26279946);
                }
                aVar.c(iMMessage.getFromAppId());
                aVar.b = audioMessage.getUrl();
                aVar.c = audioMessage.getCodec();
                aVar.d = audioMessage.getDuration();
                aVar.e = audioMessage.getCts();
                aVar.f = audioMessage.getToken();
                aVar.g = (String) audioMessage.getCustom(new String[0]);
                return aVar.bS_();
            case 3:
                VideoMessage videoMessage = (VideoMessage) iMMessage;
                t tVar = new t();
                if (isPubService(iMMessage.getCategory())) {
                    tVar.a(26869783);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    tVar.a(26279947);
                }
                tVar.c(iMMessage.getFromAppId());
                tVar.b = videoMessage.getUrl();
                tVar.c = videoMessage.getScreenshotUrl();
                tVar.d = videoMessage.getDuration();
                tVar.e = (int) videoMessage.getSize();
                tVar.f = videoMessage.getWidth();
                tVar.g = videoMessage.getHeight();
                tVar.h = videoMessage.getTimestamp();
                tVar.i = videoMessage.getToken();
                tVar.j = (String) videoMessage.getCustom(new String[0]);
                return tVar.bS_();
            case 4:
                ImageMessage imageMessage = (ImageMessage) iMMessage;
                l lVar = new l();
                if (isPubService(iMMessage.getCategory())) {
                    lVar.a(26869784);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    lVar.a(26279948);
                }
                lVar.c(iMMessage.getFromAppId());
                lVar.b = imageMessage.getThumbnailUrl();
                lVar.c = imageMessage.getNormalUrl();
                lVar.d = imageMessage.getOriginUrl();
                lVar.e = n.f(imageMessage.getType());
                lVar.f = imageMessage.getToken();
                lVar.g = imageMessage.getOriginSize();
                lVar.h = imageMessage.isUploadOrigin() ? (byte) 2 : (byte) 1;
                lVar.i = (String) imageMessage.getCustom(new String[0]);
                return lVar.bS_();
            case 5:
                CalendarMessage calendarMessage = (CalendarMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.b bVar = new com.sankuai.xm.base.proto.inner.b();
                if (isPubService(iMMessage.getCategory())) {
                    bVar.a(26869785);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    bVar.a(26279949);
                }
                bVar.c(iMMessage.getFromAppId());
                bVar.b = calendarMessage.getDateStart();
                bVar.c = calendarMessage.getDateEnd();
                bVar.d = calendarMessage.getSummary();
                bVar.e = calendarMessage.getLocation();
                bVar.f = calendarMessage.getTrigger();
                bVar.g = calendarMessage.getParticipant();
                bVar.h = calendarMessage.getRemark();
                bVar.i = calendarMessage.getCalendarId();
                return bVar.bS_();
            case 6:
                LinkMessage linkMessage = (LinkMessage) iMMessage;
                m mVar = new m();
                if (isPubService(iMMessage.getCategory())) {
                    mVar.a(26869786);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    mVar.a(26279950);
                }
                mVar.c(iMMessage.getFromAppId());
                mVar.b = linkMessage.getTitle();
                mVar.c = linkMessage.getImage();
                mVar.d = linkMessage.getContent();
                mVar.e = linkMessage.getLink();
                return mVar.bS_();
            case 7:
                MultiLinkMessage multiLinkMessage = (MultiLinkMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.n nVar = new com.sankuai.xm.base.proto.inner.n();
                if (isPubService(iMMessage.getCategory())) {
                    nVar.a(26869787);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    nVar.a(26279951);
                }
                nVar.c(iMMessage.getFromAppId());
                nVar.b = multiLinkMessage.getNum();
                nVar.c = multiLinkMessage.getContent();
                return nVar.bS_();
            case 8:
                FileMessage fileMessage = (FileMessage) iMMessage;
                i iVar = new i();
                if (isPubService(iMMessage.getCategory())) {
                    iVar.a(26869788);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    iVar.a(26279952);
                }
                iVar.c(iMMessage.getFromAppId());
                iVar.b = fileMessage.getFileId();
                iVar.c = fileMessage.getUrl();
                iVar.d = fileMessage.getName();
                iVar.e = fileMessage.getFormat();
                iVar.f = (int) fileMessage.getSize();
                iVar.g = fileMessage.getToken();
                iVar.i = (String) fileMessage.getCustom(new String[0]);
                return iVar.bS_();
            case 9:
                GPSMessage gPSMessage = (GPSMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.j jVar = new com.sankuai.xm.base.proto.inner.j();
                if (isPubService(iMMessage.getCategory())) {
                    jVar.a(26869789);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    jVar.a(26279953);
                }
                jVar.c(iMMessage.getFromAppId());
                jVar.b = (int) (gPSMessage.getLatitude() * 1000000.0d);
                jVar.c = (int) (gPSMessage.getLongitude() * 1000000.0d);
                jVar.d = gPSMessage.getName();
                return jVar.bS_();
            case 10:
                VCardMessage vCardMessage = (VCardMessage) iMMessage;
                s sVar = new s();
                if (isPubService(iMMessage.getCategory())) {
                    sVar.a(26869790);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    sVar.a(26279954);
                }
                sVar.c(iMMessage.getFromAppId());
                sVar.b = vCardMessage.getUid();
                sVar.c = vCardMessage.getName();
                sVar.d = vCardMessage.getAccount();
                sVar.e = vCardMessage.getType();
                sVar.f = vCardMessage.getSubType();
                return sVar.bS_();
            case 11:
                EmotionMessage emotionMessage = (EmotionMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.g gVar = new com.sankuai.xm.base.proto.inner.g();
                if (isPubService(iMMessage.getCategory())) {
                    gVar.a(26869791);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    gVar.a(26279955);
                }
                gVar.c(iMMessage.getFromAppId());
                gVar.b = emotionMessage.getGroup();
                gVar.c = emotionMessage.getType();
                gVar.d = emotionMessage.getName();
                return gVar.bS_();
            case 12:
                EventMessage eventMessage = (EventMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.h hVar = new com.sankuai.xm.base.proto.inner.h();
                if (isPubService(iMMessage.getCategory())) {
                    hVar.a(26869792);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    hVar.a(26279956);
                }
                hVar.c(iMMessage.getFromAppId());
                hVar.b = eventMessage.getType();
                hVar.c = eventMessage.getText();
                return hVar.bS_();
            case 13:
                TemplateMessage templateMessage = (TemplateMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.e eVar = new com.sankuai.xm.base.proto.inner.e();
                if (isPubService(iMMessage.getCategory())) {
                    eVar.a(26869793);
                } else {
                    eVar.a(26279965);
                }
                eVar.c(iMMessage.getFromAppId());
                eVar.b = templateMessage.getTemplateName();
                eVar.c = templateMessage.getContentTitle();
                eVar.d = templateMessage.getContent();
                eVar.e = templateMessage.getLinkName();
                eVar.f = templateMessage.getLink();
                return eVar.bS_();
            case 14:
            default:
                return null;
            case 15:
                CallMessage callMessage = (CallMessage) iMMessage;
                if (isIMPeerService(iMMessage.getCategory()) || iMMessage.getCategory() == 2) {
                    com.sankuai.xm.base.proto.inner.c cVar = new com.sankuai.xm.base.proto.inner.c();
                    cVar.a(26279976);
                    cVar.b = callMessage.getCallUid();
                    cVar.c = callMessage.getCallPeerUid();
                    cVar.d = callMessage.getRoles();
                    cVar.e = callMessage.getCallStatus();
                    cVar.f = callMessage.getCallType();
                    cVar.g = callMessage.getStartCallTs();
                    cVar.h = callMessage.getStartTalkTs();
                    cVar.i = callMessage.getEndTs();
                    cVar.j = callMessage.getCallDur();
                    return cVar.bS_();
                }
                return null;
            case 16:
                RedPacketMessage redPacketMessage = (RedPacketMessage) iMMessage;
                if (isIMPeerService(iMMessage.getCategory()) || iMMessage.getCategory() == 2) {
                    q qVar = new q();
                    qVar.a(26279973);
                    qVar.b = redPacketMessage.getID();
                    qVar.c = redPacketMessage.getType();
                    qVar.d = redPacketMessage.getGreetings();
                    return qVar.bS_();
                }
                return null;
            case 17:
                GeneralMessage generalMessage = (GeneralMessage) iMMessage;
                k kVar = new k();
                if (isPubService(iMMessage.getCategory())) {
                    kVar.a(26869795);
                } else {
                    kVar.a(26279974);
                }
                kVar.b = generalMessage.getData();
                kVar.c = generalMessage.getType();
                kVar.d = generalMessage.getSummary();
                return kVar.bS_();
            case 18:
                VCardMessage vCardMessage2 = (VCardMessage) iMMessage;
                s sVar2 = new s();
                if (isPubService(iMMessage.getCategory())) {
                    sVar2.a(26869796);
                } else {
                    sVar2.a(26279975);
                }
                sVar2.c(iMMessage.getFromAppId());
                sVar2.b = vCardMessage2.getUid();
                sVar2.c = vCardMessage2.getName();
                sVar2.d = vCardMessage2.getAccount();
                sVar2.e = vCardMessage2.getType();
                sVar2.f = vCardMessage2.getSubType();
                return sVar2.bS_();
            case 19:
                CustomEmotionMessage customEmotionMessage = (CustomEmotionMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.d dVar = new com.sankuai.xm.base.proto.inner.d();
                if (isPubService(iMMessage.getCategory())) {
                    dVar.a(26869811);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    dVar.a(26279977);
                }
                dVar.b = customEmotionMessage.getGroup();
                dVar.e = customEmotionMessage.getId();
                dVar.f = customEmotionMessage.getPackageName();
                dVar.c = customEmotionMessage.getPackageId();
                dVar.h = customEmotionMessage.getParams();
                dVar.g = customEmotionMessage.getType();
                dVar.f = customEmotionMessage.getName();
                return dVar.bS_();
            case 20:
                QuoteMessage quoteMessage = (QuoteMessage) iMMessage;
                p pVar = new p();
                pVar.c(iMMessage.getFromAppId());
                if (isPubService(iMMessage.getCategory())) {
                    pVar.a(26869814);
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    pVar.a(26279983);
                }
                pVar.b = quoteMessage.getSelectedMessage();
                pVar.c = quoteMessage.getQuotedMessage();
                pVar.d = quoteMessage.getSearchText();
                return pVar.bS_();
            case 21:
                DynamicMessage dynamicMessage = (DynamicMessage) iMMessage;
                com.sankuai.xm.base.proto.inner.f fVar = new com.sankuai.xm.base.proto.inner.f();
                fVar.c(iMMessage.getFromAppId());
                if (isPubService(iMMessage.getCategory())) {
                    i = 26869821;
                } else if (iMMessage.getCategory() == 2 || isIMPeerService(iMMessage.getCategory())) {
                    i = 26279989;
                }
                fVar.b = dynamicMessage.getId();
                fVar.c = dynamicMessage.getTitle();
                fVar.d = dynamicMessage.getDxData();
                fVar.e = dynamicMessage.getAppData();
                if (i != 0) {
                    fVar.a(i);
                    return fVar.bS_();
                }
                return null;
        }
    }

    private static String contentEncode(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aef00579dcf8de788f86da2415326cc6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aef00579dcf8de788f86da2415326cc6");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        switch (i) {
            case 0:
                return str;
            case 1:
            case 2:
            case 3:
            case 4:
                try {
                    return Base64.encodeToString(str.getBytes(), 2);
                } catch (Throwable th) {
                    a.a(th);
                    return "";
                }
            default:
                return str;
        }
    }

    private static String contentDecode(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e516f6b72335a412c5f1ec33ce6bd1c8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e516f6b72335a412c5f1ec33ce6bd1c8");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        switch (i) {
            case 0:
                return str;
            case 1:
            case 2:
            case 3:
            case 4:
                try {
                    return new String(Base64.decode(str, 2));
                } catch (Throwable th) {
                    a.a(th);
                    return str;
                }
            default:
                return str;
        }
    }

    public static IMNotice protoToNotice(com.sankuai.xm.base.proto.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "173f2270499f0c0abfc961d25d65075b", 6917529027641081856L)) {
            return (IMNotice) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "173f2270499f0c0abfc961d25d65075b");
        }
        IMNotice iMNotice = new IMNotice();
        iMNotice.setType(bVar.b());
        iMNotice.setCts(bVar.d());
        iMNotice.setChatId(bVar.a());
        iMNotice.setData(bVar.c());
        iMNotice.setChannel(bVar.e());
        if (bVar.g() == 26279966) {
            iMNotice.setCategory(1);
        } else if (bVar.g() == 26279964) {
            iMNotice.setCategory(2);
        }
        return iMNotice;
    }

    public static List<IMMessage> dbMessageToIMMessage(List<DBMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ebc67ed0589d61cfd25974ea2e9d319", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ebc67ed0589d61cfd25974ea2e9d319");
        }
        ArrayList arrayList = new ArrayList();
        for (DBMessage dBMessage : list) {
            arrayList.add(dbMessageToIMMessage(dBMessage));
        }
        return arrayList;
    }

    public static com.sankuai.xm.im.session.entry.a dbSessionToSession(@NonNull DBSession dBSession) {
        Object[] objArr = {dBSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2185744dabeb0545e804be64bda0b49", 6917529027641081856L)) {
            return (com.sankuai.xm.im.session.entry.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2185744dabeb0545e804be64bda0b49");
        }
        com.sankuai.xm.im.session.entry.a aVar = new com.sankuai.xm.im.session.entry.a();
        aVar.b = dbMessageToIMMessage(dBSession);
        aVar.d = dBSession.getUnRead();
        aVar.c = dBSession.getKey();
        aVar.e = dBSession.getFlag();
        return aVar;
    }

    public static List<com.sankuai.xm.im.session.entry.a> dbSessionToSession(List<DBSession> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77b455a00f5c5eca6f9064fc32034d3f", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77b455a00f5c5eca6f9064fc32034d3f");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (DBSession dBSession : list) {
            arrayList.add(dbSessionToSession(dBSession));
        }
        return arrayList;
    }

    public static DBSession sessionToDBSession(@NonNull com.sankuai.xm.im.session.entry.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4129911118dfe3a5b433ed030b2a5387", 6917529027641081856L)) {
            return (DBSession) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4129911118dfe3a5b433ed030b2a5387");
        }
        DBSession dBSession = new DBSession(imMessageToDBMessage(aVar.b));
        dBSession.setKey(aVar.c);
        dBSession.setUnRead(aVar.d);
        dBSession.setFlag(aVar.e);
        return dBSession;
    }

    public static com.sankuai.xm.base.proto.protobase.e dbSyncRead2PSyncRead(DBSyncRead dBSyncRead) {
        Object[] objArr = {dBSyncRead};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.sankuai.xm.base.proto.syncread.e eVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6826a8e0e49e93f1c84e9bcde909451f", 6917529027641081856L)) {
            return (com.sankuai.xm.base.proto.protobase.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6826a8e0e49e93f1c84e9bcde909451f");
        }
        switch (dBSyncRead.getChatType()) {
            case 1:
                eVar = new com.sankuai.xm.base.proto.syncread.b();
                eVar.a(dBSyncRead.getPeerAppid());
                eVar.a((byte) 1);
                break;
            case 2:
                eVar = new com.sankuai.xm.base.proto.syncread.b();
                eVar.a(IMClient.a().h().d());
                eVar.a((byte) 2);
                break;
            case 3:
                eVar = new com.sankuai.xm.base.proto.syncread.c();
                if (dBSyncRead.getSubChatID() == 0) {
                    eVar.a((byte) 1);
                } else {
                    eVar.a((byte) 2);
                }
                eVar.c(dBSyncRead.getSubChatID());
                eVar.a((short) 0);
                break;
        }
        if (eVar != null) {
            eVar.c(IMClient.a().h().d());
            eVar.a(dBSyncRead.getChatMainId());
            eVar.b(dBSyncRead.getLsts());
            eVar.b(dBSyncRead.getChannel());
        }
        return eVar;
    }

    public static com.sankuai.xm.base.proto.protobase.g dbSyncRead2PSyncRead2(DBSyncRead dBSyncRead) {
        Object[] objArr = {dBSyncRead};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.sankuai.xm.base.proto.syncread.v2.d dVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09cb6b54aebe55ce3a4cf61636401b76", 6917529027641081856L)) {
            return (com.sankuai.xm.base.proto.protobase.g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09cb6b54aebe55ce3a4cf61636401b76");
        }
        switch (dBSyncRead.getChatType()) {
            case 9:
                dVar = new com.sankuai.xm.base.proto.syncread.v2.a();
                dVar.a((byte) 1);
                break;
            case 10:
            case 11:
                dVar = new com.sankuai.xm.base.proto.syncread.v2.b();
                if (dBSyncRead.getSubChatID() == 0) {
                    dVar.a((byte) 1);
                } else {
                    dVar.a((byte) 2);
                }
                dVar.b(dBSyncRead.getSubChatID());
                dVar.a((short) 0);
                break;
        }
        if (dVar != null) {
            dVar.c(IMClient.a().h().d());
            dVar.a(dBSyncRead.getChatMainId());
            dVar.c(dBSyncRead.getLsts());
            dVar.b(dBSyncRead.getChannel());
            dVar.a(dBSyncRead.getSessionId().g());
        }
        return dVar;
    }

    public static List<com.sankuai.xm.base.proto.syncread.d> obtainPSyncRead(List<? extends com.sankuai.xm.base.proto.syncread.e> list, int i) {
        int i2;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b19b9b4ed13715dbbeef648b8f9718f3", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b19b9b4ed13715dbbeef648b8f9718f3");
        }
        if (list.isEmpty()) {
            return null;
        }
        if (list.get(0) instanceof com.sankuai.xm.base.proto.syncread.b) {
            i2 = 26279960;
        } else {
            i2 = list.get(0) instanceof com.sankuai.xm.base.proto.syncread.c ? 26869803 : 0;
        }
        if (i2 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = (list.size() / i) + (list.size() % i == 0 ? 0 : 1);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int i5 = i4 + i;
            List<? extends com.sankuai.xm.base.proto.syncread.e> subList = list.subList(i4, i5 > list.size() ? list.size() : i5);
            com.sankuai.xm.base.proto.syncread.d dVar = new com.sankuai.xm.base.proto.syncread.d();
            ((com.sankuai.xm.base.proto.protobase.c) dVar.x()).b = i2;
            ((com.sankuai.xm.base.proto.protobase.c) dVar.x()).c = com.sankuai.xm.login.a.a().m();
            dVar.a(UUID.randomUUID().toString());
            dVar.a(IMClient.a().k());
            dVar.a((byte) 1);
            int size2 = subList.size();
            byte[][] bArr = new byte[size2];
            for (int i6 = 0; i6 < size2; i6++) {
                bArr[i6] = subList.get(i6).bS_();
            }
            dVar.a(bArr);
            arrayList.add(dVar);
            i3++;
            i4 = i5;
        }
        return arrayList;
    }

    public static List<com.sankuai.xm.base.proto.syncread.v2.c> obtainPSyncRead2(List<? extends com.sankuai.xm.base.proto.syncread.v2.d> list, int i) {
        int i2;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c88b542d849e498df3c650a1cacb1df2", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c88b542d849e498df3c650a1cacb1df2");
        }
        if (list.isEmpty()) {
            return null;
        }
        if (list.get(0) instanceof com.sankuai.xm.base.proto.syncread.v2.a) {
            i2 = 26279993;
        } else {
            i2 = list.get(0) instanceof com.sankuai.xm.base.proto.syncread.v2.b ? 26869827 : 0;
        }
        if (i2 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = (list.size() / i) + (list.size() % i == 0 ? 0 : 1);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int i5 = i4 + i;
            List<? extends com.sankuai.xm.base.proto.syncread.v2.d> subList = list.subList(i4, i5 > list.size() ? list.size() : i5);
            com.sankuai.xm.base.proto.syncread.v2.c cVar = new com.sankuai.xm.base.proto.syncread.v2.c();
            ((com.sankuai.xm.base.proto.protobase.d) cVar.x()).b = i2;
            ((com.sankuai.xm.base.proto.protobase.d) cVar.x()).c = com.sankuai.xm.login.a.a().m();
            cVar.a(UUID.randomUUID().toString());
            cVar.a(IMClient.a().k());
            cVar.a((byte) 1);
            int size2 = subList.size();
            byte[][] bArr = new byte[size2];
            for (int i6 = 0; i6 < size2; i6++) {
                bArr[i6] = subList.get(i6).bS_();
            }
            cVar.a(bArr);
            arrayList.add(cVar);
            i3++;
            i4 = i5;
        }
        return arrayList;
    }

    public static SyncRead obtainSyncRead(byte[] bArr, byte b) {
        Object[] objArr = {bArr, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78f3dac5c212f32ac02561a400207769", 6917529027641081856L)) {
            return (SyncRead) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78f3dac5c212f32ac02561a400207769");
        }
        SyncRead syncRead = new SyncRead();
        switch (b) {
            case 1:
                com.sankuai.xm.base.proto.syncread.b bVar = new com.sankuai.xm.base.proto.syncread.b();
                bVar.a(bArr);
                syncRead.setSessionId(SessionId.a(bVar.b(), 0L, bVar.c(), bVar.d(), bVar.f()));
                syncRead.setRsts(bVar.e());
                break;
            case 2:
                com.sankuai.xm.base.proto.syncread.c cVar = new com.sankuai.xm.base.proto.syncread.c();
                cVar.a(bArr);
                syncRead.setSessionId(SessionId.a(cVar.b(), cVar.i(), 3, cVar.d(), cVar.f()));
                syncRead.setRsts(cVar.e());
                break;
            case 5:
                com.sankuai.xm.base.proto.syncread.v2.a aVar = new com.sankuai.xm.base.proto.syncread.v2.a();
                aVar.a(bArr);
                syncRead.setSessionId(SessionId.a(aVar.b(), aVar.c(), confirmProto2Category(aVar.g(), aVar.c(), 9), aVar.d(), aVar.f(), aVar.g()));
                syncRead.setRsts(aVar.e());
                break;
            case 6:
                com.sankuai.xm.base.proto.syncread.v2.b bVar2 = new com.sankuai.xm.base.proto.syncread.v2.b();
                bVar2.a(bArr);
                syncRead.setSessionId(SessionId.a(bVar2.b(), bVar2.c(), confirmProto2Category(bVar2.g(), bVar2.c(), bVar2.c() == 0 ? 10 : 11), bVar2.d(), bVar2.f(), bVar2.g()));
                syncRead.setRsts(bVar2.e());
                break;
        }
        if (syncRead.getChannel() == 0) {
            if (b == 2) {
                short d = com.sankuai.xm.base.f.m().d();
                if (d != -1 && d != 0) {
                    syncRead.setChannel(d);
                }
            } else {
                int a = com.sankuai.xm.login.a.a().a(syncRead.getPeerAppid());
                if (a != -1) {
                    syncRead.setChannel((short) a);
                }
            }
        }
        return syncRead;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int pushChatTypeToCategory(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18e4c8125cfd0aa57aec0e45fa78af4e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18e4c8125cfd0aa57aec0e45fa78af4e")).intValue();
        }
        switch (str.hashCode()) {
            case -833086701:
                if (str.equals("im-peer-custom")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -349790306:
                if (str.equals("pub-proxy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 573778521:
                if (str.equals("pub-service-custom")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1151995877:
                if (str.equals("pub-service")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1375807616:
                if (str.equals("pub-proxy-custom")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1864178795:
                if (str.equals("im-peer")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1947053206:
                if (str.equals("im-group")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
            case 3:
                return 3;
            case 4:
                return 9;
            case 5:
                return 11;
            case 6:
                return 10;
            default:
                return 0;
        }
    }

    public static void checkAndSupplyChannel(List<? extends Message> list, short s) {
        Object[] objArr = {list, Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f241d8d7480d7846eca999c85fa7d4d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f241d8d7480d7846eca999c85fa7d4d5");
        } else if (list != null && !list.isEmpty() && s != 0) {
            for (Message message : list) {
                if (message.getCategory() != 2 && message.getChannel() == 0) {
                    if (s != -1) {
                        message.setChannel(s);
                    } else if (message.getCategory() == 3) {
                        short d = com.sankuai.xm.base.f.m().d();
                        if (d != -1 && d != 0) {
                            message.setChannel(d);
                        }
                    } else {
                        int a = com.sankuai.xm.login.a.a().a(message.getPeerAppId());
                        if (a != -1) {
                            message.setChannel((short) a);
                        }
                    }
                }
            }
        }
    }

    public static JSONObject getLongTextInfo(FileMessage fileMessage) {
        JSONObject jSONObject;
        Object[] objArr = {fileMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4b423e6ec2fad6ffcef2869c1847217", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4b423e6ec2fad6ffcef2869c1847217");
        }
        try {
            JSONObject jSONObject2 = new JSONObject(fileMessage.getExtension());
            if (TextUtils.equals(jSONObject2.optString("style"), "text")) {
                jSONObject = jSONObject2;
            } else {
                jSONObject = jSONObject2.has("longText") ? jSONObject2.getJSONObject("longText") : null;
            }
            if (jSONObject != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("description", jSONObject.get("description"));
                jSONObject3.put("length", jSONObject.get("length"));
                return jSONObject3;
            }
        } catch (Exception e) {
            a.a(e, "MessageUtils::getLongTextInfo error.", new Object[0]);
        }
        return null;
    }

    public static List<com.sankuai.xm.im.session.entry.b> sessionListToUnreadEventList(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de89ffc8b7e26677d613702f09778024", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de89ffc8b7e26677d613702f09778024");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.xm.im.session.entry.a aVar : list) {
            if (aVar.d()) {
                arrayList.add(new com.sankuai.xm.im.session.entry.b(aVar.c(), aVar.d));
            }
        }
        return arrayList;
    }

    public static boolean isContinuityMsg(long j, long j2, long j3, long j4) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a555f3ae293f2fd5cda3bd2638d87908", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a555f3ae293f2fd5cda3bd2638d87908")).booleanValue();
        }
        if (j == 0 || j3 == 0 || (j2 == 1 && j4 == 1)) {
            return true;
        }
        long abs = Math.abs(j3 - j);
        return abs == 1 || abs == 0;
    }

    private static void checkMediaPath(MediaMessage mediaMessage) {
        boolean z = true;
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96fa7eebff29d570139f1575790764c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96fa7eebff29d570139f1575790764c2");
            return;
        }
        boolean z2 = mediaMessage instanceof ImageMessage;
        if (z2 || (mediaMessage instanceof VideoMessage) || (mediaMessage instanceof AudioMessage) || (mediaMessage instanceof FileMessage)) {
            String n = IMClient.a().n();
            String str = CryptoProxy.c().b;
            String b = IMClient.a().b(mediaMessage.getMsgType());
            String path = mediaMessage.getPath();
            String url = mediaMessage.getUrl();
            if (!TextUtils.isEmpty(path)) {
                if (z2) {
                    url = ((ImageMessage) mediaMessage).getNormalUrl();
                }
                String c = com.sankuai.xm.base.util.k.c(url);
                if (TextUtils.isEmpty(c)) {
                    c = com.sankuai.xm.base.util.k.u(path);
                }
                String f = com.sankuai.xm.base.util.k.f(b, c);
                z = (TextUtils.isEmpty(str) || !path.startsWith(str)) ? false : false;
                if (!path.startsWith(b) && (path.startsWith(n) || z)) {
                    if ((mediaMessage instanceof FileMessage) && mediaMessage.getFromUid() == IMClient.a().k()) {
                        return;
                    }
                    mediaMessage.setPath(f);
                }
            }
            if (mediaMessage instanceof VideoMessage) {
                VideoMessage videoMessage = (VideoMessage) mediaMessage;
                if (TextUtils.isEmpty(videoMessage.getScreenshotPath())) {
                    return;
                }
                String a = w.a(videoMessage);
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                videoMessage.setScreenshotPath(a);
            } else if (z2) {
                ImageMessage imageMessage = (ImageMessage) mediaMessage;
                if (TextUtils.isEmpty(imageMessage.getThumbnailPath())) {
                    return;
                }
                String a2 = com.sankuai.xm.im.message.handler.n.a(imageMessage);
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                imageMessage.setThumbnailPath(a2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r1 != 17) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isFinalMsgStatus(com.sankuai.xm.im.message.bean.IMMessage r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.im.utils.MessageUtils.changeQuickRedirect
            java.lang.String r11 = "8dec39c139613a7a3b3faa677e2563ee"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            int r1 = r12.getMsgStatus()
            r2 = 5
            if (r1 == r2) goto L54
            r2 = 7
            if (r1 == r2) goto L43
            r2 = 9
            if (r1 == r2) goto L43
            r2 = 11
            if (r1 == r2) goto L43
            r2 = 13
            if (r1 == r2) goto L42
            r2 = 15
            if (r1 == r2) goto L54
            r2 = 17
            if (r1 == r2) goto L54
            goto L6f
        L42:
            return r0
        L43:
            long r1 = r12.getFromUid()
            com.sankuai.xm.im.IMClient r12 = com.sankuai.xm.im.IMClient.a()
            long r3 = r12.k()
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L6f
            return r0
        L54:
            long r1 = r12.getFromUid()
            com.sankuai.xm.im.IMClient r3 = com.sankuai.xm.im.IMClient.a()
            long r3 = r3.k()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L70
            long r1 = r12.getFromUid()
            r3 = 0
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 != 0) goto L6f
            goto L70
        L6f:
            return r9
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.utils.MessageUtils.isFinalMsgStatus(com.sankuai.xm.im.message.bean.IMMessage):boolean");
    }

    public static boolean shouldMessageStatusChange(@NonNull Message message, @NonNull Message message2) {
        Object[] objArr = {message, message2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d493658d6a11fc0b39a727f2ef6432bd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d493658d6a11fc0b39a727f2ef6432bd")).booleanValue();
        }
        if (TextUtils.equals(message.getMsgUuid(), message2.getMsgUuid())) {
            int msgStatus = message.getMsgStatus();
            int msgStatus2 = message2.getMsgStatus();
            if (message.getMsgUuid().equals(message2.getMsgUuid()) && message.getMsgSeqid() == message2.getMsgSeqid() && msgStatus != msgStatus2) {
                if (msgStatus == 15 || msgStatus == 13) {
                    return false;
                }
                return (msgStatus == 7 || msgStatus == 9 || msgStatus == 11 || msgStatus == 5) ? msgStatus2 >= msgStatus : (msgStatus != 4 && msgStatus < 900) || msgStatus2 == 3 || msgStatus2 == 5;
            }
            return true;
        }
        return true;
    }

    public static Set<String> getMessageFilePaths(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75533ee481c8a6bc62ed03b3d605e6cd", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75533ee481c8a6bc62ed03b3d605e6cd");
        }
        HashSet hashSet = new HashSet();
        String b = IMClient.a().b(iMMessage.getMsgType());
        if (iMMessage instanceof MediaMessage) {
            MediaMessage mediaMessage = (MediaMessage) iMMessage;
            hashSet.add(mediaMessage.getPath());
            String url = mediaMessage.getUrl();
            if (!TextUtils.isEmpty(url)) {
                hashSet.add(com.sankuai.xm.base.util.k.f(b, com.sankuai.xm.base.util.k.c(url)));
            }
        }
        if (iMMessage instanceof ImageMessage) {
            ImageMessage imageMessage = (ImageMessage) iMMessage;
            hashSet.add(imageMessage.getThumbnailPath());
            String originUrl = imageMessage.getOriginUrl();
            if (!TextUtils.isEmpty(originUrl)) {
                hashSet.add(com.sankuai.xm.base.util.k.f(b, com.sankuai.xm.base.util.k.c(originUrl)));
            }
            String normalUrl = imageMessage.getNormalUrl();
            if (!TextUtils.isEmpty(normalUrl)) {
                hashSet.add(com.sankuai.xm.base.util.k.f(b, com.sankuai.xm.base.util.k.c(normalUrl)));
            }
            String thumbnailUrl = imageMessage.getThumbnailUrl();
            if (!TextUtils.isEmpty(thumbnailUrl)) {
                hashSet.add(com.sankuai.xm.base.util.k.f(b, com.sankuai.xm.base.util.k.c(thumbnailUrl)));
            }
        } else if (iMMessage instanceof VideoMessage) {
            VideoMessage videoMessage = (VideoMessage) iMMessage;
            hashSet.add(videoMessage.getScreenshotPath());
            String screenshotUrl = videoMessage.getScreenshotUrl();
            if (!TextUtils.isEmpty(screenshotUrl)) {
                hashSet.add(com.sankuai.xm.base.util.k.f(IMClient.a().s(), com.sankuai.xm.base.util.k.c(screenshotUrl)));
            }
        }
        return hashSet;
    }

    public static List<Long> messagesToMsgIds(List<Message> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62e9c5148e350aea5057950b14b53acf", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62e9c5148e350aea5057950b14b53acf");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() <= 0) {
            return arrayList;
        }
        for (Message message : list) {
            arrayList.add(Long.valueOf(message.getMsgId()));
        }
        return arrayList;
    }

    public static boolean haveDeleteMessage(List<DBMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55a04e8d5c1e87f8d5a7d9c367c59e2d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55a04e8d5c1e87f8d5a7d9c367c59e2d")).booleanValue();
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return false;
        }
        for (DBMessage dBMessage : list) {
            if (dBMessage.getMsgStatus() == 13) {
                return true;
            }
        }
        return false;
    }

    public static List<IMMessage> getUnDeleteMessages(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b57b5d26b30ef75d6ff296ef020c280", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b57b5d26b30ef75d6ff296ef020c280") : getUnDeleteMessages(list, com.sankuai.xm.base.util.b.b(list));
    }

    public static List<IMMessage> getUnDeleteMessages(List<IMMessage> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f3d179128dd8775ffd2974fdc2ce708", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f3d179128dd8775ffd2974fdc2ce708");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.xm.base.util.b.a(list)) {
            return arrayList;
        }
        for (IMMessage iMMessage : list) {
            if (iMMessage.getMsgStatus() != 13) {
                arrayList.add(iMMessage);
                if (arrayList.size() >= i) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public static long getSessionMsgSeqid(DBSession dBSession, DBSession dBSession2) {
        Object[] objArr = {dBSession, dBSession2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2bac4b961811721c5dcc355ac87bdc3", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2bac4b961811721c5dcc355ac87bdc3")).longValue();
        }
        if (dBSession == null && dBSession2 == null) {
            return Long.MAX_VALUE;
        }
        if (dBSession == null) {
            return dBSession2.getMsgSeqid();
        }
        if (dBSession2 == null) {
            return dBSession.getMsgSeqid();
        }
        if (dBSession2.getMsgSeqid() == Long.MAX_VALUE) {
            return dBSession.getMsgSeqid();
        }
        return dBSession.getMsgSeqid() > dBSession2.getMsgSeqid() ? dBSession.getMsgSeqid() : dBSession2.getMsgSeqid();
    }

    public static IMMessage getMaxMsgSeqIdNormalMessage(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        IMMessage iMMessage = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e662d066df8985a93b3224dd4f725bac", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e662d066df8985a93b3224dd4f725bac");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return null;
        }
        for (IMMessage iMMessage2 : list) {
            if (iMMessage == null || iMMessage2.getMsgSeqid() > iMMessage.getMsgSeqid()) {
                if (!(iMMessage2 instanceof ForceCancelMessage)) {
                    iMMessage = iMMessage2;
                }
            }
        }
        return iMMessage;
    }

    public static MsgAddition pAdditionToMsgAddition(@NonNull com.sankuai.xm.base.proto.addition.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        MsgAddition msgAddition = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c72f84824f3b5a33dd73c7a7c8a2dac4", 6917529027641081856L)) {
            return (MsgAddition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c72f84824f3b5a33dd73c7a7c8a2dac4");
        }
        if ((aVar instanceof com.sankuai.xm.base.proto.addition.d) || (aVar instanceof com.sankuai.xm.base.proto.addition.b) || (aVar instanceof com.sankuai.xm.base.proto.addition.c)) {
            msgAddition = new MsgAddition();
        }
        if (msgAddition != null) {
            msgAddition.setFromUid(aVar.b());
            msgAddition.setDeviceType(aVar.c());
            msgAddition.setDeviceId(aVar.v());
            msgAddition.setMsgId(aVar.d());
            msgAddition.setChannel(aVar.e());
            msgAddition.setAdditionData(aVar.f());
            msgAddition.setReceivers(aVar.g());
            msgAddition.setSts(aVar.h());
            msgAddition.setSeqId(aVar.i());
            msgAddition.setFinal(!aVar.j());
        }
        return msgAddition;
    }

    public static IMMessage getCopyMsg(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        IMMessage iMMessage2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35d1777fe4e6ae569ebae13878a5c14b", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35d1777fe4e6ae569ebae13878a5c14b");
        }
        if (iMMessage == null) {
            return null;
        }
        int msgType = iMMessage.getMsgType();
        if (msgType != 100) {
            switch (msgType) {
                case 1:
                    iMMessage2 = new TextMessage();
                    break;
                case 2:
                    iMMessage2 = new AudioMessage();
                    break;
                case 3:
                    iMMessage2 = new VideoMessage();
                    break;
                case 4:
                    iMMessage2 = new ImageMessage();
                    break;
                case 5:
                    iMMessage2 = new CalendarMessage();
                    break;
                case 6:
                    iMMessage2 = new LinkMessage();
                    break;
                case 7:
                    iMMessage2 = new MultiLinkMessage();
                    break;
                case 8:
                    iMMessage2 = new FileMessage();
                    break;
                case 9:
                    iMMessage2 = new GPSMessage();
                    break;
                case 10:
                    iMMessage2 = new VCardMessage();
                    break;
                case 11:
                    iMMessage2 = new EmotionMessage();
                    break;
                case 12:
                    iMMessage2 = new EventMessage();
                    break;
                case 13:
                    iMMessage2 = new TemplateMessage();
                    break;
                case 14:
                    iMMessage2 = new NoticeMessage();
                    break;
                case 15:
                    iMMessage2 = new CallMessage();
                    break;
                default:
                    try {
                        iMMessage2 = (IMMessage) iMMessage.getClass().newInstance();
                        break;
                    } catch (Exception e) {
                        a.a(e);
                        break;
                    }
            }
        } else {
            iMMessage2 = new UNKnownMessage();
        }
        if (iMMessage2 != null) {
            iMMessage.copyTo(iMMessage2);
        }
        return iMMessage2;
    }

    public static IMMessage getForwardMsg(IMMessage iMMessage, SessionId sessionId) {
        Object[] objArr = {iMMessage, sessionId};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "814ebaad4109fb663bb0bea419158c64", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "814ebaad4109fb663bb0bea419158c64");
        }
        IMMessage copyMsg = getCopyMsg(iMMessage);
        if (copyMsg != null) {
            String extension = copyMsg.getExtension();
            long msgId = copyMsg.getMsgId();
            int msgType = copyMsg.getMsgType();
            new IMMessage().copyTo(copyMsg);
            copyMsg.setExtension(extension);
            copyMsg.setMsgId(msgId);
            copyMsg.setMsgType(msgType);
            copyMsg.setToUid(sessionId.b);
            copyMsg.setChatId(sessionId.b);
            copyMsg.setChannel(sessionId.g);
            copyMsg.setCategory(sessionId.e);
            copyMsg.setPeerUid(sessionId.c);
            copyMsg.setSID(sessionId.g());
            copyMsg.setToAppId(sessionId.e != 3 ? sessionId.d : (short) 0);
            copyMsg.setPeerAppId(copyMsg.getToAppId());
            if (isPubService(sessionId.e)) {
                copyMsg.setPubCategory(sessionId.c == 0 ? 4 : 5);
            }
            if (copyMsg instanceof MediaMessage) {
                ((MediaMessage) copyMsg).setOperationType(1);
            }
        }
        return copyMsg;
    }

    public static boolean supportForward(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3aac726e237fd71cf44bad92d80cae26", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3aac726e237fd71cf44bad92d80cae26")).booleanValue();
        }
        if (iMMessage == null || iMMessage.getMsgId() == 0 || Arrays.binarySearch(getMsgForwardSupportTypes(), iMMessage.getMsgType()) < 0) {
            return false;
        }
        return (iMMessage.getMsgType() == 12 && iMMessage.getMsgStatus() == 15) ? false : true;
    }

    public static int[] getMsgForwardSupportTypes() {
        return MSG_FORWARD_SUPPORT_TYPES;
    }

    public static int confirmProto2Category(String str, long j, int i) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9c2eb26afce2e73c34f7ac4988a1ead", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9c2eb26afce2e73c34f7ac4988a1ead")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            switch (i) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 3;
            }
        } else if (i == 1) {
            return 9;
        } else {
            if (i == 3) {
                return j == 0 ? 10 : 11;
            }
        }
        return i;
    }

    public static List<Integer> getAllCategoryOfService(int... iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50b4ea9695b74a5497fa81bf0783a88a", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50b4ea9695b74a5497fa81bf0783a88a");
        }
        if (iArr == null) {
            return null;
        }
        Set<Integer> allService = getAllService(iArr);
        ArrayList arrayList = new ArrayList();
        for (Integer num : allService) {
            switch (num.intValue()) {
                case 1:
                    arrayList.addAll(Arrays.asList(1, 9));
                    break;
                case 2:
                    arrayList.add(2);
                    break;
                case 3:
                    arrayList.addAll(Arrays.asList(3, 10, 11));
                    break;
            }
        }
        return arrayList;
    }

    public static Set<Integer> getAllService(int... iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70aaa0b03cf3a1148ae22d3bb6742e62", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70aaa0b03cf3a1148ae22d3bb6742e62");
        }
        HashSet hashSet = new HashSet();
        if (iArr == null || iArr.length == 0) {
            hashSet.add(1);
            hashSet.add(2);
            hashSet.add(3);
        } else {
            for (int i : iArr) {
                int serviceForCategory = getServiceForCategory(i);
                if (serviceForCategory != -1) {
                    hashSet.add(Integer.valueOf(serviceForCategory));
                }
            }
        }
        return hashSet;
    }

    public static boolean isPubService(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5eed28adab2d9f24fc5a240ba896cbc6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5eed28adab2d9f24fc5a240ba896cbc6")).booleanValue() : getServiceForCategory(i) == 3;
    }

    public static boolean isIMPeerService(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fa4c08538a02297f56bf72e36a79d63", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fa4c08538a02297f56bf72e36a79d63")).booleanValue() : getServiceForCategory(i) == 1;
    }

    public static boolean isGroupService(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "504da5d0758036d5731009ad006dd41d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "504da5d0758036d5731009ad006dd41d")).booleanValue() : getServiceForCategory(i) == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int getServiceForCategory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96301d35a65dfdadc1b1334ee719c5c3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96301d35a65dfdadc1b1334ee719c5c3")).intValue();
        }
        switch (i) {
            case 1:
                break;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                switch (i) {
                    case 9:
                        break;
                    case 10:
                    case 11:
                        return 3;
                    default:
                        a.d("MessageUtils::getServiceForCategory, invalid category:%d", Integer.valueOf(i));
                        return -1;
                }
        }
        return 1;
    }

    public static void printMsgIds(List<? extends Message> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bc3b48d5ce9362d195afb88dae44e6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1bc3b48d5ce9362d195afb88dae44e6f");
            return;
        }
        try {
            if (com.sankuai.xm.base.util.b.a(list)) {
                return;
            }
            StringBuilder sb = new StringBuilder("begin print msgIds\n");
            for (int i = 0; i < list.size(); i++) {
                if (i % 30 == 0) {
                    a.b(sb.toString(), new Object[0]);
                    sb = new StringBuilder();
                    sb.append("msgIds:");
                }
                Message message = list.get(i);
                sb.append("msguuid:" + message.getMsgUuid() + " msgId:" + message.getMsgId() + ", ");
            }
            a.b(sb.toString(), new Object[0]);
        } catch (Throwable th) {
            a.a(th);
        }
    }

    public static SessionId sessionIdFromApiJson(int i, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        SessionId sessionId = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91b50ff9cd86d3cf891d882bdcdc0c59", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91b50ff9cd86d3cf891d882bdcdc0c59");
        }
        if (jSONObject == null) {
            a.c("MessageUtils::sessionIdFromApiJson, json = null", new Object[0]);
            return null;
        }
        String optString = jSONObject.optString(Message.SID);
        short optInt = (short) jSONObject.optInt(MessageStatisticsEntry.PARAM_CHANNEL);
        short optInt2 = (short) jSONObject.optInt("ai");
        if (i == 1) {
            sessionId = SessionId.a(jSONObject.optLong("b"), 0L, jSONObject.optInt(com.meituan.android.neohybrid.neo.bridge.presenter.g.n) == 1 ? 2 : 1, optInt2, optInt, optString);
        } else if (i == 2) {
            long optLong = jSONObject.optLong("u");
            long optLong2 = jSONObject.optLong("pu");
            sessionId = SessionId.a(optLong, optLong2, ac.a(optString) ? 3 : optLong2 > 0 ? 11 : 10, optInt2, optInt, optString);
        }
        if (sessionId == null) {
            a.d("MessageUtils::sessionIdFromApiJson, sessionId is not valid sid %s", jSONObject);
        }
        return sessionId;
    }
}
