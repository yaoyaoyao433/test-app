package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    @SerializedName("types")
    public List<a> a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("type")
        public int b;
        @SerializedName("description")
        public String c;
        @SerializedName("desc_json")
        public String d;
        public boolean e;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce14061824abc7ecd162745bd450c61c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce14061824abc7ecd162745bd450c61c");
            } else {
                this.e = false;
            }
        }
    }
}
