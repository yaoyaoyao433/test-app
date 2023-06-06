package com.sankuai.titans.result.app.picture;

import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IPictureResultCallback;
import com.sankuai.titans.result.app.GetResultFragment;
import com.sankuai.titans.result.util.PicturePathUtil;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetPictureFragment extends GetResultFragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mAccessToken;
    private IPictureResultCallback mCallback;

    @Override // com.sankuai.titans.result.app.GetResultFragment
    public void handleActivityResult(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35c1b385838244fd0a5789d3460a138f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35c1b385838244fd0a5789d3460a138f");
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

    @Override // com.sankuai.titans.result.app.GetResultFragment
    public void handleActivityCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "456e9627318f00809015f762f63b1813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "456e9627318f00809015f762f63b1813");
        } else if (this.mCallback != null) {
            this.mCallback.onCancel();
        }
    }

    public void getPicture(Intent intent, int i, String str, IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {intent, Integer.valueOf(i), str, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b76a10b30f56ef6377c0c4eb61ee13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b76a10b30f56ef6377c0c4eb61ee13c");
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
