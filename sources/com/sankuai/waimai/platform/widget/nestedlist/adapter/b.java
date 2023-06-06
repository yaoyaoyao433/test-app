package com.sankuai.waimai.platform.widget.nestedlist.adapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.widget.nestedlist.impl.e;
import com.sankuai.waimai.platform.widget.nestedlist.interfaces.d;
import com.sankuai.waimai.platform.widget.recycler.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<Holder extends com.sankuai.waimai.platform.widget.recycler.b, Group, Child> extends a<Holder, Group, Child> {
    public static ChangeQuickRedirect b;
    @NonNull
    public final e c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ebfdaeb4b2993c8add0ac989c4b868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ebfdaeb4b2993c8add0ac989c4b868");
            return;
        }
        this.c = new e(new com.sankuai.waimai.platform.widget.nestedlist.impl.c());
        this.c.a(new com.sankuai.waimai.platform.widget.recycler.e() { // from class: com.sankuai.waimai.platform.widget.nestedlist.adapter.b.1
        });
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.adapter.a
    @NonNull
    public final /* bridge */ /* synthetic */ d a() {
        return this.c;
    }
}
