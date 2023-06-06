package com.sankuai.waimai.business.ugc.media;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02c20c4783f4d268a4b0a22c2bd8c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02c20c4783f4d268a4b0a22c2bd8c9c");
            return;
        }
        Uri uri = jVar.d;
        String uri2 = uri.toString();
        if (uri2 != null) {
            String queryParameter = uri.getQueryParameter("biz");
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            if (uri2.contains("wmvideopreivew")) {
                Object[] objArr2 = {bundle2, jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4480a270f2f1a31ad0d8959b51d3177", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4480a270f2f1a31ad0d8959b51d3177");
                } else {
                    bundle2.putInt("enableCameraVideoClip", 0);
                    bundle2.putInt("enableAlbumVideoClip", 1);
                    bundle2.putInt("enableVideoFilter", 1);
                    bundle2.putInt("enablePicEdit", 0);
                    bundle2.putInt(ShieldMonitorKey.TAG_BUSINESS, 2);
                    bundle2.putInt("mediaType", 2);
                    bundle2.putInt("sourceType", 2);
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
                }
            } else if (uri2.contains("wmmediachoose")) {
                Object[] objArr3 = {bundle2, jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1af8d914fe21868e3dc47973f8fe639", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1af8d914fe21868e3dc47973f8fe639");
                } else {
                    bundle2.putInt("enableCameraVideoClip", 0);
                    bundle2.putInt("enableAlbumVideoClip", 0);
                    bundle2.putInt("enableVideoFilter", 0);
                    bundle2.putInt("enablePicEdit", 1);
                    bundle2.putInt(ShieldMonitorKey.TAG_BUSINESS, 1);
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
                }
            } else if (uri2.contains("wmvideoselect")) {
                Object[] objArr4 = {bundle2, jVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "06e37218b4496956f046bbd5334fc024", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "06e37218b4496956f046bbd5334fc024");
                } else {
                    bundle2.putInt("mediaType", 2);
                    bundle2.putInt("sourceType", 1);
                    bundle2.putInt("enableCameraVideoClip", 0);
                    bundle2.putInt("enableAlbumVideoClip", 1);
                    bundle2.putInt("enableVideoFilter", 1);
                    bundle2.putInt("enablePicEdit", 0);
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
                }
            } else if (ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION.equals(queryParameter)) {
                Object[] objArr5 = {bundle2, jVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a73ae0ec23019bacf091094d8d4f639b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a73ae0ec23019bacf091094d8d4f639b");
                } else {
                    bundle2.putInt("enableCameraVideoClip", 1);
                    bundle2.putInt("enableAlbumVideoClip", 1);
                    bundle2.putInt("enableVideoFilter", 0);
                    bundle2.putInt("enablePicEdit", 1);
                    bundle2.putInt(ShieldMonitorKey.TAG_BUSINESS, 3);
                    bundle2.putString("picTagConfig", "[{\"icon\":\"https://p0.meituan.net/ugccontentpic/776bfeaf8d432211d9cbf0385ae9c9232265.png\",\"text\":\"裁剪\",\"type\":2}]");
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
                }
            }
        }
        gVar.a();
    }
}
