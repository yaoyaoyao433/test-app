package com.sankuai.waimai.store.drug.vessel;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.preload.c;
import com.sankuai.waimai.store.base.vessel.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;

    public a() {
        super(BaseMemberActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994a587da5b38bbff8d6fc4f3e74f1b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994a587da5b38bbff8d6fc4f3e74f1b7");
        }
    }

    @Override // com.sankuai.waimai.router.activity.c, com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1514a166ba0358c0305a7684df8dfe74", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1514a166ba0358c0305a7684df8dfe74");
        }
        Intent b = super.b(jVar);
        String path = jVar.d.getPath();
        b.putExtra("vessel_path", path);
        com.sankuai.waimai.store.base.remote.a.a(path, b.class);
        return b;
    }
}
