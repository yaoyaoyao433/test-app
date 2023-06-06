package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static int a(@Nullable String str) {
        int c = str != null ? c(str) : -1;
        if (c >= 500 || DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str)) {
            return 1;
        }
        return ("normal".equals(str) || (c != -1 && c < 500)) ? 0 : -1;
    }

    public static int b(@Nullable String str) {
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static String a(@Nullable ReadableArray readableArray) {
        char c;
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
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((style & 2) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = f.a().a(str, i3, i2, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        return typeface != null ? typeface : Typeface.defaultFromStyle(i3);
    }

    private static int c(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }
}
