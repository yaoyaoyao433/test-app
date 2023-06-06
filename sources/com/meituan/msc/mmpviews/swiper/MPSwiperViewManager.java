package com.meituan.msc.mmpviews.swiper;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.precreate.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = "MSCSwiper")
/* loaded from: classes3.dex */
public class MPSwiperViewManager extends MPNestedShellViewGroupManager<SwiperShellView, ViewPager> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.as
    @NonNull
    public final /* bridge */ /* synthetic */ View a(@NonNull ThemedReactContext themedReactContext) {
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MSCSwiper";
    }

    @Override // com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.f
    public final boolean h() {
        return true;
    }

    @ReactProp(name = "indicatorActiveColor")
    public void setIndicatorActiveColor(SwiperShellView swiperShellView, String str) {
    }

    @ReactProp(name = "indicatorColor")
    public void setIndicatorColor(SwiperShellView swiperShellView, String str) {
    }

    @ReactProp(defaultBoolean = false, name = "indicatorDots")
    public void setIndicatorDots(SwiperShellView swiperShellView, boolean z) {
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(int i, @NonNull ThemedReactContext themedReactContext, ab abVar) {
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5938d3abd6a4c34fb59b8c68024f3de6", RobustBitConfig.DEFAULT_VALUE)) {
            return (SwiperShellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5938d3abd6a4c34fb59b8c68024f3de6");
        }
        long nanoTime = System.nanoTime();
        SwiperShellView tryGetMPSwiperView = themedReactContext.getRuntimeDelegate().tryGetMPSwiperView(themedReactContext);
        tryGetMPSwiperView.setInitialProps(abVar);
        c.l++;
        c.E += System.nanoTime() - nanoTime;
        return tryGetMPSwiperView;
    }

    @Override // com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager
    public final /* synthetic */ ViewPager a(SwiperShellView swiperShellView) {
        SwiperShellView swiperShellView2 = swiperShellView;
        Object[] objArr = {swiperShellView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97fe83804e7bc4c4d6bd2bb4ca93b030", RobustBitConfig.DEFAULT_VALUE) ? (ViewPager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97fe83804e7bc4c4d6bd2bb4ca93b030") : swiperShellView2.getInnerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager
    public void a(SwiperShellView swiperShellView, View view, int i) {
        Object[] objArr = {swiperShellView, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bddf3ea2b1a6b689077fed7fabcf168e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bddf3ea2b1a6b689077fed7fabcf168e");
            return;
        }
        Object[] objArr2 = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = SwiperShellView.d;
        if (PatchProxy.isSupport(objArr2, swiperShellView, changeQuickRedirect2, false, "73d725af4ee4305c1e49d61c1a9329f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, swiperShellView, changeQuickRedirect2, false, "73d725af4ee4305c1e49d61c1a9329f7");
            return;
        }
        try {
            swiperShellView.getAdapter().a(view, i);
            if (swiperShellView.getViewCountInAdapter() > 1 && !swiperShellView.h) {
                if (swiperShellView.f) {
                    swiperShellView.e.setCurrentItem(1, false);
                }
                swiperShellView.b(swiperShellView.g);
                swiperShellView.h = true;
            }
            if (swiperShellView.i <= 0 || swiperShellView.getViewCountInAdapter() <= swiperShellView.i) {
                return;
            }
            swiperShellView.j = "";
            swiperShellView.e.setCurrentItem(swiperShellView.i, true);
            swiperShellView.i = -1;
        } catch (IndexOutOfBoundsException unused) {
            swiperShellView.getAdapter().a(view, swiperShellView.getAdapter().getCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int b(SwiperShellView swiperShellView) {
        Object[] objArr = {swiperShellView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c9c915120047e332e8c669cb5cce18", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c9c915120047e332e8c669cb5cce18")).intValue() : swiperShellView.getViewCountInAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View b(SwiperShellView swiperShellView, int i) {
        Object[] objArr = {swiperShellView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47b5a59de4de9819f6ff12a898b14b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47b5a59de4de9819f6ff12a898b14b8");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = SwiperShellView.d;
        return PatchProxy.isSupport(objArr2, swiperShellView, changeQuickRedirect2, false, "16b5ec390ed695a1b63c57cb7f726859", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, swiperShellView, changeQuickRedirect2, false, "16b5ec390ed695a1b63c57cb7f726859") : swiperShellView.getAdapter().b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.mmpviews.shell.nest.MPNestedShellViewGroupManager, com.meituan.msc.mmpviews.shell.MPShellDelegateViewGroupManager, com.meituan.msc.uimanager.e
    public void b(SwiperShellView swiperShellView, int i) {
        Object[] objArr = {swiperShellView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6dea989574999256d23fbc12a92de98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6dea989574999256d23fbc12a92de98");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = SwiperShellView.d;
        if (PatchProxy.isSupport(objArr2, swiperShellView, changeQuickRedirect2, false, "15e40c56db82bcbffdc88c4b929fdbfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, swiperShellView, changeQuickRedirect2, false, "15e40c56db82bcbffdc88c4b929fdbfe");
            return;
        }
        ViewPagerAdapter adapter = swiperShellView.getAdapter();
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = ViewPagerAdapter.b;
        if (PatchProxy.isSupport(objArr3, adapter, changeQuickRedirect3, false, "fff6516b386e011a434acacbff9169d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, adapter, changeQuickRedirect3, false, "fff6516b386e011a434acacbff9169d7");
            return;
        }
        adapter.c.remove(i);
        adapter.notifyDataSetChanged();
    }

    @ReactProp(name = "autoplay")
    public void setAutoPlay(SwiperShellView swiperShellView, Dynamic dynamic) {
        Object[] objArr = {swiperShellView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f60d40cb6b1cbeb72dbc9d7d063fc2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f60d40cb6b1cbeb72dbc9d7d063fc2e");
        } else {
            swiperShellView.setAutoPlay(com.meituan.msc.mmpviews.util.b.a(dynamic));
        }
    }

    @ReactProp(name = "interval")
    public void setInterval(SwiperShellView swiperShellView, Dynamic dynamic) {
        Object[] objArr = {swiperShellView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b93fa1a3a0a774a5a0678f730296d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b93fa1a3a0a774a5a0678f730296d2");
        } else {
            swiperShellView.setInterval((int) com.meituan.msc.mmpviews.util.b.b(dynamic));
        }
    }

    @ReactProp(name = "duration")
    public void setDuration(SwiperShellView swiperShellView, Dynamic dynamic) {
        Object[] objArr = {swiperShellView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf03dd9bcaa21ec7baa1dceb503ae47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf03dd9bcaa21ec7baa1dceb503ae47");
        } else {
            swiperShellView.setDuration((int) com.meituan.msc.mmpviews.util.b.b(dynamic));
        }
    }

    @ReactProp(name = "circular")
    public void setCircular(SwiperShellView swiperShellView, Dynamic dynamic) {
        Object[] objArr = {swiperShellView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729010e623be99cec116ef23ffed1412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729010e623be99cec116ef23ffed1412");
        } else {
            swiperShellView.setCircular(com.meituan.msc.mmpviews.util.b.a(dynamic));
        }
    }

    @ReactProp(name = "current")
    public void setCurrent(SwiperShellView swiperShellView, Dynamic dynamic) {
        Object[] objArr = {swiperShellView, dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c92a6236eff4e638ad0a2fd4d39ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c92a6236eff4e638ad0a2fd4d39ebe");
        } else {
            swiperShellView.setCurrent((int) com.meituan.msc.mmpviews.util.b.b(dynamic));
        }
    }
}
