package com.tencent.liteav.basic.license;

import android.content.Context;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends a {
    private Context b;
    private String c;
    private String d;
    private String e;
    private b f;
    private long g;
    private long h;
    private boolean i;
    private String j;

    public c(Context context, String str, String str2, String str3, b bVar, boolean z, String str4) {
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bVar;
        this.i = z;
        this.j = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:
        if (r18.f != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d7, code lost:
        r18.f.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0217, code lost:
        if (r18.f == null) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ee A[Catch: IOException -> 0x01ff, TryCatch #16 {IOException -> 0x01ff, blocks: (B:136:0x01e9, B:138:0x01ee, B:140:0x01f3, B:141:0x01f6, B:143:0x01fa), top: B:181:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f3 A[Catch: IOException -> 0x01ff, TryCatch #16 {IOException -> 0x01ff, blocks: (B:136:0x01e9, B:138:0x01ee, B:140:0x01f3, B:141:0x01f6, B:143:0x01fa), top: B:181:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fa A[Catch: IOException -> 0x01ff, TRY_LEAVE, TryCatch #16 {IOException -> 0x01ff, blocks: (B:136:0x01e9, B:138:0x01ee, B:140:0x01f3, B:141:0x01f6, B:143:0x01fa), top: B:181:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0208 A[Catch: IOException -> 0x021a, TRY_ENTER, TryCatch #0 {IOException -> 0x021a, blocks: (B:118:0x01c6, B:120:0x01cb, B:122:0x01d0, B:123:0x01d3, B:125:0x01d7, B:151:0x0208, B:153:0x020d, B:155:0x0212, B:156:0x0215), top: B:169:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020d A[Catch: IOException -> 0x021a, TryCatch #0 {IOException -> 0x021a, blocks: (B:118:0x01c6, B:120:0x01cb, B:122:0x01d0, B:123:0x01d3, B:125:0x01d7, B:151:0x0208, B:153:0x020d, B:155:0x0212, B:156:0x0215), top: B:169:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0212 A[Catch: IOException -> 0x021a, TryCatch #0 {IOException -> 0x021a, blocks: (B:118:0x01c6, B:120:0x01cb, B:122:0x01d0, B:123:0x01d3, B:125:0x01d7, B:151:0x0208, B:153:0x020d, B:155:0x0212, B:156:0x0215), top: B:169:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r17v2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.license.c.run():void");
    }

    private void a(Exception exc, int i) {
        if (this.f != null) {
            this.f.a((File) null, exc);
        }
        this.f = null;
    }
}
