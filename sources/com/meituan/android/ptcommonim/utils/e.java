package com.meituan.android.ptcommonim.utils;

import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(SessionId sessionId, IMMessage iMMessage) {
        Object[] objArr = {sessionId, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b68c51937f9bdab2b1d064467e5be7a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b68c51937f9bdab2b1d064467e5be7a6");
        }
        IMMessage b = b(sessionId, iMMessage);
        String uuid = UUID.randomUUID().toString();
        b.setMsgUuid(uuid);
        IMUIManager.a().c(b);
        return uuid;
    }

    public static IMMessage a(SessionId sessionId, IMMessage iMMessage, IMClient.g<Integer> gVar) {
        Object[] objArr = {sessionId, iMMessage, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7a2f8e4d555ba9f1d379a36dd31542d", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7a2f8e4d555ba9f1d379a36dd31542d");
        }
        IMMessage b = b(sessionId, iMMessage);
        b.setMsgUuid(UUID.randomUUID().toString());
        IMUIManager.a().a(b, true, gVar);
        return b;
    }

    private static IMMessage b(SessionId sessionId, IMMessage iMMessage) {
        Object[] objArr = {sessionId, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "670137b41c8728632b9e547ea0822815", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "670137b41c8728632b9e547ea0822815");
        }
        iMMessage.setToUid(sessionId.b());
        iMMessage.setSessionId(sessionId);
        iMMessage.setPeerAppId((short) 0);
        iMMessage.setToAppId((short) 0);
        return iMMessage;
    }

    public static String a(GeneralMessage generalMessage, String str) {
        JsonObject jsonObject;
        Object[] objArr = {generalMessage, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1eaa5a467d3a59981ac38555ede4e645", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1eaa5a467d3a59981ac38555ede4e645");
        }
        try {
            jsonObject = (JsonObject) JsonHelper.fromJsonString(new String(generalMessage.getData()), JsonObject.class);
        } catch (Throwable unused) {
            jsonObject = null;
        }
        return JsonHelper.getString(jsonObject, str);
    }

    public static String a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af492ad61bf5f80f5191cbcc475d55f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af492ad61bf5f80f5191cbcc475d55f0") : a(generalMessage, "platformData/template/platformType");
    }

    public static PTQuestionData.EvaluationInfo b(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e403e8f9c7c593d03f0d957a18a053dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTQuestionData.EvaluationInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e403e8f9c7c593d03f0d957a18a053dc");
        }
        try {
            return (PTQuestionData.EvaluationInfo) JsonHelper.fromJsonString(JsonHelper.getString((JsonObject) JsonHelper.fromJsonString(new String(generalMessage.getData()), JsonObject.class), "platformData/cardData"), PTQuestionData.EvaluationInfo.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
