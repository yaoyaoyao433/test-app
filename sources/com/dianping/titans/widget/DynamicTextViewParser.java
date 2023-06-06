package com.dianping.titans.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DynamicTextViewParser extends DynamicTitleParser.AbsElementParser<TextView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.widget.DynamicTitleParser.AbsElementParser
    public TextView getViewWithBaseStyle(Context context, TextView textView, DynamicTitleParser.BaseStyle baseStyle, DynamicTitleParser.ResourceProvider resourceProvider) {
        Object[] objArr = {context, textView, baseStyle, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d43e1fd611bba8c6f07900bd98385f", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d43e1fd611bba8c6f07900bd98385f");
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
            if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(str)) {
                paint.setTextSkewX(-0.5f);
            } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str)) {
                paint.setFakeBoldText(true);
            } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE.equals(str)) {
                paint.setUnderlineText(true);
            } else if (!DynamicTitleParser.PARSER_VAL_FONT_STYLE_OVER_LINE.equals(str) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH.equals(str)) {
                paint.setStrikeThruText(true);
            }
        }
        return textView;
    }

    @Override // com.dianping.titans.widget.DynamicTitleParser.AbsElementParser
    public void setupUniqueStyle(TextView textView, JSONObject jSONObject, DynamicTitleParser.ResourceProvider resourceProvider) {
        Object[] objArr = {textView, jSONObject, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62fe87cd9d4ef7c3dc67b7c9e583f660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62fe87cd9d4ef7c3dc67b7c9e583f660");
            return;
        }
        String optString = jSONObject.optString(TextAlign.LOWER_CASE_NAME);
        if ("left".equals(optString)) {
            textView.setGravity(8388627);
        } else if ("right".equals(optString)) {
            textView.setGravity(8388629);
        } else {
            textView.setGravity(17);
        }
    }
}
