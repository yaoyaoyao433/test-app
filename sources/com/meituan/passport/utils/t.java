package com.meituan.passport.utils;

import android.content.Context;
import android.widget.LinearLayout;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;
    public List<OAuthItem> b;
    public LinearLayout c;
    public Context d;
    public a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(OAuthItem oAuthItem);
    }

    public t(List<OAuthItem> list, LinearLayout linearLayout) {
        Object[] objArr = {list, linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807cc2d06df2471ea0c49116e37aedbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807cc2d06df2471ea0c49116e37aedbc");
            return;
        }
        if (list != null) {
            this.b = new ArrayList(list);
        } else {
            this.b = new ArrayList();
        }
        this.c = linearLayout;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "690e064683fb0df1467f42d62815c3a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "690e064683fb0df1467f42d62815c3a7");
        } else {
            this.d = this.c.getContext();
        }
    }

    public void a(LinearLayout linearLayout, List<OAuthItem> list, LinearLayout.LayoutParams layoutParams) {
        Object[] objArr = {linearLayout, list, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eacea70491a32810b65d4ae7e60fa915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eacea70491a32810b65d4ae7e60fa915");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            linearLayout.addView(a(list.get(i)), layoutParams);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
        if (r1.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_WEIXIN) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(com.meituan.passport.pojo.OAuthItem r16) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.utils.t.a(com.meituan.passport.pojo.OAuthItem):android.view.View");
    }
}
