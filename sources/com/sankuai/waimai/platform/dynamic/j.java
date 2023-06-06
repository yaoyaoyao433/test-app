package com.sankuai.waimai.platform.dynamic;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends com.meituan.android.cube.pga.viewmodel.a {
    public static ChangeQuickRedirect o;
    public String p;
    String q;
    Map<String, Object> r;
    private String s;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final /* synthetic */ Object f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48afe2016929c2feab3653f6e1cb9cf2", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48afe2016929c2feab3653f6e1cb9cf2") : new i(this.p, this.q, this.r, this.s);
    }

    public j() {
    }

    public j(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200465a51a5b233b0b99f86ddb7a070f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200465a51a5b233b0b99f86ddb7a070f");
            return;
        }
        this.p = str;
        this.q = str2;
        this.s = str3;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50acf47df11a02e46994c2d5f31b7b73", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50acf47df11a02e46994c2d5f31b7b73");
        }
        if (TextUtils.isEmpty(this.p)) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.s)) {
            return Boolean.FALSE;
        }
        try {
            this.r = com.sankuai.waimai.mach.utils.b.a(this.s);
            if (com.sankuai.waimai.mach.utils.e.a(this.r)) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final /* bridge */ /* synthetic */ Object e() {
        return this.s;
    }
}
