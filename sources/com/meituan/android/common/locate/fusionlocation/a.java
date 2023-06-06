package com.meituan.android.common.locate.fusionlocation;

import android.location.GnssStatus;
import android.location.GpsStatus;
import android.util.Pair;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile a h;
    public double a;
    private final List<com.meituan.android.common.locate.model.b> b;
    private final List<Pair<Long, Integer>> c;
    private final List<Pair<Long, Float>> d;
    private final List<Pair<Pair<Long, Pair<Boolean, Boolean>>, double[]>> e;
    private final List<Pair<GnssStatus, Long>> f;
    private final List<Pair<GpsStatus, Long>> g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c34c39e87b6f8db1988bbb26880cc97e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c34c39e87b6f8db1988bbb26880cc97e");
            return;
        }
        this.b = new LinkedList();
        this.c = new LinkedList();
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.a = 0.0d;
        this.f = new LinkedList();
        this.g = new LinkedList();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b77a6b5520b4133c34bf79701bce4a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b77a6b5520b4133c34bf79701bce4a18");
        }
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public synchronized void a(Pair<GnssStatus, Long> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "890d795f411835b3ec51ef2d4360b96a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "890d795f411835b3ec51ef2d4360b96a");
            return;
        }
        try {
            this.f.add(pair);
            long b = h.a(g.a()).b();
            Long l = (Long) this.f.get(0).second;
            while (System.currentTimeMillis() - l.longValue() > b) {
                this.f.remove(0);
                if (this.f.size() <= 0) {
                    break;
                }
                l = (Long) this.f.get(0).second;
            }
            this.a = com.meituan.android.common.locate.posquality.a.a((GnssStatus) pair.first);
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("saveGnssStatus:" + e.getMessage());
        }
    }

    public synchronized void a(com.meituan.android.common.locate.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f1e72ce2a8fe283865953410f5f9c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f1e72ce2a8fe283865953410f5f9c30");
            return;
        }
        try {
            this.b.add(bVar);
            long b = h.a(g.a()).b();
            com.meituan.android.common.locate.model.b bVar2 = this.b.get(0);
            while (System.currentTimeMillis() - bVar2.a > b) {
                this.b.remove(0);
                if (this.b.size() <= 0) {
                    break;
                }
                bVar2 = this.b.get(0);
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("saveLocatePoint:" + e.getMessage());
        }
    }

    public synchronized List<Pair<GnssStatus, Long>> b() {
        return this.f;
    }

    public synchronized void b(Pair<GpsStatus, Long> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "886153662b78313381ccf8831650c2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "886153662b78313381ccf8831650c2c3");
            return;
        }
        try {
            this.g.add(pair);
            long b = h.a(g.a()).b();
            Object obj = this.g.get(0).second;
            while (System.currentTimeMillis() - ((Long) obj).longValue() > b) {
                this.g.remove(0);
                if (this.g.size() <= 0) {
                    break;
                }
                obj = this.g.get(0).second;
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("saveGpsStatus:" + e.getMessage());
        }
    }

    public synchronized List<Pair<Long, Integer>> c() {
        return this.c;
    }

    public synchronized void c(Pair<Long, Integer> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28c5804d15a7f54c8fc4fc2e7afd9656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28c5804d15a7f54c8fc4fc2e7afd9656");
            return;
        }
        try {
            this.c.add(pair);
            long b = h.a(g.a()).b();
            Pair<Long, Integer> pair2 = this.c.get(0);
            while (System.currentTimeMillis() - ((Long) pair2.first).longValue() > b) {
                this.c.remove(0);
                if (this.c.size() <= 0) {
                    break;
                }
                pair2 = this.c.get(0);
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("saveLightFeature:" + e.getMessage());
        }
    }

    public synchronized List<Pair<Long, Float>> d() {
        return this.d;
    }

    public synchronized void d(Pair<Long, Float> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fbfaa27efecfc2c212b7bc9d5795779", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fbfaa27efecfc2c212b7bc9d5795779");
            return;
        }
        try {
            this.d.add(pair);
            long b = h.a(g.a()).b();
            Pair<Long, Float> pair2 = this.d.get(0);
            while (System.currentTimeMillis() - ((Long) pair2.first).longValue() > b) {
                this.d.remove(0);
                if (this.d.size() <= 0) {
                    break;
                }
                pair2 = this.d.get(0);
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("savePressureFeature:" + e.getMessage());
        }
    }

    public synchronized List<Pair<Pair<Long, Pair<Boolean, Boolean>>, double[]>> e() {
        return this.e;
    }

    public synchronized void e(Pair<Pair<Long, Pair<Boolean, Boolean>>, double[]> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76d0d717869f0cd16cb86c58e5629102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76d0d717869f0cd16cb86c58e5629102");
            return;
        }
        try {
            this.e.add(pair);
            long b = h.a(g.a()).b();
            Pair<Pair<Long, Pair<Boolean, Boolean>>, double[]> pair2 = this.e.get(0);
            while (System.currentTimeMillis() - ((Long) ((Pair) pair2.first).first).longValue() > b) {
                this.e.remove(0);
                if (this.e.size() <= 0) {
                    break;
                }
                pair2 = this.e.get(0);
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("saveMotionState:" + e.getMessage());
        }
    }

    public int f() {
        return -1;
    }
}
