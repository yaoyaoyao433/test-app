package com.meituan.msc.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ag {
    public static ChangeQuickRedirect a;
    protected com.meituan.msc.jse.common.b b;
    private final SparseArray<aa> c;
    private final SparseBooleanArray d;

    public ag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d35b14e51f6c826dd9ab907f75de3e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d35b14e51f6c826dd9ab907f75de3e2");
            return;
        }
        this.c = new SparseArray<>();
        this.d = new SparseBooleanArray();
        this.b = new com.meituan.msc.jse.common.b();
    }

    public final void a(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef025e6fa159a221f86d9242c2404600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef025e6fa159a221f86d9242c2404600");
            return;
        }
        this.b.a();
        int p = aaVar.p();
        this.c.put(p, aaVar);
        this.d.put(p, true);
        com.meituan.msc.modules.reporter.g.d("[ShadowNodeRegistry@addRootNode]", "tag: ", Integer.valueOf(p), CommonConstant.Symbol.COMMA, this);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014cdcdabd60052f9f75518c420dea6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014cdcdabd60052f9f75518c420dea6d");
            return;
        }
        this.b.a();
        if (i == -1) {
            return;
        }
        if (!this.d.get(i)) {
            throw new g("View with tag " + i + " is not registered as a root view");
        }
        this.c.remove(i);
        this.d.delete(i);
        com.meituan.msc.modules.reporter.g.d("[ShadowNodeRegistry@removeRootNode]", "tag: " + i + CommonConstant.Symbol.COMMA + this);
    }

    public final void b(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b28223cddf8c5dd766fcc78a71e5c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b28223cddf8c5dd766fcc78a71e5c14");
            return;
        }
        this.b.a();
        this.c.put(aaVar.p(), aaVar);
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19293db16de1a428c80c80d1a925359c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19293db16de1a428c80c80d1a925359c");
            return;
        }
        this.b.a();
        if (this.d.get(i)) {
            throw new g("Trying to remove root node " + i + " without using removeRootNode!");
        }
        this.c.remove(i);
    }

    public final aa c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "591c1f1acf3cbc78fd2fd6417c7f22f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "591c1f1acf3cbc78fd2fd6417c7f22f4");
        }
        this.b.a();
        return this.c.get(i);
    }

    public final boolean d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8cdf71648bf7bf37a5099f1d6023cfd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8cdf71648bf7bf37a5099f1d6023cfd")).booleanValue();
        }
        this.b.a();
        return this.d.get(i);
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adee18a88eae775a9933941f0cf02d88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adee18a88eae775a9933941f0cf02d88")).intValue();
        }
        this.b.a();
        return this.d.size();
    }

    public final int e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b140099952356d69e5822be959a95c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b140099952356d69e5822be959a95c5")).intValue();
        }
        this.b.a();
        return this.d.keyAt(i);
    }
}
