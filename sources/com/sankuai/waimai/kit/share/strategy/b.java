package com.sankuai.waimai.kit.share.strategy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.ShareConstant;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.d;
import com.sankuai.waimai.kit.share.listener.b;
import com.sankuai.waimai.kit.utils.e;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    ShareBean b;
    private WeakReference<Activity> c;
    private Tencent d;
    private IUiListener e;

    public static /* synthetic */ void a(b bVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "eff9b7f481df7ff6f9755425ac7a31df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "eff9b7f481df7ff6f9755425ac7a31df");
            return;
        }
        Activity a2 = bVar.a();
        if (a2 != null && !a2.isFinishing()) {
            e.a(a2, (int) R.string.wm_share_failed);
        }
        if (i == 8) {
            d.a().b(i2);
        } else if (i == 1) {
            d.a().d(i2);
        }
    }

    public b(Activity activity, Context context) {
        Object[] objArr = {activity, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd383f1e0d8707905293e2efe6650ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd383f1e0d8707905293e2efe6650ee");
        } else if (activity == null || context == null) {
        } else {
            this.c = new WeakReference<>(activity);
            try {
                this.d = Tencent.createInstance(ShareConstant.c, context);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3a05d9938ed4d3bfda0a9e1b4a5c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3a05d9938ed4d3bfda0a9e1b4a5c97");
        } else {
            Tencent.onActivityResultData(i, i2, intent, this.e);
        }
    }

    private Bundle a(ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e788ce7454da3b812d75666dd3f98a56", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e788ce7454da3b812d75666dd3f98a56");
        }
        Bundle bundle = new Bundle();
        bundle.putString("targetUrl", shareBean.getUrl());
        bundle.putString("title", shareBean.getTitle());
        if (!TextUtils.isEmpty(shareBean.getImgUrl())) {
            bundle.putString("imageUrl", shareBean.getImgUrl());
        } else {
            bundle.putString("imageUrl", "http://xs01.meituan.net/waimai_i/img/favicon4.d04bcada.png");
        }
        bundle.putInt("req_type", 1);
        bundle.putString("summary", shareBean.getContent());
        Activity a2 = a();
        if (a2 != null) {
            bundle.putString("appName", a(a2.getApplicationContext()));
        }
        return bundle;
    }

    private String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadd1c6123d90bda3a1ad890473df1bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadd1c6123d90bda3a1ad890473df1bf");
        }
        try {
            return (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        } catch (Exception unused) {
            return "";
        }
    }

    private Bundle b(ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eae2241c2aba18bc44c4a0099a65f5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eae2241c2aba18bc44c4a0099a65f5e");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("req_type", 1);
        bundle.putString("title", shareBean.getTitle());
        bundle.putString("summary", shareBean.getContent());
        bundle.putString("targetUrl", shareBean.getUrl());
        String imgUrl = TextUtils.isEmpty(shareBean.getImgUrl()) ? "http://xs01.meituan.net/waimai_i/img/favicon4.d04bcada.png" : shareBean.getImgUrl();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(imgUrl);
        bundle.putStringArrayList("imageUrl", arrayList);
        return bundle;
    }

    public final void a(ShareBean shareBean, final com.sankuai.waimai.kit.share.listener.b bVar) {
        Context applicationContext;
        Object[] objArr = {shareBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bfd36429e8b0e039560546f25a4061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bfd36429e8b0e039560546f25a4061");
            return;
        }
        Activity a2 = a();
        if (a2 == null || shareBean == null || this.d == null) {
            bVar.a(shareBean, b.a.FAILED);
            return;
        }
        this.b = shareBean;
        final int channel = this.b != null ? this.b.getChannel() : 0;
        this.e = new IUiListener() { // from class: com.sankuai.waimai.kit.share.strategy.b.1
            public static ChangeQuickRedirect a;

            @Override // com.tencent.tauth.IUiListener
            public final void onComplete(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63173de3aa7f9a61e0383602ba6b19a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63173de3aa7f9a61e0383602ba6b19a7");
                    return;
                }
                if (bVar != null) {
                    bVar.a(b.this.b, b.a.COMPLETE);
                }
                b bVar2 = b.this;
                int i = channel;
                Object[] objArr3 = {Integer.valueOf(i), 13300};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "d36e0c00eeadacf5bb1ee1376d9eb9bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "d36e0c00eeadacf5bb1ee1376d9eb9bb");
                    return;
                }
                Activity a3 = bVar2.a();
                if (a3 != null && !a3.isFinishing()) {
                    e.a(a3, (int) R.string.wm_share_successful);
                }
                if (i == 8) {
                    d.a().b(13300);
                } else if (i == 1) {
                    d.a().d(13300);
                }
            }

            @Override // com.tencent.tauth.IUiListener
            public final void onError(UiError uiError) {
                Object[] objArr2 = {uiError};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47357fa1c1df80d455a6678cebf63986", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47357fa1c1df80d455a6678cebf63986");
                    return;
                }
                if (bVar != null) {
                    bVar.a(b.this.b, b.a.FAILED);
                }
                b.a(b.this, channel, 13301);
            }

            @Override // com.tencent.tauth.IUiListener
            public final void onCancel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "731a002d9df6281ac2a738938dd35449", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "731a002d9df6281ac2a738938dd35449");
                    return;
                }
                if (bVar != null) {
                    bVar.a(b.this.b, b.a.CANCEL);
                }
                b.a(b.this, channel, 13302);
            }

            @Override // com.tencent.tauth.IUiListener
            public final void onWarning(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ddb4b1036becfc70aa62db09257ce1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ddb4b1036becfc70aa62db09257ce1f");
                    return;
                }
                if (bVar != null) {
                    bVar.a(b.this.b, b.a.FAILED);
                }
                b.a(b.this, channel, 13301);
            }
        };
        if (this.b.isLocalImage()) {
            this.d.shareToQQ(a2, c(this.b), this.e);
            return;
        }
        try {
            if (this.b.getChannel() == 1) {
                this.d.shareToQzone(a2, b(this.b), this.e);
            } else if (this.b.getChannel() == 8) {
                this.d.shareToQQ(a2, a(this.b), this.e);
            }
        } catch (Exception unused) {
            if (a2 == null || (applicationContext = a2.getApplicationContext()) == null || this.b == null) {
                return;
            }
            String str = null;
            if (this.b.getChannel() == 1) {
                str = a().getString(R.string.kit_qq_zone);
            } else if (this.b.getChannel() == 8) {
                str = a().getString(R.string.kit_qq_friends);
            }
            if (TextUtils.isEmpty(str)) {
                e.a(a2, applicationContext.getResources().getString(R.string.wm_share_cannot_share_to_this_try_other));
            } else {
                e.a(a2, applicationContext.getResources().getString(R.string.wm_share_cannot_share_to_try_other, str));
            }
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "425b57857d1006370b71a7938fd6482b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "425b57857d1006370b71a7938fd6482b");
        } else if (i == 8) {
            d.a().b(13301);
        } else if (i == 1) {
            d.a().d(13301);
        }
    }

    private Bundle c(ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea4c641647d8797f377c91a14346f20", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea4c641647d8797f377c91a14346f20");
        }
        Bundle bundle = new Bundle();
        bundle.putString("imageLocalUrl", shareBean.getImagePath());
        Activity a2 = a();
        if (a2 != null) {
            bundle.putString("appName", a(a2.getApplicationContext()));
        }
        bundle.putInt("req_type", 5);
        bundle.putInt("cflag", 2);
        return bundle;
    }

    Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b343dac27a5f15f9502a704152e62f1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b343dac27a5f15f9502a704152e62f1b");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.get();
    }
}
