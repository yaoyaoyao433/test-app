package com.sankuai.xm.im.message.handler;

import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.transfer.download.DownloadManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class w extends AbstractMediaMsgHandler {
    public static ChangeQuickRedirect d;
    private static boolean e;

    public w(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c52da59f72acbf386c78afe89509ff0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c52da59f72acbf386c78afe89509ff0");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler, com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae8474e8d26fec2c7a095beb4d3378d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae8474e8d26fec2c7a095beb4d3378d")).intValue();
        }
        VideoMessage videoMessage = (VideoMessage) iMMessage;
        int a = super.a(iMMessage);
        if (a != 0) {
            com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a));
            return a;
        }
        if (b((MediaMessage) videoMessage) && videoMessage.getOperationType() != 5) {
            videoMessage.setOperationType(4);
        }
        int operationType = videoMessage.getOperationType();
        if (operationType == 4 || operationType == 5) {
            if (TextUtils.isEmpty(videoMessage.getPath())) {
                com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_PATH_IS_NULL", iMMessage.getMsgUuid());
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_MRN_STOP_EVENT;
            } else if (operationType == 4 && !videoMessage.getPath().endsWith(".mp4")) {
                com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, FILE_SUFFIX_ERROR", iMMessage.getMsgUuid());
                return 10003;
            } else if (!com.sankuai.xm.base.util.k.o(videoMessage.getPath())) {
                com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_NOT_EXISTS", iMMessage.getMsgUuid());
                return 10003;
            } else if (operationType == 4 && !com.sankuai.xm.file.util.c.c(videoMessage.getPath())) {
                com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, ERR_FILE_FORMAT", iMMessage.getMsgUuid());
                return 10006;
            } else if (com.sankuai.xm.base.util.k.p(videoMessage.getPath()) <= 0) {
                com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, ERR_FILE_TOO_SMALL", iMMessage.getMsgUuid());
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_START_EVENT;
            } else if (videoMessage.getDuration() < 1000) {
                com.sankuai.xm.im.utils.a.c("VideoMsgHandler::prepare, msg uuid: %s, ERR_DURATION_TOO_SHORT", iMMessage.getMsgUuid());
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MMP_EVENT;
            }
        }
        if (com.sankuai.xm.base.proto.protobase.e.d(videoMessage.getScreenshotPath())) {
            return 10024;
        }
        if (!e) {
            com.sankuai.xm.base.service.m.a(com.sankuai.xm.im.message.api.e.class);
            e = true;
        }
        return 0;
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0895585afedaf0c85ae0d509fa548d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0895585afedaf0c85ae0d509fa548d6");
            return;
        }
        VideoMessage videoMessage = (VideoMessage) iMMessage;
        if (TextUtils.isEmpty(videoMessage.getUrl())) {
            com.sankuai.xm.im.utils.a.c("VideoMsgHandler::handleDownload, uuid: %s, url is empty", iMMessage.getMsgUuid());
            return;
        }
        videoMessage.setPath(com.sankuai.xm.file.util.c.a(IMClient.a().b(iMMessage.getMsgType()), com.sankuai.xm.base.util.k.c(videoMessage.getUrl())));
        String a = a(videoMessage);
        videoMessage.setScreenshotPath(a);
        if (c(iMMessage)) {
            a(videoMessage, videoMessage.getScreenshotUrl(), a, 5);
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void c(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675dfa74c6ad6abb08cca8e3a337d82e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675dfa74c6ad6abb08cca8e3a337d82e");
            return;
        }
        VideoMessage videoMessage = (VideoMessage) mediaMessage;
        super.c((MediaMessage) videoMessage);
        com.sankuai.xm.im.transfer.upload.b.a().a(videoMessage);
        DownloadManager.getInstance().stop(videoMessage.getScreenshotUrl());
        com.sankuai.xm.base.util.k.e(com.sankuai.xm.file.util.c.a(IMClient.a().s(), com.sankuai.xm.base.util.k.c(videoMessage.getScreenshotUrl())));
    }

    public static String a(VideoMessage videoMessage) {
        Object[] objArr = {videoMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "243c9ce41fa5654a1873bca51c4ecdd1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "243c9ce41fa5654a1873bca51c4ecdd1");
        }
        if (videoMessage == null) {
            return null;
        }
        String screenshotPath = videoMessage.getScreenshotPath();
        String screenshotUrl = videoMessage.getScreenshotUrl();
        String s = IMClient.a().s();
        String b = IMClient.a().b(videoMessage.getMsgType());
        if (TextUtils.isEmpty(screenshotPath) || com.sankuai.xm.base.util.k.d(screenshotPath) || !(screenshotPath.startsWith(b) || screenshotPath.startsWith(s))) {
            if (!TextUtils.isEmpty(screenshotUrl)) {
                return com.sankuai.xm.file.util.c.a(s, com.sankuai.xm.base.util.k.c(screenshotUrl));
            }
            if (!TextUtils.isEmpty(videoMessage.getPath()) && (videoMessage.getPath().startsWith(b) || videoMessage.getPath().startsWith(s))) {
                return com.sankuai.xm.file.util.c.a(s, com.sankuai.xm.base.util.k.u(videoMessage.getPath()).split("\\.")[0] + ".jpg");
            }
            return com.sankuai.xm.file.util.c.a(s, videoMessage.getMsgUuid() + ".jpg");
        }
        return screenshotPath;
    }
}
