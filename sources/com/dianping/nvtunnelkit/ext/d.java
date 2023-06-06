package com.dianping.nvtunnelkit.ext;

import android.os.Handler;
import android.os.Message;
import com.dianping.nvtunnelkit.core.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements Handler.Callback, com.dianping.monitor.e {
    public static ChangeQuickRedirect a;
    public com.dianping.monitor.e b;
    private final com.dianping.nvtunnelkit.core.d c;
    private final d.b d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48b58145044b5e0bcbd110a96d799d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48b58145044b5e0bcbd110a96d799d2");
            return;
        }
        d.a.a("monitor", 1);
        this.c = d.a.a("monitor");
        this.d = this.c.a(this);
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d5895a09a2eb2b8537faa6b84e79a42", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d5895a09a2eb2b8537faa6b84e79a42") : b.a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        com.dianping.monitor.e eVar;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9c9b77647aa2c344802d239530c1c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9c9b77647aa2c344802d239530c1c5")).booleanValue();
        }
        a aVar = (a) message.obj;
        if (aVar == null || (eVar = this.b) == null) {
            return false;
        }
        try {
            switch (message.what) {
                case 1:
                    eVar.pv(aVar.b, aVar.c, aVar.d, aVar.e, aVar.h, aVar.i, aVar.j, aVar.k);
                    return true;
                case 2:
                    eVar.pv3(aVar.b, aVar.c, aVar.d, aVar.e, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l);
                    return true;
                case 3:
                    eVar.pv3(aVar.b, aVar.c, aVar.d, aVar.e, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.n);
                    return true;
                case 4:
                    eVar.pv4(aVar.b, aVar.c, aVar.d, aVar.e, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m);
                    return true;
                case 5:
                    eVar.pv4(aVar.b, aVar.c, aVar.d, aVar.e, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n);
                    return true;
                case 6:
                    eVar.pvCat(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p, aVar.q, aVar.r, aVar.s, aVar.t, aVar.u);
                    return true;
                case 7:
                    ((com.dianping.monitor.impl.a) eVar).pvShark(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p, aVar.q, aVar.r, aVar.s, aVar.t, aVar.u, aVar.v);
                    return true;
                case 8:
                    return true;
                default:
                    return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.dianping.monitor.e
    public final void pv(long j, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d96b5f8dae55a4a1aa2b23bc4e5f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d96b5f8dae55a4a1aa2b23bc4e5f8c");
            return;
        }
        a aVar = new a(j, str, i, i2, i3, i4, i5, i6);
        Message message = new Message();
        message.what = 1;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    @Override // com.dianping.monitor.e
    public final void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe84a96faa4f2a32b05e7248af6dd936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe84a96faa4f2a32b05e7248af6dd936");
            return;
        }
        a aVar = new a(j, str, i, i2, i3, i4, i5, i6, str2);
        Message message = new Message();
        message.what = 2;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    @Override // com.dianping.monitor.e
    public final void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee20a7322fdb9d58bbc5d13f0dc7820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee20a7322fdb9d58bbc5d13f0dc7820");
            return;
        }
        a aVar = new a(j, str, i, i2, i3, i4, i5, i6, str2, i7);
        Message message = new Message();
        message.what = 3;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public final void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202dd8bbb371fc6081e10782f464c822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202dd8bbb371fc6081e10782f464c822");
            return;
        }
        a aVar = new a(j, str, i, i2, i3, i4, i5, i6, str2, str3, i7);
        Message message = new Message();
        message.what = 4;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public final void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218a5d3d1d46526ddaa3629010e9dc25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218a5d3d1d46526ddaa3629010e9dc25");
            return;
        }
        a aVar = new a(j, str, i, i2, i3, i4, i5, i6, str2, str3);
        Message message = new Message();
        message.what = 5;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    @Override // com.dianping.monitor.e
    public final void pvCat(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, int i8, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, Integer.valueOf(i8), str4, str5, str6, hashMap, hashMap2, str7, str8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a1750354ebcc5ff6f9ff3e6e5828e03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a1750354ebcc5ff6f9ff3e6e5828e03");
            return;
        }
        a aVar = new a(j, str, i, i2, i3, i4, i5, i6, i7, str2, str3, i8, str4, str5, str6, hashMap, hashMap2, str7, str8);
        Message message = new Message();
        message.what = 6;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, int i9, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8, String str9) {
        Object[] objArr = {0L, str, 0, 0, 0, 0, Integer.valueOf(i5), 0, 0, Integer.valueOf(i8), str2, null, Integer.valueOf(i9), null, null, null, null, null, null, null, str9};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c07f8b3d66afa9adacc873ba344436c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c07f8b3d66afa9adacc873ba344436c");
            return;
        }
        a aVar = new a(0L, str, 0, 0, 0, 0, i5, 0, 0, i8, str2, null, i9, null, null, null, null, null, null, null, str9);
        Message message = new Message();
        message.what = 7;
        message.obj = aVar;
        this.d.sendMessage(message);
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public final void flush() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3188eb20ff05830d84d1ea4571a8a999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3188eb20ff05830d84d1ea4571a8a999");
            return;
        }
        com.dianping.monitor.e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.flush();
    }

    @Override // com.dianping.monitor.e
    public final String getCommand(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b064daba70e289ae05983d68853d24d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b064daba70e289ae05983d68853d24d");
        }
        com.dianping.monitor.e eVar = this.b;
        if (eVar == null) {
            return null;
        }
        return eVar.getCommand(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        private static d a = new d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        public static ChangeQuickRedirect a;
        long b;
        String c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        int k;
        String l;
        String m;
        int n;
        String o;
        String p;
        String q;
        HashMap<String, String> r;
        HashMap<String, String> s;
        String t;
        String u;
        String v;

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this(j, str, i, i2, -1, i3, i3, i4, i5, i6, null, null, 0, null, null, null, null, null, null, null, null);
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842e29f226a743b36f9fa632e4000af9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842e29f226a743b36f9fa632e4000af9");
            }
        }

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
            this(j, str, i, i2, -1, i3, i3, i4, i5, i6, str2, null, 0, null, null, null, null, null, null, null, null);
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5d62828074708569f5060b94f11ea4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5d62828074708569f5060b94f11ea4");
            }
        }

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7) {
            this(j, str, i, i2, -1, i3, i3, i4, i5, i6, str2, null, i7, null, null, null, null, null, null, null, null);
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, Integer.valueOf(i7)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3843d4f01bf65bcaaec21b3a3301ba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3843d4f01bf65bcaaec21b3a3301ba");
            }
        }

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7) {
            this(j, str, i, i2, -1, i3, i3, i4, i5, i6, str2, str3, i7, null, null, null, null, null, null, null, null);
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "befd39adf8b0adbf804492f73af9f752", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "befd39adf8b0adbf804492f73af9f752");
            }
        }

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
            this(j, str, i, i2, -1, i3, i3, i4, i5, i6, str2, str3, 0, null, null, null, null, null, null, null, null);
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242d2ac2b37eec40a1ce5c956f46f4f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242d2ac2b37eec40a1ce5c956f46f4f9");
            }
        }

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, int i8, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8) {
            this(j, str, i, i2, i3, i4, i4, i5, i6, i7, str2, str3, i8, str4, str5, str6, hashMap, hashMap2, str7, str8, null);
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, Integer.valueOf(i8), str4, str5, str6, hashMap, hashMap2, str7, str8};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2982ca8b1d960e4736b96fafb3ce56ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2982ca8b1d960e4736b96fafb3ce56ad");
            }
        }

        public a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, String str3, int i9, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8, String str9) {
            Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str2, str3, Integer.valueOf(i9), str4, str5, str6, hashMap, hashMap2, str7, str8, str9};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a7ce728860f487477699bd19370557", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a7ce728860f487477699bd19370557");
                return;
            }
            this.b = j;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = i7;
            this.k = i8;
            this.l = str2;
            this.m = str3;
            this.n = i9;
            this.o = str4;
            this.p = str5;
            this.q = str6;
            this.r = hashMap;
            this.s = hashMap2;
            this.t = str7;
            this.u = str8;
            this.v = str9;
        }
    }
}
