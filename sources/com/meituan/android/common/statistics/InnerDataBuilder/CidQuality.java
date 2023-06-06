package com.meituan.android.common.statistics.InnerDataBuilder;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CidQuality {
    public static final int DEFAULT_QUALITY_NONE = 0;
    public static final int DELAY_MATCH_FAIL = 512;
    public static final int DELAY_MATCH_SUCC_WITH_PAGE_INFO_KEY = 64;
    public static final int DELAY_MATCH_SUCC_WITH_PRIMARY_KEY = 256;
    public static final int DELAY_MATCH_SUCC_WITH_PRIMARY_SECONDARY_KEY = 128;
    public static final int INTERFACE_WITH_CID = 1;
    public static final int INTERFACE_WITH_PAGE_INFO_KEY = 2;
    public static final int INTERFACE_WITH_POI_ID = 4;
    public static final int MATCH_SUCC_WITH_PAGE_INFO_KEY = 8;
    public static final int MATCH_SUCC_WITH_PRIMARY_KEY = 32;
    public static final int MATCH_SUCC_WITH_PRIMARY_SECONDARY_KEY = 16;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void init(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ee8e7af57980d77d0fb87238b9c6b05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ee8e7af57980d77d0fb87238b9c6b05");
        } else if (jSONObject == null) {
        } else {
            try {
                String optString = jSONObject.optString("nt");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                if (optString.equals("1") || optString.equals("10")) {
                    int i = TextUtils.isEmpty(jSONObject.optString("page_info_key")) ? 0 : 2;
                    if (!TextUtils.isEmpty(jSONObject.optString("val_cid"))) {
                        i |= 1;
                    }
                    if (!TextUtils.isEmpty(getPoiId(jSONObject))) {
                        i |= 4;
                    }
                    jSONObject.put(Constants.EventInfoConsts.KEY_CID_QUALITY, i);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateItemSearchResult(SearchHelper.CacheItem cacheItem, JSONObject jSONObject) {
        Object[] objArr = {cacheItem, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eac2bd26f402eee9db670b27b999eab0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eac2bd26f402eee9db670b27b999eab0");
        } else if (cacheItem != null) {
            try {
                if (cacheItem.eventInfo == null || !EventName.isModuleEvent(cacheItem.eventInfo.optString("nm"))) {
                    return;
                }
                if (jSONObject != null) {
                    String optString = cacheItem.eventInfo.optString("page_info_key");
                    String optString2 = jSONObject.optString("page_info_key");
                    String optString3 = cacheItem.eventInfo.optString("val_cid");
                    String optString4 = jSONObject.optString("val_cid");
                    if (!TextUtils.isEmpty(optString) && optString.equals(optString2)) {
                        cacheItem.eventInfo.put(Constants.EventInfoConsts.KEY_CID_QUALITY, cacheItem.eventInfo.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 64);
                        return;
                    } else if (!TextUtils.isEmpty(optString3) && optString3.equals(optString4)) {
                        String poiId = getPoiId(jSONObject);
                        String poiId2 = getPoiId(cacheItem.eventInfo);
                        if (!TextUtils.isEmpty(poiId) && poiId.equals(poiId2)) {
                            cacheItem.eventInfo.put(Constants.EventInfoConsts.KEY_CID_QUALITY, cacheItem.eventInfo.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 128);
                            return;
                        } else {
                            cacheItem.eventInfo.put(Constants.EventInfoConsts.KEY_CID_QUALITY, cacheItem.eventInfo.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 256);
                            return;
                        }
                    } else {
                        cacheItem.eventInfo.put(Constants.EventInfoConsts.KEY_CID_QUALITY, cacheItem.eventInfo.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 512);
                        return;
                    }
                }
                cacheItem.eventInfo.put(Constants.EventInfoConsts.KEY_CID_QUALITY, cacheItem.eventInfo.optInt(Constants.EventInfoConsts.KEY_CID_QUALITY, 0) | 512);
            } catch (JSONException unused) {
            }
        }
    }

    public static String getPoiId(JSONObject jSONObject) {
        Object obj;
        String valueOf;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "583d0d452ec242c62143682f272e1bbd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "583d0d452ec242c62143682f272e1bbd");
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("val_lab");
                if (jSONObject2 == null || (obj = jSONObject2.get("poi_id")) == null) {
                    return null;
                }
                if (obj instanceof String) {
                    valueOf = (String) obj;
                } else {
                    valueOf = String.valueOf(obj);
                }
                return valueOf;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
