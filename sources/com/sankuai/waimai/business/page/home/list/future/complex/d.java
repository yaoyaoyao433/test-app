package com.sankuai.waimai.business.page.home.list.future.complex;

import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    static long m;
    public boolean b;
    public int c;
    public List<RocksServerModel> d;
    public List<RocksServerModel> e;
    public RocksServerModel f;
    public RocksServerModel g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71691cdaa15f1640bddbec99f18fd30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71691cdaa15f1640bddbec99f18fd30");
            return;
        }
        this.b = true;
        this.c = 0;
        this.d = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38b1ea41702e12d1783b6daaba8e22a9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38b1ea41702e12d1783b6daaba8e22a9") : a.a;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798c5278fa62c4e2b5a06a046aafff8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798c5278fa62c4e2b5a06a046aafff8e")).intValue();
        }
        if (this.d != null && this.d.size() > 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                if (i2 == i) {
                    return i3;
                }
                RocksServerModel rocksServerModel = this.d.get(i3);
                if (rocksServerModel != null && TextUtils.equals("mach", rocksServerModel.renderMode)) {
                    i2++;
                }
            }
        }
        return i;
    }

    public final void a(List<RocksServerModel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e78d3645aadbca1aecc3e6b348fb77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e78d3645aadbca1aecc3e6b348fb77");
            return;
        }
        this.e = list;
        this.g = null;
        this.h = false;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f3d388493e1226f63aa1806f03d235", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f3d388493e1226f63aa1806f03d235")).booleanValue();
        }
        com.sankuai.waimai.foundation.utils.log.a.b("FeedTabsDataManager", DMKeys.KEY_IS_EMPTY, new Object[0]);
        return this.b || com.sankuai.waimai.foundation.utils.d.a(this.d);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d383038aac0025d8808b5848eee57bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d383038aac0025d8808b5848eee57bd0");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("FeedTabsDataManager", KNBConfig.CONFIG_CLEAR_CACHE, new Object[0]);
        this.b = true;
        this.f = null;
        this.d = null;
        this.c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.rocks.model.RocksServerModel a(com.sankuai.waimai.business.page.home.model.ReRankListBean r23, int r24) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.future.complex.d.a(com.sankuai.waimai.business.page.home.model.ReRankListBean, int):com.sankuai.waimai.rocks.model.RocksServerModel");
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b737195ad437b1d33e611c7819381a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b737195ad437b1d33e611c7819381a4");
        }
        if (this.e == null) {
            return null;
        }
        int size = (this.g == null || this.g.moduleList == null) ? 0 : this.g.moduleList.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.e.size() - size; i++) {
            arrayList.add(this.e.get(i).dataId);
        }
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(this.g.moduleList.get(i2).dataId);
        }
        return k.a().toJson(arrayList);
    }
}
