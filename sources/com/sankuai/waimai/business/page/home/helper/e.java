package com.sankuai.waimai.business.page.home.helper;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(@NonNull List<NavigateItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15bf421db4144349edc77960d6024c15", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15bf421db4144349edc77960d6024c15");
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            NavigateItem navigateItem = list.get(i);
            if (navigateItem != null) {
                jSONArray.put(a(navigateItem));
            }
        }
        return jSONArray.toString();
    }

    private static JSONObject a(@NonNull NavigateItem navigateItem) {
        Object[] objArr = {navigateItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cff739d870f92edd7bd81ad431debf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cff739d870f92edd7bd81ad431debf6");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", navigateItem.getCode());
            jSONObject.put("name", navigateItem.getName());
            jSONObject.put("url", navigateItem.getUrl());
            jSONObject.put("gray_url", navigateItem.getUrlGray());
            jSONObject.put("gray_switch", navigateItem.getSwitchGray());
            jSONObject.put("skip_protocol", navigateItem.getSkipProtocol());
            jSONObject.put("method", navigateItem.getMethod());
            jSONObject.put("bubble", a(navigateItem.mBubble));
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject;
    }

    private static JSONObject a(NavigateItem.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ada836d423792a8681a7df5f294b3176", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ada836d423792a8681a7df5f294b3176");
        }
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bubble_id", aVar.b);
            jSONObject.put("bg_color", aVar.c);
            jSONObject.put("strategy_id", aVar.d);
            jSONObject.put("content", aVar.e);
            jSONObject.put("color", aVar.f);
            jSONObject.put("etime", aVar.g);
            jSONObject.put("show_strategy", aVar.h);
            jSONObject.put("type", aVar.j);
            jSONObject.put("priority", aVar.k);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject;
    }
}
