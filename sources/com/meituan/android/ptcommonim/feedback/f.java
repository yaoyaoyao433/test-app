package com.meituan.android.ptcommonim.feedback;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.ptcommonim.PTSessionFragmentV2;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0ff91c838f7e6561defdeea15ef569c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0ff91c838f7e6561defdeea15ef569c");
        }
        HashMap hashMap = new HashMap(com.meituan.android.ptcommonim.utils.b.a(context, false));
        if (i == 0) {
            hashMap.put("template_id", "tmp_evaluate");
        }
        return hashMap;
    }

    public static Map<String, Object> a(Context context, PTQuestionSubmitParam pTQuestionSubmitParam, GeneralMessage generalMessage, int i) {
        Object[] objArr = {context, pTQuestionSubmitParam, generalMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "414d8a4e0dde91ea3401945ff7c6d70e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "414d8a4e0dde91ea3401945ff7c6d70e");
        }
        HashMap hashMap = new HashMap();
        if (pTQuestionSubmitParam == null) {
            return hashMap;
        }
        Map<String, Object> a2 = PTSessionFragmentV2.a(context);
        hashMap.put("merchantIdStr", a("poiId", a2));
        hashMap.put("channel", a("channel", a2));
        hashMap.put("type", 1);
        hashMap.put("fromType", Integer.valueOf(pTQuestionSubmitParam.fromType));
        hashMap.put("solved", Integer.valueOf(pTQuestionSubmitParam.solved));
        hashMap.put("score", Integer.valueOf(pTQuestionSubmitParam.score));
        if (!CollectionUtils.isEmpty(pTQuestionSubmitParam.labels)) {
            hashMap.put("labels", pTQuestionSubmitParam.labels);
        }
        if (!TextUtils.isEmpty(pTQuestionSubmitParam.inputContent)) {
            hashMap.put("inputContent", pTQuestionSubmitParam.inputContent);
        }
        if (i == 0 && generalMessage != null) {
            hashMap.put("msgId", Long.valueOf(generalMessage != null ? generalMessage.getMsgId() : -1L));
            if (!TextUtils.isEmpty(pTQuestionSubmitParam.bizExtraInfo)) {
                hashMap.put("bizExtraInfo", pTQuestionSubmitParam.bizExtraInfo);
            }
        }
        return hashMap;
    }

    public static String a(String str, Map<String, Object> map) {
        Object obj;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5b13c75795dee842a6e493c6ad67c11", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5b13c75795dee842a6e493c6ad67c11") : (map == null || (obj = map.get(str)) == null) ? "" : obj.toString();
    }

    public static boolean a(PTQuestionSubmitParam pTQuestionSubmitParam) {
        Object[] objArr = {pTQuestionSubmitParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a6776578dbb334c69976476697442d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a6776578dbb334c69976476697442d7")).booleanValue() : (pTQuestionSubmitParam == null || pTQuestionSubmitParam.errorCode == 10011 || pTQuestionSubmitParam.errorCode == 10009) ? false : true;
    }
}
