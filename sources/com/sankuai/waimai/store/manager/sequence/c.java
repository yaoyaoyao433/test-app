package com.sankuai.waimai.store.manager.sequence;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.monitor.monitor.SGMarketingDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c implements com.sankuai.waimai.store.manager.sequence.a {
    public static ChangeQuickRedirect b;
    private boolean a;
    protected final List<d> c;
    protected d d;
    public a e;
    public boolean f;
    protected boolean g;
    public boolean h;
    public boolean i;
    private final Map<String, MetricsSpeedMeterTask> j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        boolean b();
    }

    public c() {
        this(true);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dca466b0e8350359ba268a21e2bed97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dca466b0e8350359ba268a21e2bed97");
        }
    }

    public c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c5bac93e34ecd0ceae1e8cf7b395a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c5bac93e34ecd0ceae1e8cf7b395a7");
            return;
        }
        this.j = new HashMap();
        this.f = false;
        this.g = true;
        this.h = false;
        this.c = new ArrayList();
        this.a = z;
    }

    public final void a(List<d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32193d69d89d1781c430729e82f4b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32193d69d89d1781c430729e82f4b0d");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.f = false;
            if (this.e != null) {
                this.e.a();
            }
        } else {
            for (d dVar : list) {
                if (dVar != null) {
                    b(dVar);
                }
            }
        }
    }

    public final void b(List<d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c49d5132afeb4c0cd9f39f55719d893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c49d5132afeb4c0cd9f39f55719d893");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (d dVar : list) {
                if (dVar != null) {
                    dVar.c = this;
                }
            }
            synchronized (this.c) {
                if (com.sankuai.shangou.stone.util.a.b(this.c)) {
                    this.c.addAll(list);
                } else {
                    this.c.addAll(0, list);
                }
            }
            if (this.a) {
                c();
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26249837e61b82cafc5d0b82107dd395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26249837e61b82cafc5d0b82107dd395");
        } else if (e()) {
        } else {
            synchronized (this.c) {
                this.c.clear();
            }
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023d50f7d262899ae0dec6a255a356f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023d50f7d262899ae0dec6a255a356f2");
        } else if (this.g && this.d == null) {
            if (com.sankuai.shangou.stone.util.a.b(this.c)) {
                this.d = null;
                if (this.e != null) {
                    this.e.a();
                    return;
                }
                return;
            }
            this.d = this.c.remove(0);
            if (this.d == null) {
                return;
            }
            this.d.f = false;
            a(this.d);
        }
    }

    public void a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc44c9d3f781fdde7bb298330d3b5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc44c9d3f781fdde7bb298330d3b5ad");
        } else {
            dVar.d();
        }
    }

    public final boolean e() {
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0202153910b71b534751af281491dc27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0202153910b71b534751af281491dc27")).booleanValue();
        }
        synchronized (this.c) {
            a2 = com.sankuai.shangou.stone.util.a.a((List) this.c);
        }
        return a2 == 0;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefe6e0975ea47fb2aa14165e6219524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefe6e0975ea47fb2aa14165e6219524");
            return;
        }
        synchronized (this.c) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593b9e57274d6778b438eb186cabfef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593b9e57274d6778b438eb186cabfef9");
        } else if (t.a(str2) || t.a(str)) {
        } else {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("flashbuy_marketing_" + str);
            createCustomSpeedMeterTask.recordStep("parse_start");
            this.j.put(str2, createCustomSpeedMeterTask);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void b(String str, String str2) {
        MetricsSpeedMeterTask remove;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbfefaceaf4ee7ae0f1d388be760172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbfefaceaf4ee7ae0f1d388be760172");
        } else if (t.a(str2) || t.a(str)) {
        } else {
            com.sankuai.waimai.store.util.monitor.c.b(SGMarketingDialog.Normal, "", str);
            if (!this.j.containsKey(str2) || (remove = this.j.remove(str2)) == null) {
                return;
            }
            h.a(remove.recordStep("parse_end"));
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95caa1518ccfe248821f3a943d14a414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95caa1518ccfe248821f3a943d14a414");
            return;
        }
        this.d = null;
        c();
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void a(String str, SGMarketingDialog sGMarketingDialog, String str2) {
        Object[] objArr = {str, sGMarketingDialog, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6930aa9dc451544aa39f726afa866153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6930aa9dc451544aa39f726afa866153");
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            com.sankuai.waimai.store.util.monitor.c.a(sGMarketingDialog, str2, str);
        }
        if (this.e == null || !this.e.b()) {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void b() {
        this.f = true;
    }

    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "763f8f3cfadc80365dfb75136ba9651b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "763f8f3cfadc80365dfb75136ba9651b");
            return;
        }
        this.g = z;
        if (this.d != null) {
            this.d.a(z);
        }
        if (z) {
            c();
        }
    }

    private void b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4f388f94cebef1a5a4f960c33adac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4f388f94cebef1a5a4f960c33adac9");
        } else if (dVar == null) {
        } else {
            dVar.c = this;
            synchronized (this.c) {
                this.c.add(dVar);
            }
            if (this.a) {
                c();
            }
        }
    }
}
