package com.sankuai.android.share.keymodule.shareChannel.service;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.util.d;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "copyService")
/* loaded from: classes3.dex */
public class a extends com.sankuai.android.share.keymodule.b {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "copy")
    public void share(final LyingkitTraceBody lyingkitTraceBody, final Context context, final b.a aVar, final ShareBaseBean shareBaseBean, final com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ba6d075398e81307cab90d0440827a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ba6d075398e81307cab90d0440827a");
        } else if (shareBaseBean == null) {
            com.sankuai.android.share.a.a(context, (int) R.string.share_cannot_empty);
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "唤起系统分享失败---content: null");
            if (cVar != null) {
                cVar.a(aVar, c.a.FAILED);
            }
            com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.Data);
        } else {
            final StringBuilder sb = new StringBuilder(shareBaseBean.getTitle());
            Object[] objArr2 = {sb, shareBaseBean};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "820f52376aa194172db8764ba59ebc00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "820f52376aa194172db8764ba59ebc00");
            } else if (!TextUtils.isEmpty(shareBaseBean.getContent())) {
                if (TextUtils.isEmpty(sb)) {
                    sb.append(shareBaseBean.getContent());
                } else {
                    sb.append(Constants.SPACE);
                    sb.append(shareBaseBean.getContent());
                }
            }
            Object[] objArr3 = {sb, shareBaseBean};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a6010c0e3e2cadbed9ddf471a68e31f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a6010c0e3e2cadbed9ddf471a68e31f");
            } else if (!TextUtils.isEmpty(shareBaseBean.getUrl())) {
                if (TextUtils.isEmpty(sb)) {
                    sb.append(shareBaseBean.getUrl());
                } else {
                    sb.append(Constants.SPACE);
                    sb.append(shareBaseBean.getUrl());
                }
            }
            if (TextUtils.isEmpty(sb)) {
                com.sankuai.android.share.a.a(context, (int) R.string.share_cannot_empty);
                if (cVar != null) {
                    cVar.a(b.a.COPY, c.a.FAILED);
                }
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "唤起系统分享失败---content: null");
                com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.Data);
                return;
            }
            com.sankuai.android.share.common.util.d.a(context, "Label", sb.toString(), "pt-2ade395ef1ab2755", new d.a() { // from class: com.sankuai.android.share.keymodule.shareChannel.service.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.android.share.common.util.d.a
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6eb72b5229daba846e896cc32414cfac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6eb72b5229daba846e896cc32414cfac");
                        return;
                    }
                    com.sankuai.android.share.a.a(context, (int) R.string.share_copy_success);
                    if (cVar != null) {
                        cVar.a(b.a.COPY, c.a.COMPLETE);
                    }
                    LyingkitTraceBody lyingkitTraceBody2 = lyingkitTraceBody;
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody2, "0", "唤起系统分享成功---content:" + sb.toString());
                    com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean);
                }

                @Override // com.sankuai.android.share.common.util.d.a
                public final void a(int i, Exception exc) {
                    Object[] objArr4 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3597bcf71ba4494d44818304154a9b50", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3597bcf71ba4494d44818304154a9b50");
                        return;
                    }
                    if (cVar != null) {
                        cVar.a(b.a.COPY, c.a.COMPLETE);
                    }
                    com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.FailedApplyPermission);
                }
            });
        }
    }
}
