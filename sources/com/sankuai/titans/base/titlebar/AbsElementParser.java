package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.titlebar.DynamicTitleParser;
import com.sankuai.titans.base.utils.UIKit;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsElementParser<T extends View> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract T getViewWithBaseStyle(Context context, T t, BaseStyle baseStyle, DynamicTitleParser.ResourceProvider resourceProvider);

    public abstract void setupUniqueStyle(T t, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, DynamicTitleParser.ResourceProvider resourceProvider);

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<View, LineTitleLayoutParams> parse(Context context, T t, BaseStyle baseStyle, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, DynamicTitleParser.ResourceProvider resourceProvider) {
        int i;
        View view;
        Object[] objArr = {context, t, baseStyle, dynamicTitleBarElementEntity, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e1e166ea9009368c43d59eea0ff55a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e1e166ea9009368c43d59eea0ff55a");
        }
        LineTitleLayoutParams fillBaseStyleAndGetElementAttr = fillBaseStyleAndGetElementAttr(context, baseStyle, dynamicTitleBarElementEntity);
        if (fillBaseStyleAndGetElementAttr == null) {
            return null;
        }
        ViewGroup viewGroup = t instanceof ViewGroup ? (ViewGroup) t : null;
        if (viewGroup != null) {
            i = 0;
            view = viewGroup.getChildAt(0);
        } else {
            i = 0;
            view = t;
        }
        DynamicTitleBarElementEntity sup = dynamicTitleBarElementEntity.getSup();
        if (sup != null && sup.getContent() != null && viewGroup == null && view != null && view.getParent() != null) {
            view.setBackgroundColor(i);
            view.setBackground(null);
            view.setPadding(i, i, i, i);
            ((ViewGroup) view.getParent()).removeView(view);
        }
        View viewWithBaseStyle = getViewWithBaseStyle(context, view, baseStyle, resourceProvider);
        if (viewWithBaseStyle == null) {
            return null;
        }
        View makeSupView = makeSupView(context, viewGroup, viewWithBaseStyle, dynamicTitleBarElementEntity.getSup());
        if (baseStyle.backgroundColor != -1) {
            viewWithBaseStyle.setBackgroundColor(baseStyle.backgroundColor);
        } else if (!TextUtils.isEmpty(baseStyle.backgroundImg)) {
            DynamicTitleParser.setBackgroundImage(viewWithBaseStyle, resourceProvider, baseStyle.backgroundImg);
        }
        makeSupView.setPadding(baseStyle.paddingLeft, baseStyle.paddingTop, baseStyle.paddingRight, baseStyle.paddingBottom);
        setupUniqueStyle(viewWithBaseStyle, dynamicTitleBarElementEntity, resourceProvider);
        return Pair.create(makeSupView, fillBaseStyleAndGetElementAttr);
    }

    private View makeSupView(Context context, final View view, final View view2, DynamicTitleBarElementEntity dynamicTitleBarElementEntity) {
        int textSize;
        Object[] objArr = {context, view, view2, dynamicTitleBarElementEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a94f8d46c4fd960c8a53eb8d44b455d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a94f8d46c4fd960c8a53eb8d44b455d4");
        }
        if (dynamicTitleBarElementEntity == null || dynamicTitleBarElementEntity.getContent() == null) {
            return view2;
        }
        String content = dynamicTitleBarElementEntity.getContent();
        FrameLayout frameLayout = view != null ? (FrameLayout) view : (FrameLayout) LayoutInflater.from(context).inflate(R.layout.titans_protocol_badge, (ViewGroup) null);
        final TextView textView = (TextView) frameLayout.findViewById(R.id.titans_badge_content);
        int rGBAColor = UIKit.getRGBAColor(dynamicTitleBarElementEntity.getBackgroundColor(), SupportMenu.CATEGORY_MASK);
        int fontSize = dynamicTitleBarElementEntity.getFontSize();
        if (fontSize != -1) {
            textSize = UIKit.dip2px(context, fontSize);
            textView.setTextSize(0, textSize);
        } else {
            textSize = (int) textView.getTextSize();
        }
        if (content.length() > 1) {
            int dip2px = UIKit.dip2px(context, 2.0f);
            textView.setPadding(dip2px, 0, dip2px, 0);
        }
        int dip2px2 = textSize + UIKit.dip2px(context, 2.0f);
        textView.setMinWidth(dip2px2);
        if (view == null) {
            textView.setVisibility(8);
        }
        textView.post(new Runnable() { // from class: com.sankuai.titans.base.titlebar.AbsElementParser.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "494437eb1dff02bbe958bddd5e748b3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "494437eb1dff02bbe958bddd5e748b3b");
                    return;
                }
                textView.setMaxWidth(view2.getWidth());
                if (view == null) {
                    textView.setVisibility(0);
                }
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dip2px2 / 2);
        gradientDrawable.setColor(rGBAColor);
        textView.setBackgroundDrawable(gradientDrawable);
        textView.setTextColor(UIKit.getRGBAColor(dynamicTitleBarElementEntity.getFontColor(), -1));
        textView.setText(content);
        if (view == null) {
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            frameLayout.addView(view2, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        return frameLayout;
    }

    private static LineTitleLayoutParams fillBaseStyleAndGetElementAttr(Context context, BaseStyle baseStyle, DynamicTitleBarElementEntity dynamicTitleBarElementEntity) {
        Object[] objArr = {context, baseStyle, dynamicTitleBarElementEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b78e961cae837ed68c8ff44cf7dfb9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayoutParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b78e961cae837ed68c8ff44cf7dfb9b");
        }
        String name = dynamicTitleBarElementEntity.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        int fontSize = dynamicTitleBarElementEntity.getFontSize();
        if (fontSize != -1) {
            baseStyle.fontSize = UIKit.dip2px(context, fontSize);
        }
        baseStyle.fontColor = UIKit.getRGBAColor(dynamicTitleBarElementEntity.getFontColor(), -14540254);
        String[] fontStyle = dynamicTitleBarElementEntity.getFontStyle();
        if (fontStyle != null) {
            baseStyle.fontStyle = fontStyle;
        }
        String stretch = dynamicTitleBarElementEntity.getStretch();
        if (stretch == null) {
            stretch = baseStyle.stretch;
        }
        baseStyle.stretch = stretch;
        baseStyle.backgroundColor = UIKit.getRGBAColor(dynamicTitleBarElementEntity.getBackgroundColor(), -1);
        String backgroundImage = dynamicTitleBarElementEntity.getBackgroundImage();
        if (backgroundImage == null) {
            backgroundImage = baseStyle.backgroundImg;
        }
        baseStyle.backgroundImg = backgroundImage;
        int paddingLeft = dynamicTitleBarElementEntity.getPaddingLeft();
        if (paddingLeft != 0) {
            baseStyle.paddingLeft = UIKit.dip2px(context, paddingLeft);
        }
        int paddingTop = dynamicTitleBarElementEntity.getPaddingTop();
        if (paddingTop != 0) {
            baseStyle.paddingTop = UIKit.dip2px(context, paddingTop);
        }
        int paddingRight = dynamicTitleBarElementEntity.getPaddingRight();
        if (paddingRight != 0) {
            baseStyle.paddingRight = UIKit.dip2px(context, paddingRight);
        }
        int paddingBottom = dynamicTitleBarElementEntity.getPaddingBottom();
        if (paddingBottom != 0) {
            baseStyle.paddingBottom = UIKit.dip2px(context, paddingBottom);
        }
        baseStyle.content = dynamicTitleBarElementEntity.getContent();
        LineTitleLayoutParams lineTitleLayoutParams = new LineTitleLayoutParams(-2, baseStyle.height);
        lineTitleLayoutParams.action = dynamicTitleBarElementEntity.getAction();
        boolean isPrimary = dynamicTitleBarElementEntity.isPrimary();
        lineTitleLayoutParams.primary = isPrimary;
        if (isPrimary) {
            lineTitleLayoutParams.primaryFillRest = true;
        }
        lineTitleLayoutParams.name = name;
        double width = dynamicTitleBarElementEntity.getWidth();
        double d = 0.0d;
        if (width >= 0.0d) {
            if (width > 1.0d) {
                lineTitleLayoutParams.width = UIKit.dip2px(context, (float) width);
            } else {
                d = width;
            }
        }
        lineTitleLayoutParams.widthPercent = d;
        return lineTitleLayoutParams;
    }
}
