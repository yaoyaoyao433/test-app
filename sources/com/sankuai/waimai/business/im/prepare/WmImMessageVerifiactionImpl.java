package com.sankuai.waimai.business.im.prepare;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.monitor.IMessageVerificationService;
import com.sankuai.xm.im.message.bean.IMMessage;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmImMessageVerifiactionImpl implements IMessageVerificationService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.monitor.IMessageVerificationService
    public String getSnifferBizName() {
        return null;
    }

    @Override // com.sankuai.waimai.imbase.monitor.IMessageVerificationService
    @NonNull
    public com.sankuai.waimai.imbase.monitor.c doVerify(@NonNull IMMessage iMMessage, boolean z, int i) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9527241a582770bd95601aaad56a87d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.imbase.monitor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9527241a582770bd95601aaad56a87d");
        }
        int a = com.sankuai.waimai.business.im.utils.c.a(iMMessage);
        if (a == 2) {
            return verifyPoiMessage(iMMessage);
        }
        if (a == 1) {
            return verifyRiderMessage(iMMessage);
        }
        return com.sankuai.waimai.imbase.monitor.c.a("This message[type=" + a + "] is not belong to Poi or Rider");
    }

    private com.sankuai.waimai.imbase.monitor.c verifyPoiMessage(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "159b08b1ef4b699db3df7c61e0442973", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.imbase.monitor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "159b08b1ef4b699db3df7c61e0442973");
        }
        String extension = iMMessage.getExtension();
        if (TextUtils.isEmpty(extension)) {
            return com.sankuai.waimai.imbase.monitor.c.a("This Poi message's extension is empty");
        }
        try {
            JSONObject jSONObject = new JSONObject(extension);
            if (TextUtils.isEmpty(jSONObject.optString("poi_id", ""))) {
                return com.sankuai.waimai.imbase.monitor.c.a("This Poi message's extension lack poi_id");
            }
            if (jSONObject.optInt("poiType", -1) == -1) {
                return com.sankuai.waimai.imbase.monitor.c.a("This Poi message's extension lack poiType");
            }
            return com.sankuai.waimai.imbase.monitor.c.b();
        } catch (JSONException e) {
            return com.sankuai.waimai.imbase.monitor.c.a("This Poi Message's extension can't be cast to Json:" + e.getMessage());
        }
    }

    private com.sankuai.waimai.imbase.monitor.c verifyRiderMessage(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc7639d3c96120581a1a1dee9251b88", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.imbase.monitor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc7639d3c96120581a1a1dee9251b88");
        }
        String extension = iMMessage.getExtension();
        if (TextUtils.isEmpty(extension)) {
            return com.sankuai.waimai.imbase.monitor.c.a("This Rider message's extension is empty");
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(extension).optString("chatfid", ""))) {
                return com.sankuai.waimai.imbase.monitor.c.a("This Rider Message's extension lack chatfid");
            }
            return com.sankuai.waimai.imbase.monitor.c.b();
        } catch (JSONException e) {
            return com.sankuai.waimai.imbase.monitor.c.a("This Rider Message's extension can't be cast to Json:" + e.getMessage());
        }
    }
}
