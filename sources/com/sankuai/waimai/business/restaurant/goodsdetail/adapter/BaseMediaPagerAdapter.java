package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.pager.BasePagerAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseMediaPagerAdapter extends BasePagerAdapter<com.sankuai.waimai.platform.domain.core.goods.e> {
    public static ChangeQuickRedirect a;
    protected boolean b;
    protected int c;

    public BaseMediaPagerAdapter(@NonNull Context context, @NonNull List<com.sankuai.waimai.platform.domain.core.goods.e> list) {
        super(context, list);
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30649186226f362e139626a02b2d3d0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30649186226f362e139626a02b2d3d0c");
        } else {
            this.b = false;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f80999c1d10b065bc562db2667ebd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f80999c1d10b065bc562db2667ebd7");
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        this.c = i;
    }

    public final void a(int i) {
        MTVideoPlayerView d;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6398d6aa319b4ae7b62df1f8b0ae58d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6398d6aa319b4ae7b62df1f8b0ae58d");
        } else if (this.b && (d = d(i)) != null) {
            View findViewWithTag = d.findViewWithTag("PlayerControllerView");
            if (findViewWithTag instanceof com.sankuai.waimai.business.restaurant.base.gallery.a) {
                ((com.sankuai.waimai.business.restaurant.base.gallery.a) findViewWithTag).b();
            }
            com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "onResume", new Object[0]);
        }
    }

    public final void b(int i) {
        MTVideoPlayerView d;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb3666bc50aeddbb580324a10ab869c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb3666bc50aeddbb580324a10ab869c");
        } else if (this.b && (d = d(i)) != null) {
            View findViewWithTag = d.findViewWithTag("PlayerControllerView");
            if (findViewWithTag instanceof com.sankuai.waimai.business.restaurant.base.gallery.a) {
                ((com.sankuai.waimai.business.restaurant.base.gallery.a) findViewWithTag).a();
            }
            com.sankuai.waimai.foundation.utils.log.a.e("MTPlayer", "onPause", new Object[0]);
        }
    }

    private MTVideoPlayerView d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a7640e5c53607605ee2fe384390c793", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTVideoPlayerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a7640e5c53607605ee2fe384390c793");
        }
        View c = c(i);
        if (c == null) {
            return null;
        }
        return a(c);
    }

    private MTVideoPlayerView a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12373c46f4af94d10051c877f22f8f82", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTVideoPlayerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12373c46f4af94d10051c877f22f8f82");
        }
        View findViewWithTag = view.findViewWithTag("view_tag_video");
        if (findViewWithTag instanceof MTVideoPlayerView) {
            return (MTVideoPlayerView) findViewWithTag;
        }
        return null;
    }

    public final void a(int i, boolean z) {
        MTVideoPlayerView a2;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836f626821be3ba655112aafcd9707c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836f626821be3ba655112aafcd9707c0");
            return;
        }
        View c = c(i);
        if (c == null || (a2 = a(c)) == null) {
            return;
        }
        View findViewWithTag = a2.findViewWithTag("PlayerControllerView");
        if (findViewWithTag instanceof com.sankuai.waimai.business.restaurant.base.gallery.a) {
            ((com.sankuai.waimai.business.restaurant.base.gallery.a) findViewWithTag).a(z);
        }
    }

    public final void a() {
        SparseArray<View> sparseArray;
        MTVideoPlayerView a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c37584a97c058c9488c2091585e1664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c37584a97c058c9488c2091585e1664");
        } else if (this.b && (sparseArray = this.i) != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                View view = sparseArray.get(i);
                if (view != null && (a2 = a(view)) != null) {
                    View findViewWithTag = a2.findViewWithTag("PlayerControllerView");
                    if (findViewWithTag instanceof com.sankuai.waimai.business.restaurant.base.gallery.a) {
                        ((com.sankuai.waimai.business.restaurant.base.gallery.a) findViewWithTag).c();
                    }
                }
            }
        }
    }
}
