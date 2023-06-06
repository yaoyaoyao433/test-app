package com.meituan.dio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    protected final Comparator<? super a> b;
    protected final g c;
    protected c d;
    protected a[] e;
    protected boolean f;

    public e(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e448d3ba310f71e776a93171f0f8060c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e448d3ba310f71e776a93171f0f8060c");
            return;
        }
        this.b = new Comparator<a>() { // from class: com.meituan.dio.e.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(a aVar, a aVar2) {
                a aVar3 = aVar;
                a aVar4 = aVar2;
                Object[] objArr2 = {aVar3, aVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c44994667900420b55c9b620203cd52", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c44994667900420b55c9b620203cd52")).intValue();
                }
                if (aVar3 == aVar4) {
                    return 0;
                }
                if (aVar3 == null) {
                    return 1;
                }
                if (aVar4 == null) {
                    return -1;
                }
                return aVar3.b.compareTo(aVar4.b);
            }
        };
        this.f = false;
        this.c = new f(file);
    }

    public e(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff115bba846830ba9388468a5a0ac6d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff115bba846830ba9388468a5a0ac6d9");
            return;
        }
        this.b = new Comparator<a>() { // from class: com.meituan.dio.e.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(a aVar, a aVar2) {
                a aVar3 = aVar;
                a aVar4 = aVar2;
                Object[] objArr2 = {aVar3, aVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c44994667900420b55c9b620203cd52", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c44994667900420b55c9b620203cd52")).intValue();
                }
                if (aVar3 == aVar4) {
                    return 0;
                }
                if (aVar3 == null) {
                    return 1;
                }
                if (aVar4 == null) {
                    return -1;
                }
                return aVar3.b.compareTo(aVar4.b);
            }
        };
        this.f = false;
        if (gVar == null) {
            throw new NullPointerException();
        }
        this.c = gVar;
    }

    public final a[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bfb5a66760e8700adcda667501fb547", RobustBitConfig.DEFAULT_VALUE)) {
            return (a[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bfb5a66760e8700adcda667501fb547");
        }
        if (this.e == null) {
            throw new IllegalStateException("Entries is null. Did you forget to call readEntries?");
        }
        return this.e;
    }

    private static c a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "972b610c0ee803b8ce14065013f8eede", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "972b610c0ee803b8ce14065013f8eede");
        }
        byte[] bArr = new byte[16];
        if (inputStream.read(bArr) != 16) {
            throw new IOException("The size of header is illegal!");
        }
        if (com.meituan.dio.utils.a.a(bArr, 0, false) != -1624407522) {
            throw new IOException("The file type is not DIO!");
        }
        return new c(com.meituan.dio.utils.a.a(bArr, 4, false) ^ (-517418247), com.meituan.dio.utils.a.a(bArr, 8, false) ^ (-517418247), com.meituan.dio.utils.a.a(bArr, 12, false) ^ (-517418247));
    }

    private static a[] a(InputStream inputStream, c cVar) throws IOException {
        Object[] objArr = {inputStream, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e5a0a3c556af38763aab41eb0d0edaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e5a0a3c556af38763aab41eb0d0edaa");
        }
        byte[] bArr = new byte[cVar.b];
        if (inputStream.read(bArr) != cVar.b) {
            throw new IOException("The size of indexes is illegal!");
        }
        a[] aVarArr = new a[cVar.c];
        int i = cVar.b + 16;
        int i2 = 0;
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            b bVar = new b(com.meituan.dio.utils.a.a(bArr, i2, false) ^ (-517418247));
            int i4 = i2 + 4;
            int a2 = com.meituan.dio.utils.a.a(bArr, i4, false) ^ (-517418247);
            int i5 = i4 + 4;
            int a3 = (-517418247) ^ com.meituan.dio.utils.a.a(bArr, i5, false);
            int i6 = i5 + 4;
            if (bVar.b) {
                com.meituan.dio.utils.g.a(bArr, i6, a3, (byte) -85);
            }
            try {
                String str = new String(bArr, i6, a3, StandardCharsets.UTF_8);
                i2 = i6 + a3;
                int i7 = i + 1;
                aVarArr[i3] = new a(str, a2, i7, bVar);
                i = i7 + a2;
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
        return aVarArr;
    }

    public final a[] b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9044ddfb1d9766ec8e0b3284830b2c", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9044ddfb1d9766ec8e0b3284830b2c") : a(false);
    }

    private a[] a(boolean z) throws IOException {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b4e596bb9e515e6ebcf505b29bc8c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b4e596bb9e515e6ebcf505b29bc8c8");
        }
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e != null) {
                return this.e;
            }
            InputStream c = this.c.c();
            if (this.d == null) {
                this.d = a(c);
            }
            this.e = a(c, this.d);
            a[] aVarArr = this.e;
            if (c != null) {
                c.close();
            }
            return aVarArr;
        }
    }

    public final File c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5713d4db608a8166a38731c38209ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5713d4db608a8166a38731c38209ff");
        }
        if (this.c instanceof f) {
            return ((f) this.c).b();
        }
        return null;
    }

    public final byte[] a(a aVar, boolean z) throws IOException {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a926ad542900f7a3abf97ecc8aff10", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a926ad542900f7a3abf97ecc8aff10");
        }
        if (aVar == null) {
            throw new NullPointerException("dioEntry can't be null");
        }
        if (!(this.c instanceof f) ? false : z ? 1 : 0) {
            FileChannel channel = ((f) this.c).c().getChannel();
            try {
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, aVar.c(), aVar.b());
                byte[] bArr = new byte[aVar.b()];
                map.get(bArr);
                if (aVar.d().a()) {
                    Object[] objArr2 = {bArr, (byte) -85};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.dio.utils.g.a;
                    bArr = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "93816ddcf74603581eb9abbcc7c9714f", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "93816ddcf74603581eb9abbcc7c9714f") : com.meituan.dio.utils.g.a(bArr, 0, bArr.length, (byte) -85);
                }
                if (channel != null) {
                    channel.close();
                }
                return bArr;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel != null) {
                        if (th != null) {
                            try {
                                channel.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        } else {
                            channel.close();
                        }
                    }
                    throw th2;
                }
            }
        }
        return com.meituan.dio.utils.c.a(a(aVar));
    }

    public final InputStream a(a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf8cb563c16436a6fdd80182ea809b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf8cb563c16436a6fdd80182ea809b6");
        }
        InputStream c = this.c.c();
        if (c == null) {
            return null;
        }
        if (aVar == null) {
            throw new NullPointerException("dioEntry can't be null");
        }
        return new d(c, aVar);
    }

    public static boolean a(e eVar, boolean z) {
        c cVar;
        Object[] objArr = {eVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eb9e2f2d6a61e754385b2b8737b1a42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eb9e2f2d6a61e754385b2b8737b1a42")).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        try {
            if (eVar.a() != null) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "d8f88caedd66dbbe1bc394f68833d1a9", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (c) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "d8f88caedd66dbbe1bc394f68833d1a9");
            } else if (eVar.d == null) {
                throw new IllegalStateException("Entries is null. Did you forget to call readEntries or readHeader?");
            } else {
                cVar = eVar.d;
            }
            if (cVar != null) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        try {
            return eVar.b() != null;
        } catch (Throwable unused3) {
            return false;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "903988798c011aadbfbf5361492a0b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "903988798c011aadbfbf5361492a0b0b");
        } else if (this.f) {
        } else {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                Arrays.sort(a(), this.b);
                this.f = true;
            }
        }
    }

    public final int a(String str, Comparator<? super a> comparator) throws IOException {
        Object[] objArr = {str, comparator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d19ac024b8e089e6509725040cee5fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d19ac024b8e089e6509725040cee5fe")).intValue();
        }
        if (com.meituan.dio.utils.f.a(str)) {
            return -1;
        }
        b();
        if (comparator == null) {
            comparator = this.b;
        }
        a aVar = new a(str, -1, -1, null);
        if (this.f) {
            int binarySearch = Arrays.binarySearch(this.e, aVar, comparator);
            if (binarySearch < 0) {
                return -1;
            }
            return binarySearch;
        }
        for (int i = 0; i < this.e.length; i++) {
            if (comparator.compare(this.e[i], aVar) == 0) {
                return i;
            }
        }
        return -1;
    }

    public final a b(String str, Comparator<? super a> comparator) throws IOException {
        Object[] objArr = {str, comparator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d5b1536188623881a4b9d7f4d5cd57c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d5b1536188623881a4b9d7f4d5cd57c");
        }
        int a2 = a(str, comparator);
        if (a2 < 0) {
            return null;
        }
        return this.e[a2];
    }

    public final a a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff236034628ddbfd4aadbe0b1615f86f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff236034628ddbfd4aadbe0b1615f86f") : b(str, null);
    }
}
