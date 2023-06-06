package com.sankuai.mads;

import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/sankuai/mads/MadsUtils;", "", "()V", "appendChargeInfoParams", "", "chargeInfo", GetAppInfoJsHandler.EXTRA_EXTRAS, "", "generateIdentifier", "bid", "index", "", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static final e b = new e();

    @JvmStatic
    @Nullable
    public static final String a(@Nullable String str, @NotNull Map<String, String> map) {
        String value;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd405605696298ba64ab489f6a409164", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd405605696298ba64ab489f6a409164");
        }
        kotlin.jvm.internal.h.b(map, GetAppInfoJsHandler.EXTRA_EXTRAS);
        if (map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && (value = entry.getValue()) != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(key);
                sb.append("=");
                sb.append(value);
            }
        }
        return sb.toString();
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "258014dc5e294f7163718ccea3f8dabb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "258014dc5e294f7163718ccea3f8dabb");
        }
        kotlin.jvm.internal.h.b(str, "bid");
        return UUID.randomUUID().toString() + CommonConstant.Symbol.UNDERLINE + str + CommonConstant.Symbol.UNDERLINE + i;
    }
}
