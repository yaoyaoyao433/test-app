package com.sankuai.waimai.business.user.api.user.login;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
        r2.disconnect();
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.user.api.user.login.a.a(java.lang.String):java.lang.String");
    }

    private static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "891d9427b13a58523ff39e32f67fac1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "891d9427b13a58523ff39e32f67fac1f");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                com.sankuai.waimai.foundation.utils.log.a.e("net", "error: " + e.getLocalizedMessage(), new Object[0]);
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        inputStream.close();
        String str = new String(byteArrayOutputStream.toByteArray());
        com.sankuai.waimai.foundation.utils.log.a.b("net", "response: " + str, new Object[0]);
        return str;
    }
}
