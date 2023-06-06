package com.sankuai.waimai.platform.widget.nestedlist.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a {
    public static ChangeQuickRedirect e;
    @NonNull
    private int[] f;
    private int i;

    public e(@NonNull com.sankuai.waimai.platform.widget.nestedlist.interfaces.e eVar) {
        super(eVar);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c08daf62df0bc35ccf6ba00b1fbaa4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c08daf62df0bc35ccf6ba00b1fbaa4b");
            return;
        }
        this.f = new int[0];
        this.i = 0;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5113042f9dcdb1f76119f3980a27a625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5113042f9dcdb1f76119f3980a27a625");
            return;
        }
        int a = this.b.a();
        if (a <= 0) {
            this.f = new int[0];
            this.i = 0;
            return;
        }
        this.f = new int[a];
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            i += this.b.a(i2) + 1;
            this.f[i2] = i;
        }
        this.i = i;
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.d
    public final Object b(int i, @Nullable GroupItemInfo groupItemInfo) {
        Object[] objArr = {Integer.valueOf(i), groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160f34a7e8adbe960e2b607dcf938487", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160f34a7e8adbe960e2b607dcf938487");
        }
        if (groupItemInfo == null) {
            groupItemInfo = this.d;
        }
        int a = a(this.f, i);
        if (a >= 0) {
            int i2 = a > 0 ? this.f[a - 1] : 0;
            if (i2 == i) {
                return c(a, groupItemInfo);
            }
            return a(a, (i - i2) - 1, groupItemInfo);
        }
        Object[] objArr2 = {groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "154e56c22f9745cad976a74002d1a131", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "154e56c22f9745cad976a74002d1a131");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = GroupItemInfo.a;
        if (PatchProxy.isSupport(objArr3, groupItemInfo, changeQuickRedirect3, false, "dbcbcd2cf1e2a3df84dbe0a533be6fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, groupItemInfo, changeQuickRedirect3, false, "dbcbcd2cf1e2a3df84dbe0a533be6fd6");
        } else {
            groupItemInfo.b = -1;
            groupItemInfo.c = -1;
            groupItemInfo.d = 0;
            groupItemInfo.e = 0;
            groupItemInfo.f = false;
            groupItemInfo.g = null;
        }
        return null;
    }

    private static int a(int[] iArr, int i) {
        Object[] objArr = {iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3fc64de0473ee1ae3a7c6da4a56513a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3fc64de0473ee1ae3a7c6da4a56513a")).intValue();
        }
        if (iArr.length != 0 && i >= 0 && i <= iArr[iArr.length - 1]) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (i <= iArr[i2] - 1) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.d
    public final int c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.impl.a
    public final int a() {
        return this.f.length;
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.b
    public final int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729be8e3e6b06f7a492b8e4865fa0b3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729be8e3e6b06f7a492b8e4865fa0b3f")).intValue();
        }
        int length = this.f.length;
        if (i < 0 || i >= length) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return this.f[i - 1];
    }
}
