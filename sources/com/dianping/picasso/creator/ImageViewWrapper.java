package com.dianping.picasso.creator;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;
import com.dianping.imagemanager.DPImageView;
import com.dianping.imagemanager.utils.processor.a;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.ImageModel;
import com.dianping.picasso.model.params.ImageViewParams;
import com.dianping.picasso.view.PicassoImageView;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.dianping.shield.AgentConfigParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ImageViewWrapper extends BaseViewWrapper<PicassoImageView, ImageModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoImageView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed69d9aba5698f8a5b00a0b9e83e3cd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed69d9aba5698f8a5b00a0b9e83e3cd0");
        }
        PicassoImageView picassoImageView = new PicassoImageView(context);
        picassoImageView.markPicasso();
        picassoImageView.setPlaceholderScaleType(ImageView.ScaleType.CENTER_CROP);
        picassoImageView.setRequireWithContextLifecycle(true);
        return picassoImageView;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoImageView picassoImageView, PicassoView picassoView, ImageModel imageModel, ImageModel imageModel2) {
        Object[] objArr = {picassoImageView, picassoView, imageModel, imageModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1186be3f3258e370fe5b3576e97c8089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1186be3f3258e370fe5b3576e97c8089");
            return;
        }
        ImageViewParams imageViewParams = (ImageViewParams) imageModel.getViewParams();
        ImageViewParams imageViewParams2 = imageModel2 == null ? null : (ImageViewParams) imageModel2.getViewParams();
        picassoImageView.setAnimatedImageLooping(imageModel.gifLoopCount);
        picassoImageView.setScaleType(imageViewParams.imageScaleType);
        picassoImageView.setNeedReload(imageModel.failedRetry);
        String str = imageModel.businessID;
        if (TextUtils.isEmpty(str)) {
            str = imageModel.gaLabel;
        }
        picassoImageView.setImageModule(str);
        picassoImageView.setRequestOption(initRequestOption(imageModel.decodeOption));
        if (imageViewParams.imageDrawable != null) {
            if (imageViewParams2 == null || imageViewParams.imageDrawable != imageViewParams2.imageDrawable) {
                picassoImageView.setImageDrawable(imageViewParams.imageDrawable);
            }
        } else {
            if (imageModel.needPlaceholder) {
                picassoImageView.setPlaceholders(imageViewParams.placeholderLoadingDrawable, imageViewParams.placeholderLoadingDrawable, imageViewParams.placeholderErrorDrawable);
            } else {
                int i = ImageViewParams.DEFAULT_TRANSPARENT;
                picassoImageView.setPlaceholders(i, i, ImageViewParams.DEFAULT_TRANSPARENT);
            }
            picassoImageView.setPlaceholderBackgroundColor(0);
            picassoImageView.setImageScale(imageModel.imageScale);
            picassoImageView.setEdgeInset(imageViewParams.edgeInsetRect);
            if (imageModel2 == null || ((imageModel2.imageUrl != null && !imageModel2.imageUrl.equals(imageModel.imageUrl)) || TextUtils.isEmpty(imageModel.imageUrl))) {
                picassoImageView.setImage(imageModel.imageUrl, transformCacheBucket(imageModel.cacheType));
            } else if (isNeedResize(imageViewParams, imageViewParams2)) {
                picassoImageView.setImageSize(imageModel.getViewParams().width, imageModel.getViewParams().height);
                if (imageModel.imageUrl != null && imageModel.imageUrl.equals(picassoImageView.getURL())) {
                    picassoImageView.setPlaceholder(1, 0);
                    picassoImageView.forceRequire(true);
                    picassoImageView.setPlaceholder(1, imageViewParams.placeholderLoadingDrawable);
                } else {
                    picassoImageView.setImage(imageModel.imageUrl, transformCacheBucket(imageModel.cacheType));
                }
            } else if (imageModel.gifLoopCount != 0) {
                picassoImageView.startImageAnimation(false);
            }
        }
        if (PicassoUtils.isValidColor(imageModel.tintColor)) {
            picassoImageView.setColorFilter(Color.parseColor(imageModel.tintColor));
        }
        picassoImageView.setFadeInDisplayEnabled(imageModel.fadeEffect);
        b a = c.a(imageModel.hostId);
        if (a instanceof g) {
            picassoImageView.setPicMonitorInfo(AgentConfigParser.PICASSO_PREFIX, ((g) a).i);
        } else if (picassoView.getJsName() != null) {
            picassoImageView.setPicMonitorInfo(AgentConfigParser.PICASSO_PREFIX, picassoView.getJsName());
        }
        if (picassoImageView.blurRadius != imageModel.blurRadius) {
            picassoImageView.blurRadius = imageModel.blurRadius;
            picassoImageView.setImageProcessor(imageModel.blurRadius > 0.0f ? new a(picassoImageView.getContext(), (int) Math.ceil(Math.min(imageModel.blurRadius, 1.0d) * 25.0d)) : null);
            picassoImageView.forceRetry();
        }
        picassoImageView.setImageSaturation(imageModel.saturation);
    }

    private boolean isNeedResize(ImageViewParams imageViewParams, ImageViewParams imageViewParams2) {
        return (imageViewParams.width == imageViewParams2.width && imageViewParams.height == imageViewParams2.height) ? false : true;
    }

    private com.dianping.imagemanager.image.cache.a transformCacheBucket(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ad6d71655b50e69fa4a60d664ba12f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.image.cache.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ad6d71655b50e69fa4a60d664ba12f1");
        }
        com.dianping.imagemanager.image.cache.a aVar = com.dianping.imagemanager.image.cache.a.DEFAULT;
        switch (i) {
            case 1:
                return com.dianping.imagemanager.image.cache.a.ICON;
            case 2:
                return com.dianping.imagemanager.image.cache.a.HOMEPAGE;
            default:
                return aVar;
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<ImageModel> getDecodingFactory() {
        return ImageModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(PicassoImageView picassoImageView, final ImageModel imageModel, final String str) {
        Object[] objArr = {picassoImageView, imageModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124acf8258189eb9ab5b6e2b0ff51151", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124acf8258189eb9ab5b6e2b0ff51151")).booleanValue();
        }
        if (bindClickAction(picassoImageView, imageModel, str)) {
            return true;
        }
        if ("imageLoaded".equals(str)) {
            picassoImageView.setImageDownloadListener(new PicassoImageView.ImageDownloadListener() { // from class: com.dianping.picasso.creator.ImageViewWrapper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.view.PicassoImageView.ImageDownloadListener
                public void onDownloadSuccess(float f, float f2) {
                    Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8d187cb964919acd030aaf20f01706b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8d187cb964919acd030aaf20f01706b");
                    } else {
                        ImageViewWrapper.this.callAction(imageModel, str, new JSONBuilder().put("success", Boolean.TRUE).put("width", Float.valueOf(f)).put("height", Float.valueOf(f2)).toJSONObject());
                    }
                }

                @Override // com.dianping.picasso.view.PicassoImageView.ImageDownloadListener
                public void onDownloadFail() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd28d11cbc28df0358446abf898f215e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd28d11cbc28df0358446abf898f215e");
                    } else {
                        ImageViewWrapper.this.callAction(imageModel, str, new JSONBuilder().put("success", Boolean.FALSE).toJSONObject());
                    }
                }
            });
            return true;
        }
        return super.bindAction((ImageViewWrapper) picassoImageView, (PicassoImageView) imageModel, str);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoImageView picassoImageView, ImageModel imageModel) {
        Object[] objArr = {picassoImageView, imageModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4cb13bb816140ee9974e9061de057ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4cb13bb816140ee9974e9061de057ca");
            return;
        }
        picassoImageView.setLongClickable(false);
        picassoImageView.setClickable(false);
    }

    private DPImageView.f initRequestOption(int i) {
        if (i == 1) {
            return DPImageView.f.DECODE_WITH_ARGB8888;
        }
        return DPImageView.f.DECODE_WITH_RGB565;
    }
}
