package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.titlebar.DynamicTitleParser;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DynamicTextViewParser extends AbsElementParser<TextView> {
    private static final String PARSER_VAL_FONT_STYLE_BOLD = "bold";
    private static final String PARSER_VAL_FONT_STYLE_ITALIC = "italic";
    private static final String PARSER_VAL_FONT_STYLE_LINE_THROUGH = "line-through";
    private static final String PARSER_VAL_FONT_STYLE_OVER_LINE = "overline";
    private static final String PARSER_VAL_FONT_STYLE_UNDERLINE = "underline";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.base.titlebar.AbsElementParser
    public TextView getViewWithBaseStyle(Context context, TextView textView, BaseStyle baseStyle, DynamicTitleParser.ResourceProvider resourceProvider) {
        Object[] objArr = {context, textView, baseStyle, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4dc7066f0af878f9a25b7349a871a90", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4dc7066f0af878f9a25b7349a871a90");
        }
        if (textView == null) {
            textView = new TextView(context);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(baseStyle.content);
        int i = baseStyle.fontColor;
        if (i != -1) {
            textView.setTextColor(i);
        }
        int i2 = baseStyle.fontSize;
        if (i2 != -1) {
            textView.setTextSize(0, i2);
        }
        String[] strArr = baseStyle.fontStyle;
        TextPaint paint = textView.getPaint();
        int length = strArr == null ? 0 : strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr[i3];
            if ("italic".equals(str)) {
                paint.setTextSkewX(-0.5f);
            } else if ("bold".equals(str)) {
                paint.setFakeBoldText(true);
            } else if ("underline".equals(str)) {
                paint.setUnderlineText(true);
            } else if (!"overline".equals(str) && "line-through".equals(str)) {
                paint.setStrikeThruText(true);
            }
        }
        return textView;
    }

    @Override // com.sankuai.titans.base.titlebar.AbsElementParser
    public void setupUniqueStyle(TextView textView, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, DynamicTitleParser.ResourceProvider resourceProvider) {
        Object[] objArr = {textView, dynamicTitleBarElementEntity, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25a912924a41b8378c07e918aaa5b38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25a912924a41b8378c07e918aaa5b38");
            return;
        }
        String textAlign = dynamicTitleBarElementEntity.getTextAlign();
        if ("left".equals(textAlign)) {
            textView.setGravity(8388627);
        } else if ("right".equals(textAlign)) {
            textView.setGravity(8388629);
        } else {
            textView.setGravity(17);
        }
    }
}
