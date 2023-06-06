package com.meituan.android.mrn.component.list.common;

import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(ReadableMap readableMap, String str, int i) {
        Object[] objArr = {readableMap, str, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31929acaa3c7dad9f661d7e56075122d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31929acaa3c7dad9f661d7e56075122d")).intValue();
        }
        try {
            return readableMap.getInt(str);
        } catch (NoSuchKeyException | NullPointerException unused) {
            return -1;
        }
    }

    public static String a(ReadableMap readableMap, String str, String str2) {
        Object[] objArr = {readableMap, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cd77d349009930b149d31b5210eb9f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cd77d349009930b149d31b5210eb9f9");
        }
        try {
            return readableMap.getString(str);
        } catch (NoSuchKeyException e) {
            new StringBuilder("[DataUtil@getStringFromMap] e: ").append(e);
            return str2;
        }
    }

    public static ReadableMap a(ReadableMap readableMap, String str, ReadableMap readableMap2) {
        Object[] objArr = {readableMap, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "213890915e2a727e2743b8dad73814e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "213890915e2a727e2743b8dad73814e7");
        }
        try {
            return readableMap.getMap(str);
        } catch (Exception e) {
            new StringBuilder("[DataUtil@getMapFromMap] e: ").append(e);
            return null;
        }
    }

    public static ReadableArray a(ReadableMap readableMap, String str, ReadableArray readableArray) {
        Object[] objArr = {readableMap, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87178059841c98bd6b835eabd5ec4b7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87178059841c98bd6b835eabd5ec4b7c");
        }
        try {
            return readableMap.getArray(str);
        } catch (NoSuchKeyException e) {
            new StringBuilder("[DataUtil@getArrayFromMap] e: ").append(e);
            return readableArray;
        }
    }
}
