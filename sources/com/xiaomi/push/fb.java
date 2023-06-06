package com.xiaomi.push;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.da;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public class fb {
    private static String d = gq.a(5) + CommonConstant.Symbol.MINUS;
    private static long e = 0;
    private static final byte[] g = new byte[0];
    public short a;
    public String b;
    int c;
    private da.a f;
    private byte[] h;

    public fb() {
        this.a = (short) 2;
        this.h = g;
        this.b = null;
        this.f = new da.a();
        this.c = 1;
    }

    private fb(da.a aVar, short s, byte[] bArr) {
        this.a = (short) 2;
        this.h = g;
        this.b = null;
        this.f = aVar;
        this.a = s;
        this.h = bArr;
        this.c = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fb b(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            da.a aVar = new da.a();
            aVar.b(slice.array(), slice.arrayOffset() + 8, s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new fb(aVar, s, bArr);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("read Blob err :" + e2.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    private static synchronized String k() {
        String sb;
        synchronized (fb.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d);
            long j = e;
            e = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(j());
        }
        byteBuffer.putShort(this.a);
        byteBuffer.putShort((short) this.f.a());
        byteBuffer.putInt(this.h.length);
        int position = byteBuffer.position();
        this.f.a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f.a());
        byteBuffer.position(position + this.f.a());
        byteBuffer.put(this.h);
        return byteBuffer;
    }

    public final void a(int i) {
        this.f.a(i);
    }

    public final void a(long j, String str, String str2) {
        if (j != 0) {
            this.f.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f.a(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f.b(str2);
    }

    public final void a(String str) {
        this.f.e(str);
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f.c(str);
        this.f.c();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f.d(str2);
    }

    public final void a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f.b(0);
        } else {
            this.f.b(1);
            bArr = com.xiaomi.push.service.ap.a(com.xiaomi.push.service.ap.a(str, g()), bArr);
        }
        this.h = bArr;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int indexOf = str.indexOf("@");
        try {
            long parseLong = Long.parseLong(str.substring(0, indexOf));
            int indexOf2 = str.indexOf("/", indexOf);
            String substring = str.substring(indexOf + 1, indexOf2);
            String substring2 = str.substring(indexOf2 + 1);
            this.f.a(parseLong);
            this.f.a(substring);
            this.f.b(substring2);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("Blob parse user err " + e2.getMessage());
        }
    }

    public final byte[] i() {
        return fc.a(this, this.h);
    }

    public int j() {
        return this.f.b() + 8 + this.h.length;
    }

    public final String a() {
        return this.f.f;
    }

    public final String b() {
        return this.f.g;
    }

    public final int c() {
        return this.f.a;
    }

    public final boolean d() {
        return this.f.k;
    }

    public final int e() {
        return this.f.l;
    }

    public final String f() {
        return this.f.m;
    }

    public final String g() {
        String str = this.f.i;
        if ("ID_NOT_AVAILABLE".equals(str)) {
            return null;
        }
        if (this.f.h) {
            return str;
        }
        String k = k();
        this.f.e(k);
        return k;
    }

    public final String h() {
        if (this.f.b) {
            return Long.toString(this.f.c) + "@" + this.f.d + "/" + this.f.e;
        }
        return null;
    }

    public final byte[] c(String str) {
        if (this.f.j == 1) {
            return fc.a(this, com.xiaomi.push.service.ap.a(com.xiaomi.push.service.ap.a(str, g()), this.h));
        }
        if (this.f.j == 0) {
            return fc.a(this, this.h);
        }
        com.xiaomi.channel.commonutils.logger.c.a("unknow cipher = " + this.f.j);
        return fc.a(this, this.h);
    }

    @Deprecated
    public static fb a(gf gfVar, String str) {
        int i;
        fb fbVar = new fb();
        try {
            i = Integer.parseInt(gfVar.t);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("Blob parse chid err " + e2.getMessage());
            i = 1;
        }
        fbVar.a(i);
        fbVar.a(gfVar.d());
        fbVar.b(gfVar.s);
        fbVar.b = gfVar.u;
        fbVar.a("XMLMSG", (String) null);
        try {
            fbVar.a(gfVar.b().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                fbVar.a = (short) 3;
            } else {
                fbVar.a = (short) 2;
                fbVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e3) {
            com.xiaomi.channel.commonutils.logger.c.a("Blob setPayload err： " + e3.getMessage());
        }
        return fbVar;
    }

    public String toString() {
        return "Blob [chid=" + c() + "; Id=" + g() + "; cmd=" + a() + "; type=" + ((int) this.a) + "; from=" + h() + " ]";
    }
}
