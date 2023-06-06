package com.meituan.android.privacy.interfaces;

import android.content.ClipData;
import android.content.ClipDescription;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
@RequiresPermission(PermissionGuard.PERMISSION_CLIPBOARD)
/* loaded from: classes3.dex */
public interface s {
    void a(String str);

    void a(String str, @NonNull ClipData clipData);

    void a(String str, CharSequence charSequence);

    @Nullable
    ClipData b(String str);

    @Nullable
    ClipDescription c(String str);

    boolean d(String str);

    CharSequence e(String str);
}
