package com.sankuai.waimai.store.goods.detail.components.root;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.comment.Picture;
import com.sankuai.waimai.store.platform.domain.core.comment.Video;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final Activity b;
    final String c;
    final String d;
    final long e;
    public ArrayList<Picture> f;
    public ArrayList<Video> g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public int a;
        public ArrayList<com.sankuai.waimai.platform.domain.core.goods.e> b;
    }

    public e(Activity activity, String str, long j, String str2) {
        Object[] objArr = {activity, str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c045cb51b528217e76068297026d358", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c045cb51b528217e76068297026d358");
            return;
        }
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.b = activity;
        this.c = str;
        this.e = j;
        this.d = str2;
    }
}
