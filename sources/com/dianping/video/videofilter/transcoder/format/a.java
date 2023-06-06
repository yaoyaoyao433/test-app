package com.dianping.video.videofilter.transcoder.format;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.liteav.audio.TXEAudioDef;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.video.videofilter.transcoder.format.d
    @TargetApi(16)
    public final MediaFormat a(MediaFormat mediaFormat, int i) {
        int i2;
        MediaFormat createVideoFormat;
        Object[] objArr = {mediaFormat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d01202e75f14cd4058fb75d9b6baec", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d01202e75f14cd4058fb75d9b6baec");
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (i != 90 && i != 270) {
            integer = integer2;
            integer2 = integer;
        }
        Object[] objArr2 = {Integer.valueOf(integer2), Integer.valueOf(integer)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "99c73d0e66144508b995a96e4f4ab0c9", RobustBitConfig.DEFAULT_VALUE)) {
            createVideoFormat = (MediaFormat) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "99c73d0e66144508b995a96e4f4ab0c9");
        } else {
            int max = Math.max(integer2, integer);
            int min = Math.min(integer2, integer);
            int i3 = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            if (max <= 960) {
                i2 = integer2;
                i3 = integer;
            } else {
                i2 = (min * TXEAudioDef.TXE_OPUS_SAMPLE_NUM) / max;
                if (i2 % 2 != 0) {
                    i2--;
                }
                if (integer2 >= integer) {
                    i3 = i2;
                    i2 = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                }
            }
            createVideoFormat = MediaFormat.createVideoFormat("video/avc", i2, i3);
            c.a(createVideoFormat);
        }
        String.format("input: %dx%d => output: %dx%d", Integer.valueOf(integer2), Integer.valueOf(integer), Integer.valueOf(createVideoFormat.getInteger("width")), Integer.valueOf(createVideoFormat.getInteger("height")));
        return createVideoFormat;
    }
}
