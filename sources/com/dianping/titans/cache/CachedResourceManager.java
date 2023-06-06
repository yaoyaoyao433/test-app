package com.dianping.titans.cache;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CachedResourceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ConcurrentHashMap<String, ICachedResourceHandler> sHandlers = new ConcurrentHashMap<>();

    public static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dafc5005299967dc937e877aac72f693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dafc5005299967dc937e877aac72f693");
            return;
        }
        for (ICachedResourceHandler iCachedResourceHandler : sHandlers.values()) {
            iCachedResourceHandler.init(context);
        }
    }

    public static void addResourceHandler(String str, ICachedResourceHandler iCachedResourceHandler) {
        Object[] objArr = {str, iCachedResourceHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eee4f25deff3c1c82501aa9cc69964cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eee4f25deff3c1c82501aa9cc69964cf");
        } else {
            sHandlers.put(str, iCachedResourceHandler);
        }
    }

    public static ICachedResourceHandler deleteResourceHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "396368b77624c386d54fddea24e154ca", RobustBitConfig.DEFAULT_VALUE) ? (ICachedResourceHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "396368b77624c386d54fddea24e154ca") : sHandlers.remove(str);
    }

    public static ICachedResourceHandler getResourceHandler(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "181bd561d41ad8df4e28bc6535871366", RobustBitConfig.DEFAULT_VALUE) ? (ICachedResourceHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "181bd561d41ad8df4e28bc6535871366") : sHandlers.get(str);
    }

    public static MimeTypeInputStream getCachedResources(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81aed2adbfe91b7bcdbc4d12bf493b66", RobustBitConfig.DEFAULT_VALUE)) {
            return (MimeTypeInputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81aed2adbfe91b7bcdbc4d12bf493b66");
        }
        for (ICachedResourceHandler iCachedResourceHandler : sHandlers.values()) {
            MimeTypeInputStream match = iCachedResourceHandler.match(context, str, str2);
            if (match != null) {
                return match;
            }
        }
        return null;
    }
}
