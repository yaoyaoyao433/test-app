package com.meituan.android.mrn.config;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b implements i {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.i
    public a.InterfaceC0637a a(Context context) {
        return null;
    }

    @Override // com.meituan.android.mrn.config.i
    public String a(String str) {
        return null;
    }

    @Override // com.meituan.android.mrn.config.i
    public com.dianping.dataservice.mapi.g b(Context context) {
        return null;
    }

    @Override // com.meituan.android.mrn.config.i
    public com.meituan.android.mrn.config.city.a c(Context context) {
        return null;
    }

    @Override // com.meituan.android.mrn.config.i
    @NonNull
    public final h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7ce909bd800d6380624e6625341ba5", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7ce909bd800d6380624e6625341ba5") : new u(R.layout.mrn_common_loading_layout);
    }
}
