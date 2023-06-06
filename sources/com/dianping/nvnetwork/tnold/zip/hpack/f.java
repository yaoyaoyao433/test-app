package com.dianping.nvnetwork.tnold.zip.hpack;

import com.dianping.nvnetwork.tnold.zip.hpack.h;
import com.dianping.nvnetwork.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okhttp3.internal.http2.Header;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements com.dianping.nvnetwork.tnold.zip.f {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("HpackEncoder");
    private static final g c = new g("Hpack encoding failed");
    private static final byte[] d = new byte[0];
    private static final Set<String> e;
    private int f;
    private int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final a[] k;
    private final a l;
    private int m;
    private int n;

    static {
        HashSet hashSet = new HashSet();
        e = hashSet;
        hashSet.add(":m-shark-check-sum");
        e.add(":m-shark-request-id");
        e.add("M-SHARK-TRACEID");
        e.add(Header.TARGET_PATH_UTF8);
    }

    public f() {
        this(4096, true, true, false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984ee08b5bd0d54145d738ad8b13c3e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984ee08b5bd0d54145d738ad8b13c3e8");
        }
    }

    private f(int i, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {4096, (byte) 1, (byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438e5449144b11aaa5901152db4e0f36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438e5449144b11aaa5901152db4e0f36");
            return;
        }
        this.f = 0;
        this.g = 0;
        this.k = new a[17];
        byte[] bArr = d;
        this.l = new a(-1, bArr, bArr, Integer.MAX_VALUE, null);
        this.h = true;
        this.i = true;
        this.j = false;
        this.n = 4096;
        a aVar = this.l;
        a aVar2 = this.l;
        a aVar3 = this.l;
        aVar2.f = aVar3;
        aVar.e = aVar3;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.f
    public final byte[] a(v vVar, boolean z) throws Exception {
        Object[] objArr = {vVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7337fc7a8920a9b6ccd4435831446ba4", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7337fc7a8920a9b6ccd4435831446ba4");
        }
        com.dianping.nvnetwork.tnold.f a2 = com.dianping.nvnetwork.tnold.f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvnetwork.tnold.f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5609a18f8eb31f4906365d97ff27747a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5609a18f8eb31f4906365d97ff27747a");
        } else if (a2.b && a2.c) {
            throw new g("mock hpack compress exception");
        }
        try {
            com.dianping.nvnetwork.tnold.zip.h.a(vVar);
            long currentTimeMillis = System.currentTimeMillis();
            byte[] a3 = a(a(vVar));
            com.dianping.nvnetwork.tnold.g.a(z, vVar.a, currentTimeMillis, System.currentTimeMillis(), this.g, this.f);
            return a3;
        } catch (Exception e2) {
            e2.printStackTrace();
            throw c;
        }
    }

    @Override // com.dianping.nvnetwork.tnold.zip.f
    public final com.dianping.nvnetwork.tnold.zip.g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1765438a30aa032c915166266bae9b33", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tnold.zip.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1765438a30aa032c915166266bae9b33");
        }
        com.dianping.nvnetwork.tnold.zip.g gVar = new com.dianping.nvnetwork.tnold.zip.g(this.g, this.f);
        this.g = 0;
        this.f = 0;
        return gVar;
    }

    private List<b> a(v vVar) throws Exception {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8aeb6561e6727917660b8c2796d590", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8aeb6561e6727917660b8c2796d590");
        }
        Objects.requireNonNull(vVar.d);
        LinkedList linkedList = new LinkedList();
        Map<String, String> map = vVar.d;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedList.add(new b(key, value));
            sb.append(key);
            sb.append(value);
        }
        URL url = new URL(vVar.i);
        String protocol = url.getProtocol();
        linkedList.add(new b(Header.TARGET_SCHEME_UTF8, protocol));
        sb.append(Header.TARGET_SCHEME_UTF8);
        sb.append(protocol);
        String host = url.getHost();
        int port = url.getPort();
        if (port >= 0) {
            host = host + CommonConstant.Symbol.COLON + port;
        }
        linkedList.add(new b(Header.TARGET_AUTHORITY_UTF8, host));
        sb.append(Header.TARGET_AUTHORITY_UTF8);
        sb.append(host);
        String path = url.getPath();
        if (com.dianping.nvtunnelkit.utils.f.b(path)) {
            linkedList.add(new b(Header.TARGET_PATH_UTF8, path));
            sb.append(Header.TARGET_PATH_UTF8);
            sb.append(path);
        }
        String query = url.getQuery();
        if (com.dianping.nvtunnelkit.utils.f.b(query)) {
            linkedList.add(new b(":m-shark-query", query));
            sb.append(":m-shark-query");
            sb.append(query);
        }
        linkedList.add(new b(Header.TARGET_METHOD_UTF8, vVar.h));
        sb.append(Header.TARGET_METHOD_UTF8);
        sb.append(vVar.h);
        linkedList.add(new b(":m-shark-request-id", vVar.c));
        sb.append(":m-shark-request-id");
        sb.append(vVar.c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(vVar.f);
        linkedList.add(new b(":m-shark-time-out", sb2.toString()));
        sb.append(":m-shark-time-out");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(vVar.f);
        sb.append(sb3.toString());
        linkedList.add(new b(":m-shark-check-sum".getBytes(h.b), MessageDigest.getInstance("MD5").digest(com.dianping.nvnetwork.tnold.zip.h.a(sb.toString()))));
        return linkedList;
    }

    private byte[] a(List<b> list) throws IOException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999baba10318505c5a6b01357b10198a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999baba10318505c5a6b01357b10198a");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (b bVar : list) {
            String str = new String(bVar.b, h.b);
            int a2 = b.a(bVar.b, bVar.c);
            this.g += a2 - 32;
            if (e.contains(str) || a2 > 512) {
                a((OutputStream) byteArrayOutputStream, bVar.b, bVar.c, true);
            } else {
                a((OutputStream) byteArrayOutputStream, bVar.b, bVar.c, false);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f = byteArray.length;
        return byteArray;
    }

    private void a(OutputStream outputStream, byte[] bArr, byte[] bArr2, boolean z) throws IOException {
        Object[] objArr = {outputStream, bArr, bArr2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e81621de6d8db43b777814c3b9154e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e81621de6d8db43b777814c3b9154e");
        } else if (z) {
            a(outputStream, bArr, bArr2, h.a.NEVER, a(bArr));
        } else if (this.n == 0) {
            int a2 = l.a(bArr, bArr2);
            if (a2 == -1) {
                a(outputStream, bArr, bArr2, h.a.NONE, l.a(bArr));
            } else {
                a(outputStream, 128, 7, a2);
            }
        } else {
            int a3 = b.a(bArr, bArr2);
            if (a3 > this.n) {
                a(outputStream, bArr, bArr2, h.a.NONE, a(bArr));
                return;
            }
            a a4 = a(bArr, bArr2);
            if (a4 != null) {
                a(outputStream, 128, 7, b(a4.i) + l.b);
                return;
            }
            int a5 = l.a(bArr, bArr2);
            if (a5 != -1) {
                a(outputStream, 128, 7, a5);
                return;
            }
            int a6 = a(bArr);
            if (this.h) {
                a(a3);
            }
            a(outputStream, bArr, bArr2, this.h ? h.a.INCREMENTAL : h.a.NONE, a6);
            if (this.h) {
                b(bArr, bArr2);
            }
        }
    }

    private static void a(OutputStream outputStream, int i, int i2, int i3) throws IOException {
        Object[] objArr = {outputStream, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e5455245ded482b511cb35f463dda63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e5455245ded482b511cb35f463dda63");
        } else if (i2 < 0 || i2 > 8) {
            throw new IllegalArgumentException("N: " + i2);
        } else {
            int i4 = 255 >>> (8 - i2);
            if (i3 < i4) {
                outputStream.write(i | i3);
                return;
            }
            outputStream.write(i | i4);
            int i5 = i3 - i4;
            while ((i5 & (-128)) != 0) {
                outputStream.write((i5 & 127) | 128);
                i5 >>>= 7;
            }
            outputStream.write(i5);
        }
    }

    private void a(OutputStream outputStream, byte[] bArr) throws IOException {
        int i;
        Object[] objArr = {outputStream, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cb7c1ad399929f837d05570312593e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cb7c1ad399929f837d05570312593e");
            return;
        }
        k kVar = i.b;
        Object[] objArr2 = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "e0a1210908269d62f85023feabfcdcff", 6917529027641081856L)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "e0a1210908269d62f85023feabfcdcff")).intValue();
        } else if (bArr == null) {
            throw new NullPointerException("data");
        } else {
            long j = 0;
            for (byte b2 : bArr) {
                j += kVar.b[b2 & 255];
            }
            i = (int) ((j + 7) >> 3);
        }
        if ((i < bArr.length && !this.j) || this.i) {
            a(outputStream, 128, 7, i);
            k kVar2 = i.b;
            Object[] objArr3 = {outputStream, bArr};
            ChangeQuickRedirect changeQuickRedirect3 = k.a;
            if (PatchProxy.isSupport(objArr3, kVar2, changeQuickRedirect3, false, "21694d5c3821af6da71db8a9bd63dd30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, kVar2, changeQuickRedirect3, false, "21694d5c3821af6da71db8a9bd63dd30");
                return;
            } else {
                kVar2.a(outputStream, bArr, 0, bArr.length);
                return;
            }
        }
        a(outputStream, 0, 7, bArr.length);
        outputStream.write(bArr, 0, bArr.length);
    }

    private void a(OutputStream outputStream, byte[] bArr, byte[] bArr2, h.a aVar, int i) throws IOException {
        int i2;
        int i3;
        Object[] objArr = {outputStream, bArr, bArr2, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f687600e10a55b5a4ee5b098a6302d54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f687600e10a55b5a4ee5b098a6302d54");
            return;
        }
        switch (aVar) {
            case INCREMENTAL:
                i2 = 64;
                i3 = 6;
                break;
            case NONE:
                i2 = 0;
                i3 = 4;
                break;
            case NEVER:
                i2 = 16;
                i3 = 4;
                break;
            default:
                throw new IllegalStateException("should not reach here");
        }
        a(outputStream, i2, i3, i != -1 ? i : 0);
        if (i == -1) {
            a(outputStream, bArr);
        }
        a(outputStream, bArr2);
    }

    private int a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a677b870af66a5d3e89c9b8c55f7fa3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a677b870af66a5d3e89c9b8c55f7fa3")).intValue();
        }
        int a2 = l.a(bArr);
        if (a2 == -1) {
            int b2 = b(bArr);
            return b2 >= 0 ? b2 + l.b : b2;
        }
        return a2;
    }

    private void a(int i) throws IOException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c3770a8395658f0bbbabaf218710d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c3770a8395658f0bbbabaf218710d6");
            return;
        }
        while (this.m + i > this.n && b() != 0) {
            c();
        }
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7733d29167c1f10d77bf1e5deeec56", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7733d29167c1f10d77bf1e5deeec56")).intValue();
        }
        if (this.m == 0) {
            return 0;
        }
        return (this.l.f.i - this.l.e.i) + 1;
    }

    private a a(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221fdced8a20ca73a7f941a310d63344", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221fdced8a20ca73a7f941a310d63344");
        }
        if (b() == 0 || bArr == null || bArr2 == null) {
            return null;
        }
        int c2 = c(bArr);
        for (a aVar = this.k[c2 % 17]; aVar != null; aVar = aVar.g) {
            if (aVar.h == c2 && h.a(bArr, aVar.b) && h.a(bArr2, aVar.c)) {
                return aVar;
            }
        }
        return null;
    }

    private int b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac1b3f511d73360594dfee9e6be934b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac1b3f511d73360594dfee9e6be934b")).intValue();
        }
        int i = -1;
        if (b() == 0 || bArr == null) {
            return -1;
        }
        int c2 = c(bArr);
        a aVar = this.k[c2 % 17];
        while (true) {
            if (aVar != null) {
                if (aVar.h != c2 || !h.a(bArr, aVar.b)) {
                    aVar = aVar.g;
                } else {
                    i = aVar.i;
                    break;
                }
            } else {
                break;
            }
        }
        return b(i);
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfe6fb3be25b189de08a483d1c07ebd", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfe6fb3be25b189de08a483d1c07ebd")).intValue() : i == -1 ? i : (i - this.l.e.i) + 1;
    }

    private void b(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcf43376b8f753b71f6b10fa65703d82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcf43376b8f753b71f6b10fa65703d82");
            return;
        }
        int a2 = b.a(bArr, bArr2);
        if (a2 > this.n) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e604c6a923e96413c128013608ef2775", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e604c6a923e96413c128013608ef2775");
                return;
            }
            Arrays.fill(this.k, (Object) null);
            a aVar = this.l;
            a aVar2 = this.l;
            a aVar3 = this.l;
            aVar2.f = aVar3;
            aVar.e = aVar3;
            this.m = 0;
            return;
        }
        while (this.m + a2 > this.n) {
            c();
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte[] copyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        int c2 = c(copyOf);
        int i = c2 % 17;
        a aVar4 = new a(c2, copyOf, copyOf2, this.l.e.i - 1, this.k[i]);
        this.k[i] = aVar4;
        a.a(aVar4, this.l);
        this.m += a2;
    }

    private b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5182bc69f9f6d8463512f37ab098527f", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5182bc69f9f6d8463512f37ab098527f");
        }
        if (this.m == 0) {
            return null;
        }
        a aVar = this.l.f;
        int i = aVar.h % 17;
        a aVar2 = this.k[i];
        a aVar3 = aVar2;
        while (aVar2 != null) {
            a aVar4 = aVar2.g;
            if (aVar2 == aVar) {
                if (aVar3 == aVar) {
                    this.k[i] = aVar4;
                } else {
                    aVar3.g = aVar4;
                }
                a.a(aVar);
                this.m -= aVar.a();
                return aVar;
            }
            aVar3 = aVar2;
            aVar2 = aVar4;
        }
        return null;
    }

    private static int c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b77a1694a6735b339c8e7ad0aa57493", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b77a1694a6735b339c8e7ad0aa57493")).intValue();
        }
        int i = 0;
        for (byte b2 : bArr) {
            i = (i * 31) + b2;
        }
        if (i > 0) {
            return i;
        }
        if (i == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends b {
        public static ChangeQuickRedirect d;
        public a e;
        public a f;
        public a g;
        public int h;
        public int i;

        public static /* synthetic */ void a(a aVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1346a8d211c268c7a8a3ea35276b9985", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1346a8d211c268c7a8a3ea35276b9985");
                return;
            }
            aVar.e.f = aVar.f;
            aVar.f.e = aVar.e;
            aVar.e = null;
            aVar.f = null;
            aVar.g = null;
        }

        public static /* synthetic */ void a(a aVar, a aVar2) {
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2956c2c06423d3c7d2b9492d9c1ba9c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2956c2c06423d3c7d2b9492d9c1ba9c0");
                return;
            }
            aVar.f = aVar2;
            aVar.e = aVar2.e;
            aVar.e.f = aVar;
            aVar.f.e = aVar;
        }

        public a(int i, byte[] bArr, byte[] bArr2, int i2, a aVar) {
            super(bArr, bArr2);
            Object[] objArr = {Integer.valueOf(i), bArr, bArr2, Integer.valueOf(i2), aVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235043aeae7ec0a891261dbf7cb1cf7c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235043aeae7ec0a891261dbf7cb1cf7c");
                return;
            }
            this.i = i2;
            this.h = i;
            this.g = aVar;
        }
    }
}
