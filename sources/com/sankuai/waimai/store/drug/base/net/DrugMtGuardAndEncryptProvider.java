package com.sankuai.waimai.store.drug.base.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMtGuardAndEncryptProvider implements MtGuardAndEncryptProvider {
    private static final List<String> FINGER_PRINTS;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        ArrayList arrayList = new ArrayList();
        FINGER_PRINTS = arrayList;
        arrayList.add("/paidInquiry/video_inquiry/create");
        FINGER_PRINTS.add("/paidInquiry/inquiry/go");
        FINGER_PRINTS.add("/health/marketingc/member/cardBindPop");
        FINGER_PRINTS.add("/health/marketingc/member/cardBind");
    }

    @Override // com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider
    public void registerEncryptProvider(com.sankuai.waimai.platform.provider.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5abf0e482763af6d5d708da7f5b86ec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5abf0e482763af6d5d708da7f5b86ec3");
            return;
        }
        for (String str : FINGER_PRINTS) {
            if (!TextUtils.isEmpty(str)) {
                aVar.a(str);
            }
        }
    }
}
