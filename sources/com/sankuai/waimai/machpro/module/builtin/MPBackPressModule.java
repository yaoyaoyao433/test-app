package com.sankuai.waimai.machpro.module.builtin;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPBackPressModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int sId;
    private Map<Integer, MPJSCallBack> mJsCallBacks;

    public MPBackPressModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9632f8717401d8c5d6716b7275bdca0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9632f8717401d8c5d6716b7275bdca0");
        } else {
            this.mJsCallBacks = new LinkedHashMap();
        }
    }

    @JSMethod(methodName = "addBackPressListener")
    public Integer addBackPressListener(MPJSCallBack mPJSCallBack) {
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34107b8923378a21e59554f3f514d208", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34107b8923378a21e59554f3f514d208");
        }
        sId++;
        this.mJsCallBacks.put(Integer.valueOf(sId), mPJSCallBack);
        return Integer.valueOf(sId);
    }

    @JSMethod(methodName = "removeBackPressListener")
    public void removeBackPressListener(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e5b240ab9407f61ce035948da3e1b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e5b240ab9407f61ce035948da3e1b85");
        } else {
            this.mJsCallBacks.remove(num);
        }
    }

    public boolean onBackPress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b41b3a7257f28e534d458fdb51172f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b41b3a7257f28e534d458fdb51172f1")).booleanValue();
        }
        Collection<MPJSCallBack> values = this.mJsCallBacks.values();
        if (values != null && values.size() > 0) {
            Object[] array = values.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                if (array[length] instanceof MPJSCallBack) {
                    Object invoke = ((MPJSCallBack) array[length]).invoke((MachMap) null);
                    if ((invoke instanceof Boolean) && ((Boolean) invoke).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
