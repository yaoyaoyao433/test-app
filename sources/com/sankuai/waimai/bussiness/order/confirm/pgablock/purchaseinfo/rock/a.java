package com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.utils.p;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends PopupWindow {
    public static ChangeQuickRedirect a;
    boolean b;
    private LinearLayout c;
    private TextView d;
    private TextView e;
    private String f;
    private Context g;
    private RecyclerView h;

    public static /* synthetic */ void a(a aVar, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c24b2ef55943f4ece78ec565c3907a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c24b2ef55943f4ece78ec565c3907a1c");
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public a(Context context, @Nullable String str, RecyclerView recyclerView) {
        super(context);
        Object[] objArr = {context, str, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066d7b2cb0e87ea38be4547621f4a241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066d7b2cb0e87ea38be4547621f4a241");
            return;
        }
        this.g = context;
        this.c = new LinearLayout(context);
        this.d = new TextView(context);
        this.e = new TextView(context);
        this.f = str;
        this.h = recyclerView;
    }

    public final void a(@NonNull String str, ArrayList<String> arrayList, int i) {
        Object[] objArr = {str, arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb6980ab0d1a2d22a81ec1eb9f8b91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb6980ab0d1a2d22a81ec1eb9f8b91a");
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (str.length() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str2 = arrayList.get(i2);
                if (str2.startsWith(str)) {
                    arrayList2.add(str2);
                }
            }
            if (arrayList2.size() == 1 && arrayList2.contains(str)) {
                arrayList2.clear();
            }
            a(i, arrayList2);
            return;
        }
        a(i, arrayList);
    }

    private void a(int i, ArrayList<String> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38d29f9bfa8fac1122ad1ee2c4a1986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38d29f9bfa8fac1122ad1ee2c4a1986");
            return;
        }
        this.c.removeAllViews();
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        if (arrayList.size() != 0 && !arrayList.get(0).equals("")) {
            int parseColor = Color.parseColor("#666666");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, g.a(this.g, 44.0f));
            this.d.setLayoutParams(layoutParams);
            this.d.setPadding(g.a(this.g, 15.0f), g.a(this.g, 5.0f), 0, g.a(this.g, 5.0f));
            this.d.setGravity(16);
            this.d.setText(arrayList.get(0));
            this.d.setTextColor(parseColor);
            this.d.setLayoutParams(layoutParams);
            this.d.setTextSize(14.0f);
            a(this.d);
            this.d.setVisibility(0);
            this.c.addView(this.d);
            if (arrayList.size() > 1 && !arrayList.get(1).equals("")) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, g.a(this.g, 44.0f));
                this.e.setPadding(g.a(this.g, 15.0f), g.a(this.g, 5.0f), 0, g.a(this.g, 5.0f));
                this.e.setGravity(16);
                this.e.setText(arrayList.get(1));
                this.e.setLayoutParams(layoutParams2);
                this.e.setTextColor(parseColor);
                this.e.setTextSize(14.0f);
                a(this.e);
                this.e.setVisibility(0);
                this.c.addView(this.e);
            }
        }
        this.c.setBackgroundColor(-1);
        setBackgroundDrawable(null);
        setElevation(10.0f);
        this.c.setOrientation(1);
        setContentView(this.c);
        setWidth(i);
        if (arrayList.size() == 1) {
            this.b = true;
            setHeight(g.a(this.g, 44.0f));
            if (isShowing()) {
                update(i, g.a(this.g, 44.0f));
            }
        } else if (arrayList.size() == 2) {
            this.b = true;
            setHeight(g.a(this.g, 88.0f));
            if (isShowing()) {
                update(i, g.a(this.g, 88.0f));
            }
        } else if (arrayList.size() == 0) {
            this.b = false;
            p.b(this);
        }
    }

    private void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce09809697f88e2e2971fc731b8f805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce09809697f88e2e2971fc731b8f805");
        } else {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05228e808a7bd922635abf3769a06c8a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05228e808a7bd922635abf3769a06c8a");
                        return;
                    }
                    a.this.h.setDescendantFocusability(393216);
                    if (view instanceof TextView) {
                        HashMap hashMap = new HashMap();
                        String charSequence = ((TextView) view).getText().toString();
                        if (!a.this.f.equals("phone_show_event")) {
                            if (a.this.f.equals("content_show_event")) {
                                hashMap.put("content", charSequence);
                                com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a("cake_content_event", hashMap);
                            }
                        } else {
                            hashMap.put("phone", charSequence);
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a("phone_content_event", hashMap);
                        }
                    }
                    p.b(a.this);
                    l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3d1280499cb90e52689376eda8c78ae", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3d1280499cb90e52689376eda8c78ae");
                                return;
                            }
                            a.this.h.setDescendantFocusability(262144);
                            a.a(a.this, (Activity) a.this.g);
                        }
                    }, 200, "float_layer");
                }
            });
        }
    }
}
