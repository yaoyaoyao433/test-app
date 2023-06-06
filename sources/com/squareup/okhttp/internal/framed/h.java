package com.squareup.okhttp.internal.framed;

import com.dianping.titans.utils.Constants;
import com.dianping.titans.utils.LocalIdUtils;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    private static final f[] a = {new f(f.e, ""), new f(f.b, "GET"), new f(f.b, "POST"), new f(f.c, "/"), new f(f.c, "/index.html"), new f(f.d, "http"), new f(f.d, "https"), new f(f.a, BasicPushStatus.SUCCESS_CODE), new f(f.a, "204"), new f(f.a, "206"), new f(f.a, "304"), new f(f.a, "400"), new f(f.a, "404"), new f(f.a, "500"), new f("accept-charset", ""), new f("accept-encoding", "gzip, deflate"), new f("accept-language", ""), new f("accept-ranges", ""), new f("accept", ""), new f("access-control-allow-origin", ""), new f("age", ""), new f("allow", ""), new f(TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION, ""), new f("cache-control", ""), new f("content-disposition", ""), new f("content-encoding", ""), new f("content-language", ""), new f("content-length", ""), new f("content-location", ""), new f("content-range", ""), new f("content-type", ""), new f("cookie", ""), new f("date", ""), new f(Constants.HTTP_HEADER_KEY_E_TAG, ""), new f("expect", ""), new f("expires", ""), new f("from", ""), new f("host", ""), new f("if-match", ""), new f("if-modified-since", ""), new f("if-none-match", ""), new f("if-range", ""), new f("if-unmodified-since", ""), new f(Constants.HTTP_HEADER_KEY_LAST_MODIFIED, ""), new f(RegionLinkDao.TABLENAME, ""), new f("location", ""), new f("max-forwards", ""), new f("proxy-authenticate", ""), new f("proxy-authorization", ""), new f("range", ""), new f(com.meituan.metrics.common.Constants.TRAFFIC_REFERER, ""), new f("refresh", ""), new f("retry-after", ""), new f(LocalIdUtils.FROM_SERVER, ""), new f("set-cookie", ""), new f("strict-transport-security", ""), new f("transfer-encoding", ""), new f("user-agent", ""), new f("vary", ""), new f("via", ""), new f("www-authenticate", "")};
    private static final Map<okio.f, Integer> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        for (int i = 0; i < a.length; i++) {
            if (!linkedHashMap.containsKey(a[i].h)) {
                linkedHashMap.put(a[i].h, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a {
        int a;
        int b;
        private final okio.e h;
        private final List<f> g = new ArrayList();
        f[] c = new f[8];
        int d = this.c.length - 1;
        int e = 0;
        int f = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, s sVar) {
            this.a = i;
            this.b = i;
            this.h = okio.m.a(sVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            if (this.b < this.f) {
                if (this.b == 0) {
                    d();
                } else {
                    a(this.f - this.b);
                }
            }
        }

        private void d() {
            this.g.clear();
            Arrays.fill(this.c, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    if (length < this.d || i <= 0) {
                        break;
                    }
                    i -= this.c[length].j;
                    this.f -= this.c[length].j;
                    this.e--;
                    i2++;
                }
                System.arraycopy(this.c, this.d + 1, this.c, this.d + 1 + i2, this.e);
                this.d += i2;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void b() throws IOException {
            while (!this.h.d()) {
                int g = this.h.g() & 255;
                if (g == 128) {
                    throw new IOException("index == 0");
                }
                if ((g & 128) == 128) {
                    int a = a(g, 127) - 1;
                    if (d(a)) {
                        this.g.add(h.a[a]);
                    } else {
                        int b = b(a - h.a.length);
                        if (b < 0 || b > this.c.length - 1) {
                            throw new IOException("Header index too large " + (a + 1));
                        }
                        this.g.add(this.c[b]);
                    }
                } else if (g == 64) {
                    a(-1, new f(h.a(f()), f()));
                } else if ((g & 64) == 64) {
                    a(-1, new f(c(a(g, 63) - 1), f()));
                } else if ((g & 32) == 32) {
                    this.b = a(g, 31);
                    if (this.b < 0 || this.b > this.a) {
                        throw new IOException("Invalid dynamic table size update " + this.b);
                    }
                    a();
                } else if (g == 16 || g == 0) {
                    this.g.add(new f(h.a(f()), f()));
                } else {
                    this.g.add(new f(c(a(g, 15) - 1), f()));
                }
            }
        }

        public final List<f> c() {
            ArrayList arrayList = new ArrayList(this.g);
            this.g.clear();
            return arrayList;
        }

        private int b(int i) {
            return this.d + 1 + i;
        }

        private okio.f c(int i) {
            return d(i) ? h.a[i].h : this.c[b(i - h.a.length)].h;
        }

        private static boolean d(int i) {
            return i >= 0 && i <= h.a.length - 1;
        }

        private void a(int i, f fVar) {
            this.g.add(fVar);
            int i2 = fVar.j;
            if (i2 > this.b) {
                d();
                return;
            }
            a((this.f + i2) - this.b);
            if (this.e + 1 > this.c.length) {
                f[] fVarArr = new f[this.c.length * 2];
                System.arraycopy(this.c, 0, fVarArr, this.c.length, this.c.length);
                this.d = this.c.length - 1;
                this.c = fVarArr;
            }
            int i3 = this.d;
            this.d = i3 - 1;
            this.c[i3] = fVar;
            this.e++;
            this.f += i2;
        }

        private int e() throws IOException {
            return this.h.g() & 255;
        }

        private int a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int e = e();
                if ((e & 128) == 0) {
                    return i2 + (e << i4);
                }
                i2 += (e & 127) << i4;
                i4 += 7;
            }
        }

        private okio.f f() throws IOException {
            int e = e();
            boolean z = (e & 128) == 128;
            int a = a(e, 127);
            if (z) {
                return okio.f.a(j.a().a(this.h.h(a)));
            }
            return this.h.d(a);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class b {
        private final okio.c a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(okio.c cVar) {
            this.a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(List<f> list) throws IOException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                okio.f g = list.get(i).h.g();
                Integer num = (Integer) h.b.get(g);
                if (num != null) {
                    a(num.intValue() + 1, 15, 0);
                    a(list.get(i).i);
                } else {
                    this.a.h(0);
                    a(g);
                    a(list.get(i).i);
                }
            }
        }

        private void a(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.a.h(i | 0);
                return;
            }
            this.a.h(i2 | 0);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.a.h(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.a.h(i4);
        }

        private void a(okio.f fVar) throws IOException {
            a(fVar.h(), 127, 0);
            this.a.c(fVar);
        }
    }

    static /* synthetic */ okio.f a(okio.f fVar) throws IOException {
        int h = fVar.h();
        for (int i = 0; i < h; i++) {
            byte a2 = fVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.a());
            }
        }
        return fVar;
    }
}
