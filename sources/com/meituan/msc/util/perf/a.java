package com.meituan.msc.util.perf;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public final long b;
    public final long c;

    public a(g gVar, g gVar2) {
        this("msc.launch.performance." + gVar2.b, gVar2.h - gVar.h, gVar.k, gVar.h, gVar2.h);
        Object[] objArr = {gVar, gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d1dbd7368a47fe433144af1840dc62e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d1dbd7368a47fe433144af1840dc62e");
        }
    }

    private a(String str, long j, String str2, long j2, long j3) {
        super(str, j, str2);
        Object[] objArr = {str, new Long(j), str2, new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6bba410dfb969ca55c7ed2cddd5adc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6bba410dfb969ca55c7ed2cddd5adc");
            return;
        }
        this.b = j2;
        this.c = j3;
    }

    @Override // com.meituan.msc.util.perf.e
    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f331a898e349d230021e56a0b592742e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f331a898e349d230021e56a0b592742e");
        }
        Map<String, Object> a2 = super.a();
        a2.put("begin_ts", Long.valueOf(this.b));
        a2.put("end_ts", Long.valueOf(this.c));
        return a2;
    }
}
