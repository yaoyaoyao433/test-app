package com.meituan.android.common.horn;

import android.support.annotation.GuardedBy;
import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.horn.HornRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornInfoHub {
    public static ChangeQuickRedirect changeQuickRedirect;
    @GuardedBy("hornMap")
    private static final Map<String, HornEntity> hornMap = new ConcurrentHashMap();
    private static final Map<String, Boolean> invalidateCacheMap = new ConcurrentHashMap();

    public static void newInstance(String str, HornCallback hornCallback, Map<String, Object> map) {
        Object[] objArr = {str, hornCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8eb1df94f076932d78ce446536ba872", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8eb1df94f076932d78ce446536ba872");
            return;
        }
        HornEntity hornEntity = new HornEntity(str, hornCallback, map);
        synchronized (hornMap) {
            if (InnerHorn.isPreloadCallback(hornCallback) && hornMap.containsKey(str)) {
                return;
            }
            hornMap.put(str, hornEntity);
        }
    }

    public static void invalidateCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81ef17c3acd497b17e6668f99b490634", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81ef17c3acd497b17e6668f99b490634");
            return;
        }
        synchronized (invalidateCacheMap) {
            invalidateCacheMap.put(str, Boolean.TRUE);
        }
    }

    public static void validateCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0180c8dbfcacebe528039513bda30290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0180c8dbfcacebe528039513bda30290");
            return;
        }
        synchronized (invalidateCacheMap) {
            if (invalidateCacheMap.containsKey(str)) {
                invalidateCacheMap.put(str, Boolean.FALSE);
            }
        }
    }

    public static boolean isCacheInvalidate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0bb875bec5bdc7a3157929e57dfdf4a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0bb875bec5bdc7a3157929e57dfdf4a")).booleanValue();
        }
        synchronized (invalidateCacheMap) {
            if (invalidateCacheMap.containsKey(str)) {
                return invalidateCacheMap.get(str).booleanValue();
            }
            return false;
        }
    }

    public static HornRequest obtainSingleRequest(String str, Map<String, Object> map, String str2) {
        HornEntity hornEntity;
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a24eca14da67a7a047a9eb38f1fcca79", 6917529027641081856L)) {
            return (HornRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a24eca14da67a7a047a9eb38f1fcca79");
        }
        try {
            synchronized (hornMap) {
                hornEntity = hornMap.get(str);
            }
            HornRequest.Builder builder = new HornRequest.Builder(InnerHorn.context);
            HashMap hashMap = new HashMap(hornEntity.mQuery);
            hashMap.put("horn_source", str2);
            builder.hornQueryMap(hashMap).pushLog(map).type(hornEntity.mType).callback(hornEntity.mCallback);
            if (isCacheInvalidate(str)) {
                builder.invalidateCache();
            }
            return builder.build();
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public static HornRequest obtainMultiPollRequest(Set<String> set, String str) {
        HornEntity hornEntity;
        Object[] objArr = {set, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1032ae3626d9dce74190eb1c6cff76f", 6917529027641081856L)) {
            return (HornRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1032ae3626d9dce74190eb1c6cff76f");
        }
        try {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            StringBuilder sb = new StringBuilder(64);
            for (String str2 : set) {
                synchronized (hornMap) {
                    hornEntity = hornMap.get(str2);
                }
                Set<Map.Entry<String, Object>> entrySet = hornEntity.mQuery.entrySet();
                sb.delete(0, sb.length() <= 0 ? 0 : sb.length());
                for (Map.Entry<String, Object> entry : entrySet) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append("&");
                }
                Boolean bool = Boolean.FALSE;
                if (!TextUtils.isEmpty(str2) && (bool = InnerHorn.TYPE_MAP.get(str2)) == null) {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    sb.append("os=");
                    sb.append("android_test");
                } else {
                    sb.append("os=");
                    sb.append("android");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(SearchIntents.EXTRA_QUERY, sb.toString());
                HornCacheCenter obtainCacheCenter = InnerHorn.obtainCacheCenter();
                jSONObject.put(Constants.HTTP_HEADER_KEY_E_TAG, obtainCacheCenter.obtainData(obtainCacheCenter.getETagFile(str2)));
                if (isCacheInvalidate(str2)) {
                    jSONObject.put("isCacheInValidate", true);
                }
                hashMap.put(str2, jSONObject.toString());
                hashMap2.put(str2, hornEntity.mCallback);
            }
            HornRequest.MixBuilder mixBuilder = new HornRequest.MixBuilder(InnerHorn.context);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("horn_source", str);
            return mixBuilder.callback(hashMap2).customerParamsMap(hashMap).hornQueryMap(hashMap3).build();
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return null;
        }
    }
}
