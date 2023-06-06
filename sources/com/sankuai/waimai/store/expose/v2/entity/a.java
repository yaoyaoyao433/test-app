package com.sankuai.waimai.store.expose.v2.entity;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends c {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.expose.v2.entity.b
    public final boolean b() {
        return true;
    }

    public a(View view) {
        this(view, null);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f2b1e84886dbd82d28444de40a958f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f2b1e84886dbd82d28444de40a958f");
        }
    }

    public a(View view, String str) {
        super((String) null, view, str);
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32df700e08c4f6ac56953540ea86c158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32df700e08c4f6ac56953540ea86c158");
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c, com.sankuai.waimai.store.expose.v2.entity.b
    public final void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3da1ed1d0e8bc3272bb82f78c271e9cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3da1ed1d0e8bc3272bb82f78c271e9cd");
        } else if (this.i != null) {
            this.i.a();
        }
    }
}
