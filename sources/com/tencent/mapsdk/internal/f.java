package com.tencent.mapsdk.internal;

import com.meituan.robust.common.CommonConstant;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends e {
    public static final int h = 4;
    static HashMap<String, byte[]> i;
    static HashMap<String, HashMap<String, byte[]>> j;
    protected h g = new h();
    private int k = 0;
    private int l = 0;

    public f() {
        this.g.a = (short) 2;
    }

    private f(boolean z) {
        if (z) {
            g();
        } else {
            this.g.a = (short) 2;
        }
    }

    private int h() {
        return this.g.a;
    }

    @Override // com.tencent.mapsdk.internal.e, com.tencent.mapsdk.internal.c
    public final <T> void a(String str, T t) {
        if (str.startsWith(CommonConstant.Symbol.DOT)) {
            throw new IllegalArgumentException("put name can not startwith . , now is ".concat(String.valueOf(str)));
        }
        super.a(str, (String) t);
    }

    @Override // com.tencent.mapsdk.internal.e
    public final void g() {
        super.g();
        this.g.a = (short) 3;
    }

    private int i() {
        return this.k;
    }

    @Override // com.tencent.mapsdk.internal.e, com.tencent.mapsdk.internal.c
    public final byte[] f() {
        if (this.g.a == 2) {
            if (this.g.e == null || this.g.e.equals("")) {
                throw new IllegalArgumentException("servantName can not is null");
            }
            if (this.g.f == null || this.g.f.equals("")) {
                throw new IllegalArgumentException("funcName can not is null");
            }
        } else {
            if (this.g.e == null) {
                this.g.e = "";
            }
            if (this.g.f == null) {
                this.g.f = "";
            }
        }
        n nVar = new n(0);
        nVar.a(this.c);
        if (this.g.a == 2 || this.g.a == 1) {
            nVar.a((Map) this.a, 0);
        } else {
            nVar.a((Map) this.e, 0);
        }
        this.g.g = q.a(nVar.a);
        n nVar2 = new n(0);
        nVar2.a(this.c);
        this.g.writeTo(nVar2);
        byte[] a = q.a(nVar2.a);
        int length = a.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a).flip();
        return allocate.array();
    }

    @Override // com.tencent.mapsdk.internal.e
    public final void b(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        try {
            m mVar = new m(bArr, (byte) 0);
            mVar.a(this.c);
            this.g.readFrom(mVar);
            j();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void j() {
        m mVar = new m(this.g.g);
        mVar.a(this.c);
        if (i == null) {
            HashMap<String, byte[]> hashMap = new HashMap<>();
            i = hashMap;
            hashMap.put("", new byte[0]);
        }
        this.e = mVar.a((Map) i, 0, false);
    }

    @Override // com.tencent.mapsdk.internal.e
    public final void c(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        allocate.put(bArr2).flip();
        this.k = allocate.getInt();
        try {
            m mVar = new m(bArr, (byte) 0);
            mVar.a(this.c);
            this.g.readFrom(mVar);
            k();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void k() {
        m mVar = new m(this.g.g);
        mVar.a(this.c);
        if (j == null) {
            j = new HashMap<>();
            HashMap<String, byte[]> hashMap = new HashMap<>();
            hashMap.put("", new byte[0]);
            j.put("", hashMap);
        }
        this.a = mVar.a((Map) j, 0, false);
        this.b = new HashMap<>();
    }

    @Override // com.tencent.mapsdk.internal.e, com.tencent.mapsdk.internal.c
    public final void a(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        allocate.put(bArr2).flip();
        this.k = allocate.getInt();
        try {
            m mVar = new m(bArr, (byte) 0);
            mVar.a(this.c);
            this.g.readFrom(mVar);
            if (this.g.a == 3) {
                j();
                return;
            }
            this.e = null;
            k();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String l() {
        return this.g.e;
    }

    public final void c(String str) {
        this.g.e = str;
    }

    private String m() {
        return this.g.f;
    }

    public final void d(String str) {
        this.g.f = str;
    }

    private int n() {
        return this.g.d;
    }

    private void a(int i2) {
        this.g.d = i2;
    }

    private void a(n nVar) {
        this.g.writeTo(nVar);
    }

    private void a(m mVar) {
        this.g.readFrom(mVar);
    }

    private void a(StringBuilder sb, int i2) {
        this.g.display(sb, i2);
    }

    private f o() {
        f fVar = new f();
        fVar.g.d = this.g.d;
        fVar.c(this.g.e);
        fVar.d(this.g.f);
        fVar.a(this.c);
        fVar.g.a = this.g.a;
        return fVar;
    }

    private byte[] p() {
        n nVar = new n(0);
        nVar.a(this.c);
        nVar.a((Map) this.a, 0);
        byte[] a = q.a(nVar.a);
        n nVar2 = new n(0);
        nVar2.a(this.c);
        nVar2.a(this.g.a, 1);
        nVar2.a(this.g.b, 2);
        nVar2.a(this.g.d, 3);
        nVar2.a(this.g.c, 4);
        nVar2.a(this.l, 5);
        nVar2.a(a, 6);
        nVar2.a((Map) this.g.j, 7);
        return q.a(nVar2.a);
    }

    private int q() {
        return this.l;
    }

    private void b(int i2) {
        this.l = i2;
    }
}
