package com.sankuai.titans.live.video.rtc;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.rtc.entity.RTCParams;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RTCFragment extends Fragment {
    public static final String KEY_PARCELABLE = "KEY_PARCELABLE";
    public static ChangeQuickRedirect changeQuickRedirect;
    private IRTCJSBack mCallback;
    private Context mContext;
    private RTCLayout mRTCLayout;
    private IRTC mRTCManager;

    public static RTCFragment instance(RTCParams rTCParams) {
        Object[] objArr = {rTCParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f064f25e3c593831a1e9dc47dcb6d51", RobustBitConfig.DEFAULT_VALUE)) {
            return (RTCFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f064f25e3c593831a1e9dc47dcb6d51");
        }
        RTCFragment rTCFragment = new RTCFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_PARCELABLE, rTCParams);
        rTCFragment.setArguments(bundle);
        return rTCFragment;
    }

    public RTCFragment setJsCallback(IRTCJSBack iRTCJSBack) {
        this.mCallback = iRTCJSBack;
        return this;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4213c04544ae3a5f3aecc7da73887d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4213c04544ae3a5f3aecc7da73887d0f");
            return;
        }
        super.onAttach(context);
        this.mContext = context;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92d734ec3066c1bdfd04a818a6a8eb5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92d734ec3066c1bdfd04a818a6a8eb5d");
        }
        this.mRTCLayout = (RTCLayout) layoutInflater.inflate(R.layout.fragment_rtc, viewGroup, false);
        return this.mRTCLayout;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dc92a8cf26e0e9e2c6c7c0866d27272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dc92a8cf26e0e9e2c6c7c0866d27272");
            return;
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        final RTCParams rTCParams = (RTCParams) arguments.getParcelable(KEY_PARCELABLE);
        if (rTCParams == null) {
            if (this.mCallback != null) {
                this.mCallback.onError(-404, "params is null", null);
                return;
            }
            return;
        }
        this.mRTCLayout.setMasterId(rTCParams.userId);
        this.mRTCManager = new RTCManager(this.mContext, this.mRTCLayout, this.mCallback);
        this.mRTCLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.titans.live.video.rtc.RTCFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "39b35abb031450417ad2d54fb8913b2b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "39b35abb031450417ad2d54fb8913b2b")).booleanValue();
                }
                RTCFragment.this.mRTCLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                RTCFragment.this.mRTCManager.enterRoom(rTCParams);
                return false;
            }
        });
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d691103080cdf6c62977a6455d19750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d691103080cdf6c62977a6455d19750");
            return;
        }
        super.onDestroy();
        if (this.mRTCManager != null) {
            this.mRTCManager.exitRoom();
            this.mRTCManager = null;
        }
        if (this.mRTCLayout != null) {
            this.mRTCLayout.clear();
        }
    }

    public IRTC getIRTC() {
        return this.mRTCManager;
    }
}
