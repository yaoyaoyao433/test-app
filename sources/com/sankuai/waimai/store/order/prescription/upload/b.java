package com.sankuai.waimai.store.order.prescription.upload;

import android.content.Context;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends f<e, String> {
    public static ChangeQuickRedirect a;
    private final Context h;

    @Override // com.sankuai.waimai.store.order.prescription.upload.f
    @WorkerThread
    public final /* synthetic */ String a(e eVar, final int i) throws Throwable {
        com.sankuai.waimai.ugc.image.a a2;
        final e eVar2 = eVar;
        Object[] objArr = {eVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ed5c352832011d81ab4c910ab82df4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ed5c352832011d81ab4c910ab82df4");
        }
        if (p.a(this.h) && (a2 = d.a()) != null) {
            a(eVar2, 0, i);
            return a2.a(this.h, eVar2.c, new com.sankuai.waimai.ugc.image.b() { // from class: com.sankuai.waimai.store.order.prescription.upload.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.image.b
                public final void a(int i2) {
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8424b4f57d190484dc81d8176969b1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8424b4f57d190484dc81d8176969b1f");
                    } else {
                        b.this.a(eVar2, i2, i);
                    }
                }
            });
        }
        return null;
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33844b074b0f13c998916e825124f804", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33844b074b0f13c998916e825124f804");
        } else {
            this.h = context;
        }
    }
}
