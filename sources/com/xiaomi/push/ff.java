package com.xiaomi.push;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.zip.Adler32;
/* loaded from: classes6.dex */
public final class ff {
    fj b;
    OutputStream c;
    int d;
    int e;
    private byte[] h;
    ByteBuffer a = ByteBuffer.allocate(2048);
    private ByteBuffer f = ByteBuffer.allocate(4);
    private Adler32 g = new Adler32();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ff(OutputStream outputStream, fj fjVar) {
        this.c = new BufferedOutputStream(outputStream);
        this.b = fjVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.d = timeZone.getRawOffset() / Constants.CONFIG_REFRESH_TIME;
        this.e = timeZone.useDaylightTime() ? 1 : 0;
    }

    public final int a(fb fbVar) {
        int j = fbVar.j();
        if (j > 32768) {
            com.xiaomi.channel.commonutils.logger.c.a("Blob size=" + j + " should be less than 32768 Drop blob chid=" + fbVar.c() + " id=" + fbVar.g());
            return 0;
        }
        this.a.clear();
        int i = j + 8 + 4;
        if (i > this.a.capacity() || this.a.capacity() > 4096) {
            this.a = ByteBuffer.allocate(i);
        }
        this.a.putShort((short) -15618);
        this.a.putShort((short) 5);
        this.a.putInt(j);
        int position = this.a.position();
        this.a = fbVar.a(this.a);
        if (!"CONN".equals(fbVar.a())) {
            if (this.h == null) {
                this.h = this.b.a();
            }
            com.xiaomi.push.service.ap.a(this.h, this.a.array(), true, position, j);
        }
        this.g.reset();
        this.g.update(this.a.array(), 0, this.a.position());
        this.f.putInt(0, (int) this.g.getValue());
        this.c.write(this.a.array(), 0, this.a.position());
        this.c.write(this.f.array(), 0, 4);
        this.c.flush();
        int position2 = this.a.position() + 4;
        com.xiaomi.channel.commonutils.logger.c.c("[Slim] Wrote {cmd=" + fbVar.a() + ";chid=" + fbVar.c() + ";len=" + position2 + CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return position2;
    }
}
