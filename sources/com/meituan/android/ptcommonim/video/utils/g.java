package com.meituan.android.ptcommonim.video.utils;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(PTIMCommonBean pTIMCommonBean, JSONObject jSONObject, String str, String str2) {
        Object[] objArr = {pTIMCommonBean, jSONObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab6222ed6cae20bf1cfb176bc2fd8ae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab6222ed6cae20bf1cfb176bc2fd8ae4");
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, Object> a2 = a(pTIMCommonBean, jSONObject);
        a2.put("media_type", str);
        a2.put("show_status", str2);
        hashMap.put("custom", a2);
        hashMap.putAll(a2);
        Statistics.getChannel("group").writePageView("pt_common_im_page", "c_group_plkiwka4", hashMap);
    }

    public static Map<String, Object> a(PTIMCommonBean pTIMCommonBean, IMMessage iMMessage) {
        Object[] objArr = {pTIMCommonBean, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94d253968aa70f5e37895305a5b4ae22", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94d253968aa70f5e37895305a5b4ae22");
        }
        HashMap hashMap = new HashMap();
        if (pTIMCommonBean != null) {
            hashMap.putAll(pTIMCommonBean.getMgeMap());
        }
        if (iMMessage != null) {
            hashMap.put("chat_type", MessageUtils.categoryToPushChatType(iMMessage.getCategory(), iMMessage.getPubCategory()));
            hashMap.put("message_body_id", Long.valueOf(iMMessage.getChatId()));
            hashMap.put("peer_uid", Long.valueOf(iMMessage.getPeerUid()));
            hashMap.put("channel_id", Short.valueOf(iMMessage.getChannel()));
            hashMap.put(Message.SID, !TextUtils.isEmpty(iMMessage.getSID()) ? iMMessage.getSID() : "-999");
        }
        return hashMap;
    }

    public static Map<String, Object> a(PTIMCommonBean pTIMCommonBean, JSONObject jSONObject) {
        Object[] objArr = {pTIMCommonBean, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a5ed9bbc7837281f15157747caa33c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a5ed9bbc7837281f15157747caa33c0");
        }
        HashMap hashMap = new HashMap();
        if (pTIMCommonBean != null) {
            hashMap.putAll(pTIMCommonBean.getMgeMap());
        }
        if (jSONObject != null) {
            JsonObject jsonObject = (JsonObject) e.a(jSONObject.toString(), JsonObject.class);
            hashMap.put("channel_id", a(JsonHelper.getString(jsonObject, "channel")));
            hashMap.put("chat_type", a(JsonHelper.getString(jsonObject, "chatType")));
            hashMap.put("message_body_id", a(JsonHelper.getString(jsonObject, "chatID")));
            hashMap.put("peer_uid", a(JsonHelper.getString(jsonObject, Message.PEER_UID)));
            hashMap.put(Message.SID, a(JsonHelper.getString(jsonObject, Message.SID)));
        }
        return hashMap;
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4228103b6072e8e30f7e70a4a3fb76b1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4228103b6072e8e30f7e70a4a3fb76b1") : TextUtils.isEmpty(str) ? "-999" : str;
    }
}
