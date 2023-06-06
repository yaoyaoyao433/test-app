package com.meituan.android.privacy.interfaces;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
@RequiresPermission(PermissionGuard.PERMISSION_CLIPBOARD)
/* loaded from: classes3.dex */
public interface r {
    @Nullable
    ClipData a();

    void a(@NonNull ClipData clipData);

    void a(CharSequence charSequence);

    boolean b();

    CharSequence c();
}
