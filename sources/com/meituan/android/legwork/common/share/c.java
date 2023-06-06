package com.meituan.android.legwork.common.share;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.util.f;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements PtBaseShare {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:42:0x018c A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:40:0x0187, B:42:0x018c, B:43:0x0190), top: B:58:0x0187 }] */
    @Override // com.meituan.android.legwork.common.share.PtBaseShare
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull android.app.Activity r30, int r31, @android.support.annotation.NonNull com.meituan.android.legwork.common.share.PtShareBean r32, @android.support.annotation.NonNull com.meituan.android.legwork.common.share.PtBaseShare.OnShareListener r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.common.share.c.a(android.app.Activity, int, com.meituan.android.legwork.common.share.PtShareBean, com.meituan.android.legwork.common.share.PtBaseShare$OnShareListener, java.lang.String):void");
    }

    private void a(Activity activity, int i, @Nonnull PtShareBean ptShareBean, @NonNull com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), ptShareBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b66057cecebb2f5f076801a5ae4443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b66057cecebb2f5f076801a5ae4443");
        } else if (i == 2 || i == 4) {
            ShareBean shareBean = new ShareBean(ptShareBean.title, ptShareBean.content, ptShareBean.url, ptShareBean.imgUrl);
            if (!TextUtils.isEmpty(ptShareBean.miniProgramId)) {
                shareBean.setMiniProgramId(ptShareBean.miniProgramId);
            }
            if (!TextUtils.isEmpty(ptShareBean.miniProgramPath)) {
                shareBean.setMiniProgramPath(ptShareBean.miniProgramPath);
            }
            if (com.meituan.android.legwork.a.b) {
                shareBean.setMiniprogramType(1);
            }
            if (!TextUtils.isEmpty(ptShareBean.imgUrl) && (TextUtils.isEmpty(ptShareBean.title) || TextUtils.isEmpty(ptShareBean.url))) {
                x.b("PtBaseShare.shareToWx()", "图片下载链接：" + ptShareBean.imgUrl);
                f.a(activity, i, 0, ptShareBean.imgUrl, bVar);
            } else if (ptShareBean.bmp != null) {
                f.a(activity, i, 0, ptShareBean.bmp, bVar);
            } else {
                f.a(activity, i, shareBean, bVar);
            }
        }
    }
}
