package com.sankuai.waimai.popup.container;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends e implements com.sankuai.waimai.platform.mach.extension.nestedv2.e {
    public static ChangeQuickRedirect a;

    public b(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd73ee964c7e108161c9d3c48b8980eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd73ee964c7e108161c9d3c48b8980eb");
        } else {
            a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.popup.container.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f749d407b3eb02b9c2a832e4929e12c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f749d407b3eb02b9c2a832e4929e12c8");
                    } else {
                        b.this.r().post(new Runnable() { // from class: com.sankuai.waimai.popup.container.b.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48393bc7ffe829399f62dd2a143f4db4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48393bc7ffe829399f62dd2a143f4db4");
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

    @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.e
    public final void a(ViewGroup viewGroup, com.sankuai.waimai.mach.manager.cache.e eVar, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {viewGroup, eVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7805167a514c6599771f3dc4fa381da0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7805167a514c6599771f3dc4fa381da0");
            return;
        }
        a(viewGroup, "embededSuperStyle", "waimai");
        a(eVar, map);
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.e, com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e840a73b0384cd93da384521450c068b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e840a73b0384cd93da384521450c068b");
        } else if (TextUtils.equals(str, "parentClose")) {
            LocalBroadcastManager.getInstance(this.j).sendBroadcast(new Intent("com.sankuai.waimai.business.page.action.closeDialog"));
        } else {
            super.a(str, map);
        }
    }

    @Override // com.sankuai.waimai.popup.container.e, com.sankuai.waimai.platform.mach.dialog.e, com.sankuai.waimai.platform.mach.a
    public final com.sankuai.waimai.mach.d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca92ea398250fc3ea652b9fb4846d5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca92ea398250fc3ea652b9fb4846d5a");
        }
        String str = "";
        if (this.j instanceof FragmentActivity) {
            for (Fragment fragment : ((FragmentActivity) this.j).getSupportFragmentManager().getFragments()) {
                if (fragment instanceof HomePageFragment) {
                    str = AppUtil.generatePageInfoKey(fragment);
                }
            }
        }
        return new a("c_m84bv26", str, g());
    }

    @Override // com.sankuai.waimai.platform.mach.extension.nestedv2.e
    public final void a_(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045af20b5c6ee59d01efb104d1660ebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045af20b5c6ee59d01efb104d1660ebf");
            return;
        }
        a(rect);
        k();
    }
}
