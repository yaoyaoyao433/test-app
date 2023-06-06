package com.meituan.android.ptcommonim.pageadapter.v2;

import android.content.Context;
import android.text.TextUtils;
import com.hhmedic.android.sdk.module.video.data.Log;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.PTPlugin;
import com.meituan.android.ptcommonim.pageadapter.sendpanel.PTSendPanelAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTSendPanelAdapterV2 extends PTSendPanelAdapter {
    public static ChangeQuickRedirect b;
    private final PTSessionInfo c;

    public PTSendPanelAdapterV2(PTSessionInfo pTSessionInfo) {
        Object[] objArr = {pTSessionInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247b179cad64cb8d5359a4f815fd20e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247b179cad64cb8d5359a4f815fd20e2");
        } else {
            this.c = pTSessionInfo;
        }
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.sendpanel.PTSendPanelAdapter
    public final List<PTPlugin> b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9efb6eb5870c11f2753050e53fdca7a7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9efb6eb5870c11f2753050e53fdca7a7") : new ArrayList();
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.sendpanel.PTSendPanelAdapter
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3fb7125a8931b2ca7145e7f58b80019", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3fb7125a8931b2ca7145e7f58b80019");
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add("voice");
        linkedList.add("picture");
        linkedList.add(WmChooseMediaModule.TYPE_CAMERA);
        linkedList.add(Log.LogStatus.VIDEO_RECORD);
        if (this.c.plusPanelModule != null && this.c.plusPanelModule.plusPanelList != null) {
            for (PTSessionInfo.ButtonInfo buttonInfo : this.c.plusPanelModule.plusPanelList) {
                if (buttonInfo != null && !TextUtils.isEmpty(buttonInfo.type)) {
                    linkedList.remove(buttonInfo.type);
                }
            }
        } else {
            linkedList.add(Log.LogStatus.VIDEO_RECORD);
        }
        return linkedList;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.sendpanel.PTSendPanelAdapter
    public final b c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c847df34321cc96c9866a2b1151a90", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c847df34321cc96c9866a2b1151a90") : new b(context, this.c);
    }
}
