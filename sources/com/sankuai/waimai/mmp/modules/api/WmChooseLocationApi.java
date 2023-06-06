package com.sankuai.waimai.mmp.modules.api;

import android.content.Intent;
import android.net.Uri;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msi.a;
import com.meituan.msi.addapter.location.ChooseLocationParam;
import com.meituan.msi.addapter.location.ChooseLocationResponse;
import com.meituan.msi.addapter.location.IChooseLocation;
import com.meituan.msi.api.g;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.connect.common.Constants;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmChooseLocationApi extends IChooseLocation implements g {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.location.IChooseLocation
    public final void a(MsiCustomContext msiCustomContext, ChooseLocationParam chooseLocationParam, i<ChooseLocationResponse> iVar) {
        Object[] objArr = {msiCustomContext, chooseLocationParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7fc5b806f1632661be7f6ae069ca3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7fc5b806f1632661be7f6ae069ca3a");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("meituanwaimai://waimai.meituan.com/mrn?mrn_biz=map&mrn_entry=map-address-picker&mrn_component=map-address-picker").buildUpon().appendQueryParameter("mapsource", "platformminiprogram").appendQueryParameter("coordtype", "0").appendQueryParameter("zoomlevel", Constants.VIA_REPORT_TYPE_START_WAP);
        if (chooseLocationParam.latitude != 0.0d || chooseLocationParam.longitude != 0.0d) {
            appendQueryParameter.appendQueryParameter(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(chooseLocationParam.latitude));
            appendQueryParameter.appendQueryParameter(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(chooseLocationParam.longitude));
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage(a.f().getPackageName());
        msiCustomContext.startActivityForResult(intent, 97);
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ceea00b37978781fbc99bddc548b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ceea00b37978781fbc99bddc548b6b");
        } else if (i == -1) {
            ChooseLocationResponse chooseLocationResponse = new ChooseLocationResponse();
            chooseLocationResponse.latitude = intent.getDoubleExtra(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
            chooseLocationResponse.longitude = intent.getDoubleExtra(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
            chooseLocationResponse.name = f.a(intent, "name");
            chooseLocationResponse.address = f.a(intent, GearsLocator.ADDRESS);
            msiContext.onSuccess(chooseLocationResponse);
        } else {
            msiContext.onError(500, "resultCode is not ok");
        }
    }
}
