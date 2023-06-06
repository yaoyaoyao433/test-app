package com.meituan.android.privacy.interfaces.def.netfilter;

import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c.a {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public long d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public long i;

    @Override // com.meituan.android.privacy.interfaces.c.a
    public final int a() {
        return this.b;
    }

    @Override // com.meituan.android.privacy.interfaces.c.a
    public final long b() {
        return this.c;
    }

    @Override // com.meituan.android.privacy.interfaces.c.a
    public final long c() {
        return this.d;
    }

    @Override // com.meituan.android.privacy.interfaces.c.a
    public final String d() {
        return this.e;
    }

    @Override // com.meituan.android.privacy.interfaces.c.a
    @Nullable
    public final String e() {
        return this.f;
    }

    @Override // com.meituan.android.privacy.interfaces.c.a
    @Nullable
    public final String f() {
        return this.h;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb38431eae78a43d6ecd6d7bdd6ae911", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb38431eae78a43d6ecd6d7bdd6ae911");
        }
        return "NetFilterResult{mStatusCode=" + this.b + ", mSupportedPrivacyTypesForURL=" + this.c + ", mIllegalPrivacyTypes=" + this.d + ", mOriginURL='" + this.e + "', mFilteredURL='" + this.f + "', mIsExactlyMatched=" + this.g + ", mRules='" + this.h + "', mDuration=" + this.i + '}';
    }
}
