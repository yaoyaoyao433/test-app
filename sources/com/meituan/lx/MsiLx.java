package com.meituan.lx;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiLx implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "lxTrackMPT", request = MsiLxParam.class, scope = "lx")
    public void lxTrackMPT(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b57942ac610ea7dcf13406ccff8ee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b57942ac610ea7dcf13406ccff8ee8");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writePageView(msiLxParam.pageInfoKey, msiLxParam.cid, msiLxParam.param);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackMPTDisappear", request = MsiLxParam.class, scope = "lx")
    public void lxTrackMPTDisappear(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900587b530ee97468652ccda62d77a38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900587b530ee97468652ccda62d77a38");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writePageDisappear(msiLxParam.pageInfoKey, msiLxParam.cid, msiLxParam.param);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackPD", request = MsiLxParam.class, scope = "lx")
    public void lxTrackPD(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11503554aba060c00e2318548edc777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11503554aba060c00e2318548edc777");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writePageDisappear(msiLxParam.pageInfoKey, msiLxParam.cid, msiLxParam.param);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackModuleClick", request = MsiLxParam.class, scope = "lx")
    public void lxTrackModuleClick(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db78b55b5b409dfa367a225681e8302a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db78b55b5b409dfa367a225681e8302a");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writeModelClick(msiLxParam.pageInfoKey, msiLxParam.val_bid, msiLxParam.val_lab, msiLxParam.val_cid);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackModuleView", request = MsiLxParam.class, scope = "lx")
    public void lxTrackModuleView(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2421e2d457c2d5f393cb86ce701dfaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2421e2d457c2d5f393cb86ce701dfaca");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writeModelView(msiLxParam.pageInfoKey, msiLxParam.val_bid, msiLxParam.val_lab, msiLxParam.val_cid);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackBizPay", request = MsiLxParam.class, scope = "lx")
    public void lxTrackBizPay(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "222dc7b46dce088955212bf2b5174643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "222dc7b46dce088955212bf2b5174643");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writeBizPay(msiLxParam.pageInfoKey, msiLxParam.val_bid, msiLxParam.val_lab, msiLxParam.val_cid);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackBizOrder", request = MsiLxParam.class, scope = "lx")
    public void lxTrackBizOrder(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88002523e56a8e83b39c1dbcd727f32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88002523e56a8e83b39c1dbcd727f32");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writeBizOrder(msiLxParam.pageInfoKey, msiLxParam.val_bid, msiLxParam.val_lab, msiLxParam.val_cid);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackSystemCheck", request = MsiLxParam.class, scope = "lx")
    public void lxTrackSystemCheck(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cda4f5d171b53fc13010c1e0ec58c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cda4f5d171b53fc13010c1e0ec58c1a");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writeSystemCheck(msiLxParam.pageInfoKey, msiLxParam.val_bid, msiLxParam.val_lab, msiLxParam.val_cid);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxTrackModuleEdit", request = MsiLxParam.class, scope = "lx")
    public void lxTrackModuleEdit(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a12ecf1251ad6f6a07f97e9dab1a524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a12ecf1251ad6f6a07f97e9dab1a524");
            return;
        }
        Channel a2 = a(msiLxParam.channelName);
        if (a2 == null) {
            msiContext.onError("channel is null");
            return;
        }
        a2.writeModelEdit(msiLxParam.pageInfoKey, msiLxParam.val_bid, msiLxParam.val_lab, msiLxParam.val_cid);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "lxSetTag", request = MsiLxParam.class, scope = "lx")
    public void lxSetTag(MsiLxParam msiLxParam, MsiContext msiContext) {
        Object[] objArr = {msiLxParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ff381fc3c13a9dd3a40a41b4974fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ff381fc3c13a9dd3a40a41b4974fee");
        } else if (Statistics.getChannel() == null) {
            msiContext.onError("channel is null");
        } else {
            Statistics.getChannel().updateTag(msiLxParam.key, msiLxParam.tag);
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "lxlog", request = LxLogParam.class, response = LxLogResult.class, scope = "lx")
    public void lxLog(LxLogParam lxLogParam, MsiContext msiContext) {
        Object[] objArr = {lxLogParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92edbc461818da642728441819d8a575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92edbc461818da642728441819d8a575");
            return;
        }
        String a2 = w.a(msiContext.getArgs());
        if (a2 == null) {
            msiContext.onError("json 转换失败");
            return;
        }
        try {
            JSONObject mmpToNative = Statistics.mmpToNative(new JSONObject(a2));
            int optInt = mmpToNative.optInt("code");
            JSONObject optJSONObject = mmpToNative.optJSONObject("data");
            LxLogResult lxLogResult = new LxLogResult();
            if (optJSONObject != null) {
                lxLogResult.data = (JsonObject) w.a(optJSONObject.toString(), JsonObject.class);
            }
            lxLogResult.code = optInt;
            msiContext.onSuccess(lxLogResult);
        } catch (JSONException unused) {
            msiContext.onError("json转换失败");
        }
    }

    private static Channel a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf375f1001b9f4f86f1b4834dbb40315", RobustBitConfig.DEFAULT_VALUE)) {
            return (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf375f1001b9f4f86f1b4834dbb40315");
        }
        if (TextUtils.isEmpty(str)) {
            return Statistics.getChannel();
        }
        return Statistics.getChannel(str);
    }
}
