package com.sankuai.waimai.mmp;

import android.support.annotation.NonNull;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.mmp.main.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends aa {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.mmp.main.aa
    public final void a(@NonNull String str, @NonNull String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbed65b4cb19bae4957deb9d784c2f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbed65b4cb19bae4957deb9d784c2f1");
        } else {
            Sniffer.smell(str, str2, str3, str4, str5);
        }
    }
}
