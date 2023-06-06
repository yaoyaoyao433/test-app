package com.sankuai.xm.im.bridge.business.proto.im;

import android.util.Base64;
import com.dianping.titans.js.JsBridgeResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.bridge.a;
import com.sankuai.xm.im.cache.bean.DBGroupOpposite;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.CalendarMessage;
import com.sankuai.xm.im.message.bean.CallMessage;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.DataMessage;
import com.sankuai.xm.im.message.bean.DynamicMessage;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.FileMessage;
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
import com.sankuai.xm.im.message.bean.TemplateMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VCardMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import com.sankuai.xm.im.notice.bean.IMNotice;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b5f155070a9810ce9b48f69c60deb9b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b5f155070a9810ce9b48f69c60deb9b")).intValue();
        }
        if (i > 1000 || i <= 0) {
            switch (i) {
                case 0:
                    return 10000;
                case 10001:
                    return 10002;
                case 10002:
                    return 10003;
                case 10003:
                    return 10004;
                case 10005:
                    return 10005;
                case 10006:
                    return 10006;
                case 10007:
                    return 10007;
                case RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT /* 10010 */:
                    return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT;
                case 10011:
                    return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT;
                case 10017:
                    return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
                case 10018:
                    return 10011;
                case 10020:
                    return 10020;
                default:
                    return -1;
            }
        }
        return i;
    }

    public static JSONArray a(Collection collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d95c5725e316b9a006b7d097a8eec139", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d95c5725e316b9a006b7d097a8eec139");
        }
        if (com.sankuai.xm.base.util.b.a(collection)) {
            return new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            arrayList.add(sb.toString());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static int a(com.sankuai.xm.im.connection.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e567a92215b705f3f875c4c2f27cc18d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e567a92215b705f3f875c4c2f27cc18d")).intValue();
        }
        if (bVar == null) {
            return 0;
        }
        switch (bVar) {
            case CONNECTING:
                return 1;
            case NONE_NET:
            case DISCONNECTED:
                return 2;
            case CONNECTED:
                return 3;
            case AUTH_FAILURE:
                return 4;
            case KICKOFF:
                return 5;
            case LOGOFF:
                return 6;
            default:
                return 0;
        }
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80d288bb4556f002a4dc618df5cdd634", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80d288bb4556f002a4dc618df5cdd634")).intValue() : MessageUtils.pushChatTypeToCategory(str);
    }

    private static String a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7d167bd0593411f60698a6e26e49cff", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7d167bd0593411f60698a6e26e49cff") : MessageUtils.categoryToPushChatType(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r12.equals("pub-proxy") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.im.bridge.business.proto.im.c.a
            java.lang.String r11 = "bbefc5ef1ce4eced82da23ede7cb31a8"
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
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L23:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -349790306(0xffffffffeb269f9e, float:-2.0143546E26)
            if (r2 == r3) goto L5b
            r0 = 573778521(0x22332a59, float:2.4281442E-18)
            if (r2 == r0) goto L51
            r0 = 1151995877(0x44aa0fe5, float:1360.4967)
            if (r2 == r0) goto L47
            r0 = 1375807616(0x52012880, float:1.38682565E11)
            if (r2 == r0) goto L3d
            goto L64
        L3d:
            java.lang.String r0 = "pub-proxy-custom"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r0 = 3
            goto L65
        L47:
            java.lang.String r0 = "pub-service"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r0 = 0
            goto L65
        L51:
            java.lang.String r0 = "pub-service-custom"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r0 = 2
            goto L65
        L5b:
            java.lang.String r2 = "pub-proxy"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L64
            goto L65
        L64:
            r0 = -1
        L65:
            r12 = 5
            r1 = 4
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L6d;
                case 2: goto L6c;
                case 3: goto L6b;
                default: goto L6a;
            }
        L6a:
            return r9
        L6b:
            return r12
        L6c:
            return r1
        L6d:
            return r12
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.bridge.business.proto.im.c.c(java.lang.String):int");
    }

    private static boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcaf108836ea9c32524377c819395e7c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcaf108836ea9c32524377c819395e7c")).booleanValue() : MessageUtils.isGroupService(i);
    }

    public static int a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22de0bed9fd1d75a1e84df56ad6e41ee", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22de0bed9fd1d75a1e84df56ad6e41ee")).intValue() : a(jSONObject.optString("sessionType", ""));
    }

    public static int b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ecc81061568428954195859991e5e39", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ecc81061568428954195859991e5e39")).intValue() : c(jSONObject.optString("sessionType", ""));
    }

    public static short c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abe54f9a94aacfd33dc40675031a2a6f", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abe54f9a94aacfd33dc40675031a2a6f")).shortValue() : (short) jSONObject.optInt(RemoteMessageConst.Notification.CHANNEL_ID, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static short b(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16ee467df1a83bd53f0b950cb5baf7e7", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16ee467df1a83bd53f0b950cb5baf7e7")).shortValue();
        }
        switch (str.hashCode()) {
            case -1823832514:
                if (str.equals("custom-peer")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3184:
                if (str.equals("cs")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 111357:
                if (str.equals("pub")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3599307:
                if (str.equals("user")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98629247:
                if (str.equals("group")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 165153673:
                if (str.equals("custom-pub-service")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1848063042:
                if (str.equals("custom-pub-proxy")) {
                    c = 6;
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
            case 1:
                return (short) 1;
            case 2:
                return (short) 2;
            case 3:
                return (short) 3;
            case 4:
                return (short) 9;
            case 5:
                return (short) 10;
            case 6:
                return (short) 11;
            default:
                return (short) 1;
        }
    }

    public static SessionId d(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a8d296e7f0a5f61d228ff476fbd4d7c", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a8d296e7f0a5f61d228ff476fbd4d7c");
        }
        try {
            short c = c(jSONObject);
            String optString = jSONObject.optString(Message.SID, "");
            int b = b(jSONObject);
            SessionId a2 = SessionId.a(ac.a(jSONObject.optString("uid"), 0L), ac.a(jSONObject.optString(Message.PEER_UID), 0L), a(jSONObject), (short) jSONObject.optInt(Message.PEER_APPID, 0), c, optString);
            a2.f = b;
            return a2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject a(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58f6c4d4d88c1770e97a154144a0e101", 6917529027641081856L) ? (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58f6c4d4d88c1770e97a154144a0e101") : a(message, com.sankuai.xm.im.bridge.a.a().b);
    }

    private static JSONObject a(Message message, a.b bVar) {
        int i;
        int i2;
        Message message2 = message;
        Object[] objArr = {message2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cf9f666f6decceb61d080c9a8a172cd", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cf9f666f6decceb61d080c9a8a172cd");
        }
        if (message2 == null) {
            return null;
        }
        if (bVar != null) {
            try {
                message2 = bVar.a(message2);
            } catch (Throwable unused) {
                return null;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sessionType", a(message2.getCategory(), message2.getPubCategory()));
        jSONObject.put(Message.TO_APPID, (int) message2.getToAppId());
        jSONObject.put(Message.FROM_APPID, (int) message2.getFromAppId());
        jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, (int) message2.getChannel());
        jSONObject.put("dataType", message2.getMsgType() == -2 ? 1 : 0);
        jSONObject.put("type", message2.getMsgType() == -100 ? 12 : message2.getMsgType());
        jSONObject.put("uuid", message2.getMsgUuid());
        StringBuilder sb = new StringBuilder();
        sb.append(message2.getFromUid());
        jSONObject.put("from", sb.toString());
        jSONObject.put("fromName", message2.getFromName());
        jSONObject.put("fromGroupName", message2.getGroupName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message2.getToUid());
        jSONObject.put(RemoteMessageConst.TO, sb2.toString());
        jSONObject.put(Message.CTS, message2.getCts());
        jSONObject.put("sts", message2.getSts());
        int msgStatus = message2.getMsgStatus();
        Object[] objArr2 = {Integer.valueOf(msgStatus)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int i3 = 7;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7223cdcaf95269fdb350726b8880f7f3", 6917529027641081856L)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7223cdcaf95269fdb350726b8880f7f3")).intValue();
        } else if (msgStatus == 7) {
            i3 = 8;
        } else if (msgStatus == 9) {
            i3 = 9;
        } else if (msgStatus != 11) {
            if (msgStatus != 1000) {
                switch (msgStatus) {
                    case 3:
                        i3 = 1;
                        break;
                    case 4:
                        break;
                    default:
                        switch (msgStatus) {
                            case 13:
                                i3 = 11;
                                break;
                            case 14:
                                i3 = 4;
                                break;
                            case 15:
                                i3 = 5;
                                break;
                        }
                    case 5:
                        i3 = 2;
                        break;
                }
            }
            i3 = 3;
        } else {
            i3 = 10;
        }
        jSONObject.put("status", i3);
        int fileStatus = message2.getFileStatus();
        Object[] objArr3 = {Integer.valueOf(fileStatus)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "efa56c1a0176242f83c4ad2c4d8808e9", 6917529027641081856L)) {
            switch (fileStatus) {
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "efa56c1a0176242f83c4ad2c4d8808e9")).intValue();
        }
        jSONObject.put(Message.FILE_STATUS, i);
        if (message2 instanceof MediaMessage) {
            jSONObject.put("needCompress", ((MediaMessage) message2).getOperationType() == 5);
            int operationType = ((MediaMessage) message2).getOperationType();
            Object[] objArr4 = {Integer.valueOf(operationType)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2d99d8399615513544506d2e1da72e43", 6917529027641081856L)) {
                switch (operationType) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
            } else {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2d99d8399615513544506d2e1da72e43")).intValue();
            }
            jSONObject.put("fileUploadType", i2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(message2.getChatId());
        jSONObject.put("belongTo", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(message2.getMsgId());
        jSONObject.put(MessageStatisticsEntry.PARAM_MSG_ID, sb4.toString());
        jSONObject.put("extension", message2.getExtension());
        jSONObject.put(Message.SID, message2.getSID());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(message2.getPeerUid());
        jSONObject.put(Message.PEER_UID, sb5.toString());
        jSONObject.put("deviceType", (int) message2.getPeerDeviceType());
        jSONObject.put("adminUid", message2.getAdminUid());
        jSONObject.put(Message.RECEIPT, message2.isReceipt());
        jSONObject.put("oppositeStatus", message2.getMsgOppositeStatus());
        if (b(message2.getCategory())) {
            jSONObject.put(Message.FROM_PUB_ID, message2.getFromPubId());
            jSONObject.put(Message.FROM_PUB_NAME, message2.getFromPubName());
        }
        jSONObject.put(Message.MSG_SOURCE, (int) message2.getMsgSource());
        jSONObject.put("isForceCancel", message2.getMsgType() == -100);
        jSONObject.put("direction", message2.getDirection());
        JSONObject jSONObject2 = new JSONObject();
        if (message2 instanceof TextMessage) {
            jSONObject2.put("text", ((TextMessage) message2).getText());
        } else if (message2 instanceof ImageMessage) {
            ImageMessage imageMessage = (ImageMessage) message2;
            jSONObject2.put("thumbnail", imageMessage.getThumbnailUrl());
            jSONObject2.put("normal", imageMessage.getNormalUrl());
            jSONObject2.put("original", imageMessage.getOriginUrl());
            jSONObject2.put("path", imageMessage.getPath());
            jSONObject2.put("type", imageMessage.getType());
            jSONObject2.put("token", imageMessage.getToken());
            jSONObject2.put("originSize", imageMessage.getOriginSize());
            jSONObject2.put("uploadImageType", imageMessage.isUploadOrigin() ? 2 : 1);
            jSONObject2.put("custom", imageMessage.getCustom(new String[0]));
            jSONObject2.put("thumbnailWidth", imageMessage.getThumbnailWidth());
            jSONObject2.put("thumbnailHeight", imageMessage.getThumbnailHeight());
        } else if (message2 instanceof LinkMessage) {
            LinkMessage linkMessage = (LinkMessage) message2;
            jSONObject2.put("title", linkMessage.getTitle());
            jSONObject2.put("image", linkMessage.getImage());
            jSONObject2.put("content", linkMessage.getContent());
            jSONObject2.put(RegionLinkDao.TABLENAME, linkMessage.getLink());
        } else if (message2 instanceof MultiLinkMessage) {
            MultiLinkMessage multiLinkMessage = (MultiLinkMessage) message2;
            jSONObject2.put("number", (int) multiLinkMessage.getNum());
            jSONObject2.put("content", multiLinkMessage.getContent());
        } else if (message2 instanceof FileMessage) {
            FileMessage fileMessage = (FileMessage) message2;
            jSONObject2.put("fileId", fileMessage.getFileId());
            jSONObject2.put("url", fileMessage.getUrl());
            jSONObject2.put("path", fileMessage.getPath());
            jSONObject2.put("name", fileMessage.getName());
            jSONObject2.put("format", fileMessage.getFormat());
            jSONObject2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, fileMessage.getSize());
            jSONObject2.put("token", fileMessage.getToken());
            jSONObject2.put("custom", fileMessage.getCustom(new String[0]));
        } else if (message2 instanceof GeneralMessage) {
            GeneralMessage generalMessage = (GeneralMessage) message2;
            jSONObject2.put("dataBase64", Base64.encodeToString(generalMessage.getData(), 2));
            jSONObject2.put("dataJSON", new String(generalMessage.getData()));
            jSONObject2.put("summary", generalMessage.getSummary());
            jSONObject2.put("type", generalMessage.getType());
        } else if (message2 instanceof AudioMessage) {
            AudioMessage audioMessage = (AudioMessage) message2;
            jSONObject2.put("url", audioMessage.getUrl());
            jSONObject2.put("path", audioMessage.getPath());
            jSONObject2.put("codec", (int) audioMessage.getCodec());
            jSONObject2.put("duration", (int) audioMessage.getDuration());
            jSONObject2.put("token", audioMessage.getToken());
            jSONObject2.put("custom", audioMessage.getCustom(new String[0]));
        } else if (message2 instanceof VideoMessage) {
            VideoMessage videoMessage = (VideoMessage) message2;
            jSONObject2.put("url", videoMessage.getUrl());
            jSONObject2.put("path", videoMessage.getPath());
            jSONObject2.put("screenshotUrl", videoMessage.getScreenshotUrl());
            jSONObject2.put("screenshotPath", videoMessage.getScreenshotPath());
            jSONObject2.put("duration", videoMessage.getDuration());
            jSONObject2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, videoMessage.getSize());
            jSONObject2.put("width", (int) videoMessage.getWidth());
            jSONObject2.put("height", (int) videoMessage.getHeight());
            jSONObject2.put(DeviceInfo.TM, videoMessage.getTimestamp());
            jSONObject2.put("token", videoMessage.getToken());
            jSONObject2.put("custom", videoMessage.getCustom(new String[0]));
        } else if (message2 instanceof EmotionMessage) {
            if (message2 instanceof CustomEmotionMessage) {
                CustomEmotionMessage customEmotionMessage = (CustomEmotionMessage) message2;
                jSONObject2.put("category", customEmotionMessage.getGroup());
                jSONObject2.put("type", customEmotionMessage.getType());
                jSONObject2.put("name", customEmotionMessage.getName());
                jSONObject2.put("packageId", customEmotionMessage.getPackageId());
                jSONObject2.put("packageName", customEmotionMessage.getPackageName());
                jSONObject2.put("faceId", customEmotionMessage.getId());
                jSONObject2.put("params", customEmotionMessage.getParams());
            } else {
                EmotionMessage emotionMessage = (EmotionMessage) message2;
                jSONObject2.put("category", emotionMessage.getGroup());
                jSONObject2.put("type", emotionMessage.getType());
                jSONObject2.put("name", emotionMessage.getName());
            }
        } else if (message2 instanceof EventMessage) {
            EventMessage eventMessage = (EventMessage) message2;
            jSONObject2.put("type", eventMessage.getType());
            jSONObject2.put("text", eventMessage.getText());
        } else if (message2 instanceof DataMessage) {
            DataMessage dataMessage = (DataMessage) message2;
            jSONObject2.put("dataBase64", Base64.encodeToString(dataMessage.getMessage(), 2));
            jSONObject2.put("type", dataMessage.getType());
        } else if (message2 instanceof CalendarMessage) {
            CalendarMessage calendarMessage = (CalendarMessage) message2;
            jSONObject2.put("dateStart", calendarMessage.getDateStart());
            jSONObject2.put("dateEnd", calendarMessage.getDateEnd());
            jSONObject2.put("summary", calendarMessage.getSummary());
            jSONObject2.put("location", calendarMessage.getLocation());
            jSONObject2.put(PayLabelConstants.TYPE_TRIGGER, calendarMessage.getTrigger());
            jSONObject2.put("participant", calendarMessage.getParticipant());
            jSONObject2.put("remark", calendarMessage.getRemark());
            jSONObject2.put("calendarId", calendarMessage.getCalendarId());
        } else if (message2 instanceof CallMessage) {
            CallMessage callMessage = (CallMessage) message2;
            jSONObject2.put("callUid", callMessage.getCallUid());
            jSONObject2.put("callPeerUid", callMessage.getCallPeerUid());
            jSONObject2.put("roles", callMessage.getRoles());
            jSONObject2.put("callStatus", callMessage.getCallStatus());
            jSONObject2.put("callType", callMessage.getCallType());
            jSONObject2.put("startCallTs", callMessage.getStartCallTs());
            jSONObject2.put("startTalkTs", callMessage.getStartTalkTs());
            jSONObject2.put("endTs", callMessage.getEndTs());
            jSONObject2.put("callDur", callMessage.getCallDur());
        } else if (message2 instanceof VCardMessage) {
            VCardMessage vCardMessage = (VCardMessage) message2;
            jSONObject2.put("cardUid", vCardMessage.getUid());
            jSONObject2.put("cardName", vCardMessage.getName());
            jSONObject2.put("cardAccount", vCardMessage.getAccount());
            jSONObject2.put("cardType", (int) vCardMessage.getType());
            jSONObject2.put("cardSubType", (int) vCardMessage.getSubType());
        } else if (message2 instanceof DynamicMessage) {
            DynamicMessage dynamicMessage = (DynamicMessage) message2;
            jSONObject2.put("dynamicId", dynamicMessage.getId());
            jSONObject2.put("title", dynamicMessage.getTitle());
            jSONObject2.put("dxData", dynamicMessage.getDxData());
            jSONObject2.put("appData", dynamicMessage.getAppData());
        } else if (message2 instanceof GPSMessage) {
            GPSMessage gPSMessage = (GPSMessage) message2;
            jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, gPSMessage.getLatitude());
            jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, gPSMessage.getLongitude());
            jSONObject2.put("name", gPSMessage.getName());
        } else if (message2 instanceof NoticeMessage) {
            NoticeMessage noticeMessage = (NoticeMessage) message2;
            jSONObject2.put("title", noticeMessage.getTitle());
            jSONObject2.put("image", noticeMessage.getImage());
            jSONObject2.put("content", noticeMessage.getContent());
            jSONObject2.put(RegionLinkDao.TABLENAME, noticeMessage.getLink());
        } else if (message2 instanceof QuoteMessage) {
            QuoteMessage quoteMessage = (QuoteMessage) message2;
            jSONObject2.put("lastReplay", quoteMessage.getSelectedMessage());
            jSONObject2.put("quoted", quoteMessage.getQuotedMessage());
            jSONObject2.put("searchText", quoteMessage.getSearchText());
        } else if (message2 instanceof RedPacketMessage) {
            RedPacketMessage redPacketMessage = (RedPacketMessage) message2;
            jSONObject2.put("redId", redPacketMessage.getID());
            jSONObject2.put("redType", (int) redPacketMessage.getType());
            jSONObject2.put("greetings", redPacketMessage.getGreetings());
        } else if (message2 instanceof TemplateMessage) {
            TemplateMessage templateMessage = (TemplateMessage) message2;
            jSONObject2.put("templateName", templateMessage.getTemplateName());
            jSONObject2.put("contentTitle", templateMessage.getContentTitle());
            jSONObject2.put("content", templateMessage.getContent());
            jSONObject2.put("linkName", templateMessage.getLinkName());
            jSONObject2.put(RegionLinkDao.TABLENAME, templateMessage.getLink());
        }
        jSONObject.put("body", jSONObject2);
        return jSONObject;
    }

    public static JSONArray a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac11250872af725c3e5cc54772fcf614", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac11250872af725c3e5cc54772fcf614");
        }
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (IMMessage iMMessage : list) {
            jSONArray.put(a(iMMessage));
        }
        return jSONArray;
    }

    private static JSONObject a(IMNotice iMNotice) {
        Object[] objArr = {iMNotice};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec88bb4b9885e1acc537e47a59fc3933", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec88bb4b9885e1acc537e47a59fc3933");
        }
        if (iMNotice == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataType", 2);
            jSONObject.put("sessionType", a(iMNotice.getCategory(), 0));
            jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, (int) iMNotice.getChannel());
            StringBuilder sb = new StringBuilder();
            sb.append(iMNotice.getChatId());
            jSONObject.put("belongTo", sb.toString());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("noticeType", iMNotice.getType());
            jSONObject2.put("noticeCts", iMNotice.getCts());
            jSONObject2.put("data", iMNotice.getData());
            jSONObject.put("body", jSONObject2);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray b(List<IMNotice> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e11758cddb59eca71861389e5a2fa44c", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e11758cddb59eca71861389e5a2fa44c");
        }
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (IMNotice iMNotice : list) {
            jSONArray.put(a(iMNotice));
        }
        return jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ea A[Catch: Throwable -> 0x06de, TryCatch #0 {Throwable -> 0x06de, blocks: (B:8:0x0023, B:11:0x0036, B:12:0x003e, B:14:0x0043, B:47:0x04ea, B:49:0x0520, B:51:0x052e, B:53:0x05ee, B:63:0x0611, B:65:0x0631, B:66:0x0649, B:68:0x066d, B:74:0x0682, B:76:0x0689, B:78:0x0691, B:86:0x06d1, B:79:0x0697, B:81:0x06be, B:82:0x06c9, B:87:0x06d4, B:69:0x0678, B:54:0x05fb, B:50:0x0525, B:15:0x006e, B:16:0x0090, B:17:0x00d6, B:18:0x0115, B:20:0x0126, B:22:0x0141, B:21:0x0134, B:23:0x0155, B:24:0x0178, B:25:0x01d8, B:26:0x0203, B:27:0x0237, B:28:0x0250, B:29:0x0272, B:30:0x02ac, B:31:0x02ce, B:32:0x031f, B:33:0x0339, B:34:0x0364, B:35:0x03b3, B:39:0x0402, B:40:0x0424, B:41:0x047a, B:42:0x04ba, B:44:0x04cb), top: B:90:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.im.message.bean.IMMessage e(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.bridge.business.proto.im.c.e(org.json.JSONObject):com.sankuai.xm.im.message.bean.IMMessage");
    }

    public static List<Message> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0f132ce90ff0f2a112116e31a85e082", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0f132ce90ff0f2a112116e31a85e082");
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONArray == null) {
                return arrayList;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(e(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public static JSONObject a(com.sankuai.xm.im.session.entry.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b548070a7d383d166bc9d9c766db0cd8", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b548070a7d383d166bc9d9c766db0cd8");
        }
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject a2 = a(aVar.c());
            a2.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT, aVar.d);
            a2.put("time", aVar.b.getSts());
            a2.put("message", a(aVar.b));
            return a2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray c(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e17786bf7c89b1cbc88cc0c7174ec6d0", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e17786bf7c89b1cbc88cc0c7174ec6d0");
        }
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.sankuai.xm.im.session.entry.a aVar : list) {
            jSONArray.put(a(aVar));
        }
        return jSONArray;
    }

    public static JSONObject a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79303fadb07c7f519b48d7063049b4b2", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79303fadb07c7f519b48d7063049b4b2");
        }
        if (sessionId == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", (int) sessionId.d);
            jSONObject.put(Message.PEER_APPID, (int) sessionId.d);
            jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, (int) sessionId.g);
            StringBuilder sb = new StringBuilder();
            sb.append(sessionId.b);
            jSONObject.put("uid", sb.toString());
            jSONObject.put(Message.SID, sessionId.g());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sessionId.c);
            jSONObject.put(Message.PEER_UID, sb2.toString());
            jSONObject.put("sessionType", a(sessionId.e, sessionId.e()));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject a(com.sankuai.xm.im.vcard.entity.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9719b5c7ca284d17b529f7723d3208f5", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9719b5c7ca284d17b529f7723d3208f5");
        }
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.e);
            jSONObject.put("uid", sb.toString());
            jSONObject.put("name", aVar.d);
            jSONObject.put("type", str);
            jSONObject.put("avatar", aVar.b);
            jSONObject.put(Message.SID, aVar.h);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject a(GroupOppositeController.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af4764e56c3f379b17d9d6c6645d33a9", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af4764e56c3f379b17d9d6c6645d33a9");
        }
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.b);
            jSONObject.put("msgId", sb.toString());
            jSONObject.put("status", aVar.c);
            jSONObject.put(DBGroupOpposite.READ_UIDS, a(aVar.d));
            jSONObject.put(DBGroupOpposite.UNREAD_UIDS, a(aVar.e));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray d(List<GroupOppositeController.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67953ea8eeb1c8c61107b25fc51e788d", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67953ea8eeb1c8c61107b25fc51e788d");
        }
        if (list == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (GroupOppositeController.a aVar : list) {
                jSONArray.put(a(aVar));
            }
            return jSONArray;
        } catch (Throwable unused) {
            return new JSONArray();
        }
    }

    public static JSONArray e(List<MsgAddition> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57258526a153ed9228e8dd2d1f63a0a3", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57258526a153ed9228e8dd2d1f63a0a3");
        }
        try {
            if (com.sankuai.xm.base.util.b.a(list)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (MsgAddition msgAddition : list) {
                JSONObject jSONObject = new JSONObject();
                if (msgAddition != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(msgAddition.getMsgId());
                    jSONObject.put(MessageStatisticsEntry.PARAM_MSG_ID, sb.toString());
                    jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, (int) msgAddition.getChannel());
                    jSONObject.put("data", msgAddition.getAdditionData());
                    jSONObject.put("isFinal", msgAddition.isFinal());
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray a(Collection<com.sankuai.xm.im.vcard.entity.a> collection, String str) {
        int i = 0;
        Object[] objArr = {collection, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dcff47a631a4d598ec04cf64f3fc7d5", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dcff47a631a4d598ec04cf64f3fc7d5");
        }
        if (collection == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (com.sankuai.xm.im.vcard.entity.a aVar : collection) {
                JSONObject a2 = a(aVar, str);
                if (a2 != null) {
                    jSONArray.put(i, a2);
                    i++;
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> JSONArray f(List<com.sankuai.xm.imextra.service.chatpresent.a<T>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "870b98bb3b6c7504331922706ebdc0fe", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "870b98bb3b6c7504331922706ebdc0fe");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.sankuai.xm.imextra.service.chatpresent.a<T> aVar : list) {
            JSONObject a2 = a(aVar);
            if (a2 != null) {
                jSONArray.put(a2);
            }
        }
        return jSONArray;
    }

    private static JSONObject a(com.sankuai.xm.imextra.service.chatpresent.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c846347431499dc26f68d43ad2c5638", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c846347431499dc26f68d43ad2c5638");
        }
        if (com.sankuai.xm.imextra.service.chatpresent.a.isValid(aVar)) {
            try {
                SessionId sessionId = aVar.getSessionId();
                if (sessionId == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tagId", aVar.getTag());
                jSONObject.put("source", aVar.getSource());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", sessionId.b);
                jSONObject2.put(Message.PEER_UID, sessionId.c);
                jSONObject2.put("sessionType", sessionId.h());
                jSONObject2.put(Message.PEER_APPID, (int) sessionId.d);
                jSONObject2.put(RemoteMessageConst.Notification.CHANNEL_ID, (int) sessionId.g);
                jSONObject2.put(Message.SID, sessionId.g());
                jSONObject.put("sessionId", jSONObject2);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
