package com.sankuai.titans.live.video.rtc;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.mtrtc.library.MTRTCVideoView;
import com.sankuai.meituan.mtlive.mtrtc.library.b;
import com.sankuai.meituan.mtlive.mtrtc.library.c;
import com.sankuai.meituan.mtlive.mtrtc.library.d;
import com.sankuai.meituan.mtlive.mtrtc.library.f;
import com.sankuai.titans.live.video.rtc.entity.RTCParams;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RTCManager implements IRTC {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isFontCamera;
    private Context mContext;
    private IRTCJSBack mJSCallBack;
    private d mListener;
    private b mTRTCCloud;
    private Set<String> mUserSet;
    private IRTCView mView;

    public RTCManager(Context context, IRTCView iRTCView, IRTCJSBack iRTCJSBack) {
        Object[] objArr = {context, iRTCView, iRTCJSBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6cc92a45d1a752d9649ab87a8b01c33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6cc92a45d1a752d9649ab87a8b01c33");
            return;
        }
        this.isFontCamera = true;
        this.mUserSet = new HashSet();
        this.mListener = new d() { // from class: com.sankuai.titans.live.video.rtc.RTCManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onEnterRoom(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1dc54cdf24f6b0cacc91ec0a137f0f2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1dc54cdf24f6b0cacc91ec0a137f0f2f");
                } else if (RTCManager.this.mJSCallBack != null) {
                    RTCManager.this.mJSCallBack.onEnterRoom(j);
                }
            }

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onError(int i, String str, Bundle bundle) {
                Object[] objArr2 = {Integer.valueOf(i), str, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8f9956538488e9dba25fc168256f1ca9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8f9956538488e9dba25fc168256f1ca9");
                } else if (RTCManager.this.mJSCallBack != null) {
                    RTCManager.this.mJSCallBack.onError(i, str, bundle);
                }
            }

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onRemoteUserLeaveRoom(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "02ef54281cae6eb330aab2bde8bccc78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "02ef54281cae6eb330aab2bde8bccc78");
                    return;
                }
                RTCManager.this.mUserSet.remove(str);
                RTCManager.this.mTRTCCloud.a(str);
                if (RTCManager.this.mView != null) {
                    RTCManager.this.mView.onChannelRemove(str);
                }
                if (RTCManager.this.mJSCallBack != null) {
                    RTCManager.this.mJSCallBack.onRemoteUserLeaveRoom(str, i);
                }
            }

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onRemoteUserEnterRoom(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4dfc61d2bb8d19add396aced215a4470", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4dfc61d2bb8d19add396aced215a4470");
                } else if (RTCManager.this.mJSCallBack != null) {
                    RTCManager.this.mJSCallBack.onRemoteUserEnterRoom(str);
                }
            }

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onUserVideoAvailable(String str, boolean z) {
                Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0c073cd05b954532a2787b92550cee4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0c073cd05b954532a2787b92550cee4d");
                } else if (z) {
                    if (RTCManager.this.mUserSet.contains(str)) {
                        return;
                    }
                    RTCManager.this.mUserSet.add(str);
                    MTRTCVideoView mTRTCVideoView = new MTRTCVideoView(RTCManager.this.mContext);
                    mTRTCVideoView.setUserId(str);
                    RTCManager.this.mTRTCCloud.a(str, 0);
                    RTCManager.this.mTRTCCloud.a(str, mTRTCVideoView);
                    if (RTCManager.this.mView != null) {
                        RTCManager.this.mView.onChannelAdded(str, mTRTCVideoView);
                    }
                } else {
                    RTCManager.this.mTRTCCloud.a(str);
                }
            }

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onUserVoiceVolume(ArrayList<c.f> arrayList, int i) {
                Object[] objArr2 = {arrayList, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fdcc979b94ee1a52329fe91d4e4eecd6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fdcc979b94ee1a52329fe91d4e4eecd6");
                } else if (RTCManager.this.mJSCallBack != null) {
                    RTCManager.this.mJSCallBack.onUserVoiceVolume(arrayList, i);
                }
            }

            @Override // com.sankuai.meituan.mtlive.mtrtc.library.d
            public void onNetworkQuality(c.C0611c c0611c, ArrayList<c.C0611c> arrayList) {
                Object[] objArr2 = {c0611c, arrayList};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ecff605a8decc38b2ea7f3eb707de17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ecff605a8decc38b2ea7f3eb707de17");
                } else if (RTCManager.this.mJSCallBack != null) {
                    RTCManager.this.mJSCallBack.onNetworkQuality(c0611c, arrayList);
                }
            }
        };
        this.mContext = context.getApplicationContext();
        this.mView = iRTCView;
        this.mJSCallBack = iRTCJSBack;
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void enterRoom(RTCParams rTCParams) {
        Object[] objArr = {rTCParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1ce7f657a9a90f6c44394c0f5ddfc92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1ce7f657a9a90f6c44394c0f5ddfc92");
        } else if (rTCParams == null) {
            if (this.mJSCallBack != null) {
                this.mJSCallBack.onError(-404, "", null);
            }
        } else {
            c.b bVar = new c.b(rTCParams.sdkAppId, rTCParams.userId, rTCParams.userSig, rTCParams.roomId, rTCParams.privateMapKey, rTCParams.businessInfo);
            bVar.f = rTCParams.role;
            bVar.g = rTCParams.streamId;
            bVar.h = rTCParams.userDefineRecordId;
            this.mTRTCCloud = f.a(this.mContext, rTCParams.projectId);
            this.mTRTCCloud.a(this.mListener);
            this.mTRTCCloud.b(0);
            this.mTRTCCloud.c(2000);
            this.mTRTCCloud.c();
            startLocalPreview(rTCParams.userId);
            c.e eVar = new c.e();
            eVar.b = 1;
            eVar.a = 108;
            eVar.c = 15;
            eVar.d = 550;
            eVar.e = true;
            this.mTRTCCloud.a(eVar);
            c.a aVar = new c.a();
            aVar.a = 1;
            this.mTRTCCloud.a(aVar);
            this.mTRTCCloud.a(bVar, rTCParams.scene);
        }
    }

    private void startLocalPreview(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5a9cf28bda83c55da2e2acecc230218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5a9cf28bda83c55da2e2acecc230218");
            return;
        }
        this.mUserSet.add(str);
        MTRTCVideoView mTRTCVideoView = new MTRTCVideoView(this.mContext);
        mTRTCVideoView.setUserId(str);
        if (this.mView != null) {
            this.mView.onChannelAdded(str, mTRTCVideoView);
        }
        this.mTRTCCloud.a(0);
        this.mTRTCCloud.a(this.isFontCamera, mTRTCVideoView);
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void exitRoom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6b30f71edbe64b1c10ba0a90eb37efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6b30f71edbe64b1c10ba0a90eb37efc");
            return;
        }
        if (this.mTRTCCloud != null) {
            this.mTRTCCloud.d();
            this.mTRTCCloud.b();
            this.mTRTCCloud.a((d) null);
            this.mTRTCCloud.a();
            this.mTRTCCloud.f();
        }
        this.mTRTCCloud = null;
        this.mJSCallBack = null;
        this.mListener = null;
        if (this.mView != null) {
            this.mView.clear();
            this.mView = null;
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void setSubRect(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "596de385978bb8e517ebdbb10ade89dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "596de385978bb8e517ebdbb10ade89dd");
        } else if (this.mView != null) {
            this.mView.setSubRect(jSONObject);
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void switchPicInPic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e0b49b01dc14faee7835b7872044447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e0b49b01dc14faee7835b7872044447");
        } else if (this.mView != null) {
            this.mView.switchPicInPic();
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void muteLocalAudio(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53cbb3307b7bdfaea99ce6529da2f28f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53cbb3307b7bdfaea99ce6529da2f28f");
        } else if (this.mTRTCCloud != null) {
            this.mTRTCCloud.a(z);
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void muteAllRemoteAudio(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1456a1bda38010bc960e2e31a0357438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1456a1bda38010bc960e2e31a0357438");
        } else if (this.mTRTCCloud != null) {
            this.mTRTCCloud.b(z);
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void switchCamera() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aaf7dbda1d4ad46dd42282085de9d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aaf7dbda1d4ad46dd42282085de9d1d");
        } else if (this.mTRTCCloud != null) {
            this.mTRTCCloud.e();
            this.isFontCamera = !this.isFontCamera;
        }
    }

    @Override // com.sankuai.titans.live.video.rtc.IRTC
    public void setLocalViewFillMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "749545ce8f6fe78c68c7ecf1b13abfde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "749545ce8f6fe78c68c7ecf1b13abfde");
        } else if (this.mTRTCCloud != null) {
            this.mTRTCCloud.a(i);
        }
    }
}
