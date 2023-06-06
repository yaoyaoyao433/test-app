package com.dianping.video.videofilter.transcoder.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static List<String> a(String str, boolean z) {
        MediaCodecInfo[] codecInfos;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48c96d466390bfcddfac69bca910803b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48c96d466390bfcddfac69bca910803b");
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 21) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (z == codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i2].equals(str)) {
                            arrayList.add(codecInfoAt.getName());
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } else {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                if (z == mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes2 = mediaCodecInfo.getSupportedTypes();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= supportedTypes2.length) {
                            break;
                        } else if (supportedTypes2[i3].equals(str)) {
                            arrayList.add(mediaCodecInfo.getName());
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
