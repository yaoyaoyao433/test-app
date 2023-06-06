package com.sankuai.waimai.platform.modular.network.adapter;

import android.arch.lifecycle.LiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends e.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.meituan.retrofit2.e.a
    public final e<?> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f44d1c2576f341eb30ba883d6475ede6", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f44d1c2576f341eb30ba883d6475ede6");
        }
        if (a(type) != LiveData.class) {
            return null;
        }
        Type a = a(0, (ParameterizedType) type);
        if (a(a) != com.sankuai.waimai.platform.modular.network.api.a.class) {
            throw new IllegalArgumentException("type must be a ApiResponse");
        }
        if (!(a instanceof ParameterizedType)) {
            throw new IllegalArgumentException("resource must be parameterized");
        }
        return new a(a(0, (ParameterizedType) a));
    }
}
