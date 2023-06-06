package com.sankuai.waimai.mmp.modules.api;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.msi.addapter.share.IMTShare;
import com.meituan.msi.addapter.share.MTShareParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMSIShareApi extends IMTShare {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.share.IMTShare
    public final void a(MsiCustomContext msiCustomContext, MTShareParam mTShareParam, i iVar) {
        Object[] objArr = {msiCustomContext, mTShareParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26c0622707cf766bc2d41c87943220c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26c0622707cf766bc2d41c87943220c0");
        } else if (msiCustomContext == null) {
        } else {
            if (mTShareParam.type == 0) {
                if (TextUtils.equals(mTShareParam.channel, "WXSceneSession")) {
                    a(msiCustomContext, mTShareParam, new a(iVar));
                } else {
                    a(msiCustomContext, mTShareParam, new a(iVar));
                }
            } else if (mTShareParam.type == 1) {
                if (TextUtils.isEmpty(mTShareParam.path)) {
                    iVar.a(500, "not support");
                    return;
                }
                final a aVar = new a(iVar);
                Object[] objArr2 = {msiCustomContext, mTShareParam, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ccd5c40c869e8573ff0c39ae46d3d466", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ccd5c40c869e8573ff0c39ae46d3d466");
                    return;
                }
                final Activity activity = msiCustomContext.getActivity();
                if (activity == null) {
                    return;
                }
                if (TextUtils.isEmpty(mTShareParam.url)) {
                    mTShareParam.url = "http://i.meituan.com/";
                }
                final ShareTip a2 = a(mTShareParam);
                a2.setMiniprogramType(mTShareParam.shareMiniProgramType);
                a2.setWeixinUrl(mTShareParam.path);
                a2.setMiniProgramId(mTShareParam.appId);
                a2.setMiniprogramWithShareTicket(mTShareParam.withShareTicket);
                if (mTShareParam.localImage == null && !TextUtils.isEmpty(mTShareParam.imageUrl)) {
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = activity;
                    a3.c = mTShareParam.imageUrl;
                    a3.a(new b.a() { // from class: com.sankuai.waimai.mmp.modules.api.WMMSIShareApi.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr3 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9d4435f6405f32e2cbbbd5af7d20a14", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9d4435f6405f32e2cbbbd5af7d20a14");
                                return;
                            }
                            ShareTip.this.setIcon("");
                            com.sankuai.waimai.share.b.a(activity, ShareTip.this, bitmap, aVar);
                        }
                    });
                    return;
                }
                com.sankuai.waimai.share.b.a(activity, a2, mTShareParam.localImage, aVar);
            } else if (mTShareParam.type == 2) {
                if (TextUtils.isEmpty(mTShareParam.imageUrl)) {
                    iVar.a(500, "not support");
                    return;
                }
                a aVar2 = new a(iVar);
                Object[] objArr3 = {msiCustomContext, mTShareParam, aVar2};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3543a294ec3b1fbb39767a0e6ecf6f8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3543a294ec3b1fbb39767a0e6ecf6f8d");
                    return;
                }
                Activity activity2 = msiCustomContext.getActivity();
                if (activity2 == null) {
                    return;
                }
                com.sankuai.waimai.share.b.a(activity2, mTShareParam.useLocalImage, mTShareParam.imageUrl, 1, 1, aVar2, "c_group_fv80awch");
            } else if (mTShareParam.type == 3) {
                iVar.a(500, "not support");
            } else if (mTShareParam.type == 5) {
                iVar.a(500, "not support");
            } else if (mTShareParam.type == 6) {
                a(msiCustomContext, mTShareParam, new a(iVar));
            }
        }
    }

    private static void a(@NonNull MsiCustomContext msiCustomContext, @NonNull MTShareParam mTShareParam, a aVar) {
        Object[] objArr = {msiCustomContext, mTShareParam, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6537cbed3e6699dfd496ebe175365ae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6537cbed3e6699dfd496ebe175365ae4");
            return;
        }
        Activity activity = msiCustomContext.getActivity();
        if (activity == null) {
            return;
        }
        ShareTip a2 = a(mTShareParam);
        a2.setMiniProgramId(mTShareParam.appId);
        a2.setWeixinUrl(mTShareParam.path);
        a2.setMiniprogramType(mTShareParam.shareMiniProgramType);
        com.sankuai.waimai.share.b.a(activity, a2, (com.sankuai.waimai.foundation.core.service.share.listener.a) null, aVar, (Bundle) null);
    }

    private static ShareTip a(@NonNull MTShareParam mTShareParam) {
        Object[] objArr = {mTShareParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4978d0e299c6200b0dd989ebed6913e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareTip) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4978d0e299c6200b0dd989ebed6913e4");
        }
        ShareTip shareTip = new ShareTip();
        shareTip.setCid(mTShareParam.cid);
        shareTip.setTitle(mTShareParam.title);
        shareTip.setContent(mTShareParam.content);
        if (!TextUtils.isEmpty(mTShareParam.imageUrl) && !mTShareParam.imageUrl.startsWith("wdfile://")) {
            shareTip.setIcon(mTShareParam.imageUrl);
        }
        shareTip.setUrl(mTShareParam.url);
        shareTip.channels = new ArrayList();
        shareTip.channels.add(2);
        shareTip.channels.add(1);
        shareTip.channels.add(4);
        return shareTip;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.foundation.core.service.share.listener.b {
        public static ChangeQuickRedirect a;
        private final i b;

        private a(i iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3c4981fc91db348fad1ad3191105a65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3c4981fc91db348fad1ad3191105a65");
            } else {
                this.b = iVar;
            }
        }

        @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59adeccaca47d017d76c199858f1cc30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59adeccaca47d017d76c199858f1cc30");
            } else if (this.b == null) {
            } else {
                if (i2 == 1) {
                    this.b.a(null);
                } else if (i2 == 2) {
                    this.b.a(500, "failed");
                } else if (i2 == 3) {
                    this.b.a(500, "cancel");
                }
            }
        }
    }
}
