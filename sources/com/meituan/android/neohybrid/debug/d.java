package com.meituan.android.neohybrid.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d implements com.meituan.android.neohybrid.debug.a {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.android.neohybrid.debug.a
    public int a(String str, int i) {
        return 0;
    }

    @Override // com.meituan.android.neohybrid.debug.a
    public <T> com.meituan.android.neohybrid.debug.a a(String str, T t) {
        return this;
    }

    @Override // com.meituan.android.neohybrid.debug.a
    public String a(String str, String str2) {
        return str2;
    }

    @Override // com.meituan.android.neohybrid.debug.a
    public boolean a(String str) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.debug.a
    public String b(String str) {
        return null;
    }

    @Override // com.meituan.android.neohybrid.debug.a
    public <T> com.meituan.android.neohybrid.base.model.a<T> a(String str, T t, boolean z) {
        Object[] objArr = {str, t, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3303d8cdc3e609964a5aba1c7e8c48b2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3303d8cdc3e609964a5aba1c7e8c48b2") : a(null, t, null, false);
    }

    @Override // com.meituan.android.neohybrid.debug.a
    public <T> com.meituan.android.neohybrid.base.model.a<T> a(String str, com.meituan.android.neohybrid.base.model.c<T> cVar, boolean z) {
        Object[] objArr = {str, cVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93c1011eda53df9b11f9d408595d52f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93c1011eda53df9b11f9d408595d52f") : a(null, null, cVar, false);
    }

    public <T> com.meituan.android.neohybrid.base.model.a<T> a(String str, T t, com.meituan.android.neohybrid.base.model.c<T> cVar, boolean z) {
        Object[] objArr = {str, t, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d507389705e798189d3eba0b8fb41d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.base.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d507389705e798189d3eba0b8fb41d3");
        }
        com.meituan.android.neohybrid.base.model.b bVar = new com.meituan.android.neohybrid.base.model.b(t);
        bVar.a((com.meituan.android.neohybrid.base.model.c) cVar);
        return bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final d a = new d();
    }
}
