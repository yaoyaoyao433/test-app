package com.sankuai.waimai.store.search.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @NonNull
    private final b b;

    public a(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed37fa979a10a906660a67d0fec006d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed37fa979a10a906660a67d0fec006d");
        } else {
            this.b = bVar;
        }
    }

    @Nullable
    public final Serializable a(@Nullable String str, @NonNull String str2) {
        Class<?> cls;
        Object obj;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406d1f93b23761a022fe44694a226f21", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406d1f93b23761a022fe44694a226f21");
        }
        b bVar = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c6d311698a3515dd9317e3f600a36d42", RobustBitConfig.DEFAULT_VALUE)) {
            cls = (Class) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c6d311698a3515dd9317e3f600a36d42");
        } else {
            cls = (str == null || str.length() == 0 || !bVar.b.containsKey(str)) ? null : bVar.b.get(str);
        }
        if (cls == null) {
            return null;
        }
        try {
            obj = new GsonBuilder().create().fromJson(str2, (Class<Object>) cls);
        } catch (JsonSyntaxException e) {
            com.sankuai.waimai.foundation.utils.log.a.a("DataDeserializer", e);
            obj = null;
        }
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }
}
