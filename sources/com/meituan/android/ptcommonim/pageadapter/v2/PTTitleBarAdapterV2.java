package com.meituan.android.ptcommonim.pageadapter.v2;

import android.content.Context;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.model.TemplateInfo;
import com.meituan.android.ptcommonim.pageadapter.titlebar.PTTitleBarAdapter;
import com.meituan.android.ptcommonim.pageadapter.titlebar.bean.TitleBarBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTTitleBarAdapterV2 extends PTTitleBarAdapter {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.android.ptcommonim.pageadapter.titlebar.PTTitleBarAdapter
    public final boolean a() {
        return true;
    }

    public PTTitleBarAdapterV2(Context context, PTSessionInfo pTSessionInfo) {
        Object[] objArr = {context, pTSessionInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "000e757f47b3d6f15e32bf41d8c4030e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "000e757f47b3d6f15e32bf41d8c4030e");
        } else if (pTSessionInfo == null || pTSessionInfo.topModule == null) {
        } else {
            a(new TitleBarBean.Builder().setMainTitle((String) pTSessionInfo.topModule.get("name")).setMachData(com.meituan.android.ptcommonim.utils.b.a(context, pTSessionInfo.topModule)).setRightIconList(com.meituan.android.ptcommonim.utils.b.b(context, pTSessionInfo.topModule)).setMachInfo(TemplateInfo.getModuleMachInfo(pTSessionInfo.templateInfoList, PTSessionInfo.MOEULE_TOP)).build());
        }
    }
}
