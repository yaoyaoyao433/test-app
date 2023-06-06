package com.meituan.phoenix.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static e b;
    public static final Object c = new Object();
    public static int d;
    public e e;
    public boolean f;
    public String g;
    public String h;
    public int i;
    public String j;
    public int k;
    public long l;
    public long m;
    public ArrayList<String> n;
    public ArrayList<Integer> o;
    public ArrayList<Long> p;
    public String q;
    public int r;
    public String s;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab973e0917248cbc6ae1ea78c2ca571", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab973e0917248cbc6ae1ea78c2ca571");
            return;
        }
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = "-1";
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcce8d22f151a5ffb4cfff7544ea9a27", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcce8d22f151a5ffb4cfff7544ea9a27");
        }
        return "PhoenixRecord{mNext=" + this.e + "\n, success=" + this.f + "\n, srcUrl='" + this.g + "'\n, srcHost='" + this.h + "'\n, successHost='" + this.j + "'\n, successCode=" + this.k + "\n, startTime=" + this.l + "\n, successDelayTime=" + this.m + "\n, replaceFailedHosts=" + this.n + "\n, failedCodes=" + this.o + "\n, failedDelayTime=" + this.p + "\n, retryCount=" + this.r + "\n, srcCode=" + this.i + "\n, phoenixKey=" + this.s + "\n, cityId='" + this.q + "'\n}";
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcedbab9430d9ff65d45c681a1ca5adf", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcedbab9430d9ff65d45c681a1ca5adf");
        }
        synchronized (c) {
            if (b != null) {
                e eVar = b;
                b = eVar.e;
                eVar.e = null;
                d--;
                return eVar;
            }
            return new e();
        }
    }
}
