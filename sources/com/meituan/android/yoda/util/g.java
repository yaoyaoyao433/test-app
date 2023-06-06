package com.meituan.android.yoda.util;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: ProGuard */
@RequiresApi(api = 18)
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    public byte[] c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public MediaCodec h;
    public s i;
    private WeakReference<Context> m;
    private int n;
    private static int j = 10;
    public static ArrayBlockingQueue<byte[]> b = new ArrayBlockingQueue<>(j);
    private static String k = "temp.h264";
    private static String l = "temp.mp4";

    public g(@NonNull WeakReference<Context> weakReference, int i, int i2, int i3, int i4) {
        Object[] objArr = {weakReference, 1280, 720, 45, 8500000};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de4fef1c016ad0a1378247463a3f95b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de4fef1c016ad0a1378247463a3f95b");
            return;
        }
        this.d = false;
        this.n = 12000;
        this.m = weakReference;
        this.e = 1280;
        this.f = 720;
        this.g = 45;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", 720, 1280);
        createVideoFormat.setInteger("color-format", a());
        createVideoFormat.setInteger("bitrate", 4608000);
        createVideoFormat.setInteger("frame-rate", 45);
        createVideoFormat.setInteger("i-frame-interval", 1);
        try {
            this.h = MediaCodec.createEncoderByType("video/avc");
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.h.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.h.start();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f119d002f9b72938b49800cf392f8bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f119d002f9b72938b49800cf392f8bd");
            return;
        }
        try {
            if (this.m == null || this.m.get() == null) {
                return;
            }
            File a2 = com.meituan.android.cipstorage.q.a(this.m.get(), "yodaVerify/facedetection", (String) null);
            if (!a2.exists()) {
                a2.mkdirs();
            }
            File file = new File(a2.getParent(), k);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8b23d6f7e4d023b1e616be1ecec836", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8b23d6f7e4d023b1e616be1ecec836")).intValue();
        }
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i = 0; i < codecCount && mediaCodecInfo == null; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                boolean z = false;
                for (int i2 = 0; i2 < supportedTypes.length && !z; i2++) {
                    if (supportedTypes[i2].equals("video/avc")) {
                        z = true;
                    }
                }
                if (z) {
                    mediaCodecInfo = codecInfoAt;
                }
            }
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        for (int i3 = 0; i3 < capabilitiesForType.colorFormats.length; i3++) {
            new StringBuilder("MediaCodecInfo COLOR FORMAT :").append(capabilitiesForType.colorFormats[i3]);
            if (capabilitiesForType.colorFormats[i3] == 21 || capabilitiesForType.colorFormats[i3] == 19) {
                return capabilitiesForType.colorFormats[i3];
            }
        }
        return 21;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c369aa02cec180561d77bb86aaa1995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c369aa02cec180561d77bb86aaa1995");
            return;
        }
        this.i = s.a();
        s sVar = this.i;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "f96de2a6abc284a315750b1f98d12185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "f96de2a6abc284a315750b1f98d12185");
        } else if (sVar.c == null) {
            synchronized (s.class) {
                if (sVar.c == null) {
                    try {
                        sVar.c = new MediaMuxer(str, 0);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        com.sankuai.android.jarvis.c.a("yoda_voice_record", h.a(this)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.yoda.util.g r29) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.util.g.a(com.meituan.android.yoda.util.g):void");
    }

    private void a(byte[] bArr, byte[] bArr2, int i, int i2) {
        Object[] objArr = {bArr, bArr2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01f226744b504e17de37c631c399332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01f226744b504e17de37c631c399332");
        } else if (bArr != null) {
            int i3 = i * i2;
            System.arraycopy(bArr, 0, bArr2, 0, i3);
            for (int i4 = 0; i4 < i3 / 2; i4 += 2) {
                int i5 = i3 + i4;
                int i6 = i5 - 1;
                bArr2[i6] = bArr[i5];
                bArr2[i5] = bArr[i6];
            }
        }
    }
}
