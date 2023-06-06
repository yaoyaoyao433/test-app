package com.sankuai.waimai.foundation.core.base.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    private static a a;
    private static final a b = new a() { // from class: com.sankuai.waimai.foundation.core.base.activity.b.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void a(Bundle bundle) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void a(BaseActivity baseActivity) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void a(BaseActivity baseActivity, int i, String str) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void a(BaseActivity baseActivity, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void a(BaseActivity baseActivity, Bundle bundle) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void a(BaseActivity baseActivity, JSONObject jSONObject) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void b(BaseActivity baseActivity) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void c(BaseActivity baseActivity) {
            Object[] objArr = {baseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c54456ea76e241ecfb82b867faf7be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c54456ea76e241ecfb82b867faf7be");
            }
        }

        @Override // com.sankuai.waimai.foundation.core.base.activity.a
        public final void d(BaseActivity baseActivity) {
        }
    };

    public static void a(a aVar) {
        a = aVar;
    }

    public static a a() {
        return a == null ? b : a;
    }
}
