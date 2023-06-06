package com.meituan.passport.utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public boolean i;
        public boolean j;
        public int k;
        public boolean l;
        public boolean m;
        public boolean n;
        private Bundle o;

        public final a a(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b750affc2da8ef54f700116a642dbe3e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b750affc2da8ef54f700116a642dbe3e");
            }
            c cVar = new c(bundle);
            this.b = cVar.b();
            this.c = cVar.a();
            this.d = cVar.c();
            this.e = cVar.d();
            this.f = cVar.e();
            this.g = cVar.f();
            this.h = cVar.g();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            this.i = PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "81b2d74c5b7ccc8f577de90d3feabd2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "81b2d74c5b7ccc8f577de90d3feabd2c")).booleanValue() : cVar.a("arg_union_login_switch");
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            this.j = PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "68ea38109055076c4998045cb435a255", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "68ea38109055076c4998045cb435a255")).booleanValue() : cVar.a("arg_voice_confirm");
            this.k = cVar.h();
            this.l = cVar.i();
            this.m = cVar.j();
            this.n = cVar.k();
            return this;
        }

        public final Bundle a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4401215fda122e3d6fa99191283e7053", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4401215fda122e3d6fa99191283e7053");
            }
            Bundle bundle = this.o;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("arg_phone_number", this.b);
            bundle.putString("arg_country_code", this.c);
            bundle.putString("arg_ticket", this.d);
            bundle.putString("arg_requestCode", this.e);
            bundle.putString("arg_responseCode", this.f);
            bundle.putString("arg_yoda_result", this.g);
            bundle.putString("arg_poi_id", this.h);
            bundle.putBoolean("arg_union_login_switch", this.i);
            bundle.putBoolean("arg_voice_confirm", this.j);
            bundle.putInt("arg_action", this.k);
            bundle.putBoolean("arg_is_voice", this.l);
            bundle.putBoolean("arg_is_checkbox_checked", this.m);
            bundle.putBoolean("arg_is_first_show", this.n);
            return bundle;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private Bundle b;

        public c(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43061dd800359667bffc6f483d70c11e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43061dd800359667bffc6f483d70c11e");
            } else {
                this.b = bundle;
            }
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30487a4af4c16ae0bb67075d95f994d8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30487a4af4c16ae0bb67075d95f994d8") : b("arg_country_code");
        }

        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4652a204ece252841760603fcd94eefa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4652a204ece252841760603fcd94eefa") : b("arg_phone_number");
        }

        public final String c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b182dc905f19f8847e962181fc0e3c31", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b182dc905f19f8847e962181fc0e3c31") : b("arg_ticket");
        }

        public final String d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b2f755e62b2052b2bd9b142190d85f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b2f755e62b2052b2bd9b142190d85f") : b("arg_requestCode");
        }

        public final String e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24650532fb29cd33e5aef6a9ee9f7002", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24650532fb29cd33e5aef6a9ee9f7002") : b("arg_responseCode");
        }

        public final String f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c054d981522cc5c081d2299a8bced69", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c054d981522cc5c081d2299a8bced69") : b("arg_yoda_result");
        }

        public final String g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68421ccc106d7d0b29c334e16a631c08", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68421ccc106d7d0b29c334e16a631c08") : b("arg_poi_id");
        }

        public final int h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a7acd4fa153eabf77e7ba320f5600d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a7acd4fa153eabf77e7ba320f5600d")).intValue() : c("arg_action");
        }

        public final boolean i() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e88ac3a6dbd34f5fef311fb684fb0e92", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e88ac3a6dbd34f5fef311fb684fb0e92")).booleanValue() : a("arg_is_voice");
        }

        public final boolean j() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d767456640d5a1f9f408ec1e28b35ac2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d767456640d5a1f9f408ec1e28b35ac2")).booleanValue() : a("arg_is_checkbox_checked");
        }

        public final boolean k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6ab2c137a8b07be2987e0a20b50ba8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6ab2c137a8b07be2987e0a20b50ba8")).booleanValue() : a("arg_is_first_show");
        }

        private String b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d46b7f9c8913c486991bec855afc912", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d46b7f9c8913c486991bec855afc912");
            }
            try {
                if (this.b != null) {
                    return this.b.getString(str, "");
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "825a197dc4aeb95dcf5156db0d4dab9a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "825a197dc4aeb95dcf5156db0d4dab9a")).booleanValue();
            }
            try {
                if (this.b != null) {
                    return this.b.getBoolean(str, false);
                }
            } catch (Exception unused) {
            }
            return false;
        }

        private int c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a05f6bc998c4f2bedc43e4cd2afe41", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a05f6bc998c4f2bedc43e4cd2afe41")).intValue();
            }
            try {
                if (this.b != null) {
                    return this.b.getInt(str);
                }
            } catch (Exception unused) {
            }
            return 0;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0515b {
        public static ChangeQuickRedirect e;
        private Fragment a;

        public abstract a a(a aVar);

        public AbstractC0515b(Fragment fragment) {
            Object[] objArr = {fragment};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1ecaaf911dfbb37f6a5c5bec32b7747", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1ecaaf911dfbb37f6a5c5bec32b7747");
            } else {
                this.a = fragment;
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d76a930285794b5aaf7275abbec6042", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d76a930285794b5aaf7275abbec6042");
                return;
            }
            Bundle arguments = this.a.getArguments();
            a aVar = new a();
            if (arguments != null) {
                aVar.a(arguments);
            }
            Bundle a = a(aVar).a();
            if (arguments != null) {
                arguments.putAll(a);
            }
            this.a = null;
        }
    }
}
