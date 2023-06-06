package com.sankuai.waimai.guidepop.utils;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ah;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static View a(FrameLayout frameLayout, String str, String str2) {
        Object[] objArr = {frameLayout, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf83e6c7971219a32bfa4f37c5813eae", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf83e6c7971219a32bfa4f37c5813eae");
        }
        b.a("[findGuideView]  locationArea：" + str + "，contextText：" + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || frameLayout == null) {
            return null;
        }
        String[] split = str.split(";");
        String str3 = split[0];
        int parseInt = split.length > 1 ? NumberUtils.parseInt(split[1], 1) : 1;
        View a2 = a(frameLayout, str3);
        if (a2 == null) {
            b.a("[findGuideView]  区域没有");
            return null;
        } else if (a2.getVisibility() != 0) {
            b.a("[findGuideView]  区域不可见");
            return null;
        } else {
            View b = b(a2, str2);
            if (b == null) {
                b.a("[findGuideView]  锚点view没有");
                return null;
            } else if (b.getVisibility() != 0) {
                b.a("[findGuideView]  锚点view可见");
                return null;
            } else {
                b.a("[findGuideView]  success!!!");
                ViewParent parent = b.getParent();
                for (int i = 1; i < parseInt; i++) {
                    parent = parent.getParent();
                }
                return (View) parent;
            }
        }
    }

    public static View a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1088a7f4c516df9aed5c82503d22cfdf", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1088a7f4c516df9aed5c82503d22cfdf") : a(view, str, 2);
    }

    private static View b(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7d1f9ecb7ab5f9ee96e6b90eddd8b00", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7d1f9ecb7ab5f9ee96e6b90eddd8b00") : a(view, str, 1);
    }

    private static View a(View view, String str, int i) {
        CharSequence text;
        Object[] objArr = {view, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d28f86b1853f193f694b93e46b7d79aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d28f86b1853f193f694b93e46b7d79aa");
        }
        ArrayList<View> arrayList = new ArrayList<>();
        view.findViewsWithText(arrayList, str, i);
        if (arrayList.isEmpty()) {
            return null;
        }
        b.a("[findView] views size :" + arrayList.size());
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (i == 1) {
                if ((next instanceof TextView) && (text = ((TextView) next).getText()) != null && str.contentEquals(text)) {
                    return next;
                }
            } else if (i == 2 && next != null && str.contentEquals(next.getContentDescription())) {
                return next;
            }
        }
        return null;
    }

    public static void a(Context context, ImageView imageView, String str) {
        Object[] objArr = {context, imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28fedc4b18778bcbf267fd3e9c45a04a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28fedc4b18778bcbf267fd3e9c45a04a");
        } else {
            a(context, imageView, str, null);
        }
    }

    public static void a(Context context, ImageView imageView, String str, b.c cVar) {
        Object[] objArr = {context, imageView, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39722d7f7377e33128868cd5634b1453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39722d7f7377e33128868cd5634b1453");
        } else if (context == null || imageView == null || TextUtils.isEmpty(str)) {
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = context;
            a2.c = str;
            b.C0608b b = a2.a((View) imageView).b(imageView.getWidth(), imageView.getHeight());
            b.h = cVar;
            b.a(imageView);
        }
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Object[] objArr = {view, onGlobalLayoutListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed9a2a5879b5b552a39d90553dd60e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed9a2a5879b5b552a39d90553dd60e31");
        } else {
            a(view, onGlobalLayoutListener, false);
        }
    }

    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, boolean z) {
        Object[] objArr = {view, onGlobalLayoutListener, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be5f3b1114fa1d993cf684e8592bc6fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be5f3b1114fa1d993cf684e8592bc6fd");
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            b.a("[removeOrAddOnGlobalLayoutListener] isAdd:" + z + ",view: " + view + ",viewTreeObserver:" + viewTreeObserver);
            if (viewTreeObserver != null) {
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                } else {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
        }
    }

    public static boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f75b65883ce5f2622d114aeb126bf95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f75b65883ce5f2622d114aeb126bf95")).booleanValue();
        }
        if (view == null || view.getHeight() <= 0) {
            e.a("guide_pop_high_GuideViewHelper", "[isInScreen] view == null || view.getHeight() <= 0");
            return false;
        } else if (!view.isAttachedToWindow()) {
            e.a("guide_pop_high_GuideViewHelper", "[isInScreen] view isAttachedToWindow = false");
            return false;
        } else if (!view.isShown()) {
            e.a("guide_pop_high_GuideViewHelper", "[isInScreen] view isShown = false");
            return false;
        } else if (ah.b(view)) {
            return true;
        } else {
            e.a("guide_pop_high_GuideViewHelper", "[isInScreen] view ViewUtils.inScreen = false");
            return false;
        }
    }

    public static Point b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ecb54d99eb7715ede83ec3b9260a0f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ecb54d99eb7715ede83ec3b9260a0f5");
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Point point = new Point();
        point.x = iArr[0];
        point.y = iArr[1];
        return point;
    }

    public static boolean c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9733ccb0ec023b68096c345abdad866d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9733ccb0ec023b68096c345abdad866d")).booleanValue();
        }
        if (view == null || !view.isShown() || view.getAlpha() == 0.0f) {
            return false;
        }
        if (!((view.getParent() instanceof View) && ((View) view.getParent()).getAlpha() == 0.0f) && b(view).y >= 0) {
            return view.getLocalVisibleRect(new Rect());
        }
        return false;
    }
}
