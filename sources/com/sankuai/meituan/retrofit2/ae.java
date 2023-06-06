package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.apache.http.entity.mime.MIME;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ae implements ak {
    public static ChangeQuickRedirect a;
    public static final ad b = ad.a("multipart/mixed");
    public static final ad c = ad.a("multipart/alternative");
    public static final ad d = ad.a("multipart/digest");
    public static final ad e = ad.a("multipart/parallel");
    public static final ad f = ad.a("multipart/form-data");
    private static final byte[] g = {58, 32};
    private static final byte[] h = {13, 10};
    private static final byte[] i = {45, 45};
    private final String j;
    private final ad k;
    private final ad l;
    private final List<b> m;
    private long n;

    public ae(String str, ad adVar, List<b> list) {
        Object[] objArr = {str, adVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7238143dd2ede6c4cbd88fa2dd6a3c93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7238143dd2ede6c4cbd88fa2dd6a3c93");
            return;
        }
        this.n = -1L;
        this.j = str;
        this.k = adVar;
        this.l = ad.a(adVar + "; boundary=" + str);
        this.m = av.a((List) list);
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final String contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd32593f7731c49ed2d16845ead35628", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd32593f7731c49ed2d16845ead35628") : this.l.toString();
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ec1d8b9201c4141903ac84559c8612", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ec1d8b9201c4141903ac84559c8612")).longValue();
        }
        long j = this.n;
        if (j != -1) {
            return j;
        }
        try {
            this.n = a((OutputStream) null, true);
        } catch (Throwable unused) {
            this.n = -1L;
        }
        return this.n;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final void writeTo(OutputStream outputStream) throws IOException {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84191f54f36eedb16cc61126119dc025", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84191f54f36eedb16cc61126119dc025");
        } else {
            a(outputStream, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    private long a(OutputStream outputStream, boolean z) throws IOException {
        List<q> list;
        Object[] objArr = {outputStream, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb05d8f03b924b71dd9897ec895282e", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb05d8f03b924b71dd9897ec895282e")).longValue();
        }
        ?? r2 = 0;
        if (z) {
            outputStream = new ByteArrayOutputStream();
            r2 = outputStream;
        }
        int size = this.m.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.m.get(i2);
            r rVar = bVar.b;
            ak akVar = bVar.c;
            outputStream.write(i);
            outputStream.write(this.j.getBytes("UTF-8"));
            outputStream.write(h);
            if (rVar != null && (list = rVar.b) != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    q qVar = list.get(i3);
                    outputStream.write(qVar.b.getBytes("UTF-8"));
                    outputStream.write(g);
                    outputStream.write(qVar.c.getBytes("UTF-8"));
                    outputStream.write(h);
                }
            }
            String contentType = akVar.contentType();
            if (contentType != null && !contentType.isEmpty()) {
                outputStream.write(("Content-Type: " + contentType).getBytes("UTF-8"));
                outputStream.write(h);
            }
            long contentLength = akVar.contentLength();
            if (contentLength != -1) {
                outputStream.write(("Content-Length: " + contentLength).getBytes("UTF-8"));
                outputStream.write(h);
            } else if (z) {
                ((ByteArrayOutputStream) outputStream).reset();
                return -1L;
            }
            outputStream.write(h);
            if (z) {
                j += contentLength;
            } else {
                akVar.writeTo(outputStream);
            }
            outputStream.write(h);
        }
        outputStream.write(i);
        outputStream.write(this.j.getBytes("UTF-8"));
        outputStream.write(i);
        outputStream.write(h);
        if (z) {
            long size3 = j + r2.size();
            r2.reset();
            return size3;
        }
        return j;
    }

    public static StringBuilder a(StringBuilder sb, String str) {
        Object[] objArr = {sb, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99f8dbaff622a5fe467096ea0c7a76a4", 6917529027641081856L)) {
            return (StringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99f8dbaff622a5fe467096ea0c7a76a4");
        }
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        return sb;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b {
        public static ChangeQuickRedirect a;
        private final r b;
        private final ak c;

        public static b a(String str, String str2, ak akVar) {
            Object[] objArr = {str, str2, akVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e50571639f6f17874d58c77d4c77a277", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e50571639f6f17874d58c77d4c77a277");
            }
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            ae.a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                ae.a(sb, str2);
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put(MIME.CONTENT_DISPOSITION, sb.toString());
            return a(r.a(hashMap), akVar);
        }

        public static b a(r rVar, ak akVar) {
            Object[] objArr = {rVar, akVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce34a1a8afda771d0d752a304255b300", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce34a1a8afda771d0d752a304255b300");
            }
            if (akVar == null) {
                throw new NullPointerException("body == null");
            }
            if (rVar != null && rVar.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (rVar != null && rVar.a("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new b(rVar, akVar);
        }

        private b(r rVar, ak akVar) {
            Object[] objArr = {rVar, akVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9265dec85470ee8e31d8bce876c08316", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9265dec85470ee8e31d8bce876c08316");
                return;
            }
            this.b = rVar;
            this.c = akVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        private final String b;
        private ad c;
        private final List<b> d;

        public a() {
            this(UUID.randomUUID().toString());
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f861d05deb6a71d3d46acb0764d2526", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f861d05deb6a71d3d46acb0764d2526");
            }
        }

        private a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d40921bad09ab4977ff24b62dc84b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d40921bad09ab4977ff24b62dc84b3");
                return;
            }
            this.c = ae.b;
            this.d = new ArrayList();
            this.b = str;
        }

        public final a a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d271d9e73bdf136917f4b4e153519553", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d271d9e73bdf136917f4b4e153519553");
            }
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.d.add(bVar);
            return this;
        }

        public final a a(r rVar, ak akVar) {
            Object[] objArr = {rVar, akVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2cd23a6afbf6316a7782acbf187152", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2cd23a6afbf6316a7782acbf187152") : a(b.a(rVar, akVar));
        }

        public final ae a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954fd2504612e62144d40069e725104f", 6917529027641081856L)) {
                return (ae) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954fd2504612e62144d40069e725104f");
            }
            if (this.d.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new ae(this.b, this.c, this.d);
        }

        public final a a(ad adVar) {
            Object[] objArr = {adVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a320e44446362f7a6ba4cfd8d09c89f0", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a320e44446362f7a6ba4cfd8d09c89f0");
            }
            if (adVar == null) {
                throw new NullPointerException("type == null");
            }
            if (!adVar.b.equals("multipart")) {
                throw new IllegalArgumentException("multipart != " + adVar);
            }
            this.c = adVar;
            return this;
        }
    }
}
