package com.meituan.robust.assistant;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ApplyCallback {
    void onAllPatchesApplied(boolean z, String str);

    void onApplyPatchesEnd();

    void onApplyPatchesStart();

    void onEnsurePatchFileExist(boolean z, String str);

    void onEnsurePatchFileExistWithDownload(String str);

    void onFetchPatchListFailure();

    void onFetchPatchListSuccess(String str);

    void onPatchApplied(boolean z, String str);

    void onPatchesNeedApplied(String str);

    void onPatchesRealApplied(String str);

    void onReadPatchListCacheFailure();

    void onReadPatchListCacheSuccess(String str);
}
