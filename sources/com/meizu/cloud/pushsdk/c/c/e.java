package com.meizu.cloud.pushsdk.c.c;

import java.io.IOException;
import java.net.HttpURLConnection;
/* loaded from: classes3.dex */
public final class e implements a {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    @Override // com.meizu.cloud.pushsdk.c.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meizu.cloud.pushsdk.c.c.k a(com.meizu.cloud.pushsdk.c.c.i r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.e.a(com.meizu.cloud.pushsdk.c.c.i):com.meizu.cloud.pushsdk.c.c.k");
    }

    private static void a(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        j jVar = iVar.d;
        if (jVar != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", jVar.a().toString());
            com.meizu.cloud.pushsdk.c.g.c a = com.meizu.cloud.pushsdk.c.g.g.a(com.meizu.cloud.pushsdk.c.g.g.a(httpURLConnection.getOutputStream()));
            jVar.a(a);
            a.close();
        }
    }
}
