package com.dianping.picasso.model.params;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ImageView;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.ImageModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.image.a;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ImageViewParams extends PicassoModelParams<ImageModel> {
    private static int DEFAULT_ERROR_ID = 2130841217;
    private static int DEFAULT_LOADING_ID = 2130841217;
    public static int DEFAULT_TRANSPARENT = 2130841217;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HashMap<Integer, ImageView.ScaleType> scaleTypeMap;
    public Rect edgeInsetRect;
    public Drawable imageDrawable;
    public ImageView.ScaleType imageScaleType;
    public Drawable placeholderErrorDrawable;
    public Drawable placeholderLoadingDrawable;

    static {
        HashMap<Integer, ImageView.ScaleType> hashMap = new HashMap<>();
        scaleTypeMap = hashMap;
        hashMap.put(0, ImageView.ScaleType.FIT_XY);
        scaleTypeMap.put(1, ImageView.ScaleType.FIT_CENTER);
        scaleTypeMap.put(2, ImageView.ScaleType.CENTER_CROP);
        scaleTypeMap.put(4, ImageView.ScaleType.CENTER);
        scaleTypeMap.put(9, ImageView.ScaleType.MATRIX);
    }

    @Override // com.dianping.picasso.model.params.PicassoModelParams
    public void switchModel(ImageModel imageModel) {
        Bitmap loadLocalImage;
        boolean z = true;
        Object[] objArr = {imageModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6272df6463fb9b6e3f27670201d9efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6272df6463fb9b6e3f27670201d9efa");
            return;
        }
        super.switchModel((ImageViewParams) imageModel);
        this.edgeInsetRect = new Rect(dp2px(imageModel.edgeInsets.left, this.scaleInput), dp2px(imageModel.edgeInsets.top, this.scaleInput), dp2px(imageModel.edgeInsets.right, this.scaleInput), dp2px(imageModel.edgeInsets.bottom, this.scaleInput));
        this.imageScaleType = scaleTypeMap.containsKey(Integer.valueOf(imageModel.contentMode)) ? scaleTypeMap.get(Integer.valueOf(imageModel.contentMode)) : ImageView.ScaleType.FIT_XY;
        if (!TextUtils.isEmpty(imageModel.image) || !TextUtils.isEmpty(imageModel.imagePath)) {
            if (!TextUtils.isEmpty(imageModel.image)) {
                int resourcesId = PicassoUtils.getResourcesId(PicassoEnvironment.globalContext, imageModel.image);
                if (resourcesId > 0) {
                    this.imageDrawable = PicassoEnvironment.globalContext.getResources().getDrawable(resourcesId);
                    if (this.imageDrawable instanceof BitmapDrawable) {
                        loadLocalImage = ((BitmapDrawable) this.imageDrawable).getBitmap();
                    }
                }
                loadLocalImage = null;
            } else {
                loadLocalImage = loadLocalImage(imageModel.imagePath, 1400, 1400, readPictureDegree(imageModel.imagePath));
            }
            if (loadLocalImage != null) {
                byte[] ninePatchChunk = loadLocalImage.getNinePatchChunk();
                z = (ninePatchChunk == null || !NinePatch.isNinePatchChunk(ninePatchChunk)) ? false : false;
                if (!z && !PicassoUtils.isRectValid(this.edgeInsetRect)) {
                    this.imageDrawable = new BitmapDrawable(loadLocalImage);
                } else if (z) {
                    this.imageDrawable = new NinePatchDrawable(loadLocalImage, ninePatchChunk, new Rect(), null);
                } else {
                    this.imageDrawable = new NinePatchDrawable(loadLocalImage, PicassoUtils.getNinePatchChunk(loadLocalImage.getWidth(), loadLocalImage.getHeight(), this.edgeInsetRect), new Rect(), null);
                }
            }
        } else if (!TextUtils.isEmpty(imageModel.imageBase64)) {
            Matcher matcher = Pattern.compile("data:image/(\\S+?);base64,(\\S+)").matcher(imageModel.imageBase64);
            if (matcher.find()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (TextUtils.isEmpty(group) || TextUtils.isEmpty(group2)) {
                    return;
                }
                try {
                    byte[] decode = Base64.decode(group2, 0);
                    Bitmap a = a.a(decode, 0, decode.length);
                    if (PicassoUtils.isRectValid(this.edgeInsetRect)) {
                        this.imageDrawable = getNinePathPathDrawable(PicassoEnvironment.globalContext, a, imageModel.imageScale, this.edgeInsetRect);
                    } else {
                        this.imageDrawable = new BitmapDrawable(a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            if (imageModel.placeholderLoading.startsWith("#") && PicassoUtils.isValidColor(imageModel.placeholderLoading)) {
                this.placeholderLoadingDrawable = new ColorDrawable(Color.parseColor(imageModel.placeholderLoading));
            } else {
                this.placeholderLoadingDrawable = PicassoEnvironment.globalContext.getResources().getDrawable(PicassoUtils.getResourcesId(PicassoEnvironment.globalContext, imageModel.placeholderLoading, DEFAULT_LOADING_ID));
            }
            if (imageModel.placeholderError.startsWith("#") && PicassoUtils.isValidColor(imageModel.placeholderError)) {
                this.placeholderErrorDrawable = new ColorDrawable(Color.parseColor(imageModel.placeholderError));
            } else {
                this.placeholderErrorDrawable = PicassoEnvironment.globalContext.getResources().getDrawable(PicassoUtils.getResourcesId(PicassoEnvironment.globalContext, imageModel.placeholderError, DEFAULT_ERROR_ID));
            }
        }
    }

    public static void setDefaultPlaceholders(int i, int i2, int i3) {
        DEFAULT_LOADING_ID = i2;
        DEFAULT_ERROR_ID = i3;
    }

    public static NinePatchDrawable getNinePathPathDrawable(Context context, Bitmap bitmap, float f, Rect rect) {
        Object[] objArr = {context, bitmap, Float.valueOf(f), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7da91d6cd34b0a777e1b3263834d198f", RobustBitConfig.DEFAULT_VALUE)) {
            return (NinePatchDrawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7da91d6cd34b0a777e1b3263834d198f");
        }
        if (context == null || bitmap == null || f <= 0.0f) {
            return null;
        }
        float f2 = context.getResources().getDisplayMetrics().density / f;
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        return new NinePatchDrawable(createBitmap, PicassoUtils.getNinePatchChunk(createBitmap.getWidth(), createBitmap.getHeight(), rect), new Rect(), null);
    }

    public static int readPictureDegree(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c57dbc4ab16dd726fcb4aae29a9ac8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c57dbc4ab16dd726fcb4aae29a9ac8a")).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    return attributeInt != 8 ? 0 : 270;
                }
                return 90;
            }
            return TXLiveConstants.RENDER_ROTATION_180;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static Bitmap loadLocalImage(String str, int i, int i2, int i3) {
        int i4;
        int i5;
        float width;
        float height;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a3b8333cdbf9e801aab2d1d6ea4e2b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a3b8333cdbf9e801aab2d1d6ea4e2b2");
        }
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            a.a(str, options);
            if (i3 == 0 || i3 == 180) {
                i4 = options.outWidth;
                i5 = options.outHeight;
            } else {
                i4 = options.outHeight;
                i5 = options.outWidth;
            }
            int max = Math.max(1, i4 * i2 > i5 * i ? i4 / i : i5 / i2);
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            int i6 = max;
            for (int i7 = 1; i7 <= 5 && bitmap == null; i7++) {
                try {
                    options.inSampleSize = i6;
                    i6 *= 2;
                    bitmap = a.a(str, options);
                } catch (Throwable unused) {
                    i6 *= 2;
                }
            }
            if (bitmap == null) {
                return null;
            }
            try {
                if (i3 == 0 || i3 == 180) {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    height = bitmap.getWidth();
                    width = bitmap.getHeight();
                }
                float min = Math.min(i2 / height, i / width);
                Matrix matrix = new Matrix();
                int i8 = (min > 1.0f ? 1 : (min == 1.0f ? 0 : -1));
                if (i8 < 0) {
                    matrix.postScale(min, min);
                }
                if (i3 != 0) {
                    matrix.postRotate(i3);
                }
                if (i8 >= 0 && i3 == 0) {
                    return bitmap;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                    return createBitmap;
                }
                return createBitmap;
            } catch (Throwable unused2) {
                try {
                    return Bitmap.createScaledBitmap(bitmap, 700, 700, true);
                } catch (Throwable unused3) {
                    return null;
                }
            }
        } catch (Exception unused4) {
            return null;
        }
    }
}
