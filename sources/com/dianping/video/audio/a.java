package com.dianping.video.audio;

import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static boolean a = false;

    static {
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            a = true;
        } else {
            a = false;
        }
    }
}
