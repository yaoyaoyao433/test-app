package com.sankuai.waimai.machpro.bundle;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager_new.download.d;
import com.sankuai.waimai.mach.manager_new.ioq.j;
import com.sankuai.waimai.mach.utils.e;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.manager_new.ioq.b<Boolean> {
    public static ChangeQuickRedirect g;

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final String a() {
        return "IORollbackSubBundle";
    }

    public a(j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49be19f9f7c29f857a45154f169a20f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49be19f9f7c29f857a45154f169a20f");
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void f() throws Exception {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f623ec249fe02d62566aff865c7b8f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f623ec249fe02d62566aff865c7b8f4b");
            return;
        }
        super.f();
        BundleInfo c = c();
        if (com.sankuai.waimai.mach.manager_new.common.a.d(c)) {
            for (File file : new File(d.b() + File.separator + c.getMachId()).listFiles()) {
                if (file != null && !TextUtils.isEmpty(file.getName())) {
                    String[] split = file.getName().split("@");
                    if (split.length == 2 && com.sankuai.waimai.machpro.util.b.a(split[1], c.getVersion()) > 0) {
                        e.a(file);
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.manager_new.ioq.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6ac6d4f0490bfeb300811068eeece1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6ac6d4f0490bfeb300811068eeece1");
        } else {
            super.g();
        }
    }
}
