package com.sankuai.waimai.ad.view.mach.dydialog;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.nested.PouchEmbedProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect g;
    private PouchEmbedProcessor G;
    private com.sankuai.waimai.ad.view.mach.nested.a H;
    private BroadcastReceiver I;

    public c(Activity activity, com.sankuai.waimai.pouch.model.c cVar, com.sankuai.waimai.pouch.a aVar) {
        super(activity, cVar, aVar);
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7d89850d933556cbb5c4aca2f3cd26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7d89850d933556cbb5c4aca2f3cd26");
        } else {
            this.I = new BroadcastReceiver() { // from class: com.sankuai.waimai.ad.view.mach.dydialog.WMPouchMachPopupEmbedParentContainer$1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0722d543dd94f2f7c99d26432f230722", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0722d543dd94f2f7c99d26432f230722");
                    } else if (TextUtils.equals(intent.getAction(), "com.sankuai.waimai.business.page.action.closeDialog")) {
                        ((a) c.this).e.a();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.dydialog.a, com.sankuai.waimai.platform.mach.dialog.h
    public final void a(@NonNull DynamicDialog.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f13f52c7a9cc9513683dfdd9ce30c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f13f52c7a9cc9513683dfdd9ce30c55");
            return;
        }
        super.a(dVar);
        if (this.G != null) {
            this.G.a(dVar);
            this.H.a(dVar);
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(ViewGroup viewGroup, String str, String str2) {
        Object[] objArr = {viewGroup, str, str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c26aa8e07fe4587bc56add8cfd5de99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c26aa8e07fe4587bc56add8cfd5de99");
            return;
        }
        super.a(viewGroup, str, str2);
        LocalBroadcastManager.getInstance(this.j).registerReceiver(this.I, new IntentFilter("com.sankuai.waimai.business.page.action.closeDialog"));
    }

    @Override // com.sankuai.waimai.ad.view.mach.a, com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5abbdde34e75789fb23e5134cec52b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5abbdde34e75789fb23e5134cec52b5");
            return;
        }
        super.a(aVar);
        this.G = new PouchEmbedProcessor(((a) this).e, this.B);
        this.H = new com.sankuai.waimai.ad.view.mach.nested.a(((a) this).e, this.B);
        aVar.a(this.G);
        aVar.a(this.H);
    }

    @Override // com.sankuai.waimai.ad.view.mach.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1860e994d2605b1a33437e2d8b246944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1860e994d2605b1a33437e2d8b246944");
            return;
        }
        super.h();
        com.sankuai.waimai.ad.view.mach.nested.c.a().a(this.k);
    }

    @Override // com.sankuai.waimai.ad.view.mach.a, com.sankuai.waimai.pouch.mach.container.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824662c07fdd31875c802ee7c4c1c325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824662c07fdd31875c802ee7c4c1c325");
            return;
        }
        super.d();
        Rect rect = new Rect();
        if (r() == null || !r().getGlobalVisibleRect(rect)) {
            return;
        }
        com.sankuai.waimai.ad.view.mach.nested.c.a().a(this.k, rect);
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676fefb6529a4ef6be3b2b55c87db347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676fefb6529a4ef6be3b2b55c87db347");
            return;
        }
        super.o();
        LocalBroadcastManager.getInstance(this.j).unregisterReceiver(this.I);
    }
}
