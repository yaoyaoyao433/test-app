package com.meituan.android.upgrade.ui;

import android.content.Context;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.upgrade.e;
import com.meituan.android.upgrade.f;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UpgradeRemindDialog extends UpgradeBaseDialog {
    public static ChangeQuickRedirect g;
    private RelativeLayout h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private View l;
    private TextView m;
    private TextView n;
    private Button o;
    private Button p;

    public UpgradeRemindDialog(Context context, VersionInfo versionInfo, f fVar) {
        super(context, versionInfo, fVar);
        Object[] objArr = {context, versionInfo, fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b9a3edf2125815c798d194166bad31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b9a3edf2125815c798d194166bad31");
            return;
        }
        Object[] objArr2 = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83733711ed930abb02d83adfb6087cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83733711ed930abb02d83adfb6087cab");
        } else if (versionInfo != null) {
            if (g.a(this.b, versionInfo.currentVersion)) {
                this.d = a.REMIND_INSTALL;
            } else if (e.a().a(this.b, versionInfo)) {
                this.d = a.REMIND_MARKET;
            } else {
                this.d = a.REMIND_UPGRADE;
            }
        }
        setContentView(R.layout.upgrade_dialog_remind);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f76e3ae9c85f39f096440cb5ca7c42a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f76e3ae9c85f39f096440cb5ca7c42a4");
        } else {
            this.h = (RelativeLayout) findViewById(R.id.title_layout);
            this.i = (ImageView) findViewById(R.id.update_logo);
            this.j = (TextView) findViewById(R.id.update_title);
            this.l = findViewById(R.id.update_content_transition);
            this.k = (TextView) findViewById(R.id.update_content);
            this.k.setMovementMethod(ScrollingMovementMethod.getInstance());
            this.k.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.meituan.android.upgrade.ui.UpgradeRemindDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Object[] objArr4 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "78f7d890d59b5e925d4c8ab99484eeff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "78f7d890d59b5e925d4c8ab99484eeff");
                        return;
                    }
                    UpgradeRemindDialog.this.k.removeOnLayoutChangeListener(this);
                    if (UpgradeRemindDialog.this.k.getHeight() >= UpgradeRemindDialog.this.b.getResources().getDimension(R.dimen.upgrade_remind_content_max_height) - 1.0f) {
                        UpgradeRemindDialog.this.l.setVisibility(0);
                    } else {
                        UpgradeRemindDialog.this.l.setVisibility(8);
                    }
                }
            });
            this.m = (TextView) findViewById(R.id.update_tips);
            this.n = (TextView) findViewById(R.id.top_update_tips);
            this.o = (Button) findViewById(R.id.btn_ok);
            this.p = (Button) findViewById(R.id.btn_close);
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.upgrade.ui.UpgradeRemindDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0ce7531c6dc02094c5a99760c0581d46", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0ce7531c6dc02094c5a99760c0581d46");
                        return;
                    }
                    UpgradeRemindDialog.this.c();
                    int a2 = UpgradeRemindDialog.this.a(UpgradeRemindDialog.this.d);
                    if (a2 < 0 || UpgradeRemindDialog.this.c == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("force", Integer.valueOf(UpgradeRemindDialog.this.c.forceupdate));
                    hashMap.put("target", Integer.valueOf(a2));
                    UpgradeRemindDialog.this.a("DDUpdateReminderConfirm", 1L, hashMap);
                }
            });
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.upgrade.ui.UpgradeRemindDialog.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1dff67a67ca6cef3c93f1d352ea94564", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1dff67a67ca6cef3c93f1d352ea94564");
                        return;
                    }
                    UpgradeRemindDialog.this.d();
                    int a2 = UpgradeRemindDialog.this.a(UpgradeRemindDialog.this.d);
                    if (a2 < 0 || a2 > 1 || UpgradeRemindDialog.this.c == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("target", Integer.valueOf(a2));
                    UpgradeRemindDialog.this.a("DDUpdateReminderCancel", 1L, hashMap);
                }
            });
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = g;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c062633b217b56ac3ec8bf2fc053d014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c062633b217b56ac3ec8bf2fc053d014");
        } else if (this.e != null) {
            a(this.j, this.e.a);
            a(this.j, this.e.b);
            a(this.o, this.e.d);
            a((TextView) this.o, this.e.e);
            a((View) this.o, this.e.c);
            a(this.h, this.e.i);
            a(this.i, this.e.j > 0 ? this.e.j : this.b.getApplicationInfo().icon);
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog
    public final void a(VersionInfo versionInfo) {
        String str;
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d3a69c14600153b9c10c6a01ce1de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d3a69c14600153b9c10c6a01ce1de0");
        } else if (versionInfo == null) {
        } else {
            this.c = versionInfo;
            if (this.c.forceupdate == 1) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
            if (!TextUtils.isEmpty(this.c.updateTitle)) {
                this.j.setText(this.c.updateTitle);
            } else if (this.c.publishType == 1) {
                this.j.setText(R.string.update_remind_title_gray);
            } else if (this.c.publishType == 0) {
                this.j.setText(R.string.update_remind_title_release);
            }
            if (!TextUtils.isEmpty(this.c.changeLog)) {
                this.k.setText(Html.fromHtml(this.c.changeLog.replace("\n", "<br/>")));
            }
            boolean a = g.a(this.b, this.c.currentVersion);
            if (a) {
                this.d = a.REMIND_INSTALL;
                this.o.setText(R.string.update_remind_btn_install);
            } else if (this.c.forceupdate == 0 && e.a().a(this.b, this.c)) {
                this.d = a.REMIND_MARKET;
                this.o.setText(R.string.update_remind_btn_market);
            } else {
                this.d = a.REMIND_UPGRADE;
                if (this.c.publishType == 1) {
                    this.o.setText(R.string.update_remind_btn_fresh);
                } else if (this.c.publishType == 0) {
                    this.o.setText(R.string.update_remind_btn_upgrade);
                }
            }
            if (a) {
                str = (this.e == null || TextUtils.isEmpty(this.e.q)) ? this.b.getResources().getString(R.string.update_remind_install_tip) : this.e.q;
            } else if (NetWorkUtils.isWifiConnected(this.b)) {
                str = (this.e == null || TextUtils.isEmpty(this.e.r)) ? "" : this.e.r;
            } else {
                str = (this.e == null || TextUtils.isEmpty(this.e.s)) ? "" : this.e.s;
            }
            int i = (this.e == null || this.e.t <= 0) ? -1 : this.e.t;
            if (TextUtils.isEmpty(str)) {
                this.n.setVisibility(8);
                this.m.setVisibility(8);
            } else if (this.e != null && this.e.u == 1) {
                this.n.setVisibility(0);
                this.m.setVisibility(8);
                this.n.setText(str);
                a(this.n, i);
            } else {
                this.n.setVisibility(8);
                this.m.setVisibility(0);
                this.m.setText(str);
                a(this.m, i);
            }
            if (isShowing()) {
                return;
            }
            show();
            int a2 = a(this.d);
            if (a2 < 0 || this.c == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("force", Integer.valueOf(this.c.forceupdate));
            hashMap.put("target", Integer.valueOf(a2));
            hashMap.put("noInit", 0);
            a("DDUpdateReminderShow", 1L, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcfc1014056ac65091db9a5b4a9ab859", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcfc1014056ac65091db9a5b4a9ab859")).intValue();
        }
        switch (aVar) {
            case REMIND_MARKET:
                return 0;
            case REMIND_UPGRADE:
                return 1;
            case REMIND_INSTALL:
                return 2;
            default:
                return -1;
        }
    }
}
