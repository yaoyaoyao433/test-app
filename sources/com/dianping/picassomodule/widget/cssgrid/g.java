package com.dianping.picassomodule.widget.cssgrid;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public String a;
    public a b;

    public g() {
        this("#FFd7d7d7");
    }

    private g(String str) {
        this(str, a.GRID_SERPERATIONLINE_STYLE_NONE);
    }

    public g(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            this.a = "#FFd7d7d7";
        } else {
            this.a = str;
        }
        this.b = aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        GRID_SERPERATIONLINE_STYLE_NONE,
        GRID_SERPERATIONLINE_STYLE_AVERAGE,
        GRID_SERPERATIONLINE_STYLE_AUTO,
        GRID_SERPERATIONLINE_STYLE_AUTOINCLUDEBLANK;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e733769ba0648a631f2b935526f8096a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e733769ba0648a631f2b935526f8096a");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7871a1b73235e0187448a2f15912e98", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7871a1b73235e0187448a2f15912e98") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f202e008102dd22f4b18188bc5a742f0", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f202e008102dd22f4b18188bc5a742f0") : (a[]) values().clone();
        }
    }
}
