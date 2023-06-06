package com.meituan.android.mrn.containerplugin.plugincore;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.ParameterizedType;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect b;
    protected T c;

    public abstract String a();

    public final void a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af483ace1a9d66942be5d48161add0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af483ace1a9d66942be5d48161add0b");
        } else {
            this.c = (T) new Gson().fromJson(jsonElement, (Class<Object>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        }
    }
}
