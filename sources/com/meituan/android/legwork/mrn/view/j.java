package com.meituan.android.legwork.mrn.view;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.views.scroll.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static f.a<ReactNestedScrollView> b = new f.a<ReactNestedScrollView>() { // from class: com.meituan.android.legwork.mrn.view.j.1
        public static ChangeQuickRedirect a;

        @Override // com.facebook.react.views.scroll.f.a
        public final /* synthetic */ void flashScrollIndicators(ReactNestedScrollView reactNestedScrollView) {
            ReactNestedScrollView reactNestedScrollView2 = reactNestedScrollView;
            Object[] objArr = {reactNestedScrollView2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90e01158174e1129c8a8604a2bf48df6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90e01158174e1129c8a8604a2bf48df6");
            } else {
                reactNestedScrollView2.a();
            }
        }

        @Override // com.facebook.react.views.scroll.f.a
        public final /* synthetic */ void scrollTo(ReactNestedScrollView reactNestedScrollView, f.b bVar) {
            ReactNestedScrollView reactNestedScrollView2 = reactNestedScrollView;
            Object[] objArr = {reactNestedScrollView2, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b80e8b2e783f842af01e4e750d5a1ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b80e8b2e783f842af01e4e750d5a1ba");
                return;
            }
            reactNestedScrollView2.b();
            if (bVar.c) {
                reactNestedScrollView2.a(bVar.a, bVar.b);
            } else {
                reactNestedScrollView2.scrollTo(bVar.a, bVar.b);
            }
        }

        @Override // com.facebook.react.views.scroll.f.a
        public final /* synthetic */ void scrollToEnd(ReactNestedScrollView reactNestedScrollView, f.c cVar) {
            ReactNestedScrollView reactNestedScrollView2 = reactNestedScrollView;
            Object[] objArr = {reactNestedScrollView2, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0800780a353d5e3e199b0b4b305e54", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0800780a353d5e3e199b0b4b305e54");
            } else if (reactNestedScrollView2.getChildAt(0) == null) {
                throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
            } else {
                reactNestedScrollView2.b();
                int height = reactNestedScrollView2.getChildAt(0).getHeight() + reactNestedScrollView2.getPaddingBottom();
                if (cVar.a) {
                    reactNestedScrollView2.smoothScrollTo(reactNestedScrollView2.getScrollX(), height);
                } else {
                    reactNestedScrollView2.scrollTo(reactNestedScrollView2.getScrollX(), height);
                }
            }
        }
    };

    public static void a(ReactNestedScrollView reactNestedScrollView, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {reactNestedScrollView, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dbaa799a584f7463d19bee455c6d397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dbaa799a584f7463d19bee455c6d397");
        } else {
            com.facebook.react.views.scroll.f.a(b, reactNestedScrollView, str, readableArray);
        }
    }

    public static <T> void a(f.a<T> aVar, T t, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, t, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a08f171b7287228cbf80e50bb553424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a08f171b7287228cbf80e50bb553424");
        } else {
            com.facebook.react.views.scroll.f.a(aVar, t, str, readableArray);
        }
    }
}
