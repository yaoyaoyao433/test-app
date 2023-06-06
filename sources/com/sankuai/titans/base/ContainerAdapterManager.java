package com.sankuai.titans.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContainerAdapterManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ContainerAdapterManager mInstance = new ContainerAdapterManager();
    private final Map<String, IContainerAdapter> mContainers;

    public ContainerAdapterManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8b9ed2aed408fcc0ea09020a22a9027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8b9ed2aed408fcc0ea09020a22a9027");
        } else {
            this.mContainers = new HashMap();
        }
    }

    public static ContainerAdapterManager getInstance() {
        return mInstance;
    }

    public void addContainerAdapter(String str, IContainerAdapter iContainerAdapter) {
        Object[] objArr = {str, iContainerAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57bcf3d4ef849ae99bdaf5cdb77f2a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57bcf3d4ef849ae99bdaf5cdb77f2a0a");
        } else if (iContainerAdapter == null) {
        } else {
            this.mContainers.put(str, iContainerAdapter);
        }
    }

    public IContainerAdapter getContainerAdapter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d23f08fb0ffe8bf16198cb42850c6305", RobustBitConfig.DEFAULT_VALUE)) {
            return (IContainerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d23f08fb0ffe8bf16198cb42850c6305");
        }
        if (this.mContainers.size() == 0) {
            return null;
        }
        return this.mContainers.get(str);
    }

    public void remove(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "035e05511ceaf6aecd39f9d60e93a70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "035e05511ceaf6aecd39f9d60e93a70c");
        } else {
            this.mContainers.remove(str);
        }
    }

    public String createAndAddContainerAdapter(IContainerAdapter iContainerAdapter) {
        Object[] objArr = {iContainerAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "821dacc5e5ed6b67cb7e9d04a76297fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "821dacc5e5ed6b67cb7e9d04a76297fb");
        }
        String str = iContainerAdapter.toString() + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis();
        addContainerAdapter(str, iContainerAdapter);
        return str;
    }
}
