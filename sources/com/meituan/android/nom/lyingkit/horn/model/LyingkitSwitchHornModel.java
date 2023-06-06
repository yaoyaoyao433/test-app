package com.meituan.android.nom.lyingkit.horn.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public final class LyingkitSwitchHornModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Map<String, SpanIdModel>> data;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static final class SpanIdModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String alert;
        public boolean enabled;
        public List<String> versions;
    }

    public final SpanIdModel getSwitchBySpanid(String str, String str2) {
        Map<String, SpanIdModel> map;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f16681bac57742a10bb6724fb55913c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpanIdModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f16681bac57742a10bb6724fb55913c6");
        }
        if (this.data == null || (map = this.data.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }
}
