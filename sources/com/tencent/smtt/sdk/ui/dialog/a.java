package com.tencent.smtt.sdk.ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.sdk.ui.dialog.widget.RoundImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class a extends ArrayAdapter<b> implements View.OnClickListener, ListAdapter {
    private ArrayList<b> a;
    private b b;
    private Intent c;
    private WeakReference<ListView> d;
    private WeakReference<d> e;
    private b f;
    private b g;
    private List<b> h;
    private Handler i;
    private String[] j;

    public a(Context context, Intent intent, b bVar, List<b> list, b bVar2, d dVar, ListView listView) {
        super(context, 0);
        this.b = null;
        a(dVar);
        a(listView);
        this.g = bVar;
        this.c = intent;
        if ("com.tencent.rtxlite".equalsIgnoreCase(context.getApplicationContext().getPackageName()) || MttLoader.isBrowserInstalled(context)) {
            this.f = null;
        } else {
            this.f = this.g;
        }
        this.h = list;
        this.i = new Handler() { // from class: com.tencent.smtt.sdk.ui.dialog.a.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                a.this.b();
            }
        };
        this.j = new String[2];
        this.j[0] = e.b("x5_tbs_activity_picker_recommend_to_trim");
        this.j[1] = e.b("x5_tbs_activity_picker_recommend_with_chinese_brace_to_trim");
        a(context, bVar2);
    }

    private View a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(Color.argb(41, 0, 0, 0)));
        stateListDrawable.addState(new int[]{-16842919}, new ColorDrawable(0));
        linearLayout.setBackgroundDrawable(stateListDrawable);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, c.a(getContext(), 144.0f)));
        RoundImageView roundImageView = new RoundImageView(context);
        roundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.a(getContext(), 96.0f), c.a(getContext(), 96.0f));
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        layoutParams.setMargins(c.a(getContext(), 32.0f), c.a(getContext(), 24.0f), c.a(getContext(), 24.0f), c.a(getContext(), 24.0f));
        roundImageView.setLayoutParams(layoutParams);
        roundImageView.setId(101);
        relativeLayout.addView(roundImageView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 101);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setMaxLines(1);
        textView.setTextColor(Color.rgb(29, 29, 29));
        textView.setTextSize(1, 17.0f);
        textView.setId(102);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView2.setText(e.b("x5_tbs_wechat_activity_picker_label_recommend"));
        textView2.setTextColor(Color.parseColor("#00CAFC"));
        textView2.setTextSize(1, 14.0f);
        textView2.setId(103);
        linearLayout2.addView(textView2);
        relativeLayout.addView(linearLayout2);
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(c.a(getContext(), 48.0f), c.a(getContext(), 48.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.setMargins(0, 0, c.a(getContext(), 32.0f), 0);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageDrawable(e.a("x5_tbs_activity_picker_check"));
        imageView.setId(104);
        relativeLayout.addView(imageView);
        relativeLayout.setId(105);
        linearLayout.addView(relativeLayout);
        return linearLayout;
    }

    private void a(b bVar, View view) {
        String[] strArr;
        if (view == null || bVar == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(102);
        TextView textView2 = (TextView) view.findViewById(103);
        ImageView imageView = (ImageView) view.findViewById(104);
        View findViewById = view.findViewById(105);
        View findViewById2 = view.findViewById(106);
        ((ImageView) view.findViewById(101)).setImageDrawable(bVar.a());
        String replaceAll = bVar.b().trim().replaceAll(new StringBuilder(" ").toString(), "");
        String str = replaceAll;
        for (String str2 : this.j) {
            if (str2 != null && str2.length() > 0) {
                str = str.replaceAll(str2, "");
            }
        }
        textView.setText(str);
        if (bVar.c() == null) {
            bVar.a(a(bVar));
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.smtt.sdk.ui.dialog.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewParent parent = view2.getParent();
                if (parent instanceof View) {
                    View view3 = (View) parent;
                    if (view3.getTag() == a.this.f) {
                        a.this.onClick(view3);
                    }
                }
            }
        });
        if (TbsConfig.APP_QB.equals(bVar.d())) {
            textView2.setVisibility(0);
            textView2.setText(bVar.h());
        } else {
            textView2.setVisibility(8);
        }
        findViewById.setClickable(false);
        findViewById.setEnabled(false);
        if (bVar == this.b) {
            imageView.setVisibility(0);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else {
            imageView.setVisibility(8);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        view.setTag(bVar);
        view.setOnClickListener(this);
    }

    private void a(boolean z) {
        d dVar;
        if (this.e == null || (dVar = this.e.get()) == null) {
            return;
        }
        dVar.a(z);
    }

    public static boolean a(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    private void b(Context context, b bVar) {
        this.b = bVar;
        if (this.b == null) {
            return;
        }
        a((this.b.e() || this.b.f()) ? true : a(context, this.b.d()));
    }

    public ResolveInfo a(b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.d())) {
            for (ResolveInfo resolveInfo : getContext().getPackageManager().queryIntentActivities(this.c, 65536)) {
                if (bVar.d().equals(resolveInfo.activityInfo.packageName)) {
                    return resolveInfo;
                }
            }
        }
        return null;
    }

    public b a() {
        return this.b;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a */
    public b getItem(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return this.a.get(i);
    }

    void a(Context context, b bVar) {
        this.a = new ArrayList<>();
        if (this.h != null && this.h.size() != 0) {
            this.a.addAll(this.h);
        }
        boolean z = false;
        boolean z2 = false;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(this.c, 65536)) {
            if (b.a(context, resolveInfo.activityInfo.packageName) != null || resolveInfo.loadIcon(context.getPackageManager()) != null) {
                b bVar2 = new b(context, resolveInfo);
                if (this.f != null && this.f.d().equals(resolveInfo.activityInfo.packageName)) {
                    bVar2.a(this.f.f());
                    bVar2.a(this.f.h());
                    bVar2.a(this.f.a());
                    this.a.add(0, bVar2);
                    z = true;
                } else if (TbsConfig.APP_QB.equals(resolveInfo.activityInfo.packageName)) {
                    if (this.g != null) {
                        bVar2.a(this.g.f());
                        bVar2.a(this.g.h());
                        bVar2.a(this.g.a());
                    }
                    this.a.add(0, bVar2);
                } else {
                    this.a.add(bVar2);
                }
                if (!z2 && bVar != null && bVar2.d().equals(bVar.d())) {
                    b(context, bVar2);
                    z2 = true;
                }
            }
        }
        if (!z && this.f != null) {
            this.a.add(0, this.f);
        }
        if (z2 || this.a.size() <= 0) {
            return;
        }
        b(context, this.a.get(0));
    }

    void a(ListView listView) {
        this.d = new WeakReference<>(listView);
    }

    void a(d dVar) {
        this.e = new WeakReference<>(dVar);
    }

    public void b() {
        View findViewWithTag;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.i.obtainMessage(1).sendToTarget();
            return;
        }
        ListView listView = this.d.get();
        if (listView == null || (findViewWithTag = listView.findViewWithTag(this.f)) == null) {
            return;
        }
        a(this.f, findViewWithTag);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b item = getItem(i);
        if (item == null) {
            return null;
        }
        if (view == null) {
            view = a(getContext());
        }
        a(item, view);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar;
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof b) || (bVar = (b) tag) == this.b) {
            return;
        }
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        b bVar2 = this.b;
        b(view.getContext(), bVar);
        a(bVar2, view2.findViewWithTag(bVar2));
        a(this.b, view);
    }
}
