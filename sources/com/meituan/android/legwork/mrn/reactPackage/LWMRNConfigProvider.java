package com.meituan.android.legwork.mrn.reactPackage;

import com.facebook.react.i;
import com.meituan.android.legwork.mrn.scroll.g;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LWMRNConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return "banma";
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getBusinessReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d5ad7d7086c89376291713c4706063", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d5ad7d7086c89376291713c4706063") : Arrays.asList(new a(), new c(), new com.meituan.android.mrn.component.map.d((com.meituan.android.mrn.component.map.b) new b()), new d(), new g());
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public Map<String, String> getBusinessMetricsTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021ff9a4a32325ef56e299140a0cdfae", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021ff9a4a32325ef56e299140a0cdfae") : com.meituan.android.legwork.common.util.b.a().a(str);
    }
}
