package com.sankuai.waimai.kit.share.strategy;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.kit.share.ShareConstant;
import com.sankuai.waimai.kit.share.WMShareProvider;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.d;
import com.sankuai.waimai.kit.share.listener.b;
import com.sankuai.waimai.kit.share.util.c;
import com.sankuai.waimai.kit.utils.e;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShareByWeixinStrategy {
    public static ChangeQuickRedirect b;
    private WeakReference<Activity> a;
    protected Context c;
    protected WXMediaMessage d;
    protected WXWebpageObject e;
    protected IWXAPI f;
    protected int g;
    protected WeixinBean h;
    protected com.sankuai.waimai.kit.share.listener.b i;
    private WXTextObject j;
    private BroadcastReceiver k;

    public static /* synthetic */ void a(ShareByWeixinStrategy shareByWeixinStrategy) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, shareByWeixinStrategy, changeQuickRedirect, false, "90cf86e92bdab177136a07082704da4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shareByWeixinStrategy, changeQuickRedirect, false, "90cf86e92bdab177136a07082704da4e");
            return;
        }
        try {
            if (shareByWeixinStrategy.c == null || shareByWeixinStrategy.k == null) {
                return;
            }
            shareByWeixinStrategy.c.unregisterReceiver(shareByWeixinStrategy.k);
            shareByWeixinStrategy.k = null;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(ShareByWeixinStrategy shareByWeixinStrategy, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, shareByWeixinStrategy, changeQuickRedirect, false, "a607bc10b21f716c33ca769ee60f0667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shareByWeixinStrategy, changeQuickRedirect, false, "a607bc10b21f716c33ca769ee60f0667");
            return;
        }
        Activity d = shareByWeixinStrategy.d();
        if (d != null) {
            e.a(d, (int) R.string.wm_share_failed);
            if (shareByWeixinStrategy.g == 0) {
                d.a().a(i);
            } else if (shareByWeixinStrategy.g == 1) {
                d.a().c(i);
            }
        }
    }

    public static /* synthetic */ void b(ShareByWeixinStrategy shareByWeixinStrategy, int i) {
        boolean z;
        Object[] objArr = {13200};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, shareByWeixinStrategy, changeQuickRedirect, false, "49f71eca26eaf8786fee0c087d701259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shareByWeixinStrategy, changeQuickRedirect, false, "49f71eca26eaf8786fee0c087d701259");
            return;
        }
        Activity d = shareByWeixinStrategy.d();
        if (d != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, shareByWeixinStrategy, changeQuickRedirect2, false, "6c6d221c66ccc10d12745af4cb32bec1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, shareByWeixinStrategy, changeQuickRedirect2, false, "6c6d221c66ccc10d12745af4cb32bec1")).booleanValue();
            } else {
                z = com.sankuai.waimai.kit.share.util.b.a(com.sankuai.waimai.kit.share.util.b.a(shareByWeixinStrategy.c, "com.tencent.mm"), "6.7.2") >= 0;
            }
            if (!z) {
                e.a(d, (int) R.string.wm_share_successful);
            }
            if (shareByWeixinStrategy.g == 0) {
                d.a().a(13200);
            } else if (shareByWeixinStrategy.g == 1) {
                d.a().c(13200);
            }
        }
    }

    public ShareByWeixinStrategy(Context context, Activity activity) {
        Object[] objArr = {context, activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d0f87045882c315d3b5d7f39b3da10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d0f87045882c315d3b5d7f39b3da10");
        } else if (context == null || activity == null) {
        } else {
            this.c = context;
            this.a = new WeakReference<>(activity);
            this.f = WXAPIFactory.createWXAPI(context, ShareConstant.a);
            this.f.registerApp(ShareConstant.a);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c86f3bb8cbd967fd05a338e1aaeda7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c86f3bb8cbd967fd05a338e1aaeda7");
            return;
        }
        this.k = new WeixinShareReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("wx_share");
        this.c.registerReceiver(this.k, intentFilter);
    }

    static WeixinBean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d2f85398f7c181bfcd22f2830af408e", RobustBitConfig.DEFAULT_VALUE)) {
            return (WeixinBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d2f85398f7c181bfcd22f2830af408e");
        }
        if (context != null) {
            try {
                String b2 = com.sankuai.waimai.kit.utils.a.b(context, "weixinbean", "");
                if (!TextUtils.isEmpty(b2)) {
                    WeixinBean weixinBean = new WeixinBean();
                    JSONObject jSONObject = new JSONObject(b2);
                    weixinBean.setType(jSONObject.optInt("type"));
                    weixinBean.setTitle(jSONObject.optString("subject"));
                    weixinBean.setContent(jSONObject.optString("content"));
                    weixinBean.setUrl(jSONObject.optString("url"));
                    weixinBean.setImgUrl(jSONObject.optString("imgUrl"));
                    weixinBean.setOrderId(jSONObject.optString(Constants.EventConstants.KEY_ORDER_ID));
                    weixinBean.setSourceId(jSONObject.optInt("sourceId"));
                    weixinBean.setChannel(jSONObject.optInt("channel"));
                    return weixinBean;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void a(Context context, WeixinBean weixinBean) {
        Object[] objArr = {context, weixinBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a37aff047d0c890aac91bfb30ddc2ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a37aff047d0c890aac91bfb30ddc2ead");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", weixinBean.getType());
            jSONObject.put("subject", weixinBean.getTitle());
            jSONObject.put("content", weixinBean.getContent());
            jSONObject.put("url", weixinBean.getUrl());
            jSONObject.put("imgUrl", weixinBean.getImgUrl());
            jSONObject.put(Constants.EventConstants.KEY_ORDER_ID, weixinBean.getOrderId());
            jSONObject.put("sourceId", weixinBean.getSourceId());
            jSONObject.put("channel", weixinBean.getChannel());
            if (context != null) {
                com.sankuai.waimai.kit.utils.a.a(context, "weixinbean", jSONObject.toString());
            } else {
                com.sankuai.waimai.kit.utils.a.a(context, "weixinbean", "");
            }
        } catch (Exception unused) {
            com.sankuai.waimai.kit.utils.a.a(context, "weixinbean", "");
        }
    }

    public void a(WeixinBean weixinBean, com.sankuai.waimai.kit.share.listener.b bVar) {
        Bitmap extractThumbnail;
        Object[] objArr = {weixinBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "955591d9d341ffa5d33831d7b1670cad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "955591d9d341ffa5d33831d7b1670cad");
        } else if (weixinBean == null || this.f == null) {
            bVar.a(weixinBean, b.a.FAILED);
        } else {
            this.i = bVar;
            if (TextUtils.isEmpty(weixinBean.getImgUrl())) {
                weixinBean.setImgUrl("http://xs01.meituan.net/waimai_i/img/favicon4.d04bcada.png");
            }
            this.h = weixinBean;
            a(this.c, this.h);
            this.g = weixinBean.getType();
            this.e = new WXWebpageObject(weixinBean.getUrl());
            this.d = new WXMediaMessage();
            this.d.title = weixinBean.getTitle();
            this.d.description = weixinBean.getContent();
            Activity d = d();
            if (!this.f.isWXAppInstalled()) {
                if (d != null) {
                    e.a(d, (int) R.string.wm_share_no_weixin_client);
                }
                bVar.a(weixinBean, b.a.FAILED);
            } else if (this.g != 0 && this.g != 1) {
                bVar.a(weixinBean, b.a.FAILED);
            } else {
                a();
                if (weixinBean.isMiniProgram()) {
                    WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
                    wXMiniProgramObject.webpageUrl = weixinBean.getUrl();
                    wXMiniProgramObject.userName = "gh_72a4eb2d4324";
                    if (!TextUtils.isEmpty(weixinBean.getMiniProgramId())) {
                        wXMiniProgramObject.userName = weixinBean.getMiniProgramId();
                    } else if (!TextUtils.isEmpty(weixinBean.getUserName())) {
                        wXMiniProgramObject.userName = weixinBean.getUserName();
                    }
                    wXMiniProgramObject.path = weixinBean.getMiniProgramPath();
                    wXMiniProgramObject.miniprogramType = weixinBean.getMiniprogramType();
                    wXMiniProgramObject.withShareTicket = weixinBean.miniProgramWithShareTicket();
                    this.d.mediaObject = wXMiniProgramObject;
                    String imgUrl = weixinBean.getImgUrl();
                    String imagePath = weixinBean.getImagePath();
                    if ((!weixinBean.isMiniProgramLocalImage() && TextUtils.isEmpty(imgUrl)) || (weixinBean.isMiniProgramLocalImage() && TextUtils.isEmpty(imagePath))) {
                        if (weixinBean.isImage()) {
                            this.d.thumbData = weixinBean.getImageData();
                        } else {
                            this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                        }
                        c();
                    } else if (!weixinBean.isMiniProgramLocalImage()) {
                        if (d != null) {
                            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                            c.b = d;
                            b.C0608b a = c.a(400, 400);
                            a.c = imgUrl;
                            a.a(new b.a() { // from class: com.sankuai.waimai.kit.share.strategy.ShareByWeixinStrategy.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a(Bitmap bitmap) {
                                    Object[] objArr2 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81f6fc622e68d87b813afe7690f8a554", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81f6fc622e68d87b813afe7690f8a554");
                                        return;
                                    }
                                    if (bitmap.getWidth() > 400 || bitmap.getHeight() > 400) {
                                        bitmap = ThumbnailUtils.extractThumbnail(bitmap, 400, 400);
                                    }
                                    ShareByWeixinStrategy.this.d.setThumbImage(bitmap);
                                    ShareByWeixinStrategy.this.c();
                                }

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a124b988bab78c7242c72854d4cd82e8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a124b988bab78c7242c72854d4cd82e8");
                                        return;
                                    }
                                    ShareByWeixinStrategy.this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(ShareByWeixinStrategy.this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                                    ShareByWeixinStrategy.this.c();
                                }
                            }, 1);
                        }
                    } else {
                        Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(imagePath);
                        if (a2 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                a2.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                                this.d.thumbData = byteArrayOutputStream.toByteArray();
                                if (this.d.thumbData.length > 131072) {
                                    byteArrayOutputStream.reset();
                                    float length = (this.d.thumbData.length * 1.0f) / 40000.0f;
                                    Bitmap extractThumbnail2 = ThumbnailUtils.extractThumbnail(a2, (int) (a2.getWidth() / length), (int) (a2.getHeight() / length), 2);
                                    try {
                                        extractThumbnail2.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                                        this.d.thumbData = byteArrayOutputStream.toByteArray();
                                        a2 = extractThumbnail2;
                                    } catch (Exception unused) {
                                        a2 = extractThumbnail2;
                                        this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                                        if (a2 != null) {
                                        }
                                        this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                                        c();
                                    }
                                }
                                byteArrayOutputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (a2 != null || this.d.thumbData == null || this.d.thumbData.length > 131072) {
                            this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                        }
                        c();
                    }
                } else if (weixinBean.isImage()) {
                    if (weixinBean.getImageData() != null) {
                        this.d.mediaObject = new WXImageObject(weixinBean.getImageData());
                        this.d.thumbData = weixinBean.getThumbData();
                        weixinBean.setImageData(null, null);
                        c();
                        return;
                    }
                    String imagePath2 = weixinBean.getImagePath();
                    WXImageObject wXImageObject = new WXImageObject();
                    if (this.f.getWXAppSupportAPI() >= 654314752) {
                        File file = new File(imagePath2);
                        if (file.exists()) {
                            Context context = this.c;
                            Uri uriForFile = WMShareProvider.getUriForFile(context, this.c.getPackageName() + ".WMShareProvider", file);
                            this.c.grantUriPermission("com.tencent.mm", uriForFile, 1);
                            imagePath2 = uriForFile.toString();
                        }
                    }
                    wXImageObject.setImagePath(imagePath2);
                    this.d.mediaObject = wXImageObject;
                    Object[] objArr2 = {imagePath2, 80, 80};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.kit.share.util.a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "67372df1598ef19d1fd479e2dc0f6e6f", RobustBitConfig.DEFAULT_VALUE)) {
                        extractThumbnail = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "67372df1598ef19d1fd479e2dc0f6e6f");
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        com.sankuai.waimai.launcher.util.image.a.a(imagePath2, options);
                        options.inJustDecodeBounds = false;
                        int i = options.outHeight;
                        int i2 = options.outWidth / 80;
                        int i3 = i / 80;
                        if (i2 < i3) {
                            i3 = i2;
                        }
                        options.inSampleSize = i3 > 0 ? i3 : 1;
                        extractThumbnail = ThumbnailUtils.extractThumbnail(com.sankuai.waimai.launcher.util.image.a.a(imagePath2, options), 80, 80, 2);
                    }
                    if (extractThumbnail != null) {
                        this.d.setThumbImage(extractThumbnail);
                    }
                    c();
                } else if (!TextUtils.isEmpty(weixinBean.getImgUrl())) {
                    if (TextUtils.isEmpty(weixinBean.getUrl())) {
                        b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                        c2.c = weixinBean.getImgUrl();
                        c2.a(new b.a() { // from class: com.sankuai.waimai.kit.share.strategy.ShareByWeixinStrategy.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap) {
                                Object[] objArr3 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dfc8bef81b4c01f333029fb0eebac247", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dfc8bef81b4c01f333029fb0eebac247");
                                    return;
                                }
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 100, (bitmap.getHeight() * 100) / bitmap.getWidth(), false);
                                WXImageObject wXImageObject2 = new WXImageObject(com.sankuai.waimai.kit.share.util.a.a(bitmap));
                                ShareByWeixinStrategy.this.d.setThumbImage(createScaledBitmap);
                                ShareByWeixinStrategy.this.d.mediaObject = wXImageObject2;
                                ShareByWeixinStrategy.this.c();
                                bitmap.recycle();
                                createScaledBitmap.recycle();
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b46ff9c9a839e1ad5fd0ad0d96aabc8e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b46ff9c9a839e1ad5fd0ad0d96aabc8e");
                                } else {
                                    ShareByWeixinStrategy.this.i.a(ShareByWeixinStrategy.this.h, b.a.FAILED);
                                }
                            }
                        }, 1);
                    } else if (d != null) {
                        b.C0608b c3 = com.sankuai.meituan.mtimageloader.loader.a.c();
                        c3.b = d;
                        c3.c = weixinBean.getImgUrl();
                        c3.a(MapConstant.ANIMATION_DURATION_SHORT, MapConstant.ANIMATION_DURATION_SHORT).a(new b.a() { // from class: com.sankuai.waimai.kit.share.strategy.ShareByWeixinStrategy.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap) {
                                Object[] objArr3 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42d50b6a5464e13c52fde77c04cc55a0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42d50b6a5464e13c52fde77c04cc55a0");
                                    return;
                                }
                                if (bitmap.getWidth() > 150 || bitmap.getHeight() > 150) {
                                    bitmap = ThumbnailUtils.extractThumbnail(bitmap, MapConstant.ANIMATION_DURATION_SHORT, MapConstant.ANIMATION_DURATION_SHORT);
                                }
                                ShareByWeixinStrategy.this.d.setThumbImage(bitmap);
                                ShareByWeixinStrategy.this.d.mediaObject = ShareByWeixinStrategy.this.e;
                                ShareByWeixinStrategy.this.c();
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9d4635df7c5d1814d05eaf63799d465a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9d4635df7c5d1814d05eaf63799d465a");
                                    return;
                                }
                                ShareByWeixinStrategy.this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(ShareByWeixinStrategy.this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                                ShareByWeixinStrategy.this.d.mediaObject = ShareByWeixinStrategy.this.e;
                                ShareByWeixinStrategy.this.c();
                            }
                        }, 1);
                    }
                } else if (!TextUtils.isEmpty(weixinBean.getUrl())) {
                    this.d.setThumbImage(com.sankuai.waimai.launcher.util.image.a.a(this.c.getResources(), (int) R.drawable.wm_share_default_share_icon));
                    this.d.mediaObject = this.e;
                    c();
                } else {
                    this.j = new WXTextObject(weixinBean.getContent());
                    this.d.mediaObject = this.j;
                    c();
                }
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6189faaa820506b26a2f98d4bd5c7115", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6189faaa820506b26a2f98d4bd5c7115")).booleanValue() : this.f != null && this.f.isWXAppInstalled();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998cab8bde2d6fc8ba3bb15679ff9eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998cab8bde2d6fc8ba3bb15679ff9eb3");
            return;
        }
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.message = this.d;
        if (this.g == 0) {
            req.scene = 0;
        } else if (1 == this.g) {
            req.scene = 1;
        }
        this.f.sendReq(req);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class WeixinShareReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private WeixinShareReceiver() {
            Object[] objArr = {ShareByWeixinStrategy.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d8e427faf23162cff10640242f57df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d8e427faf23162cff10640242f57df");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6800d9acc0ab0a4e8994be92ea7f1bae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6800d9acc0ab0a4e8994be92ea7f1bae");
                return;
            }
            ShareByWeixinStrategy.a(ShareByWeixinStrategy.this);
            if (intent.hasExtra("wx_result")) {
                WeixinBean a2 = ShareByWeixinStrategy.a(context);
                int a3 = c.a(intent, "wx_result", -2);
                if ((a3 == 0 ? (char) 65535 : (char) 0) != 65535) {
                    if (ShareByWeixinStrategy.this.i != null) {
                        ShareByWeixinStrategy.this.i.a(a2, b.a.FAILED);
                    }
                    ShareByWeixinStrategy.a(ShareByWeixinStrategy.this, a3 == -2 ? 13202 : 13201);
                } else if (a2 == null) {
                    ShareByWeixinStrategy.a(ShareByWeixinStrategy.this, 13201);
                } else {
                    if (ShareByWeixinStrategy.this.i != null) {
                        ShareByWeixinStrategy.this.i.a(a2, b.a.COMPLETE);
                    }
                    ShareByWeixinStrategy.b(ShareByWeixinStrategy.this, 13200);
                }
            }
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26485ac3d3957cdec860130de44bc218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26485ac3d3957cdec860130de44bc218");
        } else if (i == 2) {
            d.a().a(13201);
        } else if (i == 4) {
            d.a().c(13201);
        }
    }

    private Activity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5238977d5e6c23f2248fbbfe3e9fb514", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5238977d5e6c23f2248fbbfe3e9fb514");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.get();
    }
}
