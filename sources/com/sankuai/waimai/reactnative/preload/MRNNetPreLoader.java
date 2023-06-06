package com.sankuai.waimai.reactnative.preload;

import android.net.Uri;
import android.os.Bundle;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import com.sankuai.waimai.platform.preload.d;
import java.util.Objects;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNNetPreLoader implements PreloadRunnable<String> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    public void run(Bundle bundle, Uri uri, d<String> dVar) {
        Object[] objArr = {bundle, uri, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21127cb1fea0f11be4b5832f432b93ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21127cb1fea0f11be4b5832f432b93ed");
            return;
        }
        com.meituan.android.mrn.router.d dVar2 = new com.meituan.android.mrn.router.d(uri);
        if (!dVar2.a()) {
            dVar.cancel();
            return;
        }
        Set<a> enabledBundles = MRNPreloadConfig.getEnabledBundles();
        if (enabledBundles == null) {
            dVar.cancel();
        } else if (enabledBundles.contains(a.a(dVar2))) {
            new MRNStaticPreload().run(bundle, uri, dVar);
        } else {
            dVar.cancel();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("biz")
        public final String b;
        @SerializedName("entry")
        public final String c;
        @SerializedName("component")
        public final String d;

        private a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30ca62c3f561f7db89cdc449fa77dd7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30ca62c3f561f7db89cdc449fa77dd7");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public static a a(com.meituan.android.mrn.router.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2a012dacbab33f11e84b724fa79e768", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2a012dacbab33f11e84b724fa79e768") : new a(dVar.b(), dVar.c(), dVar.d());
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f45cd53d0edbc6ec680a1354b8324d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f45cd53d0edbc6ec680a1354b8324d")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.b, aVar.b) && Objects.equals(this.c, aVar.c) && Objects.equals(this.d, aVar.d);
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755952fae34f1065c2be48639771175b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755952fae34f1065c2be48639771175b")).intValue() : Objects.hash(this.b, this.c, this.d);
        }
    }
}
