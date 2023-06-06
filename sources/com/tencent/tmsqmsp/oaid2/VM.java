package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VM {
    public static int getVendorInfo(Context context, IVendorCallback iVendorCallback) {
        return new VendorManager().getVendorInfo(context, iVendorCallback);
    }
}
