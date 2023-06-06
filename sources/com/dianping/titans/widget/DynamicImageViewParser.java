package com.dianping.titans.widget;

import android.content.Context;
import android.widget.ImageView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DynamicImageViewParser extends DynamicTitleParser.AbsElementParser<ImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.widget.DynamicTitleParser.AbsElementParser
    public void setupUniqueStyle(ImageView imageView, JSONObject jSONObject, DynamicTitleParser.ResourceProvider resourceProvider) {
    }

    @Override // com.dianping.titans.widget.DynamicTitleParser.AbsElementParser
    public ImageView getViewWithBaseStyle(Context context, ImageView imageView, DynamicTitleParser.BaseStyle baseStyle, DynamicTitleParser.ResourceProvider resourceProvider) {
        Object[] objArr = {context, imageView, baseStyle, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afcafe9dd9ad4b4c160ed081459e3a75", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afcafe9dd9ad4b4c160ed081459e3a75");
        }
        if (imageView == null) {
            imageView = new ImageView(context);
        }
        String str = baseStyle.stretch;
        if (DynamicTitleParser.PARSER_VAL_STRETCH_COVER.equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_END);
        } else if ("basic".equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        DynamicTitleParser.setImageSrc(imageView, resourceProvider, baseStyle.content);
        return imageView;
    }
}
