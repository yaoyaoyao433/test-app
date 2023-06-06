package com.sankuai.waimai.store.search.mach.poi;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.search.ui.result.mach.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public c b;
    public boolean c;
    private final int d;
    private final String e;
    private final String f;

    public a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b03783d97ed3e380f74856da8822c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b03783d97ed3e380f74856da8822c2");
            return;
        }
        this.c = false;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.c = i.h().a("store_search_crash/not_use_in_screen", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    @Override // com.sankuai.waimai.mach.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r31, java.lang.String r32, int r33, java.util.Map<java.lang.String, java.lang.Object> r34, com.sankuai.waimai.mach.node.a r35) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.mach.poi.a.a(java.lang.String, java.lang.String, int, java.util.Map, com.sankuai.waimai.mach.node.a):void");
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb8cf981b2636976bc98d98722b7a39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb8cf981b2636976bc98d98722b7a39")).booleanValue();
        }
        if (h.a(str)) {
            return false;
        }
        h.b(str);
        return true;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a59dac49d4351ffefdb846b2b015df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a59dac49d4351ffefdb846b2b015df")).booleanValue();
        }
        if (t.a(str)) {
            return false;
        }
        return TextUtils.equals(str, "b_IPU0P") || TextUtils.equals(str, "b_ddZz3") || TextUtils.equals(str, "b_bzIsD") || TextUtils.equals(str, "b_KOXis") || TextUtils.equals(str, "b_U41Mv") || TextUtils.equals(str, "b_DpKEu") || TextUtils.equals(str, "b_waimai_yoruhn22_mv");
    }

    private boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa20178f5c25a3e37dc10952c3546195", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa20178f5c25a3e37dc10952c3546195")).booleanValue();
        }
        if (t.a(str)) {
            return false;
        }
        return TextUtils.equals(str, "b_GTOR0") || TextUtils.equals(str, "b_HN5XY") || TextUtils.equals(str, "b_ZCYtX") || TextUtils.equals(str, "b_IDNii") || TextUtils.equals(str, "b_W0kxz") || TextUtils.equals(str, "b_HTbEQ");
    }
}
