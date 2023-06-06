package com.dianping.video.util;

import android.media.MediaExtractor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.misc.IMediaFormat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static int a(MediaExtractor mediaExtractor, String str) {
        Object[] objArr = {mediaExtractor, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8f9812cd0ee17f574e69dedfa88359e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8f9812cd0ee17f574e69dedfa88359e")).intValue();
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME).startsWith(str)) {
                return i;
            }
        }
        return -1;
    }
}
