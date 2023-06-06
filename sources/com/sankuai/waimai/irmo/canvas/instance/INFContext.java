package com.sankuai.waimai.irmo.canvas.instance;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.INFJSContext;
import com.sankuai.waimai.irmo.canvas.component.INFComponent;
import com.sankuai.waimai.mach.manager.cache.c;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class INFContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String id;
    private INFComponent mBodyComponent;
    private c mBundle;
    private Context mContext;
    private a mInstance;
    private INFJSContext mJSContext;

    public INFContext(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1a4e8a32437d42ba765d2ad60abd878", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1a4e8a32437d42ba765d2ad60abd878");
        } else {
            this.mInstance = aVar;
        }
    }

    public void createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83c409855351cc5c2b9bc49fa802c3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83c409855351cc5c2b9bc49fa802c3fd");
        } else if (this.mBodyComponent == null) {
            this.mBodyComponent = new INFComponent(this);
        }
    }

    public a getInstance() {
        return this.mInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public INFComponent getBodyComponent() {
        return this.mBodyComponent;
    }

    public c getBundle() {
        return this.mBundle;
    }

    public void setBundle(c cVar) {
        this.mBundle = cVar;
    }

    public INFJSContext getJSContext() {
        return this.mJSContext;
    }

    public void setJSContext(INFJSContext iNFJSContext) {
        this.mJSContext = iNFJSContext;
    }

    public void setId(String str) {
        this.id = str;
    }
}
