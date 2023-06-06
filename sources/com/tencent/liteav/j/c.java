package com.tencent.liteav.j;

import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.mapsdk.internal.jw;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    public static int[] a(int i, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            TXCLog.w("GlUtil", "no input size. " + i2 + "*" + i3);
            return new int[]{i2, i3};
        }
        float f = (i2 * 1.0f) / i3;
        if (i == 0) {
            if ((i2 <= 640 && i3 <= 360) || (i2 <= 360 && i3 <= 640)) {
                TXCLog.i("GlUtil", "target size: " + i2 + "*" + i3);
                return new int[]{i2, i3};
            } else if (i2 >= i3) {
                int i4 = (int) (360.0f * f);
                i2 = i4 >= 640 ? jw.h : i4;
                i3 = (int) (i2 / f);
            } else {
                i2 = (int) (640.0f * f);
                if (i2 >= 360) {
                    i2 = 360;
                }
                i3 = (int) (i2 / f);
            }
        } else if (i == 1) {
            if ((i2 <= 640 && i3 <= 480) || (i2 <= 480 && i3 <= 640)) {
                TXCLog.i("GlUtil", "target size: " + i2 + "*" + i3);
                return new int[]{i2, i3};
            } else if (i2 >= i3) {
                int i5 = (int) (480.0f * f);
                i2 = i5 >= 640 ? jw.h : i5;
                i3 = (int) (i2 / f);
            } else {
                i2 = (int) (640.0f * f);
                if (i2 >= 480) {
                    i2 = jw.g;
                }
                i3 = (int) (i2 / f);
            }
        } else if (i == 2) {
            if ((i2 <= 960 && i3 <= 544) || (i2 <= 544 && i3 <= 960)) {
                TXCLog.i("GlUtil", "target size: " + i2 + "*" + i3);
                return new int[]{i2, i3};
            } else if (i2 >= i3) {
                int i6 = (int) (544.0f * f);
                i2 = i6 >= 960 ? TXEAudioDef.TXE_OPUS_SAMPLE_NUM : i6;
                i3 = (int) (i2 / f);
            } else {
                i2 = (int) (960.0f * f);
                if (i2 >= 544) {
                    i2 = KNBJsErrorInfo.CODE_DENIED_PERMISSION;
                }
                i3 = (int) (i2 / f);
            }
        } else if (i == 3) {
            if ((i2 <= 1280 && i3 <= 720) || (i2 <= 720 && i3 <= 1280)) {
                TXCLog.i("GlUtil", "target size: " + i2 + "*" + i3);
                return new int[]{i2, i3};
            } else if (i2 >= i3) {
                int i7 = (int) (720.0f * f);
                i2 = i7 >= 1280 ? 1280 : i7;
                i3 = (int) (i2 / f);
            } else {
                i2 = (int) (1280.0f * f);
                if (i2 >= 720) {
                    i2 = 720;
                }
                i3 = (int) (i2 / f);
            }
        }
        return new int[]{((i2 + 1) >> 1) << 1, ((i3 + 1) >> 1) << 1};
    }
}
