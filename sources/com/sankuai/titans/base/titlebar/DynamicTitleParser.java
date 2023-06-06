package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.base.titlebar.ZIndexFrameLayout;
import com.sankuai.titans.base.utils.UIKit;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
import com.sankuai.waimai.launcher.util.image.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DynamicTitleParser {
    private static final String PARSER_VAL_PRIMARY_GRAVITY_CENTER = "center";
    private static final String PARSER_VAL_PRIMARY_GRAVITY_END = "end";
    private static final String PARSER_VAL_PRIMARY_GRAVITY_START = "start";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashMap<String, AbsElementParser> elementParserMap;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ResourceProvider {
        Drawable getDrawable(String str);
    }

    static {
        HashMap<String, AbsElementParser> hashMap = new HashMap<>();
        elementParserMap = hashMap;
        hashMap.put("text", new DynamicTextViewParser());
        elementParserMap.put("image", new DynamicImageViewParser());
    }

    public static AbsElementParser getElementParser(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82a165b11504de57b3f06124983c2584", RobustBitConfig.DEFAULT_VALUE) ? (AbsElementParser) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82a165b11504de57b3f06124983c2584") : elementParserMap.get(str);
    }

    public static boolean registerElementParser(String str, AbsElementParser absElementParser) {
        Object[] objArr = {str, absElementParser};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4196d1fe8cd751fd6b802dc5bd9368c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4196d1fe8cd751fd6b802dc5bd9368c")).booleanValue();
        }
        elementParserMap.put(str, absElementParser);
        return true;
    }

    private static LineTitleLayout checkLineTitleLayout(Context context, LineTitleLayout lineTitleLayout, DynamicTitleBarEntity dynamicTitleBarEntity) {
        DynamicTitleBarElementEntity[] elements;
        Object[] objArr = {context, lineTitleLayout, dynamicTitleBarEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b50787fbcadbf45e98829341a862fe5", RobustBitConfig.DEFAULT_VALUE)) {
            return (LineTitleLayout) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b50787fbcadbf45e98829341a862fe5");
        }
        if (lineTitleLayout != null && (elements = dynamicTitleBarEntity.getElements()) != null && lineTitleLayout.getChildCount() == elements.length) {
            for (DynamicTitleBarElementEntity dynamicTitleBarElementEntity : elements) {
                if (dynamicTitleBarElementEntity == null || lineTitleLayout.getChildIndex(dynamicTitleBarElementEntity.getName()) < 0) {
                    return new LineTitleLayout(context);
                }
            }
            return lineTitleLayout;
        }
        return new LineTitleLayout(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<com.sankuai.titans.base.titlebar.LineTitleLayout, com.sankuai.titans.base.titlebar.ZIndexFrameLayout.LayoutParams> parse(android.content.Context r17, com.sankuai.titans.base.titlebar.LineTitleLayout r18, com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity r19, com.sankuai.titans.base.titlebar.DynamicTitleParser.ResourceProvider r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.titlebar.DynamicTitleParser.parse(android.content.Context, com.sankuai.titans.base.titlebar.LineTitleLayout, com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity, com.sankuai.titans.base.titlebar.DynamicTitleParser$ResourceProvider):android.util.Pair");
    }

    public static Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> parse(Context context, DynamicTitleBarEntity dynamicTitleBarEntity, ResourceProvider resourceProvider) {
        Object[] objArr = {context, dynamicTitleBarEntity, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "897ece7ff40573e2ab1d12fd489b5894", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "897ece7ff40573e2ab1d12fd489b5894");
        }
        if (context == null || dynamicTitleBarEntity == null) {
            return null;
        }
        return parse(context, null, dynamicTitleBarEntity, resourceProvider);
    }

    public static void setBackgroundImage(View view, ResourceProvider resourceProvider, final String str) {
        Object[] objArr = {view, resourceProvider, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e81eabcc604d74584154839d0795b150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e81eabcc604d74584154839d0795b150");
        } else if (view == null || TextUtils.isEmpty(str)) {
        } else {
            Drawable drawable = resourceProvider != null ? resourceProvider.getDrawable(str) : null;
            if (drawable != null) {
                view.setBackgroundDrawable(drawable);
                return;
            }
            Pair<Boolean, Bitmap> checkAndParseBase64 = checkAndParseBase64(str);
            if (((Boolean) checkAndParseBase64.first).booleanValue()) {
                view.setBackgroundDrawable(new BitmapDrawable((Bitmap) checkAndParseBase64.second));
                return;
            }
            final WeakReference weakReference = new WeakReference(view);
            Titans.serviceManager().getThreadPoolService().executeOnThreadPool("OnlineImgTask", new Runnable() { // from class: com.sankuai.titans.base.titlebar.DynamicTitleParser.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5be369ea56d3d891028e4b48ab7f5f22", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5be369ea56d3d891028e4b48ab7f5f22");
                        return;
                    }
                    final Bitmap bitmap = null;
                    try {
                        bitmap = UIKit.downloadBitmap(str, 3000);
                    } catch (Exception e) {
                        Titans.serviceManager().getStatisticsService().reportClassError("DynamicTitleParser", "setBackgroundImage", e);
                    }
                    final View view2 = (View) weakReference.get();
                    if (view2 == null || bitmap == null) {
                        return;
                    }
                    view2.post(new Runnable() { // from class: com.sankuai.titans.base.titlebar.DynamicTitleParser.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1723c32140a09de36531c7475602571a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1723c32140a09de36531c7475602571a");
                            } else {
                                view2.setBackgroundDrawable(new BitmapDrawable(bitmap));
                            }
                        }
                    });
                }
            });
        }
    }

    public static Pair<Boolean, Bitmap> checkAndParseBase64(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "439aa5878882765bcb7899d020fd310f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "439aa5878882765bcb7899d020fd310f");
        }
        if (TextUtils.isEmpty(str)) {
            return Pair.create(Boolean.FALSE, null);
        }
        Matcher matcher = Pattern.compile("^data:image/\\S+;base64,").matcher(str);
        if (!matcher.find()) {
            return Pair.create(Boolean.FALSE, null);
        }
        try {
            byte[] decode = Base64.decode(str.substring(matcher.end()), 0);
            return Pair.create(Boolean.TRUE, a.a(decode, 0, decode.length));
        } catch (Throwable th) {
            Titans.serviceManager().getStatisticsService().reportClassError("DynamicTitleParser", "checkAndParseBase64", th);
            return Pair.create(Boolean.TRUE, null);
        }
    }
}
