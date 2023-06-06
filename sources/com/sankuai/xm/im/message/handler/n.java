package com.sankuai.xm.im.message.handler;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.util.ExifInterface;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.transfer.download.DownloadManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n extends AbstractMediaMsgHandler {
    public static ChangeQuickRedirect d;

    public n(com.sankuai.xm.im.message.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a09639473421c7c69913520b227e34c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a09639473421c7c69913520b227e34c");
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler, com.sankuai.xm.im.message.handler.a, com.sankuai.xm.im.message.handler.m
    public final int a(IMMessage iMMessage) {
        BitmapFactory.Options options;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cbd62a17f5760a8100ed5a0f55184a9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cbd62a17f5760a8100ed5a0f55184a9")).intValue();
        }
        ImageMessage imageMessage = (ImageMessage) iMMessage;
        int a = super.a(iMMessage);
        if (a != 0) {
            com.sankuai.xm.im.utils.a.c("ImageMsgHandler::prepare, msg uuid: %s, result: %s", iMMessage.getMsgUuid(), Integer.valueOf(a));
            return a;
        }
        if (b((MediaMessage) imageMessage)) {
            imageMessage.setOperationType(4);
        }
        if (imageMessage.getOperationType() == 4) {
            String path = imageMessage.getPath();
            com.sankuai.xm.im.utils.a.b("ImageMsgHandler::prepare, msg uuid: %s, path: %s", iMMessage.getMsgUuid(), path);
            if (TextUtils.isEmpty(path)) {
                com.sankuai.xm.im.utils.a.c("ImageMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_PATH_IS_NULL", iMMessage.getMsgUuid());
                return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_MRN_STOP_EVENT;
            } else if (!com.sankuai.xm.base.util.k.o(path)) {
                com.sankuai.xm.im.utils.a.c("ImageMsgHandler::prepare, msg uuid: %s, ERR_LOCAL_FILE_NOT_EXISTS", iMMessage.getMsgUuid());
                return 10003;
            } else {
                long p = com.sankuai.xm.base.util.k.p(path);
                if (p > 31457280) {
                    com.sankuai.xm.im.utils.a.c("ImageMsgHandler::prepare, msg uuid: %s, ERR_FILE_TOO_LARGE", iMMessage.getMsgUuid());
                    return 10005;
                }
                if (TextUtils.isEmpty(imageMessage.getType())) {
                    String b = com.sankuai.xm.file.util.c.b(imageMessage.getPath());
                    if ("heic".equalsIgnoreCase(b)) {
                        imageMessage.setType(CommonConstant.File.JPG);
                    } else {
                        imageMessage.setType(b);
                    }
                }
                if (!com.sankuai.xm.base.util.n.g(imageMessage.getType())) {
                    com.sankuai.xm.im.utils.a.c("ImageMsgHandler::prepare, msg uuid: %s, ERR_FILE_FORMAT type: %s", iMMessage.getMsgUuid(), imageMessage.getType());
                    return 10006;
                }
                imageMessage.setOriginSize((int) p);
                imageMessage.setUploadOrigin(CommonConstant.File.GIF.equalsIgnoreCase(imageMessage.getType()) || imageMessage.isUploadOrigin());
                String type = imageMessage.getType();
                Object[] objArr2 = {imageMessage, type};
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "568cc666ae59e0189e9e9ff0d6f6a208", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "568cc666ae59e0189e9e9ff0d6f6a208");
                } else {
                    if (TextUtils.equals(type, CommonConstant.File.GIF)) {
                        options = com.sankuai.xm.base.util.n.h(imageMessage.getPath());
                    } else {
                        BitmapFactory.Options a2 = com.sankuai.xm.base.util.n.a(imageMessage.getPath(), 200, 200);
                        try {
                            if (TextUtils.equals(type, CommonConstant.File.JPG)) {
                                imageMessage.setOrientation(new ExifInterface(imageMessage.getPath()).a("Orientation", 0));
                            }
                        } catch (Exception e) {
                            com.sankuai.xm.im.utils.a.a(e, "ImageMsgHandler.fillThumbnailSizeByPath", new Object[0]);
                        }
                        options = a2;
                    }
                    if (options != null) {
                        imageMessage.setThumbnailWidth(options.outWidth);
                        imageMessage.setThumbnailHeight(options.outHeight);
                    }
                }
            }
        }
        return (com.sankuai.xm.base.proto.protobase.e.d(imageMessage.getThumbnailPath()) || com.sankuai.xm.base.proto.protobase.e.d(imageMessage.getType())) ? 10024 : 0;
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    @TraceStatus
    public final int a(MediaMessage mediaMessage) {
        boolean z;
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3437badd15d5d5131375f349e0bada", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3437badd15d5d5131375f349e0bada")).intValue();
        }
        ImageMessage imageMessage = (ImageMessage) mediaMessage;
        if (!b((MediaMessage) imageMessage)) {
            com.sankuai.xm.base.trace.j.a(new Integer(0), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
            return 0;
        }
        if (imageMessage.getOperationType() == 4) {
            if (!com.sankuai.xm.base.util.k.o(imageMessage.getPath())) {
                com.sankuai.xm.im.utils.a.c("ImageMsgHandler::createUploadFile, msg uuid: %s, ERR_LOCAL_FILE_NOT_EXISTS", mediaMessage.getMsgUuid());
                com.sankuai.xm.base.trace.j.a(new Integer(10003), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                return 10003;
            }
            String b = TextUtils.isEmpty(imageMessage.getType()) ? com.sankuai.xm.file.util.c.b(imageMessage.getPath()) : imageMessage.getType();
            if (!com.sankuai.xm.base.util.n.g(b)) {
                com.sankuai.xm.im.utils.a.c("ImageMsgHandler::createUploadFile, msg uuid: %s, ERR_FILE_FORMAT type: %s", mediaMessage.getMsgUuid(), b);
                com.sankuai.xm.base.trace.j.a(new Integer(10006), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                return 10006;
            }
            String path = imageMessage.getPath();
            String msgUuid = mediaMessage.getMsgUuid();
            Object[] objArr2 = {path, msgUuid};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cef33fb387ceea0e2414fe15daeed986", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cef33fb387ceea0e2414fe15daeed986")).booleanValue();
            } else {
                z = !TextUtils.isEmpty(path) && !TextUtils.isEmpty(msgUuid) && com.sankuai.xm.base.util.k.n(path).contains(msgUuid) && com.sankuai.xm.base.util.k.m(path).contains(IMClient.a().b(4));
            }
            if (z) {
                com.sankuai.xm.base.trace.j.a(new Integer(0), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                return 0;
            }
            String a = a(b, mediaMessage.getMsgUuid());
            if (TextUtils.isEmpty(a)) {
                com.sankuai.xm.im.utils.a.c("ImageMsgHandler::createUploadFile, msg uuid: %s, ERR_UNKNOW", mediaMessage.getMsgUuid());
                com.sankuai.xm.base.trace.j.a(new Integer(10100), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                return 10100;
            } else if (!a(imageMessage, a, b)) {
                com.sankuai.xm.im.utils.a.c("ImageMsgHandler::createUploadFile, msg uuid: %s, ERR_CACHE_FILE_CREATE", mediaMessage.getMsgUuid());
                com.sankuai.xm.base.trace.j.a(new Integer(10018), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                return 10018;
            } else {
                long a2 = com.sankuai.xm.file.util.c.a(a);
                if (a2 >= 0) {
                    imageMessage.setOriginSize((int) a2);
                }
                imageMessage.setPath(a);
            }
        }
        com.sankuai.xm.base.trace.j.a(new Integer(0), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
        return 0;
    }

    private String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49dc36c6999f5c532cd54b75bc5bc95", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49dc36c6999f5c532cd54b75bc5bc95");
        }
        if (str == null || str2 == null) {
            return "";
        }
        if ("heic".equalsIgnoreCase(str)) {
            str = CommonConstant.File.JPG;
        }
        return IMClient.a().b(4) + com.sankuai.xm.base.util.n.a(str2) + CommonConstant.Symbol.DOT + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
        if (com.sankuai.xm.integration.crypto.CryptoProxy.c().a(r17.getPath(), r18, 0) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0181, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
        if (r6.isRecycled() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0196, code lost:
        r6.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c4, code lost:
        if (r6.isRecycled() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.sankuai.xm.im.message.bean.ImageMessage r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.handler.n.a(com.sankuai.xm.im.message.bean.ImageMessage, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6768265d0f42d8e0f18dc028fd8255", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6768265d0f42d8e0f18dc028fd8255");
            return;
        }
        ImageMessage imageMessage = (ImageMessage) iMMessage;
        if (TextUtils.isEmpty(imageMessage.getThumbnailUrl())) {
            com.sankuai.xm.im.utils.a.c("ImageMsgHandler::handleDownload => thumbUrl path is null", new Object[0]);
            return;
        }
        String a = a(imageMessage);
        imageMessage.setThumbnailPath(a);
        com.sankuai.xm.im.utils.a.b("ImageMsgHandler::handleDownload => thumbnail path is " + a, new Object[0]);
        int b = com.sankuai.xm.base.util.n.b(imageMessage.getThumbnailUrl());
        int c = com.sankuai.xm.base.util.n.c(imageMessage.getThumbnailUrl());
        imageMessage.setThumbnailWidth(b);
        imageMessage.setThumbnailHeight(c);
        imageMessage.setOrientation(com.sankuai.xm.base.util.n.d(imageMessage.getThumbnailUrl()));
        if (c(iMMessage)) {
            a(imageMessage, imageMessage.getThumbnailUrl(), a, 2);
        }
    }

    public static String a(ImageMessage imageMessage) {
        Object[] objArr = {imageMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33e90d793c5397db405541c1389852ad", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33e90d793c5397db405541c1389852ad");
        }
        String s = IMClient.a().s();
        String thumbnailUrl = imageMessage.getThumbnailUrl();
        String thumbnailPath = imageMessage.getThumbnailPath();
        return ((TextUtils.isEmpty(thumbnailPath) || !thumbnailPath.startsWith(s)) && !TextUtils.isEmpty(thumbnailUrl)) ? com.sankuai.xm.base.util.k.f(s, com.sankuai.xm.base.util.k.c(thumbnailUrl)) : thumbnailPath;
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final boolean b(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5be3fc73d3b32b430c5f5d3953c9cf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5be3fc73d3b32b430c5f5d3953c9cf")).booleanValue();
        }
        switch (mediaMessage.getOperationType()) {
            case 2:
            case 3:
                return false;
            case 4:
                return true;
            default:
                ImageMessage imageMessage = (ImageMessage) mediaMessage;
                return TextUtils.isEmpty(imageMessage.getThumbnailUrl()) || TextUtils.isEmpty(imageMessage.getNormalUrl());
        }
    }

    @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler
    public final void c(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b32954c282c3f02206c30521cf302c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b32954c282c3f02206c30521cf302c");
            return;
        }
        ImageMessage imageMessage = (ImageMessage) mediaMessage;
        super.c((MediaMessage) imageMessage);
        com.sankuai.xm.im.transfer.upload.b.a().a(imageMessage);
        com.sankuai.xm.base.util.k.e(a(com.sankuai.xm.file.util.c.b(imageMessage.getPath()), mediaMessage.getMsgUuid()));
        DownloadManager.getInstance().stop(imageMessage.getThumbnailUrl());
        com.sankuai.xm.base.util.k.e(com.sankuai.xm.base.util.k.f(IMClient.a().s(), com.sankuai.xm.base.util.k.c(imageMessage.getThumbnailUrl())));
    }
}
