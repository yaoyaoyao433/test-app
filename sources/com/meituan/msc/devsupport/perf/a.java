package com.meituan.msc.devsupport.perf;

import android.content.Context;
import com.meituan.msc.common.utils.aq;
import com.meituan.msc.util.perf.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public double d;
    public double e;
    public long f;
    public long g;
    public double h;
    public double i;
    public long j;
    public ArrayList<Long> k;
    public ArrayList<Integer> l;
    public long m;
    private final Context n;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.devsupport.perf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0439a {
        boolean a(l lVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b {
        public static ChangeQuickRedirect a;
        public double b;
        public int c;
        public double d;
        public double e;
        public double f;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06bae71f43f0c8b72bda2b38b9c34859", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06bae71f43f0c8b72bda2b38b9c34859");
                return;
            }
            this.d = -2.147483648E9d;
            this.e = 2.147483647E9d;
        }

        public final Map<String, Object> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "743793e9b94c6595fb24a7243a54c1b9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "743793e9b94c6595fb24a7243a54c1b9");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("avg", Double.valueOf(this.f));
            hashMap.put("max", Double.valueOf(this.d));
            hashMap.put("min", Double.valueOf(this.e));
            hashMap.put("count", Integer.valueOf(this.c));
            hashMap.put("totalTime", Double.valueOf(this.b));
            return hashMap;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9925606a4334d612f2a1b40345b55d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9925606a4334d612f2a1b40345b55d");
            }
            return "MSCListPerfInfo{totalTime=" + this.b + ", count=" + this.c + ", max=" + this.d + ", min=" + this.e + ", avg=" + this.f + '}';
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeec5a38d6a6823aef5823acb96e4f0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeec5a38d6a6823aef5823acb96e4f0c");
            return;
        }
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.n = context.getApplicationContext();
    }

    private long a(List<l> list, String str, String str2) {
        Object[] objArr = {list, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa03fbad824c80305f6a7ecd80399fae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa03fbad824c80305f6a7ecd80399fae")).longValue();
        }
        for (l lVar : list) {
            if (lVar.b.b.equals(str) && lVar.b.c.equals(str2)) {
                return lVar.b.g;
            }
        }
        return -1L;
    }

    public final b a(List<l> list, final String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd298e31e94eefa556c1b1a67192c3a3", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd298e31e94eefa556c1b1a67192c3a3") : a(list, new InterfaceC0439a() { // from class: com.meituan.msc.devsupport.perf.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.devsupport.perf.a.InterfaceC0439a
            public final boolean a(l lVar) {
                Object[] objArr2 = {lVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f651f9821cdfd7c0bf75c03787420ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f651f9821cdfd7c0bf75c03787420ef")).booleanValue() : str.equals(lVar.b.b);
            }
        });
    }

    public final b b(List<l> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb6e2f327d1a42e4e511a89a6bd0b8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb6e2f327d1a42e4e511a89a6bd0b8d");
        }
        final List singletonList = Collections.singletonList(str);
        Object[] objArr2 = {list, singletonList};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8245729e854c579d9b53a387f586b309", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8245729e854c579d9b53a387f586b309");
        }
        final long a2 = a(list, "list_load_total", ErrorCode.ERROR_TYPE_B);
        final long a3 = a(list, "list_load_total", "E");
        return (a3 < 0 || a2 < 0) ? new b() : a(list, new InterfaceC0439a() { // from class: com.meituan.msc.devsupport.perf.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.devsupport.perf.a.InterfaceC0439a
            public final boolean a(l lVar) {
                Object[] objArr3 = {lVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6fa9bcc29ef3189dbf51b867d73a40cf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6fa9bcc29ef3189dbf51b867d73a40cf")).booleanValue() : (singletonList.contains(lVar.b.b) || (lVar.b.j != null && lVar.b.j.optBoolean("isList"))) && lVar.b.g > a2 && lVar.b.g < a3;
            }
        });
    }

    public final b c(List<l> list, final String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c88e5d91f0577761a927d258ee66f02d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c88e5d91f0577761a927d258ee66f02d");
        }
        final long a2 = a(list, "list_load_total", "E");
        return a2 < 0 ? new b() : a(list, new InterfaceC0439a() { // from class: com.meituan.msc.devsupport.perf.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.devsupport.perf.a.InterfaceC0439a
            public final boolean a(l lVar) {
                Object[] objArr2 = {lVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3810468519123d608caa7b90fabe99c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3810468519123d608caa7b90fabe99c8")).booleanValue() : str.equals(lVar.b.b) || (lVar.b.j != null && lVar.b.j.optBoolean("isList") && lVar.b.g > a2);
            }
        });
    }

    public final b a(List<l> list, String str, boolean z) {
        Object[] objArr = {list, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6221c16c1d3030c421bf1aa00c3a5a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6221c16c1d3030c421bf1aa00c3a5a") : a(list, Collections.singletonList(str), z);
    }

    public final b a(List<l> list, final List<String> list2, final boolean z) {
        Object[] objArr = {list, list2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15110859f27ee763bfe0408f2d21064", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15110859f27ee763bfe0408f2d21064");
        }
        final long a2 = a(list, "list_load_total", "E");
        return a2 < 0 ? new b() : a(list, new InterfaceC0439a() { // from class: com.meituan.msc.devsupport.perf.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.devsupport.perf.a.InterfaceC0439a
            public final boolean a(l lVar) {
                Object[] objArr2 = {lVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8aad3d6303585f77eb2b8439b8af2180", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8aad3d6303585f77eb2b8439b8af2180")).booleanValue() : lVar.b.j != null && list2.contains(lVar.b.b) && (lVar.b.b.contains("list_") || lVar.b.j.optBoolean("isList")) && lVar.b.g > a2 && z == lVar.b.j.optBoolean("isReuseCell");
            }
        });
    }

    private b a(List<l> list, InterfaceC0439a interfaceC0439a) {
        Object[] objArr = {list, interfaceC0439a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4cf028738930b9f3a926e465355096", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4cf028738930b9f3a926e465355096");
        }
        b bVar = new b();
        LinkedList linkedList = new LinkedList();
        for (l lVar : list) {
            if (interfaceC0439a.a(lVar)) {
                String str = lVar.b.c;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 66) {
                    if (hashCode == 69 && str.equals("E")) {
                        c = 1;
                    }
                } else if (str.equals(ErrorCode.ERROR_TYPE_B)) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        linkedList.push(lVar);
                        continue;
                    case 1:
                        if (!linkedList.isEmpty()) {
                            double d = (lVar.b.g - ((l) linkedList.pop()).b.g) / 1000000;
                            bVar.b += d;
                            bVar.c++;
                            if (d > bVar.d) {
                                bVar.d = d;
                            }
                            if (d < bVar.e) {
                                bVar.e = d;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            continue;
                        }
                }
            }
        }
        if (bVar.c > 0) {
            bVar.f = bVar.b / bVar.c;
        }
        return bVar;
    }

    public final double a(List<l> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d30c1eb078729798ab830962eed01b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d30c1eb078729798ab830962eed01b4")).doubleValue();
        }
        int i = c(list, "list_bind_cell").c;
        int i2 = c(list, "list_create_cell").c;
        if (i == 0) {
            return 0.0d;
        }
        return ((i - i2) * 1.0d) / i;
    }

    public final double a() {
        if (this.c == 0) {
            return 0.0d;
        }
        return (this.b * 1.0d) / this.c;
    }

    public final double b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7139c6414dc424bcd674bb60308f924a", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7139c6414dc424bcd674bb60308f924a")).doubleValue() : aq.a(this.n, this.e);
    }

    public final double c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c01164e044a9c29215c6393837e914", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c01164e044a9c29215c6393837e914")).doubleValue() : aq.a(this.n, this.i);
    }

    public final void a(boolean z, double d, double d2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5949ffe8a86c4d662f0bfb6097ced8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5949ffe8a86c4d662f0bfb6097ced8");
            return;
        }
        if (this.g == 0) {
            this.m = System.currentTimeMillis();
        }
        this.g++;
        if (z) {
            double abs = (this.d * this.f) + Math.abs(d);
            long j = this.f + 1;
            this.f = j;
            this.d = abs / j;
            double abs2 = (this.e * this.f) + Math.abs(d2);
            long j2 = this.f + 1;
            this.f = j2;
            this.e = abs2 / j2;
            return;
        }
        double abs3 = (this.h * this.j) + Math.abs(d);
        long j3 = this.j + 1;
        this.j = j3;
        this.h = abs3 / j3;
        double abs4 = (this.i * this.j) + Math.abs(d2);
        long j4 = this.j + 1;
        this.j = j4;
        this.i = abs4 / j4;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53097a79266f9d0a893d152ce526a5d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53097a79266f9d0a893d152ce526a5d5");
        } else if (this.g > 0) {
            this.g = 0L;
            this.k.add(Long.valueOf(System.currentTimeMillis() - this.m));
        }
    }
}
