package com.sankuai.waimai.ad.view.mach.dydialog;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.container.e;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect g;

    public b(Activity activity, com.sankuai.waimai.pouch.model.c cVar, com.sankuai.waimai.pouch.a aVar) {
        super(activity, cVar, aVar);
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32df60d8cc4f7b6f529dac784bbba77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32df60d8cc4f7b6f529dac784bbba77");
        } else {
            a(new e() { // from class: com.sankuai.waimai.ad.view.mach.dydialog.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd6fad42a469bdd3f85883708472cdec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd6fad42a469bdd3f85883708472cdec");
                    } else {
                        b.this.r().post(new Runnable() { // from class: com.sankuai.waimai.ad.view.mach.dydialog.b.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d66a33a0b124a440825f83c29437e85", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d66a33a0b124a440825f83c29437e85");
                                } else {
                                    b.this.k();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.dydialog.a, com.sankuai.waimai.ad.view.mach.a, com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37047c68dc8c84323d35a2b156c4be5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37047c68dc8c84323d35a2b156c4be5e");
        } else if (TextUtils.equals(str, "parentClose")) {
            LocalBroadcastManager.getInstance(this.j).sendBroadcast(new Intent("com.sankuai.waimai.business.page.action.closeDialog"));
        } else {
            super.a(str, map);
        }
    }
}
