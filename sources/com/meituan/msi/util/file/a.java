package com.meituan.msi.util.file;

import android.util.Base64;
import com.meituan.msi.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, InterfaceC0499a> b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.util.file.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0499a {
        public static final Charset c = StandardCharsets.UTF_8;

        String a(ByteBuffer byteBuffer);

        ByteBuffer a(String str) throws Exception;
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("ascii", new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.1
            public static ChangeQuickRedirect a;
            private final Charset b = StandardCharsets.US_ASCII;

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b28656f21e5c9609bf306822d1e42da2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b28656f21e5c9609bf306822d1e42da2") : new String(h.a(byteBuffer), this.b);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd2a2c613fc4dd8dd52562ae760cea1", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd2a2c613fc4dd8dd52562ae760cea1") : ByteBuffer.wrap(str.getBytes(this.b));
            }
        });
        InterfaceC0499a interfaceC0499a = new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9146eb224df99e617e6a6bf45f8cf7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9146eb224df99e617e6a6bf45f8cf7") : new String(Base64.encode(h.a(byteBuffer), 2), c);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87a7fd8b22cead70292cd212b25e152", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87a7fd8b22cead70292cd212b25e152") : ByteBuffer.wrap(Base64.decode(str.getBytes(c), 2));
            }
        };
        b.put("base64", interfaceC0499a);
        b.put("binary", interfaceC0499a);
        b.put("hex", new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1606d6fa629c2f19c49856e41c8ee4bb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1606d6fa629c2f19c49856e41c8ee4bb") : new BigInteger(1, h.a(byteBuffer)).toString(16);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d6cd6bbe88255e07c1aa29edc2a9c6", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d6cd6bbe88255e07c1aa29edc2a9c6") : ByteBuffer.wrap(new BigInteger(str, 16).toByteArray());
            }
        });
        InterfaceC0499a interfaceC0499a2 = new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.4
            public static ChangeQuickRedirect a;
            public final Charset b = Charset.forName("ISO-10646-UCS-2");

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f904102774ab39a02284e4dcc0c466c1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f904102774ab39a02284e4dcc0c466c1");
                }
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                return new String(h.a(byteBuffer), this.b);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aeed73d8319b5cfbcd20bfd5d150804", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aeed73d8319b5cfbcd20bfd5d150804") : ByteBuffer.wrap(str.getBytes(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            }
        };
        b.put("ucs2", interfaceC0499a2);
        b.put("ucs-2", interfaceC0499a2);
        InterfaceC0499a interfaceC0499a3 = new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.5
            public static ChangeQuickRedirect a;
            public final Charset b = StandardCharsets.UTF_16LE;

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6b32b5c600a37b812dbae733bc26a4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6b32b5c600a37b812dbae733bc26a4");
                }
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                return new String(h.a(byteBuffer), this.b);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a0d8f8cdae0a5652e0655952361304", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a0d8f8cdae0a5652e0655952361304") : ByteBuffer.wrap(str.getBytes(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            }
        };
        b.put("utf16le", interfaceC0499a3);
        b.put("utf-16le", interfaceC0499a3);
        InterfaceC0499a interfaceC0499a4 = new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b50f931a7ee5f8e80c4f1efa7330ff0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b50f931a7ee5f8e80c4f1efa7330ff0") : new String(h.a(byteBuffer), c);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd95562b12c2408c514c051c5604e83", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd95562b12c2408c514c051c5604e83") : ByteBuffer.wrap(str.getBytes(c));
            }
        };
        b.put("utf8", interfaceC0499a4);
        b.put("utf-8", interfaceC0499a4);
        b.put("latin1", new InterfaceC0499a() { // from class: com.meituan.msi.util.file.a.7
            public static ChangeQuickRedirect a;
            private final Charset b = StandardCharsets.ISO_8859_1;

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7cebb64e46e325eb7c382f11e0c7472", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7cebb64e46e325eb7c382f11e0c7472") : new String(h.a(byteBuffer), this.b);
            }

            @Override // com.meituan.msi.util.file.a.InterfaceC0499a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bafa4bffcb179db3bedc80b51cbc0b0a", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bafa4bffcb179db3bedc80b51cbc0b0a") : ByteBuffer.wrap(str.getBytes(this.b));
            }
        });
    }

    public static InterfaceC0499a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b409d350fb5693c9a9fcf3ae2d2d5f6", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0499a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b409d350fb5693c9a9fcf3ae2d2d5f6") : b.get(str);
    }
}
