package com.dianping.picassocontroller;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.picassocontroller.debug.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class PicassoBindDebuggerActivity extends Activity {
    public static ChangeQuickRedirect a;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String queryParameter;
        Uri data;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab5d6d7ad7d58c03fc75378c20428a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab5d6d7ad7d58c03fc75378c20428a8b");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {IjkMediaPlayer.OnNativeInvokeListener.ARG_IP};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88e79a9a128c95c4f73189a9dfd2bd81", RobustBitConfig.DEFAULT_VALUE)) {
            queryParameter = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88e79a9a128c95c4f73189a9dfd2bd81");
        } else {
            String a2 = f.a(getIntent(), IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            queryParameter = (!TextUtils.isEmpty(a2) || (data = getIntent().getData()) == null) ? a2 : data.getQueryParameter(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            g.b = queryParameter;
            com.dianping.picassocontroller.jse.f.a(getApplicationContext());
            com.dianping.picassocontroller.jse.f.a().a();
        }
        finish();
    }
}
