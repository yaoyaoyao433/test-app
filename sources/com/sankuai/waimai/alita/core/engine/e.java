package com.sankuai.waimai.alita.core.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e implements i {
    public static ChangeQuickRedirect a;
    public static CopyOnWriteArrayList<i> b = new CopyOnWriteArrayList<>();
    private static e c;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89c1f9d4fcb68185e97141204355022a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89c1f9d4fcb68185e97141204355022a");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e();
                }
            }
        }
        return c;
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f62edbc918a1efded99626c42729a47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f62edbc918a1efded99626c42729a47");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).a(str, i);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2d41591bef6e6c549706e7384d8dca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2d41591bef6e6c549706e7384d8dca");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).b(str, i);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void a(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b6804295ebc99e48c5c7de75931438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b6804295ebc99e48c5c7de75931438");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).a(str, i, z);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void c(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0893dc83d8860a4a43df1123816c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0893dc83d8860a4a43df1123816c72");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).c(str, i);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void d(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a819aff3e87d0080b1827602c53ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a819aff3e87d0080b1827602c53ef2");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).d(str, i);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void b(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0a477dd907ca178fce6bf55c886626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0a477dd907ca178fce6bf55c886626");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).b(str, i, z);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void e(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fecf68f3a86e89956b33fcb59c867ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fecf68f3a86e89956b33fcb59c867ed");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).e(str, i);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void a(String str, int i, boolean z, Map<String, String> map) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7f2da91e85c7d7665f14490b734c8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7f2da91e85c7d7665f14490b734c8c");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).a(str, i, z, map);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void c(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a29b33d7da71aa96de1216281f2efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a29b33d7da71aa96de1216281f2efe");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).c(str, i, z);
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final void d(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163174acb025e3c95291277c9d896259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163174acb025e3c95291277c9d896259");
            return;
        }
        for (int i2 = 0; i2 < b.size(); i2++) {
            try {
                b.get(i2).d(str, i, z);
            } catch (Exception unused) {
                return;
            }
        }
    }
}
