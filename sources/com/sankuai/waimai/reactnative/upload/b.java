package com.sankuai.waimai.reactnative.upload;

import android.content.Context;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends k<h, String> {
    public static ChangeQuickRedirect a;
    private final Context h;

    @Override // com.sankuai.waimai.reactnative.upload.k
    @WorkerThread
    public final /* synthetic */ String a(h hVar, final int i) throws Throwable {
        com.sankuai.waimai.ugc.image.a a2;
        final h hVar2 = hVar;
        Object[] objArr = {hVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705c265e21b1fea610c4e8b7173e87b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705c265e21b1fea610c4e8b7173e87b5");
        }
        if (p.a(this.h) && (a2 = g.a()) != null) {
            a(hVar2, 0, i);
            return a2.a(this.h, hVar2.c, new com.sankuai.waimai.ugc.image.b() { // from class: com.sankuai.waimai.reactnative.upload.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.image.b
                public final void a(int i2) {
                    Object[] objArr2 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ee709e08eabd782739d960d3d5ca9de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ee709e08eabd782739d960d3d5ca9de");
                    } else {
                        b.this.a(hVar2, i2, i);
                    }
                }
            });
        }
        return null;
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a864530ed46ed8e8b7aed46f0f55ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a864530ed46ed8e8b7aed46f0f55ee");
        } else {
            this.h = context;
        }
    }
}
