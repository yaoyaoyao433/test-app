package com.sankuai.waimai.business.restaurant.base.repository.preload;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.h;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.a;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestMenuNetWorkPreLoader implements PreloadRunnable<h> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run(android.os.Bundle r46, android.net.Uri r47, final com.sankuai.waimai.platform.preload.d<com.sankuai.waimai.business.restaurant.base.repository.model.h> r48) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.repository.preload.RestMenuNetWorkPreLoader.run(android.os.Bundle, android.net.Uri, com.sankuai.waimai.platform.preload.d):void");
    }

    private String getIMGroupActivity(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87948576d7718456d1fb205d199d9875", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87948576d7718456d1fb205d199d9875");
        }
        List<a> localCartData = GlobalCartManager.getInstance().getLocalCartData();
        if (localCartData == null || localCartData.size() <= 0) {
            return "";
        }
        for (a aVar : localCartData) {
            if (aVar != null && aVar.c.equals(str) && aVar.e.size() > 0) {
                for (CartProduct cartProduct : aVar.e) {
                    if (cartProduct != null && !TextUtils.isEmpty(cartProduct.groupChatShare)) {
                        return cartProduct.groupChatShare;
                    }
                }
                continue;
            }
        }
        return "";
    }
}
