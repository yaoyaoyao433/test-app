package com.hhmedic.android.sdk.module.medicRecord;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.uikit.Handlers;
import com.hhmedic.android.sdk.uikit.utils.HHFileUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class CopyThread extends Thread implements Runnable {
    private final Context mContext;
    private List<Uri> mData;
    private Handler mHandler;
    private OnCopyResult mListener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnCopyResult {
        void onResult(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CopyThread(Context context) {
        if (context != null && context.getApplicationContext() != null) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
        if (context != null) {
            this.mHandler = Handlers.newHandler(context);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.mData != null) {
                final List<String> copyFiles = HHFileUtils.copyFiles(this.mContext, this.mData);
                if (this.mListener == null || this.mHandler == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: com.hhmedic.android.sdk.module.medicRecord.CopyThread.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            CopyThread.this.mListener.onResult(copyFiles);
                        } catch (Exception e) {
                            Logger.e("copy callback error:" + e.getMessage());
                        }
                    }
                });
            }
        } catch (Exception e) {
            Logger.e("run copy fail --->" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void startCopy(ArrayList<Uri> arrayList, OnCopyResult onCopyResult) {
        try {
            this.mData = arrayList;
            this.mListener = onCopyResult;
            start();
        } catch (Exception e) {
            Logger.e("CopyFile error:" + e.getMessage());
        }
    }
}
