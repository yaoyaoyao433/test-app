package com.meituan.android.common.weaver.impl.knb;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.android.common.weaver.interfaces.blank.IKNBBlankPluginO;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class KNBBlankPluginO implements IKNBBlankPluginO {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.interfaces.blank.IKNBBlankPluginO
    public void onLoadUrl(@NonNull Activity activity, @NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3bf9178dbd67cdbbfe8f035548a2698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3bf9178dbd67cdbbfe8f035548a2698");
        } else if (Blanks.sEnable) {
            KNBPagePath kNBPagePath = new KNBPagePath(activity, str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("newKNB", Boolean.FALSE);
            map.put("pageUrl", str);
            kNBPagePath.setOptions(map);
            Blanks.getInstance().scheduleContainerDetector(activity, FFPUtil.idOfObj(activity), kNBPagePath, null);
        }
    }
}
