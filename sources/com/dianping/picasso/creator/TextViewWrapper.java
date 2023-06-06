package com.dianping.picasso.creator;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.widget.TextViewCompat;
import android.view.View;
import android.widget.TextView;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoTextUtils;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.TextModel;
import com.dianping.picasso.model.params.TextViewParams;
import com.dianping.picasso.view.PicassoTextView;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.command.CommandViewInterface;
import com.dianping.picasso.view.command.TextViewCommandModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TextViewWrapper extends BaseViewWrapper<PicassoTextView, TextModel> implements CommandViewInterface {
    private static int AUTO_SIZE_MAX_TEXT_SIZE = 100;
    private static int AUTO_SIZE_MIN_TEXT_SIZE = 1;
    private static int AUTO_SIZE_STEP_GRANULARITY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoTextView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa075678446e9e68e2f93ce73e485a32", RobustBitConfig.DEFAULT_VALUE) ? (PicassoTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa075678446e9e68e2f93ce73e485a32") : new PicassoTextView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    @TargetApi(16)
    public void updateView(PicassoTextView picassoTextView, PicassoView picassoView, TextModel textModel, TextModel textModel2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        Object[] objArr = {picassoTextView, picassoView, textModel, textModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eff40bc12fe4762bf282ea43302cf099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eff40bc12fe4762bf282ea43302cf099");
            return;
        }
        TextViewParams textViewParams = (TextViewParams) textModel.getViewParams();
        TextViewParams textViewParams2 = textModel2 == null ? null : (TextViewParams) textModel2.getViewParams();
        if (textViewParams2 == null || textModel2.adjustsFitWidth != textModel.adjustsFitWidth || textViewParams2.isJsonText != textViewParams.isJsonText) {
            if (textModel.adjustsFitWidth && !textModel.needSizeToFit && !textViewParams.isJsonText && textModel.width > 0.0f && textModel.height > 0.0f && textModel.numberOfLines == 1) {
                TextViewCompat.setAutoSizeTextTypeWithDefaults(picassoTextView, 1);
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(picassoTextView, AUTO_SIZE_MIN_TEXT_SIZE, AUTO_SIZE_MAX_TEXT_SIZE, AUTO_SIZE_STEP_GRANULARITY, 2);
            } else {
                TextViewCompat.setAutoSizeTextTypeWithDefaults(picassoTextView, 0);
            }
        }
        if (textViewParams2 == null || textViewParams2.textSize != textViewParams.textSize || textModel2.adjustsFitWidth != textModel.adjustsFitWidth || textViewParams2.isJsonText != textViewParams.isJsonText) {
            picassoTextView.setTextSize(1, textViewParams.textSize);
        }
        if (picassoTextView.getShadowColor() != textViewParams.textShadowColor || picassoTextView.getShadowDx() != textViewParams.textShadowOffsetX || picassoTextView.getShadowDy() != textViewParams.textShadowOffsetY || picassoTextView.getShadowRadius() != textViewParams.textShadowRadius) {
            picassoTextView.setShadowLayer(textViewParams.textShadowRadius, textViewParams.textShadowOffsetX, textViewParams.textShadowOffsetY, textViewParams.textShadowColor);
        }
        picassoTextView.getPaint().setStrikeThruText(textModel.strikethrough);
        picassoTextView.getPaint().setUnderlineText(textModel.underline);
        picassoTextView.setGravity(textViewParams.textAlignment);
        if (textViewParams == null || (textViewParams.padding == 0 && textViewParams.paddingLeft == 0 && textViewParams.paddingRight == 0 && textViewParams.paddingTop == 0 && textViewParams.paddingBottom == 0)) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else if (textViewParams.paddingLeft == 0 && textViewParams.paddingRight == 0 && textViewParams.paddingTop == 0 && textViewParams.paddingBottom == 0) {
            i4 = textViewParams.padding;
            i = i4;
            i2 = i;
            i3 = i2;
        } else {
            i4 = textViewParams.paddingLeft;
            i = textViewParams.paddingRight;
            i2 = textViewParams.paddingTop;
            i3 = textViewParams.paddingBottom;
        }
        picassoTextView.setPadding(i4, i2, i, i3);
        picassoTextView.setEllipsize(textViewParams.lineBreakMode.truncateAt);
        if (Build.VERSION.SDK_INT >= 23 && textViewParams.lineBreakMode.breakStrategy != -1) {
            picassoTextView.setBreakStrategy(textViewParams.lineBreakMode.breakStrategy);
        }
        picassoTextView.getPaint().setTypeface(textViewParams.textTypeface);
        if (Build.VERSION.SDK_INT >= 23) {
            picassoTextView.setOriginalLineSpacing(textViewParams.lineSpacing, 1.0f);
        }
        if (picassoTextView.getMaxLines() != textModel.numberOfLines) {
            setMaxLine(picassoTextView, textModel.numberOfLines);
        }
        if (textViewParams2 == null || !textViewParams.textStringBuilder.equals(textViewParams2.textStringBuilder) || textViewParams.textUpdateListenerRef.get() != picassoTextView) {
            PicassoTextUtils.bindNewUpdateListener(textViewParams, picassoTextView);
            picassoTextView.setSpannableString(textViewParams.textStringBuilder);
        }
        picassoTextView.setTextIsSelectable(textModel.canShowQuickMenu);
        if (PicassoUtils.isValidColor(textModel.textColor)) {
            if (textViewParams2 == null || textViewParams.labelColor != textViewParams2.labelColor) {
                picassoTextView.setTextColor(textViewParams.labelColor);
            }
        } else if (PicassoUtils.isValidColor(textViewParams.startColor) && PicassoUtils.isValidColor(textViewParams.endColor)) {
            picassoTextView.setTextColor(textViewParams.startColor, textViewParams.endColor, textViewParams.orientation, textViewParams.width, textViewParams.height);
        } else {
            picassoTextView.setTextColor(-16777216);
        }
    }

    private void setMaxLine(TextView textView, int i) {
        Object[] objArr = {textView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16732b914b3cd7789603ae5692af85ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16732b914b3cd7789603ae5692af85ca");
        } else if (i <= 1) {
            textView.setSingleLine(true);
            textView.setHorizontallyScrolling(false);
        } else {
            textView.setSingleLine(false);
            textView.setMaxLines(i);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<TextModel> getDecodingFactory() {
        return TextModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public DecodingFactory getCommandViewDecodingFactory() {
        return TextViewCommandModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0abcc8f814a26323fddf1a07baab391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0abcc8f814a26323fddf1a07baab391");
            return;
        }
        super.handleCommandView(view, baseViewCommandModel, picassoModel);
        if ((baseViewCommandModel instanceof TextViewCommandModel) && (picassoModel instanceof TextModel)) {
            TextViewCommandModel textViewCommandModel = (TextViewCommandModel) baseViewCommandModel;
            TextModel textModel = (TextModel) picassoModel;
            if (textViewCommandModel.text != null) {
                textModel.text = textViewCommandModel.text;
            }
            if (textViewCommandModel.textSize != null) {
                textModel.textSize = textViewCommandModel.textSize.floatValue();
            }
            if (PicassoUtils.isValidColor(textViewCommandModel.textColor)) {
                textModel.textColor = textViewCommandModel.textColor;
            }
            textModel.switchModel();
            if (view instanceof PicassoTextView) {
                if (textViewCommandModel.text != null) {
                    ((PicassoTextView) view).setSpannableString(((TextViewParams) textModel.getViewParams()).textStringBuilder);
                }
                if (textViewCommandModel.textSize != null) {
                    ((PicassoTextView) view).setTextSize(1, textViewCommandModel.textSize.floatValue());
                }
                if (textViewCommandModel.textColor != null) {
                    ((PicassoTextView) view).setTextColor(Color.parseColor(textViewCommandModel.textColor));
                }
            }
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(PicassoTextView picassoTextView, TextModel textModel, String str) {
        Object[] objArr = {picassoTextView, textModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f121593f4fe1c88cc79b03f883b699d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f121593f4fe1c88cc79b03f883b699d")).booleanValue();
        }
        if (bindClickAction(picassoTextView, textModel, str)) {
            return true;
        }
        return super.bindAction((TextViewWrapper) picassoTextView, (PicassoTextView) textModel, str);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoTextView picassoTextView, TextModel textModel) {
        Object[] objArr = {picassoTextView, textModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c1da6f6cf6b79a9d241a4710f4e3274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c1da6f6cf6b79a9d241a4710f4e3274");
            return;
        }
        picassoTextView.setLongClickable(false);
        picassoTextView.setClickable(false);
    }
}
