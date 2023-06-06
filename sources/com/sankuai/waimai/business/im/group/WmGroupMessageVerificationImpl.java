package com.sankuai.waimai.business.im.group;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.monitor.IMessageVerificationService;
import com.sankuai.waimai.imbase.monitor.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupMessageVerificationImpl implements IMessageVerificationService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.monitor.IMessageVerificationService
    public String getSnifferBizName() {
        return null;
    }

    @Override // com.sankuai.waimai.imbase.monitor.IMessageVerificationService
    @NonNull
    public c doVerify(@NonNull IMMessage iMMessage, boolean z, int i) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2997f9a3244996c829d3a319f084c043", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2997f9a3244996c829d3a319f084c043");
        }
        if (!z && iMMessage.getMsgType() == 12) {
            return c.b();
        }
        String extension = iMMessage.getExtension();
        if (TextUtils.isEmpty(extension)) {
            return c.a("This Group message's extension is empty");
        }
        try {
            JSONObject jSONObject = new JSONObject(extension);
            if (jSONObject.optInt("conversation_type", 0) == 1) {
                return verifyBadCommentMessage(jSONObject);
            }
            if (jSONObject.optLong("comment_id", 0L) != 0) {
                return c.a("This BadComment message's extension lack conversation_type");
            }
            return verifyThirdPartMessage(jSONObject);
        } catch (JSONException e) {
            return c.a("This Group message's extension can't be cast to Json:" + e.getMessage());
        }
    }

    private c verifyThirdPartMessage(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b8bce1fe51d534196225ba02e878101", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b8bce1fe51d534196225ba02e878101");
        }
        if (TextUtils.isEmpty(jSONObject.optString("order_id", ""))) {
            return c.a("This ThirdPart message's extension lack order_id");
        }
        return c.b();
    }

    private c verifyBadCommentMessage(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "186f964ce60384e4ad661468aaf141a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "186f964ce60384e4ad661468aaf141a3");
        }
        if (jSONObject.optLong("comment_id", Long.MAX_VALUE) == Long.MAX_VALUE) {
            return c.a("This BadComment message's extension lack comment_id");
        }
        return c.b();
    }
}
