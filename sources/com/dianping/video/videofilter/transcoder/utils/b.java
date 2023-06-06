package com.dianping.video.videofilter.transcoder.utils;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.dianping.video.util.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public MediaFormat c;
        public int d;
        public String e;
        public MediaFormat f;

        public a() {
        }
    }

    @TargetApi(16)
    public static a a(MediaExtractor mediaExtractor) {
        Object[] objArr = {mediaExtractor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9de96a5cb7dd31518af88ecfb0740df3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9de96a5cb7dd31518af88ecfb0740df3");
        }
        StringBuilder sb = new StringBuilder();
        a aVar = new a();
        aVar.a = -1;
        aVar.d = -1;
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            if (aVar.a < 0 && string.startsWith("video/")) {
                aVar.a = i;
                aVar.b = string;
                aVar.c = trackFormat;
                sb.append("video -> trackIndex:");
                sb.append(trackFormat.toString());
            } else if (aVar.d < 0 && string.startsWith("audio/")) {
                aVar.d = i;
                aVar.e = string;
                aVar.f = trackFormat;
                sb.append(StringUtil.CRLF_STRING);
                sb.append("audio -> trackIndex:");
                sb.append(trackFormat.toString());
            }
            if (aVar.a >= 0 && aVar.d >= 0) {
                break;
            }
        }
        d.a().a(sb.toString());
        if (aVar.a >= 0 || aVar.d >= 0) {
            return aVar;
        }
        throw new IllegalArgumentException("extractor does not contain video and/or audio tracks.");
    }
}
