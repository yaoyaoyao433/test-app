package com.meituan.android.common.locate.locator.trigger;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.locator.trigger.c;
import com.meituan.android.common.locate.provider.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class d implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c.a a;
    private t b;

    public d(@NonNull c.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "931a53bed2ee4d918f7a9f66be173dbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "931a53bed2ee4d918f7a9f66be173dbb");
            return;
        }
        this.a = aVar;
        this.b = t.a(context);
    }

    @Override // com.meituan.android.common.locate.locator.trigger.b
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ca07b761ea69cdfbc6fdef3fff81f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ca07b761ea69cdfbc6fdef3fff81f12");
        } else {
            this.b.a(this.a);
        }
    }

    @Override // com.meituan.android.common.locate.locator.trigger.b
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2fba2676fe8a47575a651621b761046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2fba2676fe8a47575a651621b761046");
        } else {
            this.b.b(this.a);
        }
    }
}
