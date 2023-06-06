package com.meituan.android.neohybrid.storage;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a<T> implements ag<T> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.ag
    public final T deserializeFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85cacceb1f6035dde7c72d297500e30e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85cacceb1f6035dde7c72d297500e30e");
        }
        try {
            return (T) b.a().fromJson(str, new TypeToken<T>() { // from class: com.meituan.android.neohybrid.storage.a.1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cipstorage.ag
    public final String serializeAsString(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f67c1599be38d404c9255e8178d2e0a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f67c1599be38d404c9255e8178d2e0a") : b.a().toJson(t);
    }
}
