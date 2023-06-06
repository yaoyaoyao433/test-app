package com.sankuai.waimai.irmo.render.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Map<String, String> j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "006bcd533c0002b8201e9d0908dde6fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "006bcd533c0002b8201e9d0908dde6fd");
            return;
        }
        this.c = "irmo";
        this.d = "default";
        this.i = true;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.render.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0976a {
        public static ChangeQuickRedirect a;
        protected a b;

        public C0976a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691c2fcaf483ff423daafe0d6b934a2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691c2fcaf483ff423daafe0d6b934a2f");
            } else {
                this.b = new a();
            }
        }

        public final C0976a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7812912bceb14d7f3e6ca72bfb74f0", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0976a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7812912bceb14d7f3e6ca72bfb74f0");
            }
            a aVar = this.b;
            aVar.b = "irmo_effect_type_" + i;
            return this;
        }

        public final C0976a a(String str) {
            this.b.d = str;
            return this;
        }

        public final C0976a b(String str) {
            this.b.e = str;
            return this;
        }

        public final C0976a c(String str) {
            this.b.f = str;
            return this;
        }

        public final C0976a a(boolean z) {
            this.b.g = true;
            return this;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12fc6d8a080cbe73955d2aa91ce2061c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12fc6d8a080cbe73955d2aa91ce2061c");
            }
            if (this.b == null || TextUtils.isEmpty(this.b.b)) {
                throw new IllegalArgumentException("Log module can not be null");
            }
            return this.b;
        }
    }
}
