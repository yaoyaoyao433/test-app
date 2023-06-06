package com.sankuai.waimai.store.im.prepare;

import android.app.Dialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.base.log.SGDrugIMGroupEnter;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.im.base.prepare.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    public b(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186f975b841f71c16d352214197bb25b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186f975b841f71c16d352214197bb25b");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.prepare.a
    public final void a(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11227a615399d5f0651984093f0cc774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11227a615399d5f0651984093f0cc774");
            return;
        }
        long a2 = d.a(intent, "chatID", "chatID", 0L);
        String a3 = d.a(intent, "is_first_enter", "is_first_enter", "0");
        final String a4 = d.a(intent, "show_group_coupon", "show_group_coupon", "0");
        long e = com.sankuai.xm.login.a.a().e();
        final boolean equals = TextUtils.equals(a3, "1");
        Object[] objArr2 = {new Long(a2), new Long(e), Byte.valueOf(equals ? (byte) 1 : (byte) 0), a4};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db771034db00dcdfc583f92d97e0bd2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db771034db00dcdfc583f92d97e0bd2e");
            return;
        }
        final Dialog a5 = com.sankuai.waimai.store.util.d.a(this.c);
        com.sankuai.waimai.store.im.base.net.b.a(p()).a(a2, e, new j<UserGroupImInfo>() { // from class: com.sankuai.waimai.store.im.prepare.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4e0597ad73284ef65b57ccc80d0dd0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4e0597ad73284ef65b57ccc80d0dd0c");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:53:0x01f3  */
            @Override // com.sankuai.waimai.store.base.net.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void a(com.sankuai.waimai.store.im.group.model.UserGroupImInfo r25) {
                /*
                    Method dump skipped, instructions count: 517
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.prepare.b.AnonymousClass1.a(java.lang.Object):void");
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6dc7c737e9754ec92165642d7c3dc927", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6dc7c737e9754ec92165642d7c3dc927");
                    return;
                }
                c.a(SGDrugIMGroupEnter.RequestAPIError, "", "");
                if (a5 != null) {
                    a5.dismiss();
                }
                com.sankuai.waimai.store.im.util.b.a(bVar, b.this.c);
                b.this.e();
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
        }

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a931ca5c92216a7a5810ecca761873", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a931ca5c92216a7a5810ecca761873") : new b(sCBaseActivity);
        }
    }
}
