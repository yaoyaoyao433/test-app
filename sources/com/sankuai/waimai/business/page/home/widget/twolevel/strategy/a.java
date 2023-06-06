package com.sankuai.waimai.business.page.home.widget.twolevel.strategy;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements ag<SecondFloorGuideStrategy> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cipstorage.ag
    /* renamed from: a */
    public SecondFloorGuideStrategy deserializeFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455344bdcf31399d3262e626612915c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (SecondFloorGuideStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455344bdcf31399d3262e626612915c3");
        }
        try {
            return (SecondFloorGuideStrategy) k.a().fromJson(str, new TypeToken<SecondFloorGuideStrategy>() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.a.1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.android.cipstorage.ag
    /* renamed from: a */
    public String serializeAsString(SecondFloorGuideStrategy secondFloorGuideStrategy) {
        Object[] objArr = {secondFloorGuideStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1439171777eda24b08c38dc6d99f2de6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1439171777eda24b08c38dc6d99f2de6");
        }
        try {
            return k.a().toJson(secondFloorGuideStrategy);
        } catch (Exception unused) {
            return null;
        }
    }
}
