package com.sankuai.waimai.platform.domain.core.goods;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("type")
    public int b;
    @SerializedName("url")
    public String c;
    @SerializedName("video_cover_url")
    public String d;
    public int e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8a464d4ac2e9040f0edaac3eefb439", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8a464d4ac2e9040f0edaac3eefb439");
            return;
        }
        this.j = true;
        this.k = false;
    }
}
