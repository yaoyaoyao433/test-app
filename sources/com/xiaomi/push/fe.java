package com.xiaomi.push;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;
/* loaded from: classes6.dex */
public final class fe {
    fj b;
    volatile boolean c;
    byte[] d;
    private InputStream h;
    private ByteBuffer e = ByteBuffer.allocate(2048);
    private ByteBuffer f = ByteBuffer.allocate(4);
    private Adler32 g = new Adler32();
    fh a = new fh();

    /* JADX INFO: Access modifiers changed from: package-private */
    public fe(InputStream inputStream, fj fjVar) {
        this.h = new BufferedInputStream(inputStream);
        this.b = fjVar;
    }

    private void a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.h.read(byteBuffer.array(), position, i);
            if (read == -1) {
                throw new EOFException();
            }
            i -= read;
            position += read;
        } while (i > 0);
        byteBuffer.position(position);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be A[Catch: IOException -> 0x0153, TryCatch #1 {IOException -> 0x0153, blocks: (B:3:0x0001, B:7:0x0021, B:9:0x0033, B:11:0x003d, B:12:0x0059, B:18:0x0085, B:20:0x00be, B:22:0x00c2, B:23:0x00ce, B:32:0x011b, B:33:0x0142, B:13:0x005c, B:17:0x006a, B:34:0x0143, B:35:0x014a, B:36:0x014b, B:37:0x0152), top: B:49:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b A[Catch: IOException -> 0x0153, TRY_ENTER, TryCatch #1 {IOException -> 0x0153, blocks: (B:3:0x0001, B:7:0x0021, B:9:0x0033, B:11:0x003d, B:12:0x0059, B:18:0x0085, B:20:0x00be, B:22:0x00c2, B:23:0x00ce, B:32:0x011b, B:33:0x0142, B:13:0x005c, B:17:0x006a, B:34:0x0143, B:35:0x014a, B:36:0x014b, B:37:0x0152), top: B:49:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.xiaomi.push.fb a() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fe.a():com.xiaomi.push.fb");
    }
}
