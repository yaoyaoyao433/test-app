package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.a$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 implements b.c {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewGroup c;

        public AnonymousClass1(View view, ViewGroup viewGroup) {
            this.b = view;
            this.c = viewGroup;
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc930fac0c03d98f4e8917d465a3aea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc930fac0c03d98f4e8917d465a3aea");
                return;
            }
            this.b.setVisibility(0);
            c();
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.c
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369790b05a8d897528c3827f78a266db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369790b05a8d897528c3827f78a266db");
            } else {
                c();
            }
        }

        private void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4850d99dfd965dd67a2d8f15a52c6fc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4850d99dfd965dd67a2d8f15a52c6fc1");
            } else {
                this.c.postDelayed(b.a(this.c, this.b), 2100L);
            }
        }
    }
}
