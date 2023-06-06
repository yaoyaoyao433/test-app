package com.sankuai.xm.im.message.handler;

import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.transfer.download.DownloadManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends AbstractMediaMsgHandler {
    public static ChangeQuickRedirect d;

    public b(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d88e552d919f3d7547bfa95c1acd3bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d88e552d919f3d7547bfa95c1acd3bb");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler, com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3a3d9e62286be0e20bb571006d7500", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3a3d9e62286be0e20bb571006d7500")).intValue();
        }
        AudioMessage audioMessage = (AudioMessage) iMMessage;
        audioMessage.setCodec((short) 1);
        int a = super.a(iMMessage);
        if (a != 0) {
            com.sankuai.xm.im.utils.a.c("AudioMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a));
            return a;
        }
        if (b((MediaMessage) audioMessage)) {
            audioMessage.setOperationType(4);
        }
        long j = 0;
        if (audioMessage.getOperationType() == 4) {
            String path = audioMessage.getPath();
            if (!path.endsWith(".amr")) {
                com.sankuai.xm.im.utils.a.c("AudioMsgHandler::prepare, msg uuid: %s, AUDIO_FILE_END", iMMessage.getMsgUuid());
                return 10006;
            } else if (!com.sankuai.xm.base.util.k.o(path)) {
                com.sankuai.xm.im.utils.a.c("AudioMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_NOT_EXISTS", iMMessage.getMsgUuid());
                return 10003;
            } else {
                j = com.sankuai.xm.base.util.k.p(path);
                if (j > 3145728) {
                    com.sankuai.xm.im.utils.a.c("AudioMsgHandler::prepare, msg uuid: %s, ERR_FILE_TOO_LARGE", iMMessage.getMsgUuid());
                    return 10005;
                } else if (j < 200) {
                    com.sankuai.xm.im.utils.a.c("AudioMsgHandler::prepare, msg uuid: %s, ERR_FILE_TOO_SMALL", iMMessage.getMsgUuid());
                    return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_START_EVENT;
                }
            }
        } else if (TextUtils.isEmpty(audioMessage.getPath())) {
            com.sankuai.xm.im.utils.a.c("AudioMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_PATH_IS_NULL", iMMessage.getMsgUuid());
            return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_MRN_STOP_EVENT;
        }
        audioMessage.setSize(j);
        return 0;
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b229a88eaed944a750a74c9ea96df2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b229a88eaed944a750a74c9ea96df2c");
            return;
        }
        AudioMessage audioMessage = (AudioMessage) iMMessage;
        if (TextUtils.isEmpty(audioMessage.getUrl())) {
            com.sankuai.xm.im.utils.a.c("AudioMsgHandler::handleDownload, uuid: %s, url is empty", iMMessage.getMsgUuid());
            return;
        }
        audioMessage.setName(com.sankuai.xm.base.util.k.c(audioMessage.getUrl()));
        String f = com.sankuai.xm.base.util.k.f(IMClient.a().b(iMMessage.getMsgType()), com.sankuai.xm.base.util.k.c(audioMessage.getUrl()));
        audioMessage.setPath(f);
        if (c(iMMessage)) {
            a(audioMessage, audioMessage.getUrl(), f, 4);
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void c(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1774f5f22b69496b6a77fe7d7c3a1b3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1774f5f22b69496b6a77fe7d7c3a1b3c");
            return;
        }
        AudioMessage audioMessage = (AudioMessage) mediaMessage;
        super.c((MediaMessage) audioMessage);
        com.sankuai.xm.im.transfer.upload.b.a().a(audioMessage);
        DownloadManager.getInstance().stop(audioMessage.getUrl());
        com.sankuai.xm.base.util.k.e(com.sankuai.xm.base.util.k.f(IMClient.a().b(mediaMessage.getMsgType()), com.sankuai.xm.base.util.k.c(audioMessage.getUrl())));
    }
}
