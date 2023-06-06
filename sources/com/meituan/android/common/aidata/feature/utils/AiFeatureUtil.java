package com.meituan.android.common.aidata.feature.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiFeatureUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public static Map<String, List<ResultRow>> selectFeature(@Nullable Map<String, List<ResultRow>> map, @Nullable GetFeatureRequest getFeatureRequest) {
        Object[] objArr = {map, getFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4346e0dd73de3271c9b78e2b1b8e425d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4346e0dd73de3271c9b78e2b1b8e425d");
        }
        if (getFeatureRequest == null || map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (getFeatureRequest == null || TextUtils.isEmpty(getFeatureRequest.feature)) {
            return null;
        }
        try {
            hashMap.put(getFeatureRequest.feature, map.get(getFeatureRequest.feature));
            return hashMap;
        } catch (Exception unused) {
            return hashMap;
        }
    }

    @Nullable
    public static Map<String, List<ResultRow>> selectFeature(@Nullable Map<String, List<ResultRow>> map, @Nullable List<GetFeatureRequest> list) {
        Iterator<String> it;
        Object[] objArr = {map, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        HashMap hashMap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0a49572ab90ac0df370cdb7b21d8ad9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0a49572ab90ac0df370cdb7b21d8ad9");
        }
        if (list != null && map != null) {
            hashMap = new HashMap();
            List<String> convertToFeatureList = convertToFeatureList(list);
            if (!convertToFeatureList.isEmpty() && "*".equals(convertToFeatureList.get(0))) {
                it = map.keySet().iterator();
            } else {
                it = convertToFeatureList.iterator();
            }
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        hashMap.put(next, map.get(next));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return hashMap;
    }

    @NonNull
    public static List<String> convertToFeatureList(List<GetFeatureRequest> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd0bf0b4ed7ba18fd2d80b67b10374a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd0bf0b4ed7ba18fd2d80b67b10374a8");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() == 0) {
            return arrayList;
        }
        while (true) {
            if (i >= list.size()) {
                break;
            }
            String str = list.get(i).feature;
            if ("*".equals(str)) {
                arrayList.clear();
                arrayList.add("*");
                break;
            }
            arrayList.add(str);
            i++;
        }
        return arrayList;
    }

    public static String objectToString(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b5befab1b0d1981635edb8f29890bfd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b5befab1b0d1981635edb8f29890bfd");
        }
        if (obj instanceof List) {
            return listToString((List) obj);
        }
        if (!(obj instanceof Map)) {
            return obj != null ? obj.toString() : StringUtil.NULL;
        }
        try {
            return new JSONObject((String) obj).toString();
        } catch (JSONException unused) {
            return StringUtil.NULL;
        }
    }

    public static String listToString(@Nullable List<?> list) {
        boolean z = true;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cdf5f58ecf7b4bc382e1d66db0b05d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cdf5f58ecf7b4bc382e1d66db0b05d7");
        }
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (Object obj : list) {
                if (z) {
                    sb.append(obj);
                    z = false;
                } else {
                    sb.append(", ");
                    sb.append(obj);
                }
            }
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb.toString();
        }
        return StringUtil.NULL;
    }

    public static String exceptionToString(@Nullable Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a3ead622ec0b39f0c010401e69f4269", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a3ead622ec0b39f0c010401e69f4269") : exceptionToString(exc, StringUtil.NULL);
    }

    public static String exceptionToString(@Nullable Exception exc, @NonNull String str) {
        Object[] objArr = {exc, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c52ac0c5ad44f0fb5c3e1c82786fc2fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c52ac0c5ad44f0fb5c3e1c82786fc2fe") : exc == null ? str : exc.toString();
    }
}
