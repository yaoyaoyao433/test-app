package com.dianping.video.videofilter.transcoder.format;

import android.media.MediaFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(MediaFormat mediaFormat) {
        Object[] objArr = {mediaFormat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c0612786b0ed0c978f5f5a0526a6383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c0612786b0ed0c978f5f5a0526a6383");
            return;
        }
        mediaFormat.setInteger("bitrate", 3584000);
        mediaFormat.setInteger("color-format", 2130708361);
        mediaFormat.setInteger("frame-rate", 30);
        mediaFormat.setInteger("i-frame-interval", 10);
    }
}
