package com.facebook.react.views.image;

import android.widget.ImageView;
import com.dianping.titans.widget.DynamicTitleParser;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ImageView.ScaleType a(@Nullable String str) {
        if ("contain".equals(str)) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (DynamicTitleParser.PARSER_VAL_STRETCH_COVER.equals(str)) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (DynamicTitleParser.PARSER_KEY_STRETCH.equals(str)) {
            return ImageView.ScaleType.FIT_XY;
        }
        if ("center".equals(str)) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static ImageView.ScaleType a() {
        return ImageView.ScaleType.CENTER_CROP;
    }
}
