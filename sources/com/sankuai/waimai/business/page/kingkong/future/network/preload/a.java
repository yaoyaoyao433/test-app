package com.sankuai.waimai.business.page.kingkong.future.network.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.tablist.rocklist.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public f b;
    public int c;
    public List<RocksServerModel> d;
    public boolean e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e747eef588626765bf001b850bbed9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e747eef588626765bf001b850bbed9");
            return;
        }
        this.c = 4;
        this.e = false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.network.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0801a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "844749e7715f7ad7bc3d3dbe3eba7e80", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "844749e7715f7ad7bc3d3dbe3eba7e80") : C0801a.a;
    }
}
