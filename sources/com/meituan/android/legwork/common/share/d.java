package com.meituan.android.legwork.common.share;

import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.listener.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements com.sankuai.waimai.kit.share.listener.b {
    public static ChangeQuickRedirect a;
    private final Map b;
    private final PtBaseShare.OnShareListener c;
    private final int d;
    private final String e;
    private final String f;

    public d(Map map, PtBaseShare.OnShareListener onShareListener, int i, String str, String str2) {
        this.b = map;
        this.c = onShareListener;
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    @Override // com.sankuai.waimai.kit.share.listener.b
    public final void a(ShareBean shareBean, b.a aVar) {
        String str;
        Object[] objArr = {shareBean, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b71f31db42bd1beaa31de4be4cd0c9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b71f31db42bd1beaa31de4be4cd0c9d0");
            return;
        }
        Map map = this.b;
        PtBaseShare.OnShareListener onShareListener = this.c;
        int i = this.d;
        String str2 = this.e;
        String str3 = this.f;
        int i2 = 3;
        Object[] objArr2 = {map, onShareListener, Integer.valueOf(i), str2, str3, shareBean, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7dc3240d3cfbeb237cfb63b10d54911b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7dc3240d3cfbeb237cfb63b10d54911b");
            return;
        }
        if (aVar == b.a.COMPLETE) {
            str = "分享成功";
            map.put("status", "success");
            i2 = 1;
        } else if (aVar == b.a.FAILED) {
            str = "分享失败";
            map.put("status", "fail");
            i2 = 2;
        } else if (aVar == b.a.CANCEL) {
            str = "分享取消";
            map.put("status", "cancel");
        } else {
            str = "分享状态未知";
            map.put("status", "unknow");
            i2 = 0;
        }
        onShareListener.a(i, i2);
        map.put("share_channel", str2);
        q.a("legwork_share_status", 128, map);
        x.d("PtShare.shareTo()", str3 + str);
    }
}
