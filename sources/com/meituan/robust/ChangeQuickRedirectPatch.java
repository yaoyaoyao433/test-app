package com.meituan.robust;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ChangeQuickRedirectPatch implements ChangeQuickRedirect {
    List<PatchesInfo> patchesInfos;

    @Override // com.meituan.robust.ChangeQuickRedirect
    public final Object accessDispatch(String str, Object[] objArr) {
        return null;
    }

    @Override // com.meituan.robust.ChangeQuickRedirect
    public final boolean isSupport(String str, Object[] objArr) {
        return false;
    }

    public ChangeQuickRedirectPatch(Patch patch) {
    }
}
