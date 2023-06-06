package com.sankuai.xm.im.message.handler;

import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.transfer.download.DownloadManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j extends AbstractMediaMsgHandler {
    public static ChangeQuickRedirect d;

    public j(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12773e1fcc9274aa170f8ea63ff90ea9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12773e1fcc9274aa170f8ea63ff90ea9");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler, com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec84772603652bc611266ed4786b99f4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec84772603652bc611266ed4786b99f4")).intValue();
        }
        FileMessage fileMessage = (FileMessage) iMMessage;
        int a = super.a(iMMessage);
        if (a != 0) {
            com.sankuai.xm.im.utils.a.c("FileMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a));
            return a;
        }
        if (b((MediaMessage) fileMessage)) {
            fileMessage.setOperationType(4);
        }
        if (fileMessage.getOperationType() == 4) {
            if (TextUtils.isEmpty(fileMessage.getPath())) {
                com.sankuai.xm.im.utils.a.c("FileMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_PATH_IS_NULL", iMMessage.getMsgUuid());
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_MRN_STOP_EVENT;
            } else if (!com.sankuai.xm.base.util.k.o(fileMessage.getPath())) {
                com.sankuai.xm.im.utils.a.c("FileMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_PATH_IS_NULL", iMMessage.getMsgUuid());
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_MRN_STOP_EVENT;
            } else {
                fileMessage.setSize(com.sankuai.xm.base.util.k.p(fileMessage.getPath()));
            }
        }
        return (com.sankuai.xm.base.proto.protobase.e.d(fileMessage.getFileId()) || com.sankuai.xm.base.proto.protobase.e.d(fileMessage.getFormat()) || com.sankuai.xm.base.proto.protobase.e.d(fileMessage.getLinkId())) ? 10024 : 0;
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f8d04e2438166b6f704d629197a2c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f8d04e2438166b6f704d629197a2c6");
            return;
        }
        FileMessage fileMessage = (FileMessage) iMMessage;
        fileMessage.setPath(com.sankuai.xm.base.util.k.f(IMClient.a().b(iMMessage.getMsgType()), com.sankuai.xm.base.util.k.c(fileMessage.getUrl())));
        iMMessage.setFileStatus(5);
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void c(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "493232ac086e5d27ad94a3bfb2217a92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "493232ac086e5d27ad94a3bfb2217a92");
            return;
        }
        FileMessage fileMessage = (FileMessage) mediaMessage;
        super.c((MediaMessage) fileMessage);
        com.sankuai.xm.im.transfer.upload.b.a().a(fileMessage);
        DownloadManager.getInstance().stop(fileMessage.getUrl());
    }
}
