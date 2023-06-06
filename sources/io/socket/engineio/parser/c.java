package io.socket.engineio.parser;

import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.tencent.smtt.sdk.TbsListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c {
    private static final int a = "2147483647".length();
    private static final Map<String, Integer> b = new HashMap<String, Integer>() { // from class: io.socket.engineio.parser.c.1
        {
            put(MarketingModel.TYPE_ENTER_DIALOG, 0);
            put("close", 1);
            put("ping", 2);
            put("pong", 3);
            put("message", 4);
            put("upgrade", 5);
            put("noop", 6);
        }
    };
    private static final Map<Integer, String> c = new HashMap();
    private static io.socket.engineio.parser.b<String> d;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a<T> {
        boolean a(io.socket.engineio.parser.b<T> bVar, int i, int i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface b<T> {
        void a(T t);
    }

    static {
        for (Map.Entry<String, Integer> entry : b.entrySet()) {
            c.put(entry.getValue(), entry.getKey());
        }
        d = new io.socket.engineio.parser.b<>("error", "parser error");
    }

    public static void a(io.socket.engineio.parser.b bVar, b bVar2) throws io.socket.utf8.b {
        a(bVar, false, bVar2);
    }

    private static void a(io.socket.engineio.parser.b bVar, boolean z, b bVar2) throws io.socket.utf8.b {
        if (bVar.b instanceof byte[]) {
            b(bVar, bVar2);
            return;
        }
        String valueOf = String.valueOf(b.get(bVar.a));
        if (bVar.b != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(z ? io.socket.utf8.a.a(String.valueOf(bVar.b)) : String.valueOf(bVar.b));
            valueOf = sb.toString();
        }
        bVar2.a(valueOf);
    }

    private static void b(io.socket.engineio.parser.b<byte[]> bVar, b<byte[]> bVar2) {
        byte[] bArr = bVar.b;
        byte[] bArr2 = new byte[bArr.length + 1];
        bArr2[0] = b.get(bVar.a).byteValue();
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        bVar2.a(bArr2);
    }

    public static io.socket.engineio.parser.b<String> a(String str) {
        return a(str, false);
    }

    private static io.socket.engineio.parser.b<String> a(String str, boolean z) {
        int i;
        int i2;
        if (str == null) {
            return d;
        }
        try {
            i = Character.getNumericValue(str.charAt(0));
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (z) {
            try {
                int[] b2 = io.socket.utf8.a.b(str);
                io.socket.utf8.a.a = b2;
                io.socket.utf8.a.b = b2.length;
                io.socket.utf8.a.c = 0;
                ArrayList arrayList = new ArrayList();
                while (io.socket.utf8.a.c <= io.socket.utf8.a.b) {
                    if (io.socket.utf8.a.c == io.socket.utf8.a.b) {
                        i2 = -1;
                    } else {
                        i2 = io.socket.utf8.a.a[io.socket.utf8.a.c] & 255;
                        io.socket.utf8.a.c++;
                        if ((i2 & 128) != 0) {
                            if ((i2 & TbsListener.ErrorCode.EXCEED_INCR_UPDATE) == 192) {
                                i2 = ((i2 & 31) << 6) | io.socket.utf8.a.a();
                                if (i2 < 128) {
                                    throw new io.socket.utf8.b("Invalid continuation byte");
                                }
                            } else if ((i2 & 240) == 224) {
                                i2 = ((i2 & 15) << 12) | (io.socket.utf8.a.a() << 6) | io.socket.utf8.a.a();
                                if (i2 >= 2048) {
                                    io.socket.utf8.a.a(i2);
                                } else {
                                    throw new io.socket.utf8.b("Invalid continuation byte");
                                }
                            } else {
                                if ((i2 & 248) == 240) {
                                    i2 = ((i2 & 15) << 18) | (io.socket.utf8.a.a() << 12) | (io.socket.utf8.a.a() << 6) | io.socket.utf8.a.a();
                                    if (i2 >= 65536) {
                                        if (i2 > 1114111) {
                                        }
                                    }
                                }
                                throw new io.socket.utf8.b("Invalid continuation byte");
                            }
                        }
                    }
                    if (i2 != -1) {
                        arrayList.add(Integer.valueOf(i2));
                    } else {
                        str = io.socket.utf8.a.a(io.socket.utf8.a.a(arrayList));
                    }
                }
                throw new io.socket.utf8.b("Invalid byte index");
            } catch (io.socket.utf8.b unused2) {
                return d;
            }
        }
        if (i < 0 || i >= c.size()) {
            return d;
        }
        if (str.length() > 1) {
            return new io.socket.engineio.parser.b<>(c.get(Integer.valueOf(i)), str.substring(1));
        }
        return new io.socket.engineio.parser.b<>(c.get(Integer.valueOf(i)));
    }

    public static io.socket.engineio.parser.b<byte[]> a(byte[] bArr) {
        byte b2 = bArr[0];
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr2.length);
        return new io.socket.engineio.parser.b<>(c.get(Integer.valueOf(b2)), bArr2);
    }

    public static void a(io.socket.engineio.parser.b[] bVarArr, b<byte[]> bVar) throws io.socket.utf8.b {
        if (bVarArr.length == 0) {
            bVar.a(new byte[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList(bVarArr.length);
        for (io.socket.engineio.parser.b bVar2 : bVarArr) {
            a(bVar2, true, new b() { // from class: io.socket.engineio.parser.c.2
                @Override // io.socket.engineio.parser.c.b
                public final void a(Object obj) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        String valueOf = String.valueOf(str.length());
                        byte[] bArr = new byte[valueOf.length() + 2];
                        bArr[0] = 0;
                        int i = 0;
                        while (i < valueOf.length()) {
                            int i2 = i + 1;
                            bArr[i2] = (byte) Character.getNumericValue(valueOf.charAt(i));
                            i = i2;
                        }
                        bArr[bArr.length - 1] = -1;
                        arrayList.add(io.socket.engineio.parser.a.a(new byte[][]{bArr, c.b(str)}));
                        return;
                    }
                    byte[] bArr2 = (byte[]) obj;
                    String valueOf2 = String.valueOf(bArr2.length);
                    byte[] bArr3 = new byte[valueOf2.length() + 2];
                    bArr3[0] = 1;
                    int i3 = 0;
                    while (i3 < valueOf2.length()) {
                        int i4 = i3 + 1;
                        bArr3[i4] = (byte) Character.getNumericValue(valueOf2.charAt(i3));
                        i3 = i4;
                    }
                    bArr3[bArr3.length - 1] = -1;
                    arrayList.add(io.socket.engineio.parser.a.a(new byte[][]{bArr3, bArr2}));
                }
            });
        }
        bVar.a(io.socket.engineio.parser.a.a((byte[][]) arrayList.toArray(new byte[arrayList.size()])));
    }

    public static void a(String str, a<String> aVar) {
        if (str == null || str.length() == 0) {
            aVar.a(d, 0, 1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        StringBuilder sb2 = sb;
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (':' != charAt) {
                sb2.append(charAt);
            } else {
                try {
                    int parseInt = Integer.parseInt(sb2.toString());
                    int i2 = i + 1;
                    try {
                        String substring = str.substring(i2, i2 + parseInt);
                        if (substring.length() != 0) {
                            io.socket.engineio.parser.b<String> a2 = a(substring, true);
                            if (d.a.equals(a2.a) && d.b.equals(a2.b)) {
                                aVar.a(d, 0, 1);
                                return;
                            } else if (!aVar.a(a2, i + parseInt, length)) {
                                return;
                            }
                        }
                        i += parseInt;
                        sb2 = new StringBuilder();
                    } catch (IndexOutOfBoundsException unused) {
                        aVar.a(d, 0, 1);
                        return;
                    }
                } catch (NumberFormatException unused2) {
                    aVar.a(d, 0, 1);
                    return;
                }
            }
            i++;
        }
        if (sb2.length() > 0) {
            aVar.a(d, 0, 1);
        }
    }

    public static void a(byte[] bArr, a aVar) {
        boolean z;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (wrap.capacity() > 0) {
                StringBuilder sb = new StringBuilder();
                boolean z2 = (wrap.get(0) & 255) == 0;
                int i = 1;
                while (true) {
                    int i2 = wrap.get(i) & 255;
                    if (i2 == 255) {
                        z = false;
                        break;
                    } else if (sb.length() > a) {
                        z = true;
                        break;
                    } else {
                        sb.append(i2);
                        i++;
                    }
                }
                if (z) {
                    aVar.a(d, 0, 1);
                    return;
                }
                wrap.position(sb.length() + 1);
                ByteBuffer slice = wrap.slice();
                int parseInt = Integer.parseInt(sb.toString());
                slice.position(1);
                int i3 = parseInt + 1;
                slice.limit(i3);
                byte[] bArr2 = new byte[slice.remaining()];
                slice.get(bArr2);
                if (z2) {
                    arrayList.add(b(bArr2));
                } else {
                    arrayList.add(bArr2);
                }
                slice.clear();
                slice.position(i3);
                wrap = slice.slice();
            } else {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj = arrayList.get(i4);
                    if (obj instanceof String) {
                        aVar.a(a((String) obj, true), i4, size);
                    } else if (obj instanceof byte[]) {
                        aVar.a(a((byte[]) obj), i4, size);
                    }
                }
                return;
            }
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.appendCodePoint(b2 & 255);
        }
        return sb.toString();
    }

    static /* synthetic */ byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) Character.codePointAt(str, i);
        }
        return bArr;
    }
}
