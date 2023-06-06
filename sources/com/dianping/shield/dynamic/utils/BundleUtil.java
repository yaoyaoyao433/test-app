package com.dianping.shield.dynamic.utils;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/utils/BundleUtil;", "", "()V", "json2Bundle", "", "jsonObject", "Lorg/json/JSONObject;", "bundle", "Landroid/os/Bundle;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BundleUtil {
    public static final BundleUtil INSTANCE = new BundleUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void json2Bundle(@NotNull JSONObject jSONObject, @NotNull Bundle bundle) {
        Object[] objArr = {jSONObject, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e58930094da0bfd9428e9e32bf7c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e58930094da0bfd9428e9e32bf7c69");
            return;
        }
        h.b(jSONObject, "jsonObject");
        h.b(bundle, "bundle");
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Number) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Number) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Number) opt).longValue());
                } else if (opt instanceof JSONObject) {
                    INSTANCE.json2Bundle((JSONObject) opt, bundle);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        BundleUtil bundleUtil = INSTANCE;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        h.a((Object) jSONObject2, "it.getJSONObject(i)");
                        bundleUtil.json2Bundle(jSONObject2, bundle);
                    }
                } else {
                    new StringBuilder("unsupport value type: ").append(opt.getClass().getSimpleName());
                }
            }
        }
    }
}
