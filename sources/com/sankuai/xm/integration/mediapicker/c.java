package com.sankuai.xm.integration.mediapicker;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.LruCache;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.util.ab;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.o;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.api.e;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.service.a implements IMClient.c, e {
    public static ChangeQuickRedirect a;
    private static final LruCache<String, Map<String, String>> b = new LruCache<>(2);

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea850364531f09e597a966bc4c2cca96", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea850364531f09e597a966bc4c2cca96")).intValue();
        }
        IMClient a2 = IMClient.a();
        Object[] objArr2 = {(short) -1, this};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "73ca275707528941b2fd75c3d336ec0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "73ca275707528941b2fd75c3d336ec0c");
        } else if (!a2.A()) {
            com.sankuai.xm.im.transfer.upload.a a3 = com.sankuai.xm.im.transfer.upload.a.a();
            Object[] objArr3 = {(short) -1, this};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.transfer.upload.a.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "a0cd6ae289c9622e8c280980c708bbf1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "a0cd6ae289c9622e8c280980c708bbf1");
            } else {
                synchronized (a3.b) {
                    if (!a3.c.containsKey((short) -1)) {
                        a3.c.put((short) -1, this);
                    }
                }
            }
        }
        return super.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.String] */
    @Override // com.sankuai.xm.im.message.api.e
    @NonNull
    public final Map<String, String> a(String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        String extractMetadata;
        String extractMetadata2;
        String extractMetadata3;
        String extractMetadata4;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27ec480b86380956c396b6b32d871ac", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27ec480b86380956c396b6b32d871ac");
        }
        HashMap hashMap = new HashMap();
        if (ac.a(str) || !o.o(str)) {
            return hashMap;
        }
        Map<String, String> map = b.get(str);
        if (map != null) {
            com.sankuai.xm.log.c.b("VideoServiceDPImpl", "getVideoInfo: cache hit for %s, %s", str, map);
            return map;
        }
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            a(mediaMetadataRetriever, str);
            extractMetadata = mediaMetadataRetriever.extractMetadata(19);
            extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
        } catch (Exception e2) {
            e = e2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            com.sankuai.xm.log.c.a("VideoServiceDPImpl", e, "getVideoInfo: " + e.getMessage(), new Object[0]);
            mediaMetadataRetriever2 = mediaMetadataRetriever2;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
                mediaMetadataRetriever2 = mediaMetadataRetriever2;
            }
            return hashMap;
        } catch (Throwable th2) {
            th = th2;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
        if (!"90".equals(extractMetadata4) && !"270".equals(extractMetadata4)) {
            hashMap.put("height", extractMetadata);
            hashMap.put("width", extractMetadata2);
            hashMap.put("duration", extractMetadata3);
            hashMap.put(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, extractMetadata4);
            b.put(str, hashMap);
            ?? r2 = "getVideoInfo: %s";
            com.sankuai.xm.log.c.b("VideoServiceDPImpl", "getVideoInfo: %s", hashMap);
            mediaMetadataRetriever.release();
            mediaMetadataRetriever2 = r2;
            return hashMap;
        }
        hashMap.put("height", extractMetadata2);
        hashMap.put("width", extractMetadata);
        hashMap.put("duration", extractMetadata3);
        hashMap.put(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, extractMetadata4);
        b.put(str, hashMap);
        ?? r22 = "getVideoInfo: %s";
        com.sankuai.xm.log.c.b("VideoServiceDPImpl", "getVideoInfo: %s", hashMap);
        mediaMetadataRetriever.release();
        mediaMetadataRetriever2 = r22;
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0102 A[Catch: Throwable -> 0x0121, TryCatch #1 {Throwable -> 0x0121, blocks: (B:8:0x0031, B:10:0x0037, B:12:0x0066, B:15:0x0075, B:17:0x00ba, B:19:0x00c8, B:25:0x00ef, B:27:0x0102, B:18:0x00c3, B:20:0x00cb, B:22:0x00e1, B:24:0x00ed, B:23:0x00e8, B:29:0x0110), top: B:45:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b(final java.lang.String r23, final java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.integration.mediapicker.c.b(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    @Override // com.sankuai.xm.im.message.api.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.integration.mediapicker.c.a
            java.lang.String r10 = "bdf5938a643faff62d107dcd375ca664"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1e:
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            a(r1, r12)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            android.graphics.Bitmap r12 = r1.getFrameAtTime()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            if (r12 == 0) goto L55
            java.io.OutputStream r2 = com.sankuai.xm.base.util.o.r(r13)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            com.sankuai.xm.integration.crypto.CryptoProxy r0 = com.sankuai.xm.integration.crypto.CryptoProxy.c()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r13 = r0.c(r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r13 == 0) goto L45
            com.sankuai.xm.integration.crypto.CryptoProxy r13 = com.sankuai.xm.integration.crypto.CryptoProxy.c()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.io.OutputStream r13 = r13.a(r2, r8)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r0 = r13
            goto L46
        L45:
            r0 = r2
        L46:
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r2 = 100
            r12.compress(r13, r2, r0)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r0.flush()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            goto L55
        L51:
            r12 = move-exception
            goto L77
        L53:
            r12 = move-exception
            goto L60
        L55:
            r1.release()
            com.sankuai.xm.base.util.m.a(r0)
            return
        L5c:
            r12 = move-exception
            goto L78
        L5e:
            r12 = move-exception
            r2 = r0
        L60:
            r0 = r1
            goto L67
        L62:
            r12 = move-exception
            r1 = r0
            goto L78
        L65:
            r12 = move-exception
            r2 = r0
        L67:
            java.lang.String r13 = "VideoServiceDPImpl"
            com.sankuai.xm.log.c.a(r13, r12)     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L71
            r0.release()
        L71:
            com.sankuai.xm.base.util.m.a(r2)
            return
        L75:
            r12 = move-exception
            r1 = r0
        L77:
            r0 = r2
        L78:
            if (r1 == 0) goto L7d
            r1.release()
        L7d:
            com.sankuai.xm.base.util.m.a(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.integration.mediapicker.c.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.sankuai.xm.im.IMClient.c
    public final int a(MediaMessage mediaMessage) {
        Object[] objArr = {mediaMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826a6b8dff62bc35ffdaa5df10d20f27", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826a6b8dff62bc35ffdaa5df10d20f27")).intValue();
        }
        if (ac.a(mediaMessage.getPath())) {
            com.sankuai.xm.log.c.d("VideoServiceDPImpl", "startCompress, path is null, uuid " + mediaMessage.getMsgUuid(), new Object[0]);
            return 11011;
        } else if (mediaMessage.getPath() != null && mediaMessage.getPath().startsWith(IMClient.a().b(mediaMessage.getMsgType()))) {
            com.sankuai.xm.log.c.b("VideoServiceDPImpl", "startCompress, not need to compress, path = " + mediaMessage.getPath(), new Object[0]);
            return 0;
        } else {
            boolean a2 = CryptoProxy.c().a();
            if (a2 && CryptoProxy.c().d(mediaMessage.getPath())) {
                com.sankuai.xm.log.c.c("VideoServiceDPImpl", "startCompress, crypto file not need to compress, path = " + mediaMessage.getPath(), new Object[0]);
                return 0;
            }
            String str = IMClient.a().b(3) + mediaMessage.getMsgUuid() + ".mp4";
            String a3 = a2 ? CryptoProxy.c().a(str) : str;
            com.sankuai.xm.log.c.b("VideoServiceDPImpl", "compressVideo, path = " + mediaMessage.getPath() + ", outPath = " + a3, new Object[0]);
            int b2 = b(mediaMessage.getPath(), a3);
            Map<String, String> map = null;
            if (b2 == 0) {
                map = a(a3);
                if (a2 && !com.sankuai.xm.file.util.c.a(a3, str, true)) {
                    b2 = 10018;
                }
            }
            if (b2 == 0) {
                mediaMessage.setPath(str);
                mediaMessage.setSize(k.p(str));
                if (mediaMessage instanceof VideoMessage) {
                    VideoMessage videoMessage = (VideoMessage) mediaMessage;
                    videoMessage.setHeight((short) ab.a(map.get("height"), videoMessage.getHeight()));
                    videoMessage.setWidth((short) ab.a(map.get("width"), videoMessage.getWidth()));
                }
            }
            com.sankuai.xm.log.c.b("VideoServiceDPImpl", "compress, path = " + mediaMessage.getPath() + ", code = " + b2, new Object[0]);
            return b2;
        }
    }

    private static void a(MediaMetadataRetriever mediaMetadataRetriever, String str) throws IllegalArgumentException, SecurityException {
        Object[] objArr = {mediaMetadataRetriever, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7ce1dc932181be7bdd4be0f91235630", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7ce1dc932181be7bdd4be0f91235630");
        } else if (str.startsWith("content")) {
            mediaMetadataRetriever.setDataSource(f.m().g(), Uri.parse(str));
        } else {
            mediaMetadataRetriever.setDataSource(str);
        }
    }
}
