package com.meituan.android.legwork.common.net;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseEntityTypeAdapterFactory implements TypeAdapterFactory {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type;
        Object[] objArr = {gson, typeToken};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf254929cc740b12af0ba8d348137078", RobustBitConfig.DEFAULT_VALUE)) {
            return (TypeAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf254929cc740b12af0ba8d348137078");
        }
        Type type2 = typeToken.getType();
        if (BaseEntity.class.isAssignableFrom(typeToken.getRawType())) {
            if (type2 instanceof ParameterizedType) {
                type = ((ParameterizedType) type2).getActualTypeArguments()[0];
            } else {
                type = Object.class;
            }
            return new BaseEntityTypeAdapter(gson, TypeToken.get(type));
        }
        return null;
    }
}
