package com.meituan.mmp.lib.api.auth;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends LinearLayout {
    public static ChangeQuickRedirect a;
    ImageView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    String h;
    public String i;
    public Context j;
    com.meituan.mmp.lib.config.a k;
    public i l;
    public View.OnClickListener m;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d255d277bb09ccbeb5c6192ee57f262", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d255d277bb09ccbeb5c6192ee57f262");
            return;
        }
        this.j = context;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2965767acc63953414c6a1655b75283e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2965767acc63953414c6a1655b75283e");
            return;
        }
        LayoutInflater.from(this.j).inflate(R.layout.mmp_dialog_auth, this);
        startAnimation(AnimationUtils.loadAnimation(this.j, R.anim.mmp_dialog_show));
        this.b = (ImageView) findViewById(R.id.mmp_auth_icon);
        this.c = (TextView) findViewById(R.id.mmp_auth_app_name);
        this.d = (TextView) findViewById(R.id.mmp_auth_scope);
        this.e = (TextView) findViewById(R.id.mmp_auth_scope_reason);
        this.f = (TextView) findViewById(R.id.mmp_auth_phone);
        this.g = (TextView) findViewById(R.id.mmp_auth_phone_from);
        this.m = getClickListener();
        findViewById(R.id.mmp_auth_refuse).setOnClickListener(this.m);
        findViewById(R.id.mmp_auth_agree).setOnClickListener(this.m);
        findViewById(R.id.mmp_auth_about).setOnClickListener(this.m);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6296174cad00b570a2443c708657ca2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6296174cad00b570a2443c708657ca2a");
        } else {
            MMPEnvHelper.getLogger().mgeClick(this.k.c(), "c_group_fv80awch", "b_group_y4e7xybd_mc", new Logger.a().a("title", this.k.d()).a("type", this.h).a("button_name", str).b);
        }
    }

    private View.OnClickListener getClickListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aab12df42a27fa167e8ee5bce3cbe23", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aab12df42a27fa167e8ee5bce3cbe23") : new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.auth.b.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
                if (r3.equals("scope.userLocation") != false) goto L40;
             */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r21) {
                /*
                    Method dump skipped, instructions count: 550
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.auth.b.AnonymousClass1.onClick(android.view.View):void");
            }
        };
    }
}
