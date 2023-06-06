package com.meituan.android.mrn.component.list.turbo;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static final Pattern b = Pattern.compile("\\$\\$(([a-zA-Z]+\\w*)((\\.\\w+)|(\\[\\w+]))*)\\$\\$");

    public static boolean a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0aaaa2364e42b599633e6eeaf7a68a21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0aaaa2364e42b599633e6eeaf7a68a21")).booleanValue();
        }
        if (readableMap == null) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case String:
                    if (!a(readableMap.getString(nextKey))) {
                        break;
                    } else {
                        return true;
                    }
                case Map:
                    if (!a(readableMap.getMap(nextKey))) {
                        break;
                    } else {
                        return true;
                    }
                case Array:
                    if (!a(readableMap.getArray(nextKey))) {
                        break;
                    } else {
                        return true;
                    }
            }
        }
        return false;
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c679d6b6cb109fc02eea21d50e2e5657", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c679d6b6cb109fc02eea21d50e2e5657")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return b.matcher(str).find();
    }

    private static boolean a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e30ef5c0493f8b1a3e238e6146364bb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e30ef5c0493f8b1a3e238e6146364bb2")).booleanValue();
        }
        if (readableArray == null) {
            return false;
        }
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i)) {
                case String:
                    if (!a(readableArray.getString(i))) {
                        break;
                    } else {
                        return true;
                    }
                case Map:
                    if (!a(readableArray.getMap(i))) {
                        break;
                    } else {
                        return true;
                    }
                case Array:
                    if (!a(readableArray.getArray(i))) {
                        break;
                    } else {
                        return true;
                    }
            }
        }
        return false;
    }
}
