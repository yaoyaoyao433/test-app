package com.sankuai.waimai.machpro.instance;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.bridge.MPJSContext;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MPContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<com.sankuai.waimai.machpro.component.view.b> mBlurComponents;
    private com.sankuai.waimai.machpro.component.body.a mBodyComponent;
    private c mBundle;
    private Context mContext;
    private a mInstance;
    private MPJSContext mJSContext;
    private Map<String, c> mSubBundleMap;
    private int openCssReset;

    public MPContext(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97a5d903b271208761bddc5d15fc0a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97a5d903b271208761bddc5d15fc0a87");
            return;
        }
        this.openCssReset = -1;
        this.mInstance = aVar;
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

    public com.sankuai.waimai.machpro.component.body.a getBodyComponent() {
        return this.mBodyComponent;
    }

    public void setBodyComponent(com.sankuai.waimai.machpro.component.body.a aVar) {
        this.mBodyComponent = aVar;
    }

    public c getBundle() {
        return this.mBundle;
    }

    public void setBundle(c cVar) {
        this.mBundle = cVar;
    }

    public String getBundleName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6382de8955b023763f5b773432d8c93a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6382de8955b023763f5b773432d8c93a") : this.mBundle != null ? this.mBundle.d : "";
    }

    public MPJSContext getJSContext() {
        return this.mJSContext;
    }

    public void setJSContext(MPJSContext mPJSContext) {
        this.mJSContext = mPJSContext;
    }

    public void addSubBundle(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba4dcc52b2c76ae16fe67faf5bb0e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba4dcc52b2c76ae16fe67faf5bb0e4e");
        } else if (TextUtils.isEmpty(str) || cVar == null) {
        } else {
            if (this.mSubBundleMap == null) {
                this.mSubBundleMap = new HashMap();
            }
            this.mSubBundleMap.put(str, cVar);
        }
    }

    public c getSubBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bf116a452e1bbc97ef21499201f6e51", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bf116a452e1bbc97ef21499201f6e51");
        }
        if (TextUtils.isEmpty(str) || this.mSubBundleMap == null) {
            return null;
        }
        return this.mSubBundleMap.get(str);
    }

    public void putBlurComponent(com.sankuai.waimai.machpro.component.view.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0720d600492ff5dd59ab83749407259e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0720d600492ff5dd59ab83749407259e");
        } else if (bVar != null) {
            if (this.mBlurComponents == null) {
                this.mBlurComponents = new LinkedList();
            }
            for (com.sankuai.waimai.machpro.component.view.b bVar2 : this.mBlurComponents) {
                if (bVar2 == bVar) {
                    return;
                }
            }
            this.mBlurComponents.add(bVar);
        }
    }

    public void removeBlurComponent(com.sankuai.waimai.machpro.component.view.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b9a5e2a579a1f658332379e595fde25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b9a5e2a579a1f658332379e595fde25");
        } else if (bVar == null || this.mBlurComponents == null) {
        } else {
            this.mBlurComponents.remove(bVar);
        }
    }

    public List<com.sankuai.waimai.machpro.component.view.b> getBlurComponents() {
        return this.mBlurComponents;
    }

    public boolean isOpenCssReset() {
        return this.openCssReset == 1;
    }

    public int getOpenCssReset() {
        return this.openCssReset;
    }

    public void setOpenCssReset(boolean z) {
        if (z) {
            this.openCssReset = 1;
        } else {
            this.openCssReset = 0;
        }
    }
}
