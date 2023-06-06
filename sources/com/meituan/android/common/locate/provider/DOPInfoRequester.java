package com.meituan.android.common.locate.provider;

import android.support.annotation.NonNull;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
@Deprecated
/* loaded from: classes2.dex */
public class DOPInfoRequester {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashSet<DOPListener> a;
    private volatile int b;
    private f c;

    @Deprecated
    /* loaded from: classes2.dex */
    public static class DOPInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        private double hDOP;
        private double pDOP;
        private double vDOP;

        public DOPInfo(double d, double d2, double d3) {
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9759509357a1345c121b56e3b9ace530", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9759509357a1345c121b56e3b9ace530");
                return;
            }
            this.pDOP = d;
            this.hDOP = d2;
            this.vDOP = d3;
        }

        public double gethDOP() {
            return this.hDOP;
        }

        public double getpDOP() {
            return this.pDOP;
        }

        public double getvDOP() {
            return this.vDOP;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4876a1a2d6c8b9d8e4e173e578b43207", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4876a1a2d6c8b9d8e4e173e578b43207");
            }
            return "{\"pDOP\":" + this.pDOP + ", \"hDOP\":" + this.hDOP + ", \"vDOP\":" + this.vDOP + '}';
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface DOPListener {
        void onDOPInfoGot(DOPInfo dOPInfo);
    }

    /* loaded from: classes2.dex */
    static class SingleTonHoler {
        private static DOPInfoRequester INSTANCE = new DOPInfoRequester();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public DOPInfoRequester() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd276890b901d6ec59d5d94e6f021105", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd276890b901d6ec59d5d94e6f021105");
            return;
        }
        this.b = 0;
        this.a = new HashSet<>();
        this.c = new f(this);
    }

    private boolean b(DOPInfo dOPInfo) {
        Object[] objArr = {dOPInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c131b787380efcf2bc6950ca07fcf38f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c131b787380efcf2bc6950ca07fcf38f")).booleanValue();
        }
        if (dOPInfo == null) {
            return false;
        }
        return (dOPInfo.hDOP == -1000000.0d && dOPInfo.pDOP == -1000000.0d && dOPInfo.vDOP == -1000000.0d) ? false : true;
    }

    @Deprecated
    public static DOPInfoRequester getSingleton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d202c61f9682fe6c6da4a06573930c89", RobustBitConfig.DEFAULT_VALUE) ? (DOPInfoRequester) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d202c61f9682fe6c6da4a06573930c89") : SingleTonHoler.INSTANCE;
    }

    public void a(DOPInfo dOPInfo) {
        Object[] objArr = {dOPInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0ff9710cb447df450db3163e65a4353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0ff9710cb447df450db3163e65a4353");
        } else if (dOPInfo == null) {
        } else {
            try {
                Iterator<DOPListener> it = this.a.iterator();
                while (it.hasNext()) {
                    DOPListener next = it.next();
                    if (next != null && b(dOPInfo)) {
                        next.onDOPInfoGot(dOPInfo);
                    }
                }
            } catch (Exception e) {
                LogUtils.a(e);
            }
        }
    }

    @Deprecated
    public synchronized boolean hasRegistered(DOPListener dOPListener) {
        Object[] objArr = {dOPListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25b32d326b3592f0deaa8e0b1f572a60", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25b32d326b3592f0deaa8e0b1f572a60")).booleanValue();
        }
        return this.a != null && this.a.contains(dOPListener);
    }

    @Deprecated
    public synchronized boolean removeDOPInfo(@NonNull DOPListener dOPListener) {
        Object[] objArr = {dOPListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fa8e5cf2982bf28d9fdcc84811e730b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fa8e5cf2982bf28d9fdcc84811e730b")).booleanValue();
        }
        try {
            r9 = this.a != null ? this.a.remove(dOPListener) : false;
            if (r9) {
                this.b--;
            }
            if (this.b == 0) {
                this.c.b();
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
        return r9;
    }

    @Deprecated
    public synchronized boolean requestDOPInfo(@NonNull DOPListener dOPListener) {
        Object[] objArr = {dOPListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d66b29278a4d6232edc068dd64b962a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d66b29278a4d6232edc068dd64b962a1")).booleanValue();
        }
        try {
            r9 = this.a != null ? this.a.add(dOPListener) : false;
            if (r9) {
                this.b++;
            }
            if (this.b == 1 && this.c != null) {
                this.c.a();
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
        return r9;
    }
}
