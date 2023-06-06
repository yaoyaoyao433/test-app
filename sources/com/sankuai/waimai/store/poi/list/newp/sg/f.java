package com.sankuai.waimai.store.poi.list.newp.sg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.j;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    @Nullable
    public static View a(@NonNull ViewGroup viewGroup, String str, @NonNull Context context, Map<String, Object> map, boolean z, int i, com.sankuai.waimai.store.param.a aVar, View view) {
        int a2;
        Object[] objArr = {viewGroup, str, context, map, (byte) 0, Integer.valueOf(i), aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fcaf162ea4a5d50c4919fb3d34633eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fcaf162ea4a5d50c4919fb3d34633eb");
        }
        if (!t.a(str) && map != null && (a2 = a(str, context, map, i, aVar)) > 0) {
            view.setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.height = a2;
            view.setLayoutParams(marginLayoutParams);
        }
        return null;
    }

    private static int a(String str, @NonNull Context context, Map<String, Object> map, int i, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {str, context, map, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66ed1ee723efef7dab3a70fe3c27a3d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66ed1ee723efef7dab3a70fe3c27a3d8")).intValue();
        }
        Map map2 = (Map) j.h().a("home_optimize/sg_home_tile_mach_templateid_height", new TypeToken<Map<String, Integer>>() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.f.1
        }.getType());
        Integer num = map2 != null ? (Integer) map2.get(str) : null;
        if (i > 0) {
            if ("supermarket-search-down-searchtext".equals(str)) {
                Object obj = map.get("search_keyword");
                if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0) {
                    return h.a(context, i);
                }
            } else {
                return h.a(context, i);
            }
        } else if (num != null && num.intValue() > 0) {
            if ("supermarket-search-down-searchtext".equals(str)) {
                Object obj2 = map.get("search_keyword");
                if ((obj2 instanceof ArrayList) && ((ArrayList) obj2).size() > 0) {
                    return h.a(context, num.intValue());
                }
            } else {
                return h.a(context, num.intValue());
            }
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -2026246414:
                    if (str.equals("mach_waimai-ad-platinum-image-text-template-waist-planA_lingshou")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -951149272:
                    if (str.equals("supermarket-home-banner-style")) {
                        c = 2;
                        break;
                    }
                    break;
                case -772746588:
                    if (str.equals("supermarket-poi-acrossbanner")) {
                        c = 1;
                        break;
                    }
                    break;
                case -738602078:
                    if (str.equals("mach_waimai-ad-lingshou-swiperbig-template")) {
                        c = 11;
                        break;
                    }
                    break;
                case -210758172:
                    if (str.equals("supermarket-mk-new-user-region-ABC-v2")) {
                        c = 5;
                        break;
                    }
                    break;
                case -210758171:
                    if (str.equals("supermarket-mk-new-user-region-ABC-v3")) {
                        c = 6;
                        break;
                    }
                    break;
                case -169158147:
                    if (str.equals("mach_waimai-ad-lingshou-template-supermarketka")) {
                        c = 7;
                        break;
                    }
                    break;
                case -159687380:
                    if (str.equals("mach_waimai-ad-lingshou-template-planE")) {
                        c = 17;
                        break;
                    }
                    break;
                case 134994385:
                    if (str.equals("supermarket-search-down-searchtext")) {
                        c = 0;
                        break;
                    }
                    break;
                case 144760192:
                    if (str.equals("supermarket-home-scroll-kingkong-style")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1109889205:
                    if (str.equals("mach_waimai-ad-lingshou-cpm-customization-swiper-big")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1287890208:
                    if (str.equals("mach_waimai-ad-lingshou-swipersmallDrinks-template")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1460875147:
                    if (str.equals("mach_waimai-ad-lingshou-cpm-customization-swiper-light")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1648654355:
                    if (str.equals("mach_waimai-ad-lingshou-original-template")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1856405668:
                    if (str.equals("supermarket-channel-goods-guide-v2")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1866236091:
                    if (str.equals("mach_waimai-ad-lingshou-swipersmall-template")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1938507818:
                    if (str.equals("mach_waimai-ad-lingshou-waist-template")) {
                        c = 14;
                        break;
                    }
                    break;
                case 2022321941:
                    if (str.equals("waimai_ad_fe_mach_supermarket_recommend_lingshou")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Object obj3 = map.get("search_keyword");
                    if ((obj3 instanceof ArrayList) && ((ArrayList) obj3).size() > 0) {
                        return h.a(context, 32.0f);
                    }
                    break;
                case 1:
                    return (int) (h.a(context) / 3.75d);
                case 2:
                    if (aVar != null && aVar.aX) {
                        return h.a(context, ((h.b(context, h.a(context)) - 24) * 109) / 351);
                    }
                    return h.a(context, 90.0f);
                case 3:
                    return h.a(context, 191.0f);
                case 4:
                    return h.a(context, 152.0f);
                case 5:
                    return h.a(context, 111.0f);
                case 6:
                    return h.a(context, 143.0f);
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                    return h.a(context, 240.0f);
                case '\f':
                    return h.a(context, 266.0f);
                case '\r':
                case 14:
                    return h.a(context, 175.0f);
                case 15:
                case 16:
                    return h.a(context, 230.0f);
                case 17:
                    return h.a(context, 245.0f);
                default:
                    return h.a(context, 100.0f);
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r25.equals("supermarket-poi-acrossbanner") != false) goto L17;
     */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(@android.support.annotation.NonNull android.view.ViewGroup r24, java.lang.String r25, @android.support.annotation.NonNull android.content.Context r26, java.util.Map<java.lang.String, java.lang.Object> r27, boolean r28, int r29, com.sankuai.waimai.store.param.a r30, android.widget.FrameLayout r31) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.newp.sg.f.a(android.view.ViewGroup, java.lang.String, android.content.Context, java.util.Map, boolean, int, com.sankuai.waimai.store.param.a, android.widget.FrameLayout):void");
    }

    private static void a(FrameLayout frameLayout, int i, int i2) {
        Object[] objArr = {frameLayout, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "777e35ff306cb820de20ee46ad8f0315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "777e35ff306cb820de20ee46ad8f0315");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i2;
        frameLayout.setLayoutParams(layoutParams);
    }

    private static void a(@NonNull Context context, FrameLayout frameLayout, int i) {
        Object[] objArr = {context, frameLayout, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e64753b0d7203cf58ec87b86c402a4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e64753b0d7203cf58ec87b86c402a4f");
        } else if (frameLayout == null) {
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
            imageView.setImageResource(R.drawable.sg_banner_default_bg);
            frameLayout.addView(imageView);
            TextView textView = new TextView(context);
            textView.setText("外卖");
            textView.setTextSize(2, 1.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = 20;
            layoutParams.leftMargin = 30;
            textView.setLayoutParams(layoutParams);
            frameLayout.addView(textView);
            TextView textView2 = new TextView(context);
            textView2.setText("外卖");
            textView2.setTextSize(2, 1.0f);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 5;
            layoutParams2.rightMargin = 30;
            layoutParams2.topMargin = 20;
            textView2.setLayoutParams(layoutParams2);
            frameLayout.addView(textView2);
        }
    }
}
