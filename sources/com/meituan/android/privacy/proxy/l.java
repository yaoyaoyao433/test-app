package com.meituan.android.privacy.proxy;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l implements com.meituan.android.privacy.interfaces.r {
    public static ChangeQuickRedirect a;
    private String b;
    private com.meituan.android.privacy.interfaces.s c;

    @MainThread
    public l(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426a704530abf435a8ee6bbb4c8f6679", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426a704530abf435a8ee6bbb4c8f6679");
            return;
        }
        this.b = str;
        if (context != null) {
            this.c = new m(context);
        }
    }

    public l(Context context, String str, com.meituan.android.privacy.interfaces.b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08cc0df49865933b41904392d342fc14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08cc0df49865933b41904392d342fc14");
            return;
        }
        this.b = str;
        if (context != null) {
            this.c = new m(context, bVar);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final void a(@NonNull ClipData clipData) {
        Object[] objArr = {clipData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32e7c7afbd018feeed3653fc785c9d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32e7c7afbd018feeed3653fc785c9d3");
        } else {
            this.c.a(this.b, clipData);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.r
    @Nullable
    public final ClipData a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76ca09a81b924b4562879120fa1b731", RobustBitConfig.DEFAULT_VALUE) ? (ClipData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76ca09a81b924b4562879120fa1b731") : this.c.b(this.b);
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200ca891988e89caad4a8dceb7440f20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200ca891988e89caad4a8dceb7440f20")).booleanValue() : this.c.d(this.b);
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final CharSequence c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31db1a8eaa47f74518b0ef33bb776eae", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31db1a8eaa47f74518b0ef33bb776eae") : this.c.e(this.b);
    }

    @Override // com.meituan.android.privacy.interfaces.r
    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0859e7e92e1ce4fa474f550792d10d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0859e7e92e1ce4fa474f550792d10d3");
        } else {
            this.c.a(this.b, charSequence);
        }
    }
}
