package com.meituan.android.common.aidata.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.cache.DBCacheHandler;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.aidata.utils.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.MD5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBAuthConfig {
    private static final String AIDATA_DB_VIEW_PREFIX = "aidata_view_";
    private static final String KEY_FORCE_DB_AUTH = "force_db_auth";
    private static final String KEY_IGNORE_DB_AUTH = "ignore_db_auth";
    private static final String TAG = "DBAuthConfig";
    private static JSONObject authJSON = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean isConfigSynchronized = false;
    private static boolean isForceDbAuth = false;
    private static boolean isIgnoreDbAuth = true;
    private static Map<String, List<String>> sDBAuthMap;
    private static Map<String, String> sDBViewMap;
    private static Map<String, List<String>> sSubTableAuthListMap;
    private static Map<String, String> sViewNameCache;

    public static void configDbAuth(JSONObject jSONObject, JSONObject jSONObject2, Map<String, List<String>> map, @NonNull Map<String, List<String>> map2) {
        Object[] objArr = {jSONObject, jSONObject2, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1104eed2067d739daaaebc75a89dfc0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1104eed2067d739daaaebc75a89dfc0a");
            return;
        }
        isConfigSynchronized = false;
        if (sDBAuthMap != null) {
            sDBAuthMap.clear();
        }
        if (sDBViewMap != null) {
            sDBViewMap.clear();
        }
        if (sViewNameCache != null) {
            sViewNameCache.clear();
        }
        if (jSONObject != null) {
            isIgnoreDbAuth = jSONObject.optBoolean(KEY_IGNORE_DB_AUTH, true);
            isForceDbAuth = jSONObject.optBoolean(KEY_FORCE_DB_AUTH, false);
            authJSON = jSONObject2;
            if (map != null && !map.isEmpty()) {
                Map<String, List<String>> hashMap = sDBAuthMap != null ? sDBAuthMap : new HashMap<>();
                sDBAuthMap = hashMap;
                hashMap.putAll(map);
            }
        }
        if (sSubTableAuthListMap != null) {
            sSubTableAuthListMap.clear();
        }
        Map<String, List<String>> hashMap2 = sSubTableAuthListMap != null ? sSubTableAuthListMap : new HashMap<>();
        sSubTableAuthListMap = hashMap2;
        hashMap2.putAll(map2);
        isConfigSynchronized = true;
    }

    @Nullable
    public static String transform(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5fac6e45a4a0df5ec26eec596f0b01a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5fac6e45a4a0df5ec26eec596f0b01a7");
        }
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && sDBViewMap != null && sDBViewMap.containsKey(str)) {
            String str3 = sDBViewMap.get(str);
            StringBuilder sb = new StringBuilder("token ");
            sb.append(str);
            sb.append(" had view cache: ");
            sb.append(str3);
            return replaceTableNameByView(str2, str3);
        }
        String generateDbView = generateDbView(str);
        if (!TextUtils.isEmpty(str)) {
            if (sDBViewMap == null) {
                sDBViewMap = new HashMap();
            }
            sDBViewMap.put(str, generateDbView);
        }
        return replaceTableNameByView(str2, generateDbView);
    }

    @Nullable
    private static String replaceTableNameByView(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cad28854cbf058355754dab230d0c8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cad28854cbf058355754dab230d0c8c");
        }
        StringBuilder sb = new StringBuilder("replaceTableNameByView sql is ");
        sb.append(str);
        sb.append(", view is ");
        sb.append(str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return "BaseTable".equalsIgnoreCase(str2) ? str : Pattern.compile("\\bBaseTable\\b", 2).matcher(str).replaceAll(str2);
    }

    @Nullable
    private static String generateDbView(@Nullable String str) {
        String str2;
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe3db91913e65dc09118394b04ba971a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe3db91913e65dc09118394b04ba971a");
        }
        List<String> authorizedCategoryList = getAuthorizedCategoryList(str);
        if (isOpenCheck(str)) {
            if (!TextUtils.isEmpty(str)) {
                if (CollectionUtils.isEmpty(authorizedCategoryList)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" query list is null");
                    CatMonitorManager.getInstance().reportDbCreateView(AIDATA_DB_VIEW_PREFIX, str, authorizedCategoryList, 0, str + " query list is null");
                }
            }
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            if (isOpenCheck(str) && !TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(authorizedCategoryList)) {
                sb2.append(TextUtils.join(CommonConstant.Symbol.UNDERLINE, authorizedCategoryList));
                StringBuilder sb3 = new StringBuilder("category IN ( ");
                int size = authorizedCategoryList.size();
                for (int i = 0; i < size; i++) {
                    if (i != 0) {
                        sb3.append(", ");
                    }
                    sb3.append(CommonConstant.Symbol.SINGLE_QUOTES);
                    sb3.append(authorizedCategoryList.get(i));
                    sb3.append(CommonConstant.Symbol.SINGLE_QUOTES);
                }
                sb3.append(" )");
                String sb4 = sb3.toString();
                new StringBuilder(" category where clause is: ").append(sb4);
                arrayList.add(sb4);
            }
            if (!AuthConfig.getInstance().isMmpDBDataAllowed(str)) {
                if (sb2.length() > 0) {
                    sb2.append(CommonConstant.Symbol.UNDERLINE);
                }
                sb2.append("filter_mmp");
                arrayList.add("nt NOT IN ( 8, 9 )");
            }
            if (arrayList.isEmpty()) {
                return "BaseTable";
            }
            String sb5 = sb2.toString();
            new StringBuilder("view name is: ").append(sb5);
            String messageDigest = MD5.getMessageDigest(sb5.getBytes());
            new StringBuilder("md5View name is: ").append(messageDigest);
            if (!TextUtils.isEmpty(str)) {
                if (sViewNameCache == null) {
                    sViewNameCache = new HashMap();
                }
                sViewNameCache.put(str, !TextUtils.isEmpty(messageDigest) ? messageDigest : sb5);
            }
            String str3 = !TextUtils.isEmpty(messageDigest) ? AIDATA_DB_VIEW_PREFIX + messageDigest : AIDATA_DB_VIEW_PREFIX + sb5;
            String str4 = "CREATE VIEW IF NOT EXISTS " + str3 + " AS SELECT * FROM BaseTable WHERE " + TextUtils.join(" AND ", arrayList);
            new StringBuilder("create view sql is: ").append(str4);
            try {
                DBCacheHandler.getInstance().execSQL(str4);
                str2 = str3;
            } catch (Exception e) {
                CatMonitorManager.getInstance().reportDbCreateView(str3, str, authorizedCategoryList, 0, str + " create view failed,reason:" + e.toString());
                str2 = "BaseTable";
            }
            CatMonitorManager.getInstance().reportDbCreateView(str2, str, authorizedCategoryList, 1, "");
            return str2;
        }
        return null;
    }

    @Nullable
    private static List<String> getAuthorizedCategoryList(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ba319073bb17ff644c3b2f99c71f8a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ba319073bb17ff644c3b2f99c71f8a7");
        }
        if (TextUtils.isEmpty(str) || sDBAuthMap == null) {
            return null;
        }
        return CollectionUtils.filterList(sDBAuthMap.get(str), new CollectionUtils.Predicate<String>() { // from class: com.meituan.android.common.aidata.config.DBAuthConfig.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.utils.CollectionUtils.Predicate
            public final boolean test(String str2) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "539e10ada2f65b93dace89977f84606d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "539e10ada2f65b93dace89977f84606d")).booleanValue() : str2 != null && str2.trim().length() > 0;
            }
        });
    }

    public static boolean isOpenCheck(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1543190aa693cfcdba4b1ca61204bce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1543190aa693cfcdba4b1ca61204bce")).booleanValue();
        }
        if (isIgnoreDbAuth) {
            return false;
        }
        if (!TextUtils.isEmpty(str) || isForceDbAuth) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" db auth is open");
            return true;
        }
        return false;
    }

    public static boolean isIgnoreDbAuth() {
        return isIgnoreDbAuth;
    }

    public static boolean isForceDbAuth() {
        return isForceDbAuth;
    }

    public static boolean isConfigSynchronized() {
        return isConfigSynchronized;
    }

    public static JSONObject getAuthJson() {
        return authJSON;
    }

    @Nullable
    public static String getAuthIdentifier(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "31992deb704042a43a96ca13913a3994", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "31992deb704042a43a96ca13913a3994");
        }
        if (TextUtils.isEmpty(str) || sViewNameCache == null) {
            return null;
        }
        return sViewNameCache.get(str);
    }

    public static boolean checkAccessSubTableAllowed(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e68eb547510b0ee004fcf9acb7abda99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e68eb547510b0ee004fcf9acb7abda99")).booleanValue();
        }
        StringBuilder sb = new StringBuilder("check access subTable sql ");
        sb.append(str2);
        sb.append(" is whether allowed or not for token ");
        sb.append(str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (sSubTableAuthListMap == null) {
            return true;
        }
        List<String> list = sSubTableAuthListMap.get(str);
        if (CollectionUtils.isEmpty(list)) {
            new StringBuilder("subTable auth list is empty for token ").append(str);
            return false;
        }
        new StringBuilder("allowed suTables: ").append(list);
        HashSet<String> hashSet = new HashSet();
        String[] split = str2.replace(CommonConstant.Symbol.BRACKET_LEFT, StringUtil.SPACE).replace(CommonConstant.Symbol.BRACKET_RIGHT, StringUtil.SPACE).replace("*", " * ").replaceAll("\\s*,\\s*", CommonConstant.Symbol.COMMA).replaceAll("\\s+", StringUtil.SPACE).split(StringUtil.SPACE);
        new StringBuilder("spilt sql parts:\n").append(TextUtils.join("\n", split));
        int length = split.length;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            String str3 = split[i2];
            if ("from".equalsIgnoreCase(split[i]) && !Constants.SQLConstants.KEY_SELECT.equalsIgnoreCase(str3)) {
                hashSet.addAll(Arrays.asList(str3.split(CommonConstant.Symbol.COMMA)));
            }
            i = i2;
        }
        new StringBuilder("suTables to access: ").append(hashSet);
        for (String str4 : hashSet) {
            if (!containsIgnoreCase(list, str4)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsIgnoreCase(@NonNull List<String> list, @Nullable String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d264c12e474eaf5d742405431339bb0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d264c12e474eaf5d742405431339bb0")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }
}
