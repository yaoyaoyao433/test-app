package com.hhmedic.android.sdk.base.utils.cache;

import android.util.Base64;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDes {
    private static final String ENCODING = "UTF-8";

    HHDes() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String encode(String str) throws Exception {
        return Base64.encodeToString(str.getBytes("UTF-8"), 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decode(String str) throws Exception {
        return new String(Base64.decode(str, 1), "UTF-8");
    }
}
