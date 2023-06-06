package com.tencent.smtt.sdk.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.connect.common.Constants;
import com.tencent.mapsdk.internal.y;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class d extends Dialog {
    static WeakReference<ValueCallback<String>> a;
    protected List<b> b;
    protected final String c;
    protected final String d;
    protected final String e;
    protected final String f;
    private ListView g;
    private Button h;
    private Button i;
    private final String j;
    private String k;
    private a l;
    private String m;
    private String n;
    private Intent o;
    private SharedPreferences p;
    private int q;
    private int r;
    private FrameLayout s;
    private LinearLayout t;

    public d(Context context, String str, Intent intent, Bundle bundle, ValueCallback<String> valueCallback, String str2, String str3) {
        super(context, 16973835);
        this.j = "TBSActivityPicker";
        this.c = "extraMenu";
        this.d = "name";
        this.e = "resource_id";
        this.f = "value";
        this.m = "*/*";
        this.p = null;
        this.q = 0;
        this.r = 0;
        this.n = str3;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        TbsLog.i("TBSActivityPicker", "acts.size(): " + queryIntentActivities.size());
        Bundle bundle2 = bundle != null ? bundle.getBundle("extraMenu") : null;
        if (bundle2 != null) {
            this.b = new ArrayList();
            for (String str4 : bundle2.keySet()) {
                Bundle bundle3 = bundle2.getBundle(str4);
                if (bundle3 != null) {
                    String string = bundle3.getString("name", null);
                    int i = bundle3.getInt("resource_id", -1);
                    String string2 = bundle3.getString("value", null);
                    if (string != null && i != -1 && string2 != null) {
                        this.b.add(new b(getContext(), i, string, string2));
                    }
                }
            }
        } else {
            TbsLog.i("TBSActivityPicker", "no extra menu info in bundle");
        }
        if ((queryIntentActivities == null || queryIntentActivities.size() == 0) && ((this.b == null || this.b.isEmpty()) && MttLoader.isBrowserInstalled(context))) {
            TbsLog.i("TBSActivityPicker", "no action has been found with Intent:" + intent.toString());
            QbSdk.isDefaultDialog = true;
        }
        if ("com.tencent.rtxlite".equalsIgnoreCase(context.getApplicationContext().getPackageName()) && ((queryIntentActivities == null || queryIntentActivities.size() == 0) && (this.b == null || this.b.isEmpty()))) {
            TbsLog.i("TBSActivityPicker", "package name equal to `com.tencent.rtxlite` but no action has been found with Intent:" + intent.toString());
            QbSdk.isDefaultDialog = true;
        }
        this.k = str;
        this.o = intent;
        a = new WeakReference<>(valueCallback);
        this.p = context.getSharedPreferences(QbSdk.SHARE_PREFERENCES_NAME, 0);
        if (!TextUtils.isEmpty(str2)) {
            this.m = str2;
        }
        TbsLog.i("TBSActivityPicker", "Intent:" + this.m + " MineType:" + this.m);
    }

    private View a(Context context) {
        this.s = new FrameLayout(context);
        this.t = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Double.valueOf(c.a(context) * 0.5f).intValue());
        layoutParams.gravity = 17;
        this.t.setLayoutParams(layoutParams);
        this.t.setOrientation(1);
        this.r = c.a(context, 72.0f);
        com.tencent.smtt.sdk.ui.dialog.widget.a aVar = new com.tencent.smtt.sdk.ui.dialog.widget.a(context, c.a(context, 12.0f), c.a(context, 35.0f), c.a(context, 15.0f));
        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, this.r));
        aVar.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.smtt.sdk.ui.dialog.d.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        this.t.addView(aVar);
        this.g = new ListView(context);
        this.g.setOverScrollMode(2);
        this.g.setVerticalScrollBarEnabled(false);
        this.g.setBackgroundColor(-1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        this.g.setLayoutParams(layoutParams2);
        this.g.setDividerHeight(0);
        this.t.addView(this.g);
        LinearLayout linearLayout = new LinearLayout(context);
        this.q = c.a(context, 150.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, this.q);
        layoutParams3.weight = 0.0f;
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setContentDescription("x5_tbs_activity_picker_btn_container");
        this.h = new com.tencent.smtt.sdk.ui.dialog.widget.b(context, c.a(context, 12.0f), Color.parseColor("#EBEDF5"));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, c.a(context, 90.0f));
        layoutParams4.weight = 1.0f;
        layoutParams4.topMargin = c.a(context, 30.0f);
        layoutParams4.bottomMargin = c.a(context, 30.0f);
        layoutParams4.leftMargin = c.a(context, 32.0f);
        layoutParams4.rightMargin = c.a(context, 8.0f);
        this.h.setLayoutParams(layoutParams4);
        this.h.setText(e.b("x5_tbs_wechat_activity_picker_label_always"));
        this.h.setTextColor(Color.rgb(29, 29, 29));
        this.h.setTextSize(0, c.a(context, 34.0f));
        linearLayout.addView(this.h);
        this.i = new com.tencent.smtt.sdk.ui.dialog.widget.b(context, c.a(context, 12.0f), Color.parseColor("#00CAFC"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, c.a(context, 90.0f));
        layoutParams5.weight = 1.0f;
        layoutParams5.topMargin = c.a(context, 30.0f);
        layoutParams5.bottomMargin = c.a(context, 30.0f);
        layoutParams5.leftMargin = c.a(context, 8.0f);
        layoutParams5.rightMargin = c.a(context, 32.0f);
        this.i.setLayoutParams(layoutParams5);
        this.i.setText(e.b("x5_tbs_wechat_activity_picker_label_once"));
        this.i.setTextColor(Color.rgb(255, 255, 255));
        this.i.setTextSize(0, c.a(context, 34.0f));
        linearLayout.addView(this.i);
        this.t.addView(linearLayout);
        this.s.addView(this.t);
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar.f()) {
            if (c() && a.get() != null) {
                a.get().onReceiveValue("https://mdc.html5.qq.com/d/directdown.jsp?channel_id=11047");
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://mdc.html5.qq.com/d/directdown.jsp?channel_id=11041"));
            intent.addFlags(y.a);
            getContext().startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.l == null || !c()) {
            return;
        }
        b a2 = this.l.a();
        ResolveInfo a3 = this.l.a(a2);
        if (a.get() != null) {
            if (a2 != null && a3 != null && a3.activityInfo != null && a3.activityInfo.packageName != null) {
                a.get().onReceiveValue(str + a3.activityInfo.packageName);
            } else if (a2 == null) {
                a.get().onReceiveValue(str + "other");
            } else if (a2.e()) {
                a.get().onReceiveValue(str + a2.g());
            } else if (a2.f()) {
                a.get().onReceiveValue(str + a2.d());
            }
        }
    }

    private Drawable c(String str) {
        Context context = getContext();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(context.getFilesDir(), str);
        if (FileUtil.c(file)) {
            try {
                TbsLog.i("TBSActivityPicker", "load icon from: " + file.getAbsolutePath());
                return new BitmapDrawable(com.sankuai.waimai.launcher.util.image.a.a(file.getAbsolutePath()));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        String[] strArr = {"com.tencent.mobileqq", Constants.PACKAGE_TIM};
        String packageName = getContext().getApplicationContext().getPackageName();
        for (int i = 0; i < 2; i++) {
            if (strArr[i].equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        Drawable drawable;
        String str;
        String str2 = null;
        b a2 = this.l != null ? this.l.a() : null;
        if (this.p != null) {
            drawable = c(this.p.getString("key_tbs_recommend_icon_url", null));
            str = this.p.getString("key_tbs_recommend_label", null);
            String string = this.p.getString("key_tbs_recommend_description", null);
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (!TextUtils.isEmpty(string)) {
                str2 = string;
            }
        } else {
            drawable = null;
            str = null;
        }
        if (drawable == null) {
            drawable = e.a("application_icon");
        }
        Drawable drawable2 = drawable;
        if (str == null) {
            str = "QQ浏览器";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = e.b("x5_tbs_wechat_activity_picker_label_recommend");
        }
        this.l = new a(getContext(), this.o, new b(getContext(), drawable2, str3, TbsConfig.APP_QB, str2), this.b, a2, this, this.g);
        this.g.setAdapter((ListAdapter) this.l);
        e();
    }

    private void e() {
        ListAdapter adapter = this.g.getAdapter();
        if (adapter == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, this.g);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            i += view.getMeasuredHeight();
        }
        float a2 = c.a(getContext()) * 0.8f;
        float a3 = c.a(getContext()) * 0.5f;
        float f = this.r + i + this.q;
        this.t.getLayoutParams().height = (f > a2 ? Float.valueOf(a2) : f < a3 ? Float.valueOf(a3) : Float.valueOf(f)).intValue();
    }

    public String a() {
        if (this.p != null) {
            StringBuilder sb = new StringBuilder("getTBSPickedDefaultBrowser: ");
            SharedPreferences sharedPreferences = this.p;
            sb.append(sharedPreferences.getString("key_tbs_picked_default_browser_" + this.m, null));
            TbsLog.i("TBSActivityPicker", sb.toString());
            SharedPreferences sharedPreferences2 = this.p;
            return sharedPreferences2.getString("key_tbs_picked_default_browser_" + this.m, null);
        }
        return null;
    }

    public void a(String str) {
        TbsLog.i("TBSActivityPicker", "setTBSPickedDefaultBrowser:" + str);
        if (this.p != null) {
            if (TextUtils.isEmpty(str)) {
                TbsLog.i("TBSActivityPicker", "paramString empty, remove: key_tbs_picked_default_browser_" + this.m);
                SharedPreferences.Editor edit = this.p.edit();
                edit.remove("key_tbs_picked_default_browser_" + this.m).commit();
                return;
            }
            TbsLog.i("TBSActivityPicker", "paramString not empty, set: key_tbs_picked_default_browser_" + this.m + "=" + str);
            SharedPreferences.Editor edit2 = this.p.edit();
            StringBuilder sb = new StringBuilder("key_tbs_picked_default_browser_");
            sb.append(this.m);
            edit2.putString(sb.toString(), str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (this.i != null) {
            this.i.setEnabled(z);
        }
        if (this.h != null) {
            this.h.setEnabled(z);
        }
        b("userMenuClickEvent:");
    }

    public void b() {
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.horizontalMargin = 0.0f;
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
        }
        setContentView(a(getContext()));
        d();
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.smtt.sdk.ui.dialog.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b a2 = d.this.l.a();
                ResolveInfo a3 = d.this.l.a(a2);
                d.this.b("userClickAlwaysEvent:");
                if (a2 == null) {
                    return;
                }
                if (a2.e()) {
                    String g = a2.g();
                    if (d.a.get() != null) {
                        d.a.get().onReceiveValue("extraMenuEvent:" + g);
                    }
                    d dVar = d.this;
                    dVar.a("extraMenuEvent:" + g);
                } else if (a3 == null) {
                    d.this.a(a2);
                } else {
                    Intent intent = d.this.o;
                    Context context = d.this.getContext();
                    String str = a3.activityInfo.packageName;
                    intent.setPackage(str);
                    if (TbsConfig.APP_QB.equals(str)) {
                        intent.putExtra("ChannelID", context.getApplicationContext().getPackageName());
                        intent.putExtra("PosID", "4");
                    }
                    if (context != null && context.getApplicationInfo().targetSdkVersion >= 24 && Build.VERSION.SDK_INT >= 24) {
                        intent.addFlags(1);
                    }
                    if (!TextUtils.isEmpty(d.this.n)) {
                        intent.putExtra("big_brother_source_key", d.this.n);
                    }
                    try {
                        context.startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (d.a.get() != null) {
                        d.a.get().onReceiveValue("always");
                    }
                    d.this.a(str);
                }
                d.this.dismiss();
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.smtt.sdk.ui.dialog.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b a2 = d.this.l.a();
                ResolveInfo a3 = d.this.l.a(a2);
                d.this.b("userClickOnceEvent:");
                d.this.a("");
                if (a2 == null) {
                    return;
                }
                if (a2.e()) {
                    if (d.this.c() && d.a.get() != null) {
                        d.a.get().onReceiveValue("extraMenuEvent:" + a2.g());
                    }
                } else if (a3 == null) {
                    d.this.a(a2);
                } else {
                    Intent intent = d.this.o;
                    Context context = d.this.getContext();
                    String str = a3.activityInfo.packageName;
                    intent.setPackage(str);
                    if (TbsConfig.APP_QB.equals(str)) {
                        intent.putExtra("ChannelID", context.getApplicationContext().getPackageName());
                        intent.putExtra("PosID", "4");
                    }
                    if (context.getApplicationInfo().targetSdkVersion >= 24 && Build.VERSION.SDK_INT >= 24) {
                        intent.addFlags(1);
                    }
                    if (!TextUtils.isEmpty(d.this.n)) {
                        intent.putExtra("big_brother_source_key", d.this.n);
                    }
                    try {
                        context.startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (d.a.get() != null) {
                        d.a.get().onReceiveValue("once");
                    }
                }
                d.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        b();
    }
}
