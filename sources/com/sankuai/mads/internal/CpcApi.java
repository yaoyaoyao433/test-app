package com.sankuai.mads.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJF\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0016\b\u0001\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH'¨\u0006\u000b"}, d2 = {"Lcom/sankuai/mads/internal/CpcApi;", "", "uploadLogData", "Lrx/Observable;", "Lcom/sankuai/mads/internal/BaseResponse;", "", "url", "data", "map", "", "Companion", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public interface CpcApi {
    public static final a a = a.b;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¨\u0006\f"}, d2 = {"Lcom/sankuai/mads/internal/CpcApi$Companion;", "", "()V", "create", "Lcom/sankuai/mads/internal/CpcApi;", "baseUrl", "", "rawCallFactory", "Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;", "interceptors", "", "Lcom/sankuai/meituan/retrofit2/Interceptor;", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public static final /* synthetic */ a b = new a();
    }

    @POST
    @FormUrlEncoded
    @NotNull
    rx.d<BaseResponse<String>> uploadLogData(@Url @NotNull String str, @Field("wm_ad_log") @Nullable String str2, @HeaderMap @Nullable Map<String, String> map);
}
