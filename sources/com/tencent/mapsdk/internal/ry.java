package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.statistics.Constants;
import com.tencent.tmsqmsp.oaid2.IVendorCallback;
import com.tencent.tmsqmsp.oaid2.VendorManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ry {
    private static final String a = "TMS-Oaid";
    private static String b = "";
    private static boolean c = true;
    private static IVendorCallback d = new IVendorCallback() { // from class: com.tencent.mapsdk.internal.ry.1
        @Override // com.tencent.tmsqmsp.oaid2.IVendorCallback
        public final void onResult(boolean z, String str, String str2) {
            Log.e(ry.a, "isSupport: " + z + " s: " + str + " oaid: " + str2);
            boolean unused = ry.c = z;
            if (z) {
                String unused2 = ry.b = str2;
            }
        }
    };

    public static String a(Context context) {
        if (c) {
            if (!TextUtils.isEmpty(b) && c) {
                return b;
            }
            try {
                new VendorManager().getVendorInfo(context, d);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return b;
        }
        return Constants.UNDEFINED;
    }
}
