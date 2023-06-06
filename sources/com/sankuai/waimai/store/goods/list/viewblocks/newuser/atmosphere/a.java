package com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.manager.marketing.parser.b;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b<Dialog> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.manager.marketing.parser.a
    public final /* synthetic */ Object a(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.platform.marketing.a aVar, com.sankuai.waimai.store.manager.sequence.a aVar2) {
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be051bb93c966ca4c8292bc1554f567a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be051bb93c966ca4c8292bc1554f567a");
        }
        SGNewUserOutLinkDialogTemplateData sGNewUserOutLinkDialogTemplateData = (SGNewUserOutLinkDialogTemplateData) i.a(aVar.c, SGNewUserOutLinkDialogTemplateData.class);
        if (sGNewUserOutLinkDialogTemplateData == null || sGNewUserOutLinkDialogTemplateData.responseInfo == 0) {
            return null;
        }
        return new SGNewUserOutLinkDialog(activity, sGNewUserOutLinkDialogTemplateData);
    }
}
