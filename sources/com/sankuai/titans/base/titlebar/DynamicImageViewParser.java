package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.base.titlebar.DynamicTitleParser;
import com.sankuai.titans.base.utils.UIKit;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DynamicImageViewParser extends AbsElementParser<ImageView> {
    private static final String PARSER_VAL_STRETCH_BASIC = "basic";
    private static final String PARSER_VAL_STRETCH_COVER = "cover";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.base.titlebar.AbsElementParser
    public void setupUniqueStyle(ImageView imageView, DynamicTitleBarElementEntity dynamicTitleBarElementEntity, DynamicTitleParser.ResourceProvider resourceProvider) {
    }

    @Override // com.sankuai.titans.base.titlebar.AbsElementParser
    public ImageView getViewWithBaseStyle(Context context, ImageView imageView, BaseStyle baseStyle, DynamicTitleParser.ResourceProvider resourceProvider) {
        Object[] objArr = {context, imageView, baseStyle, resourceProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b0ff240ca408be12350217df0e4471d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b0ff240ca408be12350217df0e4471d");
        }
        if (imageView == null) {
            imageView = new ImageView(context);
        }
        String str = baseStyle.stretch;
        if ("cover".equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_END);
        } else if ("basic".equals(str)) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        setImageSrc(imageView, resourceProvider, baseStyle.content);
        return imageView;
    }

    private static void setImageSrc(ImageView imageView, DynamicTitleParser.ResourceProvider resourceProvider, final String str) {
        Object[] objArr = {imageView, resourceProvider, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f99f05391f295a582906a57f8c094a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f99f05391f295a582906a57f8c094a4");
        } else if (imageView == null || TextUtils.isEmpty(str)) {
        } else {
            Drawable drawable = resourceProvider != null ? resourceProvider.getDrawable(str) : null;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            Pair<Boolean, Bitmap> checkAndParseBase64 = DynamicTitleParser.checkAndParseBase64(str);
            if (((Boolean) checkAndParseBase64.first).booleanValue()) {
                imageView.setImageDrawable(new BitmapDrawable((Bitmap) checkAndParseBase64.second));
                return;
            }
            final WeakReference weakReference = new WeakReference(imageView);
            Titans.serviceManager().getThreadPoolService().executeOnThreadPool("OnlineImgTask", new Runnable() { // from class: com.sankuai.titans.base.titlebar.DynamicImageViewParser.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b1c13c05c831d9395f4d5002d1f73b1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b1c13c05c831d9395f4d5002d1f73b1b");
                        return;
                    }
                    final Bitmap bitmap = null;
                    try {
                        bitmap = UIKit.downloadBitmap(str, 3000);
                    } catch (Exception e) {
                        Titans.serviceManager().getStatisticsService().reportClassError("DynamicImageViewParser", "setImageSrc", e);
                    }
                    final ImageView imageView2 = (ImageView) weakReference.get();
                    if (imageView2 == null || bitmap == null) {
                        return;
                    }
                    imageView2.post(new Runnable() { // from class: com.sankuai.titans.base.titlebar.DynamicImageViewParser.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "01ec307da868cb199316786f3f93f536", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "01ec307da868cb199316786f3f93f536");
                            } else {
                                imageView2.setImageDrawable(new BitmapDrawable(bitmap));
                            }
                        }
                    });
                }
            });
        }
    }
}
