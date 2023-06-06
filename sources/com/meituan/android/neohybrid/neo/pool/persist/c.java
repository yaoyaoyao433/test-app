package com.meituan.android.neohybrid.neo.pool.persist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.m;
import com.meituan.android.neohybrid.core.t;
import com.meituan.android.neohybrid.core.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c {
    public static ChangeQuickRedirect b;
    private long a;
    protected Context c;
    protected NeoConfig d;
    protected com.meituan.android.neohybrid.core.a e;
    protected com.meituan.android.neohybrid.core.listener.a f;
    protected a g;

    public abstract t b();

    public c(NeoConfig neoConfig) {
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7531c4023bb1413d0173fd49af4efa6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7531c4023bb1413d0173fd49af4efa6c");
            return;
        }
        this.c = com.meituan.android.neohybrid.init.a.d();
        this.d = neoConfig;
        b(a.INIT);
    }

    public final void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077c31b08e2e1d6c6c0ef105c5248175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077c31b08e2e1d6c6c0ef105c5248175");
            return;
        }
        a(cVar);
        a(d.a(this), this.a);
    }

    public void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fede60313d528af318ff3e253aebf0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fede60313d528af318ff3e253aebf0a7");
            return;
        }
        t b2 = b();
        if (cVar != null) {
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a18f51c9d2650a6b1010818925ba0ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a18f51c9d2650a6b1010818925ba0ed");
            } else if (cVar != null) {
                this.e = cVar.e;
                this.f = cVar.f;
                this.g = cVar.g;
            }
        } else {
            m a2 = m.a();
            a2.b = b2;
            this.e = a2.b();
            this.f = w.a(this.c, this.e);
            b(a.READY);
        }
        com.meituan.android.neohybrid.neo.report.d.a(this.e, "neo_init_type", String.valueOf(b2));
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b825ffd8cecc9bf96789d530f351f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b825ffd8cecc9bf96789d530f351f87");
        } else {
            a(a.CREATE);
        }
    }

    private void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa160790b8181df5e981989750612e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa160790b8181df5e981989750612e21");
        } else if (j < 0) {
            b(a.FAIL);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
        }
    }

    @SuppressLint({"LoopDetector"})
    public final void a(a aVar) {
        while (true) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53316c0de015b2d76d78e54b55a73377", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53316c0de015b2d76d78e54b55a73377");
                return;
            } else if (aVar == null || this.g.k >= aVar.k || this.g.k < a.READY.k || this.g.k > a.LOAD_URL.k) {
                return;
            } else {
                if (this.g == a.READY) {
                    this.e.a(this.f, this.d.newNeoArguments(null));
                    b(a.CREATE);
                } else if (this.g == a.CREATE) {
                    this.e.a(LayoutInflater.from(this.c), (ViewGroup) null);
                    this.e.a((View) null, (Bundle) null);
                    b(a.CREATE_VIEW);
                } else if (this.g == a.CREATE_VIEW) {
                    this.e.a((Bundle) null);
                    b(a.LOAD_URL);
                }
            }
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1594223e58a7b599cc021349330c4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1594223e58a7b599cc021349330c4d");
            return;
        }
        this.g = aVar;
        c(aVar);
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044a23d037d9911f1a91299d9b82173e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044a23d037d9911f1a91299d9b82173e");
        } else {
            this.a = j;
        }
    }

    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e104e1d9ee1aadda5cfee88b94ce1d8d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e104e1d9ee1aadda5cfee88b94ce1d8d")).booleanValue() : (this.d == null || this.e == null || this.g.k <= 0) ? false : true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        INIT(1),
        READY(2),
        CREATE(3),
        CREATE_VIEW(4),
        LOAD_URL(5),
        SUCC(6),
        FETCHED(0),
        FAIL(-1),
        DESTROY(-2);
        
        public static ChangeQuickRedirect a;
        private int k;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b23160ab1914440443dc6fce34edf394", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b23160ab1914440443dc6fce34edf394") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87d35d36a040f30b5d070698230d6d35", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87d35d36a040f30b5d070698230d6d35") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677799b814f4df7c1c6d89d75ce2a337", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677799b814f4df7c1c6d89d75ce2a337");
            } else {
                this.k = i;
            }
        }
    }

    private void c(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e90d43ee614547ed84c6068154d290d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e90d43ee614547ed84c6068154d290d");
        } else if (this.e == null) {
        } else {
            String[] strArr = new String[2];
            switch (aVar) {
                case READY:
                    strArr[0] = "b_pay_neo_nsr_start_mv";
                    strArr[1] = "neo_nsr_start";
                    break;
                case SUCC:
                    strArr[0] = "b_pay_neo_nsr_succ_mv";
                    strArr[1] = "neo_nsr_succ";
                    break;
                case FETCHED:
                    strArr[0] = "b_pay_neo_nsr_fetch_mv";
                    strArr[1] = "neo_nsr_fetch";
                    break;
                case FAIL:
                    strArr[0] = "b_pay_neo_nsr_fail_mv";
                    strArr[1] = "neo_nsr_fail";
                    break;
            }
            if (TextUtils.isEmpty(strArr[0]) || TextUtils.isEmpty(strArr[1])) {
                return;
            }
            com.meituan.android.neohybrid.neo.report.d.a(this.e, strArr[0], "c_pay_7c9fc4b4", null, null);
            com.meituan.android.neohybrid.neo.report.d.c(this.e, strArr[1], null);
        }
    }
}
