package com.sankuai.xm.base.proto.protobase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g extends f<d> {
    private static volatile int a;
    public static ChangeQuickRedirect m;
    public d q;
    protected String r;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ddcb098b06aba9ae6358ca2108c09cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ddcb098b06aba9ae6358ca2108c09cb");
            return;
        }
        this.q = new d();
        this.r = null;
    }

    public final void a(int i) {
        this.q.b = i;
    }

    public final void c(short s) {
        this.q.c = s;
    }

    public final void b(String str) {
        this.r = str;
    }

    public final String v() {
        return this.r;
    }

    public final boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e40c652ec3cc0dbaae598f5e678024", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e40c652ec3cc0dbaae598f5e678024")).booleanValue();
        }
        Object[] objArr2 = {null};
        ChangeQuickRedirect changeQuickRedirect2 = m;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02e7506c6dabf4b78db1a1fb4ff4fc1a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02e7506c6dabf4b78db1a1fb4ff4fc1a")).booleanValue();
        }
        short s = this.q.e;
        int i = this.q.b;
        if (s > 0) {
            com.sankuai.xm.log.a.b("proto version not support: uri = " + i + ", ver:" + ((int) s) + ", curr:0");
            j.a(null, 10022, null, null, null);
            return true;
        }
        return false;
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e79f45ec3565e154c0ea2ac40615a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e79f45ec3565e154c0ea2ac40615a0");
            return;
        }
        this.o = ByteBuffer.wrap(bArr);
        this.q.a = p();
        this.q.b = p();
        this.q.c = o();
        this.q.e = o();
        this.q.f = p();
        this.q.g = p();
        this.q.h = p();
    }

    private static int b() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e956085e5c8778e6c42013c55f3c896c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e956085e5c8778e6c42013c55f3c896c")).intValue();
        }
        synchronized (g.class) {
            int i2 = a + 1;
            a = i2;
            if (i2 <= 0) {
                a = 1;
            }
            i = a;
        }
        return i;
    }

    private static int h(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "443cc0c1403d378af80fca4492c32811", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "443cc0c1403d378af80fca4492c32811")).intValue();
        }
        if (bArr == null) {
            return 0;
        }
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            return (int) crc32.getValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean e(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d484f0623d0bc7844572cad4be89025", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d484f0623d0bc7844572cad4be89025")).booleanValue();
        }
        if (bArr != null) {
            try {
                if (bArr.length >= 24) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    int i = wrap.getInt(12);
                    wrap.putInt(12, 0);
                    int h = h(wrap.array());
                    wrap.putInt(12, i);
                    return i == h;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static int f(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f22b20117233ffc8fa6826f7598082bc", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f22b20117233ffc8fa6826f7598082bc")).intValue();
        }
        if (bArr != null) {
            try {
                if (bArr.length >= 24) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    int i = wrap.getInt(12);
                    wrap.putInt(12, 0);
                    int h = h(wrap.array());
                    wrap.putInt(12, i);
                    return h;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static d g(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "384a08458de497ea44a0ad6790e2157c", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "384a08458de497ea44a0ad6790e2157c");
        }
        if (bArr != null) {
            try {
                if (bArr.length >= 24) {
                    d dVar = new d();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    dVar.a = wrap.getInt(0);
                    dVar.b = wrap.getInt(4);
                    dVar.c = wrap.getShort(8);
                    dVar.e = wrap.getShort(10);
                    dVar.f = wrap.getInt(12);
                    dVar.g = wrap.getInt(16);
                    dVar.h = wrap.getInt(20);
                    return dVar;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d30f8f7ef264a4f4d8ba10816caf182c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d30f8f7ef264a4f4d8ba10816caf182c");
        }
        this.q.e = (short) 0;
        b(0);
        this.q.a = this.p.position();
        this.p.putInt(0, this.q.a);
        this.p.putInt(4, this.q.b);
        this.p.putShort(8, this.q.c);
        this.p.putShort(10, this.q.e);
        this.p.putInt(12, 0);
        if (this.q.g <= 0) {
            this.q.g = b();
        }
        this.p.putInt(16, this.q.g);
        this.p.putInt(20, this.q.h);
        byte[] bArr = new byte[this.q.a];
        this.p.position(0);
        this.p.get(bArr);
        int h = h(bArr);
        this.p.putInt(12, h);
        this.q.f = h;
        this.p.position(0);
        this.p.get(bArr);
        this.p = null;
        return bArr;
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final /* bridge */ /* synthetic */ Object x() {
        return this.q;
    }
}
