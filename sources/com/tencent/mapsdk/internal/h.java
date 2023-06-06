package com.tencent.mapsdk.internal;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends p {
    public short a;
    public byte b;
    public int c;
    public int d;
    public String e;
    public String f;
    public byte[] g;
    public int h;
    public Map<String, String> i;
    public Map<String, String> j;
    static final /* synthetic */ boolean m = !h.class.desiredAssertionStatus();
    static byte[] k = null;
    static Map<String, String> l = null;

    public h() {
        this.a = (short) 0;
        this.b = (byte) 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.h = 0;
    }

    private h(short s, byte b, int i, int i2, String str, String str2, byte[] bArr, int i3, Map<String, String> map, Map<String, String> map2) {
        this.a = (short) 0;
        this.b = (byte) 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.h = 0;
        this.a = s;
        this.b = b;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = bArr;
        this.h = i3;
        this.i = map;
        this.j = map2;
    }

    public final boolean equals(Object obj) {
        h hVar = (h) obj;
        return q.a(1, (int) hVar.a) && q.a(1, (int) hVar.b) && q.a(1, hVar.c) && q.a(1, hVar.d) && q.a((Object) 1, (Object) hVar.e) && q.a((Object) 1, (Object) hVar.f) && q.a((Object) 1, (Object) hVar.g) && q.a(1, hVar.h) && q.a((Object) 1, (Object) hVar.i) && q.a((Object) 1, (Object) hVar.j);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (m) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.a, 1);
        nVar.a(this.b, 2);
        nVar.a(this.c, 3);
        nVar.a(this.d, 4);
        nVar.a(this.e, 5);
        nVar.a(this.f, 6);
        nVar.a(this.g, 7);
        nVar.a(this.h, 8);
        nVar.a((Map) this.i, 9);
        nVar.a((Map) this.j, 10);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        try {
            this.a = mVar.a(this.a, 1, true);
            this.b = mVar.a(this.b, 2, true);
            this.c = mVar.a(this.c, 3, true);
            this.d = mVar.a(this.d, 4, true);
            this.e = mVar.b(5, true);
            this.f = mVar.b(6, true);
            if (k == null) {
                k = new byte[]{0};
            }
            this.g = mVar.c(7, true);
            this.h = mVar.a(this.h, 8, true);
            if (l == null) {
                HashMap hashMap = new HashMap();
                l = hashMap;
                hashMap.put("", "");
            }
            this.i = (Map) mVar.a((m) l, 9, true);
            if (l == null) {
                HashMap hashMap2 = new HashMap();
                l = hashMap2;
                hashMap2.put("", "");
            }
            this.j = (Map) mVar.a((m) l, 10, true);
        } catch (Exception e) {
            e.printStackTrace();
            PrintStream printStream = System.out;
            printStream.println("RequestPacket decode error " + i.a(this.g));
            throw new RuntimeException(e);
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.a, "iVersion");
        kVar.a(this.b, "cPacketType");
        kVar.a(this.c, "iMessageType");
        kVar.a(this.d, "iRequestId");
        kVar.a(this.e, "sServantName");
        kVar.a(this.f, "sFuncName");
        kVar.a(this.g, "sBuffer");
        kVar.a(this.h, "iTimeout");
        kVar.a((Map) this.i, "context");
        kVar.a((Map) this.j, "status");
    }
}
