package com.sankuai.waimai.alita;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.g;
import com.sankuai.waimai.alita.core.feature.h;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.alita.core.feature.b {
    public static ChangeQuickRedirect a;
    @Deprecated
    private g<String, a> e;

    public e(@NonNull String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64da531916b9be04a5f138ad31247c35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64da531916b9be04a5f138ad31247c35");
        } else {
            this.e = new g<>();
        }
    }

    @Override // com.sankuai.waimai.alita.core.feature.b
    public final void a(@NonNull h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee20bafccb994d94b22df1d9e9b3124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee20bafccb994d94b22df1d9e9b3124");
            return;
        }
        super.a(hVar);
        this.e.a((g<String, a>) new a(hVar));
    }

    @Nullable
    @Deprecated
    public final h a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a313aef0f225c2ef74760ee227f1ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a313aef0f225c2ef74760ee227f1ce");
        }
        a a2 = this.e.a((g<String, a>) str);
        if (a2 != null) {
            return (h) a2.d;
        }
        return null;
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public class a extends com.sankuai.waimai.alita.core.base.c<h> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.alita.core.base.c, com.sankuai.waimai.alita.core.base.f
        public final boolean a(String str) {
            List<String> a2;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d27cf3bad1e6224f798a4ab05fc6eec8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d27cf3bad1e6224f798a4ab05fc6eec8")).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && (a2 = ((h) this.d).a()) != null) {
                for (String str2 : a2) {
                    if (str2 != null && TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public a(@NonNull h hVar) {
            super("", hVar);
            Object[] objArr = {e.this, hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c413cecd9de3b9261e3cfcc830f0627", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c413cecd9de3b9261e3cfcc830f0627");
            }
        }
    }
}
