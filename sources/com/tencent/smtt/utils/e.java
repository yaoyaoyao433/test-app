package com.tencent.smtt.utils;

import android.util.Log;
import com.meituan.robust.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UnknownFormatConversionException;
/* loaded from: classes6.dex */
public class e implements Closeable {
    static final char[] a = {127, 'E', Constants.OBJECT_TYPE, 'F', 0};
    final char[] b = new char[16];
    boolean c;
    j[] d;
    l[] e;
    byte[] f;
    private final com.tencent.smtt.utils.c g;
    private final a h;
    private final k[] i;
    private byte[] j;

    /* loaded from: classes6.dex */
    public static abstract class a {
        short a;
        short b;
        int c;
        int d;
        short e;
        short f;
        short g;
        short h;
        short i;
        short j;

        abstract long a();

        abstract long b();
    }

    /* loaded from: classes6.dex */
    static class b extends a {
        int k;
        int l;
        int m;

        b() {
        }

        @Override // com.tencent.smtt.utils.e.a
        long a() {
            return this.m;
        }

        @Override // com.tencent.smtt.utils.e.a
        long b() {
            return this.l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class c extends j {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        c() {
        }
    }

    /* loaded from: classes6.dex */
    static class d extends k {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        d() {
        }

        @Override // com.tencent.smtt.utils.e.k
        public int a() {
            return this.d;
        }

        @Override // com.tencent.smtt.utils.e.k
        public long b() {
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.smtt.utils.e$e  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1499e extends l {
        int a;
        int b;

        C1499e() {
        }
    }

    /* loaded from: classes6.dex */
    static class f extends a {
        long k;
        long l;
        long m;

        f() {
        }

        @Override // com.tencent.smtt.utils.e.a
        long a() {
            return this.m;
        }

        @Override // com.tencent.smtt.utils.e.a
        long b() {
            return this.l;
        }
    }

    /* loaded from: classes6.dex */
    public static class g extends j {
        long a;
        long b;
        long c;
        long d;
        long e;
        long f;

        g() {
        }
    }

    /* loaded from: classes6.dex */
    static class h extends k {
        long a;
        long b;
        long c;
        long d;
        long e;
        long f;

        h() {
        }

        @Override // com.tencent.smtt.utils.e.k
        public int a() {
            return (int) this.d;
        }

        @Override // com.tencent.smtt.utils.e.k
        public long b() {
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class i extends l {
        long a;
        long b;

        i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static abstract class j {
        int g;
        int h;

        j() {
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class k {
        int g;
        int h;
        int i;
        int j;

        public abstract int a();

        public abstract long b();
    }

    /* loaded from: classes6.dex */
    public static abstract class l {
        int c;
        char d;
        char e;
        short f;

        l() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(File file) throws IOException, UnknownFormatConversionException {
        b bVar;
        com.tencent.smtt.utils.c cVar = new com.tencent.smtt.utils.c(file);
        this.g = cVar;
        cVar.a(this.b);
        if (!a()) {
            throw new UnknownFormatConversionException("Invalid elf magic: " + file);
        }
        cVar.a(e());
        boolean d2 = d();
        if (d2) {
            f fVar = new f();
            fVar.a = cVar.a();
            fVar.b = cVar.a();
            fVar.c = cVar.b();
            fVar.k = cVar.c();
            fVar.l = cVar.c();
            fVar.m = cVar.c();
            bVar = fVar;
        } else {
            b bVar2 = new b();
            bVar2.a = cVar.a();
            bVar2.b = cVar.a();
            bVar2.c = cVar.b();
            bVar2.k = cVar.b();
            bVar2.l = cVar.b();
            bVar2.m = cVar.b();
            bVar = bVar2;
        }
        this.h = bVar;
        a aVar = this.h;
        aVar.d = cVar.b();
        aVar.e = cVar.a();
        aVar.f = cVar.a();
        aVar.g = cVar.a();
        aVar.h = cVar.a();
        aVar.i = cVar.a();
        aVar.j = cVar.a();
        this.i = new k[aVar.i];
        for (int i2 = 0; i2 < aVar.i; i2++) {
            cVar.a(aVar.a() + (aVar.h * i2));
            if (d2) {
                h hVar = new h();
                hVar.g = cVar.b();
                hVar.h = cVar.b();
                hVar.a = cVar.c();
                hVar.b = cVar.c();
                hVar.c = cVar.c();
                hVar.d = cVar.c();
                hVar.i = cVar.b();
                hVar.j = cVar.b();
                hVar.e = cVar.c();
                hVar.f = cVar.c();
                this.i[i2] = hVar;
            } else {
                d dVar = new d();
                dVar.g = cVar.b();
                dVar.h = cVar.b();
                dVar.a = cVar.b();
                dVar.b = cVar.b();
                dVar.c = cVar.b();
                dVar.d = cVar.b();
                dVar.i = cVar.b();
                dVar.j = cVar.b();
                dVar.e = cVar.b();
                dVar.f = cVar.b();
                this.i[i2] = dVar;
            }
        }
        if (aVar.j < 0 || aVar.j >= this.i.length) {
            throw new UnknownFormatConversionException("Invalid e_shstrndx=" + ((int) aVar.j));
        }
        k kVar = this.i[aVar.j];
        if (kVar.h != 3) {
            throw new UnknownFormatConversionException("Wrong string section e_shstrndx=" + ((int) aVar.j));
        }
        this.j = new byte[kVar.a()];
        cVar.a(kVar.b());
        cVar.a(this.j);
        if (this.c) {
            f();
        }
    }

    public static boolean a(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
            long readInt = randomAccessFile.readInt();
            randomAccessFile.close();
            return readInt == 2135247942;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean b(File file) {
        String str;
        StringBuilder sb;
        if (g() && a(file)) {
            try {
                new e(file);
                return true;
            } catch (IOException e) {
                Log.e("ELF", "checkElfFile IOException: " + e);
                return false;
            } catch (UnknownFormatConversionException e2) {
                e = e2;
                str = "ELF";
                sb = new StringBuilder("checkElfFile UnknownFormatConversionException: ");
                sb.append(e);
                Log.e(str, sb.toString());
                return true;
            } catch (Throwable th) {
                e = th;
                str = "ELF";
                sb = new StringBuilder("checkElfFile Throwable: ");
                sb.append(e);
                Log.e(str, sb.toString());
                return true;
            }
        }
        return true;
    }

    private void f() throws IOException {
        a aVar = this.h;
        com.tencent.smtt.utils.c cVar = this.g;
        boolean d2 = d();
        k a2 = a(".dynsym");
        if (a2 != null) {
            cVar.a(a2.b());
            int a3 = a2.a() / (d2 ? 24 : 16);
            this.e = new l[a3];
            char[] cArr = new char[1];
            for (int i2 = 0; i2 < a3; i2++) {
                if (d2) {
                    i iVar = new i();
                    iVar.c = cVar.b();
                    cVar.a(cArr);
                    iVar.d = cArr[0];
                    cVar.a(cArr);
                    iVar.e = cArr[0];
                    iVar.a = cVar.c();
                    iVar.b = cVar.c();
                    iVar.f = cVar.a();
                    this.e[i2] = iVar;
                } else {
                    C1499e c1499e = new C1499e();
                    c1499e.c = cVar.b();
                    c1499e.a = cVar.b();
                    c1499e.b = cVar.b();
                    cVar.a(cArr);
                    c1499e.d = cArr[0];
                    cVar.a(cArr);
                    c1499e.e = cArr[0];
                    c1499e.f = cVar.a();
                    this.e[i2] = c1499e;
                }
            }
            k kVar = this.i[a2.i];
            cVar.a(kVar.b());
            this.f = new byte[kVar.a()];
            cVar.a(this.f);
        }
        this.d = new j[aVar.g];
        for (int i3 = 0; i3 < aVar.g; i3++) {
            cVar.a(aVar.b() + (aVar.f * i3));
            if (d2) {
                g gVar = new g();
                gVar.g = cVar.b();
                gVar.h = cVar.b();
                gVar.a = cVar.c();
                gVar.b = cVar.c();
                gVar.c = cVar.c();
                gVar.d = cVar.c();
                gVar.e = cVar.c();
                gVar.f = cVar.c();
                this.d[i3] = gVar;
            } else {
                c cVar2 = new c();
                cVar2.g = cVar.b();
                cVar2.h = cVar.b();
                cVar2.a = cVar.b();
                cVar2.b = cVar.b();
                cVar2.c = cVar.b();
                cVar2.d = cVar.b();
                cVar2.e = cVar.b();
                cVar2.f = cVar.b();
                this.d[i3] = cVar2;
            }
        }
    }

    private static boolean g() {
        String property = System.getProperty("java.vm.version");
        return property != null && property.startsWith("2");
    }

    public final k a(String str) {
        k[] kVarArr;
        for (k kVar : this.i) {
            if (str.equals(a(kVar.g))) {
                return kVar;
            }
        }
        return null;
    }

    public final String a(int i2) {
        if (i2 == 0) {
            return "SHN_UNDEF";
        }
        int i3 = i2;
        while (this.j[i3] != 0) {
            i3++;
        }
        return new String(this.j, i2, i3 - i2);
    }

    final boolean a() {
        return this.b[0] == a[0];
    }

    final char b() {
        return this.b[4];
    }

    final char c() {
        return this.b[5];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
    }

    public final boolean d() {
        return b() == 2;
    }

    public final boolean e() {
        return c() == 1;
    }
}
