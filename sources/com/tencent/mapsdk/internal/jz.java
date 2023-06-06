package com.tencent.mapsdk.internal;

import android.content.Context;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class jz {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public Toast a;
        private int b;
        private int c;
        private int d;
        private String e;
        private String f;
        private TextView g;
        private TextView h;
        private TextView i;
        private Context j;

        a(Context context) {
            this.j = context;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final a a(Context context, View view, int i) {
            this.a = new Toast(context);
            this.a.setView(view);
            this.a.setDuration(i);
            this.b = this.a.getGravity();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ViewGroup a(Context context, String str, String str2) {
            this.e = str;
            this.f = str2;
            LinearLayout linearLayout = new LinearLayout(context);
            int a = jv.a(context, 5);
            int a2 = jv.a(context, 10);
            linearLayout.setPadding(a2, a, a2, a);
            linearLayout.setBackgroundColor(-12303292);
            linearLayout.setOrientation(1);
            if (!TextUtils.isEmpty(str)) {
                this.h = new TextView(context);
                int a3 = jv.a(context, 5);
                this.h.setPadding(a3, a3, a3, a3);
                this.h.setText(str);
                this.h.setTextColor(-1);
                this.h.setTextSize(2, 18.0f);
                linearLayout.addView(this.h, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            if (!TextUtils.isEmpty(str2)) {
                this.i = new TextView(context);
                this.i.setId(16908299);
                this.i.setText(str2);
                this.i.setTextColor(-1);
                this.i.setTextSize(2, 16.0f);
                int a4 = jv.a(context, 5);
                this.i.setPadding(a4, a4, a4, a4);
                linearLayout.addView(this.i, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(21);
            TextView textView = new TextView(context);
            int a5 = jv.a(context, 5);
            int a6 = jv.a(context, 10);
            textView.setTextColor(-1);
            textView.setBackgroundColor(-16776961);
            textView.setPadding(a6, a5, a6, a5);
            textView.setVisibility(8);
            this.g = textView;
            linearLayout2.addView(textView, new ViewGroup.MarginLayoutParams(-2, -2));
            linearLayout.addView(linearLayout2, new ViewGroup.MarginLayoutParams(-1, -2));
            return linearLayout;
        }

        public final a a() {
            try {
                Object a = ha.a(this.a, "mTN");
                if (a != null) {
                    Object a2 = ha.a(a, "mParams");
                    if (a2 instanceof WindowManager.LayoutParams) {
                        ((WindowManager.LayoutParams) a2).flags = 136;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this;
        }

        public final a a(String str, View.OnClickListener onClickListener) {
            if (this.g != null && !TextUtils.isEmpty(str) && onClickListener != null) {
                this.g.setText(str);
                this.g.setOnClickListener(onClickListener);
                this.g.setVisibility(0);
            }
            return this;
        }

        private a a(String str) {
            this.e = str;
            if (str != null && this.h != null) {
                this.h.setText(str);
            }
            return this;
        }

        private a b(String str) {
            return a(str, GravityCompat.START);
        }

        public final a a(String str, int i) {
            this.f = str;
            if (str != null && this.i != null) {
                this.i.setText(str);
                this.i.setGravity(i);
            }
            return this;
        }

        private a a(int i) {
            this.b = i;
            if (this.a != null) {
                this.a.setGravity(this.b, this.c, this.d);
            }
            return this;
        }

        private a a(int i, int i2) {
            this.c = i;
            this.d = i2;
            if (this.a != null) {
                this.a.setGravity(this.b, this.c, this.d);
            }
            return this;
        }

        public final boolean b() {
            if (this.a != null) {
                this.a.show();
                return true;
            }
            return false;
        }

        private void c() {
            if (this.a != null) {
                this.a.cancel();
            }
        }
    }

    private static a b(Context context, String str) {
        return a(context, null, str, 0);
    }

    public static a a(Context context, String str, String str2, int i) {
        if (context == null) {
            return null;
        }
        a aVar = new a(context);
        return aVar.a(context, aVar.a(context, str, str2), i);
    }

    private static a a(Context context) {
        return a(context, null, StringUtil.SPACE, 0);
    }

    private static a a(Context context, String str) {
        return a(context, null, str, 0);
    }
}
