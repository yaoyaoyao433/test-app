package com.sankuai.waimai.store.notification;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.widgets.windows.a {
    public static ChangeQuickRedirect a;
    private ImageView l;
    private TextView m;
    private TextView n;

    public b(@NonNull Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb9a0044368240833d8fa29860629ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb9a0044368240833d8fa29860629ab");
            return;
        }
        this.l = (ImageView) this.e.findViewById(R.id.img_notification);
        this.m = (TextView) this.e.findViewById(R.id.txt_notification_main);
        this.n = (TextView) this.e.findViewById(R.id.txt_notification_sub);
    }

    public final b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb14aba2ed06ff836d70bbe378ae79f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb14aba2ed06ff836d70bbe378ae79f");
        }
        if (TextUtils.isEmpty(str)) {
            this.l.setImageResource(R.drawable.wm_sc_goods_list_ic_notification_default);
        } else {
            b.C0608b a2 = m.a(str);
            a2.b = this.c;
            a2.i = R.drawable.wm_sc_goods_list_ic_notification_default;
            a2.j = R.drawable.wm_sc_goods_list_ic_notification_default;
            a2.a(this.l);
        }
        return this;
    }

    public final b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611f6a6fd7e960c0438d40cbde6277f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611f6a6fd7e960c0438d40cbde6277f1");
        }
        u.a(this.m, c(str));
        return this;
    }

    private static CharSequence c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b3ce0db3103690bc5fbf9798d0481e8", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b3ce0db3103690bc5fbf9798d0481e8") : !TextUtils.isEmpty(str) ? Html.fromHtml(str.replace("<highlight>", "<font color=\"#348BED\">").replace("</highlight>", "</font>")) : str;
    }
}
