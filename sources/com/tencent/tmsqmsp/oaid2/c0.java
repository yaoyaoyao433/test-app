package com.tencent.tmsqmsp.oaid2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c0 {
    public static final Uri a = Uri.parse("content://cn.nubia.identity/identity");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static String a(Context context, String str) {
        Bundle call;
        String str2 = null;
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                call = acquireUnstableContentProviderClient.call("getAAID", str, null);
                if (acquireUnstableContentProviderClient != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        acquireUnstableContentProviderClient.close();
                    } else {
                        acquireUnstableContentProviderClient.release();
                    }
                }
            } else {
                call = context.getContentResolver().call(a, "getAAID", str, (Bundle) null);
            }
            ?? r3 = call.getInt("code", -1);
            try {
                if (r3 == 0) {
                    String string = call.getString("id");
                    c.c("NubiaLog succeed:".concat(String.valueOf(string)));
                    r3 = string;
                } else {
                    String string2 = call.getString("message");
                    c.c("NubiaLog failed:".concat(String.valueOf(string2)));
                    r3 = string2;
                }
                return r3;
            } catch (Exception e) {
                str2 = r3;
                e = e;
                e.printStackTrace();
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static String b(Context context) {
        Bundle call;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                call = acquireUnstableContentProviderClient.call("getOAID", null, null);
                if (acquireUnstableContentProviderClient != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        acquireUnstableContentProviderClient.close();
                    } else {
                        acquireUnstableContentProviderClient.release();
                    }
                }
            } else {
                call = context.getContentResolver().call(a, "getOAID", (String) null, (Bundle) null);
            }
            ?? r5 = call.getInt("code", -1);
            try {
                if (r5 == 0) {
                    String string = call.getString("id");
                    c.c("NubiaLog succeed:".concat(String.valueOf(string)));
                    r5 = string;
                } else {
                    String string2 = call.getString("message");
                    c.c("NubiaLog failed:".concat(String.valueOf(string2)));
                    r5 = string2;
                }
                return r5;
            } catch (Exception e) {
                str = r5;
                e = e;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean a(Context context) {
        Bundle call;
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
                call = acquireUnstableContentProviderClient.call("isSupport", null, null);
                if (acquireUnstableContentProviderClient != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        acquireUnstableContentProviderClient.close();
                    } else {
                        acquireUnstableContentProviderClient.release();
                    }
                }
            } else {
                call = context.getContentResolver().call(a, "isSupport", (String) null, (Bundle) null);
            }
            if (call.getInt("code", -1) == 0) {
                c.c("NubiaLog succeed");
                return call.getBoolean("issupport", true);
            }
            String string = call.getString("message");
            c.c("NubiaLog failed:" + string);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
