package com.sankuai.waimai.business.search.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.m;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @NonNull
    private final f b;

    public c(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa978ce991e668f5a8c96820107cb1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa978ce991e668f5a8c96820107cb1e");
        } else {
            this.b = fVar;
        }
    }

    @Nullable
    public final Serializable a(@Nullable String str, @NonNull String str2) {
        Class<?> cls;
        Object obj;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e878e79529b5533a9ca496ab84b563", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e878e79529b5533a9ca496ab84b563");
        }
        f fVar = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "4ee09b52de27b02c97623670668b2ba8", RobustBitConfig.DEFAULT_VALUE)) {
            cls = (Class) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "4ee09b52de27b02c97623670668b2ba8");
        } else {
            cls = (str == null || str.length() == 0 || !fVar.b.containsKey(str)) ? null : fVar.b.get(str);
        }
        if (cls == null) {
            return null;
        }
        try {
            obj = new GsonBuilder().create().fromJson(str2, (Class<Object>) cls);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a("DataDeserializer", e);
            com.sankuai.waimai.platform.capacity.log.i.d(new m().a("DataDeserializer").b("deserialize").c(e.getMessage()).b());
            obj = null;
        }
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }
}
