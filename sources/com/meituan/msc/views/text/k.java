package com.meituan.msc.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static int a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3ea9326e7ba0565eefd2e359bd357e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3ea9326e7ba0565eefd2e359bd357e1")).intValue();
        }
        int c = str != null ? c(str) : -1;
        if (c >= 500 || DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str)) {
            return 1;
        }
        return ("normal".equals(str) || (c != -1 && c < 500)) ? 0 : -1;
    }

    public static int b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8af177ae7a8156019f2850fa6b66f9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8af177ae7a8156019f2850fa6b66f9e")).intValue();
        }
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static String a(@Nullable ReadableArray readableArray) {
        char c;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a62ffb96b7d12c065021e59d92d2d67", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a62ffb96b7d12c065021e59d92d2d67");
        }
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                switch (string.hashCode()) {
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        arrayList.add("'smcp'");
                        continue;
                    case 1:
                        arrayList.add("'onum'");
                        continue;
                    case 2:
                        arrayList.add("'lnum'");
                        continue;
                    case 3:
                        arrayList.add("'tnum'");
                        continue;
                    case 4:
                        arrayList.add("'pnum'");
                        continue;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    public static Typeface a(@Nullable Typeface typeface, int i, int i2, @Nullable String str, AssetManager assetManager) {
        int i3;
        Typeface typeface2 = typeface;
        int i4 = 1;
        Object[] objArr = {typeface2, Integer.valueOf(i), Integer.valueOf(i2), str, assetManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "171a85a64b2b3117bc44092908d18ebf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "171a85a64b2b3117bc44092908d18ebf");
        }
        int style = typeface2 == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 2;
        } else {
            i3 = 2;
            i4 = 0;
        }
        if (i == i3 || ((i3 & style) != 0 && i == -1)) {
            i4 |= 2;
        }
        if (str != null) {
            typeface2 = f.a().a(str, i4, i2, assetManager);
        } else if (typeface2 != null) {
            typeface2 = Typeface.create(typeface2, i4);
        }
        return typeface2 != null ? typeface2 : Typeface.defaultFromStyle(i4);
    }

    private static int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d845a94ce1c3bbd078c886ddb52e976", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d845a94ce1c3bbd078c886ddb52e976")).intValue();
        }
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }
}
