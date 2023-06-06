package com.sankuai.titans.result.v4.picture;

import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IPictureResultCallback;
import com.sankuai.titans.result.util.PicturePathUtil;
import com.sankuai.titans.result.v4.GetResultFragmentV4;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetPictureFragmentV4 extends GetResultFragmentV4 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mAccessToken;
    private IPictureResultCallback mCallback;

    @Override // com.sankuai.titans.result.v4.GetResultFragmentV4
    public void handleActivityResult(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9868e06946f9655034cce6a88806fc4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9868e06946f9655034cce6a88806fc4b");
        } else if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                String realPath = PicturePathUtil.getRealPath(getActivity(), data, this.mAccessToken);
                if (this.mCallback != null) {
                    this.mCallback.onResult(realPath);
                }
            } else if (this.mCallback != null) {
                this.mCallback.onResult(null);
            }
        } else if (this.mCallback != null) {
            this.mCallback.onResult(null);
        }
    }

    @Override // com.sankuai.titans.result.v4.GetResultFragmentV4
    public void handleActivityCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48dc8bab0d128e507abef2716d97f59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48dc8bab0d128e507abef2716d97f59d");
        } else if (this.mCallback != null) {
            this.mCallback.onCancel();
        }
    }

    public void getPicture(Intent intent, int i, String str, IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {intent, Integer.valueOf(i), str, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b04e8fe5cd0d9d3576b40f07658620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b04e8fe5cd0d9d3576b40f07658620");
            return;
        }
        this.mCallback = iPictureResultCallback;
        this.mAccessToken = str;
        try {
            startActivityForResult(intent, i);
        } catch (Exception e) {
            e.printStackTrace();
            if (this.mCallback != null) {
                this.mCallback.onCancel();
            }
        }
    }
}
