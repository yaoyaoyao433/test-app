package com.hhmedic.android.sdk.module.medicRecord;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.luban.Luban;
import com.hhmedic.android.sdk.base.utils.luban.OnCompressListener;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHImageCompress implements OnCompressListener {
    private List<String> compressList;
    private final Context mApplicationContext;
    private int mCompressSize;
    private final Context mContext;
    private int mFileCount;
    private HHImageCompressListener mListener;
    private List<String> mOrgList;
    private final HHTips mTips = new HHTips();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface HHImageCompressListener {
        void onError(String str);

        void onSuccess(List<String> list);
    }

    @Override // com.hhmedic.android.sdk.base.utils.luban.OnCompressListener
    public void onStart() {
    }

    public HHImageCompress(Context context) {
        if (context.getApplicationContext() != null) {
            this.mApplicationContext = context.getApplicationContext();
        } else {
            this.mApplicationContext = context;
        }
        this.mContext = context;
    }

    public void compress(List<String> list, @NonNull HHImageCompressListener hHImageCompressListener) {
        this.mFileCount = list.size();
        this.mCompressSize = 0;
        this.mListener = hHImageCompressListener;
        this.compressList = new ArrayList();
        this.mTips.showProgress(this.mContext);
        this.mOrgList = list;
        compress();
    }

    private void compress() {
        Luban.with(this.mApplicationContext).load(this.mOrgList).ignoreBy(1000).setCompressListener(this).launch();
    }

    @Override // com.hhmedic.android.sdk.base.utils.luban.OnCompressListener
    public void onSuccess(File file) {
        this.mCompressSize++;
        this.compressList.add(file.getAbsolutePath());
        if (HHConfig.DEBUG) {
            Logger.e("success path:" + file.getAbsolutePath());
        }
        if (this.mCompressSize == this.mFileCount) {
            this.mTips.hideProgress(this.mContext);
            this.mListener.onSuccess(this.compressList);
        }
    }

    @Override // com.hhmedic.android.sdk.base.utils.luban.OnCompressListener
    public void onError(Throwable th) {
        this.mTips.hideProgress(this.mContext);
        if (HHConfig.DEBUG) {
            Log.e("HH", th.getMessage());
        }
        this.mListener.onError("图片异常，无法上传");
    }
}
