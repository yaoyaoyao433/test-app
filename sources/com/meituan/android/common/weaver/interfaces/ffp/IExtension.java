package com.meituan.android.common.weaver.interfaces.ffp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IExtension {
    void addCustomTags(@Nullable String str, @Nullable Activity activity, @NonNull String str2, @NonNull Object obj);

    void addCustomTags(@Nullable String str, @Nullable Activity activity, @NonNull Map<String, Object> map);

    void clickJump2Fragment(@NonNull Activity activity, @NonNull Object obj);

    void onFragmentCreateView(@NonNull Activity activity, @NonNull Object obj, @NonNull View view);
}
