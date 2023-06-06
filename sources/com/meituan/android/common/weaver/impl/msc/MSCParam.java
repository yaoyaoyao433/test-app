package com.meituan.android.common.weaver.impl.msc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.msc.common.lib.c;
import com.meituan.msc.common.lib.d;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MSCParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Activity activity;
    public String appId;
    public String appName;
    public String containerId;
    public Map<String, Object> extra;
    public boolean isWidget;
    public String pageUrl;
    public WeakReference<View> rootView;

    public MSCParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ca2d6e7a2a6f2b7d31fd15bca444b27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ca2d6e7a2a6f2b7d31fd15bca444b27");
        } else {
            this.extra = new HashMap();
        }
    }

    public static MSCParam fromBlank(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ecb9fddf6163ac983288697400067a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ecb9fddf6163ac983288697400067a6");
        }
        MSCParam mSCParam = new MSCParam();
        mSCParam.activity = dVar.i;
        mSCParam.rootView = new WeakReference<>(dVar.f);
        mSCParam.pageUrl = dVar.a;
        if (mSCParam.pageUrl == null) {
            mSCParam.pageUrl = "";
        }
        mSCParam.appId = dVar.b;
        mSCParam.containerId = String.valueOf(dVar.h);
        mSCParam.extra.put("tType", c.MMP.equals(dVar.g) ? ContainerInfo.ENV_MMP : ContainerInfo.ENV_MSC);
        return mSCParam;
    }

    public static MSCParam fromFFP(com.meituan.msc.lib.interfaces.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "837963d1f718941e71860d9ee638b54a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "837963d1f718941e71860d9ee638b54a");
        }
        MSCParam mSCParam = new MSCParam();
        mSCParam.activity = cVar.h;
        mSCParam.rootView = new WeakReference<>(cVar.j);
        mSCParam.pageUrl = cVar.a;
        if (mSCParam.pageUrl == null) {
            mSCParam.pageUrl = "";
        }
        mSCParam.appId = cVar.b;
        mSCParam.appName = cVar.c;
        mSCParam.containerId = String.valueOf(cVar.e);
        mSCParam.extra.put("tType", ContainerInfo.ENV_MSC);
        mSCParam.extra.put("mscVersion", cVar.d);
        mSCParam.extra.put("renderType", cVar.g);
        mSCParam.isWidget = cVar.i;
        return mSCParam;
    }

    public void fillExtra(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4d8a3b7b6c41185f739a60be45c495d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4d8a3b7b6c41185f739a60be45c495d");
            return;
        }
        map.put("pageUrl", this.pageUrl);
        map.put("appId", this.appId);
        map.put("appName", this.appName);
        map.put("containerId", this.appId);
        map.put("isWidget", Boolean.valueOf(this.isWidget));
        map.putAll(this.extra);
    }
}
