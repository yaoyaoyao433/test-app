package com.meituan.android.common.mtguard.wtscore.plugin.sign.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SparseArray<String> d;
    private static final Map<String, String> e;
    public c b;
    public static final /* synthetic */ boolean c = !d.class.desiredAssertionStatus();
    public static final String a = d.class.getSimpleName();

    /* renamed from: com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 implements Comparator<Map.Entry<String, String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass1() {
        }

        private static int a(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            Object[] objArr = {entry, entry2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "011d65b035418fe648ca6eec45499d98", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "011d65b035418fe648ca6eec45499d98")).intValue() : entry.getValue().compareTo(entry2.getValue());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            return entry.getValue().compareTo(entry2.getValue());
        }
    }

    /* renamed from: com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 implements Comparator<Map.Entry<String, String>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass2() {
        }

        private static int a(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            Object[] objArr = {entry, entry2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03b46d89068987c317dacafc8dd00e6d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03b46d89068987c317dacafc8dd00e6d")).intValue() : entry.getKey().compareTo(entry2.getKey());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            return entry.getKey().compareTo(entry2.getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a<K, V> implements Map.Entry<K, V> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final K b;
        private V c;

        public a(K k, V v) {
            Object[] objArr = {d.this, k, v};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe1408436c6b65e3a21862e60bb43c5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe1408436c6b65e3a21862e60bb43c5d");
                return;
            }
            this.b = k;
            this.c = v;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.c;
            this.c = v;
            return v2;
        }
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>(5);
        d = sparseArray;
        sparseArray.put(33, "%21");
        d.put(39, "%27");
        d.put(40, "%28");
        d.put(41, "%29");
        d.put(42, "%2A");
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("!", "%21");
        e.put("#", "%23");
        e.put(CommonConstant.Symbol.DOLLAR, "%24");
        e.put("&", "%26");
        e.put(CommonConstant.Symbol.SINGLE_QUOTES, "%27");
        e.put(CommonConstant.Symbol.BRACKET_LEFT, "%28");
        e.put(CommonConstant.Symbol.BRACKET_RIGHT, "%29");
        e.put("*", "%2A");
        e.put("+", "%2B");
        e.put(CommonConstant.Symbol.COMMA, "%2C");
        e.put("/", "%2F");
        e.put(CommonConstant.Symbol.COLON, "%3A");
        e.put(";", "%3B");
        e.put("=", "%3D");
        e.put(CommonConstant.Symbol.QUESTION_MARK, "%3F");
        e.put("@", "%40");
        e.put("[", "%5B");
        e.put(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, "%5D");
        e.put("\n", "%0A");
        e.put("\r", "%0D");
        e.put(StringUtil.CRLF_STRING, "%0D%0A");
        e.put(StringUtil.SPACE, "%20");
        e.put(CommonConstant.Symbol.DOUBLE_QUOTES, "%22");
        e.put("%", "%25");
        e.put(CommonConstant.Symbol.MINUS, "%2D");
        e.put(CommonConstant.Symbol.DOT, "%2E");
        e.put("<", "%3C");
        e.put(">", "%3E");
        e.put(CommonConstant.Symbol.SLASH_RIGHT, "%5C");
        e.put(CommonConstant.Symbol.XOR, "%5E");
        e.put(CommonConstant.Symbol.UNDERLINE, "%5F");
        e.put("`", "%60");
        e.put(CommonConstant.Symbol.BIG_BRACKET_LEFT, "%7B");
        e.put(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "%7C");
        e.put(CommonConstant.Symbol.BIG_BRACKET_RIGHT, "%7D");
        e.put("~", "%7E");
    }

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f29afb8f74796761b6667c17fae3a8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f29afb8f74796761b6667c17fae3a8e");
        } else {
            this.b = cVar;
        }
    }

    private String a(Uri.Builder builder) throws Exception {
        StringBuilder sb;
        String i;
        byte[] bArr;
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb6d6be678f9111dc19c19b068512147", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb6d6be678f9111dc19c19b068512147");
        }
        if (builder == null) {
            throw new Exception(a + "getParametersSignature builder is null");
        } else if (this.b == null) {
            throw new Exception(a + "baseString candyOriginalMaterial is null");
        } else {
            if (TextUtils.isEmpty(this.b.i())) {
                sb = new StringBuilder();
                sb.append("");
                i = "/";
            } else {
                sb = new StringBuilder();
                sb.append("");
                i = this.b.i();
            }
            sb.append(i);
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                throw new Exception(a + "getParametersSignature normalizedURI is null");
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, builder, false);
            List<Map.Entry<String, String>> a2 = a(arrayList);
            Collections.sort(a2, new AnonymousClass1());
            Collections.sort(a2, new AnonymousClass2());
            String str = this.b.j() + StringUtil.SPACE + sb2 + StringUtil.SPACE + b(a2);
            if (this.b.c() == null) {
                bArr = str.getBytes();
            } else {
                byte[] bytes = str.getBytes();
                int min = Math.min(this.b.c().length, 16200);
                byte[] bArr2 = new byte[bytes.length + min];
                System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
                System.arraycopy(this.b.c(), 0, bArr2, bytes.length, min);
                bArr = bArr2;
            }
            if (bArr.length == 0) {
                return null;
            }
            byte[] bytes2 = this.b.f().getBytes();
            if (bArr == null) {
                return "-2003";
            }
            Object[] main3 = NBridge.main3(2, new Object[]{MTGuard.sAppKey, bArr, bytes2});
            if (main3 == null) {
                return "-1001";
            }
            if (main3[0] instanceof Integer) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(main3[0]);
                return sb3.toString();
            }
            return (String) main3[0];
        }
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eda2b2fdec368169124c2c62e8b1d8ac", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eda2b2fdec368169124c2c62e8b1d8ac");
        }
        String encode = Uri.encode(str, "-._~");
        if (encode == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < encode.length(); i++) {
            char charAt = encode.charAt(i);
            String str2 = d.get(charAt);
            if (str2 == null) {
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    private void a(List<Map.Entry<String, String>> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58e965873808a49c10301dfd631cb04e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58e965873808a49c10301dfd631cb04e");
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=", 2);
                if (split.length > 0) {
                    a(list, split.length == 1 ? new a(split[0], "") : new a(split[0], split[1]));
                }
            }
        }
    }

    private static void a(List<Map.Entry<String, String>> list, Map.Entry<String, String> entry) {
        Object[] objArr = {list, entry};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ec586efb8a27db5054349db140624a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ec586efb8a27db5054349db140624a8");
        } else if (TextUtils.isEmpty(entry.getKey())) {
        } else {
            list.add(entry);
        }
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14c1ad83009035806faed87d1bed5045", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14c1ad83009035806faed87d1bed5045");
        }
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            String str2 = d.get(charAt);
            if (str2 == null) {
                stringBuffer.append(charAt);
            } else {
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    public static String b(List<Map.Entry<String, String>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b092c347c901a12d3af3fe9e76cdb472", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b092c347c901a12d3af3fe9e76cdb472");
        }
        String str = "";
        for (Map.Entry<String, String> entry : list) {
            str = str + entry.getKey() + "=" + entry.getValue() + "&";
        }
        return str.endsWith("&") ? str.subSequence(0, str.length() - 1).toString() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> b() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d.b():java.util.Map");
    }

    private URI c() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e16829b3d19759ca8ebd6f6c14f23dc0", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e16829b3d19759ca8ebd6f6c14f23dc0") : URI.create(a().toString());
    }

    private void c(List<Map.Entry<String, String>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afad575e8c8ea30f89e844e32c0b414e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afad575e8c8ea30f89e844e32c0b414e");
            return;
        }
        Collections.sort(list, new AnonymousClass1());
        Collections.sort(list, new AnonymousClass2());
    }

    private String d() throws Exception {
        StringBuilder sb;
        String i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e0c743f1413d62d4bc0dc55bb335893", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e0c743f1413d62d4bc0dc55bb335893");
        }
        if (this.b == null) {
            throw new Exception(a + "baseString candyOriginalMaterial is null");
        }
        if (TextUtils.isEmpty(this.b.i())) {
            sb = new StringBuilder();
            sb.append("");
            i = "/";
        } else {
            sb = new StringBuilder();
            sb.append("");
            i = this.b.i();
        }
        sb.append(i);
        return sb.toString();
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "967c0678269072e3cd62341d4573d69f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "967c0678269072e3cd62341d4573d69f")).booleanValue();
        }
        Map<String, String> l = this.b.l();
        if (l == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : l.entrySet()) {
            if (entry.getKey().equalsIgnoreCase("content-encoding") && entry.getValue().toLowerCase(Locale.getDefault()).contains("gzip")) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        boolean z;
        String e2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8989377dc895349d1ba5746fe345c422", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8989377dc895349d1ba5746fe345c422")).booleanValue();
        }
        Map<String, String> l = this.b.l();
        if (l != null) {
            for (Map.Entry<String, String> entry : l.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("content-encoding") && entry.getValue().toLowerCase(Locale.getDefault()).contains("gzip")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return (z || (e2 = this.b.e()) == null || !e2.contains(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM)) ? false : true;
    }

    public final Uri.Builder a() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b9267431b2ea04b4ceebf8353bf500", 6917529027641081856L)) {
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b9267431b2ea04b4ceebf8353bf500");
        }
        if (this.b == null) {
            throw new Exception(a + "CandyOriginalMaterial is null");
        } else if (this.b.k() != null) {
            return Uri.parse(this.b.k().toASCIIString()).buildUpon();
        } else {
            throw new Exception(a + "finalURI is null");
        }
    }

    public final List<Map.Entry<String, String>> a(List<Map.Entry<String, String>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c87eed5be47f95e30c28409f1537fcda", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c87eed5be47f95e30c28409f1537fcda");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : list) {
            arrayList.add(new a(a(entry.getKey()), a(entry.getValue())));
        }
        return arrayList;
    }

    public final void a(List<Map.Entry<String, String>> list, Uri.Builder builder, boolean z) {
        Object[] objArr = {list, builder, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c82ea92a5fb25f2615d929574d6f1081", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c82ea92a5fb25f2615d929574d6f1081");
        } else if (builder != null && builder.build() != null) {
            String encodedQuery = builder.build().getEncodedQuery();
            ArrayList arrayList = new ArrayList();
            a(arrayList, encodedQuery);
            for (Map.Entry<String, String> entry : arrayList) {
                a(list, new a(Uri.decode(entry.getKey()), Uri.decode(entry.getValue())));
            }
        }
    }
}
