package com.meituan.mmp.lib;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aa {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public Integer d;
    public Map<String, Object> e;
    public String f;
    public boolean g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        Integer d;
        boolean e;
        String f;

        public final aa a(com.meituan.mmp.lib.config.a aVar) throws com.meituan.mmp.lib.api.d {
            boolean z = true;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850d334862dc45c15d1ed1687a53d75c", RobustBitConfig.DEFAULT_VALUE)) {
                return (aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850d334862dc45c15d1ed1687a53d75c");
            }
            aa aaVar = new aa();
            aaVar.d = this.d;
            aaVar.b = this.b;
            if (TextUtils.isEmpty(this.b)) {
                throw new com.meituan.mmp.lib.api.d("url is empty");
            }
            if (this.c == null) {
                throw new com.meituan.mmp.lib.api.d("empty openType");
            }
            if (TextUtils.isEmpty(this.f)) {
                String a2 = aVar.a(this.b);
                if (a2 != null) {
                    aaVar.f = this.b;
                    aaVar.b = a2;
                }
            } else {
                aaVar.f = this.f;
            }
            String a3 = aaVar.a();
            Object[] objArr2 = {a3, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e2cd98ab4dbae6ea22ffd44f5d44450", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e2cd98ab4dbae6ea22ffd44f5d44450")).booleanValue();
            } else if (aVar.o(a3)) {
                if (TextUtils.equals("navigateTo", this.c) || TextUtils.equals("redirectTo", this.c)) {
                    if (this.e) {
                        this.c = "reLaunch";
                    } else {
                        throw new com.meituan.mmp.lib.api.d("can not " + this.c + " tab page");
                    }
                }
            } else if (TextUtils.equals("switchTab", this.c)) {
                throw new com.meituan.mmp.lib.api.d("can not switchTab to single page");
            } else {
                z = false;
            }
            aaVar.g = z;
            aaVar.c = this.c;
            if (aVar.c(this.b)) {
                return aaVar;
            }
            throw new com.meituan.mmp.lib.api.d("url is not a valid page");
        }
    }

    public aa() {
    }

    public aa(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1092df3110a7c516bf252dad78fb7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1092df3110a7c516bf252dad78fb7a");
            return;
        }
        this.b = str;
        this.f = str2;
        this.c = str3;
    }

    public aa(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d07b0079ed0cafdac1af7d2b80fddf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d07b0079ed0cafdac1af7d2b80fddf");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    public aa(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec90d687994192f6b4c1937de2d83fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec90d687994192f6b4c1937de2d83fe");
            return;
        }
        this.b = aaVar.b;
        this.f = aaVar.f;
        this.c = aaVar.c;
        this.d = aaVar.d;
        this.e = aaVar.e;
        this.g = aaVar.g;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe01caeeb287a8437ca3f89687392079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe01caeeb287a8437ca3f89687392079");
            return;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.put(str, obj);
    }

    public final String a() {
        return this.f != null ? this.f : this.b;
    }
}
