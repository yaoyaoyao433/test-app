package com.meituan.android.privacy.interfaces.def.permission;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    protected final PermissionGuard a;
    protected final Context b;

    public e(@NonNull Context context, @NonNull PermissionGuard permissionGuard) {
        this.a = permissionGuard;
        this.b = context;
    }
}
