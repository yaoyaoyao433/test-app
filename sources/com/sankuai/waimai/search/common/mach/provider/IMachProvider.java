package com.sankuai.waimai.search.common.mach.provider;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.mach.recycler.c;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface IMachProvider {
    @NonNull
    String bizId();

    int constraintHeight(@NonNull Activity activity, @NonNull String str);

    int constraintWidth(@NonNull Activity activity, @NonNull String str);

    @Nullable
    Map<String, Object> customEnv(@NonNull String str, @Nullable Map<String, Object> map);

    void customValue(@NonNull Map<String, Object> map, @NonNull String str, @Nullable Map<String, Object> map2);

    boolean intercept(String str);

    void interceptLogReport(@NonNull d dVar, @NonNull c cVar);

    void interceptMachBuilder(@NonNull Mach.a aVar);

    @Nullable
    List<JSInvokeNativeMethod> jsInvokeNativeMethods(@NonNull String str);

    @Nullable
    d logReport(@NonNull String str, @NonNull String str2, @NonNull String str3);

    @NonNull
    b machLogicList();

    @Nullable
    List<ITagProcessor> tagProcessors(@NonNull String str);

    int timeout(@NonNull String str);

    @Nullable
    Map<String, Object> valLab(@NonNull String str, int i, @NonNull c cVar);
}
