package com.sankuai.waimai.store.goods.list;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.config.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends h {
    public static ChangeQuickRedirect a;
    private c b;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f553913565a6067fbe9b271f0b90645a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f553913565a6067fbe9b271f0b90645a")).booleanValue();
        }
        a();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3 A[Catch: Exception -> 0x01ef, TryCatch #0 {Exception -> 0x01ef, blocks: (B:62:0x01b0, B:64:0x01c3, B:65:0x01ca, B:67:0x01d9, B:68:0x01de), top: B:107:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9 A[Catch: Exception -> 0x01ef, TryCatch #0 {Exception -> 0x01ef, blocks: (B:62:0x01b0, B:64:0x01c3, B:65:0x01ca, B:67:0x01d9, B:68:0x01de), top: B:107:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    @Override // com.sankuai.waimai.router.core.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull final com.sankuai.waimai.router.core.j r27, @android.support.annotation.NonNull final com.sankuai.waimai.router.core.g r28) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.d.a(com.sankuai.waimai.router.core.j, com.sankuai.waimai.router.core.g):void");
    }

    private void a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78da33a687a82dd5f612dd6d61936861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78da33a687a82dd5f612dd6d61936861");
        } else if (this.b == null) {
            if (com.sankuai.waimai.store.config.j.h().a("store_msc_server_strategy", (k.d() || k.c()) ? true : true)) {
                this.b = new b();
            } else {
                this.b = new e();
            }
        }
    }
}
