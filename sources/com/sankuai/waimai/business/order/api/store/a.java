package com.sankuai.waimai.business.order.api.store;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {
    JSInvokeNativeMethod getRocksSGHttpMethod(String str);

    void onRocksReceiveMachJsEvent(Context context, @NonNull String str, @Nullable Map<String, Object> map);
}
