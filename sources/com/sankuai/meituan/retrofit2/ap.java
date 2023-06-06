package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class ap implements Closeable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long contentLength();

    public abstract String contentType();

    public abstract InputStream source();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String string() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.retrofit2.ap.changeQuickRedirect
            java.lang.String r10 = "e773fd2076fd093ba2c0e083c75dcd7a"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            r0 = 0
            java.lang.String r1 = r11.contentType()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L3b
            java.lang.String r1 = r11.contentType()     // Catch: java.lang.Throwable -> L66
            com.sankuai.meituan.retrofit2.ad r1 = com.sankuai.meituan.retrofit2.ad.a(r1)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L3b
            java.nio.charset.Charset r2 = r1.a()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L3b
            java.nio.charset.Charset r1 = r1.a()     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L66
            goto L3c
        L3b:
            r1 = r0
        L3c:
            if (r1 != 0) goto L40
            java.lang.String r1 = "UTF-8"
        L40:
            java.io.InputStream r2 = r11.source()     // Catch: java.lang.Throwable -> L66
            okio.c r3 = new okio.c     // Catch: java.lang.Throwable -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            r3.a(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L67
            byte[] r3 = r3.r()     // Catch: java.lang.Throwable -> L67
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = r4
            goto L6c
        L5c:
            r1 = move-exception
            r0 = r2
            goto L60
        L5f:
            r1 = move-exception
        L60:
            if (r0 == 0) goto L65
            r0.close()     // Catch: java.lang.Throwable -> L65
        L65:
            throw r1
        L66:
            r2 = r0
        L67:
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.retrofit2.ap.string():java.lang.String");
    }

    @Deprecated
    public static ap create(final String str, final long j, InputStream inputStream) throws IOException {
        Object[] objArr = {str, new Long(j), inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3239834964a937a870a792419133f28", 6917529027641081856L)) {
            return (ap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3239834964a937a870a792419133f28");
        }
        okio.c cVar = new okio.c();
        if (inputStream != null) {
            cVar.a(inputStream);
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cVar.r());
        cVar.close();
        return new ap() { // from class: com.sankuai.meituan.retrofit2.ap.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.ap
            public final String contentType() {
                return str;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final long contentLength() {
                return j;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final InputStream source() {
                return byteArrayInputStream;
            }

            @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2da3d8de3d09a5ae3a74675d3e123468", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2da3d8de3d09a5ae3a74675d3e123468");
                } else {
                    super.close();
                }
            }
        };
    }

    public a newBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d74c6bbef4b5e612f177ea78fa1c2e1", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d74c6bbef4b5e612f177ea78fa1c2e1") : new a(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public final class a {
        public static ChangeQuickRedirect a;
        String b;
        long c;
        InputStream d;
        ap e;

        public a(ap apVar) {
            Object[] objArr = {ap.this, apVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5348ffd9ab1138777fe56d2eddd4a99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5348ffd9ab1138777fe56d2eddd4a99");
                return;
            }
            this.e = apVar;
            this.b = apVar.contentType();
            this.c = apVar.contentLength();
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4843ae79e71cc78bb59489eff8f50152", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4843ae79e71cc78bb59489eff8f50152");
            }
            this.c = j;
            return this;
        }

        public final a a(InputStream inputStream) {
            this.d = inputStream;
            return this;
        }

        public final ap a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c629536d7bcfeb1c63a8b78a862ac6", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c629536d7bcfeb1c63a8b78a862ac6") : new ap() { // from class: com.sankuai.meituan.retrofit2.ap.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.ap
                public final String contentType() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a362235e6572d041e0971f625ba86511", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a362235e6572d041e0971f625ba86511") : a.this.b;
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final long contentLength() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4fb5ce09db5f4fcfbddd1b395db7933", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4fb5ce09db5f4fcfbddd1b395db7933")).longValue() : a.this.c;
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final InputStream source() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "495cfbcf8dcc035fd72cdea53e7565e2", 6917529027641081856L) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "495cfbcf8dcc035fd72cdea53e7565e2") : a.this.d;
                }

                @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6654cd2ad5de5f6d01e9b18dd7c415ce", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6654cd2ad5de5f6d01e9b18dd7c415ce");
                        return;
                    }
                    if (a.this.e != null) {
                        a.this.e.close();
                    }
                    super.close();
                }
            };
        }
    }
}
