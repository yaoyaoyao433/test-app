package com.sankuai.meituan.shortvideocore.mrn;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Set<String> b;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "740da7a5e33912c0e65249d98c82c5a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "740da7a5e33912c0e65249d98c82c5a0")).booleanValue();
        }
        if (b == null) {
            b = new HashSet();
            b();
        }
        return b.contains("video/hevc");
    }

    private static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf88871efcd5f9234ea6d46f80690a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf88871efcd5f9234ea6d46f80690a73");
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        b.add(str.toLowerCase());
                    }
                }
            }
            new StringBuilder("getSupportType: ").append(Arrays.toString(b.toArray()));
        } catch (Throwable th) {
            Log.e("MRNPlayerUtils", "getSupportType " + th);
        }
    }
}
