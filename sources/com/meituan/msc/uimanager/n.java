package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.util.SparseBooleanArray;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private final String b;
    private final UIViewOperationQueue c;
    private final ag d;
    private final SparseBooleanArray e;
    private final IRuntimeDelegate f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public final aa a;
        public final int b;

        public a(aa aaVar, int i) {
            this.a = aaVar;
            this.b = i;
        }
    }

    public n(UIViewOperationQueue uIViewOperationQueue, ag agVar, IRuntimeDelegate iRuntimeDelegate) {
        Object[] objArr = {uIViewOperationQueue, agVar, iRuntimeDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2fbf8a005bcf764e6b06c23d903bd08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2fbf8a005bcf764e6b06c23d903bd08");
            return;
        }
        this.b = "NativeViewHierarchyOptimizer@" + Integer.toHexString(hashCode());
        this.e = new SparseBooleanArray();
        this.c = uIViewOperationQueue;
        this.d = agVar;
        this.f = iRuntimeDelegate;
    }

    public final void a(aa aaVar, ThemedReactContext themedReactContext, @Nullable ab abVar) {
        Object[] objArr = {aaVar, themedReactContext, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0742fd25f306f2a39b82a0f8553ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0742fd25f306f2a39b82a0f8553ae3");
        } else if (aaVar.A() != m.NONE) {
            this.c.a(themedReactContext, aaVar.p(), aaVar.i(), abVar);
        }
    }

    public static void a(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "905186568acf2a4152d4e7a34c820657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "905186568acf2a4152d4e7a34c820657");
        } else {
            aaVar.w();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msc.uimanager.aa r25, java.lang.String r26, com.meituan.msc.uimanager.ab r27) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.n.a(com.meituan.msc.uimanager.aa, java.lang.String, com.meituan.msc.uimanager.ab):void");
    }

    public final void a(aa aaVar, int[] iArr, int[] iArr2, aq[] aqVarArr, int[] iArr3, boolean z) {
        boolean z2;
        Object[] objArr = {aaVar, iArr, iArr2, aqVarArr, iArr3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6cb99488d0c2db2caa5e24566bb1c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6cb99488d0c2db2caa5e24566bb1c5");
            return;
        }
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z2 = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            aa c = this.d.c(i);
            if (c == null) {
                com.meituan.msc.modules.reporter.g.b(this.b, null, "[handleManageChildren] nodeToRemove null, tag: " + i);
            }
            a(c, z2, z);
        }
        for (aq aqVar : aqVarArr) {
            aa c2 = this.d.c(aqVar.c);
            if (c2 == null) {
                com.meituan.msc.modules.reporter.g.b(this.b, null, "[handleManageChildren nodeToAdd is null, tag: ", Integer.valueOf(aqVar.c), ",index: ", Integer.valueOf(aqVar.d));
            }
            a(aaVar, c2, aqVar.d, z);
        }
    }

    public final void a(aa aaVar, ReadableArray readableArray, boolean z) {
        Object[] objArr = {aaVar, readableArray, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084b20542ba62594c2876b7fce671ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084b20542ba62594c2876b7fce671ea9");
            return;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            a(aaVar, this.d.c(readableArray.getInt(i)), i, z);
        }
    }

    public final void b(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0289752d1d232c1c1e5a1297e68e7a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0289752d1d232c1c1e5a1297e68e7a8");
        } else {
            e(aaVar);
        }
    }

    public final void c(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "050e97da728ceda23751b25442b9203a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "050e97da728ceda23751b25442b9203a");
        } else if (aaVar.z()) {
            a(aaVar, (ab) null);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f8c8d485303450b622e01ab5f2c49b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f8c8d485303450b622e01ab5f2c49b6");
        } else {
            this.e.clear();
        }
    }

    private a a(aa aaVar, int i) {
        Object[] objArr = {aaVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1960c07ef6c233ead66ef8d1a8b899c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1960c07ef6c233ead66ef8d1a8b899c5");
        }
        while (aaVar.A() != m.PARENT) {
            aa r = aaVar.r();
            if (r == null) {
                return null;
            }
            i = i + (aaVar.A() == m.LEAF ? 1 : 0) + r.e(aaVar);
            aaVar = r;
        }
        return new a(aaVar, i);
    }

    private void a(aa aaVar, aa aaVar2, int i, boolean z) {
        aa aaVar3;
        Object[] objArr = {aaVar, aaVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5d8d245af3ed514b5e6a8d2e615216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5d8d245af3ed514b5e6a8d2e615216");
        } else if (aaVar == null) {
            com.meituan.msc.modules.reporter.g.b(this.b, null, "[addNodeToNode] parent is null, index: ", Integer.valueOf(i));
        } else if (aaVar2 == null) {
            com.meituan.msc.modules.reporter.g.b(this.b, null, "[addNodeToNode child is null, index: ", Integer.valueOf(i));
        } else {
            int e = aaVar.e(aaVar.e(i));
            if (aaVar.A() != m.PARENT) {
                a a2 = a(aaVar, e);
                if (a2 == null) {
                    return;
                }
                aaVar3 = a2.a;
                e = a2.b;
            } else {
                aaVar3 = aaVar;
            }
            if (aaVar2.A() != m.NONE) {
                c(aaVar3, aaVar2, e, z);
            } else {
                b(aaVar3, aaVar2, e, z);
            }
        }
    }

    private void a(aa aaVar, boolean z, boolean z2) {
        Object[] objArr = {aaVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb908901db9bfea3087ea56b202fa1e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb908901db9bfea3087ea56b202fa1e5");
        } else if (aaVar == null) {
            com.meituan.msc.modules.reporter.g.b(this.b, null, "[removeNodeFromParent] nodeToRemove null, shouldDelete: ", Boolean.valueOf(z));
        } else {
            if (aaVar.A() != m.PARENT) {
                for (int m = aaVar.m() - 1; m >= 0; m--) {
                    a(aaVar.e(m), z, z2);
                }
            }
            aa y = aaVar.y();
            if (y != null) {
                int c = y.c(aaVar);
                y.h(c);
                if (z2) {
                    this.c.a(y.p(), new int[]{c}, (aq[]) null, z ? new int[]{aaVar.p()} : null);
                }
            }
        }
    }

    public final void a(int i, @Nullable int[] iArr, @Nullable aq[] aqVarArr, @Nullable int[] iArr2) {
        Object[] objArr = {Integer.valueOf(i), iArr, aqVarArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf3eeefd9d3b77d185c35ec6f798628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf3eeefd9d3b77d185c35ec6f798628");
        } else {
            this.c.a(i, iArr, aqVarArr, iArr2);
        }
    }

    private void b(aa aaVar, aa aaVar2, int i, boolean z) {
        Object[] objArr = {aaVar, aaVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6881d77ffce5a80c0606655507298e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6881d77ffce5a80c0606655507298e");
        } else {
            d(aaVar, aaVar2, i, z);
        }
    }

    private void c(aa aaVar, aa aaVar2, int i, boolean z) {
        Object[] objArr = {aaVar, aaVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df45c81c95005e73ae3cfdda0398b09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df45c81c95005e73ae3cfdda0398b09b");
            return;
        }
        aaVar.b(aaVar2, i);
        if (z) {
            this.c.a(aaVar.p(), (int[]) null, new aq[]{new aq(aaVar2.p(), i)}, (int[]) null);
        }
        if (aaVar2.A() != m.PARENT) {
            d(aaVar, aaVar2, 1 + i, z);
        }
    }

    private void d(aa aaVar, aa aaVar2, int i, boolean z) {
        Object[] objArr = {aaVar, aaVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a6c224d8365f597ce165dbe3e07ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a6c224d8365f597ce165dbe3e07ccd");
            return;
        }
        com.facebook.infer.annotation.a.a(aaVar2.A() != m.PARENT);
        int i2 = i;
        for (int i3 = 0; i3 < aaVar2.m(); i3++) {
            aa e = aaVar2.e(i3);
            if (e.y() != null) {
                if (this.f != null) {
                    this.f.handleException(new Exception(new AssertionError()));
                }
            } else {
                int x = aaVar.x();
                if (e.A() == m.NONE) {
                    b(aaVar, e, i2, z);
                } else {
                    c(aaVar, e, i2, z);
                }
                i2 += aaVar.x() - x;
            }
        }
    }

    private void e(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb9af46d3fb536d01f1ea45c59fa0f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb9af46d3fb536d01f1ea45c59fa0f6");
            return;
        }
        int p = aaVar.p();
        if (this.e.get(p)) {
            return;
        }
        this.e.put(p, true);
        int F = aaVar.F();
        int G = aaVar.G();
        for (aa r = aaVar.r(); r != null && r.A() != m.PARENT; r = r.r()) {
            if (!r.b()) {
                F += Math.round(r.B());
                G += Math.round(r.C());
            }
        }
        a(aaVar, F, G);
    }

    private void a(aa aaVar, int i, int i2) {
        Object[] objArr = {aaVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3966dc0044fbade95338971f378af66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3966dc0044fbade95338971f378af66");
        } else if (aaVar.A() != m.NONE && aaVar.y() != null) {
            this.c.a(aaVar.q(), aaVar.s().p(), aaVar.p(), i, i2, aaVar.H(), aaVar.I(), aaVar.i());
        } else {
            for (int i3 = 0; i3 < aaVar.m(); i3++) {
                aa e = aaVar.e(i3);
                int p = e.p();
                if (!this.e.get(p)) {
                    this.e.put(p, true);
                    a(e, e.F() + i, e.G() + i2);
                }
            }
        }
    }

    private void a(aa aaVar, @Nullable ab abVar) {
        Object[] objArr = {aaVar, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab34f93913b5615f7d8204b5a5aafe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab34f93913b5615f7d8204b5a5aafe4");
            return;
        }
        aa r = aaVar.r();
        if (r == null) {
            aaVar.a(false);
            return;
        }
        int a2 = r.a(aaVar);
        r.c(a2);
        a(aaVar, false, true);
        aaVar.a(false);
        this.c.a(aaVar.t(), aaVar.p(), aaVar.i(), abVar);
        r.a(aaVar, a2);
        a(r, aaVar, a2, true);
        for (int i = 0; i < aaVar.m(); i++) {
            a(aaVar, aaVar.e(i), i, true);
        }
        if (com.meituan.msc.jse.config.a.h) {
            String str = this.b;
            Object[] objArr2 = new Object[1];
            StringBuilder sb = new StringBuilder("Transitioning LayoutOnlyView - tag: ");
            sb.append(aaVar.p());
            sb.append(" - rootTag: ");
            sb.append(aaVar.q());
            sb.append(" - hasProps: ");
            sb.append(abVar != null);
            sb.append(" - tagsWithLayout.size: ");
            sb.append(this.e.size());
            objArr2[0] = sb.toString();
            com.meituan.msc.modules.reporter.g.d(str, objArr2);
        }
        com.facebook.infer.annotation.a.a(this.e.size() == 0);
        e(aaVar);
        for (int i2 = 0; i2 < aaVar.m(); i2++) {
            e(aaVar.e(i2));
        }
        this.e.clear();
    }

    public final void d(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ab21fb9491b4813a962939e3019601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ab21fb9491b4813a962939e3019601");
        } else {
            this.e.clear();
        }
    }
}
