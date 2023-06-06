package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h extends com.sankuai.waimai.store.base.b implements d {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.store.expose.v2.a b;
    protected int c;
    protected UserGroupImInfo d;
    protected int e;
    public String f;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94960e23e93cfefb6da78e2d6399ef8d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94960e23e93cfefb6da78e2d6399ef8d") : !TextUtils.isEmpty(this.f) ? this.f : "";
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void a(UserGroupImInfo userGroupImInfo) {
        this.d = userGroupImInfo;
    }

    public h(@NonNull Context context, @NonNull com.sankuai.waimai.store.expose.v2.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e617ca3d1905fad7dcd1bf91e36ed84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e617ca3d1905fad7dcd1bf91e36ed84");
        } else {
            this.b = aVar;
        }
    }

    public final void b(int i) {
        this.c = i;
    }
}
