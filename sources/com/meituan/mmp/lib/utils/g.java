package com.meituan.mmp.lib.utils;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final Map<String, a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        public static final Charset c = Charset.forName("UTF-8");

        String a(ByteBuffer byteBuffer);

        ByteBuffer a(String str) throws Exception;
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("ascii", new a() { // from class: com.meituan.mmp.lib.utils.g.1
            public static ChangeQuickRedirect a;
            private final Charset b = Charset.forName("US-ASCII");

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e8576b852c241b63a96026e48881388", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e8576b852c241b63a96026e48881388") : new String(x.a(byteBuffer), this.b);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7ad50a33fb96baa6fa8297c9e68ffa", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7ad50a33fb96baa6fa8297c9e68ffa") : ByteBuffer.wrap(str.getBytes(this.b));
            }
        });
        a aVar = new a() { // from class: com.meituan.mmp.lib.utils.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3fa9b56cb838e6265f973b176b821a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3fa9b56cb838e6265f973b176b821a1") : new String(Base64.encode(x.a(byteBuffer), 2), c);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa242ee6ebfc883d994e62447b0db61", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa242ee6ebfc883d994e62447b0db61") : ByteBuffer.wrap(Base64.decode(str.getBytes(c), 2));
            }
        };
        b.put("base64", aVar);
        b.put("binary", aVar);
        b.put("hex", new a() { // from class: com.meituan.mmp.lib.utils.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0648678df56a0c42fc43b4f279c137d2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0648678df56a0c42fc43b4f279c137d2") : new BigInteger(1, x.a(byteBuffer)).toString(16);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a45b750c7a169ffa848052fa132d3c", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a45b750c7a169ffa848052fa132d3c") : ByteBuffer.wrap(new BigInteger(str, 16).toByteArray());
            }
        });
        a aVar2 = new a() { // from class: com.meituan.mmp.lib.utils.g.4
            public static ChangeQuickRedirect a;
            public Charset b = Charset.forName("ISO-10646-UCS-2");

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa7c360404256d92a0a30d1ce79ea7ee", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa7c360404256d92a0a30d1ce79ea7ee");
                }
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                return new String(x.a(byteBuffer), this.b);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794c00b3fb9a55f8ea7a5205b20d1b22", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794c00b3fb9a55f8ea7a5205b20d1b22") : ByteBuffer.wrap(str.getBytes(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            }
        };
        b.put("ucs2", aVar2);
        b.put("ucs-2", aVar2);
        a aVar3 = new a() { // from class: com.meituan.mmp.lib.utils.g.5
            public static ChangeQuickRedirect a;
            public Charset b = Charset.forName("UTF-16LE");

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7d4c39f9015e4deba97df2b5736ebe", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7d4c39f9015e4deba97df2b5736ebe");
                }
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                return new String(x.a(byteBuffer), this.b);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d949c818c9a37ff69ca4790aaa77d0d5", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d949c818c9a37ff69ca4790aaa77d0d5") : ByteBuffer.wrap(str.getBytes(this.b)).order(ByteOrder.LITTLE_ENDIAN);
            }
        };
        b.put("utf16le", aVar3);
        b.put("utf-16le", aVar3);
        a aVar4 = new a() { // from class: com.meituan.mmp.lib.utils.g.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98906fc66d734eac46c4b41f405dfff8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98906fc66d734eac46c4b41f405dfff8") : new String(x.a(byteBuffer), c);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a108077808264acfbe3432d1c8333f07", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a108077808264acfbe3432d1c8333f07") : ByteBuffer.wrap(str.getBytes(c));
            }
        };
        b.put("utf8", aVar4);
        b.put("utf-8", aVar4);
        b.put("latin1", new a() { // from class: com.meituan.mmp.lib.utils.g.7
            public static ChangeQuickRedirect a;
            private final Charset b = Charset.forName(CommonConstant.Encoding.ISO88591);

            @Override // com.meituan.mmp.lib.utils.g.a
            public final String a(ByteBuffer byteBuffer) {
                Object[] objArr = {byteBuffer};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f557169dae2fa548bdc95599bb5150", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f557169dae2fa548bdc95599bb5150") : new String(x.a(byteBuffer), this.b);
            }

            @Override // com.meituan.mmp.lib.utils.g.a
            public final ByteBuffer a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd818fbb51450d1c1f3b8b55a85da61", RobustBitConfig.DEFAULT_VALUE) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd818fbb51450d1c1f3b8b55a85da61") : ByteBuffer.wrap(str.getBytes(this.b));
            }
        });
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a77a7099aad1119efdf9470532f846a9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a77a7099aad1119efdf9470532f846a9") : b.get(str);
    }
}
