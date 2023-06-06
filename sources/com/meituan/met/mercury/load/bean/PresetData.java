package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PresetData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<PresetInfo> presetList;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71f6313c73313d598053c100e0236400", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71f6313c73313d598053c100e0236400");
        }
        return "PresetData{presetList=" + this.presetList + '}';
    }
}
