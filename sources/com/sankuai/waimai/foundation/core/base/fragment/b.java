package com.sankuai.waimai.foundation.core.base.fragment;

import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    private static a a;
    private static final a b = new a() { // from class: com.sankuai.waimai.foundation.core.base.fragment.b.1
        @Override // com.sankuai.waimai.foundation.core.base.fragment.a
        public final void a(BaseFragment baseFragment) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.fragment.a
        public final void a(BaseFragment baseFragment, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        }

        @Override // com.sankuai.waimai.foundation.core.base.fragment.a
        public final void a(BaseFragment baseFragment, boolean z) {
        }
    };

    public static void a(@NonNull a aVar) {
        a = aVar;
    }

    @NonNull
    public static a a() {
        return a == null ? b : a;
    }
}
