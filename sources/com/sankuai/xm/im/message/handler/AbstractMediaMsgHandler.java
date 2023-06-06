package com.sankuai.xm.im.message.handler;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.file.bean.FileInfoBean;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.transfer.download.DownloadManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractMediaMsgHandler extends com.sankuai.xm.im.message.handler.a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface UploadOperationCallback extends b {
        void a(MediaMessage mediaMessage, int i);

        @Keep
        void onProgress(MediaMessage mediaMessage, double d, double d2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(MediaMessage mediaMessage, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(MediaMessage mediaMessage, int i, String str);

        void a(MediaMessage mediaMessage, FileInfoBean fileInfoBean);
    }

    public int a(MediaMessage mediaMessage) {
        return 0;
    }

    public abstract void b(IMMessage iMMessage);

    public void c(MediaMessage mediaMessage) {
    }

    public AbstractMediaMsgHandler(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ebfc72972431fe340e2e448bba8be71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ebfc72972431fe340e2e448bba8be71");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public int a(IMMessage iMMessage) {
        boolean e;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e510bd5509cb98c54bcd44307c377d11", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e510bd5509cb98c54bcd44307c377d11")).intValue();
        }
        if (iMMessage instanceof MediaMessage) {
            MediaMessage mediaMessage = (MediaMessage) iMMessage;
            if (b(mediaMessage)) {
                com.sankuai.xm.im.transfer.upload.b a2 = com.sankuai.xm.im.transfer.upload.b.a();
                String path = mediaMessage.getPath();
                long chatId = mediaMessage.getChatId();
                Object[] objArr2 = {path, new Long(chatId)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.transfer.upload.b.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5cb3463f43cb559813215cfb0267c6d2", 6917529027641081856L)) {
                    e = ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5cb3463f43cb559813215cfb0267c6d2")).booleanValue();
                } else {
                    e = TextUtils.isEmpty(path) ? false : a2.b.e(a2.b.a(path, chatId));
                }
                if (e) {
                    return 10021;
                }
            }
            int a3 = super.a((IMMessage) mediaMessage);
            if (a3 != 0) {
                return a3;
            }
            if (com.sankuai.xm.base.proto.protobase.e.d(mediaMessage.getPath()) || com.sankuai.xm.base.proto.protobase.e.d(mediaMessage.getUrl()) || com.sankuai.xm.base.proto.protobase.e.d(mediaMessage.getName()) || com.sankuai.xm.base.proto.protobase.e.d(mediaMessage.getToken())) {
                return 10024;
            }
            mediaMessage.setFileStatus(0);
            return a3;
        }
        return 10100;
    }

    public final void a(MediaMessage mediaMessage, b bVar) {
        Object[] objArr = {mediaMessage, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0110522dcfe0ea5d16fbb8a642189505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0110522dcfe0ea5d16fbb8a642189505");
        } else if (mediaMessage.getOperationType() == 4) {
            UploadOperationCallback uploadOperationCallback = (UploadOperationCallback) bVar;
            if (mediaMessage instanceof ImageMessage) {
                com.sankuai.xm.im.transfer.upload.b.a().a(uploadOperationCallback, (ImageMessage) mediaMessage);
            } else if (mediaMessage instanceof FileMessage) {
                com.sankuai.xm.im.transfer.upload.b.a().a(uploadOperationCallback, (FileMessage) mediaMessage);
            } else if (mediaMessage instanceof AudioMessage) {
                com.sankuai.xm.im.transfer.upload.b.a().a(uploadOperationCallback, (AudioMessage) mediaMessage);
            } else if (mediaMessage instanceof VideoMessage) {
                com.sankuai.xm.im.transfer.upload.b.a().a(uploadOperationCallback, (VideoMessage) mediaMessage);
            }
        } else if (mediaMessage.getOperationType() == 1) {
            com.sankuai.xm.im.transfer.upload.b.a().a(bVar, mediaMessage);
        } else if (mediaMessage.getOperationType() == 2) {
            com.sankuai.xm.im.transfer.upload.b.a().b(bVar, mediaMessage);
        } else if (mediaMessage.getOperationType() == 3) {
            com.sankuai.xm.im.transfer.upload.b.a().c(bVar, mediaMessage);
        }
    }

    public final void a(MediaMessage mediaMessage, String str, String str2, int i) {
        Object[] objArr = {mediaMessage, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a1053c5d383cecbf6d2aec5dcdfa13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a1053c5d383cecbf6d2aec5dcdfa13");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.sankuai.xm.im.utils.a.d("AbstractMediaMsgHandler::startDownload url or path is empty, path:%s, url:%s, msg: %s", str2, str, mediaMessage.keyParamToString());
        } else if (!mediaMessage.containsUrl(str)) {
            com.sankuai.xm.im.utils.a.d("AbstractMediaMsgHandler::startDownload invalid url:%s, msg: %s", str, mediaMessage.keyParamToString());
        } else if (com.sankuai.xm.base.util.k.o(str2)) {
            mediaMessage.setFileStatus(8);
        } else {
            mediaMessage.setFileStatus(5);
            DownloadManager.getInstance().addDownload(new com.sankuai.xm.im.transfer.download.d(mediaMessage, str, str2, 0, i, true, mediaMessage.getToken()));
        }
    }

    public final boolean c(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f47f12d61ca12f42af2af1e6c7ab789", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f47f12d61ca12f42af2af1e6c7ab789")).booleanValue() : DownloadManager.getInstance().isAutoDownload(iMMessage.getMsgType());
    }

    public boolean b(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42990b9d17f1ff01528819e0b5cc54c2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42990b9d17f1ff01528819e0b5cc54c2")).booleanValue();
        }
        if (mediaMessage.getOperationType() == 4) {
            return true;
        }
        return TextUtils.isEmpty(mediaMessage.getUrl());
    }
}
