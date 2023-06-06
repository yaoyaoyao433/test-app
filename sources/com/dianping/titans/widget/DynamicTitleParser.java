package com.dianping.titans.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.utils.ViewUtils;
import com.dianping.titans.widget.LineTitleLayout;
import com.dianping.titans.widget.ZIndexFrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.util.ImageUtils;
import com.sankuai.meituan.android.knb.util.WebUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class DynamicTitleParser {
    public static final String PARSER_KEY_BACKGROUND_COLOR = "backgroundColor";
    public static final String PARSER_KEY_BACKGROUND_IMAGE = "backgroundImage";
    public static final String PARSER_KEY_BORDER_COLOR = "borderColor";
    public static final String PARSER_KEY_BORDER_WIDTH = "borderWidth";
    public static final String PARSER_KEY_ELEMENTS = "elements";
    public static final String PARSER_KEY_ELEMENT_ACTION = "action";
    public static final String PARSER_KEY_ELEMENT_CONTENT = "content";
    public static final String PARSER_KEY_ELEMENT_NAME = "name";
    public static final String PARSER_KEY_ELEMENT_PRIMARY = "primary";
    public static final String PARSER_KEY_ELEMENT_TYPE = "type";
    public static final String PARSER_KEY_ELEMENT_WIDTH_PERCENT = "width";
    public static final String PARSER_KEY_FONT_COLOR = "fontColor";
    public static final String PARSER_KEY_FONT_SIZE = "fontSize";
    public static final String PARSER_KEY_FONT_STYLE = "fontStyle";
    public static final String PARSER_KEY_HEIGHT = "height";
    public static final String PARSER_KEY_PADDING_BOTTOM = "paddingBottom";
    public static final String PARSER_KEY_PADDING_LEFT = "paddingLeft";
    public static final String PARSER_KEY_PADDING_RIGHT = "paddingRight";
    public static final String PARSER_KEY_PADDING_TOP = "paddingTop";
    public static final String PARSER_KEY_PRIMARY_GRAVITY = "primaryGravity";
    public static final String PARSER_KEY_STRETCH = "stretch";
    public static final String PARSER_KEY_Z_INDEX = "zIndex";
    public static final String PARSER_VAL_FONT_STYLE_BOLD = "bold";
    public static final String PARSER_VAL_FONT_STYLE_ITALIC = "italic";
    public static final String PARSER_VAL_FONT_STYLE_LINE_THROUGH = "line-through";
    public static final String PARSER_VAL_FONT_STYLE_OVER_LINE = "overline";
    public static final String PARSER_VAL_FONT_STYLE_UNDERLINE = "underline";
    public static final String PARSER_VAL_PRIMARY_GRAVITY_CENTER = "center";
    public static final String PARSER_VAL_PRIMARY_GRAVITY_END = "end";
    public static final String PARSER_VAL_PRIMARY_GRAVITY_START = "start";
    public static final String PARSER_VAL_STRETCH_BASIC = "basic";
    public static final String PARSER_VAL_STRETCH_COVER = "cover";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashMap<String, ElementParser> elementParserMap;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ElementParser<T extends View> {
        Pair<View, LineTitleLayout.LayoutParams> parse(Context context, T t, BaseStyle baseStyle, JSONObject jSONObject, ResourceProvider resourceProvider);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnlineCallback<T extends View> {
        void onLoad(T t, Bitmap bitmap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ResourceProvider {
        Drawable getDrawable(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class BaseStyle implements Cloneable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int backgroundColor;
        public String backgroundImg;
        public String content;
        public int fontColor;
        public int fontSize;
        public String[] fontStyle;
        public int height;
        public int paddingBottom;
        public int paddingLeft;
        public int paddingRight;
        public int paddingTop;
        public String stretch;

        public BaseStyle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8337c85cc989bf499784cb7cd6a47bd5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8337c85cc989bf499784cb7cd6a47bd5");
            } else {
                this.backgroundColor = -1;
            }
        }

        public Object clone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e8fba76d8d0a36d1f565ac84b270ec", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e8fba76d8d0a36d1f565ac84b270ec");
            }
            try {
                return super.clone();
            } catch (CloneNotSupportedException unused) {
                return new BaseStyle();
            }
        }
    }

    static {
        HashMap<String, ElementParser> hashMap = new HashMap<>();
        elementParserMap = hashMap;
        hashMap.put("text", new DynamicTextViewParser());
        elementParserMap.put("image", new DynamicImageViewParser());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class AbsElementParser<T extends View> implements ElementParser {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract T getViewWithBaseStyle(Context context, T t, BaseStyle baseStyle, ResourceProvider resourceProvider);

        public abstract void setupUniqueStyle(T t, JSONObject jSONObject, ResourceProvider resourceProvider);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.dianping.titans.widget.DynamicTitleParser.ElementParser
        public Pair<View, LineTitleLayout.LayoutParams> parse(Context context, View view, BaseStyle baseStyle, JSONObject jSONObject, ResourceProvider resourceProvider) {
            Object[] objArr = {context, view, baseStyle, jSONObject, resourceProvider};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb0a94729f4ef8010ce848186e3c08c", RobustBitConfig.DEFAULT_VALUE)) {
                return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb0a94729f4ef8010ce848186e3c08c");
            }
            LineTitleLayout.LayoutParams fillBaseStyleAndGetElementAttr = DynamicTitleParser.fillBaseStyleAndGetElementAttr(context, baseStyle, jSONObject);
            if (fillBaseStyleAndGetElementAttr == null) {
                return null;
            }
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : view;
            JSONObject optJSONObject = jSONObject.optJSONObject("sup");
            if (optJSONObject != null && !optJSONObject.isNull("content") && viewGroup == null && childAt != null && childAt.getParent() != null) {
                childAt.setBackgroundColor(0);
                childAt.setBackground(null);
                childAt.setPadding(0, 0, 0, 0);
                ((ViewGroup) childAt.getParent()).removeView(childAt);
            }
            View viewWithBaseStyle = getViewWithBaseStyle(context, childAt, baseStyle, resourceProvider);
            if (viewWithBaseStyle == null) {
                return null;
            }
            View makeSupView = makeSupView(context, viewGroup, viewWithBaseStyle, jSONObject);
            if (baseStyle.backgroundColor != -1) {
                viewWithBaseStyle.setBackgroundColor(baseStyle.backgroundColor);
            } else if (!TextUtils.isEmpty(baseStyle.backgroundImg)) {
                DynamicTitleParser.setBackgroundImage(viewWithBaseStyle, resourceProvider, baseStyle.backgroundImg);
            }
            makeSupView.setPadding(baseStyle.paddingLeft, baseStyle.paddingTop, baseStyle.paddingRight, baseStyle.paddingBottom);
            setupUniqueStyle(viewWithBaseStyle, jSONObject, resourceProvider);
            return Pair.create(makeSupView, fillBaseStyleAndGetElementAttr);
        }

        private View makeSupView(Context context, final View view, final View view2, JSONObject jSONObject) {
            int textSize;
            Object[] objArr = {context, view, view2, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8091fa6ad6fdb6b0c3ad6a9d33bc02e2", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8091fa6ad6fdb6b0c3ad6a9d33bc02e2");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("sup");
            if (optJSONObject == null || optJSONObject.isNull("content")) {
                return view2;
            }
            FrameLayout frameLayout = view != null ? (FrameLayout) view : (FrameLayout) LayoutInflater.from(context).inflate(R.layout.knb_badge, (ViewGroup) null);
            final TextView textView = (TextView) frameLayout.findViewById(R.id.titans_badge_content);
            int rGBAColor = WebUtil.getRGBAColor(optJSONObject.optString("backgroundColor"), SupportMenu.CATEGORY_MASK);
            int optInt = optJSONObject.optInt("fontSize", -1);
            if (optInt != -1) {
                textSize = ViewUtils.dip2px(context, optInt);
                textView.setTextSize(0, textSize);
            } else {
                textSize = (int) textView.getTextSize();
            }
            if (optJSONObject.optString("content").length() > 1) {
                int dip2px = ViewUtils.dip2px(context, 2.0f);
                textView.setPadding(dip2px, 0, dip2px, 0);
            }
            int dip2px2 = textSize + ViewUtils.dip2px(context, 2.0f);
            textView.setMinWidth(dip2px2);
            if (view == null) {
                textView.setVisibility(8);
            }
            textView.post(new Runnable() { // from class: com.dianping.titans.widget.DynamicTitleParser.AbsElementParser.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6ea0d72fe75673ffd3dd652ecd3a2933", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6ea0d72fe75673ffd3dd652ecd3a2933");
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
            textView.setTextColor(WebUtil.getRGBAColor(optJSONObject.optString(DynamicTitleParser.PARSER_KEY_FONT_COLOR), -1));
            textView.setText(optJSONObject.optString("content"));
            if (view == null) {
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                frameLayout.addView(view2, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            return frameLayout;
        }
    }

    public static ElementParser getElementParser(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9b2c6d102d4a6a6e7d3ce8a772259ae", RobustBitConfig.DEFAULT_VALUE) ? (ElementParser) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9b2c6d102d4a6a6e7d3ce8a772259ae") : elementParserMap.get(str);
    }

    public static boolean registerElementParser(String str, ElementParser elementParser) {
        Object[] objArr = {str, elementParser};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9678cef631677acbb9e0461790cfccd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9678cef631677acbb9e0461790cfccd")).booleanValue();
        }
        elementParserMap.put(str, elementParser);
        return true;
    }

    private static LineTitleLayout checkLineTitleLayout(Context context, LineTitleLayout lineTitleLayout, JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {context, lineTitleLayout, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5fad715ade9ae9bfd6f9d58e712083c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayout) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5fad715ade9ae9bfd6f9d58e712083c");
        }
        boolean z = lineTitleLayout == null;
        if (z) {
            lineTitleLayout = new LineTitleLayout(context);
        }
        if (z || (optJSONArray = jSONObject.optJSONArray(PARSER_KEY_ELEMENTS)) == null) {
            return lineTitleLayout;
        }
        if (lineTitleLayout.getChildCount() != optJSONArray.length()) {
            return new LineTitleLayout(context);
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                return new LineTitleLayout(context);
            }
            if (lineTitleLayout.getChildIndex(optJSONObject.optString("name")) == -1) {
                return new LineTitleLayout(context);
            }
        }
        return lineTitleLayout;
    }

    public static Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse(Context context, LineTitleLayout lineTitleLayout, JSONObject jSONObject, ResourceProvider resourceProvider) {
        int i;
        ElementParser elementParser;
        Object[] objArr = {context, lineTitleLayout, jSONObject, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "109592f9059caf73a0383c943546add3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "109592f9059caf73a0383c943546add3");
        }
        if (context == null || jSONObject == null) {
            return null;
        }
        LineTitleLayout checkLineTitleLayout = checkLineTitleLayout(context, lineTitleLayout, jSONObject);
        String optString = jSONObject.optString(PARSER_KEY_PRIMARY_GRAVITY);
        if (TextUtils.isEmpty(optString) || "start".equals(optString)) {
            i = 0;
            checkLineTitleLayout.setPrimaryGravity(0);
        } else {
            if ("center".equals(optString)) {
                checkLineTitleLayout.setPrimaryGravity(1);
            } else if ("end".equals(optString)) {
                checkLineTitleLayout.setPrimaryGravity(2);
            }
            i = 0;
        }
        int dip2px = ViewUtils.dip2px(context, jSONObject.optInt("height", 48));
        ZIndexFrameLayout.LayoutParams layoutParams = new ZIndexFrameLayout.LayoutParams(-2, dip2px);
        layoutParams.zIndex = jSONObject.optInt("zIndex", i);
        try {
            checkLineTitleLayout.setBorderDrawable(new ColorDrawable(WebUtil.getRGBAColor(jSONObject.optString("borderColor"))));
        } catch (Exception unused) {
        }
        checkLineTitleLayout.setBorderHeight(ViewUtils.dip2px(context, jSONObject.optInt("borderWidth", 0)));
        try {
            checkLineTitleLayout.setBackgroundColor(WebUtil.getRGBAColor(jSONObject.optString("backgroundColor")));
        } catch (Exception unused2) {
            String optString2 = jSONObject.optString(PARSER_KEY_BACKGROUND_IMAGE);
            if (!TextUtils.isEmpty(optString2)) {
                setBackgroundImage(checkLineTitleLayout, resourceProvider, optString2);
            }
        }
        BaseStyle baseStyle = new BaseStyle();
        baseStyle.height = dip2px;
        baseStyle.fontColor = WebUtil.getRGBAColor(jSONObject.optString(PARSER_KEY_FONT_COLOR), -14540254);
        baseStyle.stretch = jSONObject.optString(PARSER_KEY_STRETCH);
        int optInt = jSONObject.optInt("fontSize", -1);
        baseStyle.fontSize = optInt != -1 ? ViewUtils.dip2px(context, optInt) : -1;
        JSONArray optJSONArray = jSONObject.optJSONArray("fontStyle");
        String[] strArr = new String[optJSONArray == null ? 0 : optJSONArray.length()];
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = optJSONArray.optString(i2);
        }
        baseStyle.fontStyle = strArr;
        checkLineTitleLayout.setTag(R.id.dynamicBaseStyleTag, baseStyle);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(PARSER_KEY_ELEMENTS);
        int length2 = optJSONArray2 == null ? 0 : optJSONArray2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            JSONObject optJSONObject = optJSONArray2.optJSONObject(i3);
            if (optJSONObject != null && (elementParser = getElementParser(optJSONObject.optString("type"))) != null) {
                BaseStyle baseStyle2 = (BaseStyle) baseStyle.clone();
                int childIndex = checkLineTitleLayout.getChildIndex(optJSONObject.optString("name"));
                View childAt = checkLineTitleLayout.getChildAt(childIndex);
                Pair<View, LineTitleLayout.LayoutParams> parse = elementParser.parse(context, childAt, baseStyle2, optJSONObject, resourceProvider);
                if (parse != null && parse.first != null) {
                    if (childIndex >= 0) {
                        if (((View) parse.first).getParent() == null) {
                            checkLineTitleLayout.addView((View) parse.first, childIndex, (ViewGroup.LayoutParams) parse.second);
                        } else {
                            childAt.setLayoutParams((ViewGroup.LayoutParams) parse.second);
                        }
                    } else {
                        checkLineTitleLayout.addView((View) parse.first, (ViewGroup.LayoutParams) parse.second);
                    }
                }
            }
        }
        return Pair.create(checkLineTitleLayout, layoutParams);
    }

    public static Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse(Context context, JSONObject jSONObject, ResourceProvider resourceProvider) {
        Object[] objArr = {context, jSONObject, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a40fd78965c1e6a10962240592e26e30", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a40fd78965c1e6a10962240592e26e30");
        }
        if (context == null || jSONObject == null) {
            return null;
        }
        return parse(context, new LineTitleLayout(context), jSONObject, resourceProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LineTitleLayout.LayoutParams fillBaseStyleAndGetElementAttr(Context context, BaseStyle baseStyle, JSONObject jSONObject) {
        Object[] objArr = {context, baseStyle, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb6a318940a1ac3fe007f5ffe9a9a3bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayout.LayoutParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb6a318940a1ac3fe007f5ffe9a9a3bf");
        }
        String optString = jSONObject.optString("name");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        int optInt = jSONObject.optInt("fontSize", -1);
        if (optInt != -1) {
            baseStyle.fontSize = ViewUtils.dip2px(context, optInt);
        }
        baseStyle.fontColor = WebUtil.getRGBAColor(jSONObject.optString(PARSER_KEY_FONT_COLOR), -14540254);
        JSONArray optJSONArray = jSONObject.optJSONArray("fontStyle");
        if (optJSONArray != null) {
            String[] strArr = new String[optJSONArray.length()];
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                strArr[i] = optJSONArray.optString(i);
            }
            baseStyle.fontStyle = strArr;
        }
        baseStyle.stretch = jSONObject.optString(PARSER_KEY_STRETCH, baseStyle.stretch);
        baseStyle.backgroundColor = WebUtil.getRGBAColor(jSONObject.optString("backgroundColor"), -1);
        baseStyle.backgroundImg = jSONObject.optString(PARSER_KEY_BACKGROUND_IMAGE, baseStyle.backgroundImg);
        int optInt2 = jSONObject.optInt("paddingLeft", 0);
        if (optInt2 != 0) {
            baseStyle.paddingLeft = ViewUtils.dip2px(context, optInt2);
        }
        int optInt3 = jSONObject.optInt("paddingTop", 0);
        if (optInt3 != 0) {
            baseStyle.paddingTop = ViewUtils.dip2px(context, optInt3);
        }
        int optInt4 = jSONObject.optInt("paddingRight", 0);
        if (optInt4 != 0) {
            baseStyle.paddingRight = ViewUtils.dip2px(context, optInt4);
        }
        int optInt5 = jSONObject.optInt("paddingBottom", 0);
        if (optInt5 != 0) {
            baseStyle.paddingBottom = ViewUtils.dip2px(context, optInt5);
        }
        baseStyle.content = jSONObject.optString("content");
        LineTitleLayout.LayoutParams layoutParams = new LineTitleLayout.LayoutParams(-2, baseStyle.height);
        layoutParams.action = jSONObject.optString("action");
        boolean optBoolean = jSONObject.optBoolean(PARSER_KEY_ELEMENT_PRIMARY, false);
        layoutParams.primary = optBoolean;
        if (optBoolean) {
            layoutParams.primaryFillRest = true;
        }
        layoutParams.name = optString;
        double d = 0.0d;
        double optDouble = jSONObject.optDouble("width", 0.0d);
        if (optDouble >= 0.0d) {
            if (optDouble > 1.0d) {
                layoutParams.width = ViewUtils.dip2px(context, (float) optDouble);
            } else {
                d = optDouble;
            }
        }
        layoutParams.widthPercent = d;
        return layoutParams;
    }

    public static void setBackgroundImage(View view, ResourceProvider resourceProvider, String str) {
        Object[] objArr = {view, resourceProvider, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e99c3d01b80884c6e1b3d892d2adead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e99c3d01b80884c6e1b3d892d2adead");
        } else if (view == null || TextUtils.isEmpty(str)) {
        } else {
            Drawable drawable = resourceProvider != null ? resourceProvider.getDrawable(str) : null;
            if (drawable != null) {
                view.setBackgroundDrawable(drawable);
                return;
            }
            Pair<Boolean, Bitmap> checkAndParseBase64 = ImageUtils.checkAndParseBase64(str);
            if (((Boolean) checkAndParseBase64.first).booleanValue()) {
                view.setBackgroundDrawable(new BitmapDrawable((Bitmap) checkAndParseBase64.second));
            } else {
                KNBRuntime.getRuntime().executeOnThreadPool(new OnlineImgTask(view, str, new OnlineCallback<View>() { // from class: com.dianping.titans.widget.DynamicTitleParser.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.widget.DynamicTitleParser.OnlineCallback
                    public final void onLoad(View view2, Bitmap bitmap) {
                        Object[] objArr2 = {view2, bitmap};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "51dc1ee0e32bf99fe21a33bcdef3a639", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "51dc1ee0e32bf99fe21a33bcdef3a639");
                        } else {
                            view2.setBackgroundDrawable(new BitmapDrawable(bitmap));
                        }
                    }
                }));
            }
        }
    }

    public static void setImageSrc(ImageView imageView, ResourceProvider resourceProvider, String str) {
        Object[] objArr = {imageView, resourceProvider, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a19be2ad7c1c7387cbb92a6eaf7ba0ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a19be2ad7c1c7387cbb92a6eaf7ba0ff");
        } else if (imageView == null || TextUtils.isEmpty(str)) {
        } else {
            Drawable drawable = resourceProvider != null ? resourceProvider.getDrawable(str) : null;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            Pair<Boolean, Bitmap> checkAndParseBase64 = ImageUtils.checkAndParseBase64(str);
            if (((Boolean) checkAndParseBase64.first).booleanValue()) {
                imageView.setImageDrawable(new BitmapDrawable((Bitmap) checkAndParseBase64.second));
            } else {
                KNBRuntime.getRuntime().executeOnThreadPool(new OnlineImgTask(imageView, str, new OnlineCallback<ImageView>() { // from class: com.dianping.titans.widget.DynamicTitleParser.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.widget.DynamicTitleParser.OnlineCallback
                    public final void onLoad(ImageView imageView2, Bitmap bitmap) {
                        Object[] objArr2 = {imageView2, bitmap};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a6bce8bc67d5011bb8cbe78a8de237e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a6bce8bc67d5011bb8cbe78a8de237e9");
                        } else {
                            imageView2.setImageDrawable(new BitmapDrawable(bitmap));
                        }
                    }
                }));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class OnlineImgTask<T extends View> implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final OnlineCallback<T> callback;
        private final String url;
        private final WeakReference<T> viewRef;

        public OnlineImgTask(T t, String str, OnlineCallback<T> onlineCallback) {
            Object[] objArr = {t, str, onlineCallback};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29507cef564ee72c67921a896b1da927", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29507cef564ee72c67921a896b1da927");
                return;
            }
            this.viewRef = new WeakReference<>(t);
            this.url = str;
            this.callback = onlineCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2d436362156f07e30ca3b69227b7e79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2d436362156f07e30ca3b69227b7e79");
                return;
            }
            final Bitmap downloadBitmap = ViewUtils.downloadBitmap(this.url, 3000);
            final T t = this.viewRef.get();
            if (t == null || downloadBitmap == null) {
                return;
            }
            t.post(new Runnable() { // from class: com.dianping.titans.widget.DynamicTitleParser.OnlineImgTask.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62b1e7c30ed2bf5df9f0a20b6583893d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62b1e7c30ed2bf5df9f0a20b6583893d");
                    } else {
                        OnlineImgTask.this.callback.onLoad(t, downloadBitmap);
                    }
                }
            });
        }
    }
}
