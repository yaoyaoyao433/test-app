package com.meizu.cloud.pushsdk.a.a;

import android.content.Context;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class b {
    private static final String a = "b";
    private static final Object b = new Object();
    private static b c;

    private b(Context context) {
        try {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        a.a(context);
    }

    public static b a(Context context) {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new b(context);
                }
            }
        }
        return c;
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final c a(String str, Map<String, String> map, String str2) {
        HashMap hashMap = new HashMap(2);
        byte[] bArr = a.a().b;
        if (bArr == null || bArr.length <= 0) {
            byte[] bArr2 = a.a().a;
            if (bArr2 != null && bArr2.length > 0) {
                String str3 = new String(a.a().a);
                String str4 = a;
                DebugLogger.d(str4, "attach x_a_key: " + str3);
                hashMap.put("X-A-Key", str3);
            }
        } else {
            String str5 = new String(bArr);
            String str6 = a;
            DebugLogger.d(str6, "attach x_s_key: " + str5);
            hashMap.put("X-S-Key", str5);
        }
        try {
            return b(str, hashMap, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:10|(12:12|(2:13|(1:15)(0))|(8:55|56|57|58|59|60|62|63)|18|19|20|(1:22)|24|25|26|(3:39|40|(3:42|43|44))(1:28)|(1:30)(2:37|38))(0))(0)|16|(0)|18|19|20|(0)|24|25|26|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0175, code lost:
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0196, code lost:
        if (r8 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[Catch: all -> 0x00b2, Exception -> 0x00b5, NullPointerException -> 0x0110, TRY_LEAVE, TryCatch #5 {Exception -> 0x00b5, blocks: (B:18:0x0091, B:29:0x00b1, B:34:0x00b9, B:35:0x00d0, B:37:0x00f0, B:38:0x0110, B:39:0x012a), top: B:87:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163 A[Catch: Exception -> 0x015e, all -> 0x0199, TryCatch #8 {Exception -> 0x015e, blocks: (B:41:0x0130, B:43:0x0136, B:44:0x014e, B:47:0x015a, B:52:0x0163, B:53:0x016f), top: B:92:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f A[Catch: Exception -> 0x015e, all -> 0x0199, TRY_LEAVE, TryCatch #8 {Exception -> 0x015e, blocks: (B:41:0x0130, B:43:0x0136, B:44:0x014e, B:47:0x015a, B:52:0x0163, B:53:0x016f), top: B:92:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meizu.cloud.pushsdk.a.a.c b(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.a.a.b.b(java.lang.String, java.util.Map, java.lang.String):com.meizu.cloud.pushsdk.a.a.c");
    }
}
