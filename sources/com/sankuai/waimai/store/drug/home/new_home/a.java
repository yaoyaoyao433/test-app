package com.sankuai.waimai.store.drug.home.new_home;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.newp.methods.OnJsEventJump;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Mach.d, com.sankuai.waimai.store.mach.event.a {
    public static ChangeQuickRedirect a;
    private SCBaseActivity b;
    private OnJsEventJump c;

    @Override // com.sankuai.waimai.store.mach.event.a
    public final void b(@NonNull String str, @Nullable Map<String, Object> map) {
    }

    public a(SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1a2658838e0207b440cd75f9aea456c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1a2658838e0207b440cd75f9aea456c");
        } else {
            this.b = sCBaseActivity;
        }
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9970296398820771263930149d5c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9970296398820771263930149d5c2b");
        } else if ("jump".equals(str)) {
            if (this.c == null) {
                this.c = new OnJsEventJump();
            }
            this.c.a(this, str, map);
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.a
    public final Activity a() {
        return this.b;
    }
}
