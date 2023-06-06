package com.meituan.android.common.weaver.interfaces;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EmptyWeaver implements IWeaver {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.interfaces.IWeaver
    public <T> void registerListener(@NonNull T t, Class<T> cls) {
    }

    @Override // com.meituan.android.common.weaver.interfaces.IWeaver
    public <T> void unregisterListener(@NonNull T t, Class<T> cls) {
    }

    @Override // com.meituan.android.common.weaver.interfaces.IWeaver
    public void weave(@NonNull WeaverEvent weaverEvent) {
    }
}
