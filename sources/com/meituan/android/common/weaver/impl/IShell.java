package com.meituan.android.common.weaver.impl;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.impl.natives.INativeEnd;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IShell {
    @NonNull
    List<AbstractViewMatcher> additionalViewMatcher(@NonNull INativeEnd iNativeEnd);

    @Nullable
    PagePathHelper fragmentPathHelper(@NonNull Activity activity, @NonNull Object obj, @NonNull View view);

    @Nullable
    AbstractViewMatcher newMRNRootFinder();
}
