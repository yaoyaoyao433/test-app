package com.sankuai.waimai.ugc.creator.framework;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ugc.creator.framework.c
    public final void a(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab1b352d9812a63243c97594846b005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab1b352d9812a63243c97594846b005");
            return;
        }
        super.a(activity, bundle);
        if (this.f != null) {
            activity.setContentView(this.f.s);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.c
    public final e b(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac34dc790712604a22794e327cf66fc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac34dc790712604a22794e327cf66fc1");
        }
        e eVar = new e(activity);
        eVar.d = bundle;
        return eVar;
    }
}
