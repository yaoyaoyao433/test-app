package com.sankuai.waimai.alita.core.feature;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements com.sankuai.waimai.alita.core.base.f<String>, h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.alita.core.feature.h
    public abstract List<String> a();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.alita.core.feature.h
    @Deprecated
    public final JSONObject a(@NonNull String str) {
        return null;
    }

    @Override // com.sankuai.waimai.alita.core.base.f
    public final /* synthetic */ boolean a(String str) {
        List<String> a2;
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923e60e2db523020d22a6abe10607205", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923e60e2db523020d22a6abe10607205")).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && (a2 = a()) != null) {
            for (String str3 : a2) {
                if (str3 != null && TextUtils.equals(str3, str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
