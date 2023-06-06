package com.sankuai.waimai.business.im.group.prepare;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.b;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements e {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private long d;
    private int e;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e408019610eb93b5870049b45370864b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e408019610eb93b5870049b45370864b");
        } else {
            this.c = "";
        }
    }

    @Override // com.sankuai.waimai.business.im.group.prepare.e
    public final void a(@NonNull TransferActivity transferActivity, @NonNull Uri uri, long j, e.a aVar, int i, boolean z, int i2) {
        String queryParameter;
        Object[] objArr = {transferActivity, uri, new Long(j), aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea05574d535e5a99f68a6e035afa5073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea05574d535e5a99f68a6e035afa5073");
            return;
        }
        this.b = com.sankuai.waimai.imbase.utils.g.a(uri.getQueryParameter("poiId"));
        this.c = uri.getQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR);
        this.d = com.sankuai.waimai.imbase.utils.g.a(uri.getQueryParameter(Constants.EventConstants.KEY_ORDER_ID));
        if (TextUtils.isEmpty(uri.getQueryParameter(KnbConstants.PARAMS_SCENE))) {
            StringBuilder sb = new StringBuilder();
            sb.append(j == 0 ? -1 : 0);
            queryParameter = sb.toString();
        } else {
            queryParameter = uri.getQueryParameter(KnbConstants.PARAMS_SCENE);
        }
        this.e = com.sankuai.waimai.imbase.utils.g.c(queryParameter);
        if (this.e == -1) {
            Object[] objArr2 = {"scene is invalid", uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddebc2c7bde680cd6331e2da53384ad7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddebc2c7bde680cd6331e2da53384ad7");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("url", uri.toString());
                com.sankuai.waimai.business.im.common.log.b.a("group_enter", "url", "scene is invalid", hashMap);
            }
            transferActivity.finish();
            return;
        }
        if (this.b == 0 || this.d == 0 || TextUtils.isEmpty(this.c)) {
            this.d = aVar.c;
            this.b = aVar.d;
            this.c = aVar.e;
        }
        Object[] objArr3 = {transferActivity, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "deb25736595317272fcd316ad849cd0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "deb25736595317272fcd316ad849cd0f");
            return;
        }
        com.sankuai.waimai.business.im.api.a.a().a(transferActivity, this.d, this.b, this.c, transferActivity.w(), i, this.e, z, (b.a) null, i2);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2c8e614edd4803c40d7a43902f898389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2c8e614edd4803c40d7a43902f898389");
        } else {
            com.sankuai.waimai.business.im.common.log.b.a("group_enter", "url");
        }
    }
}
