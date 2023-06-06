package com.sankuai.meituan.preloaded.channel;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.http.util.EncodingUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:6|7)|8|(11:30|31|11|(1:13)|14|15|(1:17)|18|(2:20|21)|23|(2:25|26)(1:27))|10|11|(0)|14|15|(0)|18|(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
        r1.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[Catch: Throwable -> 0x00aa, TryCatch #0 {Throwable -> 0x00aa, blocks: (B:17:0x0089, B:19:0x008f, B:20:0x0099, B:22:0x009f), top: B:31:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[Catch: Throwable -> 0x00aa, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00aa, blocks: (B:17:0x0089, B:19:0x008f, B:20:0x0099, B:22:0x009f), top: B:31:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.preloaded.channel.a.a
            java.lang.String r10 = "81d9aa6a18cf48a7929779cc0d61594b"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r3 = 1
            if (r1 == 0) goto L1c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r3, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1c:
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L47
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L47
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch: java.lang.Exception -> L47
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.Exception -> L47
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L47
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L47
            java.lang.String r5 = "ro.channelId.com.meituan"
            r4[r0] = r5     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r1.invoke(r2, r4)     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L47
            java.lang.String r4 = "mtchannel"
            java.lang.String r1 = a(r1, r4)     // Catch: java.lang.Exception -> L47
            goto L48
        L47:
            r1 = r2
        L48:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L79
            java.lang.String r4 = "miui.os.MiuiInit"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L79
            java.lang.String r5 = "getMiuiChannelPath"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L79
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r0] = r7     // Catch: java.lang.Exception -> L79
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.Exception -> L79
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> L79
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L79
            java.lang.String r5 = "com.sankuai.meituan"
            r3[r0] = r5     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r4.invoke(r2, r3)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L79
            java.lang.String r2 = "mtchannel"
            java.lang.String r0 = a(r0, r2)     // Catch: java.lang.Exception -> L79
            goto L7a
        L79:
            r0 = r1
        L7a:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L89
            java.lang.String r0 = "/data/yzfswj/com.sankuai.meituan/mtconfig.ini"
            java.lang.String r1 = "mtchannel"
            java.lang.String r0 = a(r0, r1)
        L89:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L99
            java.lang.String r1 = "/data/etc/appchannel/mtconfig.ini"
            java.lang.String r2 = "mtchannel"
            java.lang.String r1 = a(r1, r2)     // Catch: java.lang.Throwable -> Laa
            r0 = r1
        L99:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto Lae
            java.lang.String r1 = "/system/etc/appchannel/mtconfig.ini"
            java.lang.String r2 = "mtchannel"
            java.lang.String r1 = a(r1, r2)     // Catch: java.lang.Throwable -> Laa
            r0 = r1
            goto Lae
        Laa:
            r1 = move-exception
            r1.printStackTrace()
        Lae:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lbd
            java.lang.String r0 = "/system/etc/mtconfig.ini"
            java.lang.String r1 = "mtchannel"
            java.lang.String r0 = a(r0, r1)
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.preloaded.channel.a.a():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r11v5 */
    private static String a(String str, String str2) {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d58b58b0840a12d45d06f60f362aeaa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d58b58b0840a12d45d06f60f362aeaa3");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        ?? exists = file.exists();
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (exists != 0) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    jSONObject = new JSONObject(EncodingUtils.getString(bArr, "UTF-8"));
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (JSONException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (IOException e4) {
                e = e4;
                fileInputStream = null;
            } catch (JSONException e5) {
                e = e5;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                exists = 0;
                if (exists != 0) {
                    try {
                        exists.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
            if (!jSONObject.has(str2)) {
                fileInputStream.close();
                return null;
            }
            String string = jSONObject.getString(str2);
            try {
                fileInputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            return string;
        }
        return null;
    }
}
