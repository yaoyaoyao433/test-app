package com.sankuai.titans.live.video.bridge.rtc;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.mtlive.mtrtc.library.c;
import com.sankuai.titans.live.video.VideoLiveActivity;
import com.sankuai.titans.live.video.bridge.BaseLiveJsHandler;
import com.sankuai.titans.live.video.bridge.rtc.entity.QualityEntity;
import com.sankuai.titans.live.video.bridge.rtc.entity.VolumeEntity;
import com.sankuai.titans.live.video.rtc.IRTCJSBack;
import com.sankuai.titans.live.video.rtc.entity.RTCParams;
import com.sankuai.titans.live.video.util.GsonUtil;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class EnterRoomLiveJsHandler extends BaseLiveJsHandler<RTCParams> implements IRTCJSBack {
    public static ChangeQuickRedirect changeQuickRedirect;
    private BaseLiveJsHandler.ExecCallback mCallback;
    private String mSelfUserId;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public String getSignature() {
        return "bxP8dKMwIvjl5AMNPaWqU0vN4ZDyJIzUasLz3QKagrKp8kF+mdm+LL83q0eoFmeg4IzqrPU/12iYgpMYFIS5pw==";
    }

    @Override // com.sankuai.titans.live.video.bridge.BaseLiveJsHandler
    public void execWithData(RTCParams rTCParams, BaseLiveJsHandler.ExecCallback execCallback) {
        Object[] objArr = {rTCParams, execCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05f364990c5a8216b2aa5cb77e8b64ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05f364990c5a8216b2aa5cb77e8b64ed");
            return;
        }
        VideoLiveActivity activity = getActivity();
        if (activity == null) {
            execCallback.onFail(JsHandlerResultInfo.Error_521_Param_Miss_or_Invalid.code(), "null point exception occur");
            return;
        }
        this.mCallback = execCallback;
        this.mSelfUserId = rTCParams.userId;
        activity.enterRoom(rTCParams, this);
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCJSBack
    public void onEnterRoom(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e46b8884dd2432e835da64baad647a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e46b8884dd2432e835da64baad647a3");
        } else if (this.mCallback != null) {
            if (j > 0) {
                this.mCallback.onSuccess();
            } else if (j == -1) {
                this.mCallback.onFail(KNBJsErrorInfo.CODE_NO_PERMISSION, "application has no permission for camera or audio");
            } else {
                this.mCallback.onFail((int) j, "RTCEnterRoomFail");
            }
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCJSBack
    public void onError(int i, String str, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), str, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ca542d940e4db218279f54804807ab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ca542d940e4db218279f54804807ab5");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actionName", "RTCErrorEvent");
        hashMap.put("RTCErrCode", Integer.valueOf(i));
        hashMap.put("RTCErrMsg", str);
        hashMap.put("RTCExtraInfo", GsonUtil.parseBundle(bundle));
        jsCallback(new RespResult.Builder().setStatus("action").append((Map<String, Object>) hashMap).create());
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCJSBack
    public void onRemoteUserLeaveRoom(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26f322e72607c490e30f5fa7c427a421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26f322e72607c490e30f5fa7c427a421");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actionName", "RTCRemoteUserLeaveRoomEvent");
        hashMap.put(DeviceInfo.USER_ID, str);
        hashMap.put("reason", Integer.valueOf(i));
        jsCallback(new RespResult.Builder().setStatus("action").append((Map<String, Object>) hashMap).create());
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCJSBack
    public void onRemoteUserEnterRoom(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1225d0d41b86fd1e10838b5407ca300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1225d0d41b86fd1e10838b5407ca300");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actionName", "RTCRemoteUserEnterRoomEvent");
        hashMap.put(DeviceInfo.USER_ID, str);
        jsCallback(new RespResult.Builder().setStatus("action").append((Map<String, Object>) hashMap).create());
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCJSBack
    public void onUserVoiceVolume(ArrayList<c.f> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b05f67289b074c69696a97bf3745f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b05f67289b074c69696a97bf3745f7");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<c.f> it = arrayList.iterator();
        while (it.hasNext()) {
            c.f next = it.next();
            if (next != null) {
                VolumeEntity volumeEntity = new VolumeEntity();
                volumeEntity.userId = TextUtils.equals(this.mSelfUserId, next.a) ? "" : next.a;
                volumeEntity.volume = next.b;
                arrayList2.add(volumeEntity);
            }
        }
        jsCallback(new RespResult.Builder().setStatus("action").append("actionName", "RTCUserVoiceVolumeEvent").append("userVolumes", arrayList2).append("totalVolume", Integer.valueOf(i)).create());
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTCJSBack
    public void onNetworkQuality(c.C0611c c0611c, ArrayList<c.C0611c> arrayList) {
        Object[] objArr = {c0611c, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01a6b4c9623a89f3245fd5c29cbab297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01a6b4c9623a89f3245fd5c29cbab297");
            return;
        }
        HashMap hashMap = new HashMap();
        QualityEntity qualityEntity = new QualityEntity();
        qualityEntity.userId = c0611c.a;
        qualityEntity.quality = c0611c.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<c.C0611c> it = arrayList.iterator();
        while (it.hasNext()) {
            c.C0611c next = it.next();
            if (next != null) {
                QualityEntity qualityEntity2 = new QualityEntity();
                qualityEntity2.userId = next.a;
                qualityEntity2.quality = next.b;
                arrayList2.add(qualityEntity2);
            }
        }
        jsCallback(new RespResult.Builder().setStatus("action").append("actionName", "RTCNetworkQualityEvent").append("localQuality", qualityEntity).append("remoteQuality", arrayList2).append((Map<String, Object>) hashMap).create());
    }
}
