package com.sankuai.titans.live.video.bridge;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.LiveHelper;
import com.sankuai.titans.live.video.VideoLiveActivity;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.jsbridge.StrictJsBridge;
import java.lang.reflect.ParameterizedType;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseLiveJsHandler<T> extends StrictJsBridge<T, Void> {
    protected static final String ERROR_NULL_POINT_MSG = "null point exception occur";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ExecCallback {
        void onFail(int i, String str);

        void onSuccess();
    }

    public abstract void execWithData(T t, ExecCallback execCallback);

    public IRTC getRTCManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e4ddb2eec7a21f817368831ddef3ffb", RobustBitConfig.DEFAULT_VALUE) ? (IRTC) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e4ddb2eec7a21f817368831ddef3ffb") : LiveHelper.getRTC(jsHost().getActivity());
    }

    public VideoLiveActivity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e462e711d915cba0787a87aa1a7355", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoLiveActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e462e711d915cba0787a87aa1a7355");
        }
        Activity activity = jsHost().getActivity();
        if (activity instanceof VideoLiveActivity) {
            return (VideoLiveActivity) activity;
        }
        return null;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43dd3254ecff39faf35a7e0d6f049c25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43dd3254ecff39faf35a7e0d6f049c25");
            return;
        }
        try {
            Class cls = (Class) ((ParameterizedType) Objects.requireNonNull(getClass().getGenericSuperclass())).getActualTypeArguments()[0];
            if (cls == null) {
                jsCallback((RespResult<T>) new RespResult.Builder().setStatus("fail").setCode(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code()).setMsg("BaseLiveJsHandler getActualTypeArguments error").create());
            } else if (cls == Void.class) {
                exec(null);
            } else if (t == null) {
                jsCallback((RespResult<T>) new RespResult.Builder().setStatus("fail").setCode(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code()).setMsg("BaseLiveJsHandler getActualTypeArguments error").create());
            } else {
                exec(t);
            }
        } catch (Exception unused) {
            jsCallback((RespResult<T>) new RespResult.Builder().setStatus("fail").setCode(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code()).setMsg("BaseLiveJsHandler getActualTypeArguments error").create());
        }
    }

    private void exec(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cc17fc2cefa2d9574996eb6bd0a9eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cc17fc2cefa2d9574996eb6bd0a9eb9");
        } else {
            execWithData(t, new ExecCallback() { // from class: com.sankuai.titans.live.video.bridge.BaseLiveJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler.ExecCallback
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19dceebd3d9b8762206ef998c0ce1f26", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19dceebd3d9b8762206ef998c0ce1f26");
                    } else {
                        BaseLiveJsHandler.this.jsCallback((RespResult) new RespResult.Builder().setStatus("success").create());
                    }
                }

                @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler.ExecCallback
                public void onFail(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7828941f88227573542c675689cf393", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7828941f88227573542c675689cf393");
                    } else {
                        BaseLiveJsHandler.this.jsCallback((RespResult) new RespResult.Builder().setStatus("fail").setCode(i).setMsg(str).create());
                    }
                }
            });
        }
    }
}
