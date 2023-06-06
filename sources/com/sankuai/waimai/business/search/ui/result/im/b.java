package com.sankuai.waimai.business.search.ui.result.im;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.model.DrugImEntranceEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    public c b;
    public a c;
    private Context d;
    private boolean e;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e669358444d914768c2f5a6ccecf69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e669358444d914768c2f5a6ccecf69");
            return;
        }
        this.e = false;
        this.d = context;
        this.c = new a(this.d);
        this.b = new c(this);
    }

    @Override // com.sankuai.waimai.business.search.ui.result.im.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c62485c07f2632ea8dfb892b633add3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c62485c07f2632ea8dfb892b633add3");
        } else {
            this.c.a(i);
        }
    }

    public final void a(@NonNull DrugImEntranceEntity drugImEntranceEntity) {
        Object[] objArr = {drugImEntranceEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ae6eb263bf7ea6b74226ee3a232041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ae6eb263bf7ea6b74226ee3a232041");
        } else if (this.c.b == null || this.e) {
        } else {
            this.c.a(drugImEntranceEntity);
            this.e = true;
        }
    }

    public final void a() {
        this.e = false;
        this.c.b = null;
    }
}
