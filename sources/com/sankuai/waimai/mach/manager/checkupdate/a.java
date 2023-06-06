package com.sankuai.waimai.mach.manager.checkupdate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public List<BundleInfo> f;
    public boolean g;
    public String[] h;

    public a(C1014a c1014a) {
        this.a = c1014a.b;
        this.b = c1014a.c;
        this.c = c1014a.d;
        this.d = c1014a.e;
        this.e = c1014a.f;
        this.g = c1014a.g;
        this.f = c1014a.h;
        this.h = c1014a.i;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager.checkupdate.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1014a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public List<BundleInfo> h;
        public String[] i;

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71429bc1317bfcdab5aa787a2ad3b761", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71429bc1317bfcdab5aa787a2ad3b761") : new a(this);
        }
    }
}
