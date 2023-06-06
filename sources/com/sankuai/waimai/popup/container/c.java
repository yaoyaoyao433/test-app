package com.sankuai.waimai.popup.container;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.extension.nestedv2.EmbedProcessorV2;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    private BroadcastReceiver c;

    static {
        com.sankuai.waimai.platform.mach.extension.nestedv2.f.a().a("wm_home_embeded_super_style", new com.sankuai.waimai.platform.mach.extension.nestedv2.d() { // from class: com.sankuai.waimai.popup.container.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.d
            public final com.sankuai.waimai.platform.mach.extension.nestedv2.e a(Activity activity, String str) {
                Object[] objArr = {activity, str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72be7b7c440a82d4feb5f81c906ddefb", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.mach.extension.nestedv2.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72be7b7c440a82d4feb5f81c906ddefb") : new b(activity, str);
            }
        });
    }

    public c(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acdcf62fa4f876d9f36aefcab2e37d24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acdcf62fa4f876d9f36aefcab2e37d24");
        } else {
            this.c = new BroadcastReceiver() { // from class: com.sankuai.waimai.popup.container.SkyFallEmbedParentMachContainer$1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    DynamicDialog.d dVar;
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56117e165ca9fc44619c1e9bb4968d7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56117e165ca9fc44619c1e9bb4968d7f");
                    } else if (TextUtils.equals(intent.getAction(), "com.sankuai.waimai.business.page.action.closeDialog")) {
                        dVar = ((com.sankuai.waimai.platform.mach.dialog.e) c.this).e;
                        dVar.a();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(ViewGroup viewGroup, String str, String str2) {
        Object[] objArr = {viewGroup, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e48657577bad153def75723c31f536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e48657577bad153def75723c31f536");
            return;
        }
        super.a(viewGroup, str, str2);
        LocalBroadcastManager.getInstance(this.j).registerReceiver(this.c, new IntentFilter("com.sankuai.waimai.business.page.action.closeDialog"));
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b30c2dc90a5bc82220409f4a76d7c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b30c2dc90a5bc82220409f4a76d7c0");
            return;
        }
        super.a(aVar);
        aVar.a(new EmbedProcessorV2());
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57eaccb44d69da746813819e1bafc3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57eaccb44d69da746813819e1bafc3fe");
            return;
        }
        super.f();
        com.sankuai.waimai.platform.mach.extension.nestedv2.b.a().a(this.k);
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563d9eac683ea8ed6430d474132b9348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563d9eac683ea8ed6430d474132b9348");
            return;
        }
        super.b();
        Rect rect = new Rect();
        if (r() == null || !r().getGlobalVisibleRect(rect)) {
            return;
        }
        com.sankuai.waimai.platform.mach.extension.nestedv2.b.a().a(this.k, rect);
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d783004162d87aef732228739e372013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d783004162d87aef732228739e372013");
            return;
        }
        super.o();
        LocalBroadcastManager.getInstance(this.j).unregisterReceiver(this.c);
    }
}
