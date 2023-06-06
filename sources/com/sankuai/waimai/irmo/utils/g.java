package com.sankuai.waimai.irmo.utils;

import android.media.MediaExtractor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static int a(MediaExtractor mediaExtractor) {
        Object[] objArr = {mediaExtractor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e79f60aef8295740b1f8a5d818249bbb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e79f60aef8295740b1f8a5d818249bbb")).intValue();
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME);
            if (string != null && string.startsWith("audio/")) {
                mediaExtractor.release();
                return i;
            }
        }
        return -1;
    }
}
