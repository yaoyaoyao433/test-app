package com.meituan.android.neohybrid.debug;

import com.meituan.android.cipstorage.q;
import com.meituan.android.neohybrid.debug.b;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements com.meituan.android.neohybrid.base.model.c {
    public static ChangeQuickRedirect a;
    private final b.a b;

    public c(b.a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.neohybrid.base.model.c
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c164e56d752b998c30c9ea00bae829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c164e56d752b998c30c9ea00bae829");
            return;
        }
        final b.a aVar = this.b;
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = b.a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "74ee9888b03a852b7eccbcaca5ece90b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "74ee9888b03a852b7eccbcaca5ece90b");
            return;
        }
        final q a2 = af.a("finance_neo_debug");
        g.a(obj, new g.b() { // from class: com.meituan.android.neohybrid.debug.b.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.neohybrid.util.g.b, com.meituan.android.neohybrid.util.g.c
            public final void a(Boolean bool) {
                Object[] objArr3 = {bool};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79a0797d4556bafca7b481dcd4d0ae4b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79a0797d4556bafca7b481dcd4d0ae4b");
                } else {
                    a2.a(aVar.e, bool.booleanValue());
                }
            }

            @Override // com.meituan.android.neohybrid.util.g.b, com.meituan.android.neohybrid.util.g.c
            public final void a(Integer num) {
                Object[] objArr3 = {num};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20379b40bb8024364cf657b80e77f0f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20379b40bb8024364cf657b80e77f0f8");
                } else {
                    a2.a(aVar.e, num.intValue());
                }
            }

            @Override // com.meituan.android.neohybrid.util.g.b, com.meituan.android.neohybrid.util.g.c
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3e6bc67d873652a0e42769a186922d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3e6bc67d873652a0e42769a186922d2");
                } else {
                    a2.a(aVar.e, str);
                }
            }
        });
    }
}
