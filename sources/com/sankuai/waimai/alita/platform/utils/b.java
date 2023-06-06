package com.sankuai.waimai.alita.platform.utils;

import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.init.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03cae645bae02145249c25d430dd1a9d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03cae645bae02145249c25d430dd1a9d")).booleanValue() : c() || d();
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5089573e82396c09e3227af17f7b5661", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5089573e82396c09e3227af17f7b5661")).intValue() : a() ? 0 : 1;
    }

    private static boolean c() {
        char c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e801f6eaf5be54880772db9e6db5bf12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e801f6eaf5be54880772db9e6db5bf12")).booleanValue();
        }
        String a2 = c.a().a();
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String lowerCase = a2.toLowerCase();
        int hashCode = lowerCase.hashCode();
        if (hashCode == -795280874) {
            if (lowerCase.equals("waimai")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3387436) {
            if (hashCode == 98629247 && lowerCase.equals("group")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals(RouteSelector.BRAND_NOVA)) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return "1".equals(com.sankuai.waimai.alita.platform.privacy.c.a().b());
            case 1:
                return "1".equals(com.sankuai.waimai.alita.platform.privacy.b.a().b());
            case 2:
                return "1".equals(com.sankuai.waimai.alita.platform.privacy.a.a().b());
            default:
                return false;
        }
    }

    private static boolean d() {
        char c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae7774a91fce48e9284065691ec34184", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae7774a91fce48e9284065691ec34184")).booleanValue();
        }
        String a2 = c.a().a();
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        String lowerCase = a2.toLowerCase();
        int hashCode = lowerCase.hashCode();
        if (hashCode == -795280874) {
            if (lowerCase.equals("waimai")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3387436) {
            if (hashCode == 98629247 && lowerCase.equals("group")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals(RouteSelector.BRAND_NOVA)) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return "1".equals(com.sankuai.waimai.alita.platform.privacy.c.a().c());
            case 1:
                return "1".equals(com.sankuai.waimai.alita.platform.privacy.b.a().c());
            case 2:
                return "1".equals(com.sankuai.waimai.alita.platform.privacy.a.a().c());
            default:
                return false;
        }
    }
}
