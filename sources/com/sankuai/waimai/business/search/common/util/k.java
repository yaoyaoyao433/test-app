package com.sankuai.waimai.business.search.common.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CategoryFilterData;
import com.sankuai.waimai.business.search.datatype.GuideQueryCard;
import com.sankuai.waimai.business.search.model.g;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static String a(com.sankuai.waimai.business.search.model.g gVar, boolean z) {
        Object[] objArr = {gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d350c4d7e276ad2986b73a3cd655e3ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d350c4d7e276ad2986b73a3cd655e3ee");
        }
        if (gVar == null) {
            return "";
        }
        ArrayList<g.b> arrayList = gVar.recommendLevelList;
        if (!com.sankuai.waimai.foundation.utils.d.a(arrayList) || (z && !TextUtils.isEmpty(gVar.searchRecommendReason))) {
            StringBuilder sb = new StringBuilder();
            if (!com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
                for (g.b bVar : arrayList) {
                    sb.append(bVar.c);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            if (z && !TextUtils.isEmpty(gVar.searchRecommendReason)) {
                sb.append("7,");
            }
            return sb.length() == 0 ? "0" : sb.deleteCharAt(sb.length() - 1).toString();
        }
        return "0";
    }

    public static String a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d7de45f2ecce407bfac429459c7f78e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d7de45f2ecce407bfac429459c7f78e");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (!TextUtils.isEmpty(searchShareData.S) || !TextUtils.isEmpty(searchShareData.T)) {
            arrayList.add("1");
        }
        if (searchShareData.R != 0) {
            arrayList.add("2");
        }
        if (!TextUtils.isEmpty(searchShareData.ag)) {
            arrayList.add("3");
        }
        if (!TextUtils.isEmpty(searchShareData.ah)) {
            arrayList.add("4");
        }
        if (com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c6870a79d7cc92d11ee5dffe7a3ed2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c6870a79d7cc92d11ee5dffe7a3ed2a");
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getName() + obj.hashCode();
    }

    public static Map<String, Object> a(GuideQueryCard.GuideQuery guideQuery, int i, boolean z, SearchShareData searchShareData, int i2) {
        Object[] objArr = {guideQuery, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), searchShareData, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7c595949e7aa3bd070dffc0c541d33e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7c595949e7aa3bd070dffc0c541d33e");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", searchShareData.g);
        hashMap.put("show_query", guideQuery.showQuery);
        hashMap.put("secondsearch_query", guideQuery.searchQuery);
        hashMap.put("cat_id", Integer.valueOf(searchShareData.w));
        hashMap.put("index", Integer.valueOf(i2 + 1));
        hashMap.put("tab_name", searchShareData.at);
        hashMap.put("tab_index", Integer.valueOf(searchShareData.as ? searchShareData.au : 0));
        hashMap.put("pic_url", guideQuery.queryPic);
        hashMap.put("template_type", Integer.valueOf(z ? 1 : 0));
        hashMap.put("stid", searchShareData.d);
        hashMap.put("slide_state", Integer.valueOf(i));
        hashMap.put("search_log_id", searchShareData.l);
        return hashMap;
    }

    public static Map<String, Object> a(CategoryFilterData.a aVar, SearchShareData searchShareData, int i) {
        Object[] objArr = {aVar, searchShareData, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73a488739a1a630f963e096c0880b8d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73a488739a1a630f963e096c0880b8d9");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("keyword", searchShareData.g);
        hashMap.put("cat_id", Integer.valueOf(searchShareData.w));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("template_type", Integer.valueOf(searchShareData.y));
        hashMap.put("stid", searchShareData.d);
        hashMap.put("filter_code", TextUtils.isEmpty(aVar.a) ? "0" : aVar.a);
        hashMap.put("search_log_id", searchShareData.l);
        return hashMap;
    }
}
