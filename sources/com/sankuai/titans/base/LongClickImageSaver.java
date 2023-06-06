package com.sankuai.titans.base;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.constraint.R;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.utils.ImageUtils;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.services.IToastService;
import com.sankuai.titans.protocol.utils.ContentResolverProvider;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LongClickImageSaver {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Activity activity;
    private final List<String> imageUrls;
    private final IThreadPoolService threadPoolService;
    private final IToastService toastService;

    public LongClickImageSaver(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75c7f02676998e0494c400354b7dd729", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75c7f02676998e0494c400354b7dd729");
            return;
        }
        this.imageUrls = new ArrayList();
        this.activity = iTitansContainerContext.getActivity();
        this.threadPoolService = iTitansContainerContext.getTitansContext().getServiceManager().getThreadPoolService();
        this.toastService = iTitansContainerContext.getTitansContext().getServiceManager().getToastService();
    }

    public void saveImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1ad6c3b9fab14431ad59aa34e09df6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1ad6c3b9fab14431ad59aa34e09df6e");
            return;
        }
        synchronized (this.imageUrls) {
            if (!this.imageUrls.contains(str)) {
                this.imageUrls.add(str);
            }
        }
        TitansPermissionUtil.requestPermission(this.activity, PermissionGuard.PERMISSION_STORAGE, "pt-e5d5124c14e96708", new IRequestPermissionCallback() { // from class: com.sankuai.titans.base.LongClickImageSaver.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19e104c318c250ae98e9aff0ee6f8fc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19e104c318c250ae98e9aff0ee6f8fc2");
                } else if (!z) {
                    LongClickImageSaver.this.toastService.showShortToast(LongClickImageSaver.this.activity, "没有保存图片权限");
                } else {
                    LongClickImageSaver.this.saveImageImpl();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveImageImpl() {
        final ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30ed6077e49cf0284d508bfafeb83c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30ed6077e49cf0284d508bfafeb83c52");
            return;
        }
        synchronized (this.imageUrls) {
            arrayList = new ArrayList(this.imageUrls);
            this.imageUrls.clear();
        }
        if (arrayList.size() == 0) {
            return;
        }
        this.threadPoolService.executeOnThreadPool("saveImageImpl", new Runnable() { // from class: com.sankuai.titans.base.LongClickImageSaver.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Uri uri;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7c136a435c5f827d68fe4d9e684ca480", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7c136a435c5f827d68fe4d9e684ca480");
                } else if (!LongClickImageSaver.this.activity.isFinishing() && !LongClickImageSaver.this.activity.isDestroyed()) {
                    for (String str : arrayList) {
                        Bitmap.CompressFormat formatFromBase64Url = ImageUtils.getFormatFromBase64Url(str);
                        if (formatFromBase64Url == null) {
                            formatFromBase64Url = Bitmap.CompressFormat.JPEG;
                        }
                        Bitmap bitmapByImageUrl = ImageUtils.getBitmapByImageUrl(str);
                        if (bitmapByImageUrl == null) {
                            return;
                        }
                        try {
                            uri = ImageUtils.saveBitmapToPublicDirectory(ContentResolverProvider.getContentResolver(LongClickImageSaver.this.activity, "pt-e5d5124c14e96708"), "dianping", formatFromBase64Url, bitmapByImageUrl);
                        } catch (IOException e) {
                            Titans.serviceManager().getStatisticsService().reportClassError("LongClickImageSaver", "saveImageImpl", e);
                            uri = null;
                        }
                        if (LongClickImageSaver.this.activity.isFinishing() || LongClickImageSaver.this.activity.isDestroyed()) {
                            return;
                        }
                        LongClickImageSaver.this.toastService.showShortToast(LongClickImageSaver.this.activity, LongClickImageSaver.this.activity.getString(uri == null ? R.string.titans_save_failed : R.string.titans_save_success));
                    }
                }
            }
        });
    }
}
