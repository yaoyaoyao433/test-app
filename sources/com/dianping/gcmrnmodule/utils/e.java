package com.dianping.gcmrnmodule.utils;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J \u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bJ \u0010\f\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/utils/ReadableMapHelper;", "", "()V", "optArray", "Lcom/facebook/react/bridge/ReadableArray;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "default", "optBoolean", "", "optDouble", "", "optInt", "", "optString", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static final e b = new e();

    public final int a(@Nullable ReadableMap readableMap, @NotNull String str, int i) {
        Object[] objArr = {readableMap, str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7fb6f7252d12a2f62ab1ef63d94c074", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7fb6f7252d12a2f62ab1ef63d94c074")).intValue();
        }
        h.b(str, "key");
        if (readableMap == null || !readableMap.hasKey(str) || readableMap.getType(str) == ReadableType.Null) {
            return 0;
        }
        return readableMap.getInt(str);
    }

    @NotNull
    public final String a(@Nullable ReadableMap readableMap, @NotNull String str, @NotNull String str2) {
        Object[] objArr = {readableMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd0a1194b4dd17b04a0696141b61367", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd0a1194b4dd17b04a0696141b61367");
        }
        h.b(str, "key");
        h.b(str2, "default");
        if (readableMap != null) {
            String string = readableMap.hasKey(str) ? readableMap.getString(str) : str2;
            if (string != null) {
                return string;
            }
        }
        return str2;
    }

    public final boolean a(@Nullable ReadableMap readableMap, @NotNull String str, boolean z) {
        Object[] objArr = {readableMap, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ca1f9b25980951408f3d95c76bda67b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ca1f9b25980951408f3d95c76bda67b")).booleanValue();
        }
        h.b(str, "key");
        if (readableMap == null || !readableMap.hasKey(str)) {
            return false;
        }
        return readableMap.getBoolean(str);
    }
}
