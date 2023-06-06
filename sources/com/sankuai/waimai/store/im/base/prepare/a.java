package com.sankuai.waimai.store.im.base.prepare;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect d;

    public abstract void a(@NonNull Intent intent);

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        return "";
    }

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5398994f3bc4f1e1f2fcb63fe3c52cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5398994f3bc4f1e1f2fcb63fe3c52cf");
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c88713751f9be6e91fc43607aefcbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c88713751f9be6e91fc43607aefcbc");
            return;
        }
        super.a(bundle);
        Intent l = l();
        if (l == null) {
            e();
        } else {
            a(l);
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be5229397c8581efe47379ae7d7320a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be5229397c8581efe47379ae7d7320a7");
            return;
        }
        super.b(intent);
        if (intent != null) {
            a(intent);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ababc2f1ef4b8e2ba5d72ae48373cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ababc2f1ef4b8e2ba5d72ae48373cfc");
        } else {
            m();
        }
    }
}
