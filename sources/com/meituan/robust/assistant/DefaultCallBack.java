package com.meituan.robust.assistant;

import android.text.TextUtils;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.Patch;
import com.meituan.robust.RobustCallBack;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DefaultCallBack implements RobustCallBack {
    private ApplyCallback applyCallback;

    @Override // com.meituan.robust.RobustCallBack
    public void logNotify(String str, String str2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultCallBack() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultCallBack(ApplyCallback applyCallback) {
        this.applyCallback = applyCallback;
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchListFetched(boolean z, boolean z2, List<Patch> list) {
        if (this.applyCallback != null) {
            try {
                if (z2) {
                    if (z) {
                        this.applyCallback.onFetchPatchListSuccess("0");
                    } else {
                        this.applyCallback.onFetchPatchListFailure();
                    }
                } else if (z) {
                    this.applyCallback.onReadPatchListCacheSuccess("0");
                } else {
                    this.applyCallback.onReadPatchListCacheFailure();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchFetched(boolean z, boolean z2, Patch patch) {
        if (this.applyCallback != null) {
            String str = "";
            if (patch != null) {
                try {
                    str = patch.getName();
                } catch (Throwable unused) {
                    return;
                }
            }
            try {
                if (!z2) {
                    this.applyCallback.onEnsurePatchFileExist(z, str);
                } else if (z) {
                    this.applyCallback.onEnsurePatchFileExistWithDownload(str);
                } else {
                    this.applyCallback.onEnsurePatchFileExist(z, str);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void onPatchApplied(boolean z, Patch patch) {
        if (this.applyCallback != null) {
            try {
                this.applyCallback.onPatchApplied(z, patch != null ? patch.getName() : "");
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.meituan.robust.RobustCallBack
    public void exceptionNotify(Throwable th, String str) {
        if (TextUtils.isEmpty(str)) {
            ThrowableReporter.report(th);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.SQLConstants.KEY_WHERE, str);
        ThrowableReporter.report(th, hashMap);
    }
}
