package com.sankuai.waimai.business.search.ui.result.mach.provider;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMachProviderImpl implements IMachProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final b machLogicList = new b("waimai");

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @NonNull
    public String bizId() {
        return "waimai";
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public int constraintHeight(@NotNull Activity activity, @NotNull String str) {
        return 0;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public Map<String, Object> customEnv(@NonNull String str, @Nullable Map<String, Object> map) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public void customValue(@NonNull Map<String, Object> map, @NonNull String str, @Nullable Map<String, Object> map2) {
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public boolean intercept(String str) {
        return false;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public void interceptLogReport(@NonNull d dVar, @NonNull c cVar) {
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public void interceptMachBuilder(@NonNull Mach.a aVar) {
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public List<JSInvokeNativeMethod> jsInvokeNativeMethods(@NotNull String str) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public List<ITagProcessor> tagProcessors(@NotNull String str) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public int timeout(@NotNull String str) {
        return 5000;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    @Nullable
    public Map<String, Object> valLab(@NonNull String str, int i, @NonNull c cVar) {
        return null;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public b machLogicList() {
        return machLogicList;
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public d logReport(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2cde1cd5106e1932c7d813b5892f79f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2cde1cd5106e1932c7d813b5892f79f") : new com.sankuai.waimai.business.search.ui.result.mach.d();
    }

    @Override // com.sankuai.waimai.search.common.mach.provider.IMachProvider
    public int constraintWidth(@NotNull Activity activity, @NotNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a25eca3c7e167f8035c29109cdc10e4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a25eca3c7e167f8035c29109cdc10e4")).intValue() : g.a((Context) activity);
    }
}
