package com.sankuai.titans.live.video;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.titans.base.TitansFragment;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.live.video.rtc.IRTCJSBack;
import com.sankuai.titans.live.video.rtc.RTCFragment;
import com.sankuai.titans.live.video.rtc.entity.RTCParams;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.services.IContainerProvider;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VideoLiveActivity extends AppCompatActivity implements IContainerProvider {
    public static final int ERROR_CODE_PERMISSION = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private IRTCJSBack mCallback;
    private RTCParams mParams;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f0b6185468345c70df6f9147887a72e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f0b6185468345c70df6f9147887a72e");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_live);
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6048003ace85c8bade9da7310d325cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6048003ace85c8bade9da7310d325cf8");
            return;
        }
        String str = null;
        if (getIntent() != null && getIntent().getData() != null) {
            str = getIntent().getData().getQueryParameter("url");
        }
        if (TextUtils.isEmpty(str)) {
            str = f.a(getIntent(), LiveHelper.KEY_WEB_URL);
        }
        if (TextUtils.isEmpty(str)) {
            finish();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.layout_web, new TitansFragment(), "VideoLiveWebFragment").commitAllowingStateLoss();
        }
    }

    public void onReload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05b32098641646cd51402ddfe9bcbf4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05b32098641646cd51402ddfe9bcbf4b");
            return;
        }
        IRTC rtc = LiveHelper.getRTC(this);
        if (rtc != null) {
            rtc.exitRoom();
        }
    }

    public void enterRoom(RTCParams rTCParams, final IRTCJSBack iRTCJSBack) {
        Object[] objArr = {rTCParams, iRTCJSBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43b8bb9016e892432de7664ac0a2331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43b8bb9016e892432de7664ac0a2331");
            return;
        }
        this.mParams = rTCParams;
        this.mCallback = iRTCJSBack;
        ArrayList arrayList = new ArrayList();
        arrayList.add(PermissionGuard.PERMISSION_CAMERA);
        arrayList.add(PermissionGuard.PERMISSION_MICROPHONE);
        TitansPermissionUtil.checkSelfPermission(this, arrayList, rTCParams.sceneToken, new IRequestPermissionCallback() { // from class: com.sankuai.titans.live.video.VideoLiveActivity.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "caec129c1e90bbc3ad958dd654d4337e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "caec129c1e90bbc3ad958dd654d4337e");
                } else if (z) {
                    VideoLiveActivity.this.enterRoomInner();
                } else {
                    iRTCJSBack.onEnterRoom(-1L);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterRoomInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d64ef918c99791991a8df32f42957ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d64ef918c99791991a8df32f42957ac");
        } else {
            com.sankuai.meituan.mtlive.mtrtc.library.f.a(this.mParams.projectId, new k.a() { // from class: com.sankuai.titans.live.video.VideoLiveActivity.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public void onInitialSucceed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "04a2c85c3d86d70f13c26abda85bdb8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "04a2c85c3d86d70f13c26abda85bdb8d");
                    } else {
                        VideoLiveActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.layout_video, RTCFragment.instance(VideoLiveActivity.this.mParams).setJsCallback(VideoLiveActivity.this.mCallback), RTCFragment.class.getName()).commitAllowingStateLoss();
                    }
                }

                @Override // com.sankuai.meituan.mtlive.core.k.a
                public void onInitialFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d3b77b14efb3430e8146f3107aef6cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d3b77b14efb3430e8146f3107aef6cc");
                        return;
                    }
                    if (VideoLiveActivity.this.mCallback != null) {
                        VideoLiveActivity.this.mCallback.onError(-403, "load so failed", null);
                    }
                    VideoLiveActivity.this.finish();
                }
            });
        }
    }

    @Override // com.sankuai.titans.protocol.services.IContainerProvider
    @NonNull
    public IContainerAdapter getIContainerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92915989f45df16336f311278eb8b31c", RobustBitConfig.DEFAULT_VALUE) ? (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92915989f45df16336f311278eb8b31c") : new IContainerAdapter() { // from class: com.sankuai.titans.live.video.VideoLiveActivity.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public String h5UrlParameterName() {
                return "url";
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public String scheme() {
                return "imeituan://www.meituan.com/weblive";
            }

            @Override // com.sankuai.titans.protocol.services.IContainerAdapter
            public int getWebViewBackgroundColor(Context context) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b5b284a0b30aecc110da2180801fa861", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b5b284a0b30aecc110da2180801fa861")).intValue() : context.getResources().getColor(17170445);
            }
        };
    }
}
