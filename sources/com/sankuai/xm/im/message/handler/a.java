package com.sankuai.xm.im.message.handler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.Arrays;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements m {
    private static final int[] a = {1, 2, 3, 4};
    public static ChangeQuickRedirect b;
    protected com.sankuai.xm.im.message.d c;

    public a(com.sankuai.xm.im.message.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d50d2faf542a6c790475169775420c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d50d2faf542a6c790475169775420c");
        } else {
            this.c = dVar;
        }
    }

    @Override // com.sankuai.xm.im.message.handler.m
    public int a(IMMessage iMMessage) {
        boolean z;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cbfee1f0351f3daef73d0eaa9c4716b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cbfee1f0351f3daef73d0eaa9c4716b")).intValue();
        }
        d(iMMessage);
        iMMessage.setMsgId(0L);
        iMMessage.setDirection(1);
        if (IMClient.a().k() != 0) {
            iMMessage.setFromUid(IMClient.a().k());
            Object[] objArr2 = {iMMessage};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34d73be9685a53316178556f0ebd916d", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34d73be9685a53316178556f0ebd916d")).booleanValue();
            } else {
                z = TextUtils.isEmpty(iMMessage.getCompatible()) || (Arrays.binarySearch(a, iMMessage.getMsgType()) < 0 && iMMessage.getCompatibleContent().length() <= 100);
            }
            if (!z) {
                com.sankuai.xm.im.utils.a.c("AbstractMsgHandler::prepare, checkMsgUnKnownValid false, msg = " + iMMessage.getCompatibleContent(), new Object[0]);
                iMMessage.setCompatible("");
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(iMMessage.getFromName()) || com.sankuai.xm.base.proto.protobase.e.d(iMMessage.getExtension()) || com.sankuai.xm.base.proto.protobase.e.d(iMMessage.getGroupName())) {
                return 10024;
            }
            if (!SessionId.a(iMMessage).i()) {
                com.sankuai.xm.im.utils.a.c("AbstractMsgHandler::prepare, belong session invalid, msg = " + iMMessage.keyParamToString(), new Object[0]);
                return 10011;
            }
            if (TextUtils.isEmpty(iMMessage.getFromName())) {
                iMMessage.setFromName(IMClient.a().l());
            }
            iMMessage.setCts(IMClient.a().m());
            iMMessage.setSts(iMMessage.getCts());
            iMMessage.setMsgStatus(3);
            iMMessage.setFileStatus(3);
            iMMessage.setDirection(1);
            return 0;
        }
        return 10007;
    }

    public static void d(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fd9e28bda12013ccbdc45e94b4d3396", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fd9e28bda12013ccbdc45e94b4d3396");
            return;
        }
        if (TextUtils.isEmpty(iMMessage.getMsgUuid())) {
            iMMessage.setMsgUuid(UUID.randomUUID().toString());
        }
        if (iMMessage.getFromAppId() == 0) {
            iMMessage.setFromAppId(IMClient.a().g());
        }
        if (iMMessage.getPeerAppId() == 0 && !MessageUtils.isPubService(iMMessage.getCategory())) {
            iMMessage.setPeerAppId(IMClient.a().g());
        }
        if (MessageUtils.isPubService(iMMessage.getCategory()) && iMMessage.getPubCategory() == 0) {
            iMMessage.setPubCategory(iMMessage.getPeerUid() == 0 ? 4 : 5);
        }
        if (iMMessage.getToAppId() == 0) {
            iMMessage.setToAppId(iMMessage.getPeerAppId());
        }
        if (!TextUtils.isEmpty(iMMessage.getSID()) && iMMessage.getCategory() < 9) {
            iMMessage.setSID("");
        }
        if (iMMessage.getChatId() == 0) {
            iMMessage.setChatId(iMMessage.getToUid());
        }
        if (iMMessage.getFromPubId() > 0) {
            iMMessage.setFromPubId(0L);
            iMMessage.setFromPubName("");
            iMMessage.setMsgSource((byte) 0);
        }
    }
}
