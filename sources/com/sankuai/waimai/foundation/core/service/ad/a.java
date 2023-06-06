package com.sankuai.waimai.foundation.core.service.ad;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;

    public a() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.core.service.ad.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0946a {
        public static ChangeQuickRedirect a;
        public a b;

        public C0946a(int i, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffda4dbfde20aff8622cd5d2ba361f4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffda4dbfde20aff8622cd5d2ba361f4");
                return;
            }
            this.b = new a();
            this.b.e = i;
            this.b.a = str;
            this.b.b = str2;
        }

        public final C0946a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68722e384df928d686009d1edb6f6da3", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0946a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68722e384df928d686009d1edb6f6da3");
            }
            this.b.c = str;
            return this;
        }
    }
}
