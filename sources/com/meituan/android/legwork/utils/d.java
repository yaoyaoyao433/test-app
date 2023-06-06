package com.meituan.android.legwork.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.DpShopUnderTakePageBean;
import com.meituan.android.legwork.bean.monitor.FuncConfigResult;
import com.meituan.android.legwork.bean.monitor.LinkNode;
import com.meituan.android.legwork.bean.monitor.Node;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static Intent a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e09762f8fb911be1c9d5699532f776b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e09762f8fb911be1c9d5699532f776b1");
        }
        Intent d = d(activity);
        if (d != null) {
            if (c(activity)) {
                HashMap hashMap = new HashMap(2);
                hashMap.put(FuncConfigResult.SPU_USE_MRNLIST, com.meituan.android.legwork.common.util.a.a().b());
                com.meituan.android.legwork.statistics.a.a(activity, "b_banma_qbwwavn2_mc", "c_banma_kmhn6qge", hashMap);
            }
            return d;
        }
        return b(activity);
    }

    private static Intent b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a229d3e36d1f95836f2949aa6e593c14", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a229d3e36d1f95836f2949aa6e593c14");
        }
        if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return null;
        }
        Intent intent = activity.getIntent();
        Uri data = intent.getData();
        String a2 = com.meituan.android.legwork.ui.base.c.a(data);
        Context a3 = com.meituan.android.legwork.a.a();
        if (TextUtils.equals(a2, a3.getString(R.string.legwork_scheme_path_preview)) || TextUtils.equals(a2, a3.getString(R.string.legwork_scheme_path_preview_two)) || TextUtils.equals(a2, a3.getString(R.string.legwork_scheme_path_preview_hot)) || TextUtils.equals(a2, "/paotui/order/submit/")) {
            HashMap hashMap = new HashMap();
            String str = "";
            for (String str2 : data.getQueryParameterNames()) {
                if (TextUtils.equals("orderInfo", str2)) {
                    com.meituan.android.legwork.statistics.a.a(intent);
                    hashMap.put("fromHome", 1);
                }
                String queryParameter = data.getQueryParameter(str2);
                hashMap.put(str2, queryParameter);
                if ("mrn_min_version".equals(str2) && !TextUtils.isEmpty(queryParameter)) {
                    str = queryParameter;
                }
            }
            String json = com.meituan.android.legwork.net.util.b.a().toJson(hashMap);
            String uuid = UUID.randomUUID().toString();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("jsonParam", json);
            hashMap2.put("identifier", uuid);
            hashMap2.put("mrn_min_version", str);
            Intent b = com.meituan.android.legwork.mrn.b.a().b(activity, "legwork-buy-preview", "legwork-buy-preview", hashMap2);
            com.meituan.android.legwork.monitor.b.a().a("buyPreview", uuid, (String) null);
            LinkNode linkNode = new LinkNode();
            linkNode.nodeType = "start";
            linkNode.nodeName = LinkNode.MRN_START_NODE_NAME;
            com.meituan.android.legwork.monitor.b.a().a("buyPreview", uuid, linkNode);
            Object[] objArr2 = {uuid};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b1759fbfdd16b6a3519ec7c0d9523bc3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b1759fbfdd16b6a3519ec7c0d9523bc3");
            } else {
                com.meituan.android.legwork.monitor.e.a().a("buyPreview", uuid, (String) null);
                Node node = new Node();
                node.nodeType = "event";
                node.nodeName = "openPage";
                com.meituan.android.legwork.monitor.e.a().a("buyPreview", uuid, node);
            }
            return b;
        }
        return null;
    }

    private static boolean c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc2f5a87d89ceee7489de825fddafb50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc2f5a87d89ceee7489de825fddafb50")).booleanValue();
        }
        if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return false;
        }
        return TextUtils.equals(activity.getIntent().getData().getQueryParameter("pt_poi_type"), "0");
    }

    private static Intent d(Activity activity) {
        boolean z = true;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca95b381eb5801c63d671a8c2ecd59f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca95b381eb5801c63d671a8c2ecd59f0");
        }
        if (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) {
            return null;
        }
        Uri data = activity.getIntent().getData();
        String a2 = com.meituan.android.legwork.ui.base.c.a(data);
        Context a3 = com.meituan.android.legwork.a.a();
        String string = a3.getString(R.string.legwork_scheme_path_preview);
        String string2 = a3.getString(R.string.legwork_scheme_path_preview_two);
        String queryParameter = data.getQueryParameter("menuOrderInfo");
        String queryParameter2 = data.getQueryParameter("pt_poi_id");
        String queryParameter3 = data.getQueryParameter("pt_poi_type");
        String queryParameter4 = data.getQueryParameter(DpShopUnderTakePageBean.UNDER_TAKE_PAGE);
        boolean z2 = !TextUtils.isEmpty(queryParameter2) && !"0".equals(queryParameter2) && TextUtils.isEmpty(queryParameter) && (TextUtils.equals(a2, string) || TextUtils.equals(a2, string2));
        boolean equals = TextUtils.equals(queryParameter3, "0");
        z = (TextUtils.equals(queryParameter3, "1") && TextUtils.equals(queryParameter4, "1")) ? false : false;
        if (z2 && (equals || z)) {
            HashMap hashMap = new HashMap();
            for (String str : data.getQueryParameterNames()) {
                hashMap.put(str, data.getQueryParameter(str));
            }
            if (equals) {
                return com.meituan.android.legwork.mrn.b.a().b(activity, "legwork-goods-list", "legwork-goods-list", hashMap);
            }
            return com.meituan.android.legwork.mrn.b.a().b(activity, "legwork-dp-goods-list", "legwork-dp-merchant-page", hashMap);
        }
        return null;
    }

    public static void a(Intent intent) {
        Uri data;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c6ff0d72ec3acbe2fe1615f7f1afaac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c6ff0d72ec3acbe2fe1615f7f1afaac");
        } else if (intent != null && (data = intent.getData()) != null && a(com.meituan.android.legwork.ui.base.c.a(data))) {
            String queryParameter = data.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR);
            String queryParameter2 = data.getQueryParameter("pt_poi_id");
            if (TextUtils.isEmpty(queryParameter) && (TextUtils.isEmpty(queryParameter2) || "0".equals(queryParameter2))) {
                return;
            }
            String queryParameter3 = data.getQueryParameter("channel");
            if (TextUtils.isEmpty(queryParameter)) {
                if (TextUtils.isDigitsOnly(queryParameter2)) {
                    HashMap hashMap = new HashMap(8);
                    String queryParameter4 = data.getQueryParameter("pt_poi_type");
                    if (TextUtils.isEmpty(queryParameter4)) {
                        queryParameter4 = "-1";
                    }
                    hashMap.put("poiType", queryParameter4);
                    hashMap.put("poiId", queryParameter2);
                    if (TextUtils.isEmpty(queryParameter3)) {
                        queryParameter3 = StringUtil.NULL;
                    }
                    hashMap.put("schemeChannel", queryParameter3);
                    hashMap.put("keyVersion", "1");
                    q.a("legwork_poi_id_get_key", 128, hashMap);
                }
            } else if (!com.meituan.android.legwork.common.util.a.a().d(queryParameter3)) {
                Set<String> queryParameterNames = data.getQueryParameterNames();
                if (queryParameterNames.contains("pt_poi_id")) {
                    Uri.Builder clearQuery = data.buildUpon().clearQuery();
                    for (String str : queryParameterNames) {
                        if ("pt_poi_id".equals(str)) {
                            clearQuery.appendQueryParameter(str, queryParameter);
                        } else {
                            clearQuery.appendQueryParameter(str, data.getQueryParameter(str));
                        }
                    }
                    intent.setData(clearQuery.build());
                    return;
                }
                intent.setData(data.buildUpon().appendQueryParameter("pt_poi_id", queryParameter).build());
            }
        }
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "987c6de5f19f4205d3e29a06ec02269f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "987c6de5f19f4205d3e29a06ec02269f")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(str, com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_preview)) || TextUtils.equals(str, com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_preview_two)) || TextUtils.equals(str, com.meituan.android.legwork.a.a().getResources().getString(R.string.legwork_scheme_path_preview_hot)) || TextUtils.equals(str, "/paotui/order/submit/");
    }
}
