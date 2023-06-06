package com.sankuai.waimai.business.user.comment.rn;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.CallSuper;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.user.comment.net.CommentApi;
import com.sankuai.waimai.business.user.comment.net.response.CommentShortLinkResponse;
import com.sankuai.waimai.foundation.core.utils.d;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.c;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.comment.ShareInfo;
import com.sankuai.waimai.platform.utils.q;
import com.sankuai.waimai.router.method.Func1;
import com.sankuai.waimai.share.b;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UserCommentShareModule extends ReactContextBaseJavaModule {
    private static final int MAX_STAR_COUNT = 5;
    public static final String REACT_CLASS = "WMRNShareCommentModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isSharing;
    private boolean isWeixinInstalled;
    private Dialog mProcessDialog;
    private int mSource;
    private final String volleyTAG;
    private int yellowStar;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public UserCommentShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c1116a1b4625c765affe4a95c2ad69b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c1116a1b4625c765affe4a95c2ad69b");
            return;
        }
        this.isWeixinInstalled = false;
        this.isSharing = false;
        this.mSource = 1;
        this.mProcessDialog = null;
        this.volleyTAG = getClass().getSimpleName() + System.currentTimeMillis();
    }

    @ReactMethod
    public void isWXAppInstalled(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fed634c7c14ed1eb71dca8c72e6934f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fed634c7c14ed1eb71dca8c72e6934f");
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(isWXAppInstalled()));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    private boolean isWXAppInstalled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd629284a367e02f1f534d10f8226ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd629284a367e02f1f534d10f8226ce2")).booleanValue();
        }
        this.isWeixinInstalled = b.a(getCurrentActivity());
        return this.isWeixinInstalled;
    }

    @ReactMethod
    public void onWeixinCircleClick(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ec6f3798780a152a3d4ebd31af03c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ec6f3798780a152a3d4ebd31af03c41");
            return;
        }
        try {
            ShareInfo fromJson = ShareInfo.fromJson(new JSONObject(str));
            if (isWXAppInstalled()) {
                if (this.isSharing) {
                    return;
                }
                this.isSharing = true;
                createImageAndShare(1, fromJson);
                return;
            }
            ae.a(getCurrentActivity(), (int) R.string.wm_comment_wechat_not_installed);
        } catch (JSONException e) {
            com.sankuai.waimai.imbase.log.a.a(REACT_CLASS, e);
        }
    }

    @ReactMethod
    public void onWeixinFriendsClick(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97c7016f134e4a0ddd0c9cb749e4d3a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97c7016f134e4a0ddd0c9cb749e4d3a5");
            return;
        }
        try {
            ShareInfo fromJson = ShareInfo.fromJson(new JSONObject(str));
            if (isWXAppInstalled()) {
                if (this.isSharing) {
                    return;
                }
                this.isSharing = true;
                createImageAndShare(2, fromJson);
                return;
            }
            ae.a(getCurrentActivity(), (int) R.string.wm_comment_wechat_not_installed);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(REACT_CLASS, e);
        }
    }

    private void createImageAndShare(int i, ShareInfo shareInfo) {
        Object[] objArr = {Integer.valueOf(i), shareInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b19d3dcaae72ca7a4bcddb10c49d4165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b19d3dcaae72ca7a4bcddb10c49d4165");
        } else {
            requestShortLink(i, shareInfo);
        }
    }

    private void requestShortLink(final int i, final ShareInfo shareInfo) {
        Object[] objArr = {Integer.valueOf(i), shareInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a965ba791c358fa4371af1781db4804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a965ba791c358fa4371af1781db4804");
        } else if (shareInfo == null || TextUtils.isEmpty(shareInfo.getShareUrl())) {
            ae.a(getCurrentActivity(), (int) R.string.wm_comment_failed_to_share);
            this.isSharing = false;
        } else {
            showProcessDialog();
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((CommentApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CommentApi.class)).getCommentShortLink(shareInfo.getShareUrl()), new b.AbstractC1042b<BaseResponse<CommentShortLinkResponse>>() { // from class: com.sankuai.waimai.business.user.comment.rn.UserCommentShareModule.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f0346dac1973d4bb9983f88ab417901e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f0346dac1973d4bb9983f88ab417901e");
                    } else if (baseResponse == null) {
                        onError(null);
                    } else if (baseResponse.data == 0 || baseResponse.code != 0) {
                        UserCommentShareModule.this.onShareFailed();
                    } else {
                        String str = ((CommentShortLinkResponse) baseResponse.data).b;
                        if (TextUtils.isEmpty(str)) {
                            UserCommentShareModule.this.onShareFailed();
                            return;
                        }
                        UserCommentShareModule.this.updateShareUrl(str, shareInfo);
                        UserCommentShareModule.this.share(i, shareInfo);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d70e7861b2fe88dd9c50e1ef3ddbcf05", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d70e7861b2fe88dd9c50e1ef3ddbcf05");
                        return;
                    }
                    UserCommentShareModule.this.dismissProcessDialog();
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(UserCommentShareModule.this.getCurrentActivity(), (Throwable) null);
                }
            }, this.volleyTAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CallSuper
    public void updateShareUrl(String str, ShareInfo shareInfo) {
        Object[] objArr = {str, shareInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19e48e91b52b0696d6f29357f79cdd6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19e48e91b52b0696d6f29357f79cdd6f");
        } else {
            shareInfo.setShareUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onShareFailed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c02debe9c78dc87be690a13efb2f7f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c02debe9c78dc87be690a13efb2f7f48");
            return;
        }
        dismissProcessDialog();
        ae.a(getCurrentActivity(), (int) R.string.wm_comment_failed_to_share);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share(final int i, ShareInfo shareInfo) {
        Object[] objArr = {Integer.valueOf(i), shareInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f80b5d211e9892980a28259e05418c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f80b5d211e9892980a28259e05418c");
        } else {
            createCommentBitmap(new Func1<Bitmap, Void>() { // from class: com.sankuai.waimai.business.user.comment.rn.UserCommentShareModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.method.Func1
                public final /* synthetic */ Void call(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    Object[] objArr2 = {bitmap2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "571e113a0fb61193fee08ca7c14ad340", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "571e113a0fb61193fee08ca7c14ad340");
                    }
                    UserCommentShareModule.this.dismissProcessDialog();
                    if (bitmap2 == null) {
                        UserCommentShareModule.this.onShareFailed();
                        return null;
                    } else if (i == 1 || i == 2) {
                        com.sankuai.waimai.share.b.a(UserCommentShareModule.this.getCurrentActivity(), bitmap2, i, 10, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.business.user.comment.rn.UserCommentShareModule.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                            public final void a(int i2, int i3) {
                                Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cc5c4538370d3bacd07b093783b7fcdf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cc5c4538370d3bacd07b093783b7fcdf");
                                } else if (i3 == 2) {
                                    UserCommentShareModule.this.onShareFailed();
                                }
                            }
                        }, "c_1wrb4ko");
                        return null;
                    } else {
                        return null;
                    }
                }
            }, shareInfo);
        }
    }

    private void createCommentBitmap(Func1<Bitmap, Void> func1, ShareInfo shareInfo) {
        Object[] objArr = {func1, shareInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26041e867011a2dc17b3736871c8f32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26041e867011a2dc17b3736871c8f32");
        } else if (getCurrentActivity() != null) {
            ViewGroup viewGroup = null;
            View inflate = getCurrentActivity().getLayoutInflater().inflate(R.layout.wm_comment_share_to_wechat_screenshot, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.img_share_comment_poi_logo);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.ll_share_comment_stars);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_share_comment_content);
            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_share_comment_praise_food);
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.img_share_comment_qrcode);
            ImageView imageView3 = (ImageView) inflate.findViewById(R.id.img_share_comment_slogan);
            TextView textView3 = (TextView) inflate.findViewById(R.id.txt_share_comment_qrcode_desc);
            ((TextView) inflate.findViewById(R.id.txt_share_comment_poi_name)).setText(shareInfo.getPoiName());
            textView.setText(shareInfo.getComment());
            if (TextUtils.isEmpty(shareInfo.getPraiseStr())) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(shareInfo.getPraiseStr());
            }
            this.yellowStar = shareInfo.getCommentScore();
            int i = 5 - this.yellowStar;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.wm_comment_star_margin_left_and_right);
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            for (int i2 = 0; i2 < this.yellowStar; i2++) {
                ImageView imageView4 = (ImageView) LayoutInflater.from(getCurrentActivity()).inflate(R.layout.wm_comment_view_share_star, (ViewGroup) null);
                imageView4.setImageResource(R.drawable.wm_comment_img_share_star_yellow);
                imageView4.setLayoutParams(layoutParams);
                viewGroup2.addView(imageView4);
            }
            int i3 = 0;
            while (i3 < i) {
                ImageView imageView5 = (ImageView) LayoutInflater.from(getCurrentActivity()).inflate(R.layout.wm_comment_view_share_star, viewGroup);
                imageView5.setImageResource(R.drawable.wm_comment_img_share_star_grey);
                imageView5.setLayoutParams(layoutParams);
                viewGroup2.addView(imageView5);
                i3++;
                viewGroup = null;
            }
            textView3.setText(shareInfo.getQrcodeTip());
            imageView2.setImageBitmap(getQrcodeBitmap(shareInfo));
            inflate.measure(View.MeasureSpec.makeMeasureSpec(g.a((Context) getCurrentActivity()), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            a aVar = new a(func1, inflate);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = getCurrentActivity();
            a2.c = shareInfo.getPoiIconUrl();
            a2.i = R.drawable.wm_comment_img_share_poi_placeholder;
            b.C0608b a3 = a2.a(new RoundAndCenterCropTransform((Context) getCurrentActivity(), true));
            a3.h = aVar.c();
            a3.a(imageView);
            b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a4.b = getCurrentActivity();
            a4.c = shareInfo.getSloganUrl();
            a4.i = R.drawable.wm_comment_img_share_slogan_placeholder;
            a4.h = aVar.c();
            a4.a(imageView3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements b.c, Runnable {
        public static ChangeQuickRedirect a;
        public int b;
        private final Func1<Bitmap, Void> c;
        private final View d;

        public a(Func1<Bitmap, Void> func1, View view) {
            Object[] objArr = {func1, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90a4babbd2126df6b4bdfae97e71dfb4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90a4babbd2126df6b4bdfae97e71dfb4");
                return;
            }
            this.b = 0;
            this.c = func1;
            this.d = view;
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac058b4a4a627b82bfaf7b3c21861230", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac058b4a4a627b82bfaf7b3c21861230");
            } else {
                d();
            }
        }

        @Override // com.sankuai.meituan.mtimageloader.config.b.c
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d6fff462473cbe3a3d12b37cf80d48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d6fff462473cbe3a3d12b37cf80d48");
            } else {
                d();
            }
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde2f29856b8907764cc8a11ca199058", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde2f29856b8907764cc8a11ca199058");
                return;
            }
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                ad.c(this);
            }
        }

        public final b.c c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea2e903ff1735bc4f464a71550d5af1", RobustBitConfig.DEFAULT_VALUE)) {
                return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea2e903ff1735bc4f464a71550d5af1");
            }
            this.b++;
            return this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5fed4db27be5165a74442357d44bba5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5fed4db27be5165a74442357d44bba5");
            } else {
                this.c.call(c.a(this.d, 0));
            }
        }
    }

    private Bitmap getQrcodeBitmap(ShareInfo shareInfo) {
        Object[] objArr = {shareInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32bb5c6734a865243ac3fd044d9c010", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32bb5c6734a865243ac3fd044d9c010");
        }
        int dimensionPixelSize = getCurrentActivity().getResources().getDimensionPixelSize(R.dimen.wm_comment_qrcode_width_and_height);
        return q.a(shareInfo.getShareUrl(), com.google.zxing.a.QR_CODE, dimensionPixelSize, dimensionPixelSize, false);
    }

    private boolean showProcessDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28a0d2c8e7b5282cf213012d6faf4d5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28a0d2c8e7b5282cf213012d6faf4d5c")).booleanValue();
        }
        if (isActivityFinishing()) {
            return false;
        }
        d.a(this.mProcessDialog);
        this.mProcessDialog = d.a(getCurrentActivity());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dismissProcessDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78e94b8e4261140b00915d96f54ddee6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78e94b8e4261140b00915d96f54ddee6")).booleanValue();
        }
        this.isSharing = false;
        if (isActivityFinishing()) {
            return false;
        }
        d.a(this.mProcessDialog);
        this.mProcessDialog = null;
        return true;
    }

    private boolean isActivityFinishing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92978722ebcb04d41ae13daf96d5932a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92978722ebcb04d41ae13daf96d5932a")).booleanValue();
        }
        Activity currentActivity = getCurrentActivity();
        return currentActivity == null || currentActivity.isFinishing();
    }
}
