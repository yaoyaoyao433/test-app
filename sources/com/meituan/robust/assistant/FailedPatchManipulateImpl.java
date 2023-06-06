package com.meituan.robust.assistant;

import android.content.Context;
import com.meituan.robust.Patch;
import com.meituan.robust.RobustCallBack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FailedPatchManipulateImpl extends PatchManipulateImpl {
    static List<Patch> failedPatches = new LinkedList();

    private FailedPatchManipulateImpl(String str, String str2, long j, String str3, String str4, int i, RobustCallBack robustCallBack) {
        super(str, str2, j, str3, str4, i, robustCallBack);
    }

    public static FailedPatchManipulateImpl getInstance(PatchManipulateImpl patchManipulateImpl) {
        return new FailedPatchManipulateImpl(patchManipulateImpl.appVersion, patchManipulateImpl.channel, patchManipulateImpl.userId, patchManipulateImpl.apkHash, patchManipulateImpl.uuid, patchManipulateImpl.useStrategy, patchManipulateImpl.realCallBack);
    }

    @Override // com.meituan.robust.assistant.PatchManipulateImpl, com.meituan.robust.PatchManipulate
    public List<Patch> fetchPatchList(Context context) {
        HashMap hashMap = new HashMap();
        for (Patch patch : failedPatches) {
            if (!patch.isAppliedSuccess()) {
                hashMap.put(patch.getMd5(), patch);
            }
        }
        return new ArrayList(hashMap.values());
    }
}
