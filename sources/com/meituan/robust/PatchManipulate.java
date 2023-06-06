package com.meituan.robust;

import android.content.Context;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class PatchManipulate {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean ensurePatchExist(Patch patch);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<Patch> fetchPatchList(Context context);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean verifyPatch(Context context, Patch patch);
}
