package com.sankuai.waimai.business.address.msi;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocateUriReplaceRule implements SchemeReplaceRule {
    private static final String LOCATE_MANUALLY_PATH = "/locatemanually";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        boolean equalsIgnoreCase;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ee14e6754ae2bb119dffd0aee9e9a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ee14e6754ae2bb119dffd0aee9e9a7")).booleanValue();
        }
        if (TextUtils.equals(uri.getPath(), LOCATE_MANUALLY_PATH) || TextUtils.equals(uri.getPath(), LOCATE_MANUALLY_PATH)) {
            Context context = b.a;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.capacity.abtest.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "773aec1dc406c561f6cf4db4efaf9988", RobustBitConfig.DEFAULT_VALUE)) {
                equalsIgnoreCase = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "773aec1dc406c561f6cf4db4efaf9988")).booleanValue();
            } else {
                ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("locate_address_mmp_android", null);
                equalsIgnoreCase = (strategy == null || TextUtils.isEmpty(strategy.expName)) ? false : strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
            }
            if (equalsIgnoreCase && com.sankuai.waimai.platform.capacity.abtest.b.a(b.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22bab44a40e61c8521908bef33e5d55e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22bab44a40e61c8521908bef33e5d55e");
            return;
        }
        Uri uri = jVar.d;
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.path(uri.getPath() + ContainerInfo.ENV_MMP);
        jVar.a(buildUpon.build());
    }
}
