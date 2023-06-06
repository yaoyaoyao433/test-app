package com.sankuai.xm.im.transfer.upload;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.bean.FileInfoBean;
import com.sankuai.xm.file.bean.StatisticEntry;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.file.proxy.g;
import com.sankuai.xm.file.transfer.d;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler;
import com.sankuai.xm.monitor.cat.c;
import com.sankuai.xm.network.c;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b extends com.sankuai.xm.im.transfer.a implements d {
    public static ChangeQuickRedirect a;
    private static b c;
    public com.sankuai.xm.file.transfer.b b;
    private final ConcurrentHashMap<String, Integer> d;
    private ConcurrentHashMap<Integer, List<a>> e;
    private com.sankuai.xm.file.proxy.a f;

    private static int a(int i) {
        switch (i) {
            case 2:
                return 3;
            case 3:
            case 10:
            case 11:
                return 4;
            default:
                return 2;
        }
    }

    public static /* synthetic */ int a(b bVar, int i) {
        return a(i);
    }

    public static /* synthetic */ void a(b bVar, MediaMessage mediaMessage, FileInfoBean fileInfoBean) {
        Object[] objArr = {mediaMessage, fileInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1b57e2db5085e7bdd4431dbce71cd0a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1b57e2db5085e7bdd4431dbce71cd0a9");
        } else if (fileInfoBean == null || mediaMessage == null) {
        } else {
            if (!fileInfoBean.isUnknownSource()) {
                mediaMessage.setName(fileInfoBean.getName());
                mediaMessage.setSize(fileInfoBean.getSize());
                mediaMessage.setToken(fileInfoBean.getToken());
            }
            mediaMessage.setUrl(fileInfoBean.getUrl());
            switch (mediaMessage.getMsgType()) {
                case 3:
                    ((VideoMessage) mediaMessage).setScreenshotUrl(fileInfoBean.getScreenshotUrl());
                    return;
                case 4:
                    ImageMessage imageMessage = (ImageMessage) mediaMessage;
                    imageMessage.setThumbnailUrl(fileInfoBean.getThumbUrl());
                    imageMessage.setNormalUrl(fileInfoBean.getBigUrl());
                    imageMessage.setOriginUrl(fileInfoBean.getUrl());
                    if (fileInfoBean.isUnknownSource()) {
                        return;
                    }
                    imageMessage.setOriginSize((int) fileInfoBean.getSize());
                    return;
                default:
                    return;
            }
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc71d5605175ae99a411b357f6b20a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc71d5605175ae99a411b357f6b20a7");
            return;
        }
        this.d = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.b = a.C1381a.a.c;
        this.f = a.C1381a.a.d;
        this.b.a(this);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45aae61926ca25e3fd195a382d5fd764", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45aae61926ca25e3fd195a382d5fd764");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public final void a(AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback, ImageMessage imageMessage) {
        Object[] objArr = {uploadOperationCallback, imageMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0f994d0636b44c1415722bdfd11f40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0f994d0636b44c1415722bdfd11f40");
            return;
        }
        b(imageMessage);
        boolean isUploadOrigin = imageMessage.isUploadOrigin();
        String path = imageMessage.getPath();
        int a2 = a(imageMessage.getCategory());
        long chatId = imageMessage.getChatId();
        int a3 = this.b.a(path, a2, chatId, true, true, isUploadOrigin, b(path), imageMessage.getFromAppId(), imageMessage.getToAppId(), imageMessage.getChannel());
        a(path, chatId, new a(imageMessage, uploadOperationCallback), a3);
        if (a3 == -1 || a3 >= 0) {
            return;
        }
        uploadOperationCallback.a(imageMessage, 4, "");
    }

    public final void a(AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback, FileMessage fileMessage) {
        Object[] objArr = {uploadOperationCallback, fileMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9caaedec347212d74712ae144b30df3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9caaedec347212d74712ae144b30df3");
        } else {
            a(uploadOperationCallback, fileMessage, false);
        }
    }

    private void a(AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback, FileMessage fileMessage, boolean z) {
        Object[] objArr = {uploadOperationCallback, fileMessage, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084d55fd590fa5d7414cff0da7a4ac5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084d55fd590fa5d7414cff0da7a4ac5b");
            return;
        }
        b(fileMessage);
        String path = fileMessage.getPath();
        int a2 = a(fileMessage.getCategory());
        long chatId = fileMessage.getChatId();
        int a3 = this.b.a(path, a2, chatId, b(path), fileMessage.getFromAppId(), fileMessage.getToAppId(), fileMessage.getChannel());
        a(path, chatId, new a(fileMessage, uploadOperationCallback), a3);
        if (a3 == -1) {
            uploadOperationCallback.a(fileMessage, -1, "");
        } else if (a3 < 0) {
            uploadOperationCallback.a(fileMessage, 4, "");
        }
    }

    public final void a(AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback, AudioMessage audioMessage) {
        Object[] objArr = {uploadOperationCallback, audioMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e14f2a797fc698057ab4c681c78603", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e14f2a797fc698057ab4c681c78603");
            return;
        }
        b(audioMessage);
        String path = audioMessage.getPath();
        int a2 = a(audioMessage.getCategory());
        long chatId = audioMessage.getChatId();
        int a3 = this.b.a(path, a2, chatId, audioMessage.getFromAppId(), audioMessage.getToAppId(), audioMessage.getChannel());
        a(path, chatId, new a(audioMessage, uploadOperationCallback), a3);
        if (a3 == -1 || a3 >= 0) {
            return;
        }
        uploadOperationCallback.a(audioMessage, 4, "");
    }

    public final void a(AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback, VideoMessage videoMessage) {
        Object[] objArr = {uploadOperationCallback, videoMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56c018e179fe2c30841d4e2b231b037", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56c018e179fe2c30841d4e2b231b037");
            return;
        }
        b(videoMessage);
        String path = videoMessage.getPath();
        int a2 = a(videoMessage.getCategory());
        long chatId = videoMessage.getChatId();
        int a3 = this.b.a(path, a2, chatId, true, videoMessage.getScreenshotPath(), (int) videoMessage.getFromAppId(), (int) videoMessage.getToAppId(), videoMessage.getChannel());
        a(path, chatId, new a(videoMessage, uploadOperationCallback), a3);
        if (a3 == -1 || a3 >= 0) {
            return;
        }
        uploadOperationCallback.a(videoMessage, 4, "");
    }

    public final void a(final AbstractMediaMsgHandler.b bVar, final MediaMessage mediaMessage) {
        Object[] objArr = {bVar, mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c639d5f857ccd9a42e42a2e98749517", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c639d5f857ccd9a42e42a2e98749517");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.transfer.upload.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5061f612a9ba5e34f38086b9dbc60107", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5061f612a9ba5e34f38086b9dbc60107");
                        return;
                    }
                    String url = mediaMessage.getUrl();
                    int a2 = b.a(b.this, mediaMessage.getCategory());
                    long chatId = mediaMessage.getChatId();
                    g<FileInfoBean> gVar = new g<>();
                    String str = "";
                    String str2 = "";
                    String str3 = "";
                    switch (mediaMessage.getMsgType()) {
                        case 3:
                            str3 = ((VideoMessage) mediaMessage).getScreenshotUrl();
                            break;
                        case 4:
                            url = ((ImageMessage) mediaMessage).getOriginUrl();
                            str = ((ImageMessage) mediaMessage).getNormalUrl();
                            str2 = ((ImageMessage) mediaMessage).getThumbnailUrl();
                            break;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", url);
                    hashMap.put("bigUrl", str);
                    hashMap.put("screenshotUrl", str3);
                    hashMap.put("thumbUrl", str2);
                    hashMap.put("ownerType", Integer.valueOf(a2));
                    hashMap.put("ownerId", Long.valueOf(chatId));
                    StringBuilder sb = new StringBuilder();
                    sb.append(mediaMessage.getMsgId());
                    hashMap.put(MessageStatisticsEntry.PARAM_MSG_ID, sb.toString());
                    hashMap.put("token", mediaMessage.getToken());
                    hashMap.put(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(mediaMessage.getChannel()));
                    c.a a3 = b.this.f.a(hashMap, a2, gVar);
                    if (a3 == null && gVar.b != null) {
                        b.a(b.this, mediaMessage, gVar.b);
                        bVar.a(mediaMessage, gVar.b);
                        return;
                    }
                    bVar.a(mediaMessage, a3.a(), a3.b());
                }
            }));
        }
    }

    public final void b(final AbstractMediaMsgHandler.b bVar, final MediaMessage mediaMessage) {
        Object[] objArr = {bVar, mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96579ccb07eaedbf33cf4c2349fdef1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96579ccb07eaedbf33cf4c2349fdef1a");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.transfer.upload.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d7a871de58692ecb6b6e4f92f07d66d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d7a871de58692ecb6b6e4f92f07d66d");
                        return;
                    }
                    String originUrl = mediaMessage.getMsgType() == 4 ? ((ImageMessage) mediaMessage).getOriginUrl() : mediaMessage.getUrl();
                    int a2 = b.a(b.this, mediaMessage.getCategory());
                    long chatId = mediaMessage.getChatId();
                    g<FileInfoBean> gVar = new g<>();
                    c.a a3 = b.this.f.a(originUrl, a2, chatId, mediaMessage.getChannel(), gVar);
                    if (a3 == null && gVar.b != null) {
                        b.a(b.this, mediaMessage, gVar.b);
                        bVar.a(mediaMessage, gVar.b);
                        return;
                    }
                    bVar.a(mediaMessage, a3.a(), a3.b());
                }
            }));
        }
    }

    public final void c(final AbstractMediaMsgHandler.b bVar, final MediaMessage mediaMessage) {
        Object[] objArr = {bVar, mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba0a28eb41246f7a0e07c80ba8bebc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba0a28eb41246f7a0e07c80ba8bebc8");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.transfer.upload.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1956f44d11e6a70d8627c6c1d52a1d8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1956f44d11e6a70d8627c6c1d52a1d8");
                        return;
                    }
                    String originUrl = mediaMessage.getMsgType() == 4 ? ((ImageMessage) mediaMessage).getOriginUrl() : mediaMessage.getUrl();
                    int a2 = b.a(b.this, mediaMessage.getCategory());
                    long chatId = mediaMessage.getChatId();
                    String str = "";
                    if (mediaMessage.getMsgType() == 8) {
                        str = ((FileMessage) mediaMessage).getLinkId();
                    } else if (mediaMessage.getMsgType() == 4) {
                        str = ((ImageMessage) mediaMessage).getLinkId();
                    }
                    String str2 = str;
                    g<FileInfoBean> gVar = new g<>();
                    c.a a3 = b.this.f.a(originUrl, str2, a2, chatId, mediaMessage.getChannel(), gVar);
                    if (a3 == null && gVar.b != null) {
                        b.a(b.this, mediaMessage, gVar.b);
                        bVar.a(mediaMessage, gVar.b);
                        return;
                    }
                    bVar.a(mediaMessage, a3.a(), a3.b());
                }
            }));
        }
    }

    private void b(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264da86c4d2b144fb486d87703263fa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264da86c4d2b144fb486d87703263fa1");
            return;
        }
        synchronized (this.d) {
            if (this.d.containsKey(mediaMessage.getMsgUuid()) && this.d.get(mediaMessage.getMsgUuid()) != null) {
                this.d.put(mediaMessage.getMsgUuid(), Integer.valueOf(this.d.get(mediaMessage.getMsgUuid()).intValue() + 1));
            } else {
                this.d.put(mediaMessage.getMsgUuid(), 0);
            }
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onStateChanged(TransferContext transferContext, int i) {
        List<a> list;
        int i2 = 2;
        int i3 = 1;
        Object[] objArr = {transferContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd87bce46e8cc1127208f6a0bb914025", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd87bce46e8cc1127208f6a0bb914025");
            return;
        }
        int taskType = transferContext.getTaskType();
        if (transferContext.getTransferType() == 2) {
            int i4 = 4;
            if ((taskType == 2 || taskType == 3 || taskType == 4 || taskType == 5) && (list = this.e.get(Integer.valueOf(transferContext.getTaskId()))) != null) {
                for (a aVar : list) {
                    AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback = aVar.c;
                    MediaMessage mediaMessage = aVar.b;
                    uploadOperationCallback.a(mediaMessage, i);
                    if (i == 7) {
                        if (taskType == i2) {
                            ImageMessage imageMessage = (ImageMessage) mediaMessage;
                            imageMessage.setNormalUrl(transferContext.getFileInfo().getBigUrl());
                            imageMessage.setOriginUrl(transferContext.getFileInfo().getUrl());
                            imageMessage.setThumbnailUrl(transferContext.getFileInfo().getThumbUrl());
                            imageMessage.setPath(transferContext.getLocalPath());
                            imageMessage.setName(transferContext.getFileInfo().getName());
                            imageMessage.setSize(transferContext.getFileInfo().getSize());
                        } else if (taskType == 3) {
                            FileMessage fileMessage = (FileMessage) mediaMessage;
                            fileMessage.setUrl(transferContext.getFileInfo().getUrl());
                            fileMessage.setPath(transferContext.getLocalPath());
                            fileMessage.setName(transferContext.getFileInfo().getName());
                            fileMessage.setSize(transferContext.getFileInfo().getSize());
                        } else if (taskType == i4) {
                            AudioMessage audioMessage = (AudioMessage) mediaMessage;
                            audioMessage.setUrl(transferContext.getFileInfo().getUrl());
                            audioMessage.setPath(transferContext.getLocalPath());
                            audioMessage.setName(transferContext.getFileInfo().getName());
                            audioMessage.setSize(transferContext.getFileInfo().getSize());
                        } else {
                            VideoMessage videoMessage = (VideoMessage) mediaMessage;
                            videoMessage.setUrl(transferContext.getFileInfo().getUrl());
                            videoMessage.setScreenshotUrl(transferContext.getFileInfo().getScreenshotUrl());
                            videoMessage.setPath(transferContext.getLocalPath());
                            videoMessage.setName(transferContext.getFileInfo().getName());
                            videoMessage.setSize(transferContext.getFileInfo().getSize());
                        }
                        mediaMessage.setToken(transferContext.getFileInfo().getToken());
                        uploadOperationCallback.a(mediaMessage, transferContext.getFileInfo());
                        a(transferContext, mediaMessage.getMsgUuid());
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = mediaMessage;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ed5dfb2a883aa6d23efa3e3151fc2a4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ed5dfb2a883aa6d23efa3e3151fc2a4");
                        } else {
                            synchronized (this.d) {
                                this.d.remove(mediaMessage.getMsgUuid());
                            }
                        }
                    } else if (i == 5) {
                        uploadOperationCallback.a(mediaMessage, 0, "upload stopped.");
                    }
                    i2 = 2;
                    i3 = 1;
                    i4 = 4;
                }
                if (i == 7 || i == 6 || i == 5) {
                    this.e.remove(Integer.valueOf(transferContext.getTaskId()));
                }
            }
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onProgress(TransferContext transferContext, double d, double d2) {
        List<a> list;
        Object[] objArr = {transferContext, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e21ddfc4429efe87479bd8162474e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e21ddfc4429efe87479bd8162474e4");
            return;
        }
        int taskType = transferContext.getTaskType();
        if (transferContext.getTransferType() == 2) {
            if ((taskType == 2 || taskType == 3 || taskType == 4 || taskType == 5) && (list = this.e.get(Integer.valueOf(transferContext.getTaskId()))) != null) {
                for (a aVar : list) {
                    aVar.c.onProgress(aVar.b, d, d2);
                }
            }
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onError(TransferContext transferContext, int i, String str) {
        List<a> list;
        Object[] objArr = {transferContext, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c6082117f9619a2d444ce493cde775", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c6082117f9619a2d444ce493cde775");
            return;
        }
        int taskType = transferContext.getTaskType();
        if (transferContext.getTransferType() == 2) {
            if ((taskType == 2 || taskType == 3 || taskType == 4 || taskType == 5) && (list = this.e.get(Integer.valueOf(transferContext.getTaskId()))) != null) {
                for (a aVar : list) {
                    AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback = aVar.c;
                    MediaMessage mediaMessage = aVar.b;
                    mediaMessage.setErrorCode(i);
                    uploadOperationCallback.a(mediaMessage, i, str);
                    a(transferContext, mediaMessage.getMsgUuid());
                }
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2288d8685e43034291e5e549ac433f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2288d8685e43034291e5e549ac433f4");
        } else {
            this.b.a(str);
        }
    }

    public final void a(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c349924ee0aa11b193a02a8fd750ea72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c349924ee0aa11b193a02a8fd750ea72");
        } else {
            a(this.b.a(mediaMessage.getPath(), mediaMessage.getChatId()));
        }
    }

    private void a(String str, long j, a aVar, int i) {
        Object[] objArr = {str, new Long(j), aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8856ab49a388cef8568be7b7f0a6f57c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8856ab49a388cef8568be7b7f0a6f57c");
        } else {
            a(i, aVar);
        }
    }

    private void a(int i, a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a215256071f95cb87c70e2fc77271cc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a215256071f95cb87c70e2fc77271cc8");
            return;
        }
        List<a> list = this.e.get(Integer.valueOf(i));
        if (list != null) {
            if (list.contains(aVar)) {
                return;
            }
            list.add(aVar);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(aVar);
        this.e.put(Integer.valueOf(i), copyOnWriteArrayList);
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8433a80bf84cab8307b3098dd93618", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8433a80bf84cab8307b3098dd93618");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String n = k.n(str);
            return (TextUtils.isEmpty(n) || !n.contains(CommonConstant.Symbol.DOT)) ? "" : n.substring(n.lastIndexOf(46));
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e, "UploadManager::getSuffix", new Object[0]);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:25:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.xm.file.bean.TransferContext r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.transfer.upload.b.a(com.sankuai.xm.file.bean.TransferContext, java.lang.String):void");
    }

    private void a(StatisticEntry statisticEntry) {
        Object[] objArr = {statisticEntry};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0788a3ea75e9d250c27282da22a2d334", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0788a3ea75e9d250c27282da22a2d334");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(statisticEntry.bizCode));
        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE, Integer.valueOf(statisticEntry.httpCode));
        hashMap.put("url", StatisticEntry.UPLOAD_URL);
        hashMap.put("time", Long.valueOf(statisticEntry.taskEndTime > statisticEntry.taskStartTime ? statisticEntry.taskEndTime - statisticEntry.taskStartTime : 0L));
        if (!TextUtils.isEmpty(statisticEntry.msg)) {
            hashMap.put("extraData", statisticEntry.msg);
        }
        c.a.a.a(hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        MediaMessage b;
        AbstractMediaMsgHandler.UploadOperationCallback c;

        public a(MediaMessage mediaMessage, AbstractMediaMsgHandler.UploadOperationCallback uploadOperationCallback) {
            Object[] objArr = {mediaMessage, uploadOperationCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5899b743d60a3ebeb58035171d41f03b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5899b743d60a3ebeb58035171d41f03b");
                return;
            }
            this.b = mediaMessage;
            this.c = uploadOperationCallback;
        }
    }
}
