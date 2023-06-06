package com.unionpay.mobile.android.upwidget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class c extends BaseAdapter {
    private Drawable a;
    private Drawable b;
    private Drawable c;
    private Context d;
    private String e;
    private String f;
    private String g;
    private int i;
    private int j;
    private List<Map<String, Object>> k;
    private boolean h = false;
    private ArrayList<View.OnClickListener> l = new ArrayList<>();
    private View.OnClickListener m = new d(this);

    public c(Context context, List<Map<String, Object>> list, String str, String str2, String str3, int i, int i2) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.i = 1;
        this.j = 0;
        this.d = context;
        this.k = list;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.i = i;
        this.j = i2;
        this.a = com.unionpay.mobile.android.resource.c.a(this.d).a(1015, -1, -1);
        this.b = com.unionpay.mobile.android.resource.c.a(this.d).a(1016, -1, -1);
        this.c = com.unionpay.mobile.android.resource.c.a(this.d).a(1002, -1, -1);
    }

    private boolean d() {
        return (this.e == null || TextUtils.isEmpty(this.e)) ? false : true;
    }

    private boolean d(int i) {
        Object obj;
        int c = i - c();
        return c == this.k.size() || (obj = this.k.get(c).get("available")) == null || Boolean.FALSE != ((Boolean) obj);
    }

    private boolean e() {
        return (this.f == null || TextUtils.isEmpty(this.f)) ? false : true;
    }

    public final void a() {
        this.h = !this.h;
    }

    public final void a(int i) {
        this.i = i;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.l.add(onClickListener);
    }

    public final void a(String str) {
        this.e = str;
    }

    public final Spanned b(int i) {
        int c = i - c();
        if (c == this.k.size()) {
            return null;
        }
        Map<String, Object> map = this.k.get(c);
        return Html.fromHtml(((String) map.get("text1")) + StringUtil.SPACE + ((String) map.get("text2")));
    }

    public final void b(String str) {
        this.g = str;
    }

    public final boolean b() {
        return this.h;
    }

    public final int c() {
        return d() ? 1 : 0;
    }

    public final boolean c(int i) {
        Object obj;
        int c = i - c();
        return c == this.k.size() || (obj = this.k.get(c).get("editable")) == null || Boolean.FALSE != ((Boolean) obj);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.k == null) {
            return 0;
        }
        return this.k.size() + c() + (e() ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i == 0 || this.k == null || i >= this.k.size()) {
            return null;
        }
        return this.k.get(i - c());
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
        if (r3 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01f6, code lost:
        if (r9 != false) goto L14;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.upwidget.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        if (!(d() && i == 0) && d(i)) {
            return super.isEnabled(i);
        }
        return false;
    }
}
