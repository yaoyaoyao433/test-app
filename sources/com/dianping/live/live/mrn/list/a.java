package com.dianping.live.live.mrn.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    c b;
    FrameLayout c;
    private final int d;
    private final Context e;

    public a(MLiveListRecyclerView mLiveListRecyclerView, int i) {
        FrameLayout frameLayout;
        Object[] objArr = {mLiveListRecyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9540b7fc36cb9e22d0cd9e8005913c84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9540b7fc36cb9e22d0cd9e8005913c84");
            return;
        }
        this.d = mLiveListRecyclerView.getId() + i + 1;
        this.e = mLiveListRecyclerView.getContext();
        Context context = this.e;
        int i2 = this.d;
        Object[] objArr2 = {context, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5f2d84b9381394fceb3c1d2beb3bfe41", RobustBitConfig.DEFAULT_VALUE)) {
            frameLayout = (FrameLayout) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5f2d84b9381394fceb3c1d2beb3bfe41");
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new RecyclerView.g(-1, -1));
            frameLayout2.setId(i2);
            frameLayout = frameLayout2;
        }
        this.c = frameLayout;
    }
}
