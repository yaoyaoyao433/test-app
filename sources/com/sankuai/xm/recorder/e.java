package com.sankuai.xm.recorder;

import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Pair<Integer, Integer> a(String str) {
        int i;
        int i2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af2affb0506dec1ac17e5ea97ee6f95e", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af2affb0506dec1ac17e5ea97ee6f95e");
        }
        if (TextUtils.isEmpty(str) || !k.o(str)) {
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
        } catch (Exception e) {
            b.a(e, "getVideoSize", new Object[0]);
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        b.a("METADATA_KEY_VIDEO_WIDTH: %s", extractMetadata);
        if (TextUtils.isEmpty(extractMetadata)) {
            return null;
        }
        try {
            i = Integer.parseInt(extractMetadata);
        } catch (NumberFormatException e2) {
            b.a(e2, "getVideoSize", new Object[0]);
            i = 0;
        }
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        b.a("METADATA_KEY_VIDEO_HEIGHT: %s", extractMetadata2);
        if (TextUtils.isEmpty(extractMetadata2)) {
            return null;
        }
        try {
            i2 = Integer.parseInt(extractMetadata2);
        } catch (NumberFormatException e3) {
            b.a(e3, "getVideoSize", new Object[0]);
            i2 = 0;
        }
        mediaMetadataRetriever.release();
        return Pair.create(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e128bf7f2e9ee86e9fa5ae3ad92eb728", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e128bf7f2e9ee86e9fa5ae3ad92eb728")).intValue();
        }
        if (TextUtils.isEmpty(str) || !k.o(str)) {
            return -1;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            b.a("METADATA_KEY_DURATION: %s", extractMetadata);
            mediaMetadataRetriever.release();
            if (TextUtils.isEmpty(extractMetadata)) {
                return -1;
            }
            try {
                return Integer.parseInt(extractMetadata);
            } catch (NumberFormatException e) {
                b.a(e, "getVideoDuration", new Object[0]);
                return -1;
            }
        } catch (Exception e2) {
            b.a(e2, "getVideoDuration", new Object[0]);
            return -1;
        }
    }

    public static Camera.Size a(List<Camera.Size> list, List<Camera.Size> list2, int i, int i2) {
        Object[] objArr = {list, list2, 448, Integer.valueOf((int) TXEAudioDef.TXE_OPUS_SAMPLE_NUM)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Camera.Size size = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c23c0542b07764995d19abb24806c84", 6917529027641081856L)) {
            return (Camera.Size) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c23c0542b07764995d19abb24806c84");
        }
        if (list == null) {
            list = list2;
        }
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((size2.width / size2.height) - 0.4666666666666667d) <= 0.1d && Math.abs(size2.height - TXEAudioDef.TXE_OPUS_SAMPLE_NUM) < d2 && list2.contains(size2)) {
                d2 = Math.abs(size2.height - TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - TXEAudioDef.TXE_OPUS_SAMPLE_NUM) < d && list2.contains(size3)) {
                    d = Math.abs(size3.height - TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                    size = size3;
                }
            }
        }
        return size;
    }
}
