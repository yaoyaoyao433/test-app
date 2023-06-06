package com.sankuai.waimai.reactnative.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, Object obj, WritableMap writableMap) {
        Object[] objArr = {str, obj, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6808b0dd139dfdbda107e31a83a6f219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6808b0dd139dfdbda107e31a83a6f219");
        } else if (TextUtils.isEmpty(str) || writableMap == null) {
        } else {
            if (obj instanceof Integer) {
                writableMap.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableMap.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableMap.putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        }
    }

    public static Bundle a(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "412ce989b3de327a551d0a98409dad9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "412ce989b3de327a551d0a98409dad9f");
        }
        Bundle bundle = new Bundle();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (keySetIterator.hasNextKey()) {
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (readableMap.getType(nextKey)) {
                    case Boolean:
                        bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                        break;
                    case Number:
                        try {
                            double d = readableMap.getDouble(nextKey);
                            int i = (int) d;
                            if (d != i) {
                                long j = (long) d;
                                if (d == j) {
                                    bundle.putLong(nextKey, j);
                                    break;
                                } else {
                                    bundle.putDouble(nextKey, d);
                                    break;
                                }
                            } else {
                                bundle.putInt(nextKey, i);
                                break;
                            }
                        } catch (Exception unused) {
                            bundle.putInt(nextKey, readableMap.getInt(nextKey));
                            break;
                        }
                    case String:
                        bundle.putString(nextKey, readableMap.getString(nextKey));
                        break;
                }
            }
            return bundle;
        }
        return bundle;
    }
}
