package com.meituan.msi.defaultcontext;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.msi.provider.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements f {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;

    @Override // com.meituan.msi.provider.f
    public final long c() {
        return 52428800L;
    }

    public c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1df667100216884e871b6bafb2c349", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1df667100216884e871b6bafb2c349");
            return;
        }
        this.b = str;
        this.c = str2;
        if (TextUtils.equals(str, "titans")) {
            this.c = "";
        }
    }

    @Override // com.meituan.msi.provider.f
    public final SharedPreferences a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d465b2bb33d6455d5d6f44bb15e312", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d465b2bb33d6455d5d6f44bb15e312") : new com.meituan.msi.util.cipStorage.b(com.meituan.msi.a.f(), str);
    }

    @Override // com.meituan.msi.provider.f
    public final SharedPreferences a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711df2745d67cb34e323fc68c0cf7b28", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711df2745d67cb34e323fc68c0cf7b28") : a(b());
    }

    @Override // com.meituan.msi.provider.f
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656d17e277a4e7ee81cd102a7d7183f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656d17e277a4e7ee81cd102a7d7183f5");
        }
        String e = com.meituan.msi.a.a().e();
        return (TextUtils.isEmpty(e) || TextUtils.isEmpty(this.c)) ? String.format("%s_msi%s", this.b, this.c) : String.format("%s_msi%s%s", this.b, this.c, e);
    }
}
